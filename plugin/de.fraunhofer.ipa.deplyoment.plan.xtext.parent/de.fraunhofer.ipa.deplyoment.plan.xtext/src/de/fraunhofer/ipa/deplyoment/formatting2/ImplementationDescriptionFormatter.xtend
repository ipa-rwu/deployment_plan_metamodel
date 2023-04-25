/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.deplyoment.formatting2

import com.google.inject.Inject
import de.fraunhofer.ipa.deployment.formatting2.UtilFormatter
import de.fraunhofer.ipa.deplyoment.services.ImplementationDescriptionGrammarAccess
import implementationDescription.ImplementationDescription
import implementationDescription.SoftwareComponent
import org.eclipse.xtext.formatting2.IFormattableDocument

class ImplementationDescriptionFormatter extends UtilFormatter {

    @Inject extension ImplementationDescriptionGrammarAccess

    def dispatch void format(ImplementationDescription implementationDescription, extension IFormattableDocument document) {
        // TODO: format HiddenRegions around keywords, attributes, cross references, etc.
        for (softwareComponent : implementationDescription.includeSoftwareComponents) {
            softwareComponent.format
        }
    }

    def dispatch void format(SoftwareComponent softwareComponent, extension IFormattableDocument document) {
        // TODO: format HiddenRegions around keywords, attributes, cross references, etc.
        softwareComponent.repository.format
        for (executionRequirement : softwareComponent.executionRequirement) {
            executionRequirement.format
        }
    }

    // TODO: implement for Repository, DeviceRequirement, SoftwareConfigurationRequirement, HWSWParemeter, SoftwareExecutionParemeter
}
