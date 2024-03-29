/**
 */
package device.impl;

import device.AbstractCommunicationConnection;
import device.AbstractDeviceType;
import device.DevicePackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Device Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link device.impl.AbstractDeviceTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link device.impl.AbstractDeviceTypeImpl#getCommunicationConnection <em>Communication Connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractDeviceTypeImpl extends MinimalEObjectImpl.Container implements AbstractDeviceType {
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
   * The cached value of the '{@link #getCommunicationConnection() <em>Communication Connection</em>}' containment reference list.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getCommunicationConnection()
   * @generated
   * @ordered
   */
    protected EList<AbstractCommunicationConnection> communicationConnection;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    protected AbstractDeviceTypeImpl() {
    super();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    protected EClass eStaticClass() {
    return DevicePackage.Literals.ABSTRACT_DEVICE_TYPE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, DevicePackage.ABSTRACT_DEVICE_TYPE__NAME, oldName, name));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EList<AbstractCommunicationConnection> getCommunicationConnection() {
    if (communicationConnection == null) {
      communicationConnection = new EObjectContainmentEList<AbstractCommunicationConnection>(AbstractCommunicationConnection.class, this, DevicePackage.ABSTRACT_DEVICE_TYPE__COMMUNICATION_CONNECTION);
    }
    return communicationConnection;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case DevicePackage.ABSTRACT_DEVICE_TYPE__COMMUNICATION_CONNECTION:
        return ((InternalEList<?>)getCommunicationConnection()).basicRemove(otherEnd, msgs);
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
      case DevicePackage.ABSTRACT_DEVICE_TYPE__NAME:
        return getName();
      case DevicePackage.ABSTRACT_DEVICE_TYPE__COMMUNICATION_CONNECTION:
        return getCommunicationConnection();
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
      case DevicePackage.ABSTRACT_DEVICE_TYPE__NAME:
        setName((String)newValue);
        return;
      case DevicePackage.ABSTRACT_DEVICE_TYPE__COMMUNICATION_CONNECTION:
        getCommunicationConnection().clear();
        getCommunicationConnection().addAll((Collection<? extends AbstractCommunicationConnection>)newValue);
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
      case DevicePackage.ABSTRACT_DEVICE_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DevicePackage.ABSTRACT_DEVICE_TYPE__COMMUNICATION_CONNECTION:
        getCommunicationConnection().clear();
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
      case DevicePackage.ABSTRACT_DEVICE_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DevicePackage.ABSTRACT_DEVICE_TYPE__COMMUNICATION_CONNECTION:
        return communicationConnection != null && !communicationConnection.isEmpty();
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

} //AbstractDeviceTypeImpl
