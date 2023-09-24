/**
 */
package de.fraunhofer.ipa.deployment.util;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ubuntu Version Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.UbuntuVersionValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getUbuntuVersionValue()
 * @model
 * @generated
 */
public interface UbuntuVersionValue extends PropertyValue {
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link de.fraunhofer.ipa.deployment.util.UbuntuVersion}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see de.fraunhofer.ipa.deployment.util.UbuntuVersion
   * @see #setValue(UbuntuVersion)
   * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getUbuntuVersionValue_Value()
   * @model required="true"
   * @generated
   */
  UbuntuVersion getValue();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.util.UbuntuVersionValue#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see de.fraunhofer.ipa.deployment.util.UbuntuVersion
   * @see #getValue()
   * @generated
   */
  void setValue(UbuntuVersion value);

} // UbuntuVersionValue
