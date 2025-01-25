package de.fraunhofer.ipa.deployment.plugin;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class ResourceManagerPerspectiveFactory implements IPerspectiveFactory {
  @Override
  public void createInitialLayout(IPageLayout layout) {
    IFolderLayout left =
        layout.createFolder("left", IPageLayout.LEFT, 0.2f, layout.getEditorArea());
    left.addView("org.eclipse.ui.navigator.ProjectExplorer");
    IFolderLayout bottom =
        layout.createFolder("bottom", IPageLayout.BOTTOM, .7f, layout.getEditorArea());
    bottom.addView(IPageLayout.ID_PROP_SHEET);
  }
}
