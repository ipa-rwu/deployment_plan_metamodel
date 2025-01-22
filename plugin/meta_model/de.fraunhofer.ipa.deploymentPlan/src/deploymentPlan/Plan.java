/**
 */
package deploymentPlan;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.Plan#getPlan <em>Plan</em>}</li>
 * </ul>
 *
 * @see deploymentPlan.DeploymentPlanPackage#getPlan()
 * @model
 * @generated
 */
public interface Plan extends EObject {
    /**
   * Returns the value of the '<em><b>Plan</b></em>' containment reference.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the value of the '<em>Plan</em>' containment reference.
   * @see #setPlan(AbstractDeploymentPlan)
   * @see deploymentPlan.DeploymentPlanPackage#getPlan_Plan()
   * @model containment="true" required="true"
   * @generated
   */
    AbstractDeploymentPlan getPlan();

    /**
   * Sets the value of the '{@link deploymentPlan.Plan#getPlan <em>Plan</em>}' containment reference.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @param value the new value of the '<em>Plan</em>' containment reference.
   * @see #getPlan()
   * @generated
   */
    void setPlan(AbstractDeploymentPlan value);

} // Plan
