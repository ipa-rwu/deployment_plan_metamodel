/**
 */
package targetEnvironment.impl;

import de.fraunhofer.ipa.deployment.util.AbstractProperty;
import de.fraunhofer.ipa.deployment.util.PropertyValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targetEnvironment.ConfigDeviceProperty;
import targetEnvironment.TargetEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config Device Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targetEnvironment.impl.ConfigDevicePropertyImpl#getName <em>Name</em>}</li>
 *   <li>{@link targetEnvironment.impl.ConfigDevicePropertyImpl#getRefProperty <em>Ref Property</em>}</li>
 *   <li>{@link targetEnvironment.impl.ConfigDevicePropertyImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigDevicePropertyImpl extends AbstractConfigPropertyImpl implements ConfigDeviceProperty {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getRefProperty() <em>Ref Property</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefProperty()
     * @generated
     * @ordered
     */
    protected AbstractProperty refProperty;

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
    protected ConfigDevicePropertyImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TargetEnvironmentPackage.Literals.CONFIG_DEVICE_PROPERTY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractProperty getRefProperty() {
        if (refProperty != null && refProperty.eIsProxy()) {
            InternalEObject oldRefProperty = (InternalEObject)refProperty;
            refProperty = (AbstractProperty)eResolveProxy(oldRefProperty);
            if (refProperty != oldRefProperty) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__REF_PROPERTY, oldRefProperty, refProperty));
            }
        }
        return refProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractProperty basicGetRefProperty() {
        return refProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRefProperty(AbstractProperty newRefProperty) {
        AbstractProperty oldRefProperty = refProperty;
        refProperty = newRefProperty;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__REF_PROPERTY, oldRefProperty, refProperty));
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
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__VALUE, oldValue, newValue);
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
                msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__VALUE, null, msgs);
            if (newValue != null)
                msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__VALUE, null, msgs);
            msgs = basicSetValue(newValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__VALUE, newValue, newValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__VALUE:
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
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__NAME:
                return getName();
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__REF_PROPERTY:
                if (resolve) return getRefProperty();
                return basicGetRefProperty();
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__VALUE:
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
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__NAME:
                setName((String)newValue);
                return;
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__REF_PROPERTY:
                setRefProperty((AbstractProperty)newValue);
                return;
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__VALUE:
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
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__NAME:
                setName(NAME_EDEFAULT);
                return;
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__REF_PROPERTY:
                setRefProperty((AbstractProperty)null);
                return;
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__VALUE:
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
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__REF_PROPERTY:
                return refProperty != null;
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__VALUE:
                return value != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //ConfigDevicePropertyImpl
