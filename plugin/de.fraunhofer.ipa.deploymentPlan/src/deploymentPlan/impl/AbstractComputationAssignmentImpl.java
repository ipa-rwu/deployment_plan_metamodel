/**
 */
package deploymentPlan.impl;

import deploymentPlan.AbstractComputationAssignment;
import deploymentPlan.DeploymentPlanPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import targetEnvironment.ComputationDeviceInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Computation Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.impl.AbstractComputationAssignmentImpl#getExecutedBy <em>Executed By</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractComputationAssignmentImpl extends MinimalEObjectImpl.Container implements AbstractComputationAssignment {
    /**
     * The cached value of the '{@link #getExecutedBy() <em>Executed By</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutedBy()
     * @generated
     * @ordered
     */
    protected ComputationDeviceInstance executedBy;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstractComputationAssignmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DeploymentPlanPackage.Literals.ABSTRACT_COMPUTATION_ASSIGNMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComputationDeviceInstance getExecutedBy() {
        if (executedBy != null && executedBy.eIsProxy()) {
            InternalEObject oldExecutedBy = (InternalEObject)executedBy;
            executedBy = (ComputationDeviceInstance)eResolveProxy(oldExecutedBy);
            if (executedBy != oldExecutedBy) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__EXECUTED_BY, oldExecutedBy, executedBy));
            }
        }
        return executedBy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComputationDeviceInstance basicGetExecutedBy() {
        return executedBy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExecutedBy(ComputationDeviceInstance newExecutedBy) {
        ComputationDeviceInstance oldExecutedBy = executedBy;
        executedBy = newExecutedBy;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__EXECUTED_BY, oldExecutedBy, executedBy));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__EXECUTED_BY:
                if (resolve) return getExecutedBy();
                return basicGetExecutedBy();
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
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__EXECUTED_BY:
                setExecutedBy((ComputationDeviceInstance)newValue);
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
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__EXECUTED_BY:
                setExecutedBy((ComputationDeviceInstance)null);
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
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__EXECUTED_BY:
                return executedBy != null;
        }
        return super.eIsSet(featureID);
    }

} //AbstractComputationAssignmentImpl
