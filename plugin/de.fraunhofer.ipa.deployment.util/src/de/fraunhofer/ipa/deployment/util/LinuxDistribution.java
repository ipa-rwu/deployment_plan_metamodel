/**
 */
package de.fraunhofer.ipa.deployment.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Linux Distribution</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getLinuxDistribution()
 * @model
 * @generated
 */
public enum LinuxDistribution implements Enumerator {
  /**
   * The '<em><b>Ubuntu</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UBUNTU_VALUE
   * @generated
   * @ordered
   */
  UBUNTU(0, "ubuntu", "ubuntu"),

  /**
   * The '<em><b>Debian</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEBIAN_VALUE
   * @generated
   * @ordered
   */
  DEBIAN(1, "debian", "debian");

  /**
   * The '<em><b>Ubuntu</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #UBUNTU
   * @model name="ubuntu"
   * @generated
   * @ordered
   */
  public static final int UBUNTU_VALUE = 0;

  /**
   * The '<em><b>Debian</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DEBIAN
   * @model name="debian"
   * @generated
   * @ordered
   */
  public static final int DEBIAN_VALUE = 1;

  /**
   * An array of all the '<em><b>Linux Distribution</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final LinuxDistribution[] VALUES_ARRAY = new LinuxDistribution[] { UBUNTU, DEBIAN, };

  /**
   * A public read-only list of all the '<em><b>Linux Distribution</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<LinuxDistribution> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Linux Distribution</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static LinuxDistribution get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      LinuxDistribution result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Linux Distribution</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static LinuxDistribution getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      LinuxDistribution result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Linux Distribution</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static LinuxDistribution get(int value) {
    switch (value) {
    case UBUNTU_VALUE:
      return UBUNTU;
    case DEBIAN_VALUE:
      return DEBIAN;
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
  private LinuxDistribution(int value, String name, String literal) {
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

} //LinuxDistribution
