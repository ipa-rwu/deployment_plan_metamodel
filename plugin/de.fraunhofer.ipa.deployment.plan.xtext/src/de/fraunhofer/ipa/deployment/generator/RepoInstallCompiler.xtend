package de.fraunhofer.ipa.deployment.generator

import com.google.common.base.CaseFormat
import de.fraunhofer.ipa.deployment.util.AbstractComputationAssignmentTarget
import de.fraunhofer.ipa.deployment.util.LinuxDistribution
import de.fraunhofer.ipa.deployment.util.UbuntuVersion
import deploymentPlan.DeploymentPlan
import implementationDescription.ImplementationDescription
import implementationDescription.SoftwareComponent
import jakarta.inject.Inject
import java.util.ArrayList
import java.util.List

class RepoInfo{
    String name
    String url
    String type
    String version
    Boolean released
    Boolean accessible

    def updateInfo(String name, String type, String url, String version, Boolean released, Boolean accessible){
        this.name = name
        this.url = url
        this.type = type
        this.version = version
        this.released = released
        this.accessible = accessible
    }

    def updateInfo(String name, String type, String url, String version, Boolean released){
        this.name = name
        this.url = url
        this.type = type
        this.version = version
        this.released = released
        this.accessible = false
    }

    def updateInfo(String name, String type, String url, String version){
        this.name = name
        this.url = url
        this.type = type
        this.version = version
        this.released = false
        this.accessible = false
    }

    def getName(){
        return this.name
    }

    def getUrl(){
        return this.url
    }

    def getType(){
        return this.type
    }

    def getVersion(){
        return this.version
    }

    def checkIfReleased(){
        return this.released
    }

    def setReleased(String name){
        this.released = true
        this.name = name
    }

    def getAccessible(){
      return this.accessible
    }

    def setAccessible(Boolean accessible){
      this.accessible = accessible
    }

    def print(){
      return String.format("RepoInfo: name: %s, url: %s, version: %s, released: %b, accessible: %b",
        this.name, this.url, version, released, accessible)
    }
}



class RepoInstallCompiler {
    @Inject
    extension DeploymentHelper



    def RepoInstallCompiler(DeploymentPlan plan, List<AbstractComputationAssignmentTarget> targets)'''
repositories:
«FOR target: targets.collectSoftwareComponents»
«var imp = target as SoftwareComponent»
«var repo_info = getRepoInfo(imp)»
  «createRepo(repo_info.name, repo_info.type, repo_info.url, repo_info.version, repo_info.accessible)»
«ENDFOR»
'''

    def collectSoftwareComponents(List<AbstractComputationAssignmentTarget> targets){
        var List<SoftwareComponent> all = new ArrayList
        for(target: targets){
            if(target instanceof ImplementationDescription){
            all.addAll((target as ImplementationDescription).includeSoftwareComponents)
            }else if(target instanceof SoftwareComponent){
                all.add(target as SoftwareComponent)
            }
        }
        return all
    }

    def RepoInstallCompiler(List<RepoInfo> repos) '''
    «var newRepos = repos.filter[it.checkIfReleased==false]»
    repositories:
      «FOR repo_info : newRepos»
      «createRepo(repo_info.name, "git", repo_info.url, repo_info.version, repo_info.accessible)»
    «ENDFOR»
    '''

    def AptInstallScriptCompiler(List<RepoInfo> repos, String rosdistro, OSInfo os) '''
    «FOR repo_info : repos»
    «getInstallTool(os)» install ros-«rosdistro»-«CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_HYPHEN, repo_info.name)» --no-install-recommends -qq -y
    «ENDFOR»
    '''

    def getInstallTool(OSInfo os){
        if(os.name == LinuxDistribution.UBUNTU.getName){
            if(os.version == UbuntuVersion.JAMMY.getName){
                return "apt"
            }
            else if(os.version == UbuntuVersion.FOCAL.getName){
                return "apt-get"
            }
        }
    }

    def test_calss(DeploymentPlan plan, List<AbstractComputationAssignmentTarget> targets)'''
        repositories:
        «FOR target: targets»
        «var imp = target as SoftwareComponent»
        «ENDFOR»
        '''

     def createRepo (String repoName, String type, String url, String version, Boolean accessible)'''
«repoName»:
  type: «type»
  «IF !accessible && url.contains("gitlab")»
  url: https://gitlab-ci-token:${CI_JOB_TOKEN}@«url.replace("https://", "")»
  «ELSE»
  url: «url»
  «ENDIF»
  «IF version!==null»
  version: «version»

«ENDIF»
 '''


}
