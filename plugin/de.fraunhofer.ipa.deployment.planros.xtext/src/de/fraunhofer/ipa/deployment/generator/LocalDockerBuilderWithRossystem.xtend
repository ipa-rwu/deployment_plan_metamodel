package de.fraunhofer.ipa.deployment.generator

import deployPlanWithRosModel.DeployRossystemPlan
import deployPlanWithRosModel.RossystemImplementationAssignment
import deploymentPlan.RosMiddleware
import jakarta.inject.Inject
import java.util.ArrayList

class LocalDockerBuilderWithRossystem {

  @Inject
  extension DeploymentHelperWithRosmodel

  def localDockerBuilder(DeployRossystemPlan plan, NamingHelperWithRosmodel namingHelper)'''
version: "3"

services:
  «FOR assignment : plan.realize.realizations»
  «assignment.name»:
    image: «assignment.name»_«(assignment.middleware as RosMiddleware).value.getName»:latest
    build:
      context: "./«assignment.name»/"
      dockerfile: Dockerfile
      args:
        ROS_DISTRO: «(assignment.middleware as RosMiddleware).value.getName»
        BASE_IMAGE: «chooseBaseImage(getProcessorArchitecture(assignment).getName)»:«(assignment.middleware as RosMiddleware).value.getName»-ros-core
        CMAKE_ARGS: "-DCMAKE_BUILD_TYPE=Release"
        BUILDER_SUFFIX: ":0.0.3"
        BUILDER_PREFIX: "ghcr.io/ipa-rwu/"
        «var unaccessible_repos= getUnaccessibleRepos(assignment as RossystemImplementationAssignment, namingHelper)»
        «IF unaccessible_repos.size > 0 »
        ROSINSTALL_CI_JOB_TOKEN: true
        CI_JOB_TOKEN: # Please define CI_JOB_TOKEN that can access the following repos: «unaccessible_repos.toString»
        «ENDIF»
        target: install
        SELECT_PKGS: ""
        COLCON_OPTION: ""
    stdin_open: true
    tty: true

  «ENDFOR»
 '''

  def getUnaccessibleRepos(RossystemImplementationAssignment impl_ass, NamingHelperWithRosmodel namingHelper){
  	var repo_list = namingHelper.assignmentRossystemRepoInfoMap.get(impl_ass)
  	var ArrayList<String> unaccessible_repos = new ArrayList<String>()
  	for (repo_info : repo_list){
  		if (repo_info.accessible == false){
  			unaccessible_repos.add(repo_info.url)
  		}
  	}
  	return unaccessible_repos
	}
}
