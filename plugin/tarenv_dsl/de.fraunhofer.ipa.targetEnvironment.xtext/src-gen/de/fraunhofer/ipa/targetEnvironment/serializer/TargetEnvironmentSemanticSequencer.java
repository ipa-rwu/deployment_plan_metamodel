/*
 * generated by Xtext 2.36.0
 */
package de.fraunhofer.ipa.targetEnvironment.serializer;

import com.google.inject.Inject;
import de.fraunhofer.ipa.deployment.serializer.UtilSemanticSequencer;
import de.fraunhofer.ipa.deployment.util.AbstractComputationAssignmentTarget;
import de.fraunhofer.ipa.deployment.util.AttributeKind;
import de.fraunhofer.ipa.deployment.util.CommunicationType;
import de.fraunhofer.ipa.deployment.util.EthernetCommunicationType;
import de.fraunhofer.ipa.deployment.util.LinuxDistributionValue;
import de.fraunhofer.ipa.deployment.util.LinuxOpertingSystem;
import de.fraunhofer.ipa.deployment.util.MacOSOpertingSystem;
import de.fraunhofer.ipa.deployment.util.MaximumKind;
import de.fraunhofer.ipa.deployment.util.MinimumKind;
import de.fraunhofer.ipa.deployment.util.NameOperatingSystemProperty;
import de.fraunhofer.ipa.deployment.util.OperatingSystemResouce;
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
import de.fraunhofer.ipa.deployment.util.PropertyValueList;
import de.fraunhofer.ipa.deployment.util.PropertyValueString;
import de.fraunhofer.ipa.deployment.util.RangeKind;
import de.fraunhofer.ipa.deployment.util.Resource;
import de.fraunhofer.ipa.deployment.util.ResourceType;
import de.fraunhofer.ipa.deployment.util.SelectionKind;
import de.fraunhofer.ipa.deployment.util.UbuntuVersionValue;
import de.fraunhofer.ipa.deployment.util.UsbCommunicationType;
import de.fraunhofer.ipa.deployment.util.UtilPackage;
import de.fraunhofer.ipa.deployment.util.VersionOperatingSystemProperty;
import de.fraunhofer.ipa.deployment.util.WlanCommunicationType;
import de.fraunhofer.ipa.targetEnvironment.services.TargetEnvironmentGrammarAccess;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import targetEnvironment.ComputationDeviceInstance;
import targetEnvironment.ConfigConnection;
import targetEnvironment.ConfigConnectionProperty;
import targetEnvironment.ConfigDeviceProperty;
import targetEnvironment.ConnectedDevice;
import targetEnvironment.DeviceInstance;
import targetEnvironment.TargetDeployEnviroment;
import targetEnvironment.TargetEnvironment;
import targetEnvironment.TargetEnvironmentPackage;

@SuppressWarnings("all")
public class TargetEnvironmentSemanticSequencer extends UtilSemanticSequencer {

  @Inject
  private TargetEnvironmentGrammarAccess grammarAccess;

  @Override
  public void sequence(ISerializationContext context, EObject semanticObject) {
    EPackage epackage = semanticObject.eClass().getEPackage();
    ParserRule rule = context.getParserRule();
    Action action = context.getAssignedAction();
    Set<Parameter> parameters = context.getEnabledBooleanParameters();
    if (epackage == TargetEnvironmentPackage.eINSTANCE)
      switch (semanticObject.eClass().getClassifierID()) {
      case TargetEnvironmentPackage.COMPUTATION_DEVICE_INSTANCE:
        sequence_ComputationDeviceInstance(context, (ComputationDeviceInstance) semanticObject);
        return;
      case TargetEnvironmentPackage.CONFIG_CONNECTION:
        sequence_ConfigConnection(context, (ConfigConnection) semanticObject);
        return;
      case TargetEnvironmentPackage.CONFIG_CONNECTION_PROPERTY:
        sequence_ConfigConnectionProperty(context, (ConfigConnectionProperty) semanticObject);
        return;
      case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY:
        sequence_ConfigDeviceProperty(context, (ConfigDeviceProperty) semanticObject);
        return;
      case TargetEnvironmentPackage.CONNECTED_DEVICE:
        sequence_ConnectedDevice(context, (ConnectedDevice) semanticObject);
        return;
      case TargetEnvironmentPackage.DEVICE_INSTANCE:
        sequence_DeviceInstance(context, (DeviceInstance) semanticObject);
        return;
      case TargetEnvironmentPackage.TARGET_DEPLOY_ENVIROMENT:
        sequence_TargetDeployEnviroment(context, (TargetDeployEnviroment) semanticObject);
        return;
      case TargetEnvironmentPackage.TARGET_ENVIRONMENT:
        sequence_TargetEnvironment(context, (TargetEnvironment) semanticObject);
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
      case UtilPackage.NAME_OPERATING_SYSTEM_PROPERTY:
        sequence_NameOperatingSystemProperty(context, (NameOperatingSystemProperty) semanticObject);
        return;
      case UtilPackage.OPERATING_SYSTEM_RESOUCE:
        sequence_OperatingSystemResouce(context, (OperatingSystemResouce) semanticObject);
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
      case UtilPackage.PROPERTY_VALUE_LIST:
        sequence_PropertyValueList(context, (PropertyValueList) semanticObject);
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
      case UtilPackage.USB_COMMUNICATION_TYPE:
        sequence_UsbCommunicationType(context, (UsbCommunicationType) semanticObject);
        return;
      case UtilPackage.VERSION_OPERATING_SYSTEM_PROPERTY:
        sequence_VersionOperatingSystemProperty(context, (VersionOperatingSystemProperty) semanticObject);
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
   *     AbstractDeviceInstance returns ComputationDeviceInstance
   *     ComputationDeviceInstance returns ComputationDeviceInstance
   *
   * Constraint:
   *     (name=EString refDeviceType=[ComputationDeviceType|EString] configDeviceProperty+=ConfigDeviceProperty*)
   * </pre>
   */
  protected void sequence_ComputationDeviceInstance(ISerializationContext context, ComputationDeviceInstance semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     ConfigConnectionProperty returns ConfigConnectionProperty
   *
   * Constraint:
   *     (name=EString refConnectionProperty=[ConnectionProperty|EString] value=PropertyValue?)
   * </pre>
   */
  protected void sequence_ConfigConnectionProperty(ISerializationContext context, ConfigConnectionProperty semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     ConfigConnection returns ConfigConnection
   *
   * Constraint:
   *     (name=EString connectDevice+=ConnectedDevice+)
   * </pre>
   */
  protected void sequence_ConfigConnection(ISerializationContext context, ConfigConnection semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     ConfigDeviceProperty returns ConfigDeviceProperty
   *
   * Constraint:
   *     (name=EString refProperty=[AbstractProperty|EString] value=PropertyValue)
   * </pre>
   */
  protected void sequence_ConfigDeviceProperty(ISerializationContext context, ConfigDeviceProperty semanticObject) {
    if (errorAcceptor != null) {
      if (transientValues.isValueTransient(semanticObject, TargetEnvironmentPackage.Literals.CONFIG_DEVICE_PROPERTY__NAME) == ValueTransient.YES)
        errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TargetEnvironmentPackage.Literals.CONFIG_DEVICE_PROPERTY__NAME));
      if (transientValues.isValueTransient(semanticObject, TargetEnvironmentPackage.Literals.CONFIG_DEVICE_PROPERTY__REF_PROPERTY) == ValueTransient.YES)
        errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TargetEnvironmentPackage.Literals.CONFIG_DEVICE_PROPERTY__REF_PROPERTY));
      if (transientValues.isValueTransient(semanticObject, TargetEnvironmentPackage.Literals.CONFIG_DEVICE_PROPERTY__VALUE) == ValueTransient.YES)
        errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TargetEnvironmentPackage.Literals.CONFIG_DEVICE_PROPERTY__VALUE));
    }
    SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
    feeder.accept(grammarAccess.getConfigDevicePropertyAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
    feeder.accept(grammarAccess.getConfigDevicePropertyAccess().getRefPropertyAbstractPropertyEStringParserRuleCall_5_0_1(), semanticObject.eGet(TargetEnvironmentPackage.Literals.CONFIG_DEVICE_PROPERTY__REF_PROPERTY, false));
    feeder.accept(grammarAccess.getConfigDevicePropertyAccess().getValuePropertyValueParserRuleCall_7_0(), semanticObject.getValue());
    feeder.finish();
  }


  /**
   * <pre>
   * Contexts:
   *     ConnectedDevice returns ConnectedDevice
   *
   * Constraint:
   *     (refDevice=[AbstractDeviceInstance|EString] refConnection=[CommunicationConnection|EString] properties+=ConfigConnectionProperty*)
   * </pre>
   */
  protected void sequence_ConnectedDevice(ISerializationContext context, ConnectedDevice semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     AbstractDeviceInstance returns DeviceInstance
   *     DeviceInstance returns DeviceInstance
   *
   * Constraint:
   *     (name=EString refDeviceType=[DeviceType|EString] configDeviceProperty+=ConfigDeviceProperty*)
   * </pre>
   */
  protected void sequence_DeviceInstance(ISerializationContext context, DeviceInstance semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     Description returns TargetDeployEnviroment
   *     TargetDeployEnviroment returns TargetDeployEnviroment
   *
   * Constraint:
   *     (name=EString (includeDevice+=ComputationDeviceInstance+ includeDevice+=DeviceInstance*)? configConnections+=ConfigConnection*)
   * </pre>
   */
  protected void sequence_TargetDeployEnviroment(ISerializationContext context, TargetDeployEnviroment semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


  /**
   * <pre>
   * Contexts:
   *     TargetEnvironment returns TargetEnvironment
   *
   * Constraint:
   *     type+=Description
   * </pre>
   */
  protected void sequence_TargetEnvironment(ISerializationContext context, TargetEnvironment semanticObject) {
    genericSequencer.createSequence(context, semanticObject);
  }


}
