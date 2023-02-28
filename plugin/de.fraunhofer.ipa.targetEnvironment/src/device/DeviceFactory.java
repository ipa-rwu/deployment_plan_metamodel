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
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Indirect Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Indirect Connection</em>'.
	 * @generated
	 */
	IndirectConnection createIndirectConnection();

	/**
	 * Returns a new object of class '<em>Direct Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Direct Connection</em>'.
	 * @generated
	 */
	DirectConnection createDirectConnection();

	/**
	 * Returns a new object of class '<em>Capability Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capability Property</em>'.
	 * @generated
	 */
	CapabilityProperty createCapabilityProperty();

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
	 * Returns a new object of class '<em>Communication Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Type</em>'.
	 * @generated
	 */
	CommunicationType createCommunicationType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DevicePackage getDevicePackage();

} //DeviceFactory
