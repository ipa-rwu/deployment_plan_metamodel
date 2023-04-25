package de.fraunhofer.ipa.deployment.generator

import de.fraunhofer.ipa.deployment.util.PropertyValue
import de.fraunhofer.ipa.deployment.util.PropertyValueDouble
import de.fraunhofer.ipa.deployment.util.PropertyValueInt
import de.fraunhofer.ipa.deployment.util.PropertyValueString
import deploymentPlan.AbstarctConfigSoftwareComponent
import deploymentPlan.AbstractComputationAssignment
import deploymentPlan.AbstractConfigExecutionParameter
import deploymentPlan.ConfigExecutionParameter
import deployPlanWithRosModel.ConfigRosParameter
import implementationDescription.ExecutionParameter
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import org.eclipse.emf.ecore.EObject
import system.RosParameter
import targetEnvironment.AbstractConfigProperty
import targetEnvironment.ComputationDeviceInstance
import targetEnvironment.ConfigConnectionProperty
import targetEnvironment.ConfigDeviceProperty

class DockerComposeCompiler {

def dockerComposeCompiler(List<AbstractComputationAssignment> assignments)'''
version: '3'
networks:
  ros-network:
    external: false
    driver: "bridge"

services:
  «FOR assignment : assignments»
  «var paramList = covertCollectExecutionEnvtoString(collectExecutionEnv(assignment))»
  «assignment.name»:
    image: ${Registry}/«assignment.name»
    volumes:
      - ./cyclonedds.xml:/cyclonedds.xml
    networks:
      - ros-network
    environment:
      - NETINTERFACE=eth0
      «FOR param : paramList»
      - «param.key»=«param.value»
      «ENDFOR»
    command:
      - bash
      - -c
      - |
        export CYCLONEDDS_URI=file:///cyclonedds.xml
        «FOR software: assignment.softwareComponents»
        «var paramPerSoftware = covertCollectExecutionEnvtoString(collectExecutionEnv(software))»
        «String.join("\n", software.startCommand)» «
        »«IF software.startCommand.size>0»«FOR param : paramPerSoftware»«param.key»:=«param.value» «ENDFOR»«ENDIF»
        «ENDFOR»
«ENDFOR»
'''

def collectAssignmentPerExecutor(List<AbstractComputationAssignment> raw){
    var Map<ComputationDeviceInstance, List<AbstractComputationAssignment>> collectAssignment
        = new HashMap<ComputationDeviceInstance, List<AbstractComputationAssignment>>
    for (AbstractComputationAssignment ass : raw) {
    collectAssignment.computeIfAbsent(ass.executedBy)[new ArrayList<AbstractComputationAssignment>()].add(ass)
    }
    return collectAssignment
}

def cycloneDDSConfig()'''
<?xml version="1.0" encoding="UTF-8" ?>
  <CycloneDDS xmlns="https://cdds.io/config" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="https://cdds.io/config https://raw.githubusercontent.com/eclipse-cyclonedds/cyclonedds/master/etc/cyclonedds.xsd">
    <Domain id="any">
        <General>
            <NetworkInterfaceAddress>${NETINTERFACE}</NetworkInterfaceAddress>
        </General>
    </Domain>
    <!-- <Tracing>
        <Verbosity>config</Verbosity>
        <OutputFile>stdout</OutputFile>
    </Tracing> -->
</CycloneDDS>
'''

def collectExecutionEnv(AbstarctConfigSoftwareComponent software){
    var raw = software.executionConfiguration
    var Map<EObject, PropertyValue> res
        = new HashMap<EObject, PropertyValue>
    for(AbstractConfigExecutionParameter p: raw){
        if(p instanceof ConfigExecutionParameter){
            res.computeIfAbsent((p as ConfigExecutionParameter).from)
            [
                if ((p as ConfigExecutionParameter).value !== null){
                    (p as ConfigExecutionParameter).value
                }else{
                    getValueFromTargetEnv((p as ConfigExecutionParameter).to)
                }
            ]
        }
        else if(p instanceof ConfigRosParameter){
            res.computeIfAbsent((p as ConfigRosParameter).from)
            [
                if ((p as ConfigRosParameter).value !== null){
                    (p as ConfigRosParameter).value
                }else{
                    getValueFromTargetEnv((p as ConfigRosParameter).to)
                    }
            ]
        }
    }
    System.out.println(String.format("res: %s", res.keySet.toString))
    return res
}


def collectExecutionEnv(AbstractComputationAssignment assignment){
    var raw = assignment.softwareComponents.map[executionConfiguration].flatten
    var Map<EObject, PropertyValue> res
        = new HashMap<EObject, PropertyValue>
    for(AbstractConfigExecutionParameter p: raw){
        if(p instanceof ConfigExecutionParameter){
            res.computeIfAbsent((p as ConfigExecutionParameter).from)
            [
                if ((p as ConfigExecutionParameter).value !== null){
                    (p as ConfigExecutionParameter).value
                }else{
                    getValueFromTargetEnv((p as ConfigExecutionParameter).to)
                }
            ]
        }
        else if(p instanceof ConfigRosParameter){
            res.computeIfAbsent((p as ConfigRosParameter).from)
            [
                if ((p as ConfigRosParameter).value !== null){
                    (p as ConfigRosParameter).value
                }else{
                    getValueFromTargetEnv((p as ConfigRosParameter).to)
                    }
            ]
        }
    }
    System.out.println(String.format("res: %s", res.keySet.toString))
    return res
}

def covertCollectExecutionEnvtoString(Map<EObject, PropertyValue> res){
    var List<Pair<String,String>> converted = new ArrayList<Pair<String,String>>();
  for(Map.Entry<EObject, PropertyValue> entry : res.entrySet()){
    if(entry.key instanceof RosParameter){
            converted.add(new Pair((entry.key as RosParameter).name, getValueFromPropertyValue(entry.value)))
        }
    else if(entry.getKey() instanceof ExecutionParameter){
            converted.add(new Pair((entry.key as ExecutionParameter).name, getValueFromPropertyValue(entry.value)))
        }
    }
    return converted
 }


def getValueFromTargetEnv(AbstractConfigProperty abP){
    if(abP instanceof ConfigConnectionProperty){
        return (abP as ConfigConnectionProperty).value
    }
    if(abP instanceof ConfigDeviceProperty){
        return (abP as ConfigDeviceProperty).value
    }
}

def getValueFromPropertyValue(PropertyValue pv){
    if(pv instanceof PropertyValueDouble)
        return (pv as PropertyValueDouble).value.toString
    if(pv instanceof PropertyValueInt)
        return (pv as PropertyValueInt).value.toString
    if(pv instanceof PropertyValueString)
        return (pv as PropertyValueString).value
}
}
