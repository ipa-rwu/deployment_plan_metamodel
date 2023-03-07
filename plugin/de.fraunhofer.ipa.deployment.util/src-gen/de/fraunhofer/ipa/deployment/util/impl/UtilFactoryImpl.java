/**
 */
package de.fraunhofer.ipa.deployment.util.impl;

import de.fraunhofer.ipa.deployment.util.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UtilFactoryImpl extends EFactoryImpl implements UtilFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UtilFactory init() {
		try {
			UtilFactory theUtilFactory = (UtilFactory) EPackage.Registry.INSTANCE.getEFactory(UtilPackage.eNS_URI);
			if (theUtilFactory != null) {
				return theUtilFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UtilFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case UtilPackage.PROPERTY_VALUE_INT:
			return createPropertyValueInt();
		case UtilPackage.PROPERTY_VALUE_DOUBLE:
			return createPropertyValueDouble();
		case UtilPackage.PROPERTY_VALUE_STRING:
			return createPropertyValueString();
		case UtilPackage.PROPERTY:
			return createProperty();
		case UtilPackage.COMMUNICATION_TYPE:
			return createCommunicationType();
		case UtilPackage.ETHERNET_COMMUNICATION_TYPE:
			return createEthernetCommunicationType();
		case UtilPackage.WLAN_COMMUNICATION_TYPE:
			return createWlanCommunicationType();
		case UtilPackage.AVAILABLE_RESOUCE:
			return createAvailableResouce();
		case UtilPackage.LINUX_OPERTING_SYSTEM_TYPE:
			return createLinuxOpertingSystemType();
		case UtilPackage.MAC_OS_OPERTING_SYSTEM_TYPE:
			return createMacOSOpertingSystemType();
		case UtilPackage.PROCESSOR_ARCHITECTURE_TYPE:
			return createProcessorArchitectureType();
		case UtilPackage.X86_PROCESSOR_ARCHITECTURE:
			return createX86ProcessorArchitecture();
		case UtilPackage.ARM64_PROCESSOR_ARCHITECTURE:
			return createArm64ProcessorArchitecture();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyValueInt createPropertyValueInt() {
		PropertyValueIntImpl propertyValueInt = new PropertyValueIntImpl();
		return propertyValueInt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyValueDouble createPropertyValueDouble() {
		PropertyValueDoubleImpl propertyValueDouble = new PropertyValueDoubleImpl();
		return propertyValueDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyValueString createPropertyValueString() {
		PropertyValueStringImpl propertyValueString = new PropertyValueStringImpl();
		return propertyValueString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationType createCommunicationType() {
		CommunicationTypeImpl communicationType = new CommunicationTypeImpl();
		return communicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EthernetCommunicationType createEthernetCommunicationType() {
		EthernetCommunicationTypeImpl ethernetCommunicationType = new EthernetCommunicationTypeImpl();
		return ethernetCommunicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WlanCommunicationType createWlanCommunicationType() {
		WlanCommunicationTypeImpl wlanCommunicationType = new WlanCommunicationTypeImpl();
		return wlanCommunicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AvailableResouce createAvailableResouce() {
		AvailableResouceImpl availableResouce = new AvailableResouceImpl();
		return availableResouce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinuxOpertingSystemType createLinuxOpertingSystemType() {
		LinuxOpertingSystemTypeImpl linuxOpertingSystemType = new LinuxOpertingSystemTypeImpl();
		return linuxOpertingSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacOSOpertingSystemType createMacOSOpertingSystemType() {
		MacOSOpertingSystemTypeImpl macOSOpertingSystemType = new MacOSOpertingSystemTypeImpl();
		return macOSOpertingSystemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorArchitectureType createProcessorArchitectureType() {
		ProcessorArchitectureTypeImpl processorArchitectureType = new ProcessorArchitectureTypeImpl();
		return processorArchitectureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public X86ProcessorArchitecture createX86ProcessorArchitecture() {
		X86ProcessorArchitectureImpl x86ProcessorArchitecture = new X86ProcessorArchitectureImpl();
		return x86ProcessorArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arm64ProcessorArchitecture createArm64ProcessorArchitecture() {
		Arm64ProcessorArchitectureImpl arm64ProcessorArchitecture = new Arm64ProcessorArchitectureImpl();
		return arm64ProcessorArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UtilPackage getUtilPackage() {
		return (UtilPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UtilPackage getPackage() {
		return UtilPackage.eINSTANCE;
	}

} //UtilFactoryImpl
