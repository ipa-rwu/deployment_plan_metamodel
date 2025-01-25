/*
 * generated by Xtext 2.36.0
 */
package de.fraunhofer.ipa.deployment.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

/**
 * Represents a generated, default implementation of superclass {@link UtilProposalProvider}.
 * Methods are dynamically dispatched on the first parameter, i.e., you can override them
 * with a more concrete subtype.
 */
public abstract class AbstractPlanProposalProvider extends UtilProposalProvider {

  public void completeDeploymentPlan_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeDeploymentPlan_DeployTo(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
  }
  public void completeDeploymentPlan_Realize(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeRealization_Realizations(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeConfigSoftwareComponent_Component(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
  }
  public void completeConfigSoftwareComponent_ExecutionConfiguration(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeConfigSoftwareComponent_StartCommand(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeImplementationAssignment_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeImplementationAssignment_ExecutedBy(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
  }
  public void completeImplementationAssignment_Version(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeImplementationAssignment_SoftwareComponents(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeImplementationAssignment_Middleware(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeImplementationAssignment_RuntimeType(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeRosMiddleware_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeContainerRuntime_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeContainerRuntime_Registry(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeContainerRuntime_OpertingSystemResource(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }
  public void completeConfigExecutionParameter_From(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
  }
  public void completeConfigExecutionParameter_To(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
  }
  public void completeConfigExecutionParameter_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
  }

  public void complete_DeploymentPlan(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
  public void complete_AbstarctConfigSoftwareComponent(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
  public void complete_AbstractComputationAssignment(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
  public void complete_AbstractRealization(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
  public void complete_AbstractConfigExecutionParameter(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
  public void complete_Realization(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
  public void complete_ConfigSoftwareComponent(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
  public void complete_ImplementationAssignment(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
  public void complete_Middleware(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
  public void complete_RosMiddleware(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
  public void complete_AbstractRuntime(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
  public void complete_ContainerRuntime(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
  public void complete_ROSDistro(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
  public void complete_ConfigExecutionParameter(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
    // subclasses may override
  }
}
