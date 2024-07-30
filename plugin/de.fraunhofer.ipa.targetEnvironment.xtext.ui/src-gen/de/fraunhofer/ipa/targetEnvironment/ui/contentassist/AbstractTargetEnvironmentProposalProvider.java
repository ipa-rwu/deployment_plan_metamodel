/*
 * generated by Xtext 2.35.0
 */
package de.fraunhofer.ipa.targetEnvironment.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

/**
 * Represents a generated, default implementation of superclass {@link DeviceProposalProvider}.
 * Methods are dynamically dispatched on the first parameter, i.e., you can override them
 * with a more concrete subtype.
 */
public abstract class AbstractTargetEnvironmentProposalProvider extends DeviceProposalProvider {

  public void completeTargetEnvironment_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeTargetDeployEnviroment_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeTargetDeployEnviroment_IncludeDevice(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeTargetDeployEnviroment_ConfigConnections(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeDeviceInstance_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeDeviceInstance_RefDeviceType(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
  }
  public void completeDeviceInstance_ConfigDeviceProperty(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeComputationDeviceInstance_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeComputationDeviceInstance_RefDeviceType(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
  }
  public void completeComputationDeviceInstance_ConfigDeviceProperty(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeConfigConnection_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeConfigConnection_ConnectDevice(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeConnectedDevice_RefDevice(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
  }
  public void completeConnectedDevice_RefConnection(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
  }
  public void completeConnectedDevice_Properties(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeConfigConnectionProperty_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeConfigConnectionProperty_RefConnectionProperty(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
  }
  public void completeConfigConnectionProperty_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeConfigDeviceProperty_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeConfigDeviceProperty_RefProperty(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
  }
  public void completeConfigDeviceProperty_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }

  public void complete_TargetEnvironment(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
  public void complete_TargetDeployEnviroment(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
  public void complete_AbstractDeviceInstance(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
  public void complete_DeviceInstance(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
  public void complete_ComputationDeviceInstance(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
  public void complete_ConfigConnection(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
  public void complete_ConnectedDevice(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
  public void complete_ConfigConnectionProperty(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
  public void complete_ConfigDeviceProperty(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
}
