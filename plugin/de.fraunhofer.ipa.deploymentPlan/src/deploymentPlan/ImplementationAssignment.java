/**
 */
package deploymentPlan;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Implementation Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.ImplementationAssignment#getSoftwareComponents <em>Software Components</em>}</li>
 * </ul>
 *
 * @see deploymentPlan.DeploymentPlanPackage#getImplementationAssignment()
 * @model
 * @generated
 */
public interface ImplementationAssignment extends AbstractComputationAssignment {

    /**
   * Returns the value of the '<em><b>Software Components</b></em>' containment reference list.
   * The list contents are of type {@link deploymentPlan.ConfigSoftwareComponent}.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the value of the '<em>Software Components</em>' containment reference list.
   * @see deploymentPlan.DeploymentPlanPackage#getImplementationAssignment_SoftwareComponents()
   * @model containment="true" required="true"
   * @generated
   */
    EList<ConfigSoftwareComponent> getSoftwareComponents();
} // ImplementationAssignment
