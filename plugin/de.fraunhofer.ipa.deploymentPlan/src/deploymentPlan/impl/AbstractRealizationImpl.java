/**
 */
package deploymentPlan.impl;

import deploymentPlan.AbstractComputationAssignment;
import deploymentPlan.AbstractRealization;
import deploymentPlan.DeploymentPlanPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Realization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.impl.AbstractRealizationImpl#getRealizations <em>Realizations</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractRealizationImpl extends MinimalEObjectImpl.Container implements AbstractRealization {
    /**
     * The cached value of the '{@link #getRealizations() <em>Realizations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRealizations()
     * @generated
     * @ordered
     */
    protected EList<AbstractComputationAssignment> realizations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstractRealizationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DeploymentPlanPackage.Literals.ABSTRACT_REALIZATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbstractComputationAssignment> getRealizations() {
        if (realizations == null) {
            realizations = new EObjectContainmentEList<AbstractComputationAssignment>(AbstractComputationAssignment.class, this, DeploymentPlanPackage.ABSTRACT_REALIZATION__REALIZATIONS);
        }
        return realizations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DeploymentPlanPackage.ABSTRACT_REALIZATION__REALIZATIONS:
                return ((InternalEList<?>)getRealizations()).basicRemove(otherEnd, msgs);
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
            case DeploymentPlanPackage.ABSTRACT_REALIZATION__REALIZATIONS:
                return getRealizations();
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
            case DeploymentPlanPackage.ABSTRACT_REALIZATION__REALIZATIONS:
                getRealizations().clear();
                getRealizations().addAll((Collection<? extends AbstractComputationAssignment>)newValue);
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
            case DeploymentPlanPackage.ABSTRACT_REALIZATION__REALIZATIONS:
                getRealizations().clear();
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
            case DeploymentPlanPackage.ABSTRACT_REALIZATION__REALIZATIONS:
                return realizations != null && !realizations.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //AbstractRealizationImpl
