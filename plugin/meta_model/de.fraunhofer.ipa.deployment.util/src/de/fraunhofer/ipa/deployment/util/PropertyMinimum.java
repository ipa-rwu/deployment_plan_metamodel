/**
 */
package de.fraunhofer.ipa.deployment.util;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Minimum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.PropertyMinimum#getKind <em>Kind</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.PropertyMinimum#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getPropertyMinimum()
 * @model
 * @generated
 */
public interface PropertyMinimum extends AbstractProperty {
  /**
   * Returns the value of the '<em><b>Kind</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' containment reference.
   * @see #setKind(MinimumKind)
   * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getPropertyMinimum_Kind()
   * @model containment="true" required="true"
   * @generated
   */
  MinimumKind getKind();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.util.PropertyMinimum#getKind <em>Kind</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' containment reference.
   * @see #getKind()
   * @generated
   */
  void setKind(MinimumKind value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(PropertyValue)
   * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getPropertyMinimum_Value()
   * @model containment="true"
   * @generated
   */
  PropertyValue getValue();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.util.PropertyMinimum#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(PropertyValue value);

} // PropertyMinimum
