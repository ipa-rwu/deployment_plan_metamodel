/**
 */
package de.fraunhofer.ipa.deployment.util;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.AbstractProperty#getName <em>Name</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.AbstractProperty#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getAbstractProperty()
 * @model abstract="true"
 * @generated
 */
public interface AbstractProperty extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getAbstractProperty_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link de.fraunhofer.ipa.deployment.util.AbstractProperty#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getAbstractProperty_Description()
     * @model
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link de.fraunhofer.ipa.deployment.util.AbstractProperty#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
    void setDescription(String value);

} // AbstractProperty
