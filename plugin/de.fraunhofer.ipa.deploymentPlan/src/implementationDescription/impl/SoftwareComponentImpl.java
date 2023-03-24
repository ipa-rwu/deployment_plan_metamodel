/**
 */
package implementationDescription.impl;

import de.fraunhofer.ipa.deployment.util.impl.AbstractComputationAssignmentTargetImpl;

import implementationDescription.ExecutionRequirement;
import implementationDescription.ImplementationDescriptionPackage;
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
 *   <li>{@link implementationDescription.impl.SoftwareComponentImpl#getPath <em>Path</em>}</li>
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
     * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPath()
     * @generated
     * @ordered
     */
    protected static final String PATH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPath()
     * @generated
     * @ordered
     */
    protected String path = PATH_EDEFAULT;

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
    public String getPath() {
        return path;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPath(String newPath) {
        String oldPath = path;
        path = newPath;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImplementationDescriptionPackage.SOFTWARE_COMPONENT__PATH, oldPath, path));
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
            case ImplementationDescriptionPackage.SOFTWARE_COMPONENT__PATH:
                return getPath();
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
            case ImplementationDescriptionPackage.SOFTWARE_COMPONENT__PATH:
                setPath((String)newValue);
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
            case ImplementationDescriptionPackage.SOFTWARE_COMPONENT__PATH:
                setPath(PATH_EDEFAULT);
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
            case ImplementationDescriptionPackage.SOFTWARE_COMPONENT__PATH:
                return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
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
        result.append(", path: ");
        result.append(path);
        result.append(')');
        return result.toString();
    }

} //SoftwareComponentImpl
