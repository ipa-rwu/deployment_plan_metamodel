/**
 */
package de.fraunhofer.ipa.deployment.util;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.PropertySelection#getKind <em>Kind</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.PropertySelection#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getPropertySelection()
 * @model
 * @generated
 */
public interface PropertySelection extends AbstractProperty {
    /**
     * Returns the value of the '<em><b>Kind</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' containment reference.
     * @see #setKind(SelectionKind)
     * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getPropertySelection_Kind()
     * @model containment="true" required="true"
     * @generated
     */
    SelectionKind getKind();

    /**
     * Sets the value of the '{@link de.fraunhofer.ipa.deployment.util.PropertySelection#getKind <em>Kind</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' containment reference.
     * @see #getKind()
     * @generated
     */
    void setKind(SelectionKind value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference list.
     * The list contents are of type {@link de.fraunhofer.ipa.deployment.util.PropertyValue}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference list.
     * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getPropertySelection_Value()
     * @model containment="true"
     * @generated
     */
    EList<PropertyValue> getValue();

} // PropertySelection
