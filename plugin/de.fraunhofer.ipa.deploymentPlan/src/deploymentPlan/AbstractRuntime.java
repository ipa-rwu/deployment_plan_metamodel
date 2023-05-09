/**
 */
package deploymentPlan;

import de.fraunhofer.ipa.deployment.util.RunTimeType;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Runtime</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link deploymentPlan.AbstractRuntime#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see deploymentPlan.DeploymentPlanPackage#getAbstractRuntime()
 * @model abstract="true"
 * @generated
 */
public interface AbstractRuntime extends EObject {

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link de.fraunhofer.ipa.deployment.util.RunTimeType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see de.fraunhofer.ipa.deployment.util.RunTimeType
     * @see #setType(RunTimeType)
     * @see deploymentPlan.DeploymentPlanPackage#getAbstractRuntime_Type()
     * @model required="true"
     * @generated
     */
    RunTimeType getType();

    /**
     * Sets the value of the '{@link deploymentPlan.AbstractRuntime#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see de.fraunhofer.ipa.deployment.util.RunTimeType
     * @see #getType()
     * @generated
     */
    void setType(RunTimeType value);
} // AbstractRuntime
