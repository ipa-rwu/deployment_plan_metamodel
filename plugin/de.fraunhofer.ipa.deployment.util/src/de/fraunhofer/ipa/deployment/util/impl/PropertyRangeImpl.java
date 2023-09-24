/**
 */
package de.fraunhofer.ipa.deployment.util.impl;

import de.fraunhofer.ipa.deployment.util.PropertyRange;
import de.fraunhofer.ipa.deployment.util.PropertyValue;
import de.fraunhofer.ipa.deployment.util.RangeKind;
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
 * An implementation of the model object '<em><b>Property Range</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.impl.PropertyRangeImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.impl.PropertyRangeImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyRangeImpl extends AbstractPropertyImpl implements PropertyRange {
  /**
   * The cached value of the '{@link #getKind() <em>Kind</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getKind()
   * @generated
   * @ordered
   */
  protected RangeKind kind;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected EList<PropertyValue> value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyRangeImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return UtilPackage.Literals.PROPERTY_RANGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RangeKind getKind() {
    return kind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetKind(RangeKind newKind, NotificationChain msgs) {
    RangeKind oldKind = kind;
    kind = newKind;
    if (eNotificationRequired()) {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
          UtilPackage.PROPERTY_RANGE__KIND, oldKind, newKind);
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
  public void setKind(RangeKind newKind) {
    if (newKind != kind) {
      NotificationChain msgs = null;
      if (kind != null)
        msgs = ((InternalEObject) kind).eInverseRemove(this,
            EOPPOSITE_FEATURE_BASE - UtilPackage.PROPERTY_RANGE__KIND, null, msgs);
      if (newKind != null)
        msgs = ((InternalEObject) newKind).eInverseAdd(this,
            EOPPOSITE_FEATURE_BASE - UtilPackage.PROPERTY_RANGE__KIND, null, msgs);
      msgs = basicSetKind(newKind, msgs);
      if (msgs != null)
        msgs.dispatch();
    } else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UtilPackage.PROPERTY_RANGE__KIND, newKind, newKind));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PropertyValue> getValue() {
    if (value == null) {
      value = new EObjectContainmentEList<PropertyValue>(PropertyValue.class, this,
          UtilPackage.PROPERTY_RANGE__VALUE);
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
    case UtilPackage.PROPERTY_RANGE__KIND:
      return basicSetKind(null, msgs);
    case UtilPackage.PROPERTY_RANGE__VALUE:
      return ((InternalEList<?>) getValue()).basicRemove(otherEnd, msgs);
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
    case UtilPackage.PROPERTY_RANGE__KIND:
      return getKind();
    case UtilPackage.PROPERTY_RANGE__VALUE:
      return getValue();
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
    case UtilPackage.PROPERTY_RANGE__KIND:
      setKind((RangeKind) newValue);
      return;
    case UtilPackage.PROPERTY_RANGE__VALUE:
      getValue().clear();
      getValue().addAll((Collection<? extends PropertyValue>) newValue);
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
    case UtilPackage.PROPERTY_RANGE__KIND:
      setKind((RangeKind) null);
      return;
    case UtilPackage.PROPERTY_RANGE__VALUE:
      getValue().clear();
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
    case UtilPackage.PROPERTY_RANGE__KIND:
      return kind != null;
    case UtilPackage.PROPERTY_RANGE__VALUE:
      return value != null && !value.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PropertyRangeImpl
