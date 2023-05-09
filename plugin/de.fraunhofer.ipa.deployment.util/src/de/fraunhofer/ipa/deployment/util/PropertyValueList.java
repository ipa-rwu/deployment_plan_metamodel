/**
 */
package de.fraunhofer.ipa.deployment.util;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Value List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.PropertyValueList#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getPropertyValueList()
 * @model
 * @generated
 */
public interface PropertyValueList extends PropertyValue {
    /**
     * Returns the value of the '<em><b>Value</b></em>' containment reference list.
     * The list contents are of type {@link de.fraunhofer.ipa.deployment.util.PropertyValue}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' containment reference list.
     * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getPropertyValueList_Value()
     * @model containment="true" required="true"
     * @generated
     */
    EList<PropertyValue> getValue();

} // PropertyValueList
