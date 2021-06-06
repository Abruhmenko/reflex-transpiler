/**
 * generated by Xtext 2.25.0
 */
package ru.iaie.reflexold.reflexOld;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflexold.reflexOld.Port#getType <em>Type</em>}</li>
 *   <li>{@link ru.iaie.reflexold.reflexOld.Port#getName <em>Name</em>}</li>
 *   <li>{@link ru.iaie.reflexold.reflexOld.Port#getAddr1 <em>Addr1</em>}</li>
 *   <li>{@link ru.iaie.reflexold.reflexOld.Port#getAddr2 <em>Addr2</em>}</li>
 *   <li>{@link ru.iaie.reflexold.reflexOld.Port#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link ru.iaie.reflexold.reflexOld.PortType}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see ru.iaie.reflexold.reflexOld.PortType
   * @see #setType(PortType)
   * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getPort_Type()
   * @model
   * @generated
   */
  PortType getType();

  /**
   * Sets the value of the '{@link ru.iaie.reflexold.reflexOld.Port#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see ru.iaie.reflexold.reflexOld.PortType
   * @see #getType()
   * @generated
   */
  void setType(PortType value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getPort_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ru.iaie.reflexold.reflexOld.Port#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Addr1</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Addr1</em>' attribute.
   * @see #setAddr1(String)
   * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getPort_Addr1()
   * @model
   * @generated
   */
  String getAddr1();

  /**
   * Sets the value of the '{@link ru.iaie.reflexold.reflexOld.Port#getAddr1 <em>Addr1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Addr1</em>' attribute.
   * @see #getAddr1()
   * @generated
   */
  void setAddr1(String value);

  /**
   * Returns the value of the '<em><b>Addr2</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Addr2</em>' attribute.
   * @see #setAddr2(String)
   * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getPort_Addr2()
   * @model
   * @generated
   */
  String getAddr2();

  /**
   * Sets the value of the '{@link ru.iaie.reflexold.reflexOld.Port#getAddr2 <em>Addr2</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Addr2</em>' attribute.
   * @see #getAddr2()
   * @generated
   */
  void setAddr2(String value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see #setSize(String)
   * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getPort_Size()
   * @model
   * @generated
   */
  String getSize();

  /**
   * Sets the value of the '{@link ru.iaie.reflexold.reflexOld.Port#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
  void setSize(String value);

} // Port
