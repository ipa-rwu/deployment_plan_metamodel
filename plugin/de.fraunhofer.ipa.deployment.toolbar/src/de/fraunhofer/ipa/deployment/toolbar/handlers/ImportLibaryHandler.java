package de.fraunhofer.ipa.deployment.toolbar.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import de.fraunhofer.ipa.deployment.toolbar.utils.HelperFunctions;

public class ImportLibaryHandler extends AbstractHandler {

  static HelperFunctions helper = new HelperFunctions();
  @Override
  public Object execute(ExecutionEvent event) throws ExecutionException {

    return null;
  }

  public static boolean CloneAndImport(String repo_url, String dest_folder) {
    // Directly return the result of the cloneOrImportFromLocal method
    boolean success = helper.cloneOrImportFromLocal(repo_url, dest_folder);

    if (success) {
      System.out.println("Repository cloned/imported successfully.");
      return true;
    } else {
      System.err.println("Failed to clone or import repository.");
      return false;
    }
  }

}
