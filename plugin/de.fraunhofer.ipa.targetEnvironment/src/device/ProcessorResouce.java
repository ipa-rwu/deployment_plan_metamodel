/**
 */
package device;

import de.fraunhofer.ipa.deployment.util.AbstractResource;
import de.fraunhofer.ipa.deployment.util.ProcessorResouceType;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processor Resouce</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link device.ProcessorResouce#getType <em>Type</em>}</li>
 *   <li>{@link device.ProcessorResouce#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see device.DevicePackage#getProcessorResouce()
 * @model
 * @generated
 */
public interface ProcessorResouce extends AbstractResource, AbstractComputationDeviceResource {
    /**
     * Returns the value of the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' containment reference.
     * @see #setType(ProcessorResouceType)
     * @see device.DevicePackage#getProcessorResouce_Type()
     * @model containment="true" required="true"
     * @generated
     */
    ProcessorResouceType getType();

    /**
     * Sets the value of the '{@link device.ProcessorResouce#getType <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' containment reference.
     * @see #getType()
     * @generated
     */
    void setType(ProcessorResouceType value);

    /**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
     * The list contents are of type {@link device.AbstracProcessorProperty}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference list.
     * @see device.DevicePackage#getProcessorResouce_Properties()
     * @model containment="true"
     * @generated
     */
    EList<AbstracProcessorProperty> getProperties();

} // ProcessorResouce
