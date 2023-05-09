/**
 */
package deploymentPlan.impl;

import deploymentPlan.AbstractComputationAssignment;
import deploymentPlan.AbstractRuntime;
import deploymentPlan.DeploymentPlanPackage;
import deploymentPlan.Middleware;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import targetEnvironment.ComputationDeviceInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Computation Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.impl.AbstractComputationAssignmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link deploymentPlan.impl.AbstractComputationAssignmentImpl#getExecutedBy <em>Executed By</em>}</li>
 *   <li>{@link deploymentPlan.impl.AbstractComputationAssignmentImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link deploymentPlan.impl.AbstractComputationAssignmentImpl#getMiddleware <em>Middleware</em>}</li>
 *   <li>{@link deploymentPlan.impl.AbstractComputationAssignmentImpl#getRuntimeType <em>Runtime Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractComputationAssignmentImpl extends MinimalEObjectImpl.Container implements AbstractComputationAssignment {
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
     * The cached value of the '{@link #getExecutedBy() <em>Executed By</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutedBy()
     * @generated
     * @ordered
     */
    protected ComputationDeviceInstance executedBy;

    /**
     * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected static final String VERSION_EDEFAULT = null;

                /**
     * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVersion()
     * @generated
     * @ordered
     */
    protected String version = VERSION_EDEFAULT;

                /**
     * The cached value of the '{@link #getMiddleware() <em>Middleware</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMiddleware()
     * @generated
     * @ordered
     */
    protected Middleware middleware;

                /**
     * The cached value of the '{@link #getRuntimeType() <em>Runtime Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRuntimeType()
     * @generated
     * @ordered
     */
    protected AbstractRuntime runtimeType;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AbstractComputationAssignmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DeploymentPlanPackage.Literals.ABSTRACT_COMPUTATION_ASSIGNMENT;
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
            eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComputationDeviceInstance getExecutedBy() {
        if (executedBy != null && executedBy.eIsProxy()) {
            InternalEObject oldExecutedBy = (InternalEObject)executedBy;
            executedBy = (ComputationDeviceInstance)eResolveProxy(oldExecutedBy);
            if (executedBy != oldExecutedBy) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__EXECUTED_BY, oldExecutedBy, executedBy));
            }
        }
        return executedBy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComputationDeviceInstance basicGetExecutedBy() {
        return executedBy;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExecutedBy(ComputationDeviceInstance newExecutedBy) {
        ComputationDeviceInstance oldExecutedBy = executedBy;
        executedBy = newExecutedBy;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__EXECUTED_BY, oldExecutedBy, executedBy));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getVersion() {
        return version;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVersion(String newVersion) {
        String oldVersion = version;
        version = newVersion;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__VERSION, oldVersion, version));
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractRuntime getRuntimeType() {
        return runtimeType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRuntimeType(AbstractRuntime newRuntimeType, NotificationChain msgs) {
        AbstractRuntime oldRuntimeType = runtimeType;
        runtimeType = newRuntimeType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__RUNTIME_TYPE, oldRuntimeType, newRuntimeType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRuntimeType(AbstractRuntime newRuntimeType) {
        if (newRuntimeType != runtimeType) {
            NotificationChain msgs = null;
            if (runtimeType != null)
                msgs = ((InternalEObject)runtimeType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__RUNTIME_TYPE, null, msgs);
            if (newRuntimeType != null)
                msgs = ((InternalEObject)newRuntimeType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__RUNTIME_TYPE, null, msgs);
            msgs = basicSetRuntimeType(newRuntimeType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__RUNTIME_TYPE, newRuntimeType, newRuntimeType));
    }

                /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Middleware getMiddleware() {
        return middleware;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMiddleware(Middleware newMiddleware, NotificationChain msgs) {
        Middleware oldMiddleware = middleware;
        middleware = newMiddleware;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__MIDDLEWARE, oldMiddleware, newMiddleware);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMiddleware(Middleware newMiddleware) {
        if (newMiddleware != middleware) {
            NotificationChain msgs = null;
            if (middleware != null)
                msgs = ((InternalEObject)middleware).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__MIDDLEWARE, null, msgs);
            if (newMiddleware != null)
                msgs = ((InternalEObject)newMiddleware).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__MIDDLEWARE, null, msgs);
            msgs = basicSetMiddleware(newMiddleware, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__MIDDLEWARE, newMiddleware, newMiddleware));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__MIDDLEWARE:
                return basicSetMiddleware(null, msgs);
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__RUNTIME_TYPE:
                return basicSetRuntimeType(null, msgs);
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
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__NAME:
                return getName();
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__EXECUTED_BY:
                if (resolve) return getExecutedBy();
                return basicGetExecutedBy();
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__VERSION:
                return getVersion();
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__MIDDLEWARE:
                return getMiddleware();
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__RUNTIME_TYPE:
                return getRuntimeType();
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
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__NAME:
                setName((String)newValue);
                return;
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__EXECUTED_BY:
                setExecutedBy((ComputationDeviceInstance)newValue);
                return;
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__VERSION:
                setVersion((String)newValue);
                return;
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__MIDDLEWARE:
                setMiddleware((Middleware)newValue);
                return;
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__RUNTIME_TYPE:
                setRuntimeType((AbstractRuntime)newValue);
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
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__EXECUTED_BY:
                setExecutedBy((ComputationDeviceInstance)null);
                return;
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__VERSION:
                setVersion(VERSION_EDEFAULT);
                return;
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__MIDDLEWARE:
                setMiddleware((Middleware)null);
                return;
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__RUNTIME_TYPE:
                setRuntimeType((AbstractRuntime)null);
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
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__EXECUTED_BY:
                return executedBy != null;
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__VERSION:
                return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__MIDDLEWARE:
                return middleware != null;
            case DeploymentPlanPackage.ABSTRACT_COMPUTATION_ASSIGNMENT__RUNTIME_TYPE:
                return runtimeType != null;
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
        result.append(", version: ");
        result.append(version);
        result.append(')');
        return result.toString();
    }

} //AbstractComputationAssignmentImpl
