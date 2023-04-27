/**
 */
package device;

import de.fraunhofer.ipa.deployment.util.UsbCommunicationType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usb Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link device.UsbConnection#getType <em>Type</em>}</li>
 *   <li>{@link device.UsbConnection#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see device.DevicePackage#getUsbConnection()
 * @model
 * @generated
 */
public interface UsbConnection extends AbstractCommunicationConnection {
    /**
     * Returns the value of the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' containment reference.
     * @see #setType(UsbCommunicationType)
     * @see device.DevicePackage#getUsbConnection_Type()
     * @model containment="true" required="true"
     * @generated
     */
    UsbCommunicationType getType();

    /**
     * Sets the value of the '{@link device.UsbConnection#getType <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' containment reference.
     * @see #getType()
     * @generated
     */
    void setType(UsbCommunicationType value);

    /**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
     * The list contents are of type {@link device.AbstractUsbProperty}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference list.
     * @see device.DevicePackage#getUsbConnection_Properties()
     * @model containment="true"
     * @generated
     */
    EList<AbstractUsbProperty> getProperties();

} // UsbConnection
