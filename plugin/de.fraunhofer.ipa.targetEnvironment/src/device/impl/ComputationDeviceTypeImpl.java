/**
 */
package device.impl;

import device.AbstractComputationResource;
import device.ComputationDeviceType;
import device.DevicePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computation Device Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link device.impl.ComputationDeviceTypeImpl#getComputationResource <em>Computation Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputationDeviceTypeImpl extends DeviceTypeImpl implements ComputationDeviceType {
    /**
     * The cached value of the '{@link #getComputationResource() <em>Computation Resource</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComputationResource()
     * @generated
     * @ordered
     */
    protected EList<AbstractComputationResource> computationResource;

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
    public EList<AbstractComputationResource> getComputationResource() {
        if (computationResource == null) {
            computationResource = new EObjectContainmentEList<AbstractComputationResource>(AbstractComputationResource.class, this, DevicePackage.COMPUTATION_DEVICE_TYPE__COMPUTATION_RESOURCE);
        }
        return computationResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DevicePackage.COMPUTATION_DEVICE_TYPE__COMPUTATION_RESOURCE:
                return ((InternalEList<?>)getComputationResource()).basicRemove(otherEnd, msgs);
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
            case DevicePackage.COMPUTATION_DEVICE_TYPE__COMPUTATION_RESOURCE:
                return getComputationResource();
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
            case DevicePackage.COMPUTATION_DEVICE_TYPE__COMPUTATION_RESOURCE:
                getComputationResource().clear();
                getComputationResource().addAll((Collection<? extends AbstractComputationResource>)newValue);
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
            case DevicePackage.COMPUTATION_DEVICE_TYPE__COMPUTATION_RESOURCE:
                getComputationResource().clear();
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
            case DevicePackage.COMPUTATION_DEVICE_TYPE__COMPUTATION_RESOURCE:
                return computationResource != null && !computationResource.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ComputationDeviceTypeImpl
