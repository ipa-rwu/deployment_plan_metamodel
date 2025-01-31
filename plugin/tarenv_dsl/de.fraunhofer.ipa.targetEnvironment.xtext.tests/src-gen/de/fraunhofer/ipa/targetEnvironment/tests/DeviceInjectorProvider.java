/*
 * generated by Xtext 2.36.0
 */
package de.fraunhofer.ipa.targetEnvironment.tests;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.fraunhofer.ipa.targetEnvironment.DeviceRuntimeModule;
import de.fraunhofer.ipa.targetEnvironment.DeviceStandaloneSetup;
import org.eclipse.xtext.testing.GlobalRegistries;
import org.eclipse.xtext.testing.GlobalRegistries.GlobalStateMemento;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.eclipse.xtext.testing.IRegistryConfigurator;

public class DeviceInjectorProvider implements IInjectorProvider, IRegistryConfigurator {

  protected GlobalStateMemento stateBeforeInjectorCreation;
  protected GlobalStateMemento stateAfterInjectorCreation;
  protected Injector injector;

  static {
    GlobalRegistries.initializeDefaults();
  }

  @Override
  public Injector getInjector() {
    if (injector == null) {
      this.injector = internalCreateInjector();
      stateAfterInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
    }
    return injector;
  }

  protected Injector internalCreateInjector() {
    return new DeviceStandaloneSetup() {
      @Override
      public Injector createInjector() {
        return Guice.createInjector(createRuntimeModule());
      }
    }.createInjectorAndDoEMFRegistration();
  }

  protected DeviceRuntimeModule createRuntimeModule() {
    // make it work also with Maven/Tycho and OSGI
    // see https://bugs.eclipse.org/bugs/show_bug.cgi?id=493672
    // allows for bindClassLoaderToInstance to get the class loader of the bundle
    // containing the instance of the injector provider (possibly inherited)
    return new DeviceRuntimeModule() {
      @Override
      public ClassLoader bindClassLoaderToInstance() {
        return DeviceInjectorProvider.this.getClass()
            .getClassLoader();
      }
    };
  }

  @Override
  public void restoreRegistry() {
    stateBeforeInjectorCreation.restoreGlobalState();
    stateBeforeInjectorCreation = null;
  }

  @Override
  public void setupRegistry() {
    stateBeforeInjectorCreation = GlobalRegistries.makeCopyOfGlobalState();
    if (injector == null) {
      getInjector();
    }
    stateAfterInjectorCreation.restoreGlobalState();
  }
}
