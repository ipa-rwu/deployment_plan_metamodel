/**
 */
package targetEnvironment;

import device.CommunicationConnection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connected Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targetEnvironment.ConnectedDevice#getRefDevice <em>Ref Device</em>}</li>
 *   <li>{@link targetEnvironment.ConnectedDevice#getRefConnection <em>Ref Connection</em>}</li>
 *   <li>{@link targetEnvironment.ConnectedDevice#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see targetEnvironment.TargetEnvironmentPackage#getConnectedDevice()
 * @model
 * @generated
 */
public interface ConnectedDevice extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Device</em>' reference.
	 * @see #setRefDevice(DeviceInstance)
	 * @see targetEnvironment.TargetEnvironmentPackage#getConnectedDevice_RefDevice()
	 * @model required="true"
	 * @generated
	 */
	DeviceInstance getRefDevice();

	/**
	 * Sets the value of the '{@link targetEnvironment.ConnectedDevice#getRefDevice <em>Ref Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Device</em>' reference.
	 * @see #getRefDevice()
	 * @generated
	 */
	void setRefDevice(DeviceInstance value);

	/**
	 * Returns the value of the '<em><b>Ref Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Connection</em>' reference.
	 * @see #setRefConnection(CommunicationConnection)
	 * @see targetEnvironment.TargetEnvironmentPackage#getConnectedDevice_RefConnection()
	 * @model required="true"
	 * @generated
	 */
	CommunicationConnection getRefConnection();

	/**
	 * Sets the value of the '{@link targetEnvironment.ConnectedDevice#getRefConnection <em>Ref Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Connection</em>' reference.
	 * @see #getRefConnection()
	 * @generated
	 */
	void setRefConnection(CommunicationConnection value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link targetEnvironment.ConfigConnectionProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see targetEnvironment.TargetEnvironmentPackage#getConnectedDevice_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConfigConnectionProperty> getProperties();

} // ConnectedDevice
