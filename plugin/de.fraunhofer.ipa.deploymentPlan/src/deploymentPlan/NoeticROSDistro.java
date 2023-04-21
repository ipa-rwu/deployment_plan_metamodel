/**
 */
package deploymentPlan;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Noetic ROS Distro</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.NoeticROSDistro#getVersion <em>Version</em>}</li>
 *   <li>{@link deploymentPlan.NoeticROSDistro#getDistro <em>Distro</em>}</li>
 * </ul>
 *
 * @see deploymentPlan.DeploymentPlanPackage#getNoeticROSDistro()
 * @model
 * @generated
 */
public interface NoeticROSDistro extends EObject {

    /**
     * Returns the value of the '<em><b>Version</b></em>' attribute.
     * The default value is <code>"1"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Version</em>' attribute.
     * @see deploymentPlan.DeploymentPlanPackage#getNoeticROSDistro_Version()
     * @model default="1" required="true" changeable="false"
     * @generated
     */
    String getVersion();

    /**
     * Returns the value of the '<em><b>Distro</b></em>' attribute.
     * The default value is <code>"noetic"</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Distro</em>' attribute.
     * @see deploymentPlan.DeploymentPlanPackage#getNoeticROSDistro_Distro()
     * @model default="noetic" required="true" changeable="false"
     * @generated
     */
    String getDistro();

} // NoeticROSDistro
