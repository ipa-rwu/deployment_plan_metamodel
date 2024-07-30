/**
 */
package targetEnvironment.impl;

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

import targetEnvironment.AbstractDeviceInstance;
import targetEnvironment.ConfigDeviceProperty;
import targetEnvironment.TargetEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Device Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targetEnvironment.impl.AbstractDeviceInstanceImpl#getName <em>Name</em>}</li>
 *   <li>{@link targetEnvironment.impl.AbstractDeviceInstanceImpl#getConfigDeviceProperty <em>Config Device Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractDeviceInstanceImpl extends MinimalEObjectImpl.Container implements AbstractDeviceInstance {
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
   * The cached value of the '{@link #getConfigDeviceProperty() <em>Config Device Property</em>}' containment reference list.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getConfigDeviceProperty()
   * @generated
   * @ordered
   */
    protected EList<ConfigDeviceProperty> configDeviceProperty;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    protected AbstractDeviceInstanceImpl() {
    super();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    protected EClass eStaticClass() {
    return TargetEnvironmentPackage.Literals.ABSTRACT_DEVICE_INSTANCE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TargetEnvironmentPackage.ABSTRACT_DEVICE_INSTANCE__NAME, oldName, name));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EList<ConfigDeviceProperty> getConfigDeviceProperty() {
    if (configDeviceProperty == null) {
      configDeviceProperty = new EObjectContainmentEList<ConfigDeviceProperty>(ConfigDeviceProperty.class, this, TargetEnvironmentPackage.ABSTRACT_DEVICE_INSTANCE__CONFIG_DEVICE_PROPERTY);
    }
    return configDeviceProperty;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case TargetEnvironmentPackage.ABSTRACT_DEVICE_INSTANCE__CONFIG_DEVICE_PROPERTY:
        return ((InternalEList<?>)getConfigDeviceProperty()).basicRemove(otherEnd, msgs);
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
      case TargetEnvironmentPackage.ABSTRACT_DEVICE_INSTANCE__NAME:
        return getName();
      case TargetEnvironmentPackage.ABSTRACT_DEVICE_INSTANCE__CONFIG_DEVICE_PROPERTY:
        return getConfigDeviceProperty();
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
      case TargetEnvironmentPackage.ABSTRACT_DEVICE_INSTANCE__NAME:
        setName((String)newValue);
        return;
      case TargetEnvironmentPackage.ABSTRACT_DEVICE_INSTANCE__CONFIG_DEVICE_PROPERTY:
        getConfigDeviceProperty().clear();
        getConfigDeviceProperty().addAll((Collection<? extends ConfigDeviceProperty>)newValue);
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
      case TargetEnvironmentPackage.ABSTRACT_DEVICE_INSTANCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TargetEnvironmentPackage.ABSTRACT_DEVICE_INSTANCE__CONFIG_DEVICE_PROPERTY:
        getConfigDeviceProperty().clear();
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
      case TargetEnvironmentPackage.ABSTRACT_DEVICE_INSTANCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TargetEnvironmentPackage.ABSTRACT_DEVICE_INSTANCE__CONFIG_DEVICE_PROPERTY:
        return configDeviceProperty != null && !configDeviceProperty.isEmpty();
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

} //AbstractDeviceInstanceImpl
