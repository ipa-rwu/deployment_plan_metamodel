/**
 */
package deploymentPlan.impl;

import deploymentPlan.AbstractDeploymentPlan;
import deploymentPlan.DeploymentPlanPackage;
import deploymentPlan.Plan;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.impl.PlanImpl#getPlan <em>Plan</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlanImpl extends MinimalEObjectImpl.Container implements Plan {
    /**
     * The cached value of the '{@link #getPlan() <em>Plan</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPlan()
     * @generated
     * @ordered
     */
    protected AbstractDeploymentPlan plan;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PlanImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DeploymentPlanPackage.Literals.PLAN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractDeploymentPlan getPlan() {
        return plan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPlan(AbstractDeploymentPlan newPlan, NotificationChain msgs) {
        AbstractDeploymentPlan oldPlan = plan;
        plan = newPlan;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeploymentPlanPackage.PLAN__PLAN, oldPlan, newPlan);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPlan(AbstractDeploymentPlan newPlan) {
        if (newPlan != plan) {
            NotificationChain msgs = null;
            if (plan != null)
                msgs = ((InternalEObject)plan).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeploymentPlanPackage.PLAN__PLAN, null, msgs);
            if (newPlan != null)
                msgs = ((InternalEObject)newPlan).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeploymentPlanPackage.PLAN__PLAN, null, msgs);
            msgs = basicSetPlan(newPlan, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPlanPackage.PLAN__PLAN, newPlan, newPlan));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DeploymentPlanPackage.PLAN__PLAN:
                return basicSetPlan(null, msgs);
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
            case DeploymentPlanPackage.PLAN__PLAN:
                return getPlan();
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
            case DeploymentPlanPackage.PLAN__PLAN:
                setPlan((AbstractDeploymentPlan)newValue);
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
            case DeploymentPlanPackage.PLAN__PLAN:
                setPlan((AbstractDeploymentPlan)null);
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
            case DeploymentPlanPackage.PLAN__PLAN:
                return plan != null;
        }
        return super.eIsSet(featureID);
    }

} //PlanImpl
