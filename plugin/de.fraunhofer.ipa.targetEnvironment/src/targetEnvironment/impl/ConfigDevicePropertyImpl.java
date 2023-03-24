/**
 */
package targetEnvironment.impl;

import de.fraunhofer.ipa.deployment.util.PropertyValue;

import device.DeviceProperty;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import targetEnvironment.AbstractDeviceInstance;
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
 *   <li>{@link targetEnvironment.impl.ConfigDevicePropertyImpl#getFrom <em>From</em>}</li>
 *   <li>{@link targetEnvironment.impl.ConfigDevicePropertyImpl#getValue <em>Value</em>}</li>
 *   <li>{@link targetEnvironment.impl.ConfigDevicePropertyImpl#getFullname <em>Fullname</em>}</li>
 *   <li>{@link targetEnvironment.impl.ConfigDevicePropertyImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigDevicePropertyImpl extends AbstractConfigPropertyImpl implements ConfigDeviceProperty {
    /**
     * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFrom()
     * @generated
     * @ordered
     */
    protected DeviceProperty from;

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
     * The default value of the '{@link #getFullname() <em>Fullname</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFullname()
     * @generated
     * @ordered
     */
    protected static final String FULLNAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFullname() <em>Fullname</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFullname()
     * @generated
     * @ordered
     */
    protected String fullname = FULLNAME_EDEFAULT;

    /**
     * This is true if the Fullname attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fullnameESet;

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
    public DeviceProperty getFrom() {
        if (from != null && from.eIsProxy()) {
            InternalEObject oldFrom = (InternalEObject)from;
            from = (DeviceProperty)eResolveProxy(oldFrom);
            if (from != oldFrom) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__FROM, oldFrom, from));
            }
        }
        return from;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public DeviceProperty basicGetFrom() {
        return from;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFrom(DeviceProperty newFrom) {
        DeviceProperty oldFrom = from;
        from = newFrom;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__FROM, oldFrom, from));
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
     * @generated NOT
     */
    public String getFullname() {
        AbstractDeviceInstance parent = getParent();
        String name;
        name = String.format("%s/%s", parent.getName(), getFrom().getName());
        System.out.println(String.format("Full name is: %s", name));
        return name;
    }


    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public boolean isSetFullname() {
        return true;
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
     * @generated NOT
     */
    public AbstractDeviceInstance getParent() {
        AbstractDeviceInstance parent = (AbstractDeviceInstance) this.eContainer();
        return parent;
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
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__FROM:
                if (resolve) return getFrom();
                return basicGetFrom();
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__VALUE:
                return getValue();
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__FULLNAME:
                return getFullname();
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__NAME:
                return getName();
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
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__FROM:
                setFrom((DeviceProperty)newValue);
                return;
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__VALUE:
                setValue((PropertyValue)newValue);
                return;
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__NAME:
                setName((String)newValue);
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
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__FROM:
                setFrom((DeviceProperty)null);
                return;
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__VALUE:
                setValue((PropertyValue)null);
                return;
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__NAME:
                setName(NAME_EDEFAULT);
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
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__FROM:
                return from != null;
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__VALUE:
                return value != null;
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__FULLNAME:
                return isSetFullname();
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
        switch (operationID) {
            case TargetEnvironmentPackage.CONFIG_DEVICE_PROPERTY___GET_PARENT:
                return getParent();
        }
        return super.eInvoke(operationID, arguments);
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
        result.append(" (fullname: ");
        if (fullnameESet) result.append(fullname); else result.append("<unset>");
        result.append(", name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //ConfigDevicePropertyImpl
