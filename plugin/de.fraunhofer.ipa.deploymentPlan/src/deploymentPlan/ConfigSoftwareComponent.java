/**
 */
package deploymentPlan;

import de.fraunhofer.ipa.deployment.util.AbstractComputationAssignmentTarget;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Software Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.ConfigSoftwareComponent#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see deploymentPlan.DeploymentPlanPackage#getConfigSoftwareComponent()
 * @model
 * @generated
 */
public interface ConfigSoftwareComponent extends AbstarctConfigSoftwareComponent {
    /**
     * Returns the value of the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Component</em>' reference.
     * @see #setComponent(AbstractComputationAssignmentTarget)
     * @see deploymentPlan.DeploymentPlanPackage#getConfigSoftwareComponent_Component()
     * @model required="true"
     * @generated
     */
    AbstractComputationAssignmentTarget getComponent();

    /**
     * Sets the value of the '{@link deploymentPlan.ConfigSoftwareComponent#getComponent <em>Component</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Component</em>' reference.
     * @see #getComponent()
     * @generated
     */
    void setComponent(AbstractComputationAssignmentTarget value);

} // ConfigSoftwareComponent
