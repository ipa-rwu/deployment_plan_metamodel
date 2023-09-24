/**
 */
package de.fraunhofer.ipa.deployment.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Processor Architecture Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.fraunhofer.ipa.deployment.util.UtilPackage#getProcessorArchitectureType()
 * @model
 * @generated
 */
public enum ProcessorArchitectureType implements Enumerator {
  /**
   * The '<em><b>X86</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #X86_VALUE
   * @generated
   * @ordered
   */
  X86(0, "x86", "x86"),

  /**
   * The '<em><b>Arm64</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ARM64_VALUE
   * @generated
   * @ordered
   */
  ARM64(0, "arm64", "arm64"),

  /**
   * The '<em><b>Arm64v8</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ARM64V8_VALUE
   * @generated
   * @ordered
   */
  ARM64V8(0, "arm64v8", "arm64v8"),

  /**
   * The '<em><b>Arm32</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ARM32_VALUE
   * @generated
   * @ordered
   */
  ARM32(0, "arm32", "arm32");

  /**
   * The '<em><b>X86</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #X86
   * @model name="x86"
   * @generated
   * @ordered
   */
  public static final int X86_VALUE = 0;

  /**
   * The '<em><b>Arm64</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ARM64
   * @model name="arm64"
   * @generated
   * @ordered
   */
  public static final int ARM64_VALUE = 0;

  /**
   * The '<em><b>Arm64v8</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ARM64V8
   * @model name="arm64v8"
   * @generated
   * @ordered
   */
  public static final int ARM64V8_VALUE = 0;

  /**
   * The '<em><b>Arm32</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #ARM32
   * @model name="arm32"
   * @generated
   * @ordered
   */
  public static final int ARM32_VALUE = 0;

  /**
   * An array of all the '<em><b>Processor Architecture Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ProcessorArchitectureType[] VALUES_ARRAY = new ProcessorArchitectureType[] { X86, ARM64,
      ARM64V8, ARM32, };

  /**
   * A public read-only list of all the '<em><b>Processor Architecture Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ProcessorArchitectureType> VALUES = Collections
      .unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Processor Architecture Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ProcessorArchitectureType get(String literal) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      ProcessorArchitectureType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Processor Architecture Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ProcessorArchitectureType getByName(String name) {
    for (int i = 0; i < VALUES_ARRAY.length; ++i) {
      ProcessorArchitectureType result = VALUES_ARRAY[i];
      if (result.getName().equals(name)) {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Processor Architecture Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static ProcessorArchitectureType get(int value) {
    switch (value) {
    case X86_VALUE:
      return X86;
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
  private ProcessorArchitectureType(int value, String name, String literal) {
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

} //ProcessorArchitectureType
