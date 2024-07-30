/*
 * generated by Xtext 2.35.0
 */
package de.fraunhofer.ipa.targetEnvironment;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.resource.IResourceFactory;
import org.eclipse.xtext.resource.IResourceServiceProvider;

@SuppressWarnings("all")
public class TargetEnvironmentStandaloneSetupGenerated implements ISetup {

  @Override
  public Injector createInjectorAndDoEMFRegistration() {
    DeviceStandaloneSetup.doSetup();

    Injector injector = createInjector();
    register(injector);
    return injector;
  }

  public Injector createInjector() {
    return Guice.createInjector(new TargetEnvironmentRuntimeModule());
  }

  public void register(Injector injector) {
    IResourceFactory resourceFactory = injector.getInstance(IResourceFactory.class);
    IResourceServiceProvider serviceProvider = injector.getInstance(IResourceServiceProvider.class);

    Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("tarEnv", resourceFactory);
    IResourceServiceProvider.Registry.INSTANCE.getExtensionToFactoryMap().put("tarEnv", serviceProvider);
  }
}
