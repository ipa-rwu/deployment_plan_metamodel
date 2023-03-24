/**
 */
package device.impl;

import de.fraunhofer.ipa.deployment.util.UtilPackage;

import device.AbstractCommunicationConnection;
import device.AbstractDeviceConfig;
import device.AbstractDeviceType;
import device.AbstractNetworkProperty;
import device.AddressNetworkProperty;
import device.AttributeKind;
import device.CapabilityKind;
import device.CapabilityType;
import device.CommunicationConnection;
import device.ComputationDeviceType;
import device.ConnectionProperty;
import device.DeviceFactory;
import device.DevicePackage;
import device.DeviceProperty;
import device.DeviceSet;
import device.DeviceType;
import device.DeviceTypeRef;
import device.InterfaceNetworkProperty;
import device.MacNetworkProperty;
import device.MaximumKind;
import device.MinimumKind;
import device.NetworkConnection;
import device.RangeKind;
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
    private EClass devicePropertyEClass = null;

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
    private EClass rangeKindEClass = null;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass computationDeviceTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractCommunicationConnectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass networkConnectionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractNetworkPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass interfaceNetworkPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass addressNetworkPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractDeviceConfigEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass deviceTypeRefEClass = null;

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstractDeviceTypeEClass = null;

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass macNetworkPropertyEClass = null;

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
        UtilPackage.eINSTANCE.eClass();
        XMLTypePackage.eINSTANCE.eClass();

        // Create package meta-data objects
        theDevicePackage.createPackageContents();

        // Initialize created meta-data
        theDevicePackage.initializePackageContents();

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
    public EReference getDeviceType_DeviceProperty() {
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
    public EClass getDeviceProperty() {
        return devicePropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDeviceProperty_Type() {
        return (EReference)devicePropertyEClass.getEStructuralFeatures().get(0);
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
    public EReference getCommunicationConnection_Type() {
        return (EReference)communicationConnectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getCommunicationConnection_Properties() {
        return (EReference)communicationConnectionEClass.getEStructuralFeatures().get(1);
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
    public EClass getRangeKind() {
        return rangeKindEClass;
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
    public EAttribute getCapabilityType_Name() {
        return (EAttribute)capabilityTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getComputationDeviceType() {
        return computationDeviceTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractCommunicationConnection() {
        return abstractCommunicationConnectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractCommunicationConnection_Name() {
        return (EAttribute)abstractCommunicationConnectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getNetworkConnection() {
        return networkConnectionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNetworkConnection_Type() {
        return (EReference)networkConnectionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getNetworkConnection_Properties() {
        return (EReference)networkConnectionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractNetworkProperty() {
        return abstractNetworkPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getInterfaceNetworkProperty() {
        return interfaceNetworkPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAddressNetworkProperty() {
        return addressNetworkPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractDeviceConfig() {
        return abstractDeviceConfigEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDeviceTypeRef() {
        return deviceTypeRefEClass;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getDeviceTypeRef_DeviceType() {
        return (EReference)deviceTypeRefEClass.getEStructuralFeatures().get(0);
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstractDeviceType() {
        return abstractDeviceTypeEClass;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getMacNetworkProperty() {
        return macNetworkPropertyEClass;
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
        createEReference(deviceTypeEClass, DEVICE_TYPE__DEVICE_PROPERTY);
        createEReference(deviceTypeEClass, DEVICE_TYPE__COMMUNICATION_CONNECTION);

        devicePropertyEClass = createEClass(DEVICE_PROPERTY);
        createEReference(devicePropertyEClass, DEVICE_PROPERTY__TYPE);

        communicationConnectionEClass = createEClass(COMMUNICATION_CONNECTION);
        createEReference(communicationConnectionEClass, COMMUNICATION_CONNECTION__TYPE);
        createEReference(communicationConnectionEClass, COMMUNICATION_CONNECTION__PROPERTIES);

        capabilityKindEClass = createEClass(CAPABILITY_KIND);

        attributeKindEClass = createEClass(ATTRIBUTE_KIND);

        maximumKindEClass = createEClass(MAXIMUM_KIND);

        minimumKindEClass = createEClass(MINIMUM_KIND);

        selectionKindEClass = createEClass(SELECTION_KIND);

        rangeKindEClass = createEClass(RANGE_KIND);

        connectionPropertyEClass = createEClass(CONNECTION_PROPERTY);

        capabilityTypeEClass = createEClass(CAPABILITY_TYPE);
        createEAttribute(capabilityTypeEClass, CAPABILITY_TYPE__NAME);

        computationDeviceTypeEClass = createEClass(COMPUTATION_DEVICE_TYPE);

        abstractCommunicationConnectionEClass = createEClass(ABSTRACT_COMMUNICATION_CONNECTION);
        createEAttribute(abstractCommunicationConnectionEClass, ABSTRACT_COMMUNICATION_CONNECTION__NAME);

        networkConnectionEClass = createEClass(NETWORK_CONNECTION);
        createEReference(networkConnectionEClass, NETWORK_CONNECTION__TYPE);
        createEReference(networkConnectionEClass, NETWORK_CONNECTION__PROPERTIES);

        abstractNetworkPropertyEClass = createEClass(ABSTRACT_NETWORK_PROPERTY);

        interfaceNetworkPropertyEClass = createEClass(INTERFACE_NETWORK_PROPERTY);

        addressNetworkPropertyEClass = createEClass(ADDRESS_NETWORK_PROPERTY);

        macNetworkPropertyEClass = createEClass(MAC_NETWORK_PROPERTY);

        abstractDeviceConfigEClass = createEClass(ABSTRACT_DEVICE_CONFIG);

        deviceTypeRefEClass = createEClass(DEVICE_TYPE_REF);
        createEReference(deviceTypeRefEClass, DEVICE_TYPE_REF__DEVICE_TYPE);

        abstractDeviceTypeEClass = createEClass(ABSTRACT_DEVICE_TYPE);
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
        UtilPackage theUtilPackage = (UtilPackage)EPackage.Registry.INSTANCE.getEPackage(UtilPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        deviceSetEClass.getESuperTypes().add(theUtilPackage.getDescription());
        devicePropertyEClass.getESuperTypes().add(theUtilPackage.getProperty());
        communicationConnectionEClass.getESuperTypes().add(this.getAbstractCommunicationConnection());
        attributeKindEClass.getESuperTypes().add(this.getCapabilityKind());
        maximumKindEClass.getESuperTypes().add(this.getCapabilityKind());
        minimumKindEClass.getESuperTypes().add(this.getCapabilityKind());
        selectionKindEClass.getESuperTypes().add(this.getCapabilityKind());
        rangeKindEClass.getESuperTypes().add(this.getCapabilityKind());
        connectionPropertyEClass.getESuperTypes().add(theUtilPackage.getPropertyAttribute());
        capabilityTypeEClass.getESuperTypes().add(theUtilPackage.getAbstractResouceType());
        computationDeviceTypeEClass.getESuperTypes().add(this.getDeviceType());
        networkConnectionEClass.getESuperTypes().add(this.getAbstractCommunicationConnection());
        abstractNetworkPropertyEClass.getESuperTypes().add(theUtilPackage.getPropertyAttribute());
        abstractNetworkPropertyEClass.getESuperTypes().add(this.getAbstractDeviceConfig());
        interfaceNetworkPropertyEClass.getESuperTypes().add(this.getAbstractNetworkProperty());
        addressNetworkPropertyEClass.getESuperTypes().add(this.getAbstractNetworkProperty());
        macNetworkPropertyEClass.getESuperTypes().add(this.getAbstractNetworkProperty());
        deviceTypeRefEClass.getESuperTypes().add(this.getAbstractDeviceType());

        // Initialize classes, features, and operations; add parameters
        initEClass(deviceSetEClass, DeviceSet.class, "DeviceSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDeviceSet_Device(), this.getDeviceType(), null, "device", null, 1, -1, DeviceSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(deviceTypeEClass, DeviceType.class, "DeviceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getDeviceType_Name(), ecorePackage.getEString(), "name", null, 1, 1, DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDeviceType_DeviceProperty(), this.getDeviceProperty(), null, "deviceProperty", null, 0, -1, DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getDeviceType_CommunicationConnection(), this.getAbstractCommunicationConnection(), null, "communicationConnection", null, 0, -1, DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(devicePropertyEClass, DeviceProperty.class, "DeviceProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDeviceProperty_Type(), theUtilPackage.getAbstractResouceType(), null, "type", null, 1, 1, DeviceProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(communicationConnectionEClass, CommunicationConnection.class, "CommunicationConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCommunicationConnection_Type(), theUtilPackage.getCommunicationType(), null, "type", null, 1, 1, CommunicationConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getCommunicationConnection_Properties(), this.getConnectionProperty(), null, "properties", null, 0, -1, CommunicationConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(capabilityKindEClass, CapabilityKind.class, "CapabilityKind", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(attributeKindEClass, AttributeKind.class, "AttributeKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(maximumKindEClass, MaximumKind.class, "MaximumKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(minimumKindEClass, MinimumKind.class, "MinimumKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(selectionKindEClass, SelectionKind.class, "SelectionKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(rangeKindEClass, RangeKind.class, "RangeKind", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(connectionPropertyEClass, ConnectionProperty.class, "ConnectionProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(capabilityTypeEClass, CapabilityType.class, "CapabilityType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getCapabilityType_Name(), ecorePackage.getEString(), "name", null, 1, 1, CapabilityType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(computationDeviceTypeEClass, ComputationDeviceType.class, "ComputationDeviceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(abstractCommunicationConnectionEClass, AbstractCommunicationConnection.class, "AbstractCommunicationConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAbstractCommunicationConnection_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractCommunicationConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(networkConnectionEClass, NetworkConnection.class, "NetworkConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getNetworkConnection_Type(), theUtilPackage.getNetworkCommunicationType(), null, "type", null, 1, 1, NetworkConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNetworkConnection_Properties(), this.getAbstractNetworkProperty(), null, "properties", null, 0, -1, NetworkConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractNetworkPropertyEClass, AbstractNetworkProperty.class, "AbstractNetworkProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(interfaceNetworkPropertyEClass, InterfaceNetworkProperty.class, "InterfaceNetworkProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(addressNetworkPropertyEClass, AddressNetworkProperty.class, "AddressNetworkProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(macNetworkPropertyEClass, MacNetworkProperty.class, "MacNetworkProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(abstractDeviceConfigEClass, AbstractDeviceConfig.class, "AbstractDeviceConfig", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(deviceTypeRefEClass, DeviceTypeRef.class, "DeviceTypeRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDeviceTypeRef_DeviceType(), this.getDeviceType(), null, "deviceType", null, 1, 1, DeviceTypeRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(abstractDeviceTypeEClass, AbstractDeviceType.class, "AbstractDeviceType", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //DevicePackageImpl
