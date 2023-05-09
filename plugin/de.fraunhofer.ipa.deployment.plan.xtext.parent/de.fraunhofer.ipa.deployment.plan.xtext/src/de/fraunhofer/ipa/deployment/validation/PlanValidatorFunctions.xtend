package de.fraunhofer.ipa.deployment.validation

import deploymentPlan.ConfigExecutionParameter
import deploymentPlan.ConfigSoftwareComponent
import implementationDescription.DeviceRequirement
import implementationDescription.HWSWParemeter
import implementationDescription.SoftwareComponent
import java.util.ArrayList
import java.util.List
import java.util.stream.Collectors
import deploymentPlan.DeploymentPlan
import targetEnvironment.ComputationDeviceInstance
import targetEnvironment.DeviceInstance

class ValidationMsg {
    Boolean Valid = null
    String Msg = null

    def setValid(Boolean res){
      this.Valid = res
    }

    def getValid(){
        if(this.Valid === null){
            throw new RuntimeException("Didn't set Valid yet")
        }else {
            return this.Valid
        }
    }

    def setMsg(String msg){
        this.Msg = msg
    }

    def getMsg(){
        if(this.Msg === null){
            throw new RuntimeException("Didn't set Msg yet")
        }else {
            return this.Msg
        }
    }
}

class PlanValidatorFunctions {

    def ifSatisfyImplemtationWithHWReqest(ConfigSoftwareComponent configComponent){
        var List<HWSWParemeter> hwSWParams = new ArrayList
        var List<HWSWParemeter> allDefinedHWSWParams = new ArrayList
        var res = configComponent.executionConfiguration.stream
        .filter[it instanceof ConfigExecutionParameter]
        .map[it as ConfigExecutionParameter]
    allDefinedHWSWParams = res.map[from]
                                            .filter[it instanceof HWSWParemeter]
                                            .map[it as HWSWParemeter]
                                            .collect(Collectors.toList)

      var impledComponent = configComponent.getComponent();
      if(impledComponent instanceof SoftwareComponent) {
      hwSWParams = (impledComponent as SoftwareComponent).executionRequirement.stream
        .filter[it instanceof DeviceRequirement]
        .map[it as DeviceRequirement]
        .map[parameter]
        .collect(Collectors.toList).flatten.toList
      }

      if(hwSWParams !==null && hwSWParams.size > 0){
        var msg = new ValidationMsg
        if(!allDefinedHWSWParams.containsAll(hwSWParams)){
            val tmp = allDefinedHWSWParams;
            var List<HWSWParemeter> differences = hwSWParams.stream()
            .filter[!tmp.contains(it)]
            .collect(Collectors.toList());
            msg.valid = false
            msg.msg = String.format("Missing: %s", differences.map[name].stream.collect(Collectors.joining(",", "[", "]")))
            return msg
        }
        else{
            msg.valid = true
            return msg
        }
      }

    }

    def TarEnvSatisfyImplemtationWithHWReqest(ConfigSoftwareComponent configComponent){
        var List<String> devices = new ArrayList
      var impledComponent = configComponent.getComponent();
      if(impledComponent instanceof SoftwareComponent) {
      devices = (impledComponent as SoftwareComponent).executionRequirement.stream
        .filter[it instanceof DeviceRequirement]
        .map[it as DeviceRequirement]
        .map[type]
        .collect(Collectors.toList)
      }
      var tarEnv = (configComponent.eContainer.eContainer.eContainer as DeploymentPlan).deployTo
      var List<String> aviDevices = new ArrayList
      for(dev: tarEnv.includeDevice){
        if(dev instanceof ComputationDeviceInstance){
            aviDevices.add((dev as ComputationDeviceInstance).refDeviceType.name)
        }
        if(dev instanceof DeviceInstance){
            aviDevices.add((dev as DeviceInstance).refDeviceType.name)
        }
      }

        if(devices !==null && devices.size > 0){
        var msg = new ValidationMsg
        if(!aviDevices.containsAll(devices)){
            val tmp = aviDevices;
            var List<String> differences = devices.stream()
            .filter[!tmp.contains(it)]
            .collect(Collectors.toList());
            msg.valid = false
            msg.msg = String.format("Target Environment: %s doesn't have device: %s",
                tarEnv.name,
                differences.stream.collect(Collectors.joining(",", "[", "]"))
            )
            return msg
        }
        else{
            msg.valid = true
            return msg
        }
      }
    }
}
