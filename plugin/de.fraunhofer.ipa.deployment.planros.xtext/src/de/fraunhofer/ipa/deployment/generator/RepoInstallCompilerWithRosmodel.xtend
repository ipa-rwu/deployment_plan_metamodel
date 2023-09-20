package de.fraunhofer.ipa.deployment.generator

import deployPlanWithRosModel.RossystemImplementationAssignment
import deploymentPlan.RosMiddleware
import javax.inject.Inject

class RepoInstallCompilerWithRosmodel extends RepoInstallCompiler{

@Inject
extension DeploymentHelper

def RepoInstallCompiler(RossystemImplementationAssignment assignment, NamingHelperWithRosmodel namingHelper)'''
repositories:
  «FOR repo_info: namingHelper.assignmentRossystemRepoInfoMap.get(assignment).filter[it.checkIfReleased == false]»
  «createRepo(repo_info.name, repo_info.type, repo_info.url, repo_info.version, repo_info.accessible)»
  «ENDFOR»
'''

def AptInstallCompiler(RossystemImplementationAssignment assignment, NamingHelperWithRosmodel namingHelper)'''
#!/bin/bash
«var rosdistro= (assignment.middleware as RosMiddleware).value.getName»
«var os = getOSFromRosDistro(getOS(assignment).name, rosdistro)»
«AptInstallScriptCompiler(namingHelper.assignmentRossystemRepoInfoMap.get(assignment).filter[it.checkIfReleased == true].toList,
  rosdistro, os)»
«""»
'''
}
