/**
 */
package implementationDescription.impl;

import implementationDescription.DeviceRequirement;
import implementationDescription.HWSWParemeter;
import implementationDescription.ImplementationDescriptionPackage;

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
 * An implementation of the model object '<em><b>Device Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link implementationDescription.impl.DeviceRequirementImpl#getType <em>Type</em>}</li>
 *   <li>{@link implementationDescription.impl.DeviceRequirementImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceRequirementImpl extends ExecutionRequirementImpl implements DeviceRequirement {
    /**
     * The default value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected static final String TYPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected String type = TYPE_EDEFAULT;

    /**
     * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameter()
     * @generated
     * @ordered
     */
    protected EList<HWSWParemeter> parameter;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DeviceRequirementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return ImplementationDescriptionPackage.Literals.DEVICE_REQUIREMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getType() {
        return type;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(String newType) {
        String oldType = type;
        type = newType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, ImplementationDescriptionPackage.DEVICE_REQUIREMENT__TYPE, oldType, type));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<HWSWParemeter> getParameter() {
        if (parameter == null) {
            parameter = new EObjectContainmentEList<HWSWParemeter>(HWSWParemeter.class, this, ImplementationDescriptionPackage.DEVICE_REQUIREMENT__PARAMETER);
        }
        return parameter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case ImplementationDescriptionPackage.DEVICE_REQUIREMENT__PARAMETER:
                return ((InternalEList<?>)getParameter()).basicRemove(otherEnd, msgs);
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
            case ImplementationDescriptionPackage.DEVICE_REQUIREMENT__TYPE:
                return getType();
            case ImplementationDescriptionPackage.DEVICE_REQUIREMENT__PARAMETER:
                return getParameter();
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
            case ImplementationDescriptionPackage.DEVICE_REQUIREMENT__TYPE:
                setType((String)newValue);
                return;
            case ImplementationDescriptionPackage.DEVICE_REQUIREMENT__PARAMETER:
                getParameter().clear();
                getParameter().addAll((Collection<? extends HWSWParemeter>)newValue);
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
            case ImplementationDescriptionPackage.DEVICE_REQUIREMENT__TYPE:
                setType(TYPE_EDEFAULT);
                return;
            case ImplementationDescriptionPackage.DEVICE_REQUIREMENT__PARAMETER:
                getParameter().clear();
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
            case ImplementationDescriptionPackage.DEVICE_REQUIREMENT__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case ImplementationDescriptionPackage.DEVICE_REQUIREMENT__PARAMETER:
                return parameter != null && !parameter.isEmpty();
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
        result.append(" (type: ");
        result.append(type);
        result.append(')');
        return result.toString();
    }

} //DeviceRequirementImpl
