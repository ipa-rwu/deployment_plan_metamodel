package de.fraunhofer.ipa.deployment.toolbar.utils;

public class LibraryInfo {
    private String gitUrl;
    private String projectName;

    public LibraryInfo(String gitUrl, String projectName) {
        this.gitUrl = gitUrl;
        this.projectName = projectName;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public String getProjectName() {
        return projectName;
    }
}
