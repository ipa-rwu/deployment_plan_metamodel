/**
 */
package deploymentPlan;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>ROS Distro</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see deploymentPlan.DeploymentPlanPackage#getROSDistro()
 * @model
 * @generated
 */
public enum ROSDistro implements Enumerator {
    /**
     * The '<em><b>Humble</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HUMBLE_VALUE
     * @generated
     * @ordered
     */
    HUMBLE(2, "humble", "humble"),

    /**
     * The '<em><b>Noetic</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOETIC_VALUE
     * @generated
     * @ordered
     */
    NOETIC(1, "noetic", "noetic"),

    /**
     * The '<em><b>Rolling</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROLLING_VALUE
     * @generated
     * @ordered
     */
    ROLLING(2, "rolling", "rolling"),

    /**
     * The '<em><b>Galactic</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GALACTIC_VALUE
     * @generated
     * @ordered
     */
    GALACTIC(2, "galactic", "galactic");

    /**
     * The '<em><b>Humble</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #HUMBLE
     * @model name="humble"
     * @generated
     * @ordered
     */
    public static final int HUMBLE_VALUE = 2;

    /**
     * The '<em><b>Noetic</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOETIC
     * @model name="noetic"
     * @generated
     * @ordered
     */
    public static final int NOETIC_VALUE = 1;

    /**
     * The '<em><b>Rolling</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ROLLING
     * @model name="rolling"
     * @generated
     * @ordered
     */
    public static final int ROLLING_VALUE = 2;

    /**
     * The '<em><b>Galactic</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GALACTIC
     * @model name="galactic"
     * @generated
     * @ordered
     */
    public static final int GALACTIC_VALUE = 2;

    /**
     * An array of all the '<em><b>ROS Distro</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final ROSDistro[] VALUES_ARRAY =
        new ROSDistro[] {
            HUMBLE,
            NOETIC,
            ROLLING,
            GALACTIC,
        };

    /**
     * A public read-only list of all the '<em><b>ROS Distro</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<ROSDistro> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>ROS Distro</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ROSDistro get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ROSDistro result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>ROS Distro</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ROSDistro getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ROSDistro result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>ROS Distro</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static ROSDistro get(int value) {
        switch (value) {
            case HUMBLE_VALUE: return HUMBLE;
            case NOETIC_VALUE: return NOETIC;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private ROSDistro(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getValue() {
      return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
      return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getLiteral() {
      return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }

} //ROSDistro
