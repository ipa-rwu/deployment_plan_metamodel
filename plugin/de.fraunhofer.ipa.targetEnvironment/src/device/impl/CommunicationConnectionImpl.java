/**
 */
package device.impl;

import de.fraunhofer.ipa.deployment.util.CommunicationType;

import device.AbstractConnectionProperty;
import device.CommunicationConnection;
import device.DevicePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Communication Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link device.impl.CommunicationConnectionImpl#getType <em>Type</em>}</li>
 *   <li>{@link device.impl.CommunicationConnectionImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationConnectionImpl extends AbstractCommunicationConnectionImpl implements CommunicationConnection {
    /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
    protected CommunicationType type;

    /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
    protected EList<AbstractConnectionProperty> properties;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    protected CommunicationConnectionImpl() {
    super();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    protected EClass eStaticClass() {
    return DevicePackage.Literals.COMMUNICATION_CONNECTION;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public CommunicationType getType() {
    return type;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public NotificationChain basicSetType(CommunicationType newType, NotificationChain msgs) {
    CommunicationType oldType = type;
    type = newType;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DevicePackage.COMMUNICATION_CONNECTION__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public void setType(CommunicationType newType) {
    if (newType != type) {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DevicePackage.COMMUNICATION_CONNECTION__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DevicePackage.COMMUNICATION_CONNECTION__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DevicePackage.COMMUNICATION_CONNECTION__TYPE, newType, newType));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EList<AbstractConnectionProperty> getProperties() {
    if (properties == null) {
      properties = new EObjectContainmentEList<AbstractConnectionProperty>(AbstractConnectionProperty.class, this, DevicePackage.COMMUNICATION_CONNECTION__PROPERTIES);
    }
    return properties;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case DevicePackage.COMMUNICATION_CONNECTION__TYPE:
        return basicSetType(null, msgs);
      case DevicePackage.COMMUNICATION_CONNECTION__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
      case DevicePackage.COMMUNICATION_CONNECTION__TYPE:
        return getType();
      case DevicePackage.COMMUNICATION_CONNECTION__PROPERTIES:
        return getProperties();
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
      case DevicePackage.COMMUNICATION_CONNECTION__TYPE:
        setType((CommunicationType)newValue);
        return;
      case DevicePackage.COMMUNICATION_CONNECTION__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends AbstractConnectionProperty>)newValue);
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
      case DevicePackage.COMMUNICATION_CONNECTION__TYPE:
        setType((CommunicationType)null);
        return;
      case DevicePackage.COMMUNICATION_CONNECTION__PROPERTIES:
        getProperties().clear();
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
      case DevicePackage.COMMUNICATION_CONNECTION__TYPE:
        return type != null;
      case DevicePackage.COMMUNICATION_CONNECTION__PROPERTIES:
        return properties != null && !properties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //CommunicationConnectionImpl
