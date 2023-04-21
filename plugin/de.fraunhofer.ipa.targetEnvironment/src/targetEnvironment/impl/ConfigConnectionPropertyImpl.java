/**
 */
package targetEnvironment.impl;

import base.PropertyValue;

import device.ConnectionProperty;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import targetEnvironment.ConfigConnectionProperty;
import targetEnvironment.TargetEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config Connection Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targetEnvironment.impl.ConfigConnectionPropertyImpl#getRefConnectionProperty <em>Ref Connection Property</em>}</li>
 *   <li>{@link targetEnvironment.impl.ConfigConnectionPropertyImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigConnectionPropertyImpl extends MinimalEObjectImpl.Container implements ConfigConnectionProperty {
    /**
     * The cached value of the '{@link #getRefConnectionProperty() <em>Ref Connection Property</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefConnectionProperty()
     * @generated
     * @ordered
     */
    protected ConnectionProperty refConnectionProperty;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected PropertyValue value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConfigConnectionPropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TargetEnvironmentPackage.Literals.CONFIG_CONNECTION_PROPERTY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectionProperty getRefConnectionProperty() {
        if (refConnectionProperty != null && refConnectionProperty.eIsProxy()) {
            InternalEObject oldRefConnectionProperty = (InternalEObject)refConnectionProperty;
            refConnectionProperty = (ConnectionProperty)eResolveProxy(oldRefConnectionProperty);
            if (refConnectionProperty != oldRefConnectionProperty) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TargetEnvironmentPackage.CONFIG_CONNECTION_PROPERTY__REF_CONNECTION_PROPERTY, oldRefConnectionProperty, refConnectionProperty));
            }
        }
        return refConnectionProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConnectionProperty basicGetRefConnectionProperty() {
        return refConnectionProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRefConnectionProperty(ConnectionProperty newRefConnectionProperty) {
        ConnectionProperty oldRefConnectionProperty = refConnectionProperty;
        refConnectionProperty = newRefConnectionProperty;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TargetEnvironmentPackage.CONFIG_CONNECTION_PROPERTY__REF_CONNECTION_PROPERTY, oldRefConnectionProperty, refConnectionProperty));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertyValue getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetValue(PropertyValue newValue, NotificationChain msgs) {
        PropertyValue oldValue = value;
        value = newValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetEnvironmentPackage.CONFIG_CONNECTION_PROPERTY__VALUE, oldValue, newValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(PropertyValue newValue) {
        if (newValue != value) {
            NotificationChain msgs = null;
            if (value != null)
                msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetEnvironmentPackage.CONFIG_CONNECTION_PROPERTY__VALUE, null, msgs);
            if (newValue != null)
                msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetEnvironmentPackage.CONFIG_CONNECTION_PROPERTY__VALUE, null, msgs);
            msgs = basicSetValue(newValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TargetEnvironmentPackage.CONFIG_CONNECTION_PROPERTY__VALUE, newValue, newValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TargetEnvironmentPackage.CONFIG_CONNECTION_PROPERTY__VALUE:
                return basicSetValue(null, msgs);
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
            case TargetEnvironmentPackage.CONFIG_CONNECTION_PROPERTY__REF_CONNECTION_PROPERTY:
                if (resolve) return getRefConnectionProperty();
                return basicGetRefConnectionProperty();
            case TargetEnvironmentPackage.CONFIG_CONNECTION_PROPERTY__VALUE:
                return getValue();
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
            case TargetEnvironmentPackage.CONFIG_CONNECTION_PROPERTY__REF_CONNECTION_PROPERTY:
                setRefConnectionProperty((ConnectionProperty)newValue);
                return;
            case TargetEnvironmentPackage.CONFIG_CONNECTION_PROPERTY__VALUE:
                setValue((PropertyValue)newValue);
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
            case TargetEnvironmentPackage.CONFIG_CONNECTION_PROPERTY__REF_CONNECTION_PROPERTY:
                setRefConnectionProperty((ConnectionProperty)null);
                return;
            case TargetEnvironmentPackage.CONFIG_CONNECTION_PROPERTY__VALUE:
                setValue((PropertyValue)null);
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
            case TargetEnvironmentPackage.CONFIG_CONNECTION_PROPERTY__REF_CONNECTION_PROPERTY:
                return refConnectionProperty != null;
            case TargetEnvironmentPackage.CONFIG_CONNECTION_PROPERTY__VALUE:
                return value != null;
        }
        return super.eIsSet(featureID);
    }

} //ConfigConnectionPropertyImpl
