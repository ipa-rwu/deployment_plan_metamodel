package de.fraunhofer.ipa.deployment.toolbar.utils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.transport.CredentialsProvider;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import org.eclipse.swt.SWT;
import org.eclipse.ui.dialogs.IOverwriteQuery;
import org.eclipse.ui.wizards.datatransfer.FileSystemStructureProvider;
import org.eclipse.ui.wizards.datatransfer.ImportOperation;

public class HelperFunctions {

  public String getFilePtah(String f) {
    String path = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString() + "/" + f;
    return path;
  }

  public boolean CheckFolderExist(String folder_name) {
        String folder_path = getFilePtah(folder_name);
        IProject target = ResourcesPlugin.getWorkspace().getRoot().getProject(folder_name); // Corrected the usage of project name
        File folder = new File(folder_path); // Check for folder or file existence

        System.out.printf("Check folder path: %s \n", folder_path);

        // Check if the project exists
        if (folder.exists() || target.exists()) {
            System.out.printf("%s is already imported\n", folder_name);

            // Prompt the user for decision using the UserChoiceHelper
            boolean choice = UserChoiceHelper.WaitForUserChoice(folder_name);
            if (choice) { // User selected "OK"
                try {
                    IProgressMonitor delete_monitor = new NullProgressMonitor();
                    target.delete(true, true, delete_monitor); // Delete the project
                    FileUtils.deleteDirectory(new File(folder_path)); // Delete the folder
                    System.out.printf("Deleted %s\n", folder_name);
                    return false;
                } catch (CoreException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else { // User selected "Cancel"
                return true;
            }
        }
        return false; // Return false if the folder doesn't exist or after cancellation
    }

  private String getProjectNameFromUrl(String repoUrl) {
        // Assuming the URL is in the format "https://github.com/user/repo.git"
        // Extract the repository name from the URL
        String[] parts = repoUrl.split("/");
        String lastPart = parts[parts.length - 1];
        // Remove the ".git" suffix if it exists
        return lastPart.endsWith(".git") ? lastPart.substring(0, lastPart.length() - 4) : lastPart;
    }

    public static String createTokenizedUrl(String repoUrl, String token) {
        // Split the repo URL to get the protocol (https://) and the rest of the URL
        String[] urlParts = repoUrl.split("://", 2);
        if (urlParts.length != 2) {
            throw new IllegalArgumentException("Invalid URL format");
        }

        // Add the token in the format gitlab-ci-token:"token"@
        String tokenizedUrl = urlParts[0] + "://gitlab-ci-token:" + token + "@" + urlParts[1];

        return tokenizedUrl;
    }

  public boolean CloneRepository(String repoUrl, String dst_fodler_path) {
        boolean credential_flag = false;  // Ensure the flag is initialized

        String projectName = getProjectNameFromUrl(repoUrl);

        // Try to clone the repository
        try {
            // Attempt to clone the repository
            System.out.printf("Attempting to clone repository from %s ...\n", repoUrl);
            Git git = Git.cloneRepository()
                    .setURI(repoUrl)
                    .setDirectory(new File(dst_fodler_path))
                    .setCredentialsProvider(new UsernamePasswordCredentialsProvider("", ""))
                    .call();

            System.out.println("Repository cloned successfully to: " + git.getRepository().getDirectory());
            git.close(); // Close the Git instance
            return true; // Successfully cloned
        } catch (GitAPIException e) {
            System.err.println("Failed to clone repository: " + e.getMessage());
            // Handle authentication failure (likely private repo)
            System.out.println("It seems the repository is private. Please provide your Git credentials.");
            credential_flag = true; // Trigger for credential prompt
        }

        // If credentials are needed
        if (credential_flag) {
          System.out.println("User need to put GitCredentials.");
            String[] credentials = UserChoiceHelper.getGitCredentials(repoUrl);  // Get credentials
            if (credentials == null) {
                System.out.println("User cancelled the input.");
                return false; // Stop if the user cancels the dialog
            }

            String username = credentials[0];
            String credential = credentials[1];
            String credentialType = credentials[2];

            CredentialsProvider credentialsProvider;

            // Set up credentials provider based on the type of credential provided
            if ("token".equalsIgnoreCase(credentialType)) {
                // Use the token as the password (username can be empty for tokens)
              System.out.println("Will try token");
                credentialsProvider = new UsernamePasswordCredentialsProvider(credential, "");
                repoUrl = createTokenizedUrl(repoUrl, credential);
                try {
                    // Attempt to clone the repository
                    Git git = Git.cloneRepository()
                            .setURI(repoUrl)
                            .setDirectory(new File(dst_fodler_path))
                            .setCredentialsProvider(new UsernamePasswordCredentialsProvider("", ""))
                            .call();

                    System.out.println("Repository cloned successfully to: " + git.getRepository().getDirectory());
                    git.close(); // Close the Git instance
                    return true; // Successfully cloned
                } catch (GitAPIException e) {
                    System.err.println("Failed to clone repository: " + e.getMessage());
                    // Handle authentication failure (likely private repo)
                    System.out.println("It seems the repository is private. Please provide your Git credentials.");
                    UserChoiceHelper.ShowMessageDialog("Authentication Failed", "The token provided is incorrect.", SWT.ICON_ERROR);
                    return false;
                }

            } else {
                // Default to using username and password
                credentialsProvider = new UsernamePasswordCredentialsProvider(username, credential);
            }

            try {
                System.out.println("Attempting to clone repository with provided credentials...");
                Git git = Git.cloneRepository()
                        .setURI(repoUrl)
                        .setDirectory(new File(dst_fodler_path))
                        .setCredentialsProvider(credentialsProvider)  // Set the credentials provider
                        .call();

                System.out.println("Repository cloned successfully to: " + git.getRepository().getDirectory());
                git.close(); // Close the Git instance
                return true;
            } catch (GitAPIException e) {
                System.err.println("Failed to clone repository with credentials: " + e.getMessage());
                UserChoiceHelper.ShowMessageDialog("Authentication Failed", "The username or password provided is incorrect.", SWT.ICON_ERROR);

                return false;  // Return false if the second clone attempt fails
            }
        }

        return false;  // Return false if credentials were required but not provided
    }

  public boolean importToWorkspace(File folder) {
        // Recursively find all directories that contain a ".project" file
        List<File> projectDirectories = new ArrayList<>();
        findProjectDirectories(folder, projectDirectories);

        // Check if any directories were found
        if (projectDirectories.isEmpty()) {
          UserChoiceHelper.ShowMessageDialog("Import Library", "No valid project directories found.", SWT.ICON_ERROR);
            System.out.println("No valid project directories found.");
            return false; // No valid project directories found
        }

        IOverwriteQuery overwriteQuery = new IOverwriteQuery() {
            public String queryOverwrite(String file) {
                System.out.println("Overwriting file: " + file);
                return ALL; // Automatically overwrite files if they exist
            }
        };

        for (File directory : projectDirectories) {
            IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(directory.getName());
            try {
                System.out.println("Importing project: " + directory.getName());
                URI location = directory.toURI();
                IPath projectFilePath = new Path(location.getPath()).append(".project");

                // Load the project description
                IProjectDescription description = ResourcesPlugin.getWorkspace().loadProjectDescription(projectFilePath);
                description.setLocationURI(location);

                IProgressMonitor monitor = new NullProgressMonitor();

                // Create and open the project
                if (!project.exists()) {
                    project.create(description, monitor);
                }
                if (!project.isOpen()) {
                    project.open(monitor);
                }

                // Import operation
                ImportOperation importOperation = new ImportOperation(project.getFullPath(),
                        new File(folder, project.getName()), FileSystemStructureProvider.INSTANCE, overwriteQuery);
                importOperation.setCreateContainerStructure(false);

                // Run the import operation
                System.out.println("Running import operation for project: " + project.getName());
                importOperation.run(monitor);
                System.out.println("Successfully imported project: " + project.getName());
            } catch (CoreException e) {
                System.err.println("CoreException while importing project: " + e.getMessage());
                e.printStackTrace();
                return false; // Return false if there's an error
            } catch (InvocationTargetException e) {
                System.err.println("InvocationTargetException while importing project: " + e.getMessage());
                e.printStackTrace();
                return false; // Handle invocation errors
            } catch (InterruptedException e) {
                System.err.println("InterruptedException while importing project: " + e.getMessage());
                e.printStackTrace();
                return false; // Handle interruptions
            }
        }

        System.out.println("Import process completed.");
        return true; // Return true if all projects were imported successfully
    }

    // Helper function to recursively find directories with a ".project" file
    private void findProjectDirectories(File folder, List<File> projectDirectories) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    // Check if the directory contains a ".project" file
                    File projectFile = new File(file, ".project");
                    if (projectFile.exists()) {
                        System.out.println("Found project directory: " + file.getAbsolutePath());
                        projectDirectories.add(file);
                    } else {
                        // Recurse into the directory
                        findProjectDirectories(file, projectDirectories);
                    }
                }
            }
        }
    }
    public boolean cloneOrImportFromLocal(String repoUrl, String dst_fodler_path) {
      System.out.println("clone lib or import from local");
        // Attempt to clone the repository
        if (CloneRepository(repoUrl, dst_fodler_path)) {
          System.out.printf("Import cloned folder from %s\n", dst_fodler_path);
            // If cloning succeeds, import the repository folder as a project
          File f = new File(dst_fodler_path);

          System.out.printf("Import cloned folder from %s\n", f.getAbsolutePath());
            return importToWorkspace(new File(dst_fodler_path));
        } else {
            UserChoiceHelper.ShowMessageDialog("Import Library", "Import libray from local libray", SWT.ICON_INFORMATION);

            // If cloning fails, prompt user to choose a local folder
            String localDirectory = UserChoiceHelper.chooseDirectory();
            if (localDirectory != null) {
              System.out.printf("Import local folder %s\n", localDirectory);
                // Import the selected local folder into the workspace
                return importToWorkspace(new File(localDirectory));
            }
        }
        return false;  // Return false if both operations fail
    }

    public void MakeBashExecutable(String filePath) {
        java.nio.file.Path path = Paths.get(filePath);

        // Ensure the file exists
        if (Files.notExists(path)) {
            System.err.println("File does not exist: " + filePath);
            return;
        }

        try {
            // Retrieve the current permissions
            Set<PosixFilePermission> permissions = new HashSet<>(Files.getPosixFilePermissions(path));

            // Add execute permission for the owner
            permissions.add(PosixFilePermission.OWNER_EXECUTE);
            permissions.add(PosixFilePermission.GROUP_EXECUTE); // Optionally, for the group
            permissions.add(PosixFilePermission.OTHERS_EXECUTE); // Optionally, for others

            // Set the new permissions
            Files.setPosixFilePermissions(path, permissions);
            System.out.println("Made file executable: " + filePath);
        } catch (Exception e) {
            System.err.println("Error setting permissions: " + e.getMessage());
        }
    }

}
