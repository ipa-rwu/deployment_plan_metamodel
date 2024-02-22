/**
 */
package device;

import de.fraunhofer.ipa.deployment.util.AbstractComputationResource;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computation Device Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link device.ComputationDeviceType#getComputationResource <em>Computation Resource</em>}</li>
 * </ul>
 *
 * @see device.DevicePackage#getComputationDeviceType()
 * @model
 * @generated
 */
public interface ComputationDeviceType extends DeviceType {
    /**
   * Returns the value of the '<em><b>Computation Resource</b></em>' containment reference list.
   * The list contents are of type {@link de.fraunhofer.ipa.deployment.util.AbstractComputationResource}.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the value of the '<em>Computation Resource</em>' containment reference list.
   * @see device.DevicePackage#getComputationDeviceType_ComputationResource()
   * @model containment="true" required="true"
   * @generated
   */
    EList<AbstractComputationResource> getComputationResource();

} // ComputationDeviceType
