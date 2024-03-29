/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.deployment.formatting2

import jakarta.inject.Inject
import de.fraunhofer.ipa.deployment.services.ImplementationDescriptionGrammarAccess
import implementationDescription.ImplementationDescription
import implementationDescription.ImplementationDescriptionSet
import org.eclipse.xtext.formatting2.IFormattableDocument

class ImplementationDescriptionFormatter extends UtilFormatter {

    @Inject extension ImplementationDescriptionGrammarAccess

    def dispatch void format(ImplementationDescriptionSet implementationDescriptionSet, extension IFormattableDocument document) {
        // TODO: format HiddenRegions around keywords, attributes, cross references, etc.
        for (implementationDescription : implementationDescriptionSet.implementations) {
            implementationDescription.format
        }
    }

    def dispatch void format(ImplementationDescription implementationDescription, extension IFormattableDocument document) {
        // TODO: format HiddenRegions around keywords, attributes, cross references, etc.
        for (softwareComponent : implementationDescription.includeSoftwareComponents) {
            softwareComponent.format
        }
    }

    // TODO: implement for SoftwareComponent, Repository, DeviceRequirement, SoftwareConfigurationRequirement, HWSWParemeter, SoftwareExecutionParemeter
}
