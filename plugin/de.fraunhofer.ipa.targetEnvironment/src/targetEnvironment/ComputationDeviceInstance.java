/**
 */
package targetEnvironment;

import device.ComputationDeviceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computation Device Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link targetEnvironment.ComputationDeviceInstance#getRefDeviceType <em>Ref Device Type</em>}</li>
 * </ul>
 *
 * @see targetEnvironment.TargetEnvironmentPackage#getComputationDeviceInstance()
 * @model
 * @generated
 */
public interface ComputationDeviceInstance extends AbstractDeviceInstance {
    /**
     * Returns the value of the '<em><b>Ref Device Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ref Device Type</em>' reference.
     * @see #setRefDeviceType(ComputationDeviceType)
     * @see targetEnvironment.TargetEnvironmentPackage#getComputationDeviceInstance_RefDeviceType()
     * @model required="true"
     * @generated
     */
    ComputationDeviceType getRefDeviceType();

    /**
     * Sets the value of the '{@link targetEnvironment.ComputationDeviceInstance#getRefDeviceType <em>Ref Device Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ref Device Type</em>' reference.
     * @see #getRefDeviceType()
     * @generated
     */
    void setRefDeviceType(ComputationDeviceType value);

} // ComputationDeviceInstance
