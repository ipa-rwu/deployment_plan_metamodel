package de.fraunhofer.ipa.deployment.generator

import java.util.HashSet
import java.util.Set

class NamingHelper {
    String RelativeRootFolderPath = null
    String AbsoluteRootPrefix = "src-gen"
    String AbsoluteDefaultGithubWorkflowPath = "./.github/workflows"
    String DefaultGitlabTemplateFolderPath = "ci/gitlab_templates"
    String GitlabRuleTemplate = "RULES.yml"
    String GitlabJobTemplate = "JOB_TEMPLATE.yml"
    String GitlabCI = "gitlab-ci.yml"
    String ReuseableTestBuildWorkflowName = "test_code_build_image_workflow_reuse.yaml"
    String AbsoluteDefaultGithubReuseableWorkflowPath = String.format("%s/%s", AbsoluteDefaultGithubWorkflowPath, ReuseableTestBuildWorkflowName)
    String DefaultRegistry = "ghcr.io"
    String CyclonConfigPath
    String DockerComposePath
    String CyclonConfigFileName = "cyclonedds.xml"
    String DockerComposeFileName = "docker-compose.yaml"
    String RelativeGitLabFolderPath = null
    String AbsoluteRootGitLabFolderPath= null


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

    def getAptInstallFile(String assignmentName){
        return String.format("%s.sh", assignmentName)
    }

    def getAptInstallFilePath(String assignmentName){
        return String.format("%s/%s", getRelativeAssignmentFolderPath(assignmentName), getAptInstallFile(assignmentName))
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

    def getRelativeGitLabFolderPath(){
      this.RelativeGitLabFolderPath = String.format("%s/gitlab", getRelativePlanFolderPath)
      return this.RelativeGitLabFolderPath
    }

    def getGitlabRuleTemplatePath(){
      return String.format("%s/%s/%s", getRelativeGitLabFolderPath, this.DefaultGitlabTemplateFolderPath, this.GitlabRuleTemplate)
    }

    def getGitlabJobTemplatePath(){
      return String.format("%s/%s/%s", getRelativeGitLabFolderPath, this.DefaultGitlabTemplateFolderPath, this.GitlabJobTemplate)
    }

    def getGitlabCI(){
      return String.format("%s/%s", getRelativeGitLabFolderPath, this.GitlabCI)
    }

    def getAbsoluteRootGitLabFolderPath(){
      if(this.RelativeGitLabFolderPath === null){
        getRelativeGitLabFolderPath()
      }
      this.AbsoluteRootGitLabFolderPath = String.format("%s/%s", this.AbsoluteRootPrefix, this.RelativeGitLabFolderPath)
      return this.AbsoluteRootGitLabFolderPath
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
    String AppicationRoleName = "start_application"
    String RoleFolderName = "roles"
    String RoleFolderPath
    String TaskCommonFolderName = "common/tasks"
    String TaskCommonFolderPath
    String TaskInstallDockerFileName = "install_docker.yaml"
    String TaskInstallDockerFilePath
    String taskDeployFilesFolderName = "deploy_files/tasks"
    String taskDeployFilesFolderPath
    String TaskMainFilePath
    String TaskCheckSudoFileName = "check_become_permission.yaml"
    String TaskCheckSudoFilePath
    String GitignoreName = ".gitignore"
    String GitignoreFilePath
    String taskStartApplicationFolderName = "start_application/tasks"
    String taskStartApplicationFolderPath
    String taskStartComponentFolderPath
    String taskStartComponentFolderName = "start_components/tasks"
    String PlaybookDeployFilesName = "playbook_deploy_files.yaml"
    String playbookDeployFilesFilePath
    String PlaybookStartComponentsFileName = "playbook_start_components.yaml"
    String playbookStartComponentsFilePath

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

    def getPlaybookDeployFilesPath(){
        this.playbookDeployFilesFilePath = String.format("%s/%s", this.RelativeAnsibleFolderPath, this.PlaybookDeployFilesName)
     return this.playbookDeployFilesFilePath
    }

    def getPlaybookStartComponentsFilePath(){
        this.playbookStartComponentsFilePath = String.format("%s/%s", this.RelativeAnsibleFolderPath, this.PlaybookStartComponentsFileName)
     return this.playbookStartComponentsFilePath
    }


    def setDestDeployFolderPath(String userName, String planName){
        this.DestDeployFolderPath = String.format("/home/%s/AutoDeployment/%s", userName, planName)
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

    def gettaskDeployFilesFolderPath(){
        if(this.RoleFolderPath === null){
            getRoleFolderPath()
        }
        this.taskDeployFilesFolderPath = String.format("%s/%s", this.RoleFolderPath, this.taskDeployFilesFolderName)
        return this.taskDeployFilesFolderPath
    }

    def getTaskStartApplicationFolderPath(){
        if(this.RoleFolderPath === null){
            getRoleFolderPath()
        }
        this.taskStartApplicationFolderPath = String.format("%s/%s", this.RoleFolderPath, this.taskStartApplicationFolderName)
        return this.taskStartApplicationFolderPath
    }

    def getTaskStartComponentFolderPath(){
        if(this.RoleFolderPath === null){
            getRoleFolderPath()
        }
        this.taskStartComponentFolderPath = String.format("%s/%s", this.RoleFolderPath, this.taskStartComponentFolderName)
        return this.taskStartComponentFolderPath
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
