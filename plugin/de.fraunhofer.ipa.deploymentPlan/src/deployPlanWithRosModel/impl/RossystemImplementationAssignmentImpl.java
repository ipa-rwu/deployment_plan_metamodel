/**
 */
package deployPlanWithRosModel.impl;

import deployPlanWithRosModel.ConfigRosSoftwareComponent;
import deployPlanWithRosModel.DeployPlanWithRosModelPackage;
import deployPlanWithRosModel.RossystemImplementationAssignment;

import deploymentPlan.impl.AbstractComputationAssignmentImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rossystem Implementation Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deployPlanWithRosModel.impl.RossystemImplementationAssignmentImpl#getSoftwareComponents <em>Software Components</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RossystemImplementationAssignmentImpl extends AbstractComputationAssignmentImpl implements RossystemImplementationAssignment {
    /**
   * The cached value of the '{@link #getSoftwareComponents() <em>Software Components</em>}' containment reference list.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getSoftwareComponents()
   * @generated
   * @ordered
   */
    protected EList<ConfigRosSoftwareComponent> softwareComponents;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    protected RossystemImplementationAssignmentImpl() {
    super();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    protected EClass eStaticClass() {
    return DeployPlanWithRosModelPackage.Literals.ROSSYSTEM_IMPLEMENTATION_ASSIGNMENT;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EList<ConfigRosSoftwareComponent> getSoftwareComponents() {
    if (softwareComponents == null) {
      softwareComponents = new EObjectContainmentEList<ConfigRosSoftwareComponent>(ConfigRosSoftwareComponent.class, this, DeployPlanWithRosModelPackage.ROSSYSTEM_IMPLEMENTATION_ASSIGNMENT__SOFTWARE_COMPONENTS);
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
      case DeployPlanWithRosModelPackage.ROSSYSTEM_IMPLEMENTATION_ASSIGNMENT__SOFTWARE_COMPONENTS:
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
      case DeployPlanWithRosModelPackage.ROSSYSTEM_IMPLEMENTATION_ASSIGNMENT__SOFTWARE_COMPONENTS:
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
      case DeployPlanWithRosModelPackage.ROSSYSTEM_IMPLEMENTATION_ASSIGNMENT__SOFTWARE_COMPONENTS:
        getSoftwareComponents().clear();
        getSoftwareComponents().addAll((Collection<? extends ConfigRosSoftwareComponent>)newValue);
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
      case DeployPlanWithRosModelPackage.ROSSYSTEM_IMPLEMENTATION_ASSIGNMENT__SOFTWARE_COMPONENTS:
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
      case DeployPlanWithRosModelPackage.ROSSYSTEM_IMPLEMENTATION_ASSIGNMENT__SOFTWARE_COMPONENTS:
        return softwareComponents != null && !softwareComponents.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RossystemImplementationAssignmentImpl
