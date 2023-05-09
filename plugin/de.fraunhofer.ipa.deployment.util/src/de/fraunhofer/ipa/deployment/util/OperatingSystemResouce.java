/**
 */
package de.fraunhofer.ipa.deployment.util;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operating System Resouce</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.OperatingSystemResouce#getType <em>Type</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.OperatingSystemResouce#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getOperatingSystemResouce()
 * @model
 * @generated
 */
public interface OperatingSystemResouce extends AbstractComputationResource {
    /**
     * Returns the value of the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' containment reference.
     * @see #setType(OpertingSystemResouceType)
     * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getOperatingSystemResouce_Type()
     * @model containment="true"
     * @generated
     */
    OpertingSystemResouceType getType();

    /**
     * Sets the value of the '{@link de.fraunhofer.ipa.deployment.util.OperatingSystemResouce#getType <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' containment reference.
     * @see #getType()
     * @generated
     */
    void setType(OpertingSystemResouceType value);

    /**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
     * The list contents are of type {@link de.fraunhofer.ipa.deployment.util.AbstractOperatingSystemProperty}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference list.
     * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getOperatingSystemResouce_Properties()
     * @model containment="true" required="true"
     * @generated
     */
    EList<AbstractOperatingSystemProperty> getProperties();

} // OperatingSystemResouce
