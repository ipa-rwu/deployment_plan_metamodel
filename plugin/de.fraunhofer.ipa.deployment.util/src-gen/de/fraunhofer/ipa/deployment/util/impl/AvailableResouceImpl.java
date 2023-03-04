/**
 */
package de.fraunhofer.ipa.deployment.util.impl;

import de.fraunhofer.ipa.deployment.util.AvailableResouce;
import de.fraunhofer.ipa.deployment.util.ResouceType;
import de.fraunhofer.ipa.deployment.util.UtilPackage;

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
 * An implementation of the model object '<em><b>Available Resouce</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fraunhofer.ipa.deployment.util.impl.AvailableResouceImpl#getList <em>List</em>}</li>
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
	protected EList<ResouceType> list;

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
	public EList<ResouceType> getList() {
		if (list == null) {
			list = new EObjectContainmentEList<ResouceType>(ResouceType.class, this,
					UtilPackage.AVAILABLE_RESOUCE__LIST);
		}
		return list;
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
			getList().addAll((Collection<? extends ResouceType>) newValue);
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
		}
		return super.eIsSet(featureID);
	}

} //AvailableResouceImpl
