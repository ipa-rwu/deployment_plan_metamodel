/**
 */
package de.fraunhofer.ipa.deployment.util.impl;

import de.fraunhofer.ipa.deployment.util.AbstractProperty;
import de.fraunhofer.ipa.deployment.util.AbstractResouceType;
import de.fraunhofer.ipa.deployment.util.AvailableResouce;
import de.fraunhofer.ipa.deployment.util.UtilPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Available Resouce</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.impl.AvailableResouceImpl#getList <em>List</em>}</li>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.impl.AvailableResouceImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AvailableResouceImpl extends MinimalEObjectImpl.Container implements AvailableResouce {
    /**
     * The cached value of the '{@link #getList() <em>List</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getList()
     * @generated
     * @ordered
     */
    protected EList<AbstractResouceType> list;

    /**
     * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getProperty()
     * @generated
     * @ordered
     */
    protected AbstractProperty property;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AvailableResouceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return UtilPackage.Literals.AVAILABLE_RESOUCE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<AbstractResouceType> getList() {
        if (list == null) {
            list = new EObjectContainmentEList<AbstractResouceType>(AbstractResouceType.class, this,
                    UtilPackage.AVAILABLE_RESOUCE__LIST);
        }
        return list;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractProperty getProperty() {
        if (property != null && property.eIsProxy()) {
            InternalEObject oldProperty = (InternalEObject) property;
            property = (AbstractProperty) eResolveProxy(oldProperty);
            if (property != oldProperty) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, UtilPackage.AVAILABLE_RESOUCE__PROPERTY,
                            oldProperty, property));
            }
        }
        return property;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractProperty basicGetProperty() {
        return property;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setProperty(AbstractProperty newProperty) {
        AbstractProperty oldProperty = property;
        property = newProperty;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, UtilPackage.AVAILABLE_RESOUCE__PROPERTY, oldProperty,
                    property));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
        case UtilPackage.AVAILABLE_RESOUCE__LIST:
            return ((InternalEList<?>) getList()).basicRemove(otherEnd, msgs);
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
        case UtilPackage.AVAILABLE_RESOUCE__LIST:
            return getList();
        case UtilPackage.AVAILABLE_RESOUCE__PROPERTY:
            if (resolve)
                return getProperty();
            return basicGetProperty();
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
        case UtilPackage.AVAILABLE_RESOUCE__LIST:
            getList().clear();
            getList().addAll((Collection<? extends AbstractResouceType>) newValue);
            return;
        case UtilPackage.AVAILABLE_RESOUCE__PROPERTY:
            setProperty((AbstractProperty) newValue);
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
        case UtilPackage.AVAILABLE_RESOUCE__LIST:
            getList().clear();
            return;
        case UtilPackage.AVAILABLE_RESOUCE__PROPERTY:
            setProperty((AbstractProperty) null);
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
        case UtilPackage.AVAILABLE_RESOUCE__LIST:
            return list != null && !list.isEmpty();
        case UtilPackage.AVAILABLE_RESOUCE__PROPERTY:
            return property != null;
        }
        return super.eIsSet(featureID);
    }

} //AvailableResouceImpl
