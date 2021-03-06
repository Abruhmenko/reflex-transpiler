/**
 * generated by Xtext 2.25.0
 */
package ru.iaie.reflexold.reflexOld;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflexold.reflexOld.Program#isEn <em>En</em>}</li>
 *   <li>{@link ru.iaie.reflexold.reflexOld.Program#getName <em>Name</em>}</li>
 *   <li>{@link ru.iaie.reflexold.reflexOld.Program#getClock <em>Clock</em>}</li>
 *   <li>{@link ru.iaie.reflexold.reflexOld.Program#getConsts <em>Consts</em>}</li>
 *   <li>{@link ru.iaie.reflexold.reflexOld.Program#getEnums <em>Enums</em>}</li>
 *   <li>{@link ru.iaie.reflexold.reflexOld.Program#getFunctions <em>Functions</em>}</li>
 *   <li>{@link ru.iaie.reflexold.reflexOld.Program#getPorts <em>Ports</em>}</li>
 *   <li>{@link ru.iaie.reflexold.reflexOld.Program#getProcesses <em>Processes</em>}</li>
 * </ul>
 *
 * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject
{
  /**
   * Returns the value of the '<em><b>En</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>En</em>' attribute.
   * @see #setEn(boolean)
   * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getProgram_En()
   * @model
   * @generated
   */
  boolean isEn();

  /**
   * Sets the value of the '{@link ru.iaie.reflexold.reflexOld.Program#isEn <em>En</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>En</em>' attribute.
   * @see #isEn()
   * @generated
   */
  void setEn(boolean value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getProgram_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ru.iaie.reflexold.reflexOld.Program#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Clock</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Clock</em>' containment reference.
   * @see #setClock(ClockDefinition)
   * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getProgram_Clock()
   * @model containment="true"
   * @generated
   */
  ClockDefinition getClock();

  /**
   * Sets the value of the '{@link ru.iaie.reflexold.reflexOld.Program#getClock <em>Clock</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Clock</em>' containment reference.
   * @see #getClock()
   * @generated
   */
  void setClock(ClockDefinition value);

  /**
   * Returns the value of the '<em><b>Consts</b></em>' containment reference list.
   * The list contents are of type {@link ru.iaie.reflexold.reflexOld.Const}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Consts</em>' containment reference list.
   * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getProgram_Consts()
   * @model containment="true"
   * @generated
   */
  EList<Const> getConsts();

  /**
   * Returns the value of the '<em><b>Enums</b></em>' containment reference list.
   * The list contents are of type {@link ru.iaie.reflexold.reflexOld.Enum}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enums</em>' containment reference list.
   * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getProgram_Enums()
   * @model containment="true"
   * @generated
   */
  EList<ru.iaie.reflexold.reflexOld.Enum> getEnums();

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link ru.iaie.reflexold.reflexOld.Function}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getProgram_Functions()
   * @model containment="true"
   * @generated
   */
  EList<Function> getFunctions();

  /**
   * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
   * The list contents are of type {@link ru.iaie.reflexold.reflexOld.Port}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ports</em>' containment reference list.
   * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getProgram_Ports()
   * @model containment="true"
   * @generated
   */
  EList<Port> getPorts();

  /**
   * Returns the value of the '<em><b>Processes</b></em>' containment reference list.
   * The list contents are of type {@link ru.iaie.reflexold.reflexOld.Process}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Processes</em>' containment reference list.
   * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getProgram_Processes()
   * @model containment="true"
   * @generated
   */
  EList<ru.iaie.reflexold.reflexOld.Process> getProcesses();

} // Program
