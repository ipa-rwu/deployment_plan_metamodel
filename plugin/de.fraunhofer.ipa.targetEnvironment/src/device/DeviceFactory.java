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
     * Returns a new object of class '<em>Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Property</em>'.
     * @generated
     */
    DeviceProperty createDeviceProperty();

    /**
     * Returns a new object of class '<em>Communication Connection</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Communication Connection</em>'.
     * @generated
     */
    CommunicationConnection createCommunicationConnection();

    /**
     * Returns a new object of class '<em>Attribute Kind</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Attribute Kind</em>'.
     * @generated
     */
    AttributeKind createAttributeKind();

    /**
     * Returns a new object of class '<em>Maximum Kind</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Maximum Kind</em>'.
     * @generated
     */
    MaximumKind createMaximumKind();

    /**
     * Returns a new object of class '<em>Minimum Kind</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Minimum Kind</em>'.
     * @generated
     */
    MinimumKind createMinimumKind();

    /**
     * Returns a new object of class '<em>Selection Kind</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Selection Kind</em>'.
     * @generated
     */
    SelectionKind createSelectionKind();

    /**
     * Returns a new object of class '<em>Range Kind</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Range Kind</em>'.
     * @generated
     */
    RangeKind createRangeKind();

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
     * Returns a new object of class '<em>Mac Network Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Mac Network Property</em>'.
     * @generated
     */
    MacNetworkProperty createMacNetworkProperty();

    /**
     * Returns a new object of class '<em>Type Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Type Ref</em>'.
     * @generated
     */
    DeviceTypeRef createDeviceTypeRef();

                /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    DevicePackage getDevicePackage();

} //DeviceFactory
