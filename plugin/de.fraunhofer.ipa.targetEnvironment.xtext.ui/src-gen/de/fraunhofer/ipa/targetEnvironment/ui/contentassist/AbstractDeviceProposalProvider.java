/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.targetEnvironment.ui.contentassist;

import de.fraunhofer.ipa.deployment.ui.contentassist.UtilProposalProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

/**
 * Represents a generated, default implementation of superclass {@link UtilProposalProvider}.
 * Methods are dynamically dispatched on the first parameter, i.e., you can override them
 * with a more concrete subtype.
 */
public abstract class AbstractDeviceProposalProvider extends UtilProposalProvider {

    public void completeDeviceSet_Device(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeInterfaceNetworkProperty_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void completeInterfaceNetworkProperty_Kind(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeInterfaceNetworkProperty_Description(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeInterfaceNetworkProperty_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeAddressNetworkProperty_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void completeAddressNetworkProperty_Kind(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeAddressNetworkProperty_Description(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeAddressNetworkProperty_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeDeviceType_Impl_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeDeviceType_Impl_DeviceResource(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeDeviceType_Impl_CommunicationConnection(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeDeviceResource_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeDeviceResource_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeDeviceResource_Properties(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeComputationDeviceType_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeComputationDeviceType_DeviceResource(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeComputationDeviceType_ComputationResource(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeComputationDeviceType_CommunicationConnection(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeConnectionProperty_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeConnectionProperty_Kind(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeConnectionProperty_Description(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeConnectionProperty_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeNetworkConnection_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeNetworkConnection_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeNetworkConnection_Properties(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeCommunicationConnection_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeCommunicationConnection_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeCommunicationConnection_Properties(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeOperatingSystemResouce_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeOperatingSystemResouce_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeOperatingSystemResouce_Properties(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeNameOperatingSystemProperty_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void completeNameOperatingSystemProperty_Kind(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeNameOperatingSystemProperty_Description(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeNameOperatingSystemProperty_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeVersionOperatingSystemProperty_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void completeVersionOperatingSystemProperty_Kind(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeVersionOperatingSystemProperty_Description(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeVersionOperatingSystemProperty_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeProcessorResouce_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeProcessorResouce_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeProcessorResouce_Properties(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeArchitectureProcessorProperty_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void completeArchitectureProcessorProperty_Kind(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeArchitectureProcessorProperty_Description(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeArchitectureProcessorProperty_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeCoreProcessorProperty_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void completeCoreProcessorProperty_Kind(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeCoreProcessorProperty_Description(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }
    public void completeCoreProcessorProperty_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        completeRuleCall(((RuleCall)assignment.getTerminal()), context, acceptor);
    }

    public void complete_DeviceSet(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_DeviceType(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_AbstractCommunicationConnection(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_AbstractNetworkProperty(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_InterfaceNetworkProperty(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_AddressNetworkProperty(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_DeviceType_Impl(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_AbstractComputationResource(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_DeviceResource(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_ComputationDeviceType(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_ConnectionProperty(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_NetworkConnection(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_CommunicationConnection(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_OperatingSystemResouce(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_AbstractOperatingSystemProperty(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_NameOperatingSystemProperty(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_VersionOperatingSystemProperty(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_ProcessorResouce(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_AbstracProcessorProperty(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_ArchitectureProcessorProperty(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
    public void complete_CoreProcessorProperty(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        // subclasses may override
    }
}
