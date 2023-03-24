/**
 */
package device.impl;

import device.DevicePackage;
import device.DeviceType;
import device.DeviceTypeRef;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link device.impl.DeviceTypeRefImpl#getDeviceType <em>Device Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceTypeRefImpl extends AbstractDeviceTypeImpl implements DeviceTypeRef {
    /**
     * The cached value of the '{@link #getDeviceType() <em>Device Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeviceType()
     * @generated
     * @ordered
     */
    protected DeviceType deviceType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DeviceTypeRefImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DevicePackage.Literals.DEVICE_TYPE_REF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeviceType getDeviceType() {
        if (deviceType != null && deviceType.eIsProxy()) {
            InternalEObject oldDeviceType = (InternalEObject)deviceType;
            deviceType = (DeviceType)eResolveProxy(oldDeviceType);
            if (deviceType != oldDeviceType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DevicePackage.DEVICE_TYPE_REF__DEVICE_TYPE, oldDeviceType, deviceType));
            }
        }
        return deviceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeviceType basicGetDeviceType() {
        return deviceType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDeviceType(DeviceType newDeviceType) {
        DeviceType oldDeviceType = deviceType;
        deviceType = newDeviceType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DevicePackage.DEVICE_TYPE_REF__DEVICE_TYPE, oldDeviceType, deviceType));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DevicePackage.DEVICE_TYPE_REF__DEVICE_TYPE:
                if (resolve) return getDeviceType();
                return basicGetDeviceType();
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
            case DevicePackage.DEVICE_TYPE_REF__DEVICE_TYPE:
                setDeviceType((DeviceType)newValue);
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
            case DevicePackage.DEVICE_TYPE_REF__DEVICE_TYPE:
                setDeviceType((DeviceType)null);
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
            case DevicePackage.DEVICE_TYPE_REF__DEVICE_TYPE:
                return deviceType != null;
        }
        return super.eIsSet(featureID);
    }

} //DeviceTypeRefImpl
