/**
 */
package de.fraunhofer.ipa.deployment.util.impl;

import de.fraunhofer.ipa.deployment.util.AbstractCommunicationType;
import de.fraunhofer.ipa.deployment.util.AbstractResouceType;
import de.fraunhofer.ipa.deployment.util.Arm64ProcessorArchitecture;
import de.fraunhofer.ipa.deployment.util.AvailableResouce;
import de.fraunhofer.ipa.deployment.util.CommunicationType;
import de.fraunhofer.ipa.deployment.util.Description;
import de.fraunhofer.ipa.deployment.util.EthernetCommunicationType;
import de.fraunhofer.ipa.deployment.util.LinuxOpertingSystemType;
import de.fraunhofer.ipa.deployment.util.MacOSOpertingSystemType;
import de.fraunhofer.ipa.deployment.util.NetworkCommunicationType;
import de.fraunhofer.ipa.deployment.util.OpertingSystemType;
import de.fraunhofer.ipa.deployment.util.ProcessorArchitecture;
import de.fraunhofer.ipa.deployment.util.ProcessorArchitectureType;
import de.fraunhofer.ipa.deployment.util.ProcessorArchitectureValue;
import de.fraunhofer.ipa.deployment.util.Property;
import de.fraunhofer.ipa.deployment.util.PropertyType;
import de.fraunhofer.ipa.deployment.util.PropertyValue;
import de.fraunhofer.ipa.deployment.util.PropertyValueDouble;
import de.fraunhofer.ipa.deployment.util.PropertyValueInt;
import de.fraunhofer.ipa.deployment.util.PropertyValueString;
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
	private EClass propertyEClass = null;

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
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Name() {
		return (EAttribute) propertyEClass.getEStructuralFeatures().get(0);
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

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEReference(propertyEClass, PROPERTY__VALUE);

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

		opertingSystemTypeEClass = createEClass(OPERTING_SYSTEM_TYPE);

		linuxOpertingSystemTypeEClass = createEClass(LINUX_OPERTING_SYSTEM_TYPE);

		macOSOpertingSystemTypeEClass = createEClass(MAC_OS_OPERTING_SYSTEM_TYPE);

		processorArchitectureTypeEClass = createEClass(PROCESSOR_ARCHITECTURE_TYPE);

		processorArchitectureValueEClass = createEClass(PROCESSOR_ARCHITECTURE_VALUE);

		x86ProcessorArchitectureEClass = createEClass(X86_PROCESSOR_ARCHITECTURE);

		arm64ProcessorArchitectureEClass = createEClass(ARM64_PROCESSOR_ARCHITECTURE);
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

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Value(), this.getPropertyValue(), null, "value", null, 0, 1, Property.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		// Create resource
		createResource(eNS_URI);
	}

} //UtilPackageImpl
