/**
 */
package de.fraunhofer.ipa.deployment.util.impl;

import de.fraunhofer.ipa.deployment.util.MinimumKind;
import de.fraunhofer.ipa.deployment.util.PropertyMinimum;
import de.fraunhofer.ipa.deployment.util.PropertyValue;
import de.fraunhofer.ipa.deployment.util.UtilPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Minimum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.impl.PropertyMinimumImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.impl.PropertyMinimumImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyMinimumImpl extends AbstractPropertyImpl implements PropertyMinimum {
  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected MinimumKind kind;

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
  protected PropertyMinimumImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return UtilPackage.Literals.PROPERTY_MINIMUM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MinimumKind getKind() {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKind(MinimumKind newKind, NotificationChain msgs) {
    MinimumKind oldKind = kind;
    kind = newKind;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          UtilPackage.PROPERTY_MINIMUM__KIND, oldKind, newKind);
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
  public void setKind(MinimumKind newKind) {
    if (newKind != kind) {
      NotificationChain msgs = null;
      if (kind != null)
        msgs = ((InternalEObject) kind).eInverseRemove(this,
            EOPPOSITE_FEATURE_BASE - UtilPackage.PROPERTY_MINIMUM__KIND, null, msgs);
      if (newKind != null)
        msgs = ((InternalEObject) newKind).eInverseAdd(this,
            EOPPOSITE_FEATURE_BASE - UtilPackage.PROPERTY_MINIMUM__KIND, null, msgs);
      msgs = basicSetKind(newKind, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UtilPackage.PROPERTY_MINIMUM__KIND, newKind,
          newKind));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          UtilPackage.PROPERTY_MINIMUM__VALUE, oldValue, newValue);
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
  public void setValue(PropertyValue newValue) {
    if (newValue != value) {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject) value).eInverseRemove(this,
            EOPPOSITE_FEATURE_BASE - UtilPackage.PROPERTY_MINIMUM__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject) newValue).eInverseAdd(this,
            EOPPOSITE_FEATURE_BASE - UtilPackage.PROPERTY_MINIMUM__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UtilPackage.PROPERTY_MINIMUM__VALUE, newValue,
          newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
    case UtilPackage.PROPERTY_MINIMUM__KIND:
      return basicSetKind(null, msgs);
    case UtilPackage.PROPERTY_MINIMUM__VALUE:
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
    case UtilPackage.PROPERTY_MINIMUM__KIND:
      return getKind();
    case UtilPackage.PROPERTY_MINIMUM__VALUE:
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
    case UtilPackage.PROPERTY_MINIMUM__KIND:
      setKind((MinimumKind) newValue);
      return;
    case UtilPackage.PROPERTY_MINIMUM__VALUE:
      setValue((PropertyValue) newValue);
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
    case UtilPackage.PROPERTY_MINIMUM__KIND:
      setKind((MinimumKind) null);
      return;
    case UtilPackage.PROPERTY_MINIMUM__VALUE:
      setValue((PropertyValue) null);
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
    case UtilPackage.PROPERTY_MINIMUM__KIND:
      return kind != null;
    case UtilPackage.PROPERTY_MINIMUM__VALUE:
      return value != null;
    }
    return super.eIsSet(featureID);
  }

} //PropertyMinimumImpl
