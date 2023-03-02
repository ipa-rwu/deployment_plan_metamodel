/**
 */
package device;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link device.DeviceType#getName <em>Name</em>}</li>
 *   <li>{@link device.DeviceType#getCapability <em>Capability</em>}</li>
 *   <li>{@link device.DeviceType#getCommunicationConnection <em>Communication Connection</em>}</li>
 * </ul>
 *
 * @see device.DevicePackage#getDeviceType()
 * @model
 * @generated
 */
public interface DeviceType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see device.DevicePackage#getDeviceType_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link device.DeviceType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' containment reference list.
	 * The list contents are of type {@link device.CapabilityProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capability</em>' containment reference list.
	 * @see device.DevicePackage#getDeviceType_Capability()
	 * @model containment="true"
	 * @generated
	 */
	EList<CapabilityProperty> getCapability();

	/**
	 * Returns the value of the '<em><b>Communication Connection</b></em>' containment reference list.
	 * The list contents are of type {@link device.CommunicationConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Connection</em>' containment reference list.
	 * @see device.DevicePackage#getDeviceType_CommunicationConnection()
	 * @model containment="true"
	 * @generated
	 */
	EList<CommunicationConnection> getCommunicationConnection();

} // DeviceType
