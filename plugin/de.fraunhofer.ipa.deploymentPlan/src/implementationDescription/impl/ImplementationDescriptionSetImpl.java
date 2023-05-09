/**
 */
package implementationDescription.impl;

import implementationDescription.ImplementationDescription;
import implementationDescription.ImplementationDescriptionPackage;
import implementationDescription.ImplementationDescriptionSet;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link implementationDescription.impl.ImplementationDescriptionSetImpl#getImplementations <em>Implementations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImplementationDescriptionSetImpl extends MinimalEObjectImpl.Container implements ImplementationDescriptionSet {
    /**
     * The cached value of the '{@link #getImplementations() <em>Implementations</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImplementations()
     * @generated
     * @ordered
     */
    protected EList<ImplementationDescription> implementations;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ImplementationDescriptionSetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImplementationDescriptionPackage.Literals.IMPLEMENTATION_DESCRIPTION_SET;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ImplementationDescription> getImplementations() {
        if (implementations == null) {
            implementations = new EObjectContainmentEList<ImplementationDescription>(ImplementationDescription.class, this, ImplementationDescriptionPackage.IMPLEMENTATION_DESCRIPTION_SET__IMPLEMENTATIONS);
        }
        return implementations;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ImplementationDescriptionPackage.IMPLEMENTATION_DESCRIPTION_SET__IMPLEMENTATIONS:
                return ((InternalEList<?>)getImplementations()).basicRemove(otherEnd, msgs);
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
            case ImplementationDescriptionPackage.IMPLEMENTATION_DESCRIPTION_SET__IMPLEMENTATIONS:
                return getImplementations();
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
            case ImplementationDescriptionPackage.IMPLEMENTATION_DESCRIPTION_SET__IMPLEMENTATIONS:
                getImplementations().clear();
                getImplementations().addAll((Collection<? extends ImplementationDescription>)newValue);
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
            case ImplementationDescriptionPackage.IMPLEMENTATION_DESCRIPTION_SET__IMPLEMENTATIONS:
                getImplementations().clear();
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
            case ImplementationDescriptionPackage.IMPLEMENTATION_DESCRIPTION_SET__IMPLEMENTATIONS:
                return implementations != null && !implementations.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //ImplementationDescriptionSetImpl
