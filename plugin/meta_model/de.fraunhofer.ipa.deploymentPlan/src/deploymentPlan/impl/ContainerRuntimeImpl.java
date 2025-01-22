/**
 */
package deploymentPlan.impl;

import de.fraunhofer.ipa.deployment.util.OperatingSystemResouce;

import deploymentPlan.ContainerRuntime;
import deploymentPlan.DeploymentPlanPackage;

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
 * An implementation of the model object '<em><b>Container Runtime</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.impl.ContainerRuntimeImpl#getRegistry <em>Registry</em>}</li>
 *   <li>{@link deploymentPlan.impl.ContainerRuntimeImpl#getOpertingSystemResource <em>Operting System Resource</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerRuntimeImpl extends AbstractRuntimeImpl implements ContainerRuntime {
    /**
   * The default value of the '{@link #getRegistry() <em>Registry</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegistry()
   * @generated
   * @ordered
   */
  protected static final String REGISTRY_EDEFAULT = null;
  /**
   * The cached value of the '{@link #getRegistry() <em>Registry</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegistry()
   * @generated
   * @ordered
   */
  protected String registry = REGISTRY_EDEFAULT;
        /**
   * The cached value of the '{@link #getOpertingSystemResource() <em>Operting System Resource</em>}' containment reference list.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @see #getOpertingSystemResource()
   * @generated
   * @ordered
   */
    protected EList<OperatingSystemResouce> opertingSystemResource;
    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    protected ContainerRuntimeImpl() {
    super();
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    protected EClass eStaticClass() {
    return DeploymentPlanPackage.Literals.CONTAINER_RUNTIME;
  }

    /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getRegistry() {
    return registry;
  }

        /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRegistry(String newRegistry) {
    String oldRegistry = registry;
    registry = newRegistry;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DeploymentPlanPackage.CONTAINER_RUNTIME__REGISTRY, oldRegistry, registry));
  }

        /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    public EList<OperatingSystemResouce> getOpertingSystemResource() {
    if (opertingSystemResource == null) {
      opertingSystemResource = new EObjectContainmentEList<OperatingSystemResouce>(OperatingSystemResouce.class, this, DeploymentPlanPackage.CONTAINER_RUNTIME__OPERTING_SYSTEM_RESOURCE);
    }
    return opertingSystemResource;
  }

    /**
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @generated
   */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID) {
      case DeploymentPlanPackage.CONTAINER_RUNTIME__OPERTING_SYSTEM_RESOURCE:
        return ((InternalEList<?>)getOpertingSystemResource()).basicRemove(otherEnd, msgs);
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
      case DeploymentPlanPackage.CONTAINER_RUNTIME__REGISTRY:
        return getRegistry();
      case DeploymentPlanPackage.CONTAINER_RUNTIME__OPERTING_SYSTEM_RESOURCE:
        return getOpertingSystemResource();
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
      case DeploymentPlanPackage.CONTAINER_RUNTIME__REGISTRY:
        setRegistry((String)newValue);
        return;
      case DeploymentPlanPackage.CONTAINER_RUNTIME__OPERTING_SYSTEM_RESOURCE:
        getOpertingSystemResource().clear();
        getOpertingSystemResource().addAll((Collection<? extends OperatingSystemResouce>)newValue);
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
      case DeploymentPlanPackage.CONTAINER_RUNTIME__REGISTRY:
        setRegistry(REGISTRY_EDEFAULT);
        return;
      case DeploymentPlanPackage.CONTAINER_RUNTIME__OPERTING_SYSTEM_RESOURCE:
        getOpertingSystemResource().clear();
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
      case DeploymentPlanPackage.CONTAINER_RUNTIME__REGISTRY:
        return REGISTRY_EDEFAULT == null ? registry != null : !REGISTRY_EDEFAULT.equals(registry);
      case DeploymentPlanPackage.CONTAINER_RUNTIME__OPERTING_SYSTEM_RESOURCE:
        return opertingSystemResource != null && !opertingSystemResource.isEmpty();
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
    result.append(" (registry: ");
    result.append(registry);
    result.append(')');
    return result.toString();
  }

} //ContainerRuntimeImpl
