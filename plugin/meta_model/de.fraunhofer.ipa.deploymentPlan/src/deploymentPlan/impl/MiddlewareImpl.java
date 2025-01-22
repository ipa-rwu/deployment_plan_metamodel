/**
 */
package deploymentPlan.impl;

import deploymentPlan.DeploymentPlanPackage;
import deploymentPlan.Middleware;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Middleware</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class MiddlewareImpl extends MinimalEObjectImpl.Container implements Middleware {
    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    protected MiddlewareImpl() {
    super();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    protected EClass eStaticClass() {
    return DeploymentPlanPackage.Literals.MIDDLEWARE;
  }

} //MiddlewareImpl
