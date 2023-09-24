/**
 */
package de.fraunhofer.ipa.deployment.util;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Value String</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.PropertyValueString#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getPropertyValueString()
 * @model
 * @generated
 */
public interface PropertyValueString extends PropertyValue {
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getPropertyValueString_Value()
   * @model required="true"
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.util.PropertyValueString#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // PropertyValueString
