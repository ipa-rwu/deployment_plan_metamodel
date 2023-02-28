/**
 */
package device.util;

import device.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see device.DevicePackage
 * @generated
 */
public class DeviceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DevicePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DevicePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceSwitch<Adapter> modelSwitch =
		new DeviceSwitch<Adapter>() {
			@Override
			public Adapter caseDeviceSet(DeviceSet object) {
				return createDeviceSetAdapter();
			}
			@Override
			public Adapter caseDeviceType(DeviceType object) {
				return createDeviceTypeAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseProperty(Property object) {
				return createPropertyAdapter();
			}
			@Override
			public Adapter caseIndirectConnection(IndirectConnection object) {
				return createIndirectConnectionAdapter();
			}
			@Override
			public Adapter caseDirectConnection(DirectConnection object) {
				return createDirectConnectionAdapter();
			}
			@Override
			public Adapter caseCapabilityProperty(CapabilityProperty object) {
				return createCapabilityPropertyAdapter();
			}
			@Override
			public Adapter caseCapabilityKind(CapabilityKind object) {
				return createCapabilityKindAdapter();
			}
			@Override
			public Adapter caseAttributeKind(AttributeKind object) {
				return createAttributeKindAdapter();
			}
			@Override
			public Adapter caseMaximumKind(MaximumKind object) {
				return createMaximumKindAdapter();
			}
			@Override
			public Adapter caseMinimumKind(MinimumKind object) {
				return createMinimumKindAdapter();
			}
			@Override
			public Adapter caseSelectionKind(SelectionKind object) {
				return createSelectionKindAdapter();
			}
			@Override
			public Adapter casePropertyType(PropertyType object) {
				return createPropertyTypeAdapter();
			}
			@Override
			public Adapter caseCommunicationType(CommunicationType object) {
				return createCommunicationTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link device.DeviceSet <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see device.DeviceSet
	 * @generated
	 */
	public Adapter createDeviceSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link device.DeviceType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see device.DeviceType
	 * @generated
	 */
	public Adapter createDeviceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link device.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see device.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link device.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see device.Property
	 * @generated
	 */
	public Adapter createPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link device.IndirectConnection <em>Indirect Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see device.IndirectConnection
	 * @generated
	 */
	public Adapter createIndirectConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link device.DirectConnection <em>Direct Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see device.DirectConnection
	 * @generated
	 */
	public Adapter createDirectConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link device.CapabilityProperty <em>Capability Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see device.CapabilityProperty
	 * @generated
	 */
	public Adapter createCapabilityPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link device.CapabilityKind <em>Capability Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see device.CapabilityKind
	 * @generated
	 */
	public Adapter createCapabilityKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link device.AttributeKind <em>Attribute Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see device.AttributeKind
	 * @generated
	 */
	public Adapter createAttributeKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link device.MaximumKind <em>Maximum Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see device.MaximumKind
	 * @generated
	 */
	public Adapter createMaximumKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link device.MinimumKind <em>Minimum Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see device.MinimumKind
	 * @generated
	 */
	public Adapter createMinimumKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link device.SelectionKind <em>Selection Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see device.SelectionKind
	 * @generated
	 */
	public Adapter createSelectionKindAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link device.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see device.PropertyType
	 * @generated
	 */
	public Adapter createPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link device.CommunicationType <em>Communication Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see device.CommunicationType
	 * @generated
	 */
	public Adapter createCommunicationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DeviceAdapterFactory
