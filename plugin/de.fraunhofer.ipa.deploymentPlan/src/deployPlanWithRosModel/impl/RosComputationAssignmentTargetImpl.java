/**
 */
package deployPlanWithRosModel.impl;

import de.fraunhofer.ipa.deployment.util.impl.AbstractComputationAssignmentTargetImpl;

import deployPlanWithRosModel.DeployPlanWithRosModelPackage;
import deployPlanWithRosModel.RosComputationAssignmentTarget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import system.SystemRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ros Computation Assignment Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deployPlanWithRosModel.impl.RosComputationAssignmentTargetImpl#getRefComponent <em>Ref Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RosComputationAssignmentTargetImpl extends AbstractComputationAssignmentTargetImpl implements RosComputationAssignmentTarget {
    /**
     * The cached value of the '{@link #getRefComponent() <em>Ref Component</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRefComponent()
     * @generated
     * @ordered
     */
    protected SystemRef refComponent;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RosComputationAssignmentTargetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DeployPlanWithRosModelPackage.Literals.ROS_COMPUTATION_ASSIGNMENT_TARGET;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SystemRef getRefComponent() {
        return refComponent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRefComponent(SystemRef newRefComponent, NotificationChain msgs) {
        SystemRef oldRefComponent = refComponent;
        refComponent = newRefComponent;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeployPlanWithRosModelPackage.ROS_COMPUTATION_ASSIGNMENT_TARGET__REF_COMPONENT, oldRefComponent, newRefComponent);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRefComponent(SystemRef newRefComponent) {
        if (newRefComponent != refComponent) {
            NotificationChain msgs = null;
            if (refComponent != null)
                msgs = ((InternalEObject)refComponent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeployPlanWithRosModelPackage.ROS_COMPUTATION_ASSIGNMENT_TARGET__REF_COMPONENT, null, msgs);
            if (newRefComponent != null)
                msgs = ((InternalEObject)newRefComponent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeployPlanWithRosModelPackage.ROS_COMPUTATION_ASSIGNMENT_TARGET__REF_COMPONENT, null, msgs);
            msgs = basicSetRefComponent(newRefComponent, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DeployPlanWithRosModelPackage.ROS_COMPUTATION_ASSIGNMENT_TARGET__REF_COMPONENT, newRefComponent, newRefComponent));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DeployPlanWithRosModelPackage.ROS_COMPUTATION_ASSIGNMENT_TARGET__REF_COMPONENT:
                return basicSetRefComponent(null, msgs);
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
            case DeployPlanWithRosModelPackage.ROS_COMPUTATION_ASSIGNMENT_TARGET__REF_COMPONENT:
                return getRefComponent();
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
            case DeployPlanWithRosModelPackage.ROS_COMPUTATION_ASSIGNMENT_TARGET__REF_COMPONENT:
                setRefComponent((SystemRef)newValue);
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
            case DeployPlanWithRosModelPackage.ROS_COMPUTATION_ASSIGNMENT_TARGET__REF_COMPONENT:
                setRefComponent((SystemRef)null);
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
            case DeployPlanWithRosModelPackage.ROS_COMPUTATION_ASSIGNMENT_TARGET__REF_COMPONENT:
                return refComponent != null;
        }
        return super.eIsSet(featureID);
    }

} //RosComputationAssignmentTargetImpl
