/**
 */
package deployPlanWithRosModel;

import deploymentPlan.AbstractDeploymentPlan;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deploy Rossystem Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployPlanWithRosModel.DeployRossystemPlan#getTargetRossystem <em>Target Rossystem</em>}</li>
 * </ul>
 *
 * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getDeployRossystemPlan()
 * @model
 * @generated
 */
public interface DeployRossystemPlan extends AbstractDeploymentPlan {
  /**
   * Returns the value of the '<em><b>Target Rossystem</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target Rossystem</em>' reference.
   * @see #setTargetRossystem(system.System)
   * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getDeployRossystemPlan_TargetRossystem()
   * @model
   * @generated
   */
  system.System getTargetRossystem();

  /**
   * Sets the value of the '{@link deployPlanWithRosModel.DeployRossystemPlan#getTargetRossystem <em>Target Rossystem</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Rossystem</em>' reference.
   * @see #getTargetRossystem()
   * @generated
   */
  void setTargetRossystem(system.System value);

} // DeployRossystemPlan
