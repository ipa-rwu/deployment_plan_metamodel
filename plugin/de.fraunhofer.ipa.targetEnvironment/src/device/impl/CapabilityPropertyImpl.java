/**
 */
package device.impl;

import device.CapabilityKind;
import device.CapabilityProperty;
import device.CapabilityType;
import device.DevicePackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capability Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link device.impl.CapabilityPropertyImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link device.impl.CapabilityPropertyImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapabilityPropertyImpl extends PropertyImpl implements CapabilityProperty {
    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected CapabilityKind kind;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected CapabilityType type;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CapabilityPropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DevicePackage.Literals.CAPABILITY_PROPERTY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CapabilityKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetKind(CapabilityKind newKind, NotificationChain msgs) {
        CapabilityKind oldKind = kind;
        kind = newKind;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DevicePackage.CAPABILITY_PROPERTY__KIND, oldKind, newKind);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setKind(CapabilityKind newKind) {
        if (newKind != kind) {
            NotificationChain msgs = null;
            if (kind != null)
                msgs = ((InternalEObject)kind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevicePackage.CAPABILITY_PROPERTY__KIND, null, msgs);
            if (newKind != null)
                msgs = ((InternalEObject)newKind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DevicePackage.CAPABILITY_PROPERTY__KIND, null, msgs);
            msgs = basicSetKind(newKind, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DevicePackage.CAPABILITY_PROPERTY__KIND, newKind, newKind));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CapabilityType getType() {
        if (type != null && type.eIsProxy()) {
            InternalEObject oldType = (InternalEObject)type;
            type = (CapabilityType)eResolveProxy(oldType);
            if (type != oldType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DevicePackage.CAPABILITY_PROPERTY__TYPE, oldType, type));
            }
        }
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CapabilityType basicGetType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(CapabilityType newType) {
        CapabilityType oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DevicePackage.CAPABILITY_PROPERTY__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DevicePackage.CAPABILITY_PROPERTY__KIND:
                return basicSetKind(null, msgs);
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
            case DevicePackage.CAPABILITY_PROPERTY__KIND:
                return getKind();
            case DevicePackage.CAPABILITY_PROPERTY__TYPE:
                if (resolve) return getType();
                return basicGetType();
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
            case DevicePackage.CAPABILITY_PROPERTY__KIND:
                setKind((CapabilityKind)newValue);
                return;
            case DevicePackage.CAPABILITY_PROPERTY__TYPE:
                setType((CapabilityType)newValue);
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
            case DevicePackage.CAPABILITY_PROPERTY__KIND:
                setKind((CapabilityKind)null);
                return;
            case DevicePackage.CAPABILITY_PROPERTY__TYPE:
                setType((CapabilityType)null);
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
            case DevicePackage.CAPABILITY_PROPERTY__KIND:
                return kind != null;
            case DevicePackage.CAPABILITY_PROPERTY__TYPE:
                return type != null;
        }
        return super.eIsSet(featureID);
    }

} //CapabilityPropertyImpl
