/**
 */
package de.fraunhofer.ipa.deployment.util;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.PropertyAttribute#getKind <em>Kind</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.PropertyAttribute#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getPropertyAttribute()
 * @model
 * @generated
 */
public interface PropertyAttribute extends AbstractProperty {
  /**
   * Returns the value of the '<em><b>Kind</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' containment reference.
   * @see #setKind(AttributeKind)
   * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getPropertyAttribute_Kind()
   * @model containment="true" required="true"
   * @generated
   */
  AttributeKind getKind();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.util.PropertyAttribute#getKind <em>Kind</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' containment reference.
   * @see #getKind()
   * @generated
   */
  void setKind(AttributeKind value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(PropertyValue)
   * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getPropertyAttribute_Value()
   * @model containment="true"
   * @generated
   */
  PropertyValue getValue();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.util.PropertyAttribute#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(PropertyValue value);

} // PropertyAttribute
