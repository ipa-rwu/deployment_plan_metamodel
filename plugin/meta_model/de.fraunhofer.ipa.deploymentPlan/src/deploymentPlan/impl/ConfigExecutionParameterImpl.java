/**
 */
package deploymentPlan.impl;

import de.fraunhofer.ipa.deployment.util.PropertyValue;

import deploymentPlan.ConfigExecutionParameter;
import deploymentPlan.DeploymentPlanPackage;

import implementationDescription.ExecutionParameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targetEnvironment.AbstractConfigProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config Execution Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.impl.ConfigExecutionParameterImpl#getFrom <em>From</em>}</li>
 *   <li>{@link deploymentPlan.impl.ConfigExecutionParameterImpl#getTo <em>To</em>}</li>
 *   <li>{@link deploymentPlan.impl.ConfigExecutionParameterImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigExecutionParameterImpl extends AbstractConfigExecutionParameterImpl implements ConfigExecutionParameter {
    /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
    protected ExecutionParameter from;

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
    protected ConfigExecutionParameterImpl() {
    super();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    protected EClass eStaticClass() {
    return DeploymentPlanPackage.Literals.CONFIG_EXECUTION_PARAMETER;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public ExecutionParameter getFrom() {
    if (from != null && from.eIsProxy()) {
      InternalEObject oldFrom = (InternalEObject)from;
      from = (ExecutionParameter)eResolveProxy(oldFrom);
      if (from != oldFrom) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPlanPackage.CONFIG_EXECUTION_PARAMETER__FROM, oldFrom, from));
      }
    }
    return from;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public ExecutionParameter basicGetFrom() {
    return from;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public void setFrom(ExecutionParameter newFrom) {
    ExecutionParameter oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPlanPackage.CONFIG_EXECUTION_PARAMETER__FROM, oldFrom, from));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DeploymentPlanPackage.CONFIG_EXECUTION_PARAMETER__TO, oldTo, to));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPlanPackage.CONFIG_EXECUTION_PARAMETER__TO, oldTo, to));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DeploymentPlanPackage.CONFIG_EXECUTION_PARAMETER__VALUE, oldValue, newValue);
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
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DeploymentPlanPackage.CONFIG_EXECUTION_PARAMETER__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DeploymentPlanPackage.CONFIG_EXECUTION_PARAMETER__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPlanPackage.CONFIG_EXECUTION_PARAMETER__VALUE, newValue, newValue));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case DeploymentPlanPackage.CONFIG_EXECUTION_PARAMETER__VALUE:
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
      case DeploymentPlanPackage.CONFIG_EXECUTION_PARAMETER__FROM:
        if (resolve) return getFrom();
        return basicGetFrom();
      case DeploymentPlanPackage.CONFIG_EXECUTION_PARAMETER__TO:
        if (resolve) return getTo();
        return basicGetTo();
      case DeploymentPlanPackage.CONFIG_EXECUTION_PARAMETER__VALUE:
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
      case DeploymentPlanPackage.CONFIG_EXECUTION_PARAMETER__FROM:
        setFrom((ExecutionParameter)newValue);
        return;
      case DeploymentPlanPackage.CONFIG_EXECUTION_PARAMETER__TO:
        setTo((AbstractConfigProperty)newValue);
        return;
      case DeploymentPlanPackage.CONFIG_EXECUTION_PARAMETER__VALUE:
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
      case DeploymentPlanPackage.CONFIG_EXECUTION_PARAMETER__FROM:
        setFrom((ExecutionParameter)null);
        return;
      case DeploymentPlanPackage.CONFIG_EXECUTION_PARAMETER__TO:
        setTo((AbstractConfigProperty)null);
        return;
      case DeploymentPlanPackage.CONFIG_EXECUTION_PARAMETER__VALUE:
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
      case DeploymentPlanPackage.CONFIG_EXECUTION_PARAMETER__FROM:
        return from != null;
      case DeploymentPlanPackage.CONFIG_EXECUTION_PARAMETER__TO:
        return to != null;
      case DeploymentPlanPackage.CONFIG_EXECUTION_PARAMETER__VALUE:
        return value != null;
    }
    return super.eIsSet(featureID);
  }

} //ConfigExecutionParameterImpl
