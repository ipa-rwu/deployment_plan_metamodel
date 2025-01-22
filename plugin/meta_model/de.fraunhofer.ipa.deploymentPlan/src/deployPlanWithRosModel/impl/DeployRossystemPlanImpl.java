/**
 */
package deployPlanWithRosModel.impl;

import deployPlanWithRosModel.DeployPlanWithRosModelPackage;
import deployPlanWithRosModel.DeployRossystemPlan;

import deploymentPlan.impl.AbstractDeploymentPlanImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deploy Rossystem Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deployPlanWithRosModel.impl.DeployRossystemPlanImpl#getTargetRossystem <em>Target Rossystem</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeployRossystemPlanImpl extends AbstractDeploymentPlanImpl implements DeployRossystemPlan {
  /**
   * The cached value of the '{@link #getTargetRossystem() <em>Target Rossystem</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetRossystem()
   * @generated
   * @ordered
   */
  protected system.System targetRossystem;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DeployRossystemPlanImpl() {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass() {
    return DeployPlanWithRosModelPackage.Literals.DEPLOY_ROSSYSTEM_PLAN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public system.System getTargetRossystem() {
    if (targetRossystem != null && targetRossystem.eIsProxy()) {
      InternalEObject oldTargetRossystem = (InternalEObject)targetRossystem;
      targetRossystem = (system.System)eResolveProxy(oldTargetRossystem);
      if (targetRossystem != oldTargetRossystem) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeployPlanWithRosModelPackage.DEPLOY_ROSSYSTEM_PLAN__TARGET_ROSSYSTEM, oldTargetRossystem, targetRossystem));
      }
    }
    return targetRossystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public system.System basicGetTargetRossystem() {
    return targetRossystem;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetRossystem(system.System newTargetRossystem) {
    system.System oldTargetRossystem = targetRossystem;
    targetRossystem = newTargetRossystem;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeployPlanWithRosModelPackage.DEPLOY_ROSSYSTEM_PLAN__TARGET_ROSSYSTEM, oldTargetRossystem, targetRossystem));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DeployPlanWithRosModelPackage.DEPLOY_ROSSYSTEM_PLAN__TARGET_ROSSYSTEM:
        if (resolve) return getTargetRossystem();
        return basicGetTargetRossystem();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case DeployPlanWithRosModelPackage.DEPLOY_ROSSYSTEM_PLAN__TARGET_ROSSYSTEM:
        setTargetRossystem((system.System)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID) {
    switch (featureID) {
      case DeployPlanWithRosModelPackage.DEPLOY_ROSSYSTEM_PLAN__TARGET_ROSSYSTEM:
        setTargetRossystem((system.System)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID) {
    switch (featureID) {
      case DeployPlanWithRosModelPackage.DEPLOY_ROSSYSTEM_PLAN__TARGET_ROSSYSTEM:
        return targetRossystem != null;
    }
    return super.eIsSet(featureID);
  }

} //DeployRossystemPlanImpl
