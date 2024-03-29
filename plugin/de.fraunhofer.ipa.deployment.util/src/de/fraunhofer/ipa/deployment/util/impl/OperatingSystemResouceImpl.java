/**
 */
package de.fraunhofer.ipa.deployment.util.impl;

import de.fraunhofer.ipa.deployment.util.AbstractOperatingSystemProperty;
import de.fraunhofer.ipa.deployment.util.OperatingSystemResouce;
import de.fraunhofer.ipa.deployment.util.OpertingSystemResouceType;
import de.fraunhofer.ipa.deployment.util.UtilPackage;

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
 * An implementation of the model object '<em><b>Operating System Resouce</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.impl.OperatingSystemResouceImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.impl.OperatingSystemResouceImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatingSystemResouceImpl extends AbstractComputationResourceImpl implements OperatingSystemResouce {
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected OpertingSystemResouceType type;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<AbstractOperatingSystemProperty> properties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OperatingSystemResouceImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return UtilPackage.Literals.OPERATING_SYSTEM_RESOUCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OpertingSystemResouceType getType() {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(OpertingSystemResouceType newType, NotificationChain msgs) {
    OpertingSystemResouceType oldType = type;
    type = newType;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          UtilPackage.OPERATING_SYSTEM_RESOUCE__TYPE, oldType, newType);
      if (msgs == null)
        msgs = notification;
      else
        msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(OpertingSystemResouceType newType) {
    if (newType != type) {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject) type).eInverseRemove(this,
            EOPPOSITE_FEATURE_BASE - UtilPackage.OPERATING_SYSTEM_RESOUCE__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject) newType).eInverseAdd(this,
            EOPPOSITE_FEATURE_BASE - UtilPackage.OPERATING_SYSTEM_RESOUCE__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UtilPackage.OPERATING_SYSTEM_RESOUCE__TYPE, newType,
          newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AbstractOperatingSystemProperty> getProperties() {
    if (properties == null) {
      properties = new EObjectContainmentEList<AbstractOperatingSystemProperty>(
          AbstractOperatingSystemProperty.class, this, UtilPackage.OPERATING_SYSTEM_RESOUCE__PROPERTIES);
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
    case UtilPackage.OPERATING_SYSTEM_RESOUCE__TYPE:
      return basicSetType(null, msgs);
    case UtilPackage.OPERATING_SYSTEM_RESOUCE__PROPERTIES:
      return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
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
    case UtilPackage.OPERATING_SYSTEM_RESOUCE__TYPE:
      return getType();
    case UtilPackage.OPERATING_SYSTEM_RESOUCE__PROPERTIES:
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
    case UtilPackage.OPERATING_SYSTEM_RESOUCE__TYPE:
      setType((OpertingSystemResouceType) newValue);
      return;
    case UtilPackage.OPERATING_SYSTEM_RESOUCE__PROPERTIES:
      getProperties().clear();
      getProperties().addAll((Collection<? extends AbstractOperatingSystemProperty>) newValue);
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
    case UtilPackage.OPERATING_SYSTEM_RESOUCE__TYPE:
      setType((OpertingSystemResouceType) null);
      return;
    case UtilPackage.OPERATING_SYSTEM_RESOUCE__PROPERTIES:
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
    case UtilPackage.OPERATING_SYSTEM_RESOUCE__TYPE:
      return type != null;
    case UtilPackage.OPERATING_SYSTEM_RESOUCE__PROPERTIES:
      return properties != null && !properties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //OperatingSystemResouceImpl
