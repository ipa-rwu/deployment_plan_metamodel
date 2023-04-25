/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.deplyoment.serializer;

import com.google.inject.Inject;
import de.fraunhofer.ipa.deployment.serializer.UtilSemanticSequencer;
import de.fraunhofer.ipa.deployment.util.AbstractComputationAssignmentTarget;
import de.fraunhofer.ipa.deployment.util.AttributeKind;
import de.fraunhofer.ipa.deployment.util.CommunicationType;
import de.fraunhofer.ipa.deployment.util.Description;
import de.fraunhofer.ipa.deployment.util.EthernetCommunicationType;
import de.fraunhofer.ipa.deployment.util.LinuxDistributionValue;
import de.fraunhofer.ipa.deployment.util.LinuxOpertingSystem;
import de.fraunhofer.ipa.deployment.util.MacOSOpertingSystem;
import de.fraunhofer.ipa.deployment.util.MaximumKind;
import de.fraunhofer.ipa.deployment.util.MinimumKind;
import de.fraunhofer.ipa.deployment.util.ProcessorArchitectureValue;
import de.fraunhofer.ipa.deployment.util.ProcessorResouceType;
import de.fraunhofer.ipa.deployment.util.Property;
import de.fraunhofer.ipa.deployment.util.PropertyAttribute;
import de.fraunhofer.ipa.deployment.util.PropertyMaximun;
import de.fraunhofer.ipa.deployment.util.PropertyMinimum;
import de.fraunhofer.ipa.deployment.util.PropertyRange;
import de.fraunhofer.ipa.deployment.util.PropertySelection;
import de.fraunhofer.ipa.deployment.util.PropertyValueDouble;
import de.fraunhofer.ipa.deployment.util.PropertyValueInt;
import de.fraunhofer.ipa.deployment.util.PropertyValueString;
import de.fraunhofer.ipa.deployment.util.RangeKind;
import de.fraunhofer.ipa.deployment.util.Resource;
import de.fraunhofer.ipa.deployment.util.ResourceType;
import de.fraunhofer.ipa.deployment.util.SelectionKind;
import de.fraunhofer.ipa.deployment.util.UbuntuVersionValue;
import de.fraunhofer.ipa.deployment.util.UtilPackage;
import de.fraunhofer.ipa.deployment.util.WlanCommunicationType;
import de.fraunhofer.ipa.deplyoment.services.PlanGrammarAccess;
import deploymentPlan.ConfigExecutionParameter;
import deploymentPlan.ConfigSoftwareComponent;
import deploymentPlan.DeploymentPlan;
import deploymentPlan.DeploymentPlanPackage;
import deploymentPlan.ImplementationAssignment;
import deploymentPlan.Realization;
import deploymentPlan.RosMiddleware;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class PlanSemanticSequencer extends UtilSemanticSequencer {

    @Inject
    private PlanGrammarAccess grammarAccess;

    @Override
    public void sequence(ISerializationContext context, EObject semanticObject) {
        EPackage epackage = semanticObject.eClass().getEPackage();
        ParserRule rule = context.getParserRule();
        Action action = context.getAssignedAction();
        Set<Parameter> parameters = context.getEnabledBooleanParameters();
        if (epackage == DeploymentPlanPackage.eINSTANCE)
            switch (semanticObject.eClass().getClassifierID()) {
            case DeploymentPlanPackage.CONFIG_EXECUTION_PARAMETER:
                sequence_ConfigExecutionParameter(context, (ConfigExecutionParameter) semanticObject);
                return;
            case DeploymentPlanPackage.CONFIG_SOFTWARE_COMPONENT:
                sequence_ConfigSoftwareComponent(context, (ConfigSoftwareComponent) semanticObject);
                return;
            case DeploymentPlanPackage.DEPLOYMENT_PLAN:
                sequence_DeploymentPlan(context, (DeploymentPlan) semanticObject);
                return;
            case DeploymentPlanPackage.IMPLEMENTATION_ASSIGNMENT:
                sequence_ImplementationAssignment(context, (ImplementationAssignment) semanticObject);
                return;
            case DeploymentPlanPackage.REALIZATION:
                sequence_Realization(context, (Realization) semanticObject);
                return;
            case DeploymentPlanPackage.ROS_MIDDLEWARE:
                sequence_RosMiddleware(context, (RosMiddleware) semanticObject);
                return;
            }
        else if (epackage == UtilPackage.eINSTANCE)
            switch (semanticObject.eClass().getClassifierID()) {
            case UtilPackage.ABSTRACT_COMPUTATION_ASSIGNMENT_TARGET:
                sequence_AbstractComputationAssignmentTarget(context, (AbstractComputationAssignmentTarget) semanticObject);
                return;
            case UtilPackage.ATTRIBUTE_KIND:
                sequence_AttributeKind(context, (AttributeKind) semanticObject);
                return;
            case UtilPackage.COMMUNICATION_TYPE:
                sequence_CommunicationType(context, (CommunicationType) semanticObject);
                return;
            case UtilPackage.DESCRIPTION:
                sequence_Description(context, (Description) semanticObject);
                return;
            case UtilPackage.ETHERNET_COMMUNICATION_TYPE:
                sequence_EthernetCommunicationType(context, (EthernetCommunicationType) semanticObject);
                return;
            case UtilPackage.LINUX_DISTRIBUTION_VALUE:
                sequence_LinuxDistributionValue(context, (LinuxDistributionValue) semanticObject);
                return;
            case UtilPackage.LINUX_OPERTING_SYSTEM:
                sequence_LinuxOpertingSystem(context, (LinuxOpertingSystem) semanticObject);
                return;
            case UtilPackage.MAC_OS_OPERTING_SYSTEM:
                sequence_MacOSOpertingSystem(context, (MacOSOpertingSystem) semanticObject);
                return;
            case UtilPackage.MAXIMUM_KIND:
                sequence_MaximumKind(context, (MaximumKind) semanticObject);
                return;
            case UtilPackage.MINIMUM_KIND:
                sequence_MinimumKind(context, (MinimumKind) semanticObject);
                return;
            case UtilPackage.PROCESSOR_ARCHITECTURE_VALUE:
                sequence_ProcessorArchitectureValue(context, (ProcessorArchitectureValue) semanticObject);
                return;
            case UtilPackage.PROCESSOR_RESOUCE_TYPE:
                sequence_ProcessorResouceType(context, (ProcessorResouceType) semanticObject);
                return;
            case UtilPackage.PROPERTY:
                sequence_Property(context, (Property) semanticObject);
                return;
            case UtilPackage.PROPERTY_ATTRIBUTE:
                sequence_PropertyAttribute(context, (PropertyAttribute) semanticObject);
                return;
            case UtilPackage.PROPERTY_MAXIMUN:
                sequence_PropertyMaximun(context, (PropertyMaximun) semanticObject);
                return;
            case UtilPackage.PROPERTY_MINIMUM:
                sequence_PropertyMinimum(context, (PropertyMinimum) semanticObject);
                return;
            case UtilPackage.PROPERTY_RANGE:
                sequence_PropertyRange(context, (PropertyRange) semanticObject);
                return;
            case UtilPackage.PROPERTY_SELECTION:
                sequence_PropertySelection(context, (PropertySelection) semanticObject);
                return;
            case UtilPackage.PROPERTY_VALUE_DOUBLE:
                sequence_PropertyValueDouble(context, (PropertyValueDouble) semanticObject);
                return;
            case UtilPackage.PROPERTY_VALUE_INT:
                sequence_PropertyValueInt(context, (PropertyValueInt) semanticObject);
                return;
            case UtilPackage.PROPERTY_VALUE_STRING:
                sequence_PropertyValueString(context, (PropertyValueString) semanticObject);
                return;
            case UtilPackage.RANGE_KIND:
                sequence_RangeKind(context, (RangeKind) semanticObject);
                return;
            case UtilPackage.RESOURCE:
                sequence_Resource(context, (Resource) semanticObject);
                return;
            case UtilPackage.RESOURCE_TYPE:
                sequence_ResourceType(context, (ResourceType) semanticObject);
                return;
            case UtilPackage.SELECTION_KIND:
                sequence_SelectionKind(context, (SelectionKind) semanticObject);
                return;
            case UtilPackage.UBUNTU_VERSION_VALUE:
                sequence_UbuntuVersionValue(context, (UbuntuVersionValue) semanticObject);
                return;
            case UtilPackage.WLAN_COMMUNICATION_TYPE:
                sequence_WlanCommunicationType(context, (WlanCommunicationType) semanticObject);
                return;
            }
        if (errorAcceptor != null)
            errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
    }

    /**
     * <pre>
     * Contexts:
     *     AbstractConfigExecutionParameter returns ConfigExecutionParameter
     *     ConfigExecutionParameter returns ConfigExecutionParameter
     *
     * Constraint:
     *     (from=[ExecutionParameter|EString] to=[AbstractConfigProperty|EString]? value=PropertyValue?)
     * </pre>
     */
    protected void sequence_ConfigExecutionParameter(ISerializationContext context, ConfigExecutionParameter semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstarctConfigSoftwareComponent returns ConfigSoftwareComponent
     *     ConfigSoftwareComponent returns ConfigSoftwareComponent
     *
     * Constraint:
     *     (
     *         component=[AbstractComputationAssignmentTarget|EString]
     *         executionConfiguration+=AbstractConfigExecutionParameter*
     *         (startCommand+=EString startCommand+=EString*)?
     *     )
     * </pre>
     */
    protected void sequence_ConfigSoftwareComponent(ISerializationContext context, ConfigSoftwareComponent semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     DeploymentPlan returns DeploymentPlan
     *
     * Constraint:
     *     (name=EString deployTo=[TargetDeployEnviroment|EString] realize=AbstractRealization)
     * </pre>
     */
    protected void sequence_DeploymentPlan(ISerializationContext context, DeploymentPlan semanticObject) {
        if (errorAcceptor != null) {
            if (transientValues.isValueTransient(semanticObject, DeploymentPlanPackage.Literals.ABSTRACT_DEPLOYMENT_PLAN__NAME) == ValueTransient.YES)
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeploymentPlanPackage.Literals.ABSTRACT_DEPLOYMENT_PLAN__NAME));
            if (transientValues.isValueTransient(semanticObject, DeploymentPlanPackage.Literals.ABSTRACT_DEPLOYMENT_PLAN__DEPLOY_TO) == ValueTransient.YES)
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeploymentPlanPackage.Literals.ABSTRACT_DEPLOYMENT_PLAN__DEPLOY_TO));
            if (transientValues.isValueTransient(semanticObject, DeploymentPlanPackage.Literals.ABSTRACT_DEPLOYMENT_PLAN__REALIZE) == ValueTransient.YES)
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeploymentPlanPackage.Literals.ABSTRACT_DEPLOYMENT_PLAN__REALIZE));
        }
        SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
        feeder.accept(grammarAccess.getDeploymentPlanAccess().getNameEStringParserRuleCall_3_0(), semanticObject.getName());
        feeder.accept(grammarAccess.getDeploymentPlanAccess().getDeployToTargetDeployEnviromentEStringParserRuleCall_5_0_1(), semanticObject.eGet(DeploymentPlanPackage.Literals.ABSTRACT_DEPLOYMENT_PLAN__DEPLOY_TO, false));
        feeder.accept(grammarAccess.getDeploymentPlanAccess().getRealizeAbstractRealizationParserRuleCall_6_0(), semanticObject.getRealize());
        feeder.finish();
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractComputationAssignment returns ImplementationAssignment
     *     ImplementationAssignment returns ImplementationAssignment
     *
     * Constraint:
     *     (
     *         name=EString
     *         executedBy=[ComputationDeviceInstance|EString]
     *         softwareComponents+=ConfigSoftwareComponent
     *         softwareComponents+=ConfigSoftwareComponent*
     *         middleware=Middleware?
     *         runtimeType=RunTimeType?
     *         opertingSystemType=OpertingSystemName?
     *     )
     * </pre>
     */
    protected void sequence_ImplementationAssignment(ISerializationContext context, ImplementationAssignment semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     AbstractRealization returns Realization
     *     Realization returns Realization
     *
     * Constraint:
     *     realizations+=AbstractComputationAssignment*
     * </pre>
     */
    protected void sequence_Realization(ISerializationContext context, Realization semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     Middleware returns RosMiddleware
     *     RosMiddleware returns RosMiddleware
     *
     * Constraint:
     *     value=ROSDistro
     * </pre>
     */
    protected void sequence_RosMiddleware(ISerializationContext context, RosMiddleware semanticObject) {
        if (errorAcceptor != null) {
            if (transientValues.isValueTransient(semanticObject, DeploymentPlanPackage.Literals.ROS_MIDDLEWARE__VALUE) == ValueTransient.YES)
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DeploymentPlanPackage.Literals.ROS_MIDDLEWARE__VALUE));
        }
        SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
        feeder.accept(grammarAccess.getRosMiddlewareAccess().getValueROSDistroEnumRuleCall_0(), semanticObject.getValue());
        feeder.finish();
    }


}
