/**
 */
package deployPlanWithRosModel;

import deploymentPlan.AbstractComputationAssignment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rossystem Implementation Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployPlanWithRosModel.RossystemImplementationAssignment#getSoftwareComponents <em>Software Components</em>}</li>
 * </ul>
 *
 * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getRossystemImplementationAssignment()
 * @model
 * @generated
 */
public interface RossystemImplementationAssignment extends AbstractComputationAssignment {
    /**
   * Returns the value of the '<em><b>Software Components</b></em>' containment reference list.
   * The list contents are of type {@link deployPlanWithRosModel.ConfigRosSoftwareComponent}.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the value of the '<em>Software Components</em>' containment reference list.
   * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getRossystemImplementationAssignment_SoftwareComponents()
   * @model containment="true" required="true"
   * @generated
   */
    EList<ConfigRosSoftwareComponent> getSoftwareComponents();

} // RossystemImplementationAssignment
