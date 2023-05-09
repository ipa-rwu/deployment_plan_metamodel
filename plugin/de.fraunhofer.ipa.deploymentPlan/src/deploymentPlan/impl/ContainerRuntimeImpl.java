/**
 */
package deploymentPlan.impl;

import de.fraunhofer.ipa.deployment.util.OperatingSystemResouce;

import deploymentPlan.ContainerRuntime;
import deploymentPlan.DeploymentPlanPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Runtime</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.impl.ContainerRuntimeImpl#getOpertingSystemResource <em>Operting System Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerRuntimeImpl extends AbstractRuntimeImpl implements ContainerRuntime {
    /**
     * The cached value of the '{@link #getOpertingSystemResource() <em>Operting System Resource</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOpertingSystemResource()
     * @generated
     * @ordered
     */
    protected EList<OperatingSystemResouce> opertingSystemResource;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ContainerRuntimeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DeploymentPlanPackage.Literals.CONTAINER_RUNTIME;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<OperatingSystemResouce> getOpertingSystemResource() {
        if (opertingSystemResource == null) {
            opertingSystemResource = new EObjectContainmentEList<OperatingSystemResouce>(OperatingSystemResouce.class, this, DeploymentPlanPackage.CONTAINER_RUNTIME__OPERTING_SYSTEM_RESOURCE);
        }
        return opertingSystemResource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DeploymentPlanPackage.CONTAINER_RUNTIME__OPERTING_SYSTEM_RESOURCE:
                return ((InternalEList<?>)getOpertingSystemResource()).basicRemove(otherEnd, msgs);
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
            case DeploymentPlanPackage.CONTAINER_RUNTIME__OPERTING_SYSTEM_RESOURCE:
                return getOpertingSystemResource();
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
            case DeploymentPlanPackage.CONTAINER_RUNTIME__OPERTING_SYSTEM_RESOURCE:
                getOpertingSystemResource().clear();
                getOpertingSystemResource().addAll((Collection<? extends OperatingSystemResouce>)newValue);
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
            case DeploymentPlanPackage.CONTAINER_RUNTIME__OPERTING_SYSTEM_RESOURCE:
                getOpertingSystemResource().clear();
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
            case DeploymentPlanPackage.CONTAINER_RUNTIME__OPERTING_SYSTEM_RESOURCE:
                return opertingSystemResource != null && !opertingSystemResource.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ContainerRuntimeImpl
