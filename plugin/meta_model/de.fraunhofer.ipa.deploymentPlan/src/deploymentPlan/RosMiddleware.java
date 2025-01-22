/**
 */
package deploymentPlan;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ros Middleware</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.RosMiddleware#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see deploymentPlan.DeploymentPlanPackage#getRosMiddleware()
 * @model
 * @generated
 */
public interface RosMiddleware extends Middleware {
    /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * The literals are from the enumeration {@link deploymentPlan.ROSDistro}.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see deploymentPlan.ROSDistro
   * @see #setValue(ROSDistro)
   * @see deploymentPlan.DeploymentPlanPackage#getRosMiddleware_Value()
   * @model required="true"
   * @generated
   */
    ROSDistro getValue();

    /**
   * Sets the value of the '{@link deploymentPlan.RosMiddleware#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see deploymentPlan.ROSDistro
   * @see #getValue()
   * @generated
   */
    void setValue(ROSDistro value);

} // RosMiddleware
