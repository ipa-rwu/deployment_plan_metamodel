/**
 */
package de.fraunhofer.ipa.deployment.util;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage
 * @generated
 */
public interface UtilFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UtilFactory eINSTANCE = de.fraunhofer.ipa.deployment.util.impl.UtilFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Property Value Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Value Int</em>'.
	 * @generated
	 */
	PropertyValueInt createPropertyValueInt();

	/**
	 * Returns a new object of class '<em>Property Value Double</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Value Double</em>'.
	 * @generated
	 */
	PropertyValueDouble createPropertyValueDouble();

	/**
	 * Returns a new object of class '<em>Property Value String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Value String</em>'.
	 * @generated
	 */
	PropertyValueString createPropertyValueString();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Linux Operting System</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linux Operting System</em>'.
	 * @generated
	 */
	LinuxOpertingSystem createLinuxOpertingSystem();

	/**
	 * Returns a new object of class '<em>Resouce Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resouce Type</em>'.
	 * @generated
	 */
	ResouceType createResouceType();

	/**
	 * Returns a new object of class '<em>X86 Processor Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>X86 Processor Architecture</em>'.
	 * @generated
	 */
	X86ProcessorArchitecture createX86ProcessorArchitecture();

	/**
	 * Returns a new object of class '<em>Arm64 Processor Architecture</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arm64 Processor Architecture</em>'.
	 * @generated
	 */
	Arm64ProcessorArchitecture createArm64ProcessorArchitecture();

	/**
	 * Returns a new object of class '<em>Communication Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Communication Type</em>'.
	 * @generated
	 */
	CommunicationType createCommunicationType();

	/**
	 * Returns a new object of class '<em>Ethernet Communication Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ethernet Communication Type</em>'.
	 * @generated
	 */
	EthernetCommunicationType createEthernetCommunicationType();

	/**
	 * Returns a new object of class '<em>Wlan Communication Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Wlan Communication Type</em>'.
	 * @generated
	 */
	WlanCommunicationType createWlanCommunicationType();

	/**
	 * Returns a new object of class '<em>Available Resouce</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Available Resouce</em>'.
	 * @generated
	 */
	AvailableResouce createAvailableResouce();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UtilPackage getUtilPackage();

} //UtilFactory
