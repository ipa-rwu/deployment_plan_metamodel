package de.fraunhofer.ipa.deployment.generator

import jakarta.inject.Inject
import deploymentPlan.AbstractDeploymentPlan
import deploymentPlan.RosMiddleware
import deploymentPlan.ImplementationAssignment
import java.util.stream.Collectors
import implementationDescription.SoftwareComponent
import java.util.ArrayList

class LocalDockerBuilder {

  @Inject
  extension DeploymentHelper

  def localDockerBuilder(AbstractDeploymentPlan plan, NamingHelper namingHelper)'''
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
        «var unaccessible_repos= getUnaccessibleRepos(assignment as ImplementationAssignment)»
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

  def getUnaccessibleRepos(ImplementationAssignment impl_ass){
    var comps = collectSoftwareComponents(impl_ass.softwareComponents.stream.map[component].collect(Collectors.toList))
    var ArrayList<String> unaccessible_repos = new ArrayList<String>()
    for (comp : comps){
      var repo_info = getRepoInfo(comp as SoftwareComponent)
      if (repo_info.accessible == false){
        unaccessible_repos.add(repo_info.url)
      }
    }
    return unaccessible_repos
  }
}
