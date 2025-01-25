package de.fraunhofer.ipa.deployment.toolbar.utils

import deployPlanWithRosModel.DeployRossystemPlan
import targetEnvironment.TargetDeployEnviroment

class TarEnvModelTemplate {
  def createTarenvSkeleton(TargetDeployEnviroment tarenv)'''
TargetDeployEnviroment:
  name: «tarenv.name»_env # name of this target environment"
  includeDevice:
    computationDevice:
      - name: "TODO: name of this device"
        refDeviceType: PC # note: it references to a computation device type from the device catalog, you can change it if you create your owns
        configDeviceProperty:
          - name: "os_name"
            from: "PC.operting_system.os_name"
            value: ubuntu # note: only support ubuntu so far
          - name: "os_version"
            from: "PC.operting_system.os_version"
            value: focal # ubuntu version
          - name: "processor_architecture"
            from: "PC.processor.processor_architecture"
            value: x86
«""»
'''
}
