/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.deployment.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import device.DevicePackage;

/**
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#content-assist
 * on how to customize the content assistant.
 */
public class ImplementationDescriptionProposalProvider extends AbstractImplementationDescriptionProposalProvider {

    @Override
    public void completeDeviceRequirement_Type(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        IScope scope = getScopeProvider().getScope(context.getCurrentModel(), DevicePackage.Literals.DEVICE_SET__DEVICE);
        for (IEObjectDescription ele: scope.getAllElements()) {
            acceptor.accept(createCompletionProposal(ele.getName().toString(), context));
        }
    }
}
