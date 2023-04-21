/*
 * generated by Xtext 2.30.0
 */
package de.fraunhofer.ipa.targetEnvironment.serializer;

import base.BasePackage;
import base.PropertyValueDouble;
import base.PropertyValueInt;
import base.PropertyValueString;
import com.google.inject.Inject;
import de.fraunhofer.ipa.targetEnvironment.services.DeviceGrammarAccess;
import device.AttributeKind;
import device.CapabilityProperty;
import device.CapabilityType;
import device.CommunicationConnection;
import device.CommunicationType;
import device.ConnectionProperty;
import device.DevicePackage;
import device.DeviceSet;
import device.DeviceType;
import device.MaximumKind;
import device.MinimumKind;
import device.SelectionKind;
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
public class DeviceSemanticSequencer extends BaseSemanticSequencer {

    @Inject
    private DeviceGrammarAccess grammarAccess;

    @Override
    public void sequence(ISerializationContext context, EObject semanticObject) {
        EPackage epackage = semanticObject.eClass().getEPackage();
        ParserRule rule = context.getParserRule();
        Action action = context.getAssignedAction();
        Set<Parameter> parameters = context.getEnabledBooleanParameters();
        if (epackage == BasePackage.eINSTANCE)
            switch (semanticObject.eClass().getClassifierID()) {
            case BasePackage.PROPERTY_VALUE_DOUBLE:
                sequence_PropertyValueDouble(context, (PropertyValueDouble) semanticObject);
                return;
            case BasePackage.PROPERTY_VALUE_INT:
                sequence_PropertyValueInt(context, (PropertyValueInt) semanticObject);
                return;
            case BasePackage.PROPERTY_VALUE_STRING:
                sequence_PropertyValueString(context, (PropertyValueString) semanticObject);
                return;
            }
        else if (epackage == DevicePackage.eINSTANCE)
            switch (semanticObject.eClass().getClassifierID()) {
            case DevicePackage.ATTRIBUTE_KIND:
                sequence_AttributeKind(context, (AttributeKind) semanticObject);
                return;
            case DevicePackage.CAPABILITY_PROPERTY:
                sequence_CapabilityProperty(context, (CapabilityProperty) semanticObject);
                return;
            case DevicePackage.CAPABILITY_TYPE:
                sequence_CapabilityType(context, (CapabilityType) semanticObject);
                return;
            case DevicePackage.COMMUNICATION_CONNECTION:
                sequence_CommunicationConnection(context, (CommunicationConnection) semanticObject);
                return;
            case DevicePackage.COMMUNICATION_TYPE:
                sequence_CommunicationType(context, (CommunicationType) semanticObject);
                return;
            case DevicePackage.CONNECTION_PROPERTY:
                sequence_ConnectionProperty(context, (ConnectionProperty) semanticObject);
                return;
            case DevicePackage.DEVICE_SET:
                sequence_DeviceSet(context, (DeviceSet) semanticObject);
                return;
            case DevicePackage.DEVICE_TYPE:
                sequence_DeviceType(context, (DeviceType) semanticObject);
                return;
            case DevicePackage.MAXIMUM_KIND:
                sequence_MaximumKind(context, (MaximumKind) semanticObject);
                return;
            case DevicePackage.MINIMUM_KIND:
                sequence_MinimumKind(context, (MinimumKind) semanticObject);
                return;
            case DevicePackage.SELECTION_KIND:
                sequence_SelectionKind(context, (SelectionKind) semanticObject);
                return;
            }
        if (errorAcceptor != null)
            errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
    }

    /**
     * <pre>
     * Contexts:
     *     CapabilityKind returns AttributeKind
     *     AttributeKind returns AttributeKind
     *
     * Constraint:
     *     {AttributeKind}
     * </pre>
     */
    protected void sequence_AttributeKind(ISerializationContext context, AttributeKind semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     CapabilityProperty returns CapabilityProperty
     *
     * Constraint:
     *     (name=EString type=[CapabilityType|EString] kind=CapabilityKind value=PropertyValue?)
     * </pre>
     */
    protected void sequence_CapabilityProperty(ISerializationContext context, CapabilityProperty semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     PropertyType returns CapabilityType
     *     CapabilityType returns CapabilityType
     *
     * Constraint:
     *     name=EString
     * </pre>
     */
    protected void sequence_CapabilityType(ISerializationContext context, CapabilityType semanticObject) {
        if (errorAcceptor != null) {
            if (transientValues.isValueTransient(semanticObject, DevicePackage.Literals.PROPERTY_TYPE__NAME) == ValueTransient.YES)
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DevicePackage.Literals.PROPERTY_TYPE__NAME));
        }
        SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
        feeder.accept(grammarAccess.getCapabilityTypeAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
        feeder.finish();
    }


    /**
     * <pre>
     * Contexts:
     *     CommunicationConnection returns CommunicationConnection
     *
     * Constraint:
     *     (name=EString type=CommunicationType properties+=ConnectionProperty*)
     * </pre>
     */
    protected void sequence_CommunicationConnection(ISerializationContext context, CommunicationConnection semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     PropertyType returns CommunicationType
     *     CommunicationType returns CommunicationType
     *
     * Constraint:
     *     name=EString
     * </pre>
     */
    protected void sequence_CommunicationType(ISerializationContext context, CommunicationType semanticObject) {
        if (errorAcceptor != null) {
            if (transientValues.isValueTransient(semanticObject, DevicePackage.Literals.PROPERTY_TYPE__NAME) == ValueTransient.YES)
                errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DevicePackage.Literals.PROPERTY_TYPE__NAME));
        }
        SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
        feeder.accept(grammarAccess.getCommunicationTypeAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
        feeder.finish();
    }


    /**
     * <pre>
     * Contexts:
     *     ConnectionProperty returns ConnectionProperty
     *
     * Constraint:
     *     (name=EString value=PropertyValue?)
     * </pre>
     */
    protected void sequence_ConnectionProperty(ISerializationContext context, ConnectionProperty semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     DeviceSet returns DeviceSet
     *     Description returns DeviceSet
     *
     * Constraint:
     *     device+=DeviceType+
     * </pre>
     */
    protected void sequence_DeviceSet(ISerializationContext context, DeviceSet semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     DeviceType returns DeviceType
     *
     * Constraint:
     *     (name=EString capability+=CapabilityProperty* communicationConnection+=CommunicationConnection*)
     * </pre>
     */
    protected void sequence_DeviceType(ISerializationContext context, DeviceType semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     CapabilityKind returns MaximumKind
     *     MaximumKind returns MaximumKind
     *
     * Constraint:
     *     {MaximumKind}
     * </pre>
     */
    protected void sequence_MaximumKind(ISerializationContext context, MaximumKind semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     CapabilityKind returns MinimumKind
     *     MinimumKind returns MinimumKind
     *
     * Constraint:
     *     {MinimumKind}
     * </pre>
     */
    protected void sequence_MinimumKind(ISerializationContext context, MinimumKind semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


    /**
     * <pre>
     * Contexts:
     *     CapabilityKind returns SelectionKind
     *     SelectionKind returns SelectionKind
     *
     * Constraint:
     *     {SelectionKind}
     * </pre>
     */
    protected void sequence_SelectionKind(ISerializationContext context, SelectionKind semanticObject) {
        genericSequencer.createSequence(context, semanticObject);
    }


}
