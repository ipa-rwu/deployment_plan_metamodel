/**
 */
package targetEnvironment.impl;

import device.CommunicationConnection;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import targetEnvironment.ConfigConnectionProperty;
import targetEnvironment.ConnectedDevice;
import targetEnvironment.DeviceInstance;
import targetEnvironment.TargetEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connected Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targetEnvironment.impl.ConnectedDeviceImpl#getRefDevice <em>Ref Device</em>}</li>
 *   <li>{@link targetEnvironment.impl.ConnectedDeviceImpl#getRefConnection <em>Ref Connection</em>}</li>
 *   <li>{@link targetEnvironment.impl.ConnectedDeviceImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectedDeviceImpl extends MinimalEObjectImpl.Container implements ConnectedDevice {
	/**
	 * The cached value of the '{@link #getRefDevice() <em>Ref Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefDevice()
	 * @generated
	 * @ordered
	 */
	protected DeviceInstance refDevice;

	/**
	 * The cached value of the '{@link #getRefConnection() <em>Ref Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefConnection()
	 * @generated
	 * @ordered
	 */
	protected CommunicationConnection refConnection;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ConfigConnectionProperty> properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectedDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetEnvironmentPackage.Literals.CONNECTED_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceInstance getRefDevice() {
		if (refDevice != null && refDevice.eIsProxy()) {
			InternalEObject oldRefDevice = (InternalEObject)refDevice;
			refDevice = (DeviceInstance)eResolveProxy(oldRefDevice);
			if (refDevice != oldRefDevice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TargetEnvironmentPackage.CONNECTED_DEVICE__REF_DEVICE, oldRefDevice, refDevice));
			}
		}
		return refDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceInstance basicGetRefDevice() {
		return refDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefDevice(DeviceInstance newRefDevice) {
		DeviceInstance oldRefDevice = refDevice;
		refDevice = newRefDevice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetEnvironmentPackage.CONNECTED_DEVICE__REF_DEVICE, oldRefDevice, refDevice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationConnection getRefConnection() {
		if (refConnection != null && refConnection.eIsProxy()) {
			InternalEObject oldRefConnection = (InternalEObject)refConnection;
			refConnection = (CommunicationConnection)eResolveProxy(oldRefConnection);
			if (refConnection != oldRefConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TargetEnvironmentPackage.CONNECTED_DEVICE__REF_CONNECTION, oldRefConnection, refConnection));
			}
		}
		return refConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationConnection basicGetRefConnection() {
		return refConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefConnection(CommunicationConnection newRefConnection) {
		CommunicationConnection oldRefConnection = refConnection;
		refConnection = newRefConnection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TargetEnvironmentPackage.CONNECTED_DEVICE__REF_CONNECTION, oldRefConnection, refConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ConfigConnectionProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<ConfigConnectionProperty>(ConfigConnectionProperty.class, this, TargetEnvironmentPackage.CONNECTED_DEVICE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetEnvironmentPackage.CONNECTED_DEVICE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TargetEnvironmentPackage.CONNECTED_DEVICE__REF_DEVICE:
				if (resolve) return getRefDevice();
				return basicGetRefDevice();
			case TargetEnvironmentPackage.CONNECTED_DEVICE__REF_CONNECTION:
				if (resolve) return getRefConnection();
				return basicGetRefConnection();
			case TargetEnvironmentPackage.CONNECTED_DEVICE__PROPERTIES:
				return getProperties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TargetEnvironmentPackage.CONNECTED_DEVICE__REF_DEVICE:
				setRefDevice((DeviceInstance)newValue);
				return;
			case TargetEnvironmentPackage.CONNECTED_DEVICE__REF_CONNECTION:
				setRefConnection((CommunicationConnection)newValue);
				return;
			case TargetEnvironmentPackage.CONNECTED_DEVICE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends ConfigConnectionProperty>)newValue);
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
			case TargetEnvironmentPackage.CONNECTED_DEVICE__REF_DEVICE:
				setRefDevice((DeviceInstance)null);
				return;
			case TargetEnvironmentPackage.CONNECTED_DEVICE__REF_CONNECTION:
				setRefConnection((CommunicationConnection)null);
				return;
			case TargetEnvironmentPackage.CONNECTED_DEVICE__PROPERTIES:
				getProperties().clear();
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
			case TargetEnvironmentPackage.CONNECTED_DEVICE__REF_DEVICE:
				return refDevice != null;
			case TargetEnvironmentPackage.CONNECTED_DEVICE__REF_CONNECTION:
				return refConnection != null;
			case TargetEnvironmentPackage.CONNECTED_DEVICE__PROPERTIES:
				return properties != null && !properties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectedDeviceImpl
