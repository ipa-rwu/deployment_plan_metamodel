package de.fraunhofer.ipa.deployment.generator

import de.fraunhofer.ipa.deployment.util.LinuxDistribution
import de.fraunhofer.ipa.deployment.util.LinuxDistributionValue
import de.fraunhofer.ipa.deployment.util.ProcessorArchitectureValue
import de.fraunhofer.ipa.deployment.util.PropertyValue
import de.fraunhofer.ipa.deployment.util.PropertyValueDouble
import de.fraunhofer.ipa.deployment.util.PropertyValueInt
import de.fraunhofer.ipa.deployment.util.PropertyValueList
import de.fraunhofer.ipa.deployment.util.PropertyValueString
import de.fraunhofer.ipa.deployment.util.UbuntuVersion
import de.fraunhofer.ipa.deployment.util.UbuntuVersionValue
import de.fraunhofer.ipa.deployment.util.VersionOperatingSystemProperty
import deployPlanWithRosModel.ConfigRosSoftwareComponent
import deploymentPlan.AbstarctConfigSoftwareComponent
import deploymentPlan.AbstractComputationAssignment
import deploymentPlan.ConfigSoftwareComponent
import deploymentPlan.ContainerRuntime
import deploymentPlan.ROSDistro
import device.AddressNetworkProperty
import device.DeviceVolumeUsbProperty
import device.GatewayNetworkProperty
import device.IdentityNameNetworkProperty
import device.InterfaceNetworkProperty
import device.MacAddressNetworkProperty
import device.NameOperatingSystemProperty
import device.NetworkConnection
import device.PortNetworkProperty
import device.SubnetMaskNetworkProperty
import implementationDescription.SoftwareComponent
import implementationDescription.impl.GitRepositoryTypeImpl
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.ArrayList
import java.util.Arrays
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import java.util.function.Function
import java.util.stream.Collectors
import org.eclipse.emf.ecore.EObject
import targetEnvironment.AbstractDeviceInstance
import targetEnvironment.ComputationDeviceInstance
import targetEnvironment.ConfigConnection
import targetEnvironment.ConfigConnectionProperty
import targetEnvironment.ConnectedDevice
import targetEnvironment.DeviceInstance
import targetEnvironment.TargetDeployEnviroment
import java.net.URI
import java.net.http.HttpRequest
import java.net.http.HttpClient
import java.net.http.HttpResponse
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.JsonArray
import com.google.gson.annotations.SerializedName
import com.google.gson.reflect.TypeToken
import javax.management.RuntimeErrorException
import java.util.stream.Collector
import device.ArchitectureProcessorProperty
import de.fraunhofer.ipa.deployment.util.ProcessorArchitectureType

class OSInfo{
    String name
    String version

      def updateInfo(String name, String version){
        this.name = name
        this.version = version
        }
      def getName(){
            return this.name
        }
    def getVersion(){
        return this.version
    }
      def setName(String name){
          this.name = name
        }
      def setVersion(String version){
          this.version = version
        }
}

class SubProcessResult{
    Boolean success
    String[] output

    def addResult(Boolean success, String[] output){
        this.success = success
        this.output = output
    }

    def getBooleanResult(){
        return this.success
    }

    def getOutput(){
        return this.output
    }
}

class NetworkInfo {
    String InterfaceName
    String IdentityName
    String MacAddress
    String Address
    String Netmask
    String Gateway
    EObject NetworkType
    List<String> Ports = new ArrayList

    def setInterfaceName(String name){
        this.InterfaceName = name
    }

    def getInterfaceName(){
        if(this.InterfaceName !== null)
      return this.InterfaceName
    else
      throw new RuntimeException("Didn't set getInterfaceName yet")
    }

    def setIdentityName(String name){
        this.IdentityName = name
    }

    def getIdentityName(){
        if(this.IdentityName !== null)
      return this.IdentityName
    else
      throw new RuntimeException("Didn't set IdentityName yet")
    }

    def setMacAddress(String name){
        this.MacAddress = name
    }

    def getMacAddress(){
        if(this.MacAddress !== null)
      return this.MacAddress
    else
      throw new RuntimeException("Didn't set getMacAddress yet")
    }
    def setAddress(String name){
        this.Address = name
    }

    def getAddress(){
        if(this.Address !== null)
      return this.Address
    else
      throw new RuntimeException("Didn't set Address yet")
    }

    def setNetworkType(EObject name){
        this.NetworkType = name
    }

    def getNetworkType(){
        if(this.NetworkType !== null)
      return this.NetworkType
    else
      throw new RuntimeException("Didn't set NetworkType yet")
    }

    def setPorts(String port){
        this.Ports.add(port)
    }

    def getPorts(){
        if(this.Ports !== null)
      return this.Ports
    else
      throw new RuntimeException("Didn't set ports yet")
    }

    def setNetmask(String address){
        this.Netmask = address
    }

    def getNetmask(){
      if(this.Netmask !== null)
        return this.Netmask
        else
        throw new RuntimeException("Didn't set Address yet")
    }

    def setGateway(String address){
        this.Gateway = address
    }

    def getGateway(){
      if(this.Gateway !== null)
        return this.Gateway
        else
        throw new RuntimeException("Didn't set Gateway yet")
    }
}

class GithubResponse {
    int id
    String name
    String full_name

    @SerializedName("private")
    Boolean if_private

    override toString() {
      super.toString()
      return String.format("id: %d, name: %s, full_name: %s, private: %b", id, name, full_name, if_private)
    }

    def get_if_private(){
      return this.if_private
    }
}

class GitlabResponse {
    int id
    String path_with_namespace

    override toString() {
      super.toString()
      return String.format("id: %d, path_with_namespace: %s", id, path_with_namespace)
    }

    def get_path_with_namespace(){
      return this.path_with_namespace
    }

}

class DeploymentHelper {
    def <T> List<T> getListWithoutDuplicates(List<T> list, Function<T, ?>... keyFunctions) {
    var List<T> result = new ArrayList
    var Set<List<?>> set = new HashSet

    for(T element : list) {
        var List<?> functionResults = Arrays.stream(keyFunctions)
                .map[it.apply(element)]
                .collect(Collectors.toList());

        if(set.add(functionResults)) {
            result.add(element);
        }
    }
    return result;
    }

    def runSubprocess(String[] commands, Boolean debug){
        val res = new SubProcessResult
        var Runtime rt = Runtime.getRuntime()
        var Process proc = rt.exec(commands)

        var BufferedReader stdInput = new BufferedReader(new
             InputStreamReader(proc.getInputStream()))

        var BufferedReader stdError = new BufferedReader(new
             InputStreamReader(proc.getErrorStream()))

        var String line;
        var ArrayList<String> output = new ArrayList<String>()

        while ((line = stdInput.readLine()) !== null){
          output.add(line);
        }

        if(output.size>0){
            if(debug){
                    System.out.printf("runSubprocess: get success output: %s\n", output.toList.toString)
                }
            res.addResult(true, output.toList)
            return res
        }

        output = new ArrayList<String>()

        while ((line = stdError.readLine()) !== null){
          output.add(line);
        }
        if(output.size>0){
            if(debug){
                    System.out.printf("runSubprocess: get error output: %s\n",output.toList.toString)
                }
            res.addResult(false, output.toList)
            return res
        }
    }

    def runSubprocess(String[] commands){
        return runSubprocess(commands, false)
    }

    def OSInfo getOS(AbstractComputationAssignment cas){
            var osinfo = new OSInfo
            if(cas.runtimeType === null){
                for(cp : (cas.executedBy as ComputationDeviceInstance).configDeviceProperty){
                    if(cp.refProperty instanceof NameOperatingSystemProperty){
                        if(cp.value instanceof LinuxDistributionValue){
                        osinfo.name = (cp.value as LinuxDistributionValue).value.getName
                        }
                    }
                    if(cp.refProperty instanceof VersionOperatingSystemProperty){
                        if(cp.value instanceof UbuntuVersionValue){
                        osinfo.version = (cp.value as UbuntuVersionValue).value.getName
                        }
                    }
                }

            }
            if(cas.runtimeType !== null && cas.runtimeType instanceof ContainerRuntime){
                var res = (cas.runtimeType as ContainerRuntime).opertingSystemResource.stream.map[properties]
                .collect(Collectors.toList).flatten.toList.stream.filter[property |
                    property instanceof LinuxDistributionValue
                ].collect(Collectors.toList)

                if(res.size > 0){
                    osinfo.name = (res as LinuxDistributionValue).value.getName
                }
            }
            return osinfo

        }

    def String getUbuntuVersionFromRosDistro(String distro) {
         var String version
         switch (distro) {
             case ROSDistro.ROLLING.getName,
             case ROSDistro.HUMBLE.getName:
                 version = UbuntuVersion.JAMMY.getName()
             case ROSDistro.NOETIC.getName,
             case ROSDistro.GALACTIC.getName:
                 version = UbuntuVersion.FOCAL.getName()
             default:
                 throw new IllegalArgumentException("Invalid ROS Distro: " + distro)
         }
         return version;
    }

    def OSInfo getOSFromRosDistro(String osNme, String rosdistro) {
         var info = new OSInfo
         if(osNme == LinuxDistribution.UBUNTU.getName){
            info.name = LinuxDistribution.UBUNTU.getName
            info.version = getUbuntuVersionFromRosDistro(rosdistro)
         }
         else if(osNme === null){
          info.name = LinuxDistribution.UBUNTU.getName
          info.version = getUbuntuVersionFromRosDistro(rosdistro)
         }
         return info;
    }

    def String getRosVersionFromDistro(String distro){
         var String version
         switch (distro) {
             case ROSDistro.ROLLING.getName,
             case ROSDistro.HUMBLE.getName,
             case ROSDistro.GALACTIC.getName:
                  version = "ros2"
             case ROSDistro.NOETIC.getName:
                  version = "ros"
             default:
                 throw new IllegalArgumentException("Invalid ROS Distro: " + distro)
         }
         return version;
    }

def parserNetworkInfo(ConnectedDevice connectDev){
    var netInfo = new NetworkInfo
    if(connectDev.refConnection instanceof NetworkConnection){
        var networkConn = connectDev.refConnection as NetworkConnection
        for(ConfigConnectionProperty property: connectDev.properties){
            if(property.refConnectionProperty instanceof InterfaceNetworkProperty){
                netInfo.interfaceName = property.value.valueFromPropertyValue
            }
            if(property.refConnectionProperty instanceof IdentityNameNetworkProperty){
                netInfo.identityName = property.value.valueFromPropertyValue

            }
            if(property.refConnectionProperty instanceof MacAddressNetworkProperty){
                netInfo.macAddress = property.value.valueFromPropertyValue

            }
            if(property.refConnectionProperty instanceof AddressNetworkProperty){
                netInfo.address = property.value.valueFromPropertyValue
            }

            if(property.refConnectionProperty instanceof PortNetworkProperty){
                netInfo.setPorts(property.value.valueFromPropertyValue)
            }

            if(property.refConnectionProperty instanceof SubnetMaskNetworkProperty){
                netInfo.netmask = property.value.valueFromPropertyValue

            }
            if(property.refConnectionProperty instanceof GatewayNetworkProperty){
                netInfo.gateway = property.value.valueFromPropertyValue
            }
        }
        netInfo.networkType = networkConn.type
    }
    return netInfo
}

def getValueFromPropertyValue(PropertyValue pv){
    if(pv instanceof PropertyValueDouble)
        return (pv as PropertyValueDouble).value.toString
    if(pv instanceof PropertyValueInt)
        return (pv as PropertyValueInt).value.toString
    if(pv instanceof PropertyValueString)
        return (pv as PropertyValueString).value
     if(pv instanceof UbuntuVersionValue)
        return (pv as UbuntuVersionValue).value.getName
     if(pv instanceof LinuxDistributionValue)
        return (pv as LinuxDistributionValue).value.getName
     if(pv instanceof ProcessorArchitectureValue)
        return (pv as ProcessorArchitectureValue).value.getName
}

def getConnectionsIncludeDeviceInstanceFomTargetEnv(TargetDeployEnviroment tarEnv, AbstractDeviceInstance device){
    var List<ConfigConnection> connections = new ArrayList<ConfigConnection>()
    for(configConnection : tarEnv.configConnections){
        if(configConnection.connectDevice.stream().anyMatch[it.refDevice == device]){
            connections.add(configConnection)
        }
    }
    return connections
}

def getConnectedDeviceFomTargetEnv(TargetDeployEnviroment tarEnv, AbstractDeviceInstance device){
    var List<ConnectedDevice> connectedDevices = new ArrayList
    for(configConnection : tarEnv.configConnections){
        var res = configConnection.connectDevice.stream().filter[it.refDevice == device].collect(Collectors.toList)
      connectedDevices.addAll(res)
    }
    return connectedDevices
}

def collectAssignmentPerExecutor(List<AbstractComputationAssignment> raw){
    var Map<ComputationDeviceInstance, List<AbstractComputationAssignment>> collectAssignment
        = new HashMap<ComputationDeviceInstance, List<AbstractComputationAssignment>>
    for (AbstractComputationAssignment ass : raw) {
    collectAssignment.computeIfAbsent(ass.executedBy)[new ArrayList<AbstractComputationAssignment>()].add(ass)
    }
    return collectAssignment
}

def getAbstarctConfigSoftwareComponentName(EObject component){
    if (component instanceof AbstarctConfigSoftwareComponent){
        return getAbstarctConfigSoftwareComponentName(component)
    }
}

def getAbstarctConfigSoftwareComponentName(AbstarctConfigSoftwareComponent component){
    if(component instanceof ConfigSoftwareComponent){
        var comcomp = (component as ConfigSoftwareComponent).component
        if(comcomp instanceof SoftwareComponent){
                return comcomp.name
        }
    }
    if(component instanceof ConfigRosSoftwareComponent){
        var comcomp = (component as ConfigRosSoftwareComponent).component
        return comcomp.name
    }
}

def getAbstractDeviceInstanceType(AbstractDeviceInstance dev){
    if(dev instanceof DeviceInstance){
        return (dev as DeviceInstance).refDeviceType
    }
    if(dev instanceof ComputationDeviceInstance){
        return (dev as ComputationDeviceInstance).refDeviceType
    }
}

def getRepostioryTypeName(EObject repoType){
    if(repoType instanceof GitRepositoryTypeImpl){
        return "git"
    }
}

def getRepoNameFromUrl(String url){
    return url.substring(url.lastIndexOf("/") + 1).replace(".git","")
    }

def getRepoInfo(SoftwareComponent imp){
    val repo_info = new RepoInfo
    var url = imp.repository.url
    if(imp.repository.type instanceof GitRepositoryTypeImpl){
      if(!url.substring(url.length -4).equals(".git")){
        url = String.format("%s.git", url)
      }
    }

    repo_info.updateInfo(
        getRepoNameFromUrl(imp.repository.url),
        getRepostioryTypeName(imp.repository.type),
        url,
        imp.repository.version
    )
    return repo_info
}

def getReleaseInfo(String[] packNames, String rosdistro) {
    var List<String> commands = new ArrayList<String>(Arrays.asList("dhelp", "repo", "-pkg"))
    commands.addAll(packNames)
    commands.addAll(#["-d", rosdistro])
    System.out.printf("run dhelp commands: %s\n", commands.toString)
    var List<RepoInfo> repo_infos = new ArrayList
    var process_res = runSubprocess(commands, true)
    if(process_res.booleanResult){
      for(res: process_res.output){
        var temp = res.split(" ")
        val repo_info = new RepoInfo
          var url = temp.get(1)
          repo_info.updateInfo(temp.get(0), 'git', url, temp.get(2), true, true)
          repo_infos.add(repo_info)
        }
      }
    System.out.println("Finishing dhelp commands")

    return repo_infos
}

def checkIfPackageRelease(String packName, String rosdistro, String osName, String osVersion){
    var Runtime rt = Runtime.getRuntime()
    var String[] commands = #["rosdep", "resolve", packName, "--rosdistro", rosdistro]
    if(osName !=null && osVersion!= null){
      commands = #["rosdep", "resolve", packName, "--rosdistro", rosdistro, String.format("--os=%s:%s", osName, osVersion)]
    }
    var res = runSubprocess(commands, true)

    return res
}


def getDeviceVolumes(ConnectedDevice connectedComputationDevice){
    for(property : connectedComputationDevice.properties){
        if(property.refConnectionProperty instanceof DeviceVolumeUsbProperty){
            return (property.value as PropertyValueList).value
        }
    }
}

def determinIfGitlab(String repo_url){
  if(repo_url.toLowerCase.contains("gitlab")){
    return true
  }
  return false
}

def determinIfGithub(String repo_url){
  if(repo_url.toLowerCase.contains("github")){
    return true
  }
  return false
}


 def checkRepoAccessible(String repo_url) {
    var tmp_repo_url = repo_url.replace(".git", "")
    var target_uri = new URI("")
    if(!repo_url.determinIfGithub && !repo_url.determinIfGitlab){
      throw new RuntimeException(String.format("%s is not either gitlab repo or github repo", repo_url))
    }
    else if(repo_url.determinIfGithub){
      var tmp =  tmp_repo_url.split("https://github.com/")
      if(tmp.length < 2){
        throw new RuntimeException(String.format("%s did't start with 'https://github.com/'", repo_url))
      }
      var uri = String.format("https://api.github.com/repos/%s", tmp.get(tmp.length-1))
//      System.out.printf("Github uri: %s\n", uri)
      target_uri = new URI(uri)
    }
    else if(repo_url.determinIfGitlab){
      tmp_repo_url = repo_url.replace("https://", "")
      var tmp =  tmp_repo_url.split("/", 2)
//      System.out.printf("Gitlab repo_url: %s\n", tmp_repo_url)
      var uri = String.format("https://%s/api/v4/projects", tmp.get(0))
      target_uri = new URI(uri)
    }
    else{
      throw new RuntimeException(String.format("%s is not either gitlab repo or github repo", repo_url))
    }

    var httpRequest = HttpRequest.newBuilder()
            .uri(target_uri)
            .GET()
            .build();
    var httpClient = HttpClient.newHttpClient();
    var response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
//    System.out.println(response.body)

    var gson = new GsonBuilder()
                .setPrettyPrinting()
                .create()
    if(repo_url.determinIfGithub){
      var response_in_json = gson.fromJson(
        response.body,
        GithubResponse)
//      System.out.printf("response for github: %s\n",response_in_json.toString)

      if(response_in_json.get_if_private === null){
        System.out.printf(String.format("Github API rate limit exceeded now, assume it is private repository"))
        return false
      }
      if(response_in_json.get_if_private){
        return false
      }
      else{
        return true
      }
    }
    else if(repo_url.determinIfGitlab){
      var GitlabResponseListType = new TypeToken<ArrayList<GitlabResponse>>(){}.getType();
      var List<GitlabResponse> response_in_json = gson.fromJson(response.body, GitlabResponseListType)
//      System.out.printf("response for gitlab: %s\n",response_in_json.toString)

      tmp_repo_url = repo_url.replace("https://", "")
      val tmp =  tmp_repo_url.split("/", 2)

      if(response_in_json
      .filter[it.get_path_with_namespace.equals(tmp.get(1))]
      .length > 0){
        return true
      }
      else{
        return false
      }
    }
  }

  def getProcessorArchitecture(AbstractComputationAssignment cas){
    for(cp : (cas.executedBy as ComputationDeviceInstance).configDeviceProperty){
        if(cp.refProperty instanceof ArchitectureProcessorProperty){
            if(cp.value instanceof ProcessorArchitectureValue){
            var architecture = (cp.value as ProcessorArchitectureValue).value
            return architecture
            }
        }

    }
 }

  def chooseBaseImage(String arch){
    switch (arch) {
        case ProcessorArchitectureType.X86.getName: {
            "public.ecr.aws/docker/library/ros"
        }
        case ProcessorArchitectureType.ARM64V8.getName: {
            "arm64v8/ros"
        }
        case ProcessorArchitectureType.ARM64.getName: {
            "arm64/ros"
        }
                case ProcessorArchitectureType.ARM32.getName: {
            "arm32/ros"
        }
        default: {
            throw new IllegalArgumentException("Undefined Processor Architecture: " + arch)
        }
    }
 }
}
