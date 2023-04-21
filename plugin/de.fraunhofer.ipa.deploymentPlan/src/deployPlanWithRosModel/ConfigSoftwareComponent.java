/**
 */
package deployPlanWithRosModel;

import deploymentPlan.AbstarctConfigSoftwareComponent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Software Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deployPlanWithRosModel.ConfigSoftwareComponent#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getConfigSoftwareComponent()
 * @model
 * @generated
 */
public interface ConfigSoftwareComponent extends AbstarctConfigSoftwareComponent {
    /**
     * Returns the value of the '<em><b>Component</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Component</em>' reference.
     * @see #setComponent(system.System)
     * @see deployPlanWithRosModel.DeployPlanWithRosModelPackage#getConfigSoftwareComponent_Component()
     * @model required="true"
     * @generated
     */
    system.System getComponent();

    /**
     * Sets the value of the '{@link deployPlanWithRosModel.ConfigSoftwareComponent#getComponent <em>Component</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Component</em>' reference.
     * @see #getComponent()
     * @generated
     */
    void setComponent(system.System value);

} // ConfigSoftwareComponent
