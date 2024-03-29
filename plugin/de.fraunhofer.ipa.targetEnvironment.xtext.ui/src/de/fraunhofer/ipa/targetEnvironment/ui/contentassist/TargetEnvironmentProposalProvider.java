/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.targetEnvironment.ui.contentassist;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import com.google.common.base.Predicate;
import com.google.inject.Inject;

import de.fraunhofer.ipa.deployment.util.AbstractProperty;
import de.fraunhofer.ipa.deployment.util.PropertyAttribute;
import de.fraunhofer.ipa.targetEnvironment.services.TargetEnvironmentGrammarAccess;
import device.AbstractCommunicationConnection;
import device.AbstractConnectionProperty;
import device.AbstractNetworkProperty;
import device.ConnectionProperty;
import device.DeviceType;
import targetEnvironment.AbstractDeviceInstance;
import targetEnvironment.ComputationDeviceInstance;
import targetEnvironment.ConfigConnection;
import targetEnvironment.ConfigConnectionProperty;
import targetEnvironment.ConfigDeviceProperty;
import targetEnvironment.ConnectedDevice;
import targetEnvironment.DeviceInstance;

/**
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#content-assist
 * on how to customize the content assistant.
 */
public class TargetEnvironmentProposalProvider extends AbstractTargetEnvironmentProposalProvider {

    @Inject TargetEnvironmentGrammarAccess tarGramma;

    @Override
    public void completeConfigDeviceProperty_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        super.completeConfigDeviceProperty_Name(model, assignment, context, acceptor);
        ConfigDeviceProperty config_model = (ConfigDeviceProperty) model;
        String from = config_model.getRefProperty().getName();
        acceptor.accept(createCompletionProposal(from, context));
    }

    @Override
    public void completeConfigConnectionProperty_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        super.completeConfigConnectionProperty_Name(model, assignment, context, acceptor);
        ConfigConnectionProperty ref_model = (ConfigConnectionProperty) model;
        AbstractConnectionProperty refConnProperty = ref_model.getRefConnectionProperty();
        if(refConnProperty instanceof ConnectionProperty) {
            ConnectionProperty property = (ConnectionProperty) refConnProperty;
            String from = property.getName();
            acceptor.accept(createCompletionProposal(from, context));
        }
        if(refConnProperty instanceof PropertyAttribute) {
            PropertyAttribute property = (PropertyAttribute) refConnProperty;
            String from = property.getName();
            acceptor.accept(createCompletionProposal(from, context));
        }
    }

    private ComputationDeviceInstance compDeviceIns=null;
    private DeviceInstance deviceIns=null;

    @Override
    public void completeConfigDeviceProperty_RefProperty(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        compDeviceIns=null;
        deviceIns=null;
        if(model.eContainer() instanceof ComputationDeviceInstance) {
            compDeviceIns = (ComputationDeviceInstance) model.eContainer();
        }
        if(model.eContainer() instanceof DeviceInstance) {
            deviceIns = (DeviceInstance) model.eContainer();
        }
        if(compDeviceIns!=null) {
            completeConfigDeviceProperty_From_Lookup(model, assignment, context, acceptor, compDeviceIns.getRefDeviceType());
        }
        if(deviceIns!=null) {
            completeConfigDeviceProperty_From_Lookup(model, assignment, context, acceptor, deviceIns.getRefDeviceType());
        }
        }

    private void completeConfigDeviceProperty_From_Lookup(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor, DeviceType targetDev) {
        lookupCrossReference((CrossReference) assignment.getTerminal(),
                context, acceptor, new Predicate<IEObjectDescription>() {
                    @Override
                    public boolean apply(IEObjectDescription input) {
                        AbstractProperty param_impl = (AbstractProperty) input.getEObjectOrProxy();
                        if(param_impl.eIsProxy()) {
                            EObject obj = EcoreUtil.resolve(param_impl, model);
                            if(obj.eContainer().eContainer() == targetDev) {
                                return true;
                            }
                        }
                        return false;
                    }
            });
    }

    @Override
    public void completeConnectedDevice_RefConnection(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        ConnectedDevice connectDevice =  (ConnectedDevice) model;
        compDeviceIns=null;
        deviceIns=null;
        if(connectDevice.getRefDevice() instanceof DeviceInstance) {
            deviceIns = (DeviceInstance) connectDevice.getRefDevice();
            completeConfigDeviceProperty_RefConnection_Lookup(model, assignment, context, acceptor, deviceIns.getRefDeviceType());
        }
        if(connectDevice.getRefDevice() instanceof ComputationDeviceInstance) {
            compDeviceIns = (ComputationDeviceInstance) connectDevice.getRefDevice();
            completeConfigDeviceProperty_RefConnection_Lookup(model, assignment, context, acceptor, compDeviceIns.getRefDeviceType());
        }
    }

    private void completeConfigDeviceProperty_RefConnection_Lookup(
            EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor, DeviceType targetDev) {
        lookupCrossReference((CrossReference) assignment.getTerminal(),
                context, acceptor, new Predicate<IEObjectDescription>() {
                    @Override
                    public boolean apply(IEObjectDescription input) {
                        AbstractCommunicationConnection connection = (AbstractCommunicationConnection) input.getEObjectOrProxy();
                        if(connection.eIsProxy()) {
                            EObject obj = EcoreUtil.resolve(connection, model);
                            if(obj.eContainer() == targetDev) {
                                return true;
                                }
                        }
                        return false;
                    }
        });
    }

    @Override
    public void completeConfigConnectionProperty_RefConnectionProperty(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        ConfigConnectionProperty configConnectionProperty =  (ConfigConnectionProperty) model;
        ConnectedDevice connectDevice= (ConnectedDevice) configConnectionProperty.eContainer();
        lookupCrossReference((CrossReference) assignment.getTerminal(),
                context, acceptor, new Predicate<IEObjectDescription>() {
                    @Override
                    public boolean apply(IEObjectDescription input) {
                        if(input.getEObjectOrProxy().eIsProxy()) {
                            EObject obj = EcoreUtil.resolve(input.getEObjectOrProxy(), model);
                            System.out.println(obj.eContainer());
                            System.out.println(String.format("ref device: %s", connectDevice.getRefConnection()));
                            if(obj.eContainer() == connectDevice.getRefConnection()) {
                                return true;
                                }
                        }
                        return false;
                    }
        });
    }
}
