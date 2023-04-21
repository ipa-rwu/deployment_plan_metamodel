/**
 */
package implementationDescription;

import de.fraunhofer.ipa.deployment.util.AbstractComputationAssignmentTarget;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementationDescription.SoftwareComponent#getName <em>Name</em>}</li>
 *   <li>{@link implementationDescription.SoftwareComponent#getRepository <em>Repository</em>}</li>
 *   <li>{@link implementationDescription.SoftwareComponent#getExecutionRequirement <em>Execution Requirement</em>}</li>
 * </ul>
 *
 * @see implementationDescription.ImplementationDescriptionPackage#getSoftwareComponent()
 * @model
 * @generated
 */
public interface SoftwareComponent extends AbstractComputationAssignmentTarget {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see implementationDescription.ImplementationDescriptionPackage#getSoftwareComponent_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link implementationDescription.SoftwareComponent#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Repository</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Repository</em>' containment reference.
     * @see #setRepository(Repository)
     * @see implementationDescription.ImplementationDescriptionPackage#getSoftwareComponent_Repository()
     * @model containment="true" required="true"
     * @generated
     */
    Repository getRepository();

    /**
     * Sets the value of the '{@link implementationDescription.SoftwareComponent#getRepository <em>Repository</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Repository</em>' containment reference.
     * @see #getRepository()
     * @generated
     */
    void setRepository(Repository value);

    /**
     * Returns the value of the '<em><b>Execution Requirement</b></em>' containment reference list.
     * The list contents are of type {@link implementationDescription.ExecutionRequirement}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Execution Requirement</em>' containment reference list.
     * @see implementationDescription.ImplementationDescriptionPackage#getSoftwareComponent_ExecutionRequirement()
     * @model containment="true"
     * @generated
     */
    EList<ExecutionRequirement> getExecutionRequirement();

} // SoftwareComponent
