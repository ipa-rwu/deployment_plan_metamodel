package de.fraunhofer.ipa.deployment.generator

import de.fraunhofer.ipa.deployment.utils.PlanWithRosmodelUtils
import deployPlanWithRosModel.ConfigRosSoftwareComponent
import deployPlanWithRosModel.RossystemImplementationAssignment
import deploymentPlan.AbstractDeploymentPlan
import deploymentPlan.RosMiddleware
import jakarta.inject.Inject
import java.util.ArrayList
import java.util.HashMap
import java.util.LinkedHashSet
import java.util.List
import java.util.Map
import system.RosNode
import system.System

class NamingHelperWithRosmodel {

    @Inject
     PlanWithRosmodelUtils _utils = new PlanWithRosmodelUtils

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
            var List<System> all_include_systems = new ArrayList;
            if(ros_component instanceof System) {
              _utils.getAllSystem(ros_component as System, all_include_systems);
              // from launch file also define repo
              for (sys: all_include_systems){
                pkginfo_set.addAll(extendedDeployHelper.getPkgInfoFromSystemNodesandLaunch(sys))
                var List<RosNode> all_include_nodes = new ArrayList
                _utils.getAllNodesFromSystem(sys, all_include_nodes);
                for(rosnode: all_include_nodes){
                  pkginfo_set.add(extendedDeployHelper.getPkgInfoFromPkgImpl(extendedDeployHelper.getPacakgeFromRosNode(rosnode)))
                }
              }
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
