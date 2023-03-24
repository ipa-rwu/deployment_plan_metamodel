/**
 */
package deployPlanWithRosModel;

import deploymentPlan.AbstractComputationAssignment;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rossystem Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployPlanWithRosModel.RossystemAssignment#getSoftwareComponent <em>Software Component</em>}</li>
 *   <li>{@link deployPlanWithRosModel.RossystemAssignment#getExecutionConfiguration <em>Execution Configuration</em>}</li>
 * </ul>
 *
 * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getRossystemAssignment()
 * @model
 * @generated
 */
public interface RossystemAssignment extends AbstractComputationAssignment {
    /**
     * Returns the value of the '<em><b>Software Component</b></em>' containment reference list.
     * The list contents are of type {@link deployPlanWithRosModel.ConfigRosSoftwareComponent}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Software Component</em>' containment reference list.
     * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getRossystemAssignment_SoftwareComponent()
     * @model containment="true" required="true"
     * @generated
     */
    EList<ConfigRosSoftwareComponent> getSoftwareComponent();

    /**
     * Returns the value of the '<em><b>Execution Configuration</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Execution Configuration</em>' containment reference.
     * @see #setExecutionConfiguration(ConfigRosParameter)
     * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getRossystemAssignment_ExecutionConfiguration()
     * @model containment="true"
     * @generated
     */
    ConfigRosParameter getExecutionConfiguration();

    /**
     * Sets the value of the '{@link deployPlanWithRosModel.RossystemAssignment#getExecutionConfiguration <em>Execution Configuration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Execution Configuration</em>' containment reference.
     * @see #getExecutionConfiguration()
     * @generated
     */
    void setExecutionConfiguration(ConfigRosParameter value);

} // RossystemAssignment
