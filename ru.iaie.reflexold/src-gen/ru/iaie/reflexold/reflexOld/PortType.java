/**
 * generated by Xtext 2.25.0
 */
package ru.iaie.reflexold.reflexOld;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Port Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getPortType()
 * @model
 * @generated
 */
public enum PortType implements Enumerator
{
  /**
   * The '<em><b>INPUT EN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INPUT_EN_VALUE
   * @generated
   * @ordered
   */
  INPUT_EN(0, "INPUT_EN", "INPUT"),

  /**
   * The '<em><b>INPUT RU</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INPUT_RU_VALUE
   * @generated
   * @ordered
   */
  INPUT_RU(1, "INPUT_RU", "\u0412\u0425\u041e\u0414"),

  /**
   * The '<em><b>OUTPUT EN</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OUTPUT_EN_VALUE
   * @generated
   * @ordered
   */
  OUTPUT_EN(2, "OUTPUT_EN", "OUTPUT"),

  /**
   * The '<em><b>OUTPUT RU</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OUTPUT_RU_VALUE
   * @generated
   * @ordered
   */
  OUTPUT_RU(3, "OUTPUT_RU", "\u0412\u042b\u0425\u041e\u0414");

  /**
   * The '<em><b>INPUT EN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INPUT_EN
   * @model literal="INPUT"
   * @generated
   * @ordered
   */
  public static final int INPUT_EN_VALUE = 0;

  /**
   * The '<em><b>INPUT RU</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #INPUT_RU
   * @model literal="\u0412\u0425\u041e\u0414"
   * @generated
   * @ordered
   */
  public static final int INPUT_RU_VALUE = 1;

  /**
   * The '<em><b>OUTPUT EN</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OUTPUT_EN
   * @model literal="OUTPUT"
   * @generated
   * @ordered
   */
  public static final int OUTPUT_EN_VALUE = 2;

  /**
   * The '<em><b>OUTPUT RU</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OUTPUT_RU
   * @model literal="\u0412\u042b\u0425\u041e\u0414"
   * @generated
   * @ordered
   */
  public static final int OUTPUT_RU_VALUE = 3;

  /**
   * An array of all the '<em><b>Port Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final PortType[] VALUES_ARRAY =
    new PortType[]
    {
      INPUT_EN,
      INPUT_RU,
      OUTPUT_EN,
      OUTPUT_RU,
    };

  /**
   * A public read-only list of all the '<em><b>Port Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<PortType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Port Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PortType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PortType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Port Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PortType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      PortType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Port Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static PortType get(int value)
  {
    switch (value)
    {
      case INPUT_EN_VALUE: return INPUT_EN;
      case INPUT_RU_VALUE: return INPUT_RU;
      case OUTPUT_EN_VALUE: return OUTPUT_EN;
      case OUTPUT_RU_VALUE: return OUTPUT_RU;
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
  private PortType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //PortType
