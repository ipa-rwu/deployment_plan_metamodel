/**
 */
package targetEnvironment;

import device.DeviceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targetEnvironment.DeviceInstance#getRefDeviceType <em>Ref Device Type</em>}</li>
 * </ul>
 *
 * @see targetEnvironment.TargetEnvironmentPackage#getDeviceInstance()
 * @model
 * @generated
 */
public interface DeviceInstance extends AbstractDeviceInstance {
    /**
   * Returns the value of the '<em><b>Ref Device Type</b></em>' reference.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Device Type</em>' reference.
   * @see #setRefDeviceType(DeviceType)
   * @see targetEnvironment.TargetEnvironmentPackage#getDeviceInstance_RefDeviceType()
   * @model required="true"
   * @generated
   */
    DeviceType getRefDeviceType();

    /**
   * Sets the value of the '{@link targetEnvironment.DeviceInstance#getRefDeviceType <em>Ref Device Type</em>}' reference.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Device Type</em>' reference.
   * @see #getRefDeviceType()
   * @generated
   */
    void setRefDeviceType(DeviceType value);

} // DeviceInstance
