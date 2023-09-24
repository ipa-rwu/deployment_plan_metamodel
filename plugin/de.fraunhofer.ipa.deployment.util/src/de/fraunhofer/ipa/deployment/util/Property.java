/**
 */
package de.fraunhofer.ipa.deployment.util;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.Property#getKind <em>Kind</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.Property#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends AbstractProperty {
  /**
   * Returns the value of the '<em><b>Kind</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' containment reference.
   * @see #setKind(PropertyKind)
   * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getProperty_Kind()
   * @model containment="true" required="true"
   * @generated
   */
  PropertyKind getKind();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.util.Property#getKind <em>Kind</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' containment reference.
   * @see #getKind()
   * @generated
   */
  void setKind(PropertyKind value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference list.
   * The list contents are of type {@link de.fraunhofer.ipa.deployment.util.PropertyValue}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference list.
   * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getProperty_Value()
   * @model containment="true" upper="2"
   * @generated
   */
  EList<PropertyValue> getValue();

} // Property
