/**
 */
package deploymentPlan;

import de.fraunhofer.ipa.deployment.util.OperatingSystemResouce;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Runtime</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.ContainerRuntime#getOpertingSystemResource <em>Operting System Resource</em>}</li>
 * </ul>
 *
 * @see deploymentPlan.DeploymentPlanPackage#getContainerRuntime()
 * @model
 * @generated
 */
public interface ContainerRuntime extends AbstractRuntime {
    /**
     * Returns the value of the '<em><b>Operting System Resource</b></em>' containment reference list.
     * The list contents are of type {@link de.fraunhofer.ipa.deployment.util.OperatingSystemResouce}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operting System Resource</em>' containment reference list.
     * @see deploymentPlan.DeploymentPlanPackage#getContainerRuntime_OpertingSystemResource()
     * @model containment="true" upper="2"
     * @generated
     */
    EList<OperatingSystemResouce> getOpertingSystemResource();

} // ContainerRuntime
