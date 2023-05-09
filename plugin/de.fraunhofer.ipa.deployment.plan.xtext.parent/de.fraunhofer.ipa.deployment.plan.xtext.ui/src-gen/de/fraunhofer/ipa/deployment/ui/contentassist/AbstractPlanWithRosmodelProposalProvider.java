/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.deployment.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

/**
 * Represents a generated, default implementation of superclass {@link PlanProposalProvider}.
 * Methods are dynamically dispatched on the first parameter, i.e., you can override them
 * with a more concrete subtype.
 */
public abstract class AbstractPlanWithRosmodelProposalProvider extends PlanProposalProvider {

    public void completeDeploymentPlanWithRosModel_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeDeploymentPlanWithRosModel_DeployTo(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
    }
    public void completeDeploymentPlanWithRosModel_Realize(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeConfigRosSoftwareComponent_Component(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
    }
    public void completeConfigRosSoftwareComponent_ExecutionConfiguration(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeConfigRosSoftwareComponent_StartCommand(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeRossystemAssignment_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeRossystemAssignment_ExecutedBy(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
    }
    public void completeRossystemAssignment_Version(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeRossystemAssignment_SoftwareComponents(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeRossystemAssignment_Middleware(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeRossystemAssignment_RuntimeType(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeConfigRosParameter_From(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
    }
    public void completeConfigRosParameter_To(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        lookupCrossReference(((CrossReference)assignment.getTerminal()), context, acceptor);
    }
    public void completeConfigRosParameter_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }

    public void complete_DeploymentPlanWithRosModel(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_ConfigRosSoftwareComponent(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_RossystemAssignment(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_ConfigRosParameter(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
}
