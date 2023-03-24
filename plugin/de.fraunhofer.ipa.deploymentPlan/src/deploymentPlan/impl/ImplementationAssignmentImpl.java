/**
 */
package deploymentPlan.impl;

import deploymentPlan.ConfigSoftwareComponent;
import deploymentPlan.DeploymentPlanPackage;
import deploymentPlan.ImplementationAssignment;
import deploymentPlan.Middleware;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.impl.ImplementationAssignmentImpl#getSoftwareComponent <em>Software Component</em>}</li>
 *   <li>{@link deploymentPlan.impl.ImplementationAssignmentImpl#getMiddleware <em>Middleware</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationAssignmentImpl extends AbstractComputationAssignmentImpl implements ImplementationAssignment {
    /**
     * The cached value of the '{@link #getSoftwareComponent() <em>Software Component</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSoftwareComponent()
     * @generated
     * @ordered
     */
    protected EList<ConfigSoftwareComponent> softwareComponent;

    /**
     * The cached value of the '{@link #getMiddleware() <em>Middleware</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMiddleware()
     * @generated
     * @ordered
     */
    protected EList<Middleware> middleware;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ImplementationAssignmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DeploymentPlanPackage.Literals.IMPLEMENTATION_ASSIGNMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ConfigSoftwareComponent> getSoftwareComponent() {
        if (softwareComponent == null) {
            softwareComponent = new EObjectContainmentEList<ConfigSoftwareComponent>(ConfigSoftwareComponent.class, this, DeploymentPlanPackage.IMPLEMENTATION_ASSIGNMENT__SOFTWARE_COMPONENT);
        }
        return softwareComponent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Middleware> getMiddleware() {
        if (middleware == null) {
            middleware = new EObjectContainmentEList<Middleware>(Middleware.class, this, DeploymentPlanPackage.IMPLEMENTATION_ASSIGNMENT__MIDDLEWARE);
        }
        return middleware;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DeploymentPlanPackage.IMPLEMENTATION_ASSIGNMENT__SOFTWARE_COMPONENT:
                return ((InternalEList<?>)getSoftwareComponent()).basicRemove(otherEnd, msgs);
            case DeploymentPlanPackage.IMPLEMENTATION_ASSIGNMENT__MIDDLEWARE:
                return ((InternalEList<?>)getMiddleware()).basicRemove(otherEnd, msgs);
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
            case DeploymentPlanPackage.IMPLEMENTATION_ASSIGNMENT__SOFTWARE_COMPONENT:
                return getSoftwareComponent();
            case DeploymentPlanPackage.IMPLEMENTATION_ASSIGNMENT__MIDDLEWARE:
                return getMiddleware();
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
            case DeploymentPlanPackage.IMPLEMENTATION_ASSIGNMENT__SOFTWARE_COMPONENT:
                getSoftwareComponent().clear();
                getSoftwareComponent().addAll((Collection<? extends ConfigSoftwareComponent>)newValue);
                return;
            case DeploymentPlanPackage.IMPLEMENTATION_ASSIGNMENT__MIDDLEWARE:
                getMiddleware().clear();
                getMiddleware().addAll((Collection<? extends Middleware>)newValue);
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
            case DeploymentPlanPackage.IMPLEMENTATION_ASSIGNMENT__SOFTWARE_COMPONENT:
                getSoftwareComponent().clear();
                return;
            case DeploymentPlanPackage.IMPLEMENTATION_ASSIGNMENT__MIDDLEWARE:
                getMiddleware().clear();
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
            case DeploymentPlanPackage.IMPLEMENTATION_ASSIGNMENT__SOFTWARE_COMPONENT:
                return softwareComponent != null && !softwareComponent.isEmpty();
            case DeploymentPlanPackage.IMPLEMENTATION_ASSIGNMENT__MIDDLEWARE:
                return middleware != null && !middleware.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ImplementationAssignmentImpl
