/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.deployment.formatting2

import com.google.inject.Inject
import de.fraunhofer.ipa.deployment.services.PlanWithRosmodelGrammarAccess
import deployPlanWithRosModel.ConfigRosSoftwareComponent
import deploymentPlan.DeploymentPlan
import org.eclipse.xtext.formatting2.IFormattableDocument

class PlanWithRosmodelFormatter extends PlanFormatter {

  @Inject extension PlanWithRosmodelGrammarAccess

  override dispatch void format(DeploymentPlan deploymentPlan, extension IFormattableDocument document) {
    // TODO: format HiddenRegions around keywords, attributes, cross references, etc.
    deploymentPlan.realize.format
  }

  def dispatch void format(ConfigRosSoftwareComponent configRosSoftwareComponent, extension IFormattableDocument document) {
    // TODO: format HiddenRegions around keywords, attributes, cross references, etc.
    for (abstractConfigExecutionParameter : configRosSoftwareComponent.executionConfiguration) {
      abstractConfigExecutionParameter.format
    }
  }

  // TODO: implement for RossystemImplementationAssignment, ConfigRosParameter
}
