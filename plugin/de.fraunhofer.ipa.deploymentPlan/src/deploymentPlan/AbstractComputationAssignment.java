/**
 */
package deploymentPlan;

import de.fraunhofer.ipa.deployment.util.OpertingSystemName;
import de.fraunhofer.ipa.deployment.util.RunTimeType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import targetEnvironment.ComputationDeviceInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Computation Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.AbstractComputationAssignment#getName <em>Name</em>}</li>
 *   <li>{@link deploymentPlan.AbstractComputationAssignment#getExecutedBy <em>Executed By</em>}</li>
 *   <li>{@link deploymentPlan.AbstractComputationAssignment#getSoftwareComponents <em>Software Components</em>}</li>
 *   <li>{@link deploymentPlan.AbstractComputationAssignment#getOpertingSystemVersion <em>Operting System Version</em>}</li>
 *   <li>{@link deploymentPlan.AbstractComputationAssignment#getRuntimeType <em>Runtime Type</em>}</li>
 *   <li>{@link deploymentPlan.AbstractComputationAssignment#getMiddleware <em>Middleware</em>}</li>
 *   <li>{@link deploymentPlan.AbstractComputationAssignment#getOpertingSystemType <em>Operting System Type</em>}</li>
 * </ul>
 *
 * @see deploymentPlan.DeploymentPlanPackage#getAbstractComputationAssignment()
 * @model abstract="true"
 * @generated
 */
public interface AbstractComputationAssignment extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see deploymentPlan.DeploymentPlanPackage#getAbstractComputationAssignment_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link deploymentPlan.AbstractComputationAssignment#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Executed By</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Executed By</em>' reference.
     * @see #setExecutedBy(ComputationDeviceInstance)
     * @see deploymentPlan.DeploymentPlanPackage#getAbstractComputationAssignment_ExecutedBy()
     * @model required="true"
     * @generated
     */
    ComputationDeviceInstance getExecutedBy();

    /**
     * Sets the value of the '{@link deploymentPlan.AbstractComputationAssignment#getExecutedBy <em>Executed By</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Executed By</em>' reference.
     * @see #getExecutedBy()
     * @generated
     */
    void setExecutedBy(ComputationDeviceInstance value);

    /**
     * Returns the value of the '<em><b>Software Components</b></em>' containment reference list.
     * The list contents are of type {@link deploymentPlan.AbstarctConfigSoftwareComponent}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Software Components</em>' containment reference list.
     * @see deploymentPlan.DeploymentPlanPackage#getAbstractComputationAssignment_SoftwareComponents()
     * @model containment="true" required="true"
     * @generated
     */
    EList<AbstarctConfigSoftwareComponent> getSoftwareComponents();

    /**
     * Returns the value of the '<em><b>Operting System Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operting System Version</em>' attribute.
     * @see #setOpertingSystemVersion(String)
     * @see deploymentPlan.DeploymentPlanPackage#getAbstractComputationAssignment_OpertingSystemVersion()
     * @model
     * @generated
     */
    String getOpertingSystemVersion();

    /**
     * Sets the value of the '{@link deploymentPlan.AbstractComputationAssignment#getOpertingSystemVersion <em>Operting System Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operting System Version</em>' attribute.
     * @see #getOpertingSystemVersion()
     * @generated
     */
    void setOpertingSystemVersion(String value);

    /**
     * Returns the value of the '<em><b>Runtime Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.fraunhofer.ipa.deployment.util.RunTimeType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Runtime Type</em>' attribute.
     * @see de.fraunhofer.ipa.deployment.util.RunTimeType
     * @see #setRuntimeType(RunTimeType)
     * @see deploymentPlan.DeploymentPlanPackage#getAbstractComputationAssignment_RuntimeType()
     * @model
     * @generated
     */
    RunTimeType getRuntimeType();

    /**
     * Sets the value of the '{@link deploymentPlan.AbstractComputationAssignment#getRuntimeType <em>Runtime Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Runtime Type</em>' attribute.
     * @see de.fraunhofer.ipa.deployment.util.RunTimeType
     * @see #getRuntimeType()
     * @generated
     */
    void setRuntimeType(RunTimeType value);

    /**
     * Returns the value of the '<em><b>Middleware</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Middleware</em>' containment reference.
     * @see #setMiddleware(Middleware)
     * @see deploymentPlan.DeploymentPlanPackage#getAbstractComputationAssignment_Middleware()
     * @model containment="true"
     * @generated
     */
    Middleware getMiddleware();

    /**
     * Sets the value of the '{@link deploymentPlan.AbstractComputationAssignment#getMiddleware <em>Middleware</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Middleware</em>' containment reference.
     * @see #getMiddleware()
     * @generated
     */
    void setMiddleware(Middleware value);

    /**
     * Returns the value of the '<em><b>Operting System Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operting System Type</em>' containment reference.
     * @see #setOpertingSystemType(OpertingSystemName)
     * @see deploymentPlan.DeploymentPlanPackage#getAbstractComputationAssignment_OpertingSystemType()
     * @model containment="true"
     * @generated
     */
    OpertingSystemName getOpertingSystemType();

    /**
     * Sets the value of the '{@link deploymentPlan.AbstractComputationAssignment#getOpertingSystemType <em>Operting System Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operting System Type</em>' containment reference.
     * @see #getOpertingSystemType()
     * @generated
     */
    void setOpertingSystemType(OpertingSystemName value);

} // AbstractComputationAssignment
