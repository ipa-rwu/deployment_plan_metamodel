package de.fraunhofer.ipa.deployment.generator

import deployPlanWithRosModel.ConfigRosSoftwareComponent
import deployPlanWithRosModel.RossystemImplementationAssignment
import deploymentPlan.AbstractDeploymentPlan
import deploymentPlan.RosMiddleware
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map

class NamingHelperWithRosmodel {

    NamingHelper origionNamingHelper = new NamingHelper

    Map<RossystemImplementationAssignment, List<RepoInfo>> AssignmentRossystemRepoInfoMap = new HashMap

    def setOrigionNamingHelper(NamingHelper nameHelper){
      this.origionNamingHelper = nameHelper
    }

    def getOrigionNamingHelper(){
      return this.origionNamingHelper
    }

    def reset(){
      this.AssignmentRossystemRepoInfoMap.clear
    }

    def getAssignmentRossystemRepoInfoMap(){
        return this.AssignmentRossystemRepoInfoMap
    }

    var deployHelper = new DeploymentHelper
    var extendedDeployHelper = new DeploymentHelperWithRosmodel

    def setAssignmentRossystemRepoInfoMap(AbstractDeploymentPlan plan){
        for (assignment : plan.realize.realizations){
          var rosdistro= (assignment.middleware as RosMiddleware).value.getName
          var os = deployHelper.getOSFromRosDistro(deployHelper.getOS(assignment).name, rosdistro)
          var List<RepoInfo> RossystemRepoInfosPerAssignment =  new ArrayList
          if(assignment instanceof RossystemImplementationAssignment){
          for(sys: assignment.softwareComponents.map[it as ConfigRosSoftwareComponent].map[component]){
              // from launch file also define repo
              var repos = extendedDeployHelper.getRepoinfosFromRossystemIncludeLaunchFile(sys, os, rosdistro)
              RossystemRepoInfosPerAssignment.addAll(repos)
            }
            this.AssignmentRossystemRepoInfoMap.put(assignment, RossystemRepoInfosPerAssignment)
//            RossystemRepoInfosPerAssignment.stream.forEach[System.out.printf("Finial results: %s", it.print)]
          }

        }

    }
}
