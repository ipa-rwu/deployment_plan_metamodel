package de.fraunhofer.ipa.deployment.plugin.handlers;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.dialogs.IOverwriteQuery;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.wizards.datatransfer.FileSystemStructureProvider;
import org.eclipse.ui.wizards.datatransfer.ImportOperation;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.api.errors.InvalidRemoteException;
import org.eclipse.jgit.api.errors.TransportException;
import org.apache.commons.io.FileUtils;

public class ImportCommonObjectHandler extends AbstractHandler {

  public static Object CloneAndImport(ExecutionEvent event) throws InvocationTargetException, InterruptedException {
    String git_folder = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString()+"/ROSDeploymentExample";

    IProject example = ResourcesPlugin.getWorkspace().getRoot().getProject("ROSDeploymentExample");

    if (example.exists()) {
            System.out.println("ROSDeploymentExample is already imported");
            try {
              IProgressMonitor delete_monitor = new NullProgressMonitor();
        example.delete(true, true, delete_monitor);
        try {
          FileUtils.deleteDirectory(new File(git_folder));
        } catch (IOException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
        }
              System.out.println("Delete ROSDeploymentExample");

      } catch (CoreException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
        }


//    IWorkbenchWindow window;
//
//
//    try {
//      window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
//      MessageDialog.openInformation(
//        window.getShell(),
//        "Plugin",
//        git_folder);
//    } catch (ExecutionException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }


        File git_file=new File(git_folder);
        if (!git_file.exists()){
            try {
                git_file.mkdirs();
            } finally {
                try {
                    Git.cloneRepository()
                    .setURI("https://github.com/ipa-rwu/ROSDeploymentExample.git")
                    .setDirectory(git_file)
                    .call();
                } catch (InvalidRemoteException e) {
                    e.printStackTrace();
                } catch (TransportException e) {
                    System.out.println("no internet conection??");
                    e.printStackTrace();
                } catch (GitAPIException e) {
                    e.printStackTrace();
                }
            }
        }
        IOverwriteQuery overwriteQuery = new IOverwriteQuery() {
            public String queryOverwrite(String file) {
                return ALL;
            }
        };
        File[] directories = git_file.listFiles(new FileFilter() {
              public boolean accept(File file) {
                String temp = file+"/.project";
                if (new File(temp).exists()) {
                    return file.isDirectory();
                }else {
                    return false;
                }
              }
        });
        for (int i=0; i<directories.length; i++) {
            IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(directories[i].getName());
            try {
                URI location = URI.create(directories[i].toString());
                Path project_file_path = new Path(location+"/.project");
                IProjectDescription description = ResourcesPlugin.getWorkspace().loadProjectDescription((IPath) project_file_path);
                description.setLocationURI(location);
                IProgressMonitor monitor = new NullProgressMonitor();
                project.create(description, monitor);
                project.open(monitor);
                ImportOperation importOperation = new ImportOperation(project.getFullPath(), new File(git_folder, project.getName()), FileSystemStructureProvider.INSTANCE, overwriteQuery);
                importOperation.setCreateContainerStructure(false);
                importOperation.run(monitor);
            } catch (CoreException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        }

        return null;
    }

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        try {
            CloneAndImport(event);
        } catch (InvocationTargetException | InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
