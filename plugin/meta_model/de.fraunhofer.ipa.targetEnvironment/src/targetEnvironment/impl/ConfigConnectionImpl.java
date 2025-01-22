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

import targetEnvironment.ConfigConnection;
import targetEnvironment.ConnectedDevice;
import targetEnvironment.TargetEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targetEnvironment.impl.ConfigConnectionImpl#getName <em>Name</em>}</li>
 *   <li>{@link targetEnvironment.impl.ConfigConnectionImpl#getConnectDevice <em>Connect Device</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigConnectionImpl extends MinimalEObjectImpl.Container implements ConfigConnection {
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
   * The cached value of the '{@link #getConnectDevice() <em>Connect Device</em>}' containment reference list.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getConnectDevice()
   * @generated
   * @ordered
   */
    protected EList<ConnectedDevice> connectDevice;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    protected ConfigConnectionImpl() {
    super();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    protected EClass eStaticClass() {
    return TargetEnvironmentPackage.Literals.CONFIG_CONNECTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TargetEnvironmentPackage.CONFIG_CONNECTION__NAME, oldName, name));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EList<ConnectedDevice> getConnectDevice() {
    if (connectDevice == null) {
      connectDevice = new EObjectContainmentEList<ConnectedDevice>(ConnectedDevice.class, this, TargetEnvironmentPackage.CONFIG_CONNECTION__CONNECT_DEVICE);
    }
    return connectDevice;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case TargetEnvironmentPackage.CONFIG_CONNECTION__CONNECT_DEVICE:
        return ((InternalEList<?>)getConnectDevice()).basicRemove(otherEnd, msgs);
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
      case TargetEnvironmentPackage.CONFIG_CONNECTION__NAME:
        return getName();
      case TargetEnvironmentPackage.CONFIG_CONNECTION__CONNECT_DEVICE:
        return getConnectDevice();
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
      case TargetEnvironmentPackage.CONFIG_CONNECTION__NAME:
        setName((String)newValue);
        return;
      case TargetEnvironmentPackage.CONFIG_CONNECTION__CONNECT_DEVICE:
        getConnectDevice().clear();
        getConnectDevice().addAll((Collection<? extends ConnectedDevice>)newValue);
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
      case TargetEnvironmentPackage.CONFIG_CONNECTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case TargetEnvironmentPackage.CONFIG_CONNECTION__CONNECT_DEVICE:
        getConnectDevice().clear();
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
      case TargetEnvironmentPackage.CONFIG_CONNECTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case TargetEnvironmentPackage.CONFIG_CONNECTION__CONNECT_DEVICE:
        return connectDevice != null && !connectDevice.isEmpty();
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

} //ConfigConnectionImpl
