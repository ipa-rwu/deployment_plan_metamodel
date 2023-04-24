/**
 */
package device;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link device.DeviceType#getDeviceResource <em>Device Resource</em>}</li>
 * </ul>
 *
 * @see device.DevicePackage#getDeviceType()
 * @model
 * @generated
 */
public interface DeviceType extends AbstractDeviceType {
    /**
     * Returns the value of the '<em><b>Device Resource</b></em>' containment reference list.
     * The list contents are of type {@link device.DeviceResource}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Device Resource</em>' containment reference list.
     * @see device.DevicePackage#getDeviceType_DeviceResource()
     * @model containment="true"
     * @generated
     */
    EList<DeviceResource> getDeviceResource();

} // DeviceType
