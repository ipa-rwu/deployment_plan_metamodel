package de.fraunhofer.ipa.deployment.toolbar.handlers;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

import de.fraunhofer.ipa.deployment.toolbar.utils.LibraryImporter;

import org.eclipse.core.runtime.NullProgressMonitor;

import org.eclipse.jface.dialogs.MessageDialog;

public class ImportDeviceHandler extends AbstractHandler {

  private LibraryImporter libraryImporter = new LibraryImporter();
   private static final Map<String, String> LIBRARY_MAP = new HashMap<>();
     static {
         LIBRARY_MAP.put("DeploymentDeviceCatalog", "https://github.com/ipa-rwu/DeploymentDeviceCatalog.git");
     }
  @Override
  public Object execute(ExecutionEvent event) throws ExecutionException {
    IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);

    MessageDialog.openInformation(
                window.getShell(),
                "Editor",
                "Import Device Models");

        // Call the import method
        try {
             NullProgressMonitor monitor = new NullProgressMonitor(); // Replace with an actual monitor if necessary
            libraryImporter.importLibraries(LIBRARY_MAP, monitor);
        } catch (Exception e) {
            // Handle exceptions accordingly
            e.printStackTrace();
            MessageDialog.openError(window.getShell(), "Import Error", "Failed to import Device models: " + e.getMessage());
        }

        return null;
  }

}
