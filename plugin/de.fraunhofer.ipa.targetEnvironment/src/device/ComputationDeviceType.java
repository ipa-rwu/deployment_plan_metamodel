/**
 */
package device;

import de.fraunhofer.ipa.deployment.util.OpertingSystem;
import de.fraunhofer.ipa.deployment.util.ProcessorArchitecture;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computation Device Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link device.ComputationDeviceType#getOperatingSystem <em>Operating System</em>}</li>
 *   <li>{@link device.ComputationDeviceType#getProcessorArchitecture <em>Processor Architecture</em>}</li>
 * </ul>
 *
 * @see device.DevicePackage#getComputationDeviceType()
 * @model
 * @generated
 */
public interface ComputationDeviceType extends DeviceType {
	/**
	 * Returns the value of the '<em><b>Operating System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating System</em>' reference.
	 * @see #setOperatingSystem(OpertingSystem)
	 * @see device.DevicePackage#getComputationDeviceType_OperatingSystem()
	 * @model required="true"
	 * @generated
	 */
	OpertingSystem getOperatingSystem();

	/**
	 * Sets the value of the '{@link device.ComputationDeviceType#getOperatingSystem <em>Operating System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating System</em>' reference.
	 * @see #getOperatingSystem()
	 * @generated
	 */
	void setOperatingSystem(OpertingSystem value);

	/**
	 * Returns the value of the '<em><b>Processor Architecture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Architecture</em>' reference.
	 * @see #setProcessorArchitecture(ProcessorArchitecture)
	 * @see device.DevicePackage#getComputationDeviceType_ProcessorArchitecture()
	 * @model
	 * @generated
	 */
	ProcessorArchitecture getProcessorArchitecture();

	/**
	 * Sets the value of the '{@link device.ComputationDeviceType#getProcessorArchitecture <em>Processor Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Architecture</em>' reference.
	 * @see #getProcessorArchitecture()
	 * @generated
	 */
	void setProcessorArchitecture(ProcessorArchitecture value);

} // ComputationDeviceType
