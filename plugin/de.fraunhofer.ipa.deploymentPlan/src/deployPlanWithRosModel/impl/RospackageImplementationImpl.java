/**
 */
package deployPlanWithRosModel.impl;

import deployPlanWithRosModel.DeployPlanWithRosModelPackage;
import deployPlanWithRosModel.RospackageImplementation;

import deploymentPlan.impl.AbstractComputationAssignmentImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rospackage Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deployPlanWithRosModel.impl.RospackageImplementationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RospackageImplementationImpl extends AbstractComputationAssignmentImpl implements RospackageImplementation {
    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected ros.Package name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RospackageImplementationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DeployPlanWithRosModelPackage.Literals.ROSPACKAGE_IMPLEMENTATION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ros.Package getName() {
        if (name != null && name.eIsProxy()) {
            InternalEObject oldName = (InternalEObject)name;
            name = (ros.Package)eResolveProxy(oldName);
            if (name != oldName) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeployPlanWithRosModelPackage.ROSPACKAGE_IMPLEMENTATION__NAME, oldName, name));
            }
        }
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ros.Package basicGetName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(ros.Package newName) {
        ros.Package oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DeployPlanWithRosModelPackage.ROSPACKAGE_IMPLEMENTATION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DeployPlanWithRosModelPackage.ROSPACKAGE_IMPLEMENTATION__NAME:
                if (resolve) return getName();
                return basicGetName();
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
            case DeployPlanWithRosModelPackage.ROSPACKAGE_IMPLEMENTATION__NAME:
                setName((ros.Package)newValue);
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
            case DeployPlanWithRosModelPackage.ROSPACKAGE_IMPLEMENTATION__NAME:
                setName((ros.Package)null);
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
            case DeployPlanWithRosModelPackage.ROSPACKAGE_IMPLEMENTATION__NAME:
                return name != null;
        }
        return super.eIsSet(featureID);
    }

} //RospackageImplementationImpl
