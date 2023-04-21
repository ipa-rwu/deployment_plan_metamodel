/**
 */
package deployPlanWithRosModel;

import deploymentPlan.Middleware;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rossystem Assignment2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployPlanWithRosModel.RossystemAssignment2#getSoftwareComponent <em>Software Component</em>}</li>
 *   <li>{@link deployPlanWithRosModel.RossystemAssignment2#getExecutionConfiguration <em>Execution Configuration</em>}</li>
 *   <li>{@link deployPlanWithRosModel.RossystemAssignment2#getMiddleware <em>Middleware</em>}</li>
 * </ul>
 *
 * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getRossystemAssignment2()
 * @model
 * @generated
 */
public interface RossystemAssignment2 extends EObject {
    /**
     * Returns the value of the '<em><b>Software Component</b></em>' containment reference list.
     * The list contents are of type {@link deployPlanWithRosModel.ConfigRosSoftwareComponent}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Software Component</em>' containment reference list.
     * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getRossystemAssignment2_SoftwareComponent()
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
     * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getRossystemAssignment2_ExecutionConfiguration()
     * @model containment="true"
     * @generated
     */
    ConfigRosParameter getExecutionConfiguration();

    /**
     * Sets the value of the '{@link deployPlanWithRosModel.RossystemAssignment2#getExecutionConfiguration <em>Execution Configuration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Execution Configuration</em>' containment reference.
     * @see #getExecutionConfiguration()
     * @generated
     */
    void setExecutionConfiguration(ConfigRosParameter value);

    /**
     * Returns the value of the '<em><b>Middleware</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Middleware</em>' containment reference.
     * @see #setMiddleware(Middleware)
     * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getRossystemAssignment2_Middleware()
     * @model containment="true"
     * @generated
     */
    Middleware getMiddleware();

    /**
     * Sets the value of the '{@link deployPlanWithRosModel.RossystemAssignment2#getMiddleware <em>Middleware</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Middleware</em>' containment reference.
     * @see #getMiddleware()
     * @generated
     */
    void setMiddleware(Middleware value);

} // RossystemAssignment2
