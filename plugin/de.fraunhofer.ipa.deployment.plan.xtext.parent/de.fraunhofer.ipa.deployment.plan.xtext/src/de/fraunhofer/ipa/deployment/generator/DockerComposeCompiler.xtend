package de.fraunhofer.ipa.deployment.generator

import de.fraunhofer.ipa.deployment.util.EthernetCommunicationType
import de.fraunhofer.ipa.deployment.util.PropertyValue
import de.fraunhofer.ipa.deployment.util.PropertyValueDouble
import de.fraunhofer.ipa.deployment.util.PropertyValueInt
import de.fraunhofer.ipa.deployment.util.PropertyValueList
import de.fraunhofer.ipa.deployment.util.PropertyValueString
import deployPlanWithRosModel.ConfigRosParameter
import deploymentPlan.AbstarctConfigSoftwareComponent
import deploymentPlan.AbstractComputationAssignment
import deploymentPlan.AbstractConfigExecutionParameter
import deploymentPlan.ConfigExecutionParameter
import device.AddressNetworkProperty
import device.DeviceVolumeUsbProperty
import device.IdentityNameNetworkProperty
import device.InterfaceNetworkProperty
import device.MacAddressNetworkProperty
import device.NetworkConnection
import device.PortNetworkProperty
import device.UsbConnection
import device.impl.NetworkConnectionImpl
import implementationDescription.ExecutionParameter
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import java.util.stream.Collectors
import org.eclipse.emf.ecore.EObject
import system.RosParameter
import targetEnvironment.AbstractConfigProperty
import targetEnvironment.ComputationDeviceInstance
import targetEnvironment.ConfigConnection
import targetEnvironment.ConfigConnectionProperty
import targetEnvironment.ConfigDeviceProperty
import targetEnvironment.ConnectedDevice
import targetEnvironment.DeviceInstance
import targetEnvironment.TargetDeployEnviroment

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

class DockerComposeCompiler {

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
    image: ${Registry}/«assignment.name»
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
        «FOR software: assignment.softwareComponents»
        «var paramPerSoftware = covertCollectExecutionEnvtoString(collectExecutionEnv(software))»
        «String.join(" & \n", software.startCommand)» «
        »«IF software.startCommand.size > 0»«FOR param : paramPerSoftware»«param.key»:=«param.value» «ENDFOR»«ENDIF»
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

def parserNetworkInfo(ConnectedDevice connectDev){
    var netInfo = new NetworkInfo
    if(connectDev.refConnection instanceof NetworkConnection){
        var networkConn = connectDev.refConnection as NetworkConnectionImpl
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

def createNetworkConfig(NetworkInfo netInfo)'''
«netInfo.identityName»:
  driver: macvlan
  driver_opts:
    parent: «netInfo.interfaceName»
  ipam:
    driver: default
'''

def addNetworks(List<ConnectedDevice> connectedComputationDevices)'''
«FOR connectedComputationDevice : connectedComputationDevices»
«IF connectedComputationDevice.refConnection instanceof NetworkConnection»
- «parserNetworkInfo(connectedComputationDevice).identityName»
«ENDIF»
«ENDFOR»
'''

def addPort(List<ConnectedDevice> connectedComputationDevices)'''
  «FOR connectedComputationDevice : connectedComputationDevices»
  «IF connectedComputationDevice.refConnection instanceof NetworkConnection»
  «var netInfo = parserNetworkInfo(connectedComputationDevice)»
  «IF netInfo.ports.size > 0»
ports:
  «FOR port : netInfo.ports»
  - «port»:«port»
«ENDFOR»
«ENDIF»
«ENDIF»
«ENDFOR»
'''

def addDevice(List<ConnectedDevice> connectedComputationDevices)'''
  «FOR connectedComputationDevice : connectedComputationDevices»
  «IF connectedComputationDevice.refConnection instanceof UsbConnection»
  «var volumes = connectedComputationDevice.getDeviceVolumes»
  «IF volumes.size >0»
devices:
  «FOR volume : connectedComputationDevice.getDeviceVolumes»
  - «volume.valueFromPropertyValue»:«volume.valueFromPropertyValue»
«ENDFOR»
«ENDIF»
«ENDIF»
«ENDFOR»
'''

def getDeviceVolumes(ConnectedDevice connectedComputationDevice){
    for(property : connectedComputationDevice.properties){
        if(property.refConnectionProperty instanceof DeviceVolumeUsbProperty){
            System.out.println(String.format("Volumes: %s", property.value))
            return (property.value as PropertyValueList).value
        }
    }
}

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

def getValueFromPropertyValueList(PropertyValue pv){
    if(pv instanceof PropertyValueList)
        return (pv as PropertyValueList).value
}

def getCommunicationConnectionPerAssignment(AbstractComputationAssignment assignment, ComputationDeviceInstance compDev){
    var List<ConnectedDevice> connectedComputationDevices = new ArrayList<ConnectedDevice>()
    for(software: assignment.softwareComponents){
        if(software.executionConfiguration !== null){
            for(configExecParam : software.executionConfiguration){
                var communicatedComputationDevice = getConnectedComputaionDeviceFromExecParam(configExecParam, compDev)
                connectedComputationDevices.add(communicatedComputationDevice)
                System.out.println(String.format("communicatedComputationDevice container: %s", communicatedComputationDevice.eContainer))
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

def getConnectionsIncludeDeviceInstanceFomTargetEnv(TargetDeployEnviroment tarEnv, DeviceInstance device){
    var List<ConfigConnection> connections = new ArrayList<ConfigConnection>()
    for(configConnection : tarEnv.configConnections){
        if(configConnection.connectDevice.stream().anyMatch[it.refDevice == device]){
            connections.add(configConnection)
        }
    }
    return connections
}

def getConnectionsIncludeDeviceInstanceFomTargetEnv(TargetDeployEnviroment tarEnv, DeviceInstance device, ComputationDeviceInstance comp){
    var List<ConnectedDevice> connectedComputationDevices = new ArrayList<ConnectedDevice>()
    var all = getConnectionsIncludeDeviceInstanceFomTargetEnv(tarEnv, device)
    if(all !== null && all.size > 0){
        for(connection: all){
            var res = connection.connectDevice.stream.filter[it.refDevice == comp]
            .collect(Collectors.toList()).get(0)
            connectedComputationDevices.add(res)
        }
    }
    return connectedComputationDevices
}
}
