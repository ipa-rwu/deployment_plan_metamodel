/**
 */
package deploymentPlan.impl;

import deploymentPlan.AbstractDeploymentPlan;
import deploymentPlan.AbstractRealization;
import deploymentPlan.DeploymentPlanPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import targetEnvironment.TargetDeployEnviroment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Deployment Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.impl.AbstractDeploymentPlanImpl#getName <em>Name</em>}</li>
 *   <li>{@link deploymentPlan.impl.AbstractDeploymentPlanImpl#getDeployTo <em>Deploy To</em>}</li>
 *   <li>{@link deploymentPlan.impl.AbstractDeploymentPlanImpl#getRealize <em>Realize</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractDeploymentPlanImpl extends MinimalEObjectImpl.Container implements AbstractDeploymentPlan {
    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getDeployTo() <em>Deploy To</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeployTo()
     * @generated
     * @ordered
     */
    protected TargetDeployEnviroment deployTo;

    /**
     * The cached value of the '{@link #getRealize() <em>Realize</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRealize()
     * @generated
     * @ordered
     */
    protected AbstractRealization realize;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstractDeploymentPlanImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DeploymentPlanPackage.Literals.ABSTRACT_DEPLOYMENT_PLAN;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TargetDeployEnviroment getDeployTo() {
        if (deployTo != null && deployTo.eIsProxy()) {
            InternalEObject oldDeployTo = (InternalEObject)deployTo;
            deployTo = (TargetDeployEnviroment)eResolveProxy(oldDeployTo);
            if (deployTo != oldDeployTo) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN__DEPLOY_TO, oldDeployTo, deployTo));
            }
        }
        return deployTo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TargetDeployEnviroment basicGetDeployTo() {
        return deployTo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDeployTo(TargetDeployEnviroment newDeployTo) {
        TargetDeployEnviroment oldDeployTo = deployTo;
        deployTo = newDeployTo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN__DEPLOY_TO, oldDeployTo, deployTo));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractRealization getRealize() {
        return realize;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRealize(AbstractRealization newRealize, NotificationChain msgs) {
        AbstractRealization oldRealize = realize;
        realize = newRealize;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN__REALIZE, oldRealize, newRealize);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRealize(AbstractRealization newRealize) {
        if (newRealize != realize) {
            NotificationChain msgs = null;
            if (realize != null)
                msgs = ((InternalEObject)realize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN__REALIZE, null, msgs);
            if (newRealize != null)
                msgs = ((InternalEObject)newRealize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN__REALIZE, null, msgs);
            msgs = basicSetRealize(newRealize, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN__REALIZE, newRealize, newRealize));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN__REALIZE:
                return basicSetRealize(null, msgs);
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
            case DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN__NAME:
                return getName();
            case DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN__DEPLOY_TO:
                if (resolve) return getDeployTo();
                return basicGetDeployTo();
            case DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN__REALIZE:
                return getRealize();
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
            case DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN__NAME:
                setName((String)newValue);
                return;
            case DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN__DEPLOY_TO:
                setDeployTo((TargetDeployEnviroment)newValue);
                return;
            case DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN__REALIZE:
                setRealize((AbstractRealization)newValue);
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
            case DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN__NAME:
                setName(NAME_EDEFAULT);
                return;
            case DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN__DEPLOY_TO:
                setDeployTo((TargetDeployEnviroment)null);
                return;
            case DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN__REALIZE:
                setRealize((AbstractRealization)null);
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
            case DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN__DEPLOY_TO:
                return deployTo != null;
            case DeploymentPlanPackage.ABSTRACT_DEPLOYMENT_PLAN__REALIZE:
                return realize != null;
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
        result.append(" (name: ");
        result.append(name);
        result.append(')');
        return result.toString();
    }

} //AbstractDeploymentPlanImpl
