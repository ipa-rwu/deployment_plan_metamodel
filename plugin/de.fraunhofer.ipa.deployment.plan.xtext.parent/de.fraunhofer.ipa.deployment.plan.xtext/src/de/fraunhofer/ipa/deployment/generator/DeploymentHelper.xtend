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
import java.util.LinkedHashSet
import java.util.List
import java.util.Map
import java.util.Set
import java.util.TreeMap
import java.util.function.Function
import java.util.stream.Collectors
import org.eclipse.emf.ecore.EObject
import ros.Node
import ros.impl.PackageImpl
import system.InterfaceReference
import system.RosNode
import system.impl.RosPublisherReferenceImpl
import targetEnvironment.AbstractDeviceInstance
import targetEnvironment.ComputationDeviceInstance
import targetEnvironment.ConfigConnection
import targetEnvironment.ConfigConnectionProperty
import targetEnvironment.ConnectedDevice
import targetEnvironment.DeviceInstance
import targetEnvironment.TargetDeployEnviroment

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


class DeploymentHelper {

    def getRosPackagesFromSystem(system.System rossystem){
        var pkgsList = new LinkedHashSet
        var rosnodes = rossystem.components.stream.map[it as RosNode].collect(Collectors.toList())
        for(rosnode : rosnodes){
            pkgsList.addAll(getPacakgeFromRosNode(rosnode))
        }
        return pkgsList
    }

    def getRosPackagesFromSystemWithoutDuplicate(system.System rossystem){
        var pkgsList = getRosPackagesFromSystem(rossystem)
        var Map<String, PackageImpl> map = new TreeMap
        for (pkgimpl : pkgsList) {
             if (!map.containsKey(pkgimpl.name)) {
                  map.put(pkgimpl.name, pkgimpl);
             }
        }
        return map.values().toList
    }

    def getPacakgeFromRosNode (RosNode object){
        var pkgsList = new ArrayList()
        var fromNode = object.from
        pkgsList.add(getPacakge(fromNode))
        return pkgsList
    }

    def getPacakge(Node object){
        return object.eContainer.eContainer as PackageImpl
    }

    def getPacakge(InterfaceReference object){
        if(object instanceof RosPublisherReferenceImpl)
        return (object as RosPublisherReferenceImpl).from.eContainer.eContainer.eContainer as PackageImpl
    }

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
                    System.out.println(output.toList.toString)
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
                    System.out.println(output.toList.toString)
                }
            res.addResult(false, output.toList)
            return res
        }
    }

    def runSubprocess(String[] commands){
        runSubprocess(commands, false)
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
         return info;
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
//                System.out.println(String.format("property: %s", property.value))

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

def getRepoInfo(String repoInRosModel){
    val repo_info = new RepoInfo

    if(repoInRosModel.indexOf(":", repoInRosModel.indexOf(":") + 1) > 1) {
        val url = repoInRosModel.substring(0,repoInRosModel.lastIndexOf(':'))
        repo_info.updateInfo(
            url.substring(url.lastIndexOf("/") + 1).replace(".git",""),
            'git',
            url.replace(".git",""),
            repoInRosModel.substring(repoInRosModel.lastIndexOf(':')+ 1)
        )
    }
    else {
        repo_info.updateInfo(repoInRosModel.substring(repoInRosModel.lastIndexOf("/") + 1).replace(".git",""), 'git', repoInRosModel.replace(".git",""), null)
    }
    return repo_info
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
    repo_info.updateInfo(
        getRepoNameFromUrl(imp.repository.url),
        getRepostioryTypeName(imp.repository.type),
        imp.repository.url,
        imp.repository.version
    )
    return repo_info
}

def getReleaseInfo(String[] packNames, String rosdistro) {
    var List<String> commands = new ArrayList<String>(Arrays.asList("dhelp", "repo", "-pkg"))
    commands.addAll(packNames)
    commands.addAll(#["-d", rosdistro])
    var List<RepoInfo> repo_infos = new ArrayList
    for(res: runSubprocess(commands, true).output){
        var temp = res.split(" ")
        System.out.println(String.format("result from runSubprocess: %s, version: %s", temp.toList.toString, temp.get(2)))
        val repo_info = new RepoInfo
        var url = temp.get(1)
        repo_info.updateInfo(temp.get(0), 'git', url.replace(".git",""), temp.get(2))
        repo_infos.add(repo_info)
    }
    return repo_infos
}

def checkIfPackageRelease(String packName, String rosdistro, String osName, String osVersion){
    var Runtime rt = Runtime.getRuntime()
    var String[] commands = #["rosdep", "resolve", packName, "--rosdistro", rosdistro, String.format("--os=%s:%s", osName, osVersion)]
        return runSubprocess(commands)
}

def compareWithRelease(List<RepoInfo> repoInfos, PackageImpl pkg){
    var same = false
    var pkgRepoInfo = getRepoInfo(pkg.fromGitRepo)
    for(repoInfo: repoInfos){
        if(repoInfo.name == pkg.name){
            if(repoInfo.url == pkgRepoInfo.url){
                if(pkgRepoInfo.version === null || repoInfo.version == pkgRepoInfo.version){
                    same = true
                    return same
                }
            }

        }
    }
    return same
}

def getRepoinfosFromRossystem(system.System sys, OSInfo os, String rosdistro){
        var List<RepoInfo> repos =  new ArrayList
    var pkgLists = getRosPackagesFromSystemWithoutDuplicate(sys)
    var repoInfos = getReleaseInfo(pkgLists.map[name].toList, rosdistro)
    for(pkg: pkgLists){
        if (pkg.fromGitRepo!==null){
            var repo_info = getRepoInfo(pkg.fromGitRepo)
            if(repo_info!==null){
//              check if Package already released
                if(!checkIfPackageRelease(pkg.name, rosdistro, os.name, os.version).booleanResult){
                    repos.add(repo_info)
                }
//             check if repo info defined in .ros matches released info
                else if(!compareWithRelease(repoInfos, pkg)){
                        repos.add(repo_info)
                    }
                    else{
                        repo_info.released = pkg.name
                        repo_info = repoInfos.stream.filter[it.name == pkg.name].collect(Collectors.toList).get(0)
                        repos.add(repo_info)
                    }
            }
            else{
                repo_info.released = pkg.name
                repo_info = repoInfos.stream.filter[it.name == pkg.name].collect(Collectors.toList).get(0)
                repos.add(repo_info)
            }
        }
    }
    return repos
}

def getDeviceVolumes(ConnectedDevice connectedComputationDevice){
    for(property : connectedComputationDevice.properties){
        if(property.refConnectionProperty instanceof DeviceVolumeUsbProperty){
            return (property.value as PropertyValueList).value
        }
    }
}

}
