/**
 */
package de.fraunhofer.ipa.deployment.util.impl;

import de.fraunhofer.ipa.deployment.util.*;

import org.eclipse.emf.ecore.EClass;
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
        case UtilPackage.PROPERTY_VALUE_INT:
            return createPropertyValueInt();
        case UtilPackage.PROPERTY_VALUE_DOUBLE:
            return createPropertyValueDouble();
        case UtilPackage.PROPERTY_VALUE_STRING:
            return createPropertyValueString();
        case UtilPackage.COMMUNICATION_TYPE:
            return createCommunicationType();
        case UtilPackage.ETHERNET_COMMUNICATION_TYPE:
            return createEthernetCommunicationType();
        case UtilPackage.WLAN_COMMUNICATION_TYPE:
            return createWlanCommunicationType();
        case UtilPackage.AVAILABLE_RESOUCE:
            return createAvailableResouce();
        case UtilPackage.LINUX_OPERTING_SYSTEM_TYPE:
            return createLinuxOpertingSystemType();
        case UtilPackage.MAC_OS_OPERTING_SYSTEM_TYPE:
            return createMacOSOpertingSystemType();
        case UtilPackage.PROCESSOR_ARCHITECTURE_TYPE:
            return createProcessorArchitectureType();
        case UtilPackage.X86_PROCESSOR_ARCHITECTURE:
            return createX86ProcessorArchitecture();
        case UtilPackage.ARM64_PROCESSOR_ARCHITECTURE:
            return createArm64ProcessorArchitecture();
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
        case UtilPackage.RESOURCE_TYPE:
            return createResourceType();
        default:
            throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
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
    public AvailableResouce createAvailableResouce() {
        AvailableResouceImpl availableResouce = new AvailableResouceImpl();
        return availableResouce;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LinuxOpertingSystemType createLinuxOpertingSystemType() {
        LinuxOpertingSystemTypeImpl linuxOpertingSystemType = new LinuxOpertingSystemTypeImpl();
        return linuxOpertingSystemType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MacOSOpertingSystemType createMacOSOpertingSystemType() {
        MacOSOpertingSystemTypeImpl macOSOpertingSystemType = new MacOSOpertingSystemTypeImpl();
        return macOSOpertingSystemType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ProcessorArchitectureType createProcessorArchitectureType() {
        ProcessorArchitectureTypeImpl processorArchitectureType = new ProcessorArchitectureTypeImpl();
        return processorArchitectureType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public X86ProcessorArchitecture createX86ProcessorArchitecture() {
        X86ProcessorArchitectureImpl x86ProcessorArchitecture = new X86ProcessorArchitectureImpl();
        return x86ProcessorArchitecture;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Arm64ProcessorArchitecture createArm64ProcessorArchitecture() {
        Arm64ProcessorArchitectureImpl arm64ProcessorArchitecture = new Arm64ProcessorArchitectureImpl();
        return arm64ProcessorArchitecture;
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
    public ResourceType createResourceType() {
        ResourceTypeImpl resourceType = new ResourceTypeImpl();
        return resourceType;
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
