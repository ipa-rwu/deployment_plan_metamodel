/**
 */
package deploymentPlan;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Humble ROS Distro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.HumbleROSDistro#getVersion <em>Version</em>}</li>
 *   <li>{@link deploymentPlan.HumbleROSDistro#getDistro <em>Distro</em>}</li>
 * </ul>
 *
 * @see deploymentPlan.DeploymentPlanPackage#getHumbleROSDistro()
 * @model
 * @generated
 */
public interface HumbleROSDistro extends EObject {

    /**
     * Returns the value of the '<em><b>Version</b></em>' attribute.
     * The default value is <code>"2"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Version</em>' attribute.
     * @see deploymentPlan.DeploymentPlanPackage#getHumbleROSDistro_Version()
     * @model default="2" required="true" changeable="false"
     * @generated
     */
    String getVersion();

    /**
     * Returns the value of the '<em><b>Distro</b></em>' attribute.
     * The default value is <code>"humble"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Distro</em>' attribute.
     * @see deploymentPlan.DeploymentPlanPackage#getHumbleROSDistro_Distro()
     * @model default="humble" required="true" changeable="false"
     * @generated
     */
    String getDistro();

} // HumbleROSDistro
