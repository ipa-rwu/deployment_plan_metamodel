/**
 */
package device.impl;

import de.fraunhofer.ipa.deployment.util.UtilPackage;

import device.AbstracProcessorProperty;
import device.AbstractCommunicationConnection;
import device.AbstractComputationResource;
import device.AbstractDeviceType;
import device.AbstractNetworkProperty;
import device.AbstractOperatingSystemProperty;
import device.AbstractRuntimeEnviroment;
import device.AddressNetworkProperty;
import device.ArchitectureProcessorProperty;
import device.CommunicationConnection;
import device.ComputationDeviceType;
import device.ConnectionProperty;
import device.CoreProcessorProperty;
import device.DeviceFactory;
import device.DevicePackage;
import device.DeviceResource;
import device.DeviceSet;
import device.DeviceType;
import device.InterfaceNetworkProperty;
import device.MacAddressNetworkProperty;
import device.NameOperatingSystemProperty;
import device.NetworkConnection;
import device.OperatingSystemResouce;
import device.ProcessorResouce;
import device.VersionOperatingSystemProperty;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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
    private EClass deviceResourceEClass = null;

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
    private EClass connectionPropertyEClass = null;

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
    private EClass networkConnectionEClass = null;

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
    private EClass macAddressNetworkPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass containerEClass = null;

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
    private EClass nameOperatingSystemPropertyEClass = null;

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
    private EClass processorResouceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass architectureProcessorPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass coreProcessorPropertyEClass = null;

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
    private EClass abstractCommunicationConnectionEClass = null;

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
    private EClass abstractOperatingSystemPropertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass abstracProcessorPropertyEClass = null;

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
    private EClass abstractDeviceTypeEClass = null;

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
    public EReference getDeviceType_DeviceResource() {
        return (EReference)deviceTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getDeviceResource() {
        return deviceResourceEClass;
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
    public EClass getConnectionProperty() {
        return connectionPropertyEClass;
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
    public EReference getComputationDeviceType_ComputationResource() {
        return (EReference)computationDeviceTypeEClass.getEStructuralFeatures().get(0);
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
    public EClass getMacAddressNetworkProperty() {
        return macAddressNetworkPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getContainer() {
        return containerEClass;
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
        return (EReference)operatingSystemResouceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getOperatingSystemResouce_Properties() {
        return (EReference)operatingSystemResouceEClass.getEStructuralFeatures().get(1);
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
    public EClass getVersionOperatingSystemProperty() {
        return versionOperatingSystemPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getProcessorResouce() {
        return processorResouceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcessorResouce_Type() {
        return (EReference)processorResouceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getProcessorResouce_Properties() {
        return (EReference)processorResouceEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getArchitectureProcessorProperty() {
        return architectureProcessorPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getCoreProcessorProperty() {
        return coreProcessorPropertyEClass;
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
    public EClass getAbstractCommunicationConnection() {
        return abstractCommunicationConnectionEClass;
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
    public EClass getAbstractOperatingSystemProperty() {
        return abstractOperatingSystemPropertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EClass getAbstracProcessorProperty() {
        return abstracProcessorPropertyEClass;
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
    public EClass getAbstractDeviceType() {
        return abstractDeviceTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EAttribute getAbstractDeviceType_Name() {
        return (EAttribute)abstractDeviceTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EReference getAbstractDeviceType_CommunicationConnection() {
        return (EReference)abstractDeviceTypeEClass.getEStructuralFeatures().get(1);
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
        createEReference(deviceTypeEClass, DEVICE_TYPE__DEVICE_RESOURCE);

        deviceResourceEClass = createEClass(DEVICE_RESOURCE);

        communicationConnectionEClass = createEClass(COMMUNICATION_CONNECTION);
        createEReference(communicationConnectionEClass, COMMUNICATION_CONNECTION__TYPE);
        createEReference(communicationConnectionEClass, COMMUNICATION_CONNECTION__PROPERTIES);

        connectionPropertyEClass = createEClass(CONNECTION_PROPERTY);

        computationDeviceTypeEClass = createEClass(COMPUTATION_DEVICE_TYPE);
        createEReference(computationDeviceTypeEClass, COMPUTATION_DEVICE_TYPE__COMPUTATION_RESOURCE);

        networkConnectionEClass = createEClass(NETWORK_CONNECTION);
        createEReference(networkConnectionEClass, NETWORK_CONNECTION__TYPE);
        createEReference(networkConnectionEClass, NETWORK_CONNECTION__PROPERTIES);

        interfaceNetworkPropertyEClass = createEClass(INTERFACE_NETWORK_PROPERTY);

        addressNetworkPropertyEClass = createEClass(ADDRESS_NETWORK_PROPERTY);

        macAddressNetworkPropertyEClass = createEClass(MAC_ADDRESS_NETWORK_PROPERTY);

        containerEClass = createEClass(CONTAINER);

        operatingSystemResouceEClass = createEClass(OPERATING_SYSTEM_RESOUCE);
        createEReference(operatingSystemResouceEClass, OPERATING_SYSTEM_RESOUCE__TYPE);
        createEReference(operatingSystemResouceEClass, OPERATING_SYSTEM_RESOUCE__PROPERTIES);

        nameOperatingSystemPropertyEClass = createEClass(NAME_OPERATING_SYSTEM_PROPERTY);

        versionOperatingSystemPropertyEClass = createEClass(VERSION_OPERATING_SYSTEM_PROPERTY);

        processorResouceEClass = createEClass(PROCESSOR_RESOUCE);
        createEReference(processorResouceEClass, PROCESSOR_RESOUCE__TYPE);
        createEReference(processorResouceEClass, PROCESSOR_RESOUCE__PROPERTIES);

        architectureProcessorPropertyEClass = createEClass(ARCHITECTURE_PROCESSOR_PROPERTY);

        coreProcessorPropertyEClass = createEClass(CORE_PROCESSOR_PROPERTY);

        abstractNetworkPropertyEClass = createEClass(ABSTRACT_NETWORK_PROPERTY);

        abstractCommunicationConnectionEClass = createEClass(ABSTRACT_COMMUNICATION_CONNECTION);

        abstractRuntimeEnviromentEClass = createEClass(ABSTRACT_RUNTIME_ENVIROMENT);

        abstractOperatingSystemPropertyEClass = createEClass(ABSTRACT_OPERATING_SYSTEM_PROPERTY);

        abstracProcessorPropertyEClass = createEClass(ABSTRAC_PROCESSOR_PROPERTY);

        abstractComputationResourceEClass = createEClass(ABSTRACT_COMPUTATION_RESOURCE);

        abstractDeviceTypeEClass = createEClass(ABSTRACT_DEVICE_TYPE);
        createEAttribute(abstractDeviceTypeEClass, ABSTRACT_DEVICE_TYPE__NAME);
        createEReference(abstractDeviceTypeEClass, ABSTRACT_DEVICE_TYPE__COMMUNICATION_CONNECTION);
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
        deviceTypeEClass.getESuperTypes().add(this.getAbstractDeviceType());
        deviceResourceEClass.getESuperTypes().add(theUtilPackage.getResource());
        communicationConnectionEClass.getESuperTypes().add(this.getAbstractCommunicationConnection());
        connectionPropertyEClass.getESuperTypes().add(theUtilPackage.getPropertyAttribute());
        computationDeviceTypeEClass.getESuperTypes().add(this.getDeviceType());
        networkConnectionEClass.getESuperTypes().add(this.getAbstractCommunicationConnection());
        interfaceNetworkPropertyEClass.getESuperTypes().add(theUtilPackage.getPropertyAttribute());
        interfaceNetworkPropertyEClass.getESuperTypes().add(this.getAbstractNetworkProperty());
        addressNetworkPropertyEClass.getESuperTypes().add(theUtilPackage.getPropertyAttribute());
        addressNetworkPropertyEClass.getESuperTypes().add(this.getAbstractNetworkProperty());
        macAddressNetworkPropertyEClass.getESuperTypes().add(theUtilPackage.getPropertyAttribute());
        macAddressNetworkPropertyEClass.getESuperTypes().add(this.getAbstractNetworkProperty());
        containerEClass.getESuperTypes().add(this.getAbstractRuntimeEnviroment());
        operatingSystemResouceEClass.getESuperTypes().add(this.getAbstractComputationResource());
        nameOperatingSystemPropertyEClass.getESuperTypes().add(theUtilPackage.getPropertyAttribute());
        nameOperatingSystemPropertyEClass.getESuperTypes().add(this.getAbstractOperatingSystemProperty());
        versionOperatingSystemPropertyEClass.getESuperTypes().add(theUtilPackage.getPropertyAttribute());
        versionOperatingSystemPropertyEClass.getESuperTypes().add(this.getAbstractOperatingSystemProperty());
        processorResouceEClass.getESuperTypes().add(this.getAbstractComputationResource());
        architectureProcessorPropertyEClass.getESuperTypes().add(theUtilPackage.getPropertyAttribute());
        architectureProcessorPropertyEClass.getESuperTypes().add(this.getAbstracProcessorProperty());
        coreProcessorPropertyEClass.getESuperTypes().add(theUtilPackage.getPropertyAttribute());
        coreProcessorPropertyEClass.getESuperTypes().add(this.getAbstracProcessorProperty());
        abstractCommunicationConnectionEClass.getESuperTypes().add(theUtilPackage.getAbstractResource());
        abstractComputationResourceEClass.getESuperTypes().add(theUtilPackage.getAbstractResource());

        // Initialize classes, features, and operations; add parameters
        initEClass(deviceSetEClass, DeviceSet.class, "DeviceSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDeviceSet_Device(), this.getDeviceType(), null, "device", null, 1, -1, DeviceSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(deviceTypeEClass, DeviceType.class, "DeviceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getDeviceType_DeviceResource(), this.getDeviceResource(), null, "deviceResource", null, 0, -1, DeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(deviceResourceEClass, DeviceResource.class, "DeviceResource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(communicationConnectionEClass, CommunicationConnection.class, "CommunicationConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getCommunicationConnection_Type(), theUtilPackage.getCommunicationType(), null, "type", null, 1, 1, CommunicationConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
        initEReference(getCommunicationConnection_Properties(), this.getConnectionProperty(), null, "properties", null, 0, -1, CommunicationConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(connectionPropertyEClass, ConnectionProperty.class, "ConnectionProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(computationDeviceTypeEClass, ComputationDeviceType.class, "ComputationDeviceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getComputationDeviceType_ComputationResource(), this.getAbstractComputationResource(), null, "computationResource", null, 1, -1, ComputationDeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(networkConnectionEClass, NetworkConnection.class, "NetworkConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getNetworkConnection_Type(), theUtilPackage.getNetworkCommunicationType(), null, "type", null, 1, 1, NetworkConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getNetworkConnection_Properties(), this.getAbstractNetworkProperty(), null, "properties", null, 0, -1, NetworkConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(interfaceNetworkPropertyEClass, InterfaceNetworkProperty.class, "InterfaceNetworkProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(addressNetworkPropertyEClass, AddressNetworkProperty.class, "AddressNetworkProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(macAddressNetworkPropertyEClass, MacAddressNetworkProperty.class, "MacAddressNetworkProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(containerEClass, device.Container.class, "Container", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(operatingSystemResouceEClass, OperatingSystemResouce.class, "OperatingSystemResouce", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getOperatingSystemResouce_Type(), theUtilPackage.getOpertingSystemResouceType(), null, "type", null, 1, 1, OperatingSystemResouce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getOperatingSystemResouce_Properties(), this.getAbstractOperatingSystemProperty(), null, "properties", null, 0, -1, OperatingSystemResouce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(nameOperatingSystemPropertyEClass, NameOperatingSystemProperty.class, "NameOperatingSystemProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(versionOperatingSystemPropertyEClass, VersionOperatingSystemProperty.class, "VersionOperatingSystemProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(processorResouceEClass, ProcessorResouce.class, "ProcessorResouce", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProcessorResouce_Type(), theUtilPackage.getProcessorResouceType(), null, "type", null, 1, 1, ProcessorResouce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProcessorResouce_Properties(), this.getAbstracProcessorProperty(), null, "properties", null, 0, -1, ProcessorResouce.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(architectureProcessorPropertyEClass, ArchitectureProcessorProperty.class, "ArchitectureProcessorProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(coreProcessorPropertyEClass, CoreProcessorProperty.class, "CoreProcessorProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(abstractNetworkPropertyEClass, AbstractNetworkProperty.class, "AbstractNetworkProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(abstractCommunicationConnectionEClass, AbstractCommunicationConnection.class, "AbstractCommunicationConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(abstractRuntimeEnviromentEClass, AbstractRuntimeEnviroment.class, "AbstractRuntimeEnviroment", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(abstractOperatingSystemPropertyEClass, AbstractOperatingSystemProperty.class, "AbstractOperatingSystemProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(abstracProcessorPropertyEClass, AbstracProcessorProperty.class, "AbstracProcessorProperty", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(abstractComputationResourceEClass, AbstractComputationResource.class, "AbstractComputationResource", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(abstractDeviceTypeEClass, AbstractDeviceType.class, "AbstractDeviceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAbstractDeviceType_Name(), ecorePackage.getEString(), "name", null, 1, 1, AbstractDeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getAbstractDeviceType_CommunicationConnection(), this.getAbstractCommunicationConnection(), null, "communicationConnection", null, 0, -1, AbstractDeviceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);
    }

} //DevicePackageImpl
