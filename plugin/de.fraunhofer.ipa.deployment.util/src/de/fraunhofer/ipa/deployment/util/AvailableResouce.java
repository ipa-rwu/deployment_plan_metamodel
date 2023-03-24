/**
 */
package de.fraunhofer.ipa.deployment.util;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Available Resouce</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.AvailableResouce#getList <em>List</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.AvailableResouce#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getAvailableResouce()
 * @model
 * @generated
 */
public interface AvailableResouce extends EObject {
    /**
     * Returns the value of the '<em><b>List</b></em>' containment reference list.
     * The list contents are of type {@link de.fraunhofer.ipa.deployment.util.AbstractResouceType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>List</em>' containment reference list.
     * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getAvailableResouce_List()
     * @model containment="true"
     * @generated
     */
    EList<AbstractResouceType> getList();

    /**
     * Returns the value of the '<em><b>Property</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Property</em>' reference.
     * @see #setProperty(AbstractProperty)
     * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getAvailableResouce_Property()
     * @model
     * @generated
     */
    AbstractProperty getProperty();

    /**
     * Sets the value of the '{@link de.fraunhofer.ipa.deployment.util.AvailableResouce#getProperty <em>Property</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Property</em>' reference.
     * @see #getProperty()
     * @generated
     */
    void setProperty(AbstractProperty value);

} // AvailableResouce
