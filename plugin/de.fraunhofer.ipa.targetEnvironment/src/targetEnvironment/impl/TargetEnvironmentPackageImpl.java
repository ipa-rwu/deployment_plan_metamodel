/**
 */
package targetEnvironment.impl;

import base.BasePackage;

import device.DevicePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import targetEnvironment.ConfigConnection;
import targetEnvironment.ConfigConnectionProperty;
import targetEnvironment.ConnectedDevice;
import targetEnvironment.DeviceInstance;
import targetEnvironment.TargetDeployEnviroment;
import targetEnvironment.TargetEnvironment;
import targetEnvironment.TargetEnvironmentFactory;
import targetEnvironment.TargetEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TargetEnvironmentPackageImpl extends EPackageImpl implements TargetEnvironmentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetDeployEnviromentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectedDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configConnectionPropertyEClass = null;

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
	 * @see targetEnvironment.TargetEnvironmentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TargetEnvironmentPackageImpl() {
		super(eNS_URI, TargetEnvironmentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TargetEnvironmentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TargetEnvironmentPackage init() {
		if (isInited) return (TargetEnvironmentPackage)EPackage.Registry.INSTANCE.getEPackage(TargetEnvironmentPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTargetEnvironmentPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TargetEnvironmentPackageImpl theTargetEnvironmentPackage = registeredTargetEnvironmentPackage instanceof TargetEnvironmentPackageImpl ? (TargetEnvironmentPackageImpl)registeredTargetEnvironmentPackage : new TargetEnvironmentPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		DevicePackage.eINSTANCE.eClass();
		BasePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTargetEnvironmentPackage.createPackageContents();

		// Initialize created meta-data
		theTargetEnvironmentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTargetEnvironmentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TargetEnvironmentPackage.eNS_URI, theTargetEnvironmentPackage);
		return theTargetEnvironmentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetDeployEnviroment() {
		return targetDeployEnviromentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetDeployEnviroment_Name() {
		return (EAttribute)targetDeployEnviromentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetDeployEnviroment_IncludeDevice() {
		return (EReference)targetDeployEnviromentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetDeployEnviroment_ConfigConnection() {
		return (EReference)targetDeployEnviromentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigConnection() {
		return configConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfigConnection_Name() {
		return (EAttribute)configConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigConnection_ConnectDevice() {
		return (EReference)configConnectionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceInstance() {
		return deviceInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeviceInstance_Name() {
		return (EAttribute)deviceInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceInstance_RefDeviceType() {
		return (EReference)deviceInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectedDevice() {
		return connectedDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectedDevice_RefDevice() {
		return (EReference)connectedDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectedDevice_RefConnection() {
		return (EReference)connectedDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectedDevice_Properties() {
		return (EReference)connectedDeviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetEnvironment() {
		return targetEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetEnvironment_Type() {
		return (EReference)targetEnvironmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfigConnectionProperty() {
		return configConnectionPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigConnectionProperty_RefConnectionProperty() {
		return (EReference)configConnectionPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConfigConnectionProperty_Value() {
		return (EReference)configConnectionPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetEnvironmentFactory getTargetEnvironmentFactory() {
		return (TargetEnvironmentFactory)getEFactoryInstance();
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
		targetEnvironmentEClass = createEClass(TARGET_ENVIRONMENT);
		createEReference(targetEnvironmentEClass, TARGET_ENVIRONMENT__TYPE);

		targetDeployEnviromentEClass = createEClass(TARGET_DEPLOY_ENVIROMENT);
		createEAttribute(targetDeployEnviromentEClass, TARGET_DEPLOY_ENVIROMENT__NAME);
		createEReference(targetDeployEnviromentEClass, TARGET_DEPLOY_ENVIROMENT__INCLUDE_DEVICE);
		createEReference(targetDeployEnviromentEClass, TARGET_DEPLOY_ENVIROMENT__CONFIG_CONNECTION);

		configConnectionEClass = createEClass(CONFIG_CONNECTION);
		createEAttribute(configConnectionEClass, CONFIG_CONNECTION__NAME);
		createEReference(configConnectionEClass, CONFIG_CONNECTION__CONNECT_DEVICE);

		deviceInstanceEClass = createEClass(DEVICE_INSTANCE);
		createEAttribute(deviceInstanceEClass, DEVICE_INSTANCE__NAME);
		createEReference(deviceInstanceEClass, DEVICE_INSTANCE__REF_DEVICE_TYPE);

		connectedDeviceEClass = createEClass(CONNECTED_DEVICE);
		createEReference(connectedDeviceEClass, CONNECTED_DEVICE__REF_DEVICE);
		createEReference(connectedDeviceEClass, CONNECTED_DEVICE__REF_CONNECTION);
		createEReference(connectedDeviceEClass, CONNECTED_DEVICE__PROPERTIES);

		configConnectionPropertyEClass = createEClass(CONFIG_CONNECTION_PROPERTY);
		createEReference(configConnectionPropertyEClass, CONFIG_CONNECTION_PROPERTY__REF_CONNECTION_PROPERTY);
		createEReference(configConnectionPropertyEClass, CONFIG_CONNECTION_PROPERTY__VALUE);
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
		DevicePackage theDevicePackage = (DevicePackage)EPackage.Registry.INSTANCE.getEPackage(DevicePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		targetDeployEnviromentEClass.getESuperTypes().add(theBasePackage.getDescription());

		// Initialize classes, features, and operations; add parameters
		initEClass(targetEnvironmentEClass, TargetEnvironment.class, "TargetEnvironment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetEnvironment_Type(), theBasePackage.getDescription(), null, "type", null, 1, -1, TargetEnvironment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetDeployEnviromentEClass, TargetDeployEnviroment.class, "TargetDeployEnviroment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTargetDeployEnviroment_Name(), ecorePackage.getEString(), "name", null, 0, 1, TargetDeployEnviroment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetDeployEnviroment_IncludeDevice(), this.getDeviceInstance(), null, "includeDevice", null, 0, -1, TargetDeployEnviroment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTargetDeployEnviroment_ConfigConnection(), this.getConfigConnection(), null, "configConnection", null, 0, -1, TargetDeployEnviroment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configConnectionEClass, ConfigConnection.class, "ConfigConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfigConnection_Name(), ecorePackage.getEString(), "name", null, 1, 1, ConfigConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConfigConnection_ConnectDevice(), this.getConnectedDevice(), null, "connectDevice", null, 2, -1, ConfigConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceInstanceEClass, DeviceInstance.class, "DeviceInstance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeviceInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1, DeviceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceInstance_RefDeviceType(), theDevicePackage.getDeviceType(), null, "refDeviceType", null, 1, 1, DeviceInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(connectedDeviceEClass, ConnectedDevice.class, "ConnectedDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConnectedDevice_RefDevice(), this.getDeviceInstance(), null, "refDevice", null, 1, 1, ConnectedDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectedDevice_RefConnection(), theDevicePackage.getCommunicationConnection(), null, "refConnection", null, 1, 1, ConnectedDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConnectedDevice_Properties(), this.getConfigConnectionProperty(), null, "properties", null, 0, -1, ConnectedDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(configConnectionPropertyEClass, ConfigConnectionProperty.class, "ConfigConnectionProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConfigConnectionProperty_RefConnectionProperty(), theDevicePackage.getConnectionProperty(), null, "refConnectionProperty", null, 1, 1, ConfigConnectionProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		getConfigConnectionProperty_RefConnectionProperty().getEKeys().add(theDevicePackage.getProperty_Name());
		initEReference(getConfigConnectionProperty_Value(), theBasePackage.getPropertyValue(), null, "value", null, 1, 1, ConfigConnectionProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TargetEnvironmentPackageImpl
