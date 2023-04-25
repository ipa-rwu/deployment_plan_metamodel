/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.deployment.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for EObjects.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#label-provider
 */
public class UtilLabelProvider extends DefaultEObjectLabelProvider {

    @Inject
    public UtilLabelProvider(AdapterFactoryLabelProvider delegate) {
        super(delegate);
    }

    // Labels and icons can be computed like this:

//  String text(Greeting ele) {
//      return "A greeting to " + ele.getName();
//  }
//
//  String image(Greeting ele) {
//      return "Greeting.gif";
//  }
}
