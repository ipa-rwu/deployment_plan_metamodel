package de.fraunhofer.ipa.deployment.generator

import java.util.ArrayList
import java.util.List
import java.util.Set
import java.util.HashSet
import deploymentPlan.AbstractComputationAssignment
import deploymentPlan.RosMiddleware
import javax.inject.Inject
import deployPlanWithRosModel.ConfigRosSoftwareComponent
import java.util.Map
import java.util.HashMap
import deploymentPlan.AbstractDeploymentPlan
import de.fraunhofer.ipa.deployment.generator.DeploymentHelper
import deployPlanWithRosModel.RossystemImplementationAssignment

class NamingHelper {
    String RelativeRootFolderPath = null
    String AbsoluteRootPrefix = "example/src-gen"
    String AbsoluteDefaultGithubWorkflowPath = "./.github/workflows"
    String ReuseableTestBuildWorkflowName = "test_code_build_image_workflow_reuse.yaml"
    String AbsoluteDefaultGithubReuseableWorkflowPath = String.format("%s/%s", AbsoluteDefaultGithubWorkflowPath, ReuseableTestBuildWorkflowName)
    String DefaultRegistry = "ghcr.io"
    String CyclonConfigPath
    String DockerComposePath
    String CyclonConfigFileName = "cyclonedds.xml"
    String DockerComposeFileName = "docker-compose.yaml"
      Map<AbstractComputationAssignment, List<RepoInfo>> AssignmentRossystemRepoInfoMap = new HashMap

        var deployHelper = new DeploymentHelper

        def reset(){
            this.AssignmentRossystemRepoInfoMap.clear
        }

    def setRelativePlanFolderPath(String planName){
        this.RelativeRootFolderPath = planName
    }

    def getRelativePlanFolderPath(){
        if(this.RelativeRootFolderPath !== null)
            return this.RelativeRootFolderPath
        else
            throw new RuntimeException("Didn't set RelativeRootFolderPath yet")
    }

    def getAbsolutePlanFolderPath(){
        return String.format("%s/%s", getAbsoluteRootPrefix(), getRelativePlanFolderPath())
    }

    def getAbsoluteRootPrefix(){
          return this.AbsoluteRootPrefix
    }

    def getAbsoluteDefaultGithubReuseableWorkflowPath(){
        return this.AbsoluteDefaultGithubReuseableWorkflowPath
    }

    def getDefaultRegistry(){
        return this.DefaultRegistry
    }

    def getRelativeAssignmentFolderPath(String assignmentName){
        return String.format("%s/%s", getRelativePlanFolderPath, assignmentName)
    }

    def getRelativeDockerfilePath(String assignmentName){
        return String.format("%s/Dockerfile", getRelativeAssignmentFolderPath(assignmentName))
    }

    def getAbsoluteAssignmentFolderPath(String assignmentName){
        return String.format("%s/%s", getAbsoluteRootPrefix(), getRelativeAssignmentFolderPath(assignmentName))
    }

    def getReposFile(String assignmentName, String executedBy){
        return String.format("%s/%s_%s.repos", getRelativeAssignmentFolderPath(assignmentName), assignmentName, executedBy)
    }

    def getGithubFolderPath(){
        return String.format("%s/github", getRelativePlanFolderPath)
    }

    def getGithubWorkflowPath(String planName){
        return String.format("%s/%s_workflow.yaml", getGithubFolderPath, planName)
    }

    def getGithubReuseableWorkflowPath(){
        return String.format("%s/%s", getGithubFolderPath, this.ReuseableTestBuildWorkflowName)
    }

    def getCyclonConfigPath(String executor){
        this.CyclonConfigPath = String.format("%s/%s/%s", getRelativePlanFolderPath, executor, this.CyclonConfigFileName)
        return this.CyclonConfigPath
    }

    def getDockerComposePath(String executor){
        this.DockerComposePath = String.format("%s/%s/%s", getRelativePlanFolderPath, executor, this.DockerComposeFileName)
        return this.DockerComposePath
    }

    def getCyclonConfigFileName(){
        return this.CyclonConfigFileName
    }

    def getDockerComposeFileName(){
        return this.DockerComposeFileName
    }

    def setAssignmentRossystemRepoInfoMap(AbstractDeploymentPlan plan){
        for (assignment : plan.realize.realizations){
            var rosdistro= (assignment.middleware as RosMiddleware).value.getName
          var os = deployHelper.getOSFromRosDistro(deployHelper.getOS(assignment).name, rosdistro)
          var List<RepoInfo> RossystemRepoInfosPerAssignment =  new ArrayList
          if(assignment instanceof RossystemImplementationAssignment){
          for(sys: assignment.softwareComponents.map[it as ConfigRosSoftwareComponent].map[component]){
              var repos = deployHelper.getRepoinfosFromRossystem(sys, os, rosdistro)
              RossystemRepoInfosPerAssignment.addAll(repos)
              }
              this.AssignmentRossystemRepoInfoMap.put(assignment, RossystemRepoInfosPerAssignment)
          }

        }
    }

    def getAssignmentRossystemRepoInfoMap(){
        return this.AssignmentRossystemRepoInfoMap
    }
}

class AnsibleNamingHelper extends NamingHelper {
    String ConfigFile = "ansible.cfg"
    String ConfigFilePath
    String AnsibleFolerName = "ansible"
    String RelativeAnsibleFolderPath
    String InventoryFileName = "inventory.yaml"
    String InventoryFilePath
    String PlaybookName = "playbook.yaml"
    String PlaybookFilePath
    String DestDeployFolderPath
    String AppicationRoleName = "deploy_software"
    String RoleFolderName = "roles"
    String RoleFolderPath
    String TaskCommonFolderName = "common/tasks"
    String TaskCommonFolderPath
    String TaskInstallDockerFileName = "install_docker.yaml"
    String TaskInstallDockerFilePath
    String TaskDeploySoftwareFolderName = "deploy_software/tasks"
    String TaskDeploySoftwareFolderPath
    String TaskMainFilePath
        String TaskCheckSudoFileName = "check_become_permission.yaml"
        String TaskCheckSudoFilePath
        String GitignoreName = ".gitignore"
        String GitignoreFilePath


    def setRelativeAnsibleFolderPath(String planName){
        this.relativePlanFolderPath = planName
        this.RelativeAnsibleFolderPath = String.format("%s/%s", this.relativePlanFolderPath, this.AnsibleFolerName)
    }

  def getRelativeAnsibleFolderPath(){
    if(this.RelativeAnsibleFolderPath !== null)
        return this.RelativeAnsibleFolderPath
    else
        throw new RuntimeException("Didn't set RelativeAnsibleFolderPath yet")
    }

    def getConfigFilePath(){
        this.ConfigFilePath = String.format("%s/%s", this.RelativeAnsibleFolderPath, this.ConfigFile)
        return this.ConfigFilePath
    }

    def getInventoryFilePath(){
        this.InventoryFilePath = String.format("%s/%s", this.RelativeAnsibleFolderPath, this.InventoryFileName)
        return this.InventoryFilePath
    }


    def getPlaybookFilePath(){
        this.PlaybookFilePath = String.format("%s/%s", this.RelativeAnsibleFolderPath, this.PlaybookName)
     return this.PlaybookFilePath
    }
    def setDestDeployFolderPath(String userName, String planName){
        this.DestDeployFolderPath = String.format("home/%s/AutoDeployment/%s", userName, planName)
    }

    def getDestDeployFolderPath(){
    if(this.DestDeployFolderPath !== null)
       return this.DestDeployFolderPath
    else
       throw new RuntimeException("Didn't set DestDeployFolderPath yet")
    }

    def getAppicationRoleName(){
        return this.AppicationRoleName
        }

    def getTaskInstallDockerFileName(){
        return this.TaskInstallDockerFileName
        }

    def getRoleFolderPath(){
        this.RoleFolderPath = String.format("%s/%s", this.RelativeAnsibleFolderPath, this.RoleFolderName)
        return this.RoleFolderPath
    }

    def getTaskCommonFolderPath(){
        if(this.RoleFolderPath === null){
            getRoleFolderPath()
        }
        this.TaskCommonFolderPath = String.format("%s/%s", this.RoleFolderPath, this.TaskCommonFolderName)
        return this.TaskCommonFolderPath
    }

    def getTaskInstallDockerFilePath(){
        this.TaskInstallDockerFilePath = String.format("%s/%s", this.TaskCommonFolderPath, this.TaskInstallDockerFileName)
        return this.TaskInstallDockerFilePath
    }

    def getTaskMainFilePath(String roleTaskFolder){
        this.TaskMainFilePath = String.format("%s/main.yaml", roleTaskFolder)
        return this.TaskMainFilePath
    }

    def getTaskDeploySoftwareFolderPath(){
        if(this.RoleFolderPath === null){
            getRoleFolderPath()
        }
        this.TaskDeploySoftwareFolderPath = String.format("%s/%s", this.RoleFolderPath, this.TaskDeploySoftwareFolderName)
        return this.TaskDeploySoftwareFolderPath
    }

    def getTaskCheckSudoFileName(){
        return this.TaskCheckSudoFileName
    }

    def getTaskCheckSudoFilePath(){
        if(this.TaskCommonFolderPath === null){
            getTaskCommonFolderPath()
        }
        this.TaskCheckSudoFilePath = String.format("%s/%s", this.TaskCommonFolderPath, this.TaskCheckSudoFileName)
        return this.TaskCheckSudoFilePath
    }

    def getGitignoreName(){
        return this.GitignoreName
    }

    def getGitignorePath(){
        this.GitignoreFilePath = String.format("%s/%s", this.RelativeAnsibleFolderPath, this.GitignoreName)
        return this.GitignoreFilePath
    }
}

class DocumentNamingHelper extends NamingHelper {
    String DocumentFolderName = "doc"
    String RelativeDocumentFolderPath
    String AnsibleDocumentName = "ansible_setup.rst"
    String AnsibleDocumentPath
    String SourceFolderPath
    String ConfPyPath
    String MakeBatPath
    String MakefilePath
    String MainIndexPath
    String TemplateFolderPath
    String StaticFolderPath
    String TargetEnvConfigFileName = "tavEnv_config.rst"
    String TargetEnvConfigFilePath
    Set<String> DocFiles = new HashSet
    String LocalBuildScriptPath
    String OverviewFilePath
    String OverviewFileName = "overview.rst"


  def setRelativeDocumentFolderPath(String planName){
        this.relativePlanFolderPath = planName
        this.RelativeDocumentFolderPath = String.format("%s/%s", this.relativePlanFolderPath, this.DocumentFolderName)
    }

  def getRelativeDocumentFolderPath(){
    if(this.RelativeDocumentFolderPath !== null)
        return this.RelativeDocumentFolderPath
    else
        throw new RuntimeException("Didn't set RelativeDocumentFolderPath yet")
    }

  def getSourceFolderPath(){
      this.SourceFolderPath = String.format("%s/source", this.getRelativeDocumentFolderPath)
      return this.SourceFolderPath
  }

  def getConfPyPath(){
      this.ConfPyPath = String.format("%s/conf.py", this.getSourceFolderPath)
      return this.ConfPyPath
  }

    def getAnsibleDocumentName() {
        return this.AnsibleDocumentName
    }

  def getAnsibleDocumentPath(){
      this.AnsibleDocumentPath = String.format("%s/%s", this.getSourceFolderPath, this.AnsibleDocumentName)
      return this.AnsibleDocumentPath
  }

  def getMakeBatPath(){
      this.MakeBatPath = String.format("%s/make.bat", this.RelativeDocumentFolderPath)
      return this.MakeBatPath
  }

  def getMakefilePath(){
      this.MakefilePath = String.format("%s/Makefile", this.RelativeDocumentFolderPath)
      return this.MakefilePath
  }

  def getMainIndexPath(){
      this.MainIndexPath = String.format("%s/index.rst", this.getSourceFolderPath)
      return this.MainIndexPath
  }

  def getTemplateFolderPath(){
      this.TemplateFolderPath = String.format("%s/_templates", this.getSourceFolderPath)
      return this.TemplateFolderPath
  }

  def getStaticFolderPath(){
      this.StaticFolderPath = String.format("%s/_static", this.getSourceFolderPath)
      return this.StaticFolderPath
  }

  def getTargetEnvConfigFileName(){
      return this.TargetEnvConfigFileName
  }

  def getTargetEnvConfigFilePath(){
      this.TargetEnvConfigFilePath = String.format("%s/%s", this.getSourceFolderPath, this.TargetEnvConfigFileName)
      return this.TargetEnvConfigFilePath
  }

  def getDocFiles(){
    this.DocFiles.add(this.AnsibleDocumentName)
        this.DocFiles.add(this.TargetEnvConfigFileName)
        this.DocFiles.add(this.OverviewFileName)
    return this.DocFiles
  }

  def getLocalBuildScriptPath(){
      this.LocalBuildScriptPath = String.format("%s/latex_command.sh", this.RelativeDocumentFolderPath)
      return this.LocalBuildScriptPath
  }

    def getOverviewFilePath() {
        this.OverviewFilePath = String.format("%s/%s", this.getSourceFolderPath, this.OverviewFileName)
        return this.OverviewFilePath
    }

    def getOverviewFileName() {
        return this.OverviewFileName
    }

}
