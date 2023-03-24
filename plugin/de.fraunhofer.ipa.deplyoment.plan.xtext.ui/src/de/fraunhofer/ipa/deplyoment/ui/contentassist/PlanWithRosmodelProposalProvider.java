/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.deplyoment.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;

import com.google.common.base.Predicate;

import de.fraunhofer.ipa.deployment.util.AbstractComputationAssignmentTarget;
import deployPlanWithRosModel.impl.ConfigRosParameterImpl;
import deployPlanWithRosModel.impl.ConfigRosSoftwareComponentImpl;
import system.System;
import system.impl.RosParameterImpl;
import system.impl.RosSystemImpl;

/**
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#content-assist
 * on how to customize the content assistant.
 */
public class PlanWithRosmodelProposalProvider extends AbstractPlanWithRosmodelProposalProvider {

    @Override
    public void completeConfigRosParameter_From(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        ConfigRosParameterImpl ref_model = (ConfigRosParameterImpl) model;
        ConfigRosSoftwareComponentImpl config_comp = (ConfigRosSoftwareComponentImpl) ref_model.eContainer();
        System comp = config_comp.getComponent();
        lookupCrossReference((CrossReference) assignment.getTerminal(),
                context, acceptor, new Predicate<IEObjectDescription>() {
                    @Override
                    public boolean apply(IEObjectDescription input) {
                        RosParameterImpl param_impl = (RosParameterImpl) input.getEObjectOrProxy();
                        if(param_impl.eIsProxy()) {
                            EObject obj = EcoreUtil.resolve(param_impl, model);
                            RosSystemImpl tmp = (RosSystemImpl) obj.eContainer().eContainer();
                            if(tmp == comp) {
                                return true;
                            }
                        }
                        return false;
                    }

        });
        }
    }
