package de.fraunhofer.ipa.deployment.generator

import de.fraunhofer.ipa.deployment.generator.DockerComposeCompiler
import deploymentPlan.AbstarctConfigSoftwareComponent
import org.eclipse.emf.ecore.EObject
import de.fraunhofer.ipa.deployment.util.PropertyValue
import java.util.Map
import deploymentPlan.AbstractConfigExecutionParameter
import java.util.HashMap
import deployPlanWithRosModel.ConfigRosParameter
import deploymentPlan.AbstractComputationAssignment
import java.util.List
import targetEnvironment.ComputationDeviceInstance
import deploymentPlan.ContainerRuntime
import deploymentPlan.RosMiddleware

class DockerComposeCompilerPlanWithRosmodel extends DockerComposeCompiler{

  override dockerComposeCompiler(List<AbstractComputationAssignment> assignments, ComputationDeviceInstance compDev)'''
version: '3'
networks:
  ros-network:
    external: false
    driver: "bridge"
  «FOR netInfo: collectConfigNetwork(compDev)»
  «createNetworkConfig(netInfo)»
«ENDFOR»

services:
  «FOR assignment : assignments»
«var connectedCommunicatedComputationDevices = getCommunicationConnectionPerAssignment(assignment, compDev)»
  «var paramList = covertCollectExecutionEnvtoString(collectExecutionEnv(assignment))»
  «assignment.name»:
    «IF  assignment.runtimeType !== null && (assignment.runtimeType as ContainerRuntime).registry !== null»
    image: «(assignment.runtimeType as ContainerRuntime).registry»/«assignment.name»_«(assignment.middleware as RosMiddleware).value.getName»:«assignment.version»
    «ELSE»
    image: ${Registry}/«assignment.name»:«assignment.version»
    «ENDIF»
    volumes:
      - ./cyclonedds.xml:/cyclonedds.xml
    networks:
      - ros-network
      «connectedCommunicatedComputationDevices.addNetworks»
    «connectedCommunicatedComputationDevices.addPort»
    «connectedCommunicatedComputationDevices.addDevice»
    environment:
      - NETINTERFACE=eth0
      # for application
      «FOR param : paramList»
      - «param.key»=«param.value»
      «ENDFOR»
    command:
      - bash
      - -c
      - |
        export CYCLONEDDS_URI=file:///cyclonedds.xml
        source /ros_entrypoint.sh
        «FOR software: assignment.getSoftwareFromAssignemnt»
        «var paramPerSoftware = covertCollectExecutionEnvtoString(collectExecutionEnv(software))»
        «String.join(" & \n", software.startCommand)» «
        »«IF software.startCommand.size > 0»«FOR param : paramPerSoftware»«param.key»:=«param.value» «ENDFOR»«ENDIF»
        «ENDFOR»
«ENDFOR»
'''

  override collectExecutionEnv(AbstarctConfigSoftwareComponent software){
    var raw = software.executionConfiguration
    var Map<EObject, PropertyValue> res
        = new HashMap<EObject, PropertyValue>
    for(AbstractConfigExecutionParameter p: raw){
       if(p instanceof ConfigRosParameter){
            res.computeIfAbsent((p as ConfigRosParameter).refNodeParam)
            [
                if ((p as ConfigRosParameter).value !== null){
                    (p as ConfigRosParameter).value
                }else{
                    getValueFromTargetEnv((p as ConfigRosParameter).to)
                    }
            ]

           res.computeIfAbsent((p as ConfigRosParameter).refSysParam)
            [
                if ((p as ConfigRosParameter).value !== null){
                    (p as ConfigRosParameter).value
                }else{
                    getValueFromTargetEnv((p as ConfigRosParameter).to)
                    }
            ]
        }
    }
    return res
  }

  override collectExecutionEnv(AbstractComputationAssignment assignment){
    var raw = assignment.getSoftwareFromAssignemnt.map[executionConfiguration].flatten
    var Map<EObject, PropertyValue> res
        = new HashMap<EObject, PropertyValue>
    for(AbstractConfigExecutionParameter p: raw){
        if(p instanceof ConfigRosParameter){
            res.computeIfAbsent((p as ConfigRosParameter).refNodeParam)
            [
                if ((p as ConfigRosParameter).value !== null){
                    (p as ConfigRosParameter).value
                }else{
                    getValueFromTargetEnv((p as ConfigRosParameter).to)
                    }
            ]

           res.computeIfAbsent((p as ConfigRosParameter).refSysParam)
            [
                if ((p as ConfigRosParameter).value !== null){
                    (p as ConfigRosParameter).value
                }else{
                    getValueFromTargetEnv((p as ConfigRosParameter).to)
                    }
            ]
        }
    }
    return res
}
}
