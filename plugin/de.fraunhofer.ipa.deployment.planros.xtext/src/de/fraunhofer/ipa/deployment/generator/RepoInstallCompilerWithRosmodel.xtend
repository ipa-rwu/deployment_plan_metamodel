package de.fraunhofer.ipa.deployment.generator

import deployPlanWithRosModel.RossystemImplementationAssignment

class RepoInstallCompilerWithRosmodel extends RepoInstallCompiler{

def RepoInstallCompiler(RossystemImplementationAssignment assignment, NamingHelperWithRosmodel namingHelper)'''
repositories:
  «FOR repo_info: namingHelper.assignmentRossystemRepoInfoMap.get(assignment)»
  «createRepo(repo_info.name, repo_info.type, repo_info.url, repo_info.version)»
«ENDFOR»
'''

}
