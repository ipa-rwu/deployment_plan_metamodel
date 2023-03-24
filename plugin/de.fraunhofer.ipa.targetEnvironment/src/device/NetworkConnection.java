/**
 */
package device;

import de.fraunhofer.ipa.deployment.util.NetworkCommunicationType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Network Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link device.NetworkConnection#getType <em>Type</em>}</li>
 *   <li>{@link device.NetworkConnection#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see device.DevicePackage#getNetworkConnection()
 * @model
 * @generated
 */
public interface NetworkConnection extends AbstractCommunicationConnection {
    /**
     * Returns the value of the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' containment reference.
     * @see #setType(NetworkCommunicationType)
     * @see device.DevicePackage#getNetworkConnection_Type()
     * @model containment="true" required="true"
     * @generated
     */
    NetworkCommunicationType getType();

    /**
     * Sets the value of the '{@link device.NetworkConnection#getType <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' containment reference.
     * @see #getType()
     * @generated
     */
    void setType(NetworkCommunicationType value);

    /**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
     * The list contents are of type {@link device.AbstractNetworkProperty}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference list.
     * @see device.DevicePackage#getNetworkConnection_Properties()
     * @model containment="true"
     * @generated
     */
    EList<AbstractNetworkProperty> getProperties();

} // NetworkConnection
