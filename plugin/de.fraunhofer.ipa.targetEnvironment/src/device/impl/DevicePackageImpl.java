/**
 */
package device.impl;

import base.BasePackage;

import base.impl.BasePackageImpl;

import device.AttributeKind;
import device.CapabilityKind;
import device.CapabilityProperty;
import device.CapabilityType;
import device.CommunicationConnection;
import device.CommunicationType;
import device.ConnectionProperty;
import device.DeviceFactory;
import device.DevicePackage;
import device.DeviceSet;
import device.DeviceType;
import device.MaximumKind;
import device.MinimumKind;
import device.Property;
import device.PropertyType;
import device.SelectionKind;

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
public class DevicePackageImpl extends EPackageImpl implements DevicePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationConnectionEClass = null;

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
	private EClass capabilityPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityKindEClass = null;

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
	private EClass propertyTypeEClass = null;

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
	private EClass connectionPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityTypeEClass = null;

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
	 * @see device.DevicePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DevicePackageImpl() {
		super(eNS_URI, DeviceFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link DevicePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DevicePackage init() {
		if (isInited) return (DevicePackage)EPackage.Registry.INSTANCE.getEPackage(DevicePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDevicePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DevicePackageImpl theDevicePackage = registeredDevicePackage instanceof DevicePackageImpl ? (DevicePackageImpl)registeredDevicePackage : new DevicePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);
		BasePackageImpl theBasePackage = (BasePackageImpl)(registeredPackage instanceof BasePackageImpl ? registeredPackage : BasePackage.eINSTANCE);

		// Create package meta-data objects
		theDevicePackage.createPackageContents();
		theBasePackage.createPackageContents();

		// Initialize created meta-data
		theDevicePackage.initializePackageContents();
		theBasePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDevicePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DevicePackage.eNS_URI, theDevicePackage);
		return theDevicePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceSet() {
		return deviceSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceSet_Device() {
		return (EReference)deviceSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceType() {
		return deviceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceType_Name() {
		return (EAttribute)deviceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceType_Capability() {
		return (EReference)deviceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceType_CommunicationConnection() {
		return (EReference)deviceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommunicationConnection() {
		return communicationConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommunicationConnection_Name() {
		return (EAttribute)communicationConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationConnection_Type() {
		return (EReference)communicationConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommunicationConnection_Properties() {
		return (EReference)communicationConnectionEClass.getEStructuralFeatures().get(2);
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
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProperty_Value() {
		return (EReference)propertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityProperty() {
		return capabilityPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityProperty_Kind() {
		return (EReference)capabilityPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCapabilityProperty_Type() {
		return (EReference)capabilityPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityKind() {
		return capabilityKindEClass;
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
	public EClass getPropertyType() {
		return propertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Name() {
		return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(0);
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
	public EClass getConnectionProperty() {
		return connectionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityType() {
		return capabilityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceFactory getDeviceFactory() {
		return (DeviceFactory)getEFactoryInstance();
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
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		deviceSetEClass = createEClass(DEVICE_SET);
		createEReference(deviceSetEClass, DEVICE_SET__DEVICE);

		deviceTypeEClass = createEClass(DEVICE_TYPE);
		createEAttribute(deviceTypeEClass, DEVICE_TYPE__NAME);
		createEReference(deviceTypeEClass, DEVICE_TYPE__CAPABILITY);
		createEReference(deviceTypeEClass, DEVICE_TYPE__COMMUNICATION_CONNECTION);

		communicationConnectionEClass = createEClass(COMMUNICATION_CONNECTION);
		createEAttribute(communicationConnectionEClass, COMMUNICATION_CONNECTION__NAME);
		createEReference(communicationConnectionEClass, COMMUNICATION_CONNECTION__TYPE);
		createEReference(communicationConnectionEClass, COMMUNICATION_CONNECTION__PROPERTIES);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__NAME);
		createEReference(propertyEClass, PROPERTY__VALUE);

		capabilityPropertyEClass = createEClass(CAPABILITY_PROPERTY);
		createEReference(capabilityPropertyEClass, CAPABILITY_PROPERTY__KIND);
		createEReference(capabilityPropertyEClass, CAPABILITY_PROPERTY__TYPE);

		capabilityKindEClass = createEClass(CAPABILITY_KIND);

		attributeKindEClass = createEClass(ATTRIBUTE_KIND);

		maximumKindEClass = createEClass(MAXIMUM_KIND);

		minimumKindEClass = createEClass(MINIMUM_KIND);

		selectionKindEClass = createEClass(SELECTION_KIND);

		propertyTypeEClass = createEClass(PROPERTY_TYPE);
		createEAttribute(propertyTypeEClass, PROPERTY_TYPE__NAME);

		communicationTypeEClass = createEClass(COMMUNICATION_TYPE);

		connectionPropertyEClass = createEClass(CONNECTION_PROPERTY);

		capabilityTypeEClass = createEClass(CAPABILITY_TYPE);
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
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasePackage theBasePackage = (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		deviceSetEClass.getESuperTypes().add(theBasePackage.getDescription());
		capabilityPropertyEClass.getESuperTypes().add(this.getProperty());
		attributeKindEClass.getESuperTypes().add(this.getCapabilityKind());
		maximumKindEClass.getESuperTypes().add(this.getCapabilityKind());
		minimumKindEClass.getESuperTypes().add(this.getCapabilityKind());
		selectionKindEClass.getESuperTypes().add(this.getCapabilityKind());
		communicationTypeEClass.getESuperTypes().add(this.getPropertyType());
		connectionPropertyEClass.getESuperTypes().add(this.getProperty());
		capabilityTypeEClass.getESuperTypes().add(this.getPropertyType());

		// Initialize classes, features, and operations; add parameters
		initEClass(deviceSetEClass, DeviceSet.class, "DeviceSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceSet_Device(), this.getDeviceType(), null, "device", null, 1, -1, DeviceSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceTypeEClass, DeviceType.class, "DeviceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceType_Name(), ecorePackage.getEString(), "name", null, 1, 1, DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceType_Capability(), this.getCapabilityProperty(), null, "capability", null, 0, -1, DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceType_CommunicationConnection(), this.getCommunicationConnection(), null, "communicationConnection", null, 0, -1, DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationConnectionEClass, CommunicationConnection.class, "CommunicationConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationConnection_Name(), ecorePackage.getEString(), "name", null, 1, 1, CommunicationConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationConnection_Type(), this.getCommunicationType(), null, "type", null, 0, 1, CommunicationConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationConnection_Properties(), this.getConnectionProperty(), null, "properties", null, 0, -1, CommunicationConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProperty_Value(), theBasePackage.getPropertyValue(), null, "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityPropertyEClass, CapabilityProperty.class, "CapabilityProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCapabilityProperty_Kind(), this.getCapabilityKind(), null, "kind", null, 1, 1, CapabilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCapabilityProperty_Type(), this.getCapabilityType(), null, "type", null, 1, 1, CapabilityProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityKindEClass, CapabilityKind.class, "CapabilityKind", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(attributeKindEClass, AttributeKind.class, "AttributeKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(maximumKindEClass, MaximumKind.class, "MaximumKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(minimumKindEClass, MinimumKind.class, "MinimumKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(selectionKindEClass, SelectionKind.class, "SelectionKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(propertyTypeEClass, PropertyType.class, "PropertyType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyType_Name(), ecorePackage.getEString(), "name", null, 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationTypeEClass, CommunicationType.class, "CommunicationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(connectionPropertyEClass, ConnectionProperty.class, "ConnectionProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(capabilityTypeEClass, CapabilityType.class, "CapabilityType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //DevicePackageImpl
