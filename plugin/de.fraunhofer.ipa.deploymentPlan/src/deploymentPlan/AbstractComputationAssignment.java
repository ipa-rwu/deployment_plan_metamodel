/**
 */
package deploymentPlan;

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
 *   <li>{@link deploymentPlan.AbstractComputationAssignment#getVersion <em>Version</em>}</li>
 *   <li>{@link deploymentPlan.AbstractComputationAssignment#getSoftwareComponents <em>Software Components</em>}</li>
 *   <li>{@link deploymentPlan.AbstractComputationAssignment#getMiddleware <em>Middleware</em>}</li>
 *   <li>{@link deploymentPlan.AbstractComputationAssignment#getRuntimeType <em>Runtime Type</em>}</li>
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
     * Returns the value of the '<em><b>Version</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Version</em>' attribute.
     * @see #setVersion(String)
     * @see deploymentPlan.DeploymentPlanPackage#getAbstractComputationAssignment_Version()
     * @model
     * @generated
     */
    String getVersion();

                /**
     * Sets the value of the '{@link deploymentPlan.AbstractComputationAssignment#getVersion <em>Version</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Version</em>' attribute.
     * @see #getVersion()
     * @generated
     */
    void setVersion(String value);

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
     * Returns the value of the '<em><b>Runtime Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Runtime Type</em>' containment reference.
     * @see #setRuntimeType(AbstractRuntime)
     * @see deploymentPlan.DeploymentPlanPackage#getAbstractComputationAssignment_RuntimeType()
     * @model containment="true"
     * @generated
     */
    AbstractRuntime getRuntimeType();

    /**
     * Sets the value of the '{@link deploymentPlan.AbstractComputationAssignment#getRuntimeType <em>Runtime Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Runtime Type</em>' containment reference.
     * @see #getRuntimeType()
     * @generated
     */
    void setRuntimeType(AbstractRuntime value);

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

} // AbstractComputationAssignment
