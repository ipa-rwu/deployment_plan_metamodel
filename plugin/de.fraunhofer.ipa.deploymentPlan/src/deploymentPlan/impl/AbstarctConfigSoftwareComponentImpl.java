/**
 */
package deploymentPlan.impl;

import deploymentPlan.AbstarctConfigSoftwareComponent;
import deploymentPlan.AbstractConfigExecutionParameter;
import deploymentPlan.DeploymentPlanPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstarct Config Software Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.impl.AbstarctConfigSoftwareComponentImpl#getExecutionConfiguration <em>Execution Configuration</em>}</li>
 *   <li>{@link deploymentPlan.impl.AbstarctConfigSoftwareComponentImpl#getStartCommand <em>Start Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstarctConfigSoftwareComponentImpl extends MinimalEObjectImpl.Container implements AbstarctConfigSoftwareComponent {
    /**
     * The cached value of the '{@link #getExecutionConfiguration() <em>Execution Configuration</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutionConfiguration()
     * @generated
     * @ordered
     */
    protected EList<AbstractConfigExecutionParameter> executionConfiguration;

    /**
     * The cached value of the '{@link #getStartCommand() <em>Start Command</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartCommand()
     * @generated
     * @ordered
     */
    protected EList<String> startCommand;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstarctConfigSoftwareComponentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DeploymentPlanPackage.Literals.ABSTARCT_CONFIG_SOFTWARE_COMPONENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbstractConfigExecutionParameter> getExecutionConfiguration() {
        if (executionConfiguration == null) {
            executionConfiguration = new EObjectContainmentEList<AbstractConfigExecutionParameter>(AbstractConfigExecutionParameter.class, this, DeploymentPlanPackage.ABSTARCT_CONFIG_SOFTWARE_COMPONENT__EXECUTION_CONFIGURATION);
        }
        return executionConfiguration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getStartCommand() {
        if (startCommand == null) {
            startCommand = new EDataTypeUniqueEList<String>(String.class, this, DeploymentPlanPackage.ABSTARCT_CONFIG_SOFTWARE_COMPONENT__START_COMMAND);
        }
        return startCommand;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DeploymentPlanPackage.ABSTARCT_CONFIG_SOFTWARE_COMPONENT__EXECUTION_CONFIGURATION:
                return ((InternalEList<?>)getExecutionConfiguration()).basicRemove(otherEnd, msgs);
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
            case DeploymentPlanPackage.ABSTARCT_CONFIG_SOFTWARE_COMPONENT__EXECUTION_CONFIGURATION:
                return getExecutionConfiguration();
            case DeploymentPlanPackage.ABSTARCT_CONFIG_SOFTWARE_COMPONENT__START_COMMAND:
                return getStartCommand();
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
            case DeploymentPlanPackage.ABSTARCT_CONFIG_SOFTWARE_COMPONENT__EXECUTION_CONFIGURATION:
                getExecutionConfiguration().clear();
                getExecutionConfiguration().addAll((Collection<? extends AbstractConfigExecutionParameter>)newValue);
                return;
            case DeploymentPlanPackage.ABSTARCT_CONFIG_SOFTWARE_COMPONENT__START_COMMAND:
                getStartCommand().clear();
                getStartCommand().addAll((Collection<? extends String>)newValue);
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
            case DeploymentPlanPackage.ABSTARCT_CONFIG_SOFTWARE_COMPONENT__EXECUTION_CONFIGURATION:
                getExecutionConfiguration().clear();
                return;
            case DeploymentPlanPackage.ABSTARCT_CONFIG_SOFTWARE_COMPONENT__START_COMMAND:
                getStartCommand().clear();
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
            case DeploymentPlanPackage.ABSTARCT_CONFIG_SOFTWARE_COMPONENT__EXECUTION_CONFIGURATION:
                return executionConfiguration != null && !executionConfiguration.isEmpty();
            case DeploymentPlanPackage.ABSTARCT_CONFIG_SOFTWARE_COMPONENT__START_COMMAND:
                return startCommand != null && !startCommand.isEmpty();
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuilder result = new StringBuilder(super.toString());
        result.append(" (startCommand: ");
        result.append(startCommand);
        result.append(')');
        return result.toString();
    }

} //AbstarctConfigSoftwareComponentImpl
