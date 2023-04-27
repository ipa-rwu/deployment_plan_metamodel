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
        this.CyclonConfigPath = String.format("%s/%s/cyclonedds.xml", getRelativePlanFolderPath, executor)
        return this.CyclonConfigPath
    }

    def getDockerComposePath(String executor){
        this.DockerComposePath = String.format("%s/%s/docker-compose.yaml", getRelativePlanFolderPath, executor)
        return this.DockerComposePath
    }
}
