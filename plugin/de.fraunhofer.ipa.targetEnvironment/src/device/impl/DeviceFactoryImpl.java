/**
 */
package device.impl;

import device.*;

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
public class DeviceFactoryImpl extends EFactoryImpl implements DeviceFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static DeviceFactory init() {
        try {
            DeviceFactory theDeviceFactory = (DeviceFactory)EPackage.Registry.INSTANCE.getEFactory(DevicePackage.eNS_URI);
            if (theDeviceFactory != null) {
                return theDeviceFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new DeviceFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeviceFactoryImpl() {
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
            case DevicePackage.DEVICE_SET: return createDeviceSet();
            case DevicePackage.DEVICE_TYPE: return createDeviceType();
            case DevicePackage.DEVICE_RESOURCE: return createDeviceResource();
            case DevicePackage.COMMUNICATION_CONNECTION: return createCommunicationConnection();
            case DevicePackage.CONNECTION_PROPERTY: return createConnectionProperty();
            case DevicePackage.COMPUTATION_DEVICE_TYPE: return createComputationDeviceType();
            case DevicePackage.NETWORK_CONNECTION: return createNetworkConnection();
            case DevicePackage.INTERFACE_NETWORK_PROPERTY: return createInterfaceNetworkProperty();
            case DevicePackage.ADDRESS_NETWORK_PROPERTY: return createAddressNetworkProperty();
            case DevicePackage.MAC_ADDRESS_NETWORK_PROPERTY: return createMacAddressNetworkProperty();
            case DevicePackage.PORT_NETWORK_PROPERTY: return createPortNetworkProperty();
            case DevicePackage.IDENTITY_NAME_NETWORK_PROPERTY: return createIdentityNameNetworkProperty();
            case DevicePackage.GATEWAY_NETWORK_PROPERTY: return createGatewayNetworkProperty();
            case DevicePackage.SUBNET_MASK_NETWORK_PROPERTY: return createSubnetMaskNetworkProperty();
            case DevicePackage.DNS_SERVER_NETWORK_PROPERTY: return createDNSServerNetworkProperty();
            case DevicePackage.USB_CONNECTION: return createUsbConnection();
            case DevicePackage.DEVICE_VOLUME_USB_PROPERTY: return createDeviceVolumeUsbProperty();
            case DevicePackage.CONTAINER: return createContainer();
            case DevicePackage.NAME_OPERATING_SYSTEM_PROPERTY: return createNameOperatingSystemProperty();
            case DevicePackage.PROCESSOR_RESOUCE: return createProcessorResouce();
            case DevicePackage.ARCHITECTURE_PROCESSOR_PROPERTY: return createArchitectureProcessorProperty();
            case DevicePackage.CORE_PROCESSOR_PROPERTY: return createCoreProcessorProperty();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeviceSet createDeviceSet() {
        DeviceSetImpl deviceSet = new DeviceSetImpl();
        return deviceSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeviceType createDeviceType() {
        DeviceTypeImpl deviceType = new DeviceTypeImpl();
        return deviceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeviceResource createDeviceResource() {
        DeviceResourceImpl deviceResource = new DeviceResourceImpl();
        return deviceResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CommunicationConnection createCommunicationConnection() {
        CommunicationConnectionImpl communicationConnection = new CommunicationConnectionImpl();
        return communicationConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectionProperty createConnectionProperty() {
        ConnectionPropertyImpl connectionProperty = new ConnectionPropertyImpl();
        return connectionProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComputationDeviceType createComputationDeviceType() {
        ComputationDeviceTypeImpl computationDeviceType = new ComputationDeviceTypeImpl();
        return computationDeviceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NetworkConnection createNetworkConnection() {
        NetworkConnectionImpl networkConnection = new NetworkConnectionImpl();
        return networkConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public InterfaceNetworkProperty createInterfaceNetworkProperty() {
        InterfaceNetworkPropertyImpl interfaceNetworkProperty = new InterfaceNetworkPropertyImpl();
        return interfaceNetworkProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AddressNetworkProperty createAddressNetworkProperty() {
        AddressNetworkPropertyImpl addressNetworkProperty = new AddressNetworkPropertyImpl();
        return addressNetworkProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MacAddressNetworkProperty createMacAddressNetworkProperty() {
        MacAddressNetworkPropertyImpl macAddressNetworkProperty = new MacAddressNetworkPropertyImpl();
        return macAddressNetworkProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PortNetworkProperty createPortNetworkProperty() {
        PortNetworkPropertyImpl portNetworkProperty = new PortNetworkPropertyImpl();
        return portNetworkProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public IdentityNameNetworkProperty createIdentityNameNetworkProperty() {
        IdentityNameNetworkPropertyImpl identityNameNetworkProperty = new IdentityNameNetworkPropertyImpl();
        return identityNameNetworkProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GatewayNetworkProperty createGatewayNetworkProperty() {
        GatewayNetworkPropertyImpl gatewayNetworkProperty = new GatewayNetworkPropertyImpl();
        return gatewayNetworkProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SubnetMaskNetworkProperty createSubnetMaskNetworkProperty() {
        SubnetMaskNetworkPropertyImpl subnetMaskNetworkProperty = new SubnetMaskNetworkPropertyImpl();
        return subnetMaskNetworkProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DNSServerNetworkProperty createDNSServerNetworkProperty() {
        DNSServerNetworkPropertyImpl dnsServerNetworkProperty = new DNSServerNetworkPropertyImpl();
        return dnsServerNetworkProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UsbConnection createUsbConnection() {
        UsbConnectionImpl usbConnection = new UsbConnectionImpl();
        return usbConnection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeviceVolumeUsbProperty createDeviceVolumeUsbProperty() {
        DeviceVolumeUsbPropertyImpl deviceVolumeUsbProperty = new DeviceVolumeUsbPropertyImpl();
        return deviceVolumeUsbProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public device.Container createContainer() {
        ContainerImpl container = new ContainerImpl();
        return container;
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
    public ProcessorResouce createProcessorResouce() {
        ProcessorResouceImpl processorResouce = new ProcessorResouceImpl();
        return processorResouce;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ArchitectureProcessorProperty createArchitectureProcessorProperty() {
        ArchitectureProcessorPropertyImpl architectureProcessorProperty = new ArchitectureProcessorPropertyImpl();
        return architectureProcessorProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CoreProcessorProperty createCoreProcessorProperty() {
        CoreProcessorPropertyImpl coreProcessorProperty = new CoreProcessorPropertyImpl();
        return coreProcessorProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DevicePackage getDevicePackage() {
        return (DevicePackage)getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static DevicePackage getPackage() {
        return DevicePackage.eINSTANCE;
    }

} //DeviceFactoryImpl
