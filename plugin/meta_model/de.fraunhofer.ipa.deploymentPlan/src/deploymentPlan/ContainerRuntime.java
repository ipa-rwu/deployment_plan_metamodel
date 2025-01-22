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
 *   <li>{@link deploymentPlan.ContainerRuntime#getRegistry <em>Registry</em>}</li>
 *   <li>{@link deploymentPlan.ContainerRuntime#getOpertingSystemResource <em>Operting System Resource</em>}</li>
 * </ul>
 *
 * @see deploymentPlan.DeploymentPlanPackage#getContainerRuntime()
 * @model
 * @generated
 */
public interface ContainerRuntime extends AbstractRuntime {
    /**
   * Returns the value of the '<em><b>Registry</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Registry</em>' attribute.
   * @see #setRegistry(String)
   * @see deploymentPlan.DeploymentPlanPackage#getContainerRuntime_Registry()
   * @model
   * @generated
   */
  String getRegistry();

  /**
   * Sets the value of the '{@link deploymentPlan.ContainerRuntime#getRegistry <em>Registry</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Registry</em>' attribute.
   * @see #getRegistry()
   * @generated
   */
  void setRegistry(String value);

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
