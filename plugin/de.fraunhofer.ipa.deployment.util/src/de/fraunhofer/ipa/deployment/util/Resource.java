/**
 */
package de.fraunhofer.ipa.deployment.util;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.Resource#getType <em>Type</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.Resource#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getResource()
 * @model
 * @generated
 */
public interface Resource extends AbstractResource {
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(AbstractResouceType)
   * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getResource_Type()
   * @model containment="true" required="true"
   * @generated
   */
  AbstractResouceType getType();

  /**
   * Sets the value of the '{@link de.fraunhofer.ipa.deployment.util.Resource#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(AbstractResouceType value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link de.fraunhofer.ipa.deployment.util.AbstractProperty}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getResource_Properties()
   * @model containment="true"
   * @generated
   */
  EList<AbstractProperty> getProperties();

} // Resource
