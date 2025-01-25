/**
 */
package device;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see device.DevicePackage
 * @generated
 */
public interface DeviceFactory extends EFactory {
    /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    DeviceFactory eINSTANCE = device.impl.DeviceFactoryImpl.init();

    /**
   * Returns a new object of class '<em>Set</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Set</em>'.
   * @generated
   */
    DeviceSet createDeviceSet();

    /**
   * Returns a new object of class '<em>Type</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Type</em>'.
   * @generated
   */
    DeviceType createDeviceType();

    /**
   * Returns a new object of class '<em>Resource</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Resource</em>'.
   * @generated
   */
    DeviceResource createDeviceResource();

    /**
   * Returns a new object of class '<em>Communication Connection</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Communication Connection</em>'.
   * @generated
   */
    CommunicationConnection createCommunicationConnection();

    /**
   * Returns a new object of class '<em>Connection Property</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Connection Property</em>'.
   * @generated
   */
    ConnectionProperty createConnectionProperty();

    /**
   * Returns a new object of class '<em>Computation Device Type</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Computation Device Type</em>'.
   * @generated
   */
    ComputationDeviceType createComputationDeviceType();

    /**
   * Returns a new object of class '<em>Network Connection</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Network Connection</em>'.
   * @generated
   */
    NetworkConnection createNetworkConnection();

    /**
   * Returns a new object of class '<em>Interface Network Property</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Interface Network Property</em>'.
   * @generated
   */
    InterfaceNetworkProperty createInterfaceNetworkProperty();

    /**
   * Returns a new object of class '<em>Address Network Property</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Address Network Property</em>'.
   * @generated
   */
    AddressNetworkProperty createAddressNetworkProperty();

    /**
   * Returns a new object of class '<em>Mac Address Network Property</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Mac Address Network Property</em>'.
   * @generated
   */
    MacAddressNetworkProperty createMacAddressNetworkProperty();

    /**
   * Returns a new object of class '<em>Port Network Property</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Port Network Property</em>'.
   * @generated
   */
    PortNetworkProperty createPortNetworkProperty();

    /**
   * Returns a new object of class '<em>Identity Name Network Property</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Identity Name Network Property</em>'.
   * @generated
   */
    IdentityNameNetworkProperty createIdentityNameNetworkProperty();

    /**
   * Returns a new object of class '<em>Gateway Network Property</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Gateway Network Property</em>'.
   * @generated
   */
    GatewayNetworkProperty createGatewayNetworkProperty();

    /**
   * Returns a new object of class '<em>Subnet Mask Network Property</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Subnet Mask Network Property</em>'.
   * @generated
   */
    SubnetMaskNetworkProperty createSubnetMaskNetworkProperty();

    /**
   * Returns a new object of class '<em>DNS Server Network Property</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>DNS Server Network Property</em>'.
   * @generated
   */
    DNSServerNetworkProperty createDNSServerNetworkProperty();

    /**
   * Returns a new object of class '<em>Usb Connection</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Usb Connection</em>'.
   * @generated
   */
    UsbConnection createUsbConnection();

    /**
   * Returns a new object of class '<em>Volume Usb Property</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Volume Usb Property</em>'.
   * @generated
   */
    DeviceVolumeUsbProperty createDeviceVolumeUsbProperty();

    /**
   * Returns a new object of class '<em>Container</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Container</em>'.
   * @generated
   */
    Container createContainer();

    /**
   * Returns a new object of class '<em>Name Operating System Property</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Name Operating System Property</em>'.
   * @generated
   */
    NameOperatingSystemProperty createNameOperatingSystemProperty();

    /**
   * Returns a new object of class '<em>Processor Resouce</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Processor Resouce</em>'.
   * @generated
   */
    ProcessorResouce createProcessorResouce();

    /**
   * Returns a new object of class '<em>Architecture Processor Property</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Architecture Processor Property</em>'.
   * @generated
   */
    ArchitectureProcessorProperty createArchitectureProcessorProperty();

    /**
   * Returns a new object of class '<em>Core Processor Property</em>'.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return a new object of class '<em>Core Processor Property</em>'.
   * @generated
   */
    CoreProcessorProperty createCoreProcessorProperty();

    /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
    DevicePackage getDevicePackage();

} //DeviceFactory
