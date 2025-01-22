/**
 */
package de.fraunhofer.ipa.deployment.util;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.PropertyRange#getKind <em>Kind</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.PropertyRange#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getPropertyRange()
 * @model
 * @generated
 */
public interface PropertyRange extends AbstractProperty {
  /**
   * Returns the value of the '<em><b>Kind</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Kind</em>' containment reference.
   * @see #setKind(RangeKind)
   * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getPropertyRange_Kind()
   * @model containment="true" required="true"
   * @generated
   */
  RangeKind getKind();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.util.PropertyRange#getKind <em>Kind</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Kind</em>' containment reference.
   * @see #getKind()
   * @generated
   */
  void setKind(RangeKind value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference list.
   * The list contents are of type {@link de.fraunhofer.ipa.deployment.util.PropertyValue}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference list.
   * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getPropertyRange_Value()
   * @model containment="true" upper="2"
   * @generated
   */
  EList<PropertyValue> getValue();

} // PropertyRange
