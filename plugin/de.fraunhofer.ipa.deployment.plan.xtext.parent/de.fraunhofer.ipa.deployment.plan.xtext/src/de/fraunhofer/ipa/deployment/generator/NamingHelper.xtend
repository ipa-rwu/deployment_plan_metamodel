package de.fraunhofer.ipa.deployment.generator

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
}

class AnsibleNamingHelper extends NamingHelper {
    String ConfigFile = "ansible.cfg"
    String ConfigFilePath
    String AnsibleFolerName = "ansible"
    String RelativeAnsibleFolerPath
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


    def setRelativeAnsibleFolerPath(String planName){
        this.relativePlanFolderPath = planName
        this.RelativeAnsibleFolerPath = String.format("%s/%s", this.relativePlanFolderPath, this.AnsibleFolerName)
    }

  def getRelativeAnsibleFolerPath(){
    if(this.RelativeAnsibleFolerPath !== null)
        return this.RelativeAnsibleFolerPath
    else
        throw new RuntimeException("Didn't set RelativeAnsibleFolerPath yet")
    }

    def getConfigFilePath(){
        this.ConfigFilePath = String.format("%s/%s", this.RelativeAnsibleFolerPath, this.ConfigFile)
        return this.ConfigFilePath
    }

    def getInventoryFilePath(){
        this.InventoryFilePath = String.format("%s/%s", this.RelativeAnsibleFolerPath, this.InventoryFileName)
        return this.InventoryFilePath
    }


    def getPlaybookFilePath(){
        this.PlaybookFilePath = String.format("%s/%s", this.RelativeAnsibleFolerPath, this.PlaybookName)
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
        this.RoleFolderPath = String.format("%s/%s", this.RelativeAnsibleFolerPath, this.RoleFolderName)
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
}
