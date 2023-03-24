/**
 */
package implementationDescription;

import de.fraunhofer.ipa.deployment.util.AbstractComputationAssignmentTarget;
import de.fraunhofer.ipa.deployment.util.AbstractImplementation;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementationDescription.ImplementationDescription#getName <em>Name</em>}</li>
 *   <li>{@link implementationDescription.ImplementationDescription#getSoftwareDependency <em>Software Dependency</em>}</li>
 *   <li>{@link implementationDescription.ImplementationDescription#getIncludeSoftwareComponent <em>Include Software Component</em>}</li>
 * </ul>
 *
 * @see implementationDescription.ImplementationDescriptionPackage#getImplementationDescription()
 * @model
 * @generated
 */
public interface ImplementationDescription extends AbstractImplementation, AbstractComputationAssignmentTarget {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see implementationDescription.ImplementationDescriptionPackage#getImplementationDescription_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link implementationDescription.ImplementationDescription#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Software Dependency</b></em>' attribute list.
     * The list contents are of type {@link java.lang.String}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Software Dependency</em>' attribute list.
     * @see implementationDescription.ImplementationDescriptionPackage#getImplementationDescription_SoftwareDependency()
     * @model
     * @generated
     */
    EList<String> getSoftwareDependency();

    /**
     * Returns the value of the '<em><b>Include Software Component</b></em>' containment reference list.
     * The list contents are of type {@link implementationDescription.SoftwareComponent}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Include Software Component</em>' containment reference list.
     * @see implementationDescription.ImplementationDescriptionPackage#getImplementationDescription_IncludeSoftwareComponent()
     * @model containment="true" required="true"
     * @generated
     */
    EList<SoftwareComponent> getIncludeSoftwareComponent();

} // ImplementationDescription
