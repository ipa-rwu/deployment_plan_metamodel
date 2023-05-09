/**
 */
package de.fraunhofer.ipa.deployment.util.impl;

import de.fraunhofer.ipa.deployment.util.AbstractCommunicationType;
import de.fraunhofer.ipa.deployment.util.AbstractComputationAssignmentTarget;
import de.fraunhofer.ipa.deployment.util.AbstractComputationResource;
import de.fraunhofer.ipa.deployment.util.AbstractImplementation;
import de.fraunhofer.ipa.deployment.util.AbstractOperatingSystemProperty;
import de.fraunhofer.ipa.deployment.util.AbstractProperty;
import de.fraunhofer.ipa.deployment.util.AbstractResouceType;
import de.fraunhofer.ipa.deployment.util.AbstractResource;
import de.fraunhofer.ipa.deployment.util.AbstractRuntimeEnviroment;
import de.fraunhofer.ipa.deployment.util.AttributeKind;
import de.fraunhofer.ipa.deployment.util.CommunicationType;
import de.fraunhofer.ipa.deployment.util.Description;
import de.fraunhofer.ipa.deployment.util.EthernetCommunicationType;
import de.fraunhofer.ipa.deployment.util.LinuxDistribution;
import de.fraunhofer.ipa.deployment.util.LinuxDistributionValue;
import de.fraunhofer.ipa.deployment.util.LinuxOpertingSystem;
import de.fraunhofer.ipa.deployment.util.MacOSOpertingSystem;
import de.fraunhofer.ipa.deployment.util.MaximumKind;
import de.fraunhofer.ipa.deployment.util.MinimumKind;
import de.fraunhofer.ipa.deployment.util.NameOperatingSystemProperty;
import de.fraunhofer.ipa.deployment.util.NetworkCommunicationType;
import de.fraunhofer.ipa.deployment.util.OperatingSystemResouce;
import de.fraunhofer.ipa.deployment.util.OpertingSystemName;
import de.fraunhofer.ipa.deployment.util.OpertingSystemResouceType;
import de.fraunhofer.ipa.deployment.util.ProcessorArchitectureType;
import de.fraunhofer.ipa.deployment.util.ProcessorArchitectureValue;
import de.fraunhofer.ipa.deployment.util.ProcessorResouceType;
import de.fraunhofer.ipa.deployment.util.Property;
import de.fraunhofer.ipa.deployment.util.PropertyAttribute;
import de.fraunhofer.ipa.deployment.util.PropertyKind;
import de.fraunhofer.ipa.deployment.util.PropertyMaximun;
import de.fraunhofer.ipa.deployment.util.PropertyMinimum;
import de.fraunhofer.ipa.deployment.util.PropertyRange;
import de.fraunhofer.ipa.deployment.util.PropertySelection;
import de.fraunhofer.ipa.deployment.util.PropertyValue;
import de.fraunhofer.ipa.deployment.util.PropertyValueDouble;
import de.fraunhofer.ipa.deployment.util.PropertyValueInt;
import de.fraunhofer.ipa.deployment.util.PropertyValueList;
import de.fraunhofer.ipa.deployment.util.PropertyValueString;
import de.fraunhofer.ipa.deployment.util.RangeKind;
import de.fraunhofer.ipa.deployment.util.Resource;
import de.fraunhofer.ipa.deployment.util.ResourceType;
import de.fraunhofer.ipa.deployment.util.RunTimeType;
import de.fraunhofer.ipa.deployment.util.SelectionKind;
import de.fraunhofer.ipa.deployment.util.UbuntuVersion;
import de.fraunhofer.ipa.deployment.util.UbuntuVersionValue;
import de.fraunhofer.ipa.deployment.util.UsbCommunicationType;
import de.fraunhofer.ipa.deployment.util.UtilFactory;
import de.fraunhofer.ipa.deployment.util.UtilPackage;
import de.fraunhofer.ipa.deployment.util.VersionOperatingSystemProperty;
import de.fraunhofer.ipa.deployment.util.WlanCommunicationType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
    private EClass abstractCommunicationTypeEClass = null;

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
    private EClass abstractResourceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractRuntimeEnviromentEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass opertingSystemResouceTypeEClass = null;

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
    private EClass descriptionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass resourceEClass = null;

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
    private EClass usbCommunicationTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass linuxOpertingSystemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass macOSOpertingSystemEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass processorResouceTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass resourceTypeEClass = null;

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
    private EClass linuxDistributionValueEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ubuntuVersionValueEClass = null;

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
    private EClass propertyKindEClass = null;

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
    private EClass propertyValueListEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass opertingSystemNameEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass operatingSystemResouceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractOperatingSystemPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractComputationResourceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass versionOperatingSystemPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass nameOperatingSystemPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum ubuntuVersionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum linuxDistributionEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum runTimeTypeEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum processorArchitectureTypeEEnum = null;

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
    public EClass getAbstractCommunicationType() {
        return abstractCommunicationTypeEClass;
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
    public EClass getAbstractResource() {
        return abstractResourceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractResource_Name() {
        return (EAttribute) abstractResourceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractRuntimeEnviroment() {
        return abstractRuntimeEnviromentEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOpertingSystemResouceType() {
        return opertingSystemResouceTypeEClass;
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
    public EClass getDescription() {
        return descriptionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getResource() {
        return resourceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getResource_Type() {
        return (EReference) resourceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getResource_Properties() {
        return (EReference) resourceEClass.getEStructuralFeatures().get(1);
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
    public EClass getUsbCommunicationType() {
        return usbCommunicationTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLinuxOpertingSystem() {
        return linuxOpertingSystemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMacOSOpertingSystem() {
        return macOSOpertingSystemEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcessorResouceType() {
        return processorResouceTypeEClass;
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
    public EClass getProcessorArchitectureValue() {
        return processorArchitectureValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getProcessorArchitectureValue_Value() {
        return (EAttribute) processorArchitectureValueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getLinuxDistributionValue() {
        return linuxDistributionValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getLinuxDistributionValue_Value() {
        return (EAttribute) linuxDistributionValueEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getUbuntuVersionValue() {
        return ubuntuVersionValueEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getUbuntuVersionValue_Value() {
        return (EAttribute) ubuntuVersionValueEClass.getEStructuralFeatures().get(0);
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
    public EClass getPropertyKind() {
        return propertyKindEClass;
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
    public EClass getPropertyValueList() {
        return propertyValueListEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getPropertyValueList_Value() {
        return (EReference) propertyValueListEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOpertingSystemName() {
        return opertingSystemNameEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getOperatingSystemResouce() {
        return operatingSystemResouceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOperatingSystemResouce_Type() {
        return (EReference) operatingSystemResouceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOperatingSystemResouce_Properties() {
        return (EReference) operatingSystemResouceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractOperatingSystemProperty() {
        return abstractOperatingSystemPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractComputationResource() {
        return abstractComputationResourceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getVersionOperatingSystemProperty() {
        return versionOperatingSystemPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNameOperatingSystemProperty() {
        return nameOperatingSystemPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getUbuntuVersion() {
        return ubuntuVersionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getLinuxDistribution() {
        return linuxDistributionEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getRunTimeType() {
        return runTimeTypeEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EEnum getProcessorArchitectureType() {
        return processorArchitectureTypeEEnum;
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
        abstractPropertyEClass = createEClass(ABSTRACT_PROPERTY);
        createEAttribute(abstractPropertyEClass, ABSTRACT_PROPERTY__NAME);
        createEAttribute(abstractPropertyEClass, ABSTRACT_PROPERTY__DESCRIPTION);

        abstractResouceTypeEClass = createEClass(ABSTRACT_RESOUCE_TYPE);

        abstractCommunicationTypeEClass = createEClass(ABSTRACT_COMMUNICATION_TYPE);

        abstractImplementationEClass = createEClass(ABSTRACT_IMPLEMENTATION);

        abstractComputationAssignmentTargetEClass = createEClass(ABSTRACT_COMPUTATION_ASSIGNMENT_TARGET);

        abstractResourceEClass = createEClass(ABSTRACT_RESOURCE);
        createEAttribute(abstractResourceEClass, ABSTRACT_RESOURCE__NAME);

        abstractRuntimeEnviromentEClass = createEClass(ABSTRACT_RUNTIME_ENVIROMENT);

        opertingSystemResouceTypeEClass = createEClass(OPERTING_SYSTEM_RESOUCE_TYPE);

        propertyValueEClass = createEClass(PROPERTY_VALUE);

        descriptionEClass = createEClass(DESCRIPTION);

        resourceEClass = createEClass(RESOURCE);
        createEReference(resourceEClass, RESOURCE__TYPE);
        createEReference(resourceEClass, RESOURCE__PROPERTIES);

        communicationTypeEClass = createEClass(COMMUNICATION_TYPE);
        createEAttribute(communicationTypeEClass, COMMUNICATION_TYPE__NAME);

        networkCommunicationTypeEClass = createEClass(NETWORK_COMMUNICATION_TYPE);

        ethernetCommunicationTypeEClass = createEClass(ETHERNET_COMMUNICATION_TYPE);

        wlanCommunicationTypeEClass = createEClass(WLAN_COMMUNICATION_TYPE);

        usbCommunicationTypeEClass = createEClass(USB_COMMUNICATION_TYPE);

        linuxOpertingSystemEClass = createEClass(LINUX_OPERTING_SYSTEM);

        macOSOpertingSystemEClass = createEClass(MAC_OS_OPERTING_SYSTEM);

        processorResouceTypeEClass = createEClass(PROCESSOR_RESOUCE_TYPE);

        resourceTypeEClass = createEClass(RESOURCE_TYPE);
        createEAttribute(resourceTypeEClass, RESOURCE_TYPE__NAME);

        processorArchitectureValueEClass = createEClass(PROCESSOR_ARCHITECTURE_VALUE);
        createEAttribute(processorArchitectureValueEClass, PROCESSOR_ARCHITECTURE_VALUE__VALUE);

        linuxDistributionValueEClass = createEClass(LINUX_DISTRIBUTION_VALUE);
        createEAttribute(linuxDistributionValueEClass, LINUX_DISTRIBUTION_VALUE__VALUE);

        ubuntuVersionValueEClass = createEClass(UBUNTU_VERSION_VALUE);
        createEAttribute(ubuntuVersionValueEClass, UBUNTU_VERSION_VALUE__VALUE);

        attributeKindEClass = createEClass(ATTRIBUTE_KIND);

        maximumKindEClass = createEClass(MAXIMUM_KIND);

        minimumKindEClass = createEClass(MINIMUM_KIND);

        selectionKindEClass = createEClass(SELECTION_KIND);

        rangeKindEClass = createEClass(RANGE_KIND);

        propertyKindEClass = createEClass(PROPERTY_KIND);

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

        propertyValueIntEClass = createEClass(PROPERTY_VALUE_INT);
        createEAttribute(propertyValueIntEClass, PROPERTY_VALUE_INT__VALUE);

        propertyValueDoubleEClass = createEClass(PROPERTY_VALUE_DOUBLE);
        createEAttribute(propertyValueDoubleEClass, PROPERTY_VALUE_DOUBLE__VALUE);

        propertyValueStringEClass = createEClass(PROPERTY_VALUE_STRING);
        createEAttribute(propertyValueStringEClass, PROPERTY_VALUE_STRING__VALUE);

        propertyValueListEClass = createEClass(PROPERTY_VALUE_LIST);
        createEReference(propertyValueListEClass, PROPERTY_VALUE_LIST__VALUE);

        opertingSystemNameEClass = createEClass(OPERTING_SYSTEM_NAME);

        operatingSystemResouceEClass = createEClass(OPERATING_SYSTEM_RESOUCE);
        createEReference(operatingSystemResouceEClass, OPERATING_SYSTEM_RESOUCE__TYPE);
        createEReference(operatingSystemResouceEClass, OPERATING_SYSTEM_RESOUCE__PROPERTIES);

        abstractOperatingSystemPropertyEClass = createEClass(ABSTRACT_OPERATING_SYSTEM_PROPERTY);

        abstractComputationResourceEClass = createEClass(ABSTRACT_COMPUTATION_RESOURCE);

        versionOperatingSystemPropertyEClass = createEClass(VERSION_OPERATING_SYSTEM_PROPERTY);

        nameOperatingSystemPropertyEClass = createEClass(NAME_OPERATING_SYSTEM_PROPERTY);

        // Create enums
        ubuntuVersionEEnum = createEEnum(UBUNTU_VERSION);
        linuxDistributionEEnum = createEEnum(LINUX_DISTRIBUTION);
        runTimeTypeEEnum = createEEnum(RUN_TIME_TYPE);
        processorArchitectureTypeEEnum = createEEnum(PROCESSOR_ARCHITECTURE_TYPE);
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
        resourceEClass.getESuperTypes().add(this.getAbstractResource());
        communicationTypeEClass.getESuperTypes().add(this.getAbstractCommunicationType());
        networkCommunicationTypeEClass.getESuperTypes().add(this.getAbstractCommunicationType());
        ethernetCommunicationTypeEClass.getESuperTypes().add(this.getNetworkCommunicationType());
        wlanCommunicationTypeEClass.getESuperTypes().add(this.getNetworkCommunicationType());
        usbCommunicationTypeEClass.getESuperTypes().add(this.getAbstractCommunicationType());
        linuxOpertingSystemEClass.getESuperTypes().add(this.getOpertingSystemResouceType());
        macOSOpertingSystemEClass.getESuperTypes().add(this.getOpertingSystemResouceType());
        processorResouceTypeEClass.getESuperTypes().add(this.getAbstractResouceType());
        resourceTypeEClass.getESuperTypes().add(this.getAbstractResouceType());
        processorArchitectureValueEClass.getESuperTypes().add(this.getPropertyValue());
        linuxDistributionValueEClass.getESuperTypes().add(this.getPropertyValue());
        linuxDistributionValueEClass.getESuperTypes().add(this.getOpertingSystemName());
        ubuntuVersionValueEClass.getESuperTypes().add(this.getPropertyValue());
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
        propertyValueIntEClass.getESuperTypes().add(this.getPropertyValue());
        propertyValueDoubleEClass.getESuperTypes().add(this.getPropertyValue());
        propertyValueStringEClass.getESuperTypes().add(this.getPropertyValue());
        propertyValueListEClass.getESuperTypes().add(this.getPropertyValue());
        operatingSystemResouceEClass.getESuperTypes().add(this.getAbstractComputationResource());
        abstractComputationResourceEClass.getESuperTypes().add(this.getAbstractResource());
        versionOperatingSystemPropertyEClass.getESuperTypes().add(this.getPropertyAttribute());
        versionOperatingSystemPropertyEClass.getESuperTypes().add(this.getAbstractOperatingSystemProperty());
        nameOperatingSystemPropertyEClass.getESuperTypes().add(this.getPropertyAttribute());
        nameOperatingSystemPropertyEClass.getESuperTypes().add(this.getAbstractOperatingSystemProperty());

        // Initialize classes, features, and operations; add parameters
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

        initEClass(abstractCommunicationTypeEClass, AbstractCommunicationType.class, "AbstractCommunicationType",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(abstractImplementationEClass, AbstractImplementation.class, "AbstractImplementation", IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(abstractComputationAssignmentTargetEClass, AbstractComputationAssignmentTarget.class,
                "AbstractComputationAssignmentTarget", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(abstractResourceEClass, AbstractResource.class, "AbstractResource", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAbstractResource_Name(), ecorePackage.getEString(), "name", null, 1, 1,
                AbstractResource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

        initEClass(abstractRuntimeEnviromentEClass, AbstractRuntimeEnviroment.class, "AbstractRuntimeEnviroment",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(opertingSystemResouceTypeEClass, OpertingSystemResouceType.class, "OpertingSystemResouceType",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(propertyValueEClass, PropertyValue.class, "PropertyValue", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(descriptionEClass, Description.class, "Description", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getResource_Type(), this.getAbstractResouceType(), null, "type", null, 1, 1, Resource.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getResource_Properties(), this.getAbstractProperty(), null, "properties", null, 0, -1,
                Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

        initEClass(usbCommunicationTypeEClass, UsbCommunicationType.class, "UsbCommunicationType", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(linuxOpertingSystemEClass, LinuxOpertingSystem.class, "LinuxOpertingSystem", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(macOSOpertingSystemEClass, MacOSOpertingSystem.class, "MacOSOpertingSystem", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(processorResouceTypeEClass, ProcessorResouceType.class, "ProcessorResouceType", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(resourceTypeEClass, ResourceType.class, "ResourceType", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getResourceType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ResourceType.class,
                !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(processorArchitectureValueEClass, ProcessorArchitectureValue.class, "ProcessorArchitectureValue",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProcessorArchitectureValue_Value(), this.getProcessorArchitectureType(), "value", null, 1, 1,
                ProcessorArchitectureValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(linuxDistributionValueEClass, LinuxDistributionValue.class, "LinuxDistributionValue", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getLinuxDistributionValue_Value(), this.getLinuxDistribution(), "value", null, 1, 1,
                LinuxDistributionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
                IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(ubuntuVersionValueEClass, UbuntuVersionValue.class, "UbuntuVersionValue", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getUbuntuVersionValue_Value(), this.getUbuntuVersion(), "value", null, 1, 1,
                UbuntuVersionValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
                !IS_DERIVED, IS_ORDERED);

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

        initEClass(propertyKindEClass, PropertyKind.class, "PropertyKind", IS_ABSTRACT, !IS_INTERFACE,
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

        initEClass(propertyValueListEClass, PropertyValueList.class, "PropertyValueList", !IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);
        initEReference(getPropertyValueList_Value(), this.getPropertyValue(), null, "value", null, 1, -1,
                PropertyValueList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
                !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(opertingSystemNameEClass, OpertingSystemName.class, "OpertingSystemName", IS_ABSTRACT, !IS_INTERFACE,
                IS_GENERATED_INSTANCE_CLASS);

        initEClass(operatingSystemResouceEClass, OperatingSystemResouce.class, "OperatingSystemResouce", !IS_ABSTRACT,
                !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOperatingSystemResouce_Type(), this.getOpertingSystemResouceType(), null, "type", null, 0, 1,
                OperatingSystemResouce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
                !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOperatingSystemResouce_Properties(), this.getAbstractOperatingSystemProperty(), null,
                "properties", null, 1, -1, OperatingSystemResouce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
                IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractOperatingSystemPropertyEClass, AbstractOperatingSystemProperty.class,
                "AbstractOperatingSystemProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(abstractComputationResourceEClass, AbstractComputationResource.class, "AbstractComputationResource",
                IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(versionOperatingSystemPropertyEClass, VersionOperatingSystemProperty.class,
                "VersionOperatingSystemProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(nameOperatingSystemPropertyEClass, NameOperatingSystemProperty.class, "NameOperatingSystemProperty",
                !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Initialize enums and add enum literals
        initEEnum(ubuntuVersionEEnum, UbuntuVersion.class, "UbuntuVersion");
        addEEnumLiteral(ubuntuVersionEEnum, UbuntuVersion.FOCAL);
        addEEnumLiteral(ubuntuVersionEEnum, UbuntuVersion.JAMMY);

        initEEnum(linuxDistributionEEnum, LinuxDistribution.class, "LinuxDistribution");
        addEEnumLiteral(linuxDistributionEEnum, LinuxDistribution.UBUNTU);
        addEEnumLiteral(linuxDistributionEEnum, LinuxDistribution.DEBIAN);

        initEEnum(runTimeTypeEEnum, RunTimeType.class, "RunTimeType");
        addEEnumLiteral(runTimeTypeEEnum, RunTimeType.CONTAINER);

        initEEnum(processorArchitectureTypeEEnum, ProcessorArchitectureType.class, "ProcessorArchitectureType");
        addEEnumLiteral(processorArchitectureTypeEEnum, ProcessorArchitectureType.X86);
        addEEnumLiteral(processorArchitectureTypeEEnum, ProcessorArchitectureType.ARM64);
        addEEnumLiteral(processorArchitectureTypeEEnum, ProcessorArchitectureType.ARM64V8);
        addEEnumLiteral(processorArchitectureTypeEEnum, ProcessorArchitectureType.ARM32);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http://www.obeo.fr/dsl/dnc/archetype
        createArchetypeAnnotations();
    }

    /**
     * Initializes the annotations for <b>http://www.obeo.fr/dsl/dnc/archetype</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createArchetypeAnnotations() {
        String source = "http://www.obeo.fr/dsl/dnc/archetype";
        addAnnotation(abstractComputationAssignmentTargetEClass, source, new String[] { "archetype", "Description" });
    }

} //UtilPackageImpl
