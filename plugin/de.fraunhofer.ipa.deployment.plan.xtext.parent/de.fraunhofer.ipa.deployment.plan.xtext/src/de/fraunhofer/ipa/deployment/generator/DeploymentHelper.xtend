package de.fraunhofer.ipa.deployment.generator

import de.fraunhofer.ipa.deployment.util.LinuxDistribution
import de.fraunhofer.ipa.deployment.util.LinuxDistributionValue
import de.fraunhofer.ipa.deployment.util.UbuntuVersion
import de.fraunhofer.ipa.deployment.util.UbuntuVersionValue
import deploymentPlan.AbstractComputationAssignment
import deploymentPlan.ROSDistro
import device.NameOperatingSystemProperty
import device.VersionOperatingSystemProperty
import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.ArrayList
import java.util.Arrays
import java.util.HashSet
import java.util.LinkedHashSet
import java.util.List
import java.util.Map
import java.util.Set
import java.util.TreeMap
import java.util.function.Function
import java.util.stream.Collectors
import ros.Node
import ros.impl.PackageImpl
import system.InterfaceReference
import system.RosNode
import system.impl.RosPublisherReferenceImpl
import targetEnvironment.ComputationDeviceInstance
import org.eclipse.emf.ecore.EObject
import targetEnvironment.ConnectedDevice
import device.NetworkConnection
import targetEnvironment.ConfigConnectionProperty
import device.InterfaceNetworkProperty
import device.IdentityNameNetworkProperty
import device.MacAddressNetworkProperty
import device.AddressNetworkProperty
import device.PortNetworkProperty
import de.fraunhofer.ipa.deployment.util.PropertyValue
import de.fraunhofer.ipa.deployment.util.PropertyValueDouble
import de.fraunhofer.ipa.deployment.util.PropertyValueInt
import de.fraunhofer.ipa.deployment.util.PropertyValueString
import targetEnvironment.TargetDeployEnviroment
import targetEnvironment.ConfigConnection
import targetEnvironment.DeviceInstance
import java.util.HashMap

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
//        var rosinterfaces = object.rosinterfaces
//        var interfaces = rosinterfaces.stream.map[reference].collect(Collectors.toList())
//        for(interface : interfaces){
//            pkgsList.add(getPacakge(interface))
//        }

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
            if(cas.opertingSystemType === null){
                for(cp : (cas.executedBy as ComputationDeviceInstance).configDeviceProperty){
                    if(cp.refProperty instanceof NameOperatingSystemProperty){
                        if(cp.value instanceof LinuxDistributionValue){
                        osinfo.name = (cp.value as LinuxDistributionValue).value.getName
                        System.out.println(String.format("name:%s", osinfo.name))
                        }
                    }
                    if(cp.refProperty instanceof VersionOperatingSystemProperty){
                        System.out.println(String.format("cp.from :%s", cp.value ))
                        if(cp.value instanceof UbuntuVersionValue){
                        osinfo.version = (cp.value as UbuntuVersionValue).value.getName
                        System.out.println(String.format("version:%s", osinfo.version))
                        }
                    }
                }

            }
            else{
                if(cas.opertingSystemType instanceof LinuxDistributionValue){
                    osinfo.name = (cas.opertingSystemType as LinuxDistributionValue).value.getName
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

def parserNetworkInfo(ComputationDeviceInstance compDev){

}

def parserNetworkInfo(ConnectedDevice connectDev){
    var netInfo = new NetworkInfo
    if(connectDev.refConnection instanceof NetworkConnection){
        var networkConn = connectDev.refConnection as NetworkConnection
        for(ConfigConnectionProperty property: connectDev.properties){
            if(property.refConnectionProperty instanceof InterfaceNetworkProperty){
                netInfo.interfaceName = property.value.valueFromPropertyValue
                System.out.println(String.format("property: %s", property.value))
            }
            if(property.refConnectionProperty instanceof IdentityNameNetworkProperty){
                netInfo.identityName = property.value.valueFromPropertyValue
                            System.out.println(String.format("property: %s", property.value))

            }
            if(property.refConnectionProperty instanceof MacAddressNetworkProperty){
                netInfo.macAddress = property.value.valueFromPropertyValue
                System.out.println(String.format("property: %s", property.value))

            }
            if(property.refConnectionProperty instanceof AddressNetworkProperty){
                netInfo.address = property.value.valueFromPropertyValue
                System.out.println(String.format("property: %s", property.value))
            }

            if(property.refConnectionProperty instanceof PortNetworkProperty){
                netInfo.setPorts(property.value.valueFromPropertyValue)
                System.out.println(String.format("property: %s", property.value))
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
}

def getConnectionsIncludeDeviceInstanceFomTargetEnv(TargetDeployEnviroment tarEnv, DeviceInstance device){
    var List<ConfigConnection> connections = new ArrayList<ConfigConnection>()
    for(configConnection : tarEnv.configConnections){
        if(configConnection.connectDevice.stream().anyMatch[it.refDevice == device]){
            connections.add(configConnection)
        }
    }
    return connections
}

def collectAssignmentPerExecutor(List<AbstractComputationAssignment> raw){
    var Map<ComputationDeviceInstance, List<AbstractComputationAssignment>> collectAssignment
        = new HashMap<ComputationDeviceInstance, List<AbstractComputationAssignment>>
    for (AbstractComputationAssignment ass : raw) {
    collectAssignment.computeIfAbsent(ass.executedBy)[new ArrayList<AbstractComputationAssignment>()].add(ass)
    }
    return collectAssignment
}

}
