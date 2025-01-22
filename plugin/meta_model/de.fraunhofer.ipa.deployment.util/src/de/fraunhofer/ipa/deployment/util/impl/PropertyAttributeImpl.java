/**
 */
package de.fraunhofer.ipa.deployment.util.impl;

import de.fraunhofer.ipa.deployment.util.AttributeKind;
import de.fraunhofer.ipa.deployment.util.PropertyAttribute;
import de.fraunhofer.ipa.deployment.util.PropertyValue;
import de.fraunhofer.ipa.deployment.util.UtilPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.impl.PropertyAttributeImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.impl.PropertyAttributeImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyAttributeImpl extends AbstractPropertyImpl implements PropertyAttribute {
  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected AttributeKind kind;

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
  protected PropertyAttributeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return UtilPackage.Literals.PROPERTY_ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeKind getKind() {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKind(AttributeKind newKind, NotificationChain msgs) {
    AttributeKind oldKind = kind;
    kind = newKind;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          UtilPackage.PROPERTY_ATTRIBUTE__KIND, oldKind, newKind);
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
  public void setKind(AttributeKind newKind) {
    if (newKind != kind) {
      NotificationChain msgs = null;
      if (kind != null)
        msgs = ((InternalEObject) kind).eInverseRemove(this,
            EOPPOSITE_FEATURE_BASE - UtilPackage.PROPERTY_ATTRIBUTE__KIND, null, msgs);
      if (newKind != null)
        msgs = ((InternalEObject) newKind).eInverseAdd(this,
            EOPPOSITE_FEATURE_BASE - UtilPackage.PROPERTY_ATTRIBUTE__KIND, null, msgs);
      msgs = basicSetKind(newKind, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UtilPackage.PROPERTY_ATTRIBUTE__KIND, newKind,
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
          UtilPackage.PROPERTY_ATTRIBUTE__VALUE, oldValue, newValue);
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
            EOPPOSITE_FEATURE_BASE - UtilPackage.PROPERTY_ATTRIBUTE__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject) newValue).eInverseAdd(this,
            EOPPOSITE_FEATURE_BASE - UtilPackage.PROPERTY_ATTRIBUTE__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UtilPackage.PROPERTY_ATTRIBUTE__VALUE, newValue,
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
    case UtilPackage.PROPERTY_ATTRIBUTE__KIND:
      return basicSetKind(null, msgs);
    case UtilPackage.PROPERTY_ATTRIBUTE__VALUE:
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
    case UtilPackage.PROPERTY_ATTRIBUTE__KIND:
      return getKind();
    case UtilPackage.PROPERTY_ATTRIBUTE__VALUE:
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
    case UtilPackage.PROPERTY_ATTRIBUTE__KIND:
      setKind((AttributeKind) newValue);
      return;
    case UtilPackage.PROPERTY_ATTRIBUTE__VALUE:
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
    case UtilPackage.PROPERTY_ATTRIBUTE__KIND:
      setKind((AttributeKind) null);
      return;
    case UtilPackage.PROPERTY_ATTRIBUTE__VALUE:
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
    case UtilPackage.PROPERTY_ATTRIBUTE__KIND:
      return kind != null;
    case UtilPackage.PROPERTY_ATTRIBUTE__VALUE:
      return value != null;
    }
    return super.eIsSet(featureID);
  }

} //PropertyAttributeImpl
