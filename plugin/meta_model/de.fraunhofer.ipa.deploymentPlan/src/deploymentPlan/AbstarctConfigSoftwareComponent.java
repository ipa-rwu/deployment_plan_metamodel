/**
 */
package deploymentPlan;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstarct Config Software Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.AbstarctConfigSoftwareComponent#getExecutionConfiguration <em>Execution Configuration</em>}</li>
 *   <li>{@link deploymentPlan.AbstarctConfigSoftwareComponent#getStartCommand <em>Start Command</em>}</li>
 * </ul>
 *
 * @see deploymentPlan.DeploymentPlanPackage#getAbstarctConfigSoftwareComponent()
 * @model abstract="true"
 * @generated
 */
public interface AbstarctConfigSoftwareComponent extends EObject {
    /**
   * Returns the value of the '<em><b>Execution Configuration</b></em>' containment reference list.
   * The list contents are of type {@link deploymentPlan.AbstractConfigExecutionParameter}.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the value of the '<em>Execution Configuration</em>' containment reference list.
   * @see deploymentPlan.DeploymentPlanPackage#getAbstarctConfigSoftwareComponent_ExecutionConfiguration()
   * @model containment="true"
   * @generated
   */
    EList<AbstractConfigExecutionParameter> getExecutionConfiguration();

    /**
   * Returns the value of the '<em><b>Start Command</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the value of the '<em>Start Command</em>' attribute list.
   * @see deploymentPlan.DeploymentPlanPackage#getAbstarctConfigSoftwareComponent_StartCommand()
   * @model
   * @generated
   */
    EList<String> getStartCommand();

} // AbstarctConfigSoftwareComponent
