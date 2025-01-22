/**
 */
package deploymentPlan.impl;

import deploymentPlan.ConfigSoftwareComponent;
import deploymentPlan.DeploymentPlanPackage;
import deploymentPlan.ImplementationAssignment;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.impl.ImplementationAssignmentImpl#getSoftwareComponents <em>Software Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationAssignmentImpl extends AbstractComputationAssignmentImpl implements ImplementationAssignment {
    /**
   * The cached value of the '{@link #getSoftwareComponents() <em>Software Components</em>}' containment reference list.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getSoftwareComponents()
   * @generated
   * @ordered
   */
    protected EList<ConfigSoftwareComponent> softwareComponents;

                /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    protected ImplementationAssignmentImpl() {
    super();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    protected EClass eStaticClass() {
    return DeploymentPlanPackage.Literals.IMPLEMENTATION_ASSIGNMENT;
  }

                /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EList<ConfigSoftwareComponent> getSoftwareComponents() {
    if (softwareComponents == null) {
      softwareComponents = new EObjectContainmentEList<ConfigSoftwareComponent>(ConfigSoftwareComponent.class, this, DeploymentPlanPackage.IMPLEMENTATION_ASSIGNMENT__SOFTWARE_COMPONENTS);
    }
    return softwareComponents;
  }

                /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case DeploymentPlanPackage.IMPLEMENTATION_ASSIGNMENT__SOFTWARE_COMPONENTS:
        return ((InternalEList<?>)getSoftwareComponents()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

                /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case DeploymentPlanPackage.IMPLEMENTATION_ASSIGNMENT__SOFTWARE_COMPONENTS:
        return getSoftwareComponents();
    }
    return super.eGet(featureID, resolve, coreType);
  }

                /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
    switch (featureID) {
      case DeploymentPlanPackage.IMPLEMENTATION_ASSIGNMENT__SOFTWARE_COMPONENTS:
        getSoftwareComponents().clear();
        getSoftwareComponents().addAll((Collection<? extends ConfigSoftwareComponent>)newValue);
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
      case DeploymentPlanPackage.IMPLEMENTATION_ASSIGNMENT__SOFTWARE_COMPONENTS:
        getSoftwareComponents().clear();
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
      case DeploymentPlanPackage.IMPLEMENTATION_ASSIGNMENT__SOFTWARE_COMPONENTS:
        return softwareComponents != null && !softwareComponents.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ImplementationAssignmentImpl
