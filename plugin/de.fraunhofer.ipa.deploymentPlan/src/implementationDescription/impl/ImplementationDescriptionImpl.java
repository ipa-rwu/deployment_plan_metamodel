/**
 */
package implementationDescription.impl;

import de.fraunhofer.ipa.deployment.util.impl.AbstractImplementationImpl;

import implementationDescription.ImplementationDescription;
import implementationDescription.ImplementationDescriptionPackage;
import implementationDescription.SoftwareComponent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Implementation Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link implementationDescription.impl.ImplementationDescriptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link implementationDescription.impl.ImplementationDescriptionImpl#getSoftwareDependency <em>Software Dependency</em>}</li>
 *   <li>{@link implementationDescription.impl.ImplementationDescriptionImpl#getIncludeSoftwareComponent <em>Include Software Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationDescriptionImpl extends AbstractImplementationImpl implements ImplementationDescription {
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
     * The cached value of the '{@link #getSoftwareDependency() <em>Software Dependency</em>}' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSoftwareDependency()
     * @generated
     * @ordered
     */
    protected EList<String> softwareDependency;

    /**
     * The cached value of the '{@link #getIncludeSoftwareComponent() <em>Include Software Component</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIncludeSoftwareComponent()
     * @generated
     * @ordered
     */
    protected EList<SoftwareComponent> includeSoftwareComponent;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ImplementationDescriptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImplementationDescriptionPackage.Literals.IMPLEMENTATION_DESCRIPTION;
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
            eNotify(new ENotificationImpl(this, Notification.SET, ImplementationDescriptionPackage.IMPLEMENTATION_DESCRIPTION__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<String> getSoftwareDependency() {
        if (softwareDependency == null) {
            softwareDependency = new EDataTypeUniqueEList<String>(String.class, this, ImplementationDescriptionPackage.IMPLEMENTATION_DESCRIPTION__SOFTWARE_DEPENDENCY);
        }
        return softwareDependency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<SoftwareComponent> getIncludeSoftwareComponent() {
        if (includeSoftwareComponent == null) {
            includeSoftwareComponent = new EObjectContainmentEList<SoftwareComponent>(SoftwareComponent.class, this, ImplementationDescriptionPackage.IMPLEMENTATION_DESCRIPTION__INCLUDE_SOFTWARE_COMPONENT);
        }
        return includeSoftwareComponent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ImplementationDescriptionPackage.IMPLEMENTATION_DESCRIPTION__INCLUDE_SOFTWARE_COMPONENT:
                return ((InternalEList<?>)getIncludeSoftwareComponent()).basicRemove(otherEnd, msgs);
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
            case ImplementationDescriptionPackage.IMPLEMENTATION_DESCRIPTION__NAME:
                return getName();
            case ImplementationDescriptionPackage.IMPLEMENTATION_DESCRIPTION__SOFTWARE_DEPENDENCY:
                return getSoftwareDependency();
            case ImplementationDescriptionPackage.IMPLEMENTATION_DESCRIPTION__INCLUDE_SOFTWARE_COMPONENT:
                return getIncludeSoftwareComponent();
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
            case ImplementationDescriptionPackage.IMPLEMENTATION_DESCRIPTION__NAME:
                setName((String)newValue);
                return;
            case ImplementationDescriptionPackage.IMPLEMENTATION_DESCRIPTION__SOFTWARE_DEPENDENCY:
                getSoftwareDependency().clear();
                getSoftwareDependency().addAll((Collection<? extends String>)newValue);
                return;
            case ImplementationDescriptionPackage.IMPLEMENTATION_DESCRIPTION__INCLUDE_SOFTWARE_COMPONENT:
                getIncludeSoftwareComponent().clear();
                getIncludeSoftwareComponent().addAll((Collection<? extends SoftwareComponent>)newValue);
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
            case ImplementationDescriptionPackage.IMPLEMENTATION_DESCRIPTION__NAME:
                setName(NAME_EDEFAULT);
                return;
            case ImplementationDescriptionPackage.IMPLEMENTATION_DESCRIPTION__SOFTWARE_DEPENDENCY:
                getSoftwareDependency().clear();
                return;
            case ImplementationDescriptionPackage.IMPLEMENTATION_DESCRIPTION__INCLUDE_SOFTWARE_COMPONENT:
                getIncludeSoftwareComponent().clear();
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
            case ImplementationDescriptionPackage.IMPLEMENTATION_DESCRIPTION__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case ImplementationDescriptionPackage.IMPLEMENTATION_DESCRIPTION__SOFTWARE_DEPENDENCY:
                return softwareDependency != null && !softwareDependency.isEmpty();
            case ImplementationDescriptionPackage.IMPLEMENTATION_DESCRIPTION__INCLUDE_SOFTWARE_COMPONENT:
                return includeSoftwareComponent != null && !includeSoftwareComponent.isEmpty();
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
        result.append(", softwareDependency: ");
        result.append(softwareDependency);
        result.append(')');
        return result.toString();
    }

} //ImplementationDescriptionImpl
