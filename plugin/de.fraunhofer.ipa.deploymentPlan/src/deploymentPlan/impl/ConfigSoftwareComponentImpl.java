/**
 */
package deploymentPlan.impl;

import de.fraunhofer.ipa.deployment.util.AbstractComputationAssignmentTarget;

import deploymentPlan.ConfigSoftwareComponent;
import deploymentPlan.DeploymentPlanPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config Software Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.impl.ConfigSoftwareComponentImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigSoftwareComponentImpl extends AbstarctConfigSoftwareComponentImpl implements ConfigSoftwareComponent {
    /**
   * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getComponent()
   * @generated
   * @ordered
   */
    protected AbstractComputationAssignmentTarget component;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    protected ConfigSoftwareComponentImpl() {
    super();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    protected EClass eStaticClass() {
    return DeploymentPlanPackage.Literals.CONFIG_SOFTWARE_COMPONENT;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public AbstractComputationAssignmentTarget getComponent() {
    if (component != null && component.eIsProxy()) {
      InternalEObject oldComponent = (InternalEObject)component;
      component = (AbstractComputationAssignmentTarget)eResolveProxy(oldComponent);
      if (component != oldComponent) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPlanPackage.CONFIG_SOFTWARE_COMPONENT__COMPONENT, oldComponent, component));
      }
    }
    return component;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public AbstractComputationAssignmentTarget basicGetComponent() {
    return component;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public void setComponent(AbstractComputationAssignmentTarget newComponent) {
    AbstractComputationAssignmentTarget oldComponent = component;
    component = newComponent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPlanPackage.CONFIG_SOFTWARE_COMPONENT__COMPONENT, oldComponent, component));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DeploymentPlanPackage.CONFIG_SOFTWARE_COMPONENT__COMPONENT:
        if (resolve) return getComponent();
        return basicGetComponent();
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
      case DeploymentPlanPackage.CONFIG_SOFTWARE_COMPONENT__COMPONENT:
        setComponent((AbstractComputationAssignmentTarget)newValue);
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
      case DeploymentPlanPackage.CONFIG_SOFTWARE_COMPONENT__COMPONENT:
        setComponent((AbstractComputationAssignmentTarget)null);
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
      case DeploymentPlanPackage.CONFIG_SOFTWARE_COMPONENT__COMPONENT:
        return component != null;
    }
    return super.eIsSet(featureID);
  }

} //ConfigSoftwareComponentImpl
