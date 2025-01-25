package de.fraunhofer.ipa.deployment.toolbar.utils;

import java.io.File;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

import de.fraunhofer.ipa.deployment.toolbar.handlers.ImportLibaryHandler;


public class LibraryImporter {

    private HelperFunctions helper = new HelperFunctions();
    private volatile boolean cancelRequested = false;

    public LibraryImporter() {
        // Constructor if needed for initialization
    }

    public void importLibraries(Map<String, String> libraryMap, IProgressMonitor monitor) throws CoreException {
        for (Entry<String, String> entry : libraryMap.entrySet()) {
            if (cancelRequested) {
                return; // Exit if cancellation is requested
            }

            String libFolder = entry.getKey();
            String libRepoUrl = entry.getValue();
            String libPath = helper.getFilePtah(libFolder);

            // Check if the folder exists before trying to import
            if (!helper.CheckFolderExist(libFolder)) {
                System.out.println("Importing " + libFolder);
                ImportLibaryHandler.CloneAndImport(libRepoUrl, libPath);
            } else {
                System.out.println(libFolder + " already exists. import.");
                helper.importToWorkspace(new File(libPath));
            }
        }
    }

    public void setCancelRequested(boolean cancelRequested) {
        this.cancelRequested = cancelRequested; // Set cancellation flag
    }
}
