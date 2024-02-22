/**
 */
package device;

import de.fraunhofer.ipa.deployment.util.Description;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link device.DeviceSet#getDevice <em>Device</em>}</li>
 * </ul>
 *
 * @see device.DevicePackage#getDeviceSet()
 * @model
 * @generated
 */
public interface DeviceSet extends Description {
    /**
   * Returns the value of the '<em><b>Device</b></em>' containment reference list.
   * The list contents are of type {@link device.DeviceType}.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the value of the '<em>Device</em>' containment reference list.
   * @see device.DevicePackage#getDeviceSet_Device()
   * @model containment="true" required="true"
   * @generated
   */
    EList<DeviceType> getDevice();

} // DeviceSet
