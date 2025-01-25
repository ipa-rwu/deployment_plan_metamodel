/*
 * generated by Xtext 2.36.0
 */
package de.fraunhofer.ipa.targetEnvironment.xtext.ui.internal;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.fraunhofer.ipa.targetEnvironment.DeviceRuntimeModule;
import de.fraunhofer.ipa.targetEnvironment.TargetEnvironmentRuntimeModule;
import de.fraunhofer.ipa.targetEnvironment.ui.DeviceUiModule;
import de.fraunhofer.ipa.targetEnvironment.ui.TargetEnvironmentUiModule;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.osgi.framework.BundleContext;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass.
 */
public class XtextActivator extends AbstractUIPlugin {

  public static final String PLUGIN_ID = "de.fraunhofer.ipa.targetEnvironment.xtext.ui";
  public static final String DE_FRAUNHOFER_IPA_TARGETENVIRONMENT_DEVICE = "de.fraunhofer.ipa.targetEnvironment.Device";
  public static final String DE_FRAUNHOFER_IPA_TARGETENVIRONMENT_TARGETENVIRONMENT = "de.fraunhofer.ipa.targetEnvironment.TargetEnvironment";

  private static final Logger logger = Logger.getLogger(XtextActivator.class);

  private static XtextActivator INSTANCE;

  private Map<String, Injector> injectors = Collections.synchronizedMap(new HashMap<>(2));

  @Override
  public void start(BundleContext context) throws Exception {
    super.start(context);
    INSTANCE = this;
  }

  @Override
  public void stop(BundleContext context) throws Exception {
    injectors.clear();
    INSTANCE = null;
    super.stop(context);
  }

  public static XtextActivator getInstance() {
    return INSTANCE;
  }

  public Injector getInjector(String language) {
    synchronized (injectors) {
      Injector injector = injectors.get(language);
      if (injector == null) {
        injectors.put(language, injector = createInjector(language));
      }
      return injector;
    }
  }

  protected Injector createInjector(String language) {
    try {
      com.google.inject.Module runtimeModule = getRuntimeModule(language);
      com.google.inject.Module sharedStateModule = getSharedStateModule();
      com.google.inject.Module uiModule = getUiModule(language);
      com.google.inject.Module mergedModule = Modules2.mixin(runtimeModule, sharedStateModule, uiModule);
      return Guice.createInjector(mergedModule);
    } catch (Exception e) {
      logger.error("Failed to create injector for " + language);
      logger.error(e.getMessage(), e);
      throw new RuntimeException("Failed to create injector for " + language, e);
    }
  }

  protected com.google.inject.Module getRuntimeModule(String grammar) {
    if (DE_FRAUNHOFER_IPA_TARGETENVIRONMENT_DEVICE.equals(grammar)) {
      return new DeviceRuntimeModule();
    }
    if (DE_FRAUNHOFER_IPA_TARGETENVIRONMENT_TARGETENVIRONMENT.equals(grammar)) {
      return new TargetEnvironmentRuntimeModule();
    }
    throw new IllegalArgumentException(grammar);
  }

  protected com.google.inject.Module getUiModule(String grammar) {
    if (DE_FRAUNHOFER_IPA_TARGETENVIRONMENT_DEVICE.equals(grammar)) {
      return new DeviceUiModule(this);
    }
    if (DE_FRAUNHOFER_IPA_TARGETENVIRONMENT_TARGETENVIRONMENT.equals(grammar)) {
      return new TargetEnvironmentUiModule(this);
    }
    throw new IllegalArgumentException(grammar);
  }

  protected com.google.inject.Module getSharedStateModule() {
    return new SharedStateModule();
  }


}
