package de.fraunhofer.ipa.deplyoment.generator

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
    «FOR target: targets»
    «var imp = target as SoftwareComponent»
    «createRepo(getRepoNameFromUrl(imp.repository.url), getRepostioryTypeName(imp.repository.type), imp.repository.url, imp.repository.version)»
    «ENDFOR»
    '''

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

    def collectRepoFromRossystem(AbstractComputationAssignment assignment){
        var List<RepoInfo> repos =  new ArrayList
        var rosdistro= (assignment.middleware as RosMiddleware).value.getName
        var os = getOSFromRosDistro(getOS(assignment).name, rosdistro)
        for(sys: assignment.softwareComponents.map[it as ConfigRosSoftwareComponent].map[component]){
            var pkgLists = getRosPackagesFromSystemWithoutDuplicate(sys)
            var repoInfos = getReleaseInfo(pkgLists.map[name].toList, rosdistro)
            for(pkg: pkgLists){
                if (pkg.fromGitRepo!==null){
                    var repo_info = getRepoInfo(pkg.fromGitRepo)
                    if(repo_info!==null){
//                      check if Package already released
                        if(!checkIfPackageRelease(pkg.name, rosdistro, os.name, os.version).booleanResult){
                            repos.add(repo_info)
                        }
//                      check if repo info defined in .ros matches released info
                        else if(!compareWithRelease(repoInfos, pkg)){
                                repos.add(repo_info)
                            }
                            else{
                                repo_info.released = pkg.name
                                repos.add(repo_info)
                            }
                    }
                    else{
                        repo_info.released = pkg.name
                        repos.add(repo_info)
                    }
                }
            }
        }
        return repos
    }


    def test_calss(DeploymentPlan plan, List<AbstractComputationAssignmentTarget> targets)'''
        repositories:
        «FOR target: targets»
        «var imp = target as SoftwareComponent»
        «ENDFOR»
        '''

    def getRepostioryTypeName(EObject repoType){
        if(repoType instanceof GitRepositoryTypeImpl){
            return "git"
        }
    }

    def getRepoNameFromUrl(String url){
        return url.substring(url.lastIndexOf("/") + 1).replace(".git","")
        }

    def getRepoInfo(String repo){
        val repo_info = new RepoInfo

        if(repo.indexOf(":", repo.indexOf(":") + 1) > 1) {
            val url = repo.substring(0,repo.lastIndexOf(':'))
            repo_info.updateInfo(url.substring(url.lastIndexOf("/") + 1).replace(".git",""), 'git', url.replace(".git",""), repo.substring(repo.lastIndexOf(':')+ 1))
        }
        else {
            repo_info.updateInfo(repo.substring(repo.lastIndexOf("/") + 1).replace(".git",""), 'git', repo.replace(".git",""), null)
        }
        return repo_info
    }

     def createRepo (String repoName, String type, String url, String version)
 '''
 «"  "»«repoName»:
 «"    "»type: «type»
 «"    "»url: «url»
«IF version!==null»
 «"    "»version: «version»
«ENDIF»
 '''

    def checkIfPackageRelease(String packName, String rosdistro, String osName, String osVersion){
        var Runtime rt = Runtime.getRuntime()
        var String[] commands = #["rosdep", "resolve", packName, "--rosdistro", rosdistro, String.format("--os=%s:%s", osName, osVersion)]
        return runSubprocess(commands)
        }

    def getReleaseInfo(String[] packNames, String rosdistro) {
        var List<String> commands = new ArrayList<String>(Arrays.asList("dhelp", "repo", "-pkg"))
        commands.addAll(packNames)
        commands.addAll(#["-d", rosdistro])
        var List<RepoInfo> repo_infos = new ArrayList
        for(res: runSubprocess(commands, true).output){
            var temp = res.split(" ")
            System.out.println(String.format("result from runSubprocess: %s", temp.toList.toString))
            val repo_info = new RepoInfo
            var url = temp.get(1)
            repo_info.updateInfo(temp.get(0), 'git', url.replace(".git",""), temp.get(2))
            repo_infos.add(repo_info)
        }
        return repo_infos
    }

    def compareWithRelease(List<RepoInfo> repoInfos, PackageImpl pkg){
        var same = false
        var pkgRepoInfo = getRepoInfo(pkg.fromGitRepo)
        for(repoInfo: repoInfos){
            if(repoInfo.name == pkg.name){
                if(repoInfo.url == pkgRepoInfo.url){
                    if(pkgRepoInfo.version === null || repoInfo.version == pkgRepoInfo.version){
                        same = true
                        return same
                    }
                }

            }
        }
        return same
    }
}
