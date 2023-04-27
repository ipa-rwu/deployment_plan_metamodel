/**
 */
package de.fraunhofer.ipa.deployment.util.impl;

import de.fraunhofer.ipa.deployment.util.PropertyValue;
import de.fraunhofer.ipa.deployment.util.PropertyValueList;
import de.fraunhofer.ipa.deployment.util.UtilPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Value List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.impl.PropertyValueListImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PropertyValueListImpl extends PropertyValueImpl implements PropertyValueList {
    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected EList<PropertyValue> value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PropertyValueListImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UtilPackage.Literals.PROPERTY_VALUE_LIST;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<PropertyValue> getValue() {
        if (value == null) {
            value = new EObjectContainmentEList<PropertyValue>(PropertyValue.class, this,
                    UtilPackage.PROPERTY_VALUE_LIST__VALUE);
        }
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case UtilPackage.PROPERTY_VALUE_LIST__VALUE:
            return ((InternalEList<?>) getValue()).basicRemove(otherEnd, msgs);
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
        case UtilPackage.PROPERTY_VALUE_LIST__VALUE:
            return getValue();
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
        case UtilPackage.PROPERTY_VALUE_LIST__VALUE:
            getValue().clear();
            getValue().addAll((Collection<? extends PropertyValue>) newValue);
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
        case UtilPackage.PROPERTY_VALUE_LIST__VALUE:
            getValue().clear();
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
        case UtilPackage.PROPERTY_VALUE_LIST__VALUE:
            return value != null && !value.isEmpty();
        }
        return super.eIsSet(featureID);
    }

} //PropertyValueListImpl
