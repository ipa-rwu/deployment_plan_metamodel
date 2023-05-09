/**
 */
package de.fraunhofer.ipa.deployment.util.impl;

import de.fraunhofer.ipa.deployment.util.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilFactoryImpl extends EFactoryImpl implements UtilFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static UtilFactory init() {
        try {
            UtilFactory theUtilFactory = (UtilFactory) EPackage.Registry.INSTANCE.getEFactory(UtilPackage.eNS_URI);
            if (theUtilFactory != null) {
                return theUtilFactory;
            }
        } catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new UtilFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UtilFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
        case UtilPackage.RESOURCE:
            return createResource();
        case UtilPackage.COMMUNICATION_TYPE:
            return createCommunicationType();
        case UtilPackage.ETHERNET_COMMUNICATION_TYPE:
            return createEthernetCommunicationType();
        case UtilPackage.WLAN_COMMUNICATION_TYPE:
            return createWlanCommunicationType();
        case UtilPackage.USB_COMMUNICATION_TYPE:
            return createUsbCommunicationType();
        case UtilPackage.LINUX_OPERTING_SYSTEM:
            return createLinuxOpertingSystem();
        case UtilPackage.MAC_OS_OPERTING_SYSTEM:
            return createMacOSOpertingSystem();
        case UtilPackage.PROCESSOR_RESOUCE_TYPE:
            return createProcessorResouceType();
        case UtilPackage.RESOURCE_TYPE:
            return createResourceType();
        case UtilPackage.PROCESSOR_ARCHITECTURE_VALUE:
            return createProcessorArchitectureValue();
        case UtilPackage.LINUX_DISTRIBUTION_VALUE:
            return createLinuxDistributionValue();
        case UtilPackage.UBUNTU_VERSION_VALUE:
            return createUbuntuVersionValue();
        case UtilPackage.ATTRIBUTE_KIND:
            return createAttributeKind();
        case UtilPackage.MAXIMUM_KIND:
            return createMaximumKind();
        case UtilPackage.MINIMUM_KIND:
            return createMinimumKind();
        case UtilPackage.SELECTION_KIND:
            return createSelectionKind();
        case UtilPackage.RANGE_KIND:
            return createRangeKind();
        case UtilPackage.PROPERTY_ATTRIBUTE:
            return createPropertyAttribute();
        case UtilPackage.PROPERTY_MAXIMUN:
            return createPropertyMaximun();
        case UtilPackage.PROPERTY_MINIMUM:
            return createPropertyMinimum();
        case UtilPackage.PROPERTY_SELECTION:
            return createPropertySelection();
        case UtilPackage.PROPERTY_RANGE:
            return createPropertyRange();
        case UtilPackage.PROPERTY:
            return createProperty();
        case UtilPackage.PROPERTY_VALUE_INT:
            return createPropertyValueInt();
        case UtilPackage.PROPERTY_VALUE_DOUBLE:
            return createPropertyValueDouble();
        case UtilPackage.PROPERTY_VALUE_STRING:
            return createPropertyValueString();
        case UtilPackage.PROPERTY_VALUE_LIST:
            return createPropertyValueList();
        case UtilPackage.OPERATING_SYSTEM_RESOUCE:
            return createOperatingSystemResouce();
        case UtilPackage.VERSION_OPERATING_SYSTEM_PROPERTY:
            return createVersionOperatingSystemProperty();
        case UtilPackage.NAME_OPERATING_SYSTEM_PROPERTY:
            return createNameOperatingSystemProperty();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
        case UtilPackage.UBUNTU_VERSION:
            return createUbuntuVersionFromString(eDataType, initialValue);
        case UtilPackage.LINUX_DISTRIBUTION:
            return createLinuxDistributionFromString(eDataType, initialValue);
        case UtilPackage.RUN_TIME_TYPE:
            return createRunTimeTypeFromString(eDataType, initialValue);
        case UtilPackage.PROCESSOR_ARCHITECTURE_TYPE:
            return createProcessorArchitectureTypeFromString(eDataType, initialValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
        case UtilPackage.UBUNTU_VERSION:
            return convertUbuntuVersionToString(eDataType, instanceValue);
        case UtilPackage.LINUX_DISTRIBUTION:
            return convertLinuxDistributionToString(eDataType, instanceValue);
        case UtilPackage.RUN_TIME_TYPE:
            return convertRunTimeTypeToString(eDataType, instanceValue);
        case UtilPackage.PROCESSOR_ARCHITECTURE_TYPE:
            return convertProcessorArchitectureTypeToString(eDataType, instanceValue);
        default:
            throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Resource createResource() {
        ResourceImpl resource = new ResourceImpl();
        return resource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CommunicationType createCommunicationType() {
        CommunicationTypeImpl communicationType = new CommunicationTypeImpl();
        return communicationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EthernetCommunicationType createEthernetCommunicationType() {
        EthernetCommunicationTypeImpl ethernetCommunicationType = new EthernetCommunicationTypeImpl();
        return ethernetCommunicationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WlanCommunicationType createWlanCommunicationType() {
        WlanCommunicationTypeImpl wlanCommunicationType = new WlanCommunicationTypeImpl();
        return wlanCommunicationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UsbCommunicationType createUsbCommunicationType() {
        UsbCommunicationTypeImpl usbCommunicationType = new UsbCommunicationTypeImpl();
        return usbCommunicationType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LinuxOpertingSystem createLinuxOpertingSystem() {
        LinuxOpertingSystemImpl linuxOpertingSystem = new LinuxOpertingSystemImpl();
        return linuxOpertingSystem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MacOSOpertingSystem createMacOSOpertingSystem() {
        MacOSOpertingSystemImpl macOSOpertingSystem = new MacOSOpertingSystemImpl();
        return macOSOpertingSystem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessorResouceType createProcessorResouceType() {
        ProcessorResouceTypeImpl processorResouceType = new ProcessorResouceTypeImpl();
        return processorResouceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ResourceType createResourceType() {
        ResourceTypeImpl resourceType = new ResourceTypeImpl();
        return resourceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessorArchitectureValue createProcessorArchitectureValue() {
        ProcessorArchitectureValueImpl processorArchitectureValue = new ProcessorArchitectureValueImpl();
        return processorArchitectureValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LinuxDistributionValue createLinuxDistributionValue() {
        LinuxDistributionValueImpl linuxDistributionValue = new LinuxDistributionValueImpl();
        return linuxDistributionValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UbuntuVersionValue createUbuntuVersionValue() {
        UbuntuVersionValueImpl ubuntuVersionValue = new UbuntuVersionValueImpl();
        return ubuntuVersionValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AttributeKind createAttributeKind() {
        AttributeKindImpl attributeKind = new AttributeKindImpl();
        return attributeKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MaximumKind createMaximumKind() {
        MaximumKindImpl maximumKind = new MaximumKindImpl();
        return maximumKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MinimumKind createMinimumKind() {
        MinimumKindImpl minimumKind = new MinimumKindImpl();
        return minimumKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SelectionKind createSelectionKind() {
        SelectionKindImpl selectionKind = new SelectionKindImpl();
        return selectionKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RangeKind createRangeKind() {
        RangeKindImpl rangeKind = new RangeKindImpl();
        return rangeKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertyAttribute createPropertyAttribute() {
        PropertyAttributeImpl propertyAttribute = new PropertyAttributeImpl();
        return propertyAttribute;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertyMaximun createPropertyMaximun() {
        PropertyMaximunImpl propertyMaximun = new PropertyMaximunImpl();
        return propertyMaximun;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertyMinimum createPropertyMinimum() {
        PropertyMinimumImpl propertyMinimum = new PropertyMinimumImpl();
        return propertyMinimum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertySelection createPropertySelection() {
        PropertySelectionImpl propertySelection = new PropertySelectionImpl();
        return propertySelection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertyRange createPropertyRange() {
        PropertyRangeImpl propertyRange = new PropertyRangeImpl();
        return propertyRange;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Property createProperty() {
        PropertyImpl property = new PropertyImpl();
        return property;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertyValueInt createPropertyValueInt() {
        PropertyValueIntImpl propertyValueInt = new PropertyValueIntImpl();
        return propertyValueInt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertyValueDouble createPropertyValueDouble() {
        PropertyValueDoubleImpl propertyValueDouble = new PropertyValueDoubleImpl();
        return propertyValueDouble;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertyValueString createPropertyValueString() {
        PropertyValueStringImpl propertyValueString = new PropertyValueStringImpl();
        return propertyValueString;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertyValueList createPropertyValueList() {
        PropertyValueListImpl propertyValueList = new PropertyValueListImpl();
        return propertyValueList;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public OperatingSystemResouce createOperatingSystemResouce() {
        OperatingSystemResouceImpl operatingSystemResouce = new OperatingSystemResouceImpl();
        return operatingSystemResouce;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VersionOperatingSystemProperty createVersionOperatingSystemProperty() {
        VersionOperatingSystemPropertyImpl versionOperatingSystemProperty = new VersionOperatingSystemPropertyImpl();
        return versionOperatingSystemProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NameOperatingSystemProperty createNameOperatingSystemProperty() {
        NameOperatingSystemPropertyImpl nameOperatingSystemProperty = new NameOperatingSystemPropertyImpl();
        return nameOperatingSystemProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UbuntuVersion createUbuntuVersionFromString(EDataType eDataType, String initialValue) {
        UbuntuVersion result = UbuntuVersion.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertUbuntuVersionToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LinuxDistribution createLinuxDistributionFromString(EDataType eDataType, String initialValue) {
        LinuxDistribution result = LinuxDistribution.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertLinuxDistributionToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RunTimeType createRunTimeTypeFromString(EDataType eDataType, String initialValue) {
        RunTimeType result = RunTimeType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertRunTimeTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessorArchitectureType createProcessorArchitectureTypeFromString(EDataType eDataType,
            String initialValue) {
        ProcessorArchitectureType result = ProcessorArchitectureType.get(initialValue);
        if (result == null)
            throw new IllegalArgumentException(
                    "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertProcessorArchitectureTypeToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UtilPackage getUtilPackage() {
        return (UtilPackage) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static UtilPackage getPackage() {
        return UtilPackage.eINSTANCE;
    }

} //UtilFactoryImpl
