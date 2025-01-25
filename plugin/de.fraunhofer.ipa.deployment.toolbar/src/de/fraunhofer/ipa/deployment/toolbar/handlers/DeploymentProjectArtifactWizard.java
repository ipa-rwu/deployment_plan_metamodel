package de.fraunhofer.ipa.deployment.toolbar.handlers;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

import de.fraunhofer.ipa.deployment.toolbar.Activator;
import de.fraunhofer.ipa.deployment.toolbar.utils.HelperFunctions;
import de.fraunhofer.ipa.deployment.toolbar.utils.LibraryInfo;
import de.fraunhofer.ipa.deployment.toolbar.utils.OtherTemplates;
import de.fraunhofer.ipa.deployment.toolbar.utils.PlanRosModelTemplate;
import de.fraunhofer.ipa.deployment.toolbar.utils.TarEnvModelTemplate;
import deployPlanWithRosModel.DeployRossystemPlan;
import targetEnvironment.TargetDeployEnviroment;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.Wizard;

public class DeploymentProjectArtifactWizard extends Wizard implements INewWizard {

    private NewArtifactProjectWizardPage page;
      private IStructuredSelection selection;
      private static HelperFunctions helper = new HelperFunctions();
      private PlanRosModelTemplate planRosModelTemp = new PlanRosModelTemplate();
      private TarEnvModelTemplate tarEnvModelTemp = new TarEnvModelTemplate();
      private OtherTemplates otherTemp = new OtherTemplates();

      // Centralized mapping for libraries
      private static final Map<String, LibraryInfo> LIBRARY_MAP = new HashMap<>();
      static {
          LIBRARY_MAP.put("DeploymentDeviceCatalog", new LibraryInfo(
              "https://github.com/ipa-rwu/DeploymentDeviceCatalog.git",
              "de.fraunhofer.ipa.deployment.catalog.devices"
          ));
          LIBRARY_MAP.put("RosCommonObjects", new LibraryInfo(
              "https://github.com/ipa320/RosCommonObjects.git",
              "de.fraunhofer.ipa.ros.communication.objects"
          ));
//          LIBRARY_MAP.put("RosModelsCatalog", new LibraryInfo(
//                  "https://github.com/ipa-nhg/RosModelsCatalog.git",
//                  "RosModelsCatalog"
//              ));
      }

      private volatile boolean cancelRequested = false;

      public DeploymentProjectArtifactWizard() {
          super();
          setNeedsProgressMonitor(true);
      }

      @Override
      public void init(IWorkbench workbench, IStructuredSelection selection) {
          this.selection = selection;
          setWindowTitle("Deployment Wizard");
          setDefaultPageImageDescriptor(Activator.getDefault().getImageRegistry().getDescriptor("DeploymentLogo"));
      }

      @Override
      public void addPages() {
          page = new NewArtifactProjectWizardPage(selection);
          addPage(page);
      }

      @Override
      public boolean performFinish() {
          final String projectName = page.getProjectName();
          IRunnableWithProgress op = new IRunnableWithProgress() {
              @Override
              public void run(IProgressMonitor monitor) throws InvocationTargetException {
                  try {
                      doFinish(projectName, monitor);
                  } catch (CoreException | GenerationFailedException e) {
                      throw new InvocationTargetException(e);
                  } finally {
                      monitor.done();
                  }
              }
          };
          try {
              getContainer().run(true, false, op);
          } catch (InterruptedException e) {
              return false;
          } catch (InvocationTargetException e) {
              Throwable realException = e.getTargetException();
              MessageDialog.openError(getShell(), "Error", realException.getMessage());
              return false;
          } catch (Exception e) { // Handle any other unexpected exceptions
              MessageDialog.openError(getShell(), "Error", e.getMessage());
              return false;
          }
          return true;
      }

      protected void doFinish(String projectName, IProgressMonitor monitor) throws CoreException, GenerationFailedException {
          IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);

          if (!project.exists()) {
              project.create(monitor);
          }
          if (!project.isOpen()) {
              project.open(IResource.BACKGROUND_REFRESH, monitor);
          }

          // Set up the project description, natures, and builders
          setupProjectDescription(project, monitor);

          if (cancelRequested) {
              return; // Exit if cancellation is requested
          }

          // Create a folder named 'devices'
          createFolder(project, "devices", monitor);

          // Clone, import, and add references to the necessary libraries
          cloneAndImportLibraries(monitor);

       // Generate and save planros model
          DeployRossystemPlan rosplan = CreateExampleModel.createPlanModel(projectName);
          CharSequence planContent = planRosModelTemp.createPlanrosSkeleton(rosplan);
          if (rosplan != null) {
              createAndSaveFile(project, projectName + ".planros", planContent, monitor);
          }

          TargetDeployEnviroment tarenv = CreateExampleModel.createTarEnvModel(projectName);
          CharSequence tarenvContent = tarEnvModelTemp.createTarenvSkeleton(tarenv);
          if (tarenvContent != null) {
              createAndSaveFile(project, projectName + ".tarEnv", tarenvContent, monitor);
          }

          CharSequence precommitContent = otherTemp.generatePrecommitConfig();
          if (precommitContent != null) {
              createAndSaveFile(project, ".pre-commit-config.yaml", precommitContent, monitor);
          }

          CharSequence gitIgnore = otherTemp.generateGitIgnore();
          if (gitIgnore != null) {
              createAndSaveFile(project, ".gitignore", gitIgnore, monitor);
          }

          CharSequence runscript = otherTemp.generateRunBash();
          if (runscript != null) {
              createAndSaveFile(project, "run.sh", runscript, monitor);
              helper.MakeBashExecutable((project.getFile("run.sh")).getLocation().toOSString());
          }

          CharSequence codespell_words = otherTemp.generateRunBash();
          if (codespell_words != null) {
              createAndSaveFile(project, ".codespell_words", codespell_words, monitor);
          }

          CharSequence readme = otherTemp.generateReadme(rosplan);
          if (readme != null) {
              createAndSaveFile(project, "README.md", readme, monitor);
          }

      }


  private void createAndSaveFile(IProject project, String fileName, CharSequence content, IProgressMonitor monitor) throws CoreException {
          IFile file = project.getFile(fileName);
          try (InputStream inputStream = new ByteArrayInputStream(content.toString().getBytes())) {
              if (!file.exists()) {
                  file.create(inputStream, true, monitor);
              } else {
                  file.setContents(inputStream, true, true, monitor);
              }
              System.out.println(fileName + " created and saved successfully.");
          } catch (IOException e) {
              IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID, "Error saving " + fileName, e);
              throw new CoreException(status);
          }
      }

      private void setupProjectDescription(IProject project, IProgressMonitor monitor) throws CoreException {
          IProjectDescription description = project.getDescription();

          // Set up Xtext nature
          String[] natures = description.getNatureIds();
          if (!Arrays.asList(natures).contains("org.eclipse.xtext.ui.shared.xtextNature")) {
              String[] newNatures = new String[natures.length + 1];
              System.arraycopy(natures, 0, newNatures, 0, natures.length);
              newNatures[natures.length] = "org.eclipse.xtext.ui.shared.xtextNature";
              description.setNatureIds(newNatures);
          }

          // Add Xtext builder to the build specification
          ICommand[] buildSpec = description.getBuildSpec();
          boolean hasXtextBuilder = Arrays.stream(buildSpec)
                                          .anyMatch(command -> "org.eclipse.xtext.ui.shared.xtextBuilder".equals(command.getBuilderName()));

          if (!hasXtextBuilder) {
              // Create a new build command for the Xtext builder
              ICommand xtextBuilderCommand = description.newCommand();
              xtextBuilderCommand.setBuilderName("org.eclipse.xtext.ui.shared.xtextBuilder");

              // Add the Xtext builder command to the build specification
              ICommand[] newBuildSpec = new ICommand[buildSpec.length + 1];
              System.arraycopy(buildSpec, 0, newBuildSpec, 0, buildSpec.length);
              newBuildSpec[buildSpec.length] = xtextBuilderCommand;
              description.setBuildSpec(newBuildSpec);
          }

          // Set referenced projects
          description.setReferencedProjects(getReferencedProjects());

          // Apply the updated description back to the project
          project.setDescription(description, monitor);
      }

      private void cloneAndImportLibraries(IProgressMonitor monitor) throws CoreException {
          for (Entry<String, LibraryInfo> entry : LIBRARY_MAP.entrySet()) {
              if (cancelRequested) {
                  return; // Exit if cancellation is requested
              }

              String libFolder = entry.getKey();
              LibraryInfo libInfo = entry.getValue();
              String libRepoUrl = libInfo.getGitUrl();
              String libPath = helper.getFilePtah(libFolder);

              if (!helper.CheckFolderExist(libFolder)) {
                  System.out.println("Importing " + libFolder);
                  ImportLibaryHandler.CloneAndImport(libRepoUrl, libPath);
              }
          }
      }

      private IProject[] getReferencedProjects() {
          return LIBRARY_MAP.values().stream()
              .map(libInfo -> {
                  return ResourcesPlugin.getWorkspace().getRoot().getProject(libInfo.getProjectName());
              })
              .toArray(IProject[]::new);
      }

      private void createFolder(IProject project, String folderName, IProgressMonitor monitor) throws CoreException {
          IFolder folder = project.getFolder(folderName);
          if (!folder.exists()) {
              folder.create(IResource.NONE, true, monitor);
          }
      }

      public boolean performCancel() {
          cancelRequested = true; // Set cancellation flag
          return super.performCancel(); // Call the superclass method
      }
}
