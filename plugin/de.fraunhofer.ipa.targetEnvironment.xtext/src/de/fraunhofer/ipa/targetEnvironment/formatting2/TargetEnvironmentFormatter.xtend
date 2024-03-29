/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.targetEnvironment.formatting2

import com.google.inject.Inject
import de.fraunhofer.ipa.targetEnvironment.services.TargetEnvironmentGrammarAccess
import org.eclipse.xtext.formatting2.IFormattableDocument
import targetEnvironment.TargetDeployEnviroment
import targetEnvironment.TargetEnvironment

class TargetEnvironmentFormatter extends DeviceFormatter {

    @Inject extension TargetEnvironmentGrammarAccess

    def dispatch void format(TargetEnvironment targetEnvironment, extension IFormattableDocument document) {
        // TODO: format HiddenRegions around keywords, attributes, cross references, etc.
        for (description : targetEnvironment.type) {
            description.format
        }
    }

    def dispatch void format(TargetDeployEnviroment targetDeployEnviroment, extension IFormattableDocument document) {
        // TODO: format HiddenRegions around keywords, attributes, cross references, etc.
        for (abstractDeviceInstance : targetDeployEnviroment.includeDevice) {
            abstractDeviceInstance.format
        }
        for (configConnection : targetDeployEnviroment.configConnections) {
            configConnection.format
        }
    }

    // TODO: implement for DeviceInstance, ComputationDeviceInstance, ConfigConnection, ConnectedDevice, ConfigConnectionProperty, ConfigDeviceProperty
}
