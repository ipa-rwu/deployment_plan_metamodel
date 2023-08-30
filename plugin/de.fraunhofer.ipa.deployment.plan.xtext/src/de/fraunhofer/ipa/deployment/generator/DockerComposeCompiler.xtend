package de.fraunhofer.ipa.deployment.generator

import de.fraunhofer.ipa.deployment.util.EthernetCommunicationType
import de.fraunhofer.ipa.deployment.util.PropertyValue
import de.fraunhofer.ipa.deployment.util.PropertyValueList
import deployPlanWithRosModel.ConfigRosParameter
import deployPlanWithRosModel.RossystemImplementationAssignment
import deploymentPlan.AbstarctConfigSoftwareComponent
import deploymentPlan.AbstractComputationAssignment
import deploymentPlan.AbstractConfigExecutionParameter
import deploymentPlan.ConfigExecutionParameter
import deploymentPlan.ImplementationAssignment
import device.NetworkConnection
import device.UsbConnection
import device.impl.NetworkConnectionImpl
import implementationDescription.ExecutionParameter
import java.util.ArrayList
import java.util.HashMap
import java.util.HashSet
import java.util.List
import java.util.Map
import java.util.Set
import java.util.stream.Collectors
import javax.inject.Inject
import org.eclipse.emf.ecore.EObject
import system.RosParameter
import system.impl.RosParameterImpl
import targetEnvironment.AbstractConfigProperty
import targetEnvironment.ComputationDeviceInstance
import targetEnvironment.ConfigConnection
import targetEnvironment.ConfigConnectionProperty
import targetEnvironment.ConfigDeviceProperty
import targetEnvironment.ConnectedDevice
import targetEnvironment.DeviceInstance
import targetEnvironment.TargetDeployEnviroment

class DockerComposeCompiler {

@Inject
extension DeploymentHelper

def dockerComposeCompiler(List<AbstractComputationAssignment> assignments, ComputationDeviceInstance compDev)'''
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
    image: ${Registry}/«assignment.name»:«assignment.version»
    volumes:
      - ./cyclonedds.xml:/cyclonedds.xml
    networks:
      - ros-network
      «connectedCommunicatedComputationDevices.addNetworks»
    «connectedCommunicatedComputationDevices.addPort»
    «connectedCommunicatedComputationDevices.addDevice»
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
        source /ros_entrypoint.sh
        «FOR software: assignment.getSoftwareFromAssignemnt»
        «var paramPerSoftware = covertCollectExecutionEnvtoString(collectExecutionEnv(software))»
        «String.join(" & \n", software.startCommand)» «
        »«IF software.startCommand.size > 0»«FOR param : paramPerSoftware»«param.key»:=«param.value» «ENDFOR»«ENDIF»
        «ENDFOR»
«ENDFOR»
'''

def getSoftwareFromAssignemnt(AbstractComputationAssignment assignment){
    if(assignment instanceof ImplementationAssignment)
        return assignment.softwareComponents
    if(assignment instanceof RossystemImplementationAssignment)
        return assignment.softwareComponents
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

def collectConfigNetwork(ComputationDeviceInstance compDev){
    var tarEnv = compDev.eContainer as TargetDeployEnviroment
    var List<NetworkInfo> networkConnections = new ArrayList<NetworkInfo>();
    for(ConfigConnection configConn : tarEnv.configConnections){
        for(ConnectedDevice connectDev: configConn.connectDevice){
            if(connectDev.refDevice == compDev && connectDev.refConnection instanceof NetworkConnectionImpl){
                var networkConn = connectDev.refConnection as NetworkConnectionImpl
                if (networkConn.type instanceof EthernetCommunicationType){
                    networkConnections.add(parserNetworkInfo(connectDev))
            }
            }
        }
    }
    return networkConnections
}



def createNetworkConfig(NetworkInfo netInfo)'''
«netInfo.identityName»:
  driver: macvlan
  driver_opts:
    parent: «netInfo.interfaceName»
  ipam:
    driver: default
'''

def addNetworks(Set<ConnectedDevice> connectedComputationDevices)'''
«FOR connectedComputationDevice : connectedComputationDevices»
«IF connectedComputationDevice.refConnection instanceof NetworkConnection»
- «parserNetworkInfo(connectedComputationDevice).identityName»
«ENDIF»
«ENDFOR»
'''

def addPort(Set<ConnectedDevice> connectedComputationDevices)'''
«var connectedDevices = connectedComputationDevices.stream.filter[it.refConnection instanceof NetworkConnection].collect(Collectors.toList)»
«var netinfos = new ArrayList»
«FOR connectedDevice : connectedDevices»
«{netinfos.add(parserNetworkInfo(connectedDevice)); ""}»
«var ports = netinfos.stream.map[ports].collect(Collectors.toList).flatten»
«IF ports.size > 0»
ports:
  «FOR port : ports»
  - «port»:«port»
«ENDFOR»
«ENDIF»
«ENDFOR»
'''

def addDevice(Set<ConnectedDevice> connectedComputationDevices)'''
«var usbConnections = connectedComputationDevices.stream.filter[it.refConnection instanceof UsbConnection].collect(Collectors.toList)»
«var volumes = usbConnections.stream.map[getDeviceVolumes].collect(Collectors.toList)»
«IF volumes.size >0»
«FOR v: volumes»
«IF v !== null && v.size >0»
devices:
  «FOR volume : v»
  - «volume.valueFromPropertyValue»:«volume.valueFromPropertyValue»
«ENDFOR»
«ENDIF»
«ENDFOR»
«ENDIF»
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
    }
    return res
}


def collectExecutionEnv(AbstractComputationAssignment assignment){
    var raw = assignment.getSoftwareFromAssignemnt.map[executionConfiguration].flatten
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
    }
    return res
}

def covertCollectExecutionEnvtoString(Map<EObject, PropertyValue> res){
  var List<Pair<String,String>> converted = new ArrayList<Pair<String,String>>();
  for(Map.Entry<EObject, PropertyValue> entry : res.entrySet()){
    if(entry.key instanceof RosParameterImpl){
        converted.add(new Pair((entry.key as RosParameter).name, getValueFromPropertyValue(entry.value)))
    }
    else if(entry.key instanceof ExecutionParameter){
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



def getValueFromPropertyValueList(PropertyValue pv){
    if(pv instanceof PropertyValueList)
        return (pv as PropertyValueList).value
}

def getCommunicationConnectionPerAssignment(AbstractComputationAssignment assignment, ComputationDeviceInstance compDev){
    var Set<ConnectedDevice> connectedComputationDevices = new HashSet<ConnectedDevice>()
    for(software: assignment.getSoftwareFromAssignemnt){
        if(software.executionConfiguration !== null){
            for(configExecParam : software.executionConfiguration){
                var communicatedComputationDevice = getConnectedComputaionDeviceFromExecParam(configExecParam, compDev)
                if(communicatedComputationDevice !== null){
                    connectedComputationDevices.add(communicatedComputationDevice)
                }
            }
        }
    }
    return connectedComputationDevices
}

def getConnectedComputaionDeviceFromExecParam(AbstractConfigExecutionParameter configExecParam, ComputationDeviceInstance compDev){
        var ConnectedDevice communicatedComputationDevice = null
        var AbstractConfigProperty paramFromTarEnv = null
        if(configExecParam instanceof ConfigExecutionParameter){
            if((configExecParam as ConfigExecutionParameter).to !== null){
                paramFromTarEnv = (configExecParam as ConfigExecutionParameter).to
            }
        }
        if(configExecParam instanceof ConfigRosParameter){
            if((configExecParam as ConfigRosParameter).to !== null){
                paramFromTarEnv = (configExecParam as ConfigRosParameter).to
            }
        }
        if(paramFromTarEnv !== null){
            if(paramFromTarEnv instanceof ConfigConnectionProperty){
                communicatedComputationDevice = (paramFromTarEnv.eContainer.eContainer as ConfigConnection).connectDevice
                .stream().filter[it.refDevice == compDev]
                .collect(Collectors.toList()).get(0)
            }
            if(paramFromTarEnv instanceof ConfigDeviceProperty){
                communicatedComputationDevice = getConnectionsIncludeDeviceInstanceFomTargetEnv(
                    compDev.eContainer as TargetDeployEnviroment,
                    paramFromTarEnv.eContainer as DeviceInstance,
                    compDev
                ).get(0)
            }
        }
        return communicatedComputationDevice
}

def getConnectionsIncludeDeviceInstanceFomTargetEnv(TargetDeployEnviroment tarEnv, DeviceInstance device, ComputationDeviceInstance comp){
    var List<ConnectedDevice> connectedComputationDevices = new ArrayList<ConnectedDevice>()
    var all = getConnectionsIncludeDeviceInstanceFomTargetEnv(tarEnv, device)
    if(all !== null && all.size > 0){
        for(connection: all){
            var res = connection.connectDevice.stream.filter[it.refDevice == comp]
            .collect(Collectors.toList())
            if(res.size >0){
                connectedComputationDevices.add(res.get(0))
            }
        }
    }
    return connectedComputationDevices
}
}
