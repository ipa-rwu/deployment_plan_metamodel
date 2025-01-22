/**
 */
package deployPlanWithRosModel;

import deploymentPlan.AbstractComputationAssignment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rossystem Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployPlanWithRosModel.RossystemImplementation#getSoftwareComponents <em>Software Components</em>}</li>
 * </ul>
 *
 * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getRossystemImplementation()
 * @model
 * @generated
 */
public interface RossystemImplementation extends AbstractComputationAssignment {
    /**
     * Returns the value of the '<em><b>Software Components</b></em>' containment reference list.
     * The list contents are of type {@link deployPlanWithRosModel.ConfigRosSoftwareComponent}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Software Components</em>' containment reference list.
     * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getRossystemImplementation_SoftwareComponents()
     * @model containment="true" required="true"
     * @generated
     */
    EList<ConfigRosSoftwareComponent> getSoftwareComponents();

} // RossystemImplementation
