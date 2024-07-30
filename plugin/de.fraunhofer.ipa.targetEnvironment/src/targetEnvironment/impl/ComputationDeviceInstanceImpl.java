/**
 */
package targetEnvironment.impl;

import device.ComputationDeviceType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import targetEnvironment.ComputationDeviceInstance;
import targetEnvironment.TargetEnvironmentPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computation Device Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link targetEnvironment.impl.ComputationDeviceInstanceImpl#getRefDeviceType <em>Ref Device Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComputationDeviceInstanceImpl extends AbstractDeviceInstanceImpl implements ComputationDeviceInstance {
    /**
   * The cached value of the '{@link #getRefDeviceType() <em>Ref Device Type</em>}' reference.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getRefDeviceType()
   * @generated
   * @ordered
   */
    protected ComputationDeviceType refDeviceType;

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    protected ComputationDeviceInstanceImpl() {
    super();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    protected EClass eStaticClass() {
    return TargetEnvironmentPackage.Literals.COMPUTATION_DEVICE_INSTANCE;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public ComputationDeviceType getRefDeviceType() {
    if (refDeviceType != null && refDeviceType.eIsProxy()) {
      InternalEObject oldRefDeviceType = (InternalEObject)refDeviceType;
      refDeviceType = (ComputationDeviceType)eResolveProxy(oldRefDeviceType);
      if (refDeviceType != oldRefDeviceType) {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TargetEnvironmentPackage.COMPUTATION_DEVICE_INSTANCE__REF_DEVICE_TYPE, oldRefDeviceType, refDeviceType));
      }
    }
    return refDeviceType;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public ComputationDeviceType basicGetRefDeviceType() {
    return refDeviceType;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public void setRefDeviceType(ComputationDeviceType newRefDeviceType) {
    ComputationDeviceType oldRefDeviceType = refDeviceType;
    refDeviceType = newRefDeviceType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TargetEnvironmentPackage.COMPUTATION_DEVICE_INSTANCE__REF_DEVICE_TYPE, oldRefDeviceType, refDeviceType));
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
      case TargetEnvironmentPackage.COMPUTATION_DEVICE_INSTANCE__REF_DEVICE_TYPE:
        if (resolve) return getRefDeviceType();
        return basicGetRefDeviceType();
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
      case TargetEnvironmentPackage.COMPUTATION_DEVICE_INSTANCE__REF_DEVICE_TYPE:
        setRefDeviceType((ComputationDeviceType)newValue);
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
      case TargetEnvironmentPackage.COMPUTATION_DEVICE_INSTANCE__REF_DEVICE_TYPE:
        setRefDeviceType((ComputationDeviceType)null);
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
      case TargetEnvironmentPackage.COMPUTATION_DEVICE_INSTANCE__REF_DEVICE_TYPE:
        return refDeviceType != null;
    }
    return super.eIsSet(featureID);
  }

} //ComputationDeviceInstanceImpl
