/*
 * generated by Xtext 2.33.0
 */
package de.fraunhofer.ipa.deployment.tests;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.fraunhofer.ipa.deployment.PlanWithRosmodelRuntimeModule;
import de.fraunhofer.ipa.deployment.PlanWithRosmodelStandaloneSetup;
import org.eclipse.xtext.testing.GlobalRegistries;
import org.eclipse.xtext.testing.GlobalRegistries.GlobalStateMemento;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.eclipse.xtext.testing.IRegistryConfigurator;

public class PlanWithRosmodelInjectorProvider implements IInjectorProvider, IRegistryConfigurator {

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
    return new PlanWithRosmodelStandaloneSetup() {
      @Override
      public Injector createInjector() {
        return Guice.createInjector(createRuntimeModule());
      }
    }.createInjectorAndDoEMFRegistration();
  }

  protected PlanWithRosmodelRuntimeModule createRuntimeModule() {
    // make it work also with Maven/Tycho and OSGI
    // see https://bugs.eclipse.org/bugs/show_bug.cgi?id=493672
    return new PlanWithRosmodelRuntimeModule() {
      @Override
      public ClassLoader bindClassLoaderToInstance() {
        return PlanWithRosmodelInjectorProvider.class
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
