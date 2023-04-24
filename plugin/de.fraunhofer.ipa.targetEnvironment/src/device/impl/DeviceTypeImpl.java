/**
 */
package device.impl;

import device.DevicePackage;
import device.DeviceResource;
import device.DeviceType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link device.impl.DeviceTypeImpl#getDeviceResource <em>Device Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceTypeImpl extends AbstractDeviceTypeImpl implements DeviceType {
    /**
     * The cached value of the '{@link #getDeviceResource() <em>Device Resource</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeviceResource()
     * @generated
     * @ordered
     */
    protected EList<DeviceResource> deviceResource;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DeviceTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DevicePackage.Literals.DEVICE_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<DeviceResource> getDeviceResource() {
        if (deviceResource == null) {
            deviceResource = new EObjectContainmentEList<DeviceResource>(DeviceResource.class, this, DevicePackage.DEVICE_TYPE__DEVICE_RESOURCE);
        }
        return deviceResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DevicePackage.DEVICE_TYPE__DEVICE_RESOURCE:
                return ((InternalEList<?>)getDeviceResource()).basicRemove(otherEnd, msgs);
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
            case DevicePackage.DEVICE_TYPE__DEVICE_RESOURCE:
                return getDeviceResource();
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
            case DevicePackage.DEVICE_TYPE__DEVICE_RESOURCE:
                getDeviceResource().clear();
                getDeviceResource().addAll((Collection<? extends DeviceResource>)newValue);
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
            case DevicePackage.DEVICE_TYPE__DEVICE_RESOURCE:
                getDeviceResource().clear();
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
            case DevicePackage.DEVICE_TYPE__DEVICE_RESOURCE:
                return deviceResource != null && !deviceResource.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //DeviceTypeImpl
