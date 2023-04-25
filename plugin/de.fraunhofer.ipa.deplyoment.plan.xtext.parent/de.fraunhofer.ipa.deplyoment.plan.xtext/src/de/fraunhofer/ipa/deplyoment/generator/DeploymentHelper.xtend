package de.fraunhofer.ipa.deplyoment.generator

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


}
