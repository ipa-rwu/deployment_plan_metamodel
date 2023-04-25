/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.deployment.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import de.fraunhofer.ipa.deployment.UtilRuntimeModule;
import de.fraunhofer.ipa.deployment.UtilStandaloneSetup;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class UtilIdeSetup extends UtilStandaloneSetup {

    @Override
    public Injector createInjector() {
        return Guice.createInjector(Modules2.mixin(new UtilRuntimeModule(), new UtilIdeModule()));
    }

}
