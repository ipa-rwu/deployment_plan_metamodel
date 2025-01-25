package de.fraunhofer.ipa.deployment.toolbar.handlers;

import deployPlanWithRosModel.DeployPlanWithRosModelFactory;
import deployPlanWithRosModel.DeployRossystemPlan;
import system.RossystemFactory;
import targetEnvironment.TargetDeployEnviroment;
import targetEnvironment.TargetEnvironmentFactory;

public class CreateExampleModel {
  public static  DeployRossystemPlan createPlanModel(String projectName) {
     // Create the Planros object
     DeployRossystemPlan rosplan = DeployPlanWithRosModelFactory.eINSTANCE.createDeployRossystemPlan();
     rosplan.setName(projectName); // Set the name of the machine
//     system.System rossystem = RossystemFactory.eINSTANCE.createSystem();
//     rossystem.setName("TODO");
//     rosplan.setTargetRossystem(rossystem);
     return rosplan;
  }

  public static  TargetDeployEnviroment createTarEnvModel(String projectName) {
       // Create the tarenv object
       TargetDeployEnviroment tarenv = TargetEnvironmentFactory.eINSTANCE.createTargetDeployEnviroment();
       tarenv.setName(projectName); // Set the name of the machine
       return tarenv;
    }
}
