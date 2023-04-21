/**
 */
package deployPlanWithRosModel.impl;

import deployPlanWithRosModel.ConfigRosSoftwareComponent;
import deployPlanWithRosModel.DeployPlanWithRosModelPackage;

import deploymentPlan.impl.AbstarctConfigSoftwareComponentImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config Ros Software Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deployPlanWithRosModel.impl.ConfigRosSoftwareComponentImpl#getComponent <em>Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigRosSoftwareComponentImpl extends AbstarctConfigSoftwareComponentImpl implements ConfigRosSoftwareComponent {
    /**
     * The cached value of the '{@link #getComponent() <em>Component</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getComponent()
     * @generated
     * @ordered
     */
    protected system.System component;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConfigRosSoftwareComponentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DeployPlanWithRosModelPackage.Literals.CONFIG_ROS_SOFTWARE_COMPONENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public system.System getComponent() {
        if (component != null && component.eIsProxy()) {
            InternalEObject oldComponent = (InternalEObject)component;
            component = (system.System)eResolveProxy(oldComponent);
            if (component != oldComponent) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeployPlanWithRosModelPackage.CONFIG_ROS_SOFTWARE_COMPONENT__COMPONENT, oldComponent, component));
            }
        }
        return component;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public system.System basicGetComponent() {
        return component;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setComponent(system.System newComponent) {
        system.System oldComponent = component;
        component = newComponent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DeployPlanWithRosModelPackage.CONFIG_ROS_SOFTWARE_COMPONENT__COMPONENT, oldComponent, component));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case DeployPlanWithRosModelPackage.CONFIG_ROS_SOFTWARE_COMPONENT__COMPONENT:
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
            case DeployPlanWithRosModelPackage.CONFIG_ROS_SOFTWARE_COMPONENT__COMPONENT:
                setComponent((system.System)newValue);
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
            case DeployPlanWithRosModelPackage.CONFIG_ROS_SOFTWARE_COMPONENT__COMPONENT:
                setComponent((system.System)null);
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
            case DeployPlanWithRosModelPackage.CONFIG_ROS_SOFTWARE_COMPONENT__COMPONENT:
                return component != null;
        }
        return super.eIsSet(featureID);
    }

} //ConfigRosSoftwareComponentImpl
