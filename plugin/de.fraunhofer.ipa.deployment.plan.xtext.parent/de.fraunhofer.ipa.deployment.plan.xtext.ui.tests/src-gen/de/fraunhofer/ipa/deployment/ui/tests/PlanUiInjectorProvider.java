/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.deployment.ui.tests;

import com.google.inject.Injector;
import de.fraunhofer.ipa.deployment.plan.xtext.ui.internal.XtextActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class PlanUiInjectorProvider implements IInjectorProvider {

    @Override
    public Injector getInjector() {
        return XtextActivator.getInstance().getInjector("de.fraunhofer.ipa.deployment.Plan");
    }

}