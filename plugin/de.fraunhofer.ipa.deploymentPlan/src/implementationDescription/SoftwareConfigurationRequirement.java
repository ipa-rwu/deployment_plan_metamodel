/**
 */
package implementationDescription;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Software Configuration Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link implementationDescription.SoftwareConfigurationRequirement#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see implementationDescription.ImplementationDescriptionPackage#getSoftwareConfigurationRequirement()
 * @model
 * @generated
 */
public interface SoftwareConfigurationRequirement extends ExecutionRequirement {
    /**
     * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
     * The list contents are of type {@link implementationDescription.SoftwareExecutionParemeter}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameter</em>' containment reference list.
     * @see implementationDescription.ImplementationDescriptionPackage#getSoftwareConfigurationRequirement_Parameter()
     * @model containment="true" required="true"
     * @generated
     */
    EList<SoftwareExecutionParemeter> getParameter();

} // SoftwareConfigurationRequirement
