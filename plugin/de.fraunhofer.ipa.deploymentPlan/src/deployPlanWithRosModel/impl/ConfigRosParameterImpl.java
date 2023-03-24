/**
 */
package deployPlanWithRosModel.impl;

import de.fraunhofer.ipa.deployment.util.PropertyValue;

import deployPlanWithRosModel.ConfigRosParameter;
import deployPlanWithRosModel.DeployPlanWithRosModelPackage;

import deploymentPlan.impl.AbstractConfigExecutionParameterImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import system.RosParameter;

import targetEnvironment.AbstractConfigProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config Ros Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deployPlanWithRosModel.impl.ConfigRosParameterImpl#getFrom <em>From</em>}</li>
 *   <li>{@link deployPlanWithRosModel.impl.ConfigRosParameterImpl#getTo <em>To</em>}</li>
 *   <li>{@link deployPlanWithRosModel.impl.ConfigRosParameterImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigRosParameterImpl extends AbstractConfigExecutionParameterImpl implements ConfigRosParameter {
    /**
     * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFrom()
     * @generated
     * @ordered
     */
    protected RosParameter from;

    /**
     * The cached value of the '{@link #getTo() <em>To</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTo()
     * @generated
     * @ordered
     */
    protected AbstractConfigProperty to;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected PropertyValue value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConfigRosParameterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return DeployPlanWithRosModelPackage.Literals.CONFIG_ROS_PARAMETER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RosParameter getFrom() {
        if (from != null && from.eIsProxy()) {
            InternalEObject oldFrom = (InternalEObject)from;
            from = (RosParameter)eResolveProxy(oldFrom);
            if (from != oldFrom) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeployPlanWithRosModelPackage.CONFIG_ROS_PARAMETER__FROM, oldFrom, from));
            }
        }
        return from;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RosParameter basicGetFrom() {
        return from;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFrom(RosParameter newFrom) {
        RosParameter oldFrom = from;
        from = newFrom;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DeployPlanWithRosModelPackage.CONFIG_ROS_PARAMETER__FROM, oldFrom, from));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractConfigProperty getTo() {
        if (to != null && to.eIsProxy()) {
            InternalEObject oldTo = (InternalEObject)to;
            to = (AbstractConfigProperty)eResolveProxy(oldTo);
            if (to != oldTo) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeployPlanWithRosModelPackage.CONFIG_ROS_PARAMETER__TO, oldTo, to));
            }
        }
        return to;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AbstractConfigProperty basicGetTo() {
        return to;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTo(AbstractConfigProperty newTo) {
        AbstractConfigProperty oldTo = to;
        to = newTo;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DeployPlanWithRosModelPackage.CONFIG_ROS_PARAMETER__TO, oldTo, to));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PropertyValue getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetValue(PropertyValue newValue, NotificationChain msgs) {
        PropertyValue oldValue = value;
        value = newValue;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeployPlanWithRosModelPackage.CONFIG_ROS_PARAMETER__VALUE, oldValue, newValue);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setValue(PropertyValue newValue) {
        if (newValue != value) {
            NotificationChain msgs = null;
            if (value != null)
                msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeployPlanWithRosModelPackage.CONFIG_ROS_PARAMETER__VALUE, null, msgs);
            if (newValue != null)
                msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeployPlanWithRosModelPackage.CONFIG_ROS_PARAMETER__VALUE, null, msgs);
            msgs = basicSetValue(newValue, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, DeployPlanWithRosModelPackage.CONFIG_ROS_PARAMETER__VALUE, newValue, newValue));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case DeployPlanWithRosModelPackage.CONFIG_ROS_PARAMETER__VALUE:
                return basicSetValue(null, msgs);
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
            case DeployPlanWithRosModelPackage.CONFIG_ROS_PARAMETER__FROM:
                if (resolve) return getFrom();
                return basicGetFrom();
            case DeployPlanWithRosModelPackage.CONFIG_ROS_PARAMETER__TO:
                if (resolve) return getTo();
                return basicGetTo();
            case DeployPlanWithRosModelPackage.CONFIG_ROS_PARAMETER__VALUE:
                return getValue();
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
            case DeployPlanWithRosModelPackage.CONFIG_ROS_PARAMETER__FROM:
                setFrom((RosParameter)newValue);
                return;
            case DeployPlanWithRosModelPackage.CONFIG_ROS_PARAMETER__TO:
                setTo((AbstractConfigProperty)newValue);
                return;
            case DeployPlanWithRosModelPackage.CONFIG_ROS_PARAMETER__VALUE:
                setValue((PropertyValue)newValue);
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
            case DeployPlanWithRosModelPackage.CONFIG_ROS_PARAMETER__FROM:
                setFrom((RosParameter)null);
                return;
            case DeployPlanWithRosModelPackage.CONFIG_ROS_PARAMETER__TO:
                setTo((AbstractConfigProperty)null);
                return;
            case DeployPlanWithRosModelPackage.CONFIG_ROS_PARAMETER__VALUE:
                setValue((PropertyValue)null);
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
            case DeployPlanWithRosModelPackage.CONFIG_ROS_PARAMETER__FROM:
                return from != null;
            case DeployPlanWithRosModelPackage.CONFIG_ROS_PARAMETER__TO:
                return to != null;
            case DeployPlanWithRosModelPackage.CONFIG_ROS_PARAMETER__VALUE:
                return value != null;
        }
        return super.eIsSet(featureID);
    }

} //ConfigRosParameterImpl
