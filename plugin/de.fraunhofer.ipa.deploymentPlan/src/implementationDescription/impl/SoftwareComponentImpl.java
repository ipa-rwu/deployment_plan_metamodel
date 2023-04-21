/**
 */
package implementationDescription.impl;

import de.fraunhofer.ipa.deployment.util.impl.AbstractComputationAssignmentTargetImpl;

import implementationDescription.ExecutionRequirement;
import implementationDescription.ImplementationDescriptionPackage;
import implementationDescription.Repository;
import implementationDescription.SoftwareComponent;

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
 * An implementation of the model object '<em><b>Software Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link implementationDescription.impl.SoftwareComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link implementationDescription.impl.SoftwareComponentImpl#getRepository <em>Repository</em>}</li>
 *   <li>{@link implementationDescription.impl.SoftwareComponentImpl#getExecutionRequirement <em>Execution Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SoftwareComponentImpl extends AbstractComputationAssignmentTargetImpl implements SoftwareComponent {
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
     * The cached value of the '{@link #getRepository() <em>Repository</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRepository()
     * @generated
     * @ordered
     */
    protected Repository repository;

    /**
     * The cached value of the '{@link #getExecutionRequirement() <em>Execution Requirement</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExecutionRequirement()
     * @generated
     * @ordered
     */
    protected EList<ExecutionRequirement> executionRequirement;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SoftwareComponentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImplementationDescriptionPackage.Literals.SOFTWARE_COMPONENT;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ImplementationDescriptionPackage.SOFTWARE_COMPONENT__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Repository getRepository() {
        return repository;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRepository(Repository newRepository, NotificationChain msgs) {
        Repository oldRepository = repository;
        repository = newRepository;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ImplementationDescriptionPackage.SOFTWARE_COMPONENT__REPOSITORY, oldRepository, newRepository);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRepository(Repository newRepository) {
        if (newRepository != repository) {
            NotificationChain msgs = null;
            if (repository != null)
                msgs = ((InternalEObject)repository).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ImplementationDescriptionPackage.SOFTWARE_COMPONENT__REPOSITORY, null, msgs);
            if (newRepository != null)
                msgs = ((InternalEObject)newRepository).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ImplementationDescriptionPackage.SOFTWARE_COMPONENT__REPOSITORY, null, msgs);
            msgs = basicSetRepository(newRepository, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImplementationDescriptionPackage.SOFTWARE_COMPONENT__REPOSITORY, newRepository, newRepository));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ExecutionRequirement> getExecutionRequirement() {
        if (executionRequirement == null) {
            executionRequirement = new EObjectContainmentEList<ExecutionRequirement>(ExecutionRequirement.class, this, ImplementationDescriptionPackage.SOFTWARE_COMPONENT__EXECUTION_REQUIREMENT);
        }
        return executionRequirement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ImplementationDescriptionPackage.SOFTWARE_COMPONENT__REPOSITORY:
                return basicSetRepository(null, msgs);
            case ImplementationDescriptionPackage.SOFTWARE_COMPONENT__EXECUTION_REQUIREMENT:
                return ((InternalEList<?>)getExecutionRequirement()).basicRemove(otherEnd, msgs);
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
            case ImplementationDescriptionPackage.SOFTWARE_COMPONENT__NAME:
                return getName();
            case ImplementationDescriptionPackage.SOFTWARE_COMPONENT__REPOSITORY:
                return getRepository();
            case ImplementationDescriptionPackage.SOFTWARE_COMPONENT__EXECUTION_REQUIREMENT:
                return getExecutionRequirement();
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
            case ImplementationDescriptionPackage.SOFTWARE_COMPONENT__NAME:
                setName((String)newValue);
                return;
            case ImplementationDescriptionPackage.SOFTWARE_COMPONENT__REPOSITORY:
                setRepository((Repository)newValue);
                return;
            case ImplementationDescriptionPackage.SOFTWARE_COMPONENT__EXECUTION_REQUIREMENT:
                getExecutionRequirement().clear();
                getExecutionRequirement().addAll((Collection<? extends ExecutionRequirement>)newValue);
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
            case ImplementationDescriptionPackage.SOFTWARE_COMPONENT__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ImplementationDescriptionPackage.SOFTWARE_COMPONENT__REPOSITORY:
                setRepository((Repository)null);
                return;
            case ImplementationDescriptionPackage.SOFTWARE_COMPONENT__EXECUTION_REQUIREMENT:
                getExecutionRequirement().clear();
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
            case ImplementationDescriptionPackage.SOFTWARE_COMPONENT__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ImplementationDescriptionPackage.SOFTWARE_COMPONENT__REPOSITORY:
                return repository != null;
            case ImplementationDescriptionPackage.SOFTWARE_COMPONENT__EXECUTION_REQUIREMENT:
                return executionRequirement != null && !executionRequirement.isEmpty();
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

} //SoftwareComponentImpl
