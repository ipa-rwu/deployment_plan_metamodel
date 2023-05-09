package de.fraunhofer.ipa.deployment.generator

import com.google.common.base.CaseFormat
import de.fraunhofer.ipa.deployment.util.AbstractComputationAssignmentTarget
import de.fraunhofer.ipa.deployment.util.LinuxDistribution
import de.fraunhofer.ipa.deployment.util.UbuntuVersion
import deploymentPlan.AbstractComputationAssignment
import deploymentPlan.DeploymentPlan
import deploymentPlan.RosMiddleware
import deployPlanWithRosModel.ConfigRosSoftwareComponent
import implementationDescription.SoftwareComponent
import implementationDescription.impl.GitRepositoryTypeImpl
import java.util.ArrayList
import java.util.Arrays
import java.util.List
import javax.inject.Inject
import org.eclipse.emf.ecore.EObject
import ros.impl.PackageImpl
import implementationDescription.ImplementationDescription

class RepoInfo{
    String name
    String url
    String type
    String version
    Boolean released

    def updateInfo(String name, String type, String url, String version){
        this.name = name
        this.url = url
        this.type = type
        this.version = version
        this.released = false
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
}



class RepoInstallCompiler {
    @Inject
    extension DeploymentHelper



    def RepoInstallCompiler(DeploymentPlan plan, List<AbstractComputationAssignmentTarget> targets)'''
    repositories:
      «FOR target: targets.collectSoftwareComponents»
      «var imp = target as SoftwareComponent»
      «var repo_info = getRepoInfo(imp)»
      «createRepo(repo_info.name, repo_info.type, repo_info.url, repo_info.version)»
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
      «createRepo(repo_info.name, "git", repo_info.url, repo_info.version)»
    «ENDFOR»
    '''

    def AptInstallScriptCompiler(List<RepoInfo> repos, AbstractComputationAssignment assignment) '''
    «var rosdistro= (assignment.middleware as RosMiddleware).value.getName»
    «var os = getOSFromRosDistro(getOS(assignment).name, rosdistro)»
    «FOR repo_info : repos»
    «IF repo_info.checkIfReleased»
    «getInstallTool(os)» install ros-«rosdistro»-«CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_HYPHEN, repo_info.name)» -qq -y
    «ENDIF»
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

     def createRepo (String repoName, String type, String url, String version)
 '''
«repoName»:
  type: «type»
  url: «url»
«IF version!==null»
  version: «version»
«ENDIF»
 '''


}
