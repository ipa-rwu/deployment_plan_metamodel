package de.fraunhofer.ipa.deployment.generator

import deployPlanWithRosModel.ConfigRosSoftwareComponent
import deployPlanWithRosModel.RossystemImplementationAssignment
import deploymentPlan.AbstractDeploymentPlan
import deploymentPlan.RosMiddleware
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import system.SubSystem
import system.RosNode
import java.util.LinkedHashSet

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
          var pkginfo_set = new LinkedHashSet<PkgInfo>
          for(ros_component: assignment.softwareComponents.map[it as ConfigRosSoftwareComponent].map[component]){
              // from launch file also define repo
              if(ros_component instanceof SubSystem){
                pkginfo_set.addAll(extendedDeployHelper.getPkgInfoFromSystemNodesandLaunch((ros_component as SubSystem).system))
              }
              else if(ros_component instanceof RosNode){
                pkginfo_set.add(extendedDeployHelper.getPkgInfoFromPkgImpl(extendedDeployHelper.getPacakgeFromRosNode((ros_component as RosNode))))
                }
           }

          RossystemRepoInfosPerAssignment.addAll(extendedDeployHelper.getRepoinfosFromPkgInfoList(pkginfo_set, os, rosdistro))
          this.AssignmentRossystemRepoInfoMap.put(assignment, RossystemRepoInfosPerAssignment)
//            RossystemRepoInfosPerAssignment.stream.forEach[System.out.printf("Finial results: %s", it.print)]
          }

        }

    }
}
