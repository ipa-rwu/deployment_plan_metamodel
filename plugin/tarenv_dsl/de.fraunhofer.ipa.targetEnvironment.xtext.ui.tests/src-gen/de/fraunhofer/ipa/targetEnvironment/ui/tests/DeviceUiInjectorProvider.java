/*
 * generated by Xtext 2.36.0
 */
package de.fraunhofer.ipa.targetEnvironment.ui.tests;

import com.google.inject.Injector;
import de.fraunhofer.ipa.targetEnvironment.xtext.ui.internal.XtextActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class DeviceUiInjectorProvider implements IInjectorProvider {

  @Override
  public Injector getInjector() {
    return XtextActivator.getInstance().getInjector("de.fraunhofer.ipa.targetEnvironment.Device");
  }

}
