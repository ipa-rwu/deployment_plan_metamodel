/**
 */
package device.provider;

import device.util.DeviceAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DeviceItemProviderAdapterFactory extends DeviceAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link device.DeviceSet} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceSetItemProvider deviceSetItemProvider;

	/**
	 * This creates an adapter for a {@link device.DeviceSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeviceSetAdapter() {
		if (deviceSetItemProvider == null) {
			deviceSetItemProvider = new DeviceSetItemProvider(this);
		}

		return deviceSetItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link device.DeviceType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceTypeItemProvider deviceTypeItemProvider;

	/**
	 * This creates an adapter for a {@link device.DeviceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeviceTypeAdapter() {
		if (deviceTypeItemProvider == null) {
			deviceTypeItemProvider = new DeviceTypeItemProvider(this);
		}

		return deviceTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link device.CommunicationConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationConnectionItemProvider communicationConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link device.CommunicationConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommunicationConnectionAdapter() {
		if (communicationConnectionItemProvider == null) {
			communicationConnectionItemProvider = new CommunicationConnectionItemProvider(this);
		}

		return communicationConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link device.Property} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyItemProvider propertyItemProvider;

	/**
	 * This creates an adapter for a {@link device.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this);
		}

		return propertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link device.CapabilityProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityPropertyItemProvider capabilityPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link device.CapabilityProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCapabilityPropertyAdapter() {
		if (capabilityPropertyItemProvider == null) {
			capabilityPropertyItemProvider = new CapabilityPropertyItemProvider(this);
		}

		return capabilityPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link device.AttributeKind} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeKindItemProvider attributeKindItemProvider;

	/**
	 * This creates an adapter for a {@link device.AttributeKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeKindAdapter() {
		if (attributeKindItemProvider == null) {
			attributeKindItemProvider = new AttributeKindItemProvider(this);
		}

		return attributeKindItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link device.MaximumKind} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MaximumKindItemProvider maximumKindItemProvider;

	/**
	 * This creates an adapter for a {@link device.MaximumKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMaximumKindAdapter() {
		if (maximumKindItemProvider == null) {
			maximumKindItemProvider = new MaximumKindItemProvider(this);
		}

		return maximumKindItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link device.MinimumKind} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MinimumKindItemProvider minimumKindItemProvider;

	/**
	 * This creates an adapter for a {@link device.MinimumKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMinimumKindAdapter() {
		if (minimumKindItemProvider == null) {
			minimumKindItemProvider = new MinimumKindItemProvider(this);
		}

		return minimumKindItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link device.SelectionKind} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectionKindItemProvider selectionKindItemProvider;

	/**
	 * This creates an adapter for a {@link device.SelectionKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSelectionKindAdapter() {
		if (selectionKindItemProvider == null) {
			selectionKindItemProvider = new SelectionKindItemProvider(this);
		}

		return selectionKindItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link device.CommunicationType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunicationTypeItemProvider communicationTypeItemProvider;

	/**
	 * This creates an adapter for a {@link device.CommunicationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCommunicationTypeAdapter() {
		if (communicationTypeItemProvider == null) {
			communicationTypeItemProvider = new CommunicationTypeItemProvider(this);
		}

		return communicationTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link device.ConnectionProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionPropertyItemProvider connectionPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link device.ConnectionProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectionPropertyAdapter() {
		if (connectionPropertyItemProvider == null) {
			connectionPropertyItemProvider = new ConnectionPropertyItemProvider(this);
		}

		return connectionPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link device.CapabilityType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapabilityTypeItemProvider capabilityTypeItemProvider;

	/**
	 * This creates an adapter for a {@link device.CapabilityType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCapabilityTypeAdapter() {
		if (capabilityTypeItemProvider == null) {
			capabilityTypeItemProvider = new CapabilityTypeItemProvider(this);
		}

		return capabilityTypeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (deviceSetItemProvider != null) deviceSetItemProvider.dispose();
		if (deviceTypeItemProvider != null) deviceTypeItemProvider.dispose();
		if (communicationConnectionItemProvider != null) communicationConnectionItemProvider.dispose();
		if (propertyItemProvider != null) propertyItemProvider.dispose();
		if (capabilityPropertyItemProvider != null) capabilityPropertyItemProvider.dispose();
		if (attributeKindItemProvider != null) attributeKindItemProvider.dispose();
		if (maximumKindItemProvider != null) maximumKindItemProvider.dispose();
		if (minimumKindItemProvider != null) minimumKindItemProvider.dispose();
		if (selectionKindItemProvider != null) selectionKindItemProvider.dispose();
		if (communicationTypeItemProvider != null) communicationTypeItemProvider.dispose();
		if (connectionPropertyItemProvider != null) connectionPropertyItemProvider.dispose();
		if (capabilityTypeItemProvider != null) capabilityTypeItemProvider.dispose();
	}

}
