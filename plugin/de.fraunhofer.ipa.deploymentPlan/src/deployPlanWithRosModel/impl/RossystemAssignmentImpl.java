/**
 */
package deployPlanWithRosModel.impl;

import deployPlanWithRosModel.ConfigRosParameter;
import deployPlanWithRosModel.ConfigRosSoftwareComponent;
import deployPlanWithRosModel.DeployPlanWithRosModelPackage;
import deployPlanWithRosModel.RossystemAssignment;

import deploymentPlan.impl.AbstractComputationAssignmentImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rossystem Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deployPlanWithRosModel.impl.RossystemAssignmentImpl#getSoftwareComponent <em>Software Component</em>}</li>
 *   <li>{@link deployPlanWithRosModel.impl.RossystemAssignmentImpl#getExecutionConfiguration <em>Execution Configuration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RossystemAssignmentImpl extends AbstractComputationAssignmentImpl implements RossystemAssignment {
    /**
     * The cached value of the '{@link #getSoftwareComponent() <em>Software Component</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSoftwareComponent()
     * @generated
     * @ordered
     */
    protected EList<ConfigRosSoftwareComponent> softwareComponent;

    /**
     * The cached value of the '{@link #getExecutionConfiguration() <em>Execution Configuration</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutionConfiguration()
     * @generated
     * @ordered
     */
    protected ConfigRosParameter executionConfiguration;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RossystemAssignmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DeployPlanWithRosModelPackage.Literals.ROSSYSTEM_ASSIGNMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConfigRosSoftwareComponent> getSoftwareComponent() {
        if (softwareComponent == null) {
            softwareComponent = new EObjectContainmentEList<ConfigRosSoftwareComponent>(ConfigRosSoftwareComponent.class, this, DeployPlanWithRosModelPackage.ROSSYSTEM_ASSIGNMENT__SOFTWARE_COMPONENT);
        }
        return softwareComponent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ConfigRosParameter getExecutionConfiguration() {
        return executionConfiguration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExecutionConfiguration(ConfigRosParameter newExecutionConfiguration, NotificationChain msgs) {
        ConfigRosParameter oldExecutionConfiguration = executionConfiguration;
        executionConfiguration = newExecutionConfiguration;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeployPlanWithRosModelPackage.ROSSYSTEM_ASSIGNMENT__EXECUTION_CONFIGURATION, oldExecutionConfiguration, newExecutionConfiguration);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExecutionConfiguration(ConfigRosParameter newExecutionConfiguration) {
        if (newExecutionConfiguration != executionConfiguration) {
            NotificationChain msgs = null;
            if (executionConfiguration != null)
                msgs = ((InternalEObject)executionConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeployPlanWithRosModelPackage.ROSSYSTEM_ASSIGNMENT__EXECUTION_CONFIGURATION, null, msgs);
            if (newExecutionConfiguration != null)
                msgs = ((InternalEObject)newExecutionConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeployPlanWithRosModelPackage.ROSSYSTEM_ASSIGNMENT__EXECUTION_CONFIGURATION, null, msgs);
            msgs = basicSetExecutionConfiguration(newExecutionConfiguration, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DeployPlanWithRosModelPackage.ROSSYSTEM_ASSIGNMENT__EXECUTION_CONFIGURATION, newExecutionConfiguration, newExecutionConfiguration));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DeployPlanWithRosModelPackage.ROSSYSTEM_ASSIGNMENT__SOFTWARE_COMPONENT:
                return ((InternalEList<?>)getSoftwareComponent()).basicRemove(otherEnd, msgs);
            case DeployPlanWithRosModelPackage.ROSSYSTEM_ASSIGNMENT__EXECUTION_CONFIGURATION:
                return basicSetExecutionConfiguration(null, msgs);
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
            case DeployPlanWithRosModelPackage.ROSSYSTEM_ASSIGNMENT__SOFTWARE_COMPONENT:
                return getSoftwareComponent();
            case DeployPlanWithRosModelPackage.ROSSYSTEM_ASSIGNMENT__EXECUTION_CONFIGURATION:
                return getExecutionConfiguration();
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
            case DeployPlanWithRosModelPackage.ROSSYSTEM_ASSIGNMENT__SOFTWARE_COMPONENT:
                getSoftwareComponent().clear();
                getSoftwareComponent().addAll((Collection<? extends ConfigRosSoftwareComponent>)newValue);
                return;
            case DeployPlanWithRosModelPackage.ROSSYSTEM_ASSIGNMENT__EXECUTION_CONFIGURATION:
                setExecutionConfiguration((ConfigRosParameter)newValue);
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
            case DeployPlanWithRosModelPackage.ROSSYSTEM_ASSIGNMENT__SOFTWARE_COMPONENT:
                getSoftwareComponent().clear();
                return;
            case DeployPlanWithRosModelPackage.ROSSYSTEM_ASSIGNMENT__EXECUTION_CONFIGURATION:
                setExecutionConfiguration((ConfigRosParameter)null);
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
            case DeployPlanWithRosModelPackage.ROSSYSTEM_ASSIGNMENT__SOFTWARE_COMPONENT:
                return softwareComponent != null && !softwareComponent.isEmpty();
            case DeployPlanWithRosModelPackage.ROSSYSTEM_ASSIGNMENT__EXECUTION_CONFIGURATION:
                return executionConfiguration != null;
        }
        return super.eIsSet(featureID);
    }

} //RossystemAssignmentImpl
