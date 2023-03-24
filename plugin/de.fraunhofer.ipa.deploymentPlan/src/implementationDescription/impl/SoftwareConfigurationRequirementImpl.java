/**
 */
package implementationDescription.impl;

import implementationDescription.ImplementationDescriptionPackage;
import implementationDescription.SoftwareConfigurationRequirement;
import implementationDescription.SoftwareExecutionParemeter;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Software Configuration Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link implementationDescription.impl.SoftwareConfigurationRequirementImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwareConfigurationRequirementImpl extends ExecutionRequirementImpl implements SoftwareConfigurationRequirement {
    /**
     * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameter()
     * @generated
     * @ordered
     */
    protected EList<SoftwareExecutionParemeter> parameter;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SoftwareConfigurationRequirementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImplementationDescriptionPackage.Literals.SOFTWARE_CONFIGURATION_REQUIREMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SoftwareExecutionParemeter> getParameter() {
        if (parameter == null) {
            parameter = new EObjectContainmentEList<SoftwareExecutionParemeter>(SoftwareExecutionParemeter.class, this, ImplementationDescriptionPackage.SOFTWARE_CONFIGURATION_REQUIREMENT__PARAMETER);
        }
        return parameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ImplementationDescriptionPackage.SOFTWARE_CONFIGURATION_REQUIREMENT__PARAMETER:
                return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
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
            case ImplementationDescriptionPackage.SOFTWARE_CONFIGURATION_REQUIREMENT__PARAMETER:
                return getParameter();
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
            case ImplementationDescriptionPackage.SOFTWARE_CONFIGURATION_REQUIREMENT__PARAMETER:
                getParameter().clear();
                getParameter().addAll((Collection<? extends SoftwareExecutionParemeter>)newValue);
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
            case ImplementationDescriptionPackage.SOFTWARE_CONFIGURATION_REQUIREMENT__PARAMETER:
                getParameter().clear();
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
            case ImplementationDescriptionPackage.SOFTWARE_CONFIGURATION_REQUIREMENT__PARAMETER:
                return parameter != null && !parameter.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //SoftwareConfigurationRequirementImpl
