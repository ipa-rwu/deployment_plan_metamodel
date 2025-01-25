package de.fraunhofer.ipa.deployment.toolbar.utils

import deployPlanWithRosModel.DeployRossystemPlan

class PlanRosModelTemplate {
  def createPlanrosSkeleton(DeployRossystemPlan plan)'''
DeploymentPlanWithRos:
  name: «plan.name»
  targetRossystem: "TODO: reference to a rossystem"
  deployTo: "TODO: reference to a target environment"
  assignment:
    - name: "TODO: name for this assignment, will use it as docker image name"
      executedBy: "TODO: reference to a computaion device in this target environment"
      version: "TODO: version in string"
      middleware: "TODO: ROS version"
      softwareComponents:
        - "TODO: reference to a rossystem or component on this rossystem":
      runtimeType:
        type: container
        registry: "TODO: registry for releasing docker image"
«""»
'''
}
