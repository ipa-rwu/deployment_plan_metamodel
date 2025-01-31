/*
 * generated by Xtext 2.36.0
 */
package de.fraunhofer.ipa.targetEnvironment.ui;

import com.google.inject.Injector;
import de.fraunhofer.ipa.targetEnvironment.xtext.ui.internal.XtextActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass.
 */
public class DeviceExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

  @Override
  protected Bundle getBundle() {
    return FrameworkUtil.getBundle(XtextActivator.class);
  }

  @Override
  protected Injector getInjector() {
    XtextActivator activator = XtextActivator.getInstance();
    return activator != null ? activator.getInjector(XtextActivator.DE_FRAUNHOFER_IPA_TARGETENVIRONMENT_DEVICE) : null;
  }

}
