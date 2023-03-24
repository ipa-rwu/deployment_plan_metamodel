/**
 */
package de.fraunhofer.ipa.deployment.util;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.PropertyType#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getPropertyType()
 * @model abstract="true"
 * @generated
 */
public interface PropertyType extends EObject {
    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getPropertyType_Type()
     * @model
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link de.fraunhofer.ipa.deployment.util.PropertyType#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

} // PropertyType
