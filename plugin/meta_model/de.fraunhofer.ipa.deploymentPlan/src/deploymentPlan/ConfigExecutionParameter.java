/**
 */
package deploymentPlan;

import de.fraunhofer.ipa.deployment.util.PropertyValue;

import implementationDescription.ExecutionParameter;

import targetEnvironment.AbstractConfigProperty;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config Execution Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.ConfigExecutionParameter#getFrom <em>From</em>}</li>
 *   <li>{@link deploymentPlan.ConfigExecutionParameter#getTo <em>To</em>}</li>
 *   <li>{@link deploymentPlan.ConfigExecutionParameter#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see deploymentPlan.DeploymentPlanPackage#getConfigExecutionParameter()
 * @model
 * @generated
 */
public interface ConfigExecutionParameter extends AbstractConfigExecutionParameter {
    /**
   * Returns the value of the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' reference.
   * @see #setFrom(ExecutionParameter)
   * @see deploymentPlan.DeploymentPlanPackage#getConfigExecutionParameter_From()
   * @model required="true"
   * @generated
   */
    ExecutionParameter getFrom();

    /**
   * Sets the value of the '{@link deploymentPlan.ConfigExecutionParameter#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
    void setFrom(ExecutionParameter value);

    /**
   * Returns the value of the '<em><b>To</b></em>' reference.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the value of the '<em>To</em>' reference.
   * @see #setTo(AbstractConfigProperty)
   * @see deploymentPlan.DeploymentPlanPackage#getConfigExecutionParameter_To()
   * @model
   * @generated
   */
    AbstractConfigProperty getTo();

    /**
   * Sets the value of the '{@link deploymentPlan.ConfigExecutionParameter#getTo <em>To</em>}' reference.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @param value the new value of the '<em>To</em>' reference.
   * @see #getTo()
   * @generated
   */
    void setTo(AbstractConfigProperty value);

    /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(PropertyValue)
   * @see deploymentPlan.DeploymentPlanPackage#getConfigExecutionParameter_Value()
   * @model containment="true"
   * @generated
   */
    PropertyValue getValue();

    /**
   * Sets the value of the '{@link deploymentPlan.ConfigExecutionParameter#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
    void setValue(PropertyValue value);

} // ConfigExecutionParameter
