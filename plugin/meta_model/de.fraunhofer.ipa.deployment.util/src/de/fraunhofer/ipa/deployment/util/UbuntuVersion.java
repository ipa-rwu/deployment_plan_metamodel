/**
 */
package de.fraunhofer.ipa.deployment.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Ubuntu Version</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getUbuntuVersion()
 * @model
 * @generated
 */
public enum UbuntuVersion implements Enumerator {
  /**
   * The '<em><b>Focal</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FOCAL_VALUE
   * @generated
   * @ordered
   */
  FOCAL(18, "focal", "focal"),

  /**
   * The '<em><b>Jammy</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #JAMMY_VALUE
   * @generated
   * @ordered
   */
  JAMMY(20, "jammy", "jammy");

  /**
   * The '<em><b>Focal</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #FOCAL
   * @model name="focal"
   * @generated
   * @ordered
   */
  public static final int FOCAL_VALUE = 18;

  /**
   * The '<em><b>Jammy</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #JAMMY
   * @model name="jammy"
   * @generated
   * @ordered
   */
  public static final int JAMMY_VALUE = 20;

  /**
   * An array of all the '<em><b>Ubuntu Version</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final UbuntuVersion[] VALUES_ARRAY = new UbuntuVersion[] { FOCAL, JAMMY, };

  /**
   * A public read-only list of all the '<em><b>Ubuntu Version</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<UbuntuVersion> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Ubuntu Version</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static UbuntuVersion get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      UbuntuVersion result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Ubuntu Version</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static UbuntuVersion getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      UbuntuVersion result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Ubuntu Version</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static UbuntuVersion get(int value) {
    switch (value) {
    case FOCAL_VALUE:
      return FOCAL;
    case JAMMY_VALUE:
      return JAMMY;
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
  private UbuntuVersion(int value, String name, String literal) {
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

} //UbuntuVersion
