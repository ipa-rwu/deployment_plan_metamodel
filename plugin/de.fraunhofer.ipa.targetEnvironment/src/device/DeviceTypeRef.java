/**
 */
package device;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link device.DeviceTypeRef#getDeviceType <em>Device Type</em>}</li>
 * </ul>
 *
 * @see device.DevicePackage#getDeviceTypeRef()
 * @model
 * @generated
 */
public interface DeviceTypeRef extends AbstractDeviceType {
    /**
     * Returns the value of the '<em><b>Device Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Device Type</em>' reference.
     * @see #setDeviceType(DeviceType)
     * @see device.DevicePackage#getDeviceTypeRef_DeviceType()
     * @model required="true"
     * @generated
     */
    DeviceType getDeviceType();

    /**
     * Sets the value of the '{@link device.DeviceTypeRef#getDeviceType <em>Device Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Device Type</em>' reference.
     * @see #getDeviceType()
     * @generated
     */
    void setDeviceType(DeviceType value);

} // DeviceTypeRef
