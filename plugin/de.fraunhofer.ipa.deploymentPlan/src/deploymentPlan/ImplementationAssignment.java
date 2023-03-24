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
 *   <li>{@link deploymentPlan.ImplementationAssignment#getSoftwareComponent <em>Software Component</em>}</li>
 *   <li>{@link deploymentPlan.ImplementationAssignment#getMiddleware <em>Middleware</em>}</li>
 * </ul>
 *
 * @see deploymentPlan.DeploymentPlanPackage#getImplementationAssignment()
 * @model
 * @generated
 */
public interface ImplementationAssignment extends AbstractComputationAssignment {
    /**
     * Returns the value of the '<em><b>Software Component</b></em>' containment reference list.
     * The list contents are of type {@link deploymentPlan.ConfigSoftwareComponent}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Software Component</em>' containment reference list.
     * @see deploymentPlan.DeploymentPlanPackage#getImplementationAssignment_SoftwareComponent()
     * @model containment="true" required="true"
     * @generated
     */
    EList<ConfigSoftwareComponent> getSoftwareComponent();

    /**
     * Returns the value of the '<em><b>Middleware</b></em>' containment reference list.
     * The list contents are of type {@link deploymentPlan.Middleware}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Middleware</em>' containment reference list.
     * @see deploymentPlan.DeploymentPlanPackage#getImplementationAssignment_Middleware()
     * @model containment="true"
     * @generated
     */
    EList<Middleware> getMiddleware();

} // ImplementationAssignment
