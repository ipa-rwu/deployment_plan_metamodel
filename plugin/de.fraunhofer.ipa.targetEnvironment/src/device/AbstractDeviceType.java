/**
 */
package device;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Device Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link device.AbstractDeviceType#getName <em>Name</em>}</li>
 *   <li>{@link device.AbstractDeviceType#getCommunicationConnection <em>Communication Connection</em>}</li>
 * </ul>
 *
 * @see device.DevicePackage#getAbstractDeviceType()
 * @model abstract="true"
 * @generated
 */
public interface AbstractDeviceType extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see device.DevicePackage#getAbstractDeviceType_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link device.AbstractDeviceType#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Communication Connection</b></em>' containment reference list.
     * The list contents are of type {@link device.AbstractCommunicationConnection}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Communication Connection</em>' containment reference list.
     * @see device.DevicePackage#getAbstractDeviceType_CommunicationConnection()
     * @model containment="true"
     * @generated
     */
    EList<AbstractCommunicationConnection> getCommunicationConnection();

} // AbstractDeviceType
