/**
 */
package device;

import de.fraunhofer.ipa.deployment.util.CommunicationType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Communication Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link device.CommunicationConnection#getType <em>Type</em>}</li>
 *   <li>{@link device.CommunicationConnection#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see device.DevicePackage#getCommunicationConnection()
 * @model
 * @generated
 */
public interface CommunicationConnection extends AbstractCommunicationConnection {
    /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(CommunicationType)
   * @see device.DevicePackage#getCommunicationConnection_Type()
   * @model containment="true" required="true" derived="true"
   * @generated
   */
    CommunicationType getType();

    /**
   * Sets the value of the '{@link device.CommunicationConnection#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
    void setType(CommunicationType value);

    /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link device.AbstractConnectionProperty}.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see device.DevicePackage#getCommunicationConnection_Properties()
   * @model containment="true"
   * @generated
   */
    EList<AbstractConnectionProperty> getProperties();

} // CommunicationConnection
