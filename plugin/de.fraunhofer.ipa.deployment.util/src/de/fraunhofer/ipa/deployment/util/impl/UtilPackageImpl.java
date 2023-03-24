/**
 */
package de.fraunhofer.ipa.deployment.util.impl;

import de.fraunhofer.ipa.deployment.util.AbstractCommunicationType;
import de.fraunhofer.ipa.deployment.util.AbstractComputationAssignmentTarget;
import de.fraunhofer.ipa.deployment.util.AbstractImplementation;
import de.fraunhofer.ipa.deployment.util.AbstractProperty;
import de.fraunhofer.ipa.deployment.util.AbstractResouceType;
import de.fraunhofer.ipa.deployment.util.Arm64ProcessorArchitecture;
import de.fraunhofer.ipa.deployment.util.AttributeKind;
import de.fraunhofer.ipa.deployment.util.AvailableResouce;
import de.fraunhofer.ipa.deployment.util.CommunicationType;
import de.fraunhofer.ipa.deployment.util.Description;
import de.fraunhofer.ipa.deployment.util.EthernetCommunicationType;
import de.fraunhofer.ipa.deployment.util.LinuxOpertingSystemType;
import de.fraunhofer.ipa.deployment.util.MacOSOpertingSystemType;
import de.fraunhofer.ipa.deployment.util.MaximumKind;
import de.fraunhofer.ipa.deployment.util.MinimumKind;
import de.fraunhofer.ipa.deployment.util.NetworkCommunicationType;
import de.fraunhofer.ipa.deployment.util.OpertingSystemType;
import de.fraunhofer.ipa.deployment.util.ProcessorArchitecture;
import de.fraunhofer.ipa.deployment.util.ProcessorArchitectureType;
import de.fraunhofer.ipa.deployment.util.ProcessorArchitectureValue;
import de.fraunhofer.ipa.deployment.util.Property;
import de.fraunhofer.ipa.deployment.util.PropertyAttribute;
import de.fraunhofer.ipa.deployment.util.PropertyKind;
import de.fraunhofer.ipa.deployment.util.PropertyMaximun;
import de.fraunhofer.ipa.deployment.util.PropertyMinimum;
import de.fraunhofer.ipa.deployment.util.PropertyRange;
import de.fraunhofer.ipa.deployment.util.PropertySelection;
import de.fraunhofer.ipa.deployment.util.PropertyType;
import de.fraunhofer.ipa.deployment.util.PropertyValue;
import de.fraunhofer.ipa.deployment.util.PropertyValueDouble;
import de.fraunhofer.ipa.deployment.util.PropertyValueInt;
import de.fraunhofer.ipa.deployment.util.PropertyValueString;
import de.fraunhofer.ipa.deployment.util.RangeKind;
import de.fraunhofer.ipa.deployment.util.ResourceType;
import de.fraunhofer.ipa.deployment.util.SelectionKind;
import de.fraunhofer.ipa.deployment.util.UtilFactory;
import de.fraunhofer.ipa.deployment.util.UtilPackage;
import de.fraunhofer.ipa.deployment.util.WlanCommunicationType;
import de.fraunhofer.ipa.deployment.util.X86ProcessorArchitecture;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilPackageImpl extends EPackageImpl implements UtilPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass descriptionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyValueIntEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyValueDoubleEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyValueStringEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractResouceTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processorArchitectureEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractCommunicationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass communicationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass networkCommunicationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ethernetCommunicationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass wlanCommunicationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass availableResouceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass opertingSystemTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass linuxOpertingSystemTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass macOSOpertingSystemTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processorArchitectureTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processorArchitectureValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass x86ProcessorArchitectureEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass arm64ProcessorArchitectureEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractImplementationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractComputationAssignmentTargetEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyKindEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass attributeKindEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass maximumKindEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass minimumKindEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass selectionKindEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass rangeKindEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyMaximunEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyMinimumEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertySelectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyRangeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass resourceTypeEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see de.fraunhofer.ipa.deployment.util.UtilPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private UtilPackageImpl() {
        super(eNS_URI, UtilFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link UtilPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static UtilPackage init() {
        if (isInited)
            return (UtilPackage) EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredUtilPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        UtilPackageImpl theUtilPackage = registeredUtilPackage instanceof UtilPackageImpl
                ? (UtilPackageImpl) registeredUtilPackage
                : new UtilPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        XMLTypePackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theUtilPackage.createPackageContents();

        // Initialize created meta-data
        theUtilPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theUtilPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(UtilPackage.eNS_URI, theUtilPackage);
        return theUtilPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDescription() {
        return descriptionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPropertyValue() {
        return propertyValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPropertyValueInt() {
        return propertyValueIntEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPropertyValueInt_Value() {
        return (EAttribute) propertyValueIntEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPropertyValueDouble() {
        return propertyValueDoubleEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPropertyValueDouble_Value() {
        return (EAttribute) propertyValueDoubleEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPropertyValueString() {
        return propertyValueStringEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPropertyValueString_Value() {
        return (EAttribute) propertyValueStringEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPropertyType() {
        return propertyTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getPropertyType_Type() {
        return (EAttribute) propertyTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractProperty() {
        return abstractPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractProperty_Name() {
        return (EAttribute) abstractPropertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractProperty_Description() {
        return (EAttribute) abstractPropertyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractResouceType() {
        return abstractResouceTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcessorArchitecture() {
        return processorArchitectureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractCommunicationType() {
        return abstractCommunicationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCommunicationType() {
        return communicationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getCommunicationType_Name() {
        return (EAttribute) communicationTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNetworkCommunicationType() {
        return networkCommunicationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getEthernetCommunicationType() {
        return ethernetCommunicationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getWlanCommunicationType() {
        return wlanCommunicationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAvailableResouce() {
        return availableResouceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAvailableResouce_List() {
        return (EReference) availableResouceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAvailableResouce_Property() {
        return (EReference) availableResouceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOpertingSystemType() {
        return opertingSystemTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLinuxOpertingSystemType() {
        return linuxOpertingSystemTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMacOSOpertingSystemType() {
        return macOSOpertingSystemTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcessorArchitectureType() {
        return processorArchitectureTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcessorArchitectureValue() {
        return processorArchitectureValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getX86ProcessorArchitecture() {
        return x86ProcessorArchitectureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getArm64ProcessorArchitecture() {
        return arm64ProcessorArchitectureEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractImplementation() {
        return abstractImplementationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractComputationAssignmentTarget() {
        return abstractComputationAssignmentTargetEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPropertyKind() {
        return propertyKindEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAttributeKind() {
        return attributeKindEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMaximumKind() {
        return maximumKindEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMinimumKind() {
        return minimumKindEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getSelectionKind() {
        return selectionKindEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getRangeKind() {
        return rangeKindEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPropertyAttribute() {
        return propertyAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPropertyAttribute_Kind() {
        return (EReference) propertyAttributeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPropertyAttribute_Value() {
        return (EReference) propertyAttributeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPropertyMaximun() {
        return propertyMaximunEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPropertyMaximun_Kind() {
        return (EReference) propertyMaximunEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPropertyMaximun_Value() {
        return (EReference) propertyMaximunEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPropertyMinimum() {
        return propertyMinimumEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPropertyMinimum_Kind() {
        return (EReference) propertyMinimumEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPropertyMinimum_Value() {
        return (EReference) propertyMinimumEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPropertySelection() {
        return propertySelectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPropertySelection_Kind() {
        return (EReference) propertySelectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPropertySelection_Value() {
        return (EReference) propertySelectionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getPropertyRange() {
        return propertyRangeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPropertyRange_Kind() {
        return (EReference) propertyRangeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPropertyRange_Value() {
        return (EReference) propertyRangeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProperty() {
        return propertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProperty_Kind() {
        return (EReference) propertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProperty_Value() {
        return (EReference) propertyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getResourceType() {
        return resourceTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getResourceType_Name() {
        return (EAttribute) resourceTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UtilFactory getUtilFactory() {
        return (UtilFactory) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        descriptionEClass = createEClass(DESCRIPTION);

        propertyValueEClass = createEClass(PROPERTY_VALUE);

        propertyValueIntEClass = createEClass(PROPERTY_VALUE_INT);
        createEAttribute(propertyValueIntEClass, PROPERTY_VALUE_INT__VALUE);

        propertyValueDoubleEClass = createEClass(PROPERTY_VALUE_DOUBLE);
        createEAttribute(propertyValueDoubleEClass, PROPERTY_VALUE_DOUBLE__VALUE);

        propertyValueStringEClass = createEClass(PROPERTY_VALUE_STRING);
        createEAttribute(propertyValueStringEClass, PROPERTY_VALUE_STRING__VALUE);

        propertyTypeEClass = createEClass(PROPERTY_TYPE);
        createEAttribute(propertyTypeEClass, PROPERTY_TYPE__TYPE);

        abstractPropertyEClass = createEClass(ABSTRACT_PROPERTY);
        createEAttribute(abstractPropertyEClass, ABSTRACT_PROPERTY__NAME);
        createEAttribute(abstractPropertyEClass, ABSTRACT_PROPERTY__DESCRIPTION);

        abstractResouceTypeEClass = createEClass(ABSTRACT_RESOUCE_TYPE);

        processorArchitectureEClass = createEClass(PROCESSOR_ARCHITECTURE);

        abstractCommunicationTypeEClass = createEClass(ABSTRACT_COMMUNICATION_TYPE);

        communicationTypeEClass = createEClass(COMMUNICATION_TYPE);
        createEAttribute(communicationTypeEClass, COMMUNICATION_TYPE__NAME);

        networkCommunicationTypeEClass = createEClass(NETWORK_COMMUNICATION_TYPE);

        ethernetCommunicationTypeEClass = createEClass(ETHERNET_COMMUNICATION_TYPE);

        wlanCommunicationTypeEClass = createEClass(WLAN_COMMUNICATION_TYPE);

        availableResouceEClass = createEClass(AVAILABLE_RESOUCE);
        createEReference(availableResouceEClass, AVAILABLE_RESOUCE__LIST);
        createEReference(availableResouceEClass, AVAILABLE_RESOUCE__PROPERTY);

        opertingSystemTypeEClass = createEClass(OPERTING_SYSTEM_TYPE);

        linuxOpertingSystemTypeEClass = createEClass(LINUX_OPERTING_SYSTEM_TYPE);

        macOSOpertingSystemTypeEClass = createEClass(MAC_OS_OPERTING_SYSTEM_TYPE);

        processorArchitectureTypeEClass = createEClass(PROCESSOR_ARCHITECTURE_TYPE);

        processorArchitectureValueEClass = createEClass(PROCESSOR_ARCHITECTURE_VALUE);

        x86ProcessorArchitectureEClass = createEClass(X86_PROCESSOR_ARCHITECTURE);

        arm64ProcessorArchitectureEClass = createEClass(ARM64_PROCESSOR_ARCHITECTURE);

        abstractImplementationEClass = createEClass(ABSTRACT_IMPLEMENTATION);

        abstractComputationAssignmentTargetEClass = createEClass(ABSTRACT_COMPUTATION_ASSIGNMENT_TARGET);

        propertyKindEClass = createEClass(PROPERTY_KIND);

        attributeKindEClass = createEClass(ATTRIBUTE_KIND);

        maximumKindEClass = createEClass(MAXIMUM_KIND);

        minimumKindEClass = createEClass(MINIMUM_KIND);

        selectionKindEClass = createEClass(SELECTION_KIND);

        rangeKindEClass = createEClass(RANGE_KIND);

        propertyAttributeEClass = createEClass(PROPERTY_ATTRIBUTE);
        createEReference(propertyAttributeEClass, PROPERTY_ATTRIBUTE__KIND);
        createEReference(propertyAttributeEClass, PROPERTY_ATTRIBUTE__VALUE);

        propertyMaximunEClass = createEClass(PROPERTY_MAXIMUN);
        createEReference(propertyMaximunEClass, PROPERTY_MAXIMUN__KIND);
        createEReference(propertyMaximunEClass, PROPERTY_MAXIMUN__VALUE);

        propertyMinimumEClass = createEClass(PROPERTY_MINIMUM);
        createEReference(propertyMinimumEClass, PROPERTY_MINIMUM__KIND);
        createEReference(propertyMinimumEClass, PROPERTY_MINIMUM__VALUE);

        propertySelectionEClass = createEClass(PROPERTY_SELECTION);
        createEReference(propertySelectionEClass, PROPERTY_SELECTION__KIND);
        createEReference(propertySelectionEClass, PROPERTY_SELECTION__VALUE);

        propertyRangeEClass = createEClass(PROPERTY_RANGE);
        createEReference(propertyRangeEClass, PROPERTY_RANGE__KIND);
        createEReference(propertyRangeEClass, PROPERTY_RANGE__VALUE);

        propertyEClass = createEClass(PROPERTY);
        createEReference(propertyEClass, PROPERTY__KIND);
        createEReference(propertyEClass, PROPERTY__VALUE);

        resourceTypeEClass = createEClass(RESOURCE_TYPE);
        createEAttribute(resourceTypeEClass, RESOURCE_TYPE__NAME);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
                .getEPackage(XMLTypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        propertyValueIntEClass.getESuperTypes().add(this.getPropertyValue());
        propertyValueDoubleEClass.getESuperTypes().add(this.getPropertyValue());
        propertyValueStringEClass.getESuperTypes().add(this.getPropertyValue());
        processorArchitectureEClass.getESuperTypes().add(this.getAbstractResouceType());
        communicationTypeEClass.getESuperTypes().add(this.getAbstractCommunicationType());
        networkCommunicationTypeEClass.getESuperTypes().add(this.getAbstractCommunicationType());
        ethernetCommunicationTypeEClass.getESuperTypes().add(this.getNetworkCommunicationType());
        wlanCommunicationTypeEClass.getESuperTypes().add(this.getNetworkCommunicationType());
        opertingSystemTypeEClass.getESuperTypes().add(this.getAbstractResouceType());
        linuxOpertingSystemTypeEClass.getESuperTypes().add(this.getOpertingSystemType());
        macOSOpertingSystemTypeEClass.getESuperTypes().add(this.getOpertingSystemType());
        processorArchitectureTypeEClass.getESuperTypes().add(this.getAbstractResouceType());
        processorArchitectureValueEClass.getESuperTypes().add(this.getPropertyValue());
        x86ProcessorArchitectureEClass.getESuperTypes().add(this.getProcessorArchitectureValue());
        arm64ProcessorArchitectureEClass.getESuperTypes().add(this.getProcessorArchitectureValue());
        attributeKindEClass.getESuperTypes().add(this.getPropertyKind());
        maximumKindEClass.getESuperTypes().add(this.getPropertyKind());
        minimumKindEClass.getESuperTypes().add(this.getPropertyKind());
        selectionKindEClass.getESuperTypes().add(this.getPropertyKind());
        rangeKindEClass.getESuperTypes().add(this.getPropertyKind());
        propertyAttributeEClass.getESuperTypes().add(this.getAbstractProperty());
        propertyMaximunEClass.getESuperTypes().add(this.getAbstractProperty());
        propertyMinimumEClass.getESuperTypes().add(this.getAbstractProperty());
        propertySelectionEClass.getESuperTypes().add(this.getAbstractProperty());
        propertyRangeEClass.getESuperTypes().add(this.getAbstractProperty());
        propertyEClass.getESuperTypes().add(this.getAbstractProperty());
        resourceTypeEClass.getESuperTypes().add(this.getAbstractResouceType());

        // Initialize classes, features, and operations; add parameters
        initEClass(descriptionEClass, Description.class, "Description", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(propertyValueEClass, PropertyValue.class, "PropertyValue", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(propertyValueIntEClass, PropertyValueInt.class, "PropertyValueInt", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPropertyValueInt_Value(), theXMLTypePackage.getInt(), "value", null, 1, 1,
                PropertyValueInt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(propertyValueDoubleEClass, PropertyValueDouble.class, "PropertyValueDouble", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPropertyValueDouble_Value(), theXMLTypePackage.getDouble(), "value", null, 1, 1,
                PropertyValueDouble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertyValueStringEClass, PropertyValueString.class, "PropertyValueString", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPropertyValueString_Value(), ecorePackage.getEString(), "value", null, 1, 1,
                PropertyValueString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertyTypeEClass, PropertyType.class, "PropertyType", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getPropertyType_Type(), ecorePackage.getEString(), "type", null, 0, 1, PropertyType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractPropertyEClass, AbstractProperty.class, "AbstractProperty", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAbstractProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1,
                AbstractProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);
        initEAttribute(getAbstractProperty_Description(), ecorePackage.getEString(), "description", null, 0, 1,
                AbstractProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(abstractResouceTypeEClass, AbstractResouceType.class, "AbstractResouceType", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(processorArchitectureEClass, ProcessorArchitecture.class, "ProcessorArchitecture", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(abstractCommunicationTypeEClass, AbstractCommunicationType.class, "AbstractCommunicationType",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(communicationTypeEClass, CommunicationType.class, "CommunicationType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCommunicationType_Name(), ecorePackage.getEString(), "name", "Ethernet", 0, 1,
                CommunicationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(networkCommunicationTypeEClass, NetworkCommunicationType.class, "NetworkCommunicationType",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(ethernetCommunicationTypeEClass, EthernetCommunicationType.class, "EthernetCommunicationType",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(wlanCommunicationTypeEClass, WlanCommunicationType.class, "WlanCommunicationType", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(availableResouceEClass, AvailableResouce.class, "AvailableResouce", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getAvailableResouce_List(), this.getAbstractResouceType(), null, "list", null, 0, -1,
                AvailableResouce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAvailableResouce_Property(), this.getAbstractProperty(), null, "property", null, 0, 1,
                AvailableResouce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(opertingSystemTypeEClass, OpertingSystemType.class, "OpertingSystemType", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(linuxOpertingSystemTypeEClass, LinuxOpertingSystemType.class, "LinuxOpertingSystemType",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(macOSOpertingSystemTypeEClass, MacOSOpertingSystemType.class, "MacOSOpertingSystemType",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(processorArchitectureTypeEClass, ProcessorArchitectureType.class, "ProcessorArchitectureType",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(processorArchitectureValueEClass, ProcessorArchitectureValue.class, "ProcessorArchitectureValue",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(x86ProcessorArchitectureEClass, X86ProcessorArchitecture.class, "X86ProcessorArchitecture",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(arm64ProcessorArchitectureEClass, Arm64ProcessorArchitecture.class, "Arm64ProcessorArchitecture",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(abstractImplementationEClass, AbstractImplementation.class, "AbstractImplementation", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(abstractComputationAssignmentTargetEClass, AbstractComputationAssignmentTarget.class,
                "AbstractComputationAssignmentTarget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(propertyKindEClass, PropertyKind.class, "PropertyKind", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(attributeKindEClass, AttributeKind.class, "AttributeKind", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(maximumKindEClass, MaximumKind.class, "MaximumKind", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(minimumKindEClass, MinimumKind.class, "MinimumKind", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(selectionKindEClass, SelectionKind.class, "SelectionKind", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(rangeKindEClass, RangeKind.class, "RangeKind", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(propertyAttributeEClass, PropertyAttribute.class, "PropertyAttribute", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPropertyAttribute_Kind(), this.getAttributeKind(), null, "kind", null, 1, 1,
                PropertyAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPropertyAttribute_Value(), this.getPropertyValue(), null, "value", null, 0, 1,
                PropertyAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertyMaximunEClass, PropertyMaximun.class, "PropertyMaximun", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPropertyMaximun_Kind(), this.getMaximumKind(), null, "kind", null, 1, 1,
                PropertyMaximun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPropertyMaximun_Value(), this.getPropertyValue(), null, "value", null, 0, 1,
                PropertyMaximun.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertyMinimumEClass, PropertyMinimum.class, "PropertyMinimum", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPropertyMinimum_Kind(), this.getMinimumKind(), null, "kind", null, 1, 1,
                PropertyMinimum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPropertyMinimum_Value(), this.getPropertyValue(), null, "value", null, 0, 1,
                PropertyMinimum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertySelectionEClass, PropertySelection.class, "PropertySelection", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPropertySelection_Kind(), this.getSelectionKind(), null, "kind", null, 1, 1,
                PropertySelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPropertySelection_Value(), this.getPropertyValue(), null, "value", null, 0, -1,
                PropertySelection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertyRangeEClass, PropertyRange.class, "PropertyRange", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPropertyRange_Kind(), this.getRangeKind(), null, "kind", null, 1, 1, PropertyRange.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getPropertyRange_Value(), this.getPropertyValue(), null, "value", null, 0, 2,
                PropertyRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProperty_Kind(), this.getPropertyKind(), null, "kind", null, 1, 1, Property.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProperty_Value(), this.getPropertyValue(), null, "value", null, 0, 2, Property.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(resourceTypeEClass, ResourceType.class, "ResourceType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getResourceType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResourceType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //UtilPackageImpl
