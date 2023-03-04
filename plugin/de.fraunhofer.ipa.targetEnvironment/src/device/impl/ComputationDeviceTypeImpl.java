/**
 */
package device.impl;

import de.fraunhofer.ipa.deployment.util.OpertingSystem;
import de.fraunhofer.ipa.deployment.util.ProcessorArchitecture;

import device.ComputationDeviceType;
import device.DevicePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computation Device Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link device.impl.ComputationDeviceTypeImpl#getOperatingSystem <em>Operating System</em>}</li>
 *   <li>{@link device.impl.ComputationDeviceTypeImpl#getProcessorArchitecture <em>Processor Architecture</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputationDeviceTypeImpl extends DeviceTypeImpl implements ComputationDeviceType {
	/**
	 * The cached value of the '{@link #getOperatingSystem() <em>Operating System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingSystem()
	 * @generated
	 * @ordered
	 */
	protected OpertingSystem operatingSystem;

	/**
	 * The cached value of the '{@link #getProcessorArchitecture() <em>Processor Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorArchitecture()
	 * @generated
	 * @ordered
	 */
	protected ProcessorArchitecture processorArchitecture;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComputationDeviceTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DevicePackage.Literals.COMPUTATION_DEVICE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpertingSystem getOperatingSystem() {
		if (operatingSystem != null && operatingSystem.eIsProxy()) {
			InternalEObject oldOperatingSystem = (InternalEObject)operatingSystem;
			operatingSystem = (OpertingSystem)eResolveProxy(oldOperatingSystem);
			if (operatingSystem != oldOperatingSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DevicePackage.COMPUTATION_DEVICE_TYPE__OPERATING_SYSTEM, oldOperatingSystem, operatingSystem));
			}
		}
		return operatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpertingSystem basicGetOperatingSystem() {
		return operatingSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatingSystem(OpertingSystem newOperatingSystem) {
		OpertingSystem oldOperatingSystem = operatingSystem;
		operatingSystem = newOperatingSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicePackage.COMPUTATION_DEVICE_TYPE__OPERATING_SYSTEM, oldOperatingSystem, operatingSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorArchitecture getProcessorArchitecture() {
		if (processorArchitecture != null && processorArchitecture.eIsProxy()) {
			InternalEObject oldProcessorArchitecture = (InternalEObject)processorArchitecture;
			processorArchitecture = (ProcessorArchitecture)eResolveProxy(oldProcessorArchitecture);
			if (processorArchitecture != oldProcessorArchitecture) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DevicePackage.COMPUTATION_DEVICE_TYPE__PROCESSOR_ARCHITECTURE, oldProcessorArchitecture, processorArchitecture));
			}
		}
		return processorArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorArchitecture basicGetProcessorArchitecture() {
		return processorArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessorArchitecture(ProcessorArchitecture newProcessorArchitecture) {
		ProcessorArchitecture oldProcessorArchitecture = processorArchitecture;
		processorArchitecture = newProcessorArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DevicePackage.COMPUTATION_DEVICE_TYPE__PROCESSOR_ARCHITECTURE, oldProcessorArchitecture, processorArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DevicePackage.COMPUTATION_DEVICE_TYPE__OPERATING_SYSTEM:
				if (resolve) return getOperatingSystem();
				return basicGetOperatingSystem();
			case DevicePackage.COMPUTATION_DEVICE_TYPE__PROCESSOR_ARCHITECTURE:
				if (resolve) return getProcessorArchitecture();
				return basicGetProcessorArchitecture();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DevicePackage.COMPUTATION_DEVICE_TYPE__OPERATING_SYSTEM:
				setOperatingSystem((OpertingSystem)newValue);
				return;
			case DevicePackage.COMPUTATION_DEVICE_TYPE__PROCESSOR_ARCHITECTURE:
				setProcessorArchitecture((ProcessorArchitecture)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DevicePackage.COMPUTATION_DEVICE_TYPE__OPERATING_SYSTEM:
				setOperatingSystem((OpertingSystem)null);
				return;
			case DevicePackage.COMPUTATION_DEVICE_TYPE__PROCESSOR_ARCHITECTURE:
				setProcessorArchitecture((ProcessorArchitecture)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DevicePackage.COMPUTATION_DEVICE_TYPE__OPERATING_SYSTEM:
				return operatingSystem != null;
			case DevicePackage.COMPUTATION_DEVICE_TYPE__PROCESSOR_ARCHITECTURE:
				return processorArchitecture != null;
		}
		return super.eIsSet(featureID);
	}

} //ComputationDeviceTypeImpl
