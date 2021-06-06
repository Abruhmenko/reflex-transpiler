/**
 * generated by Xtext 2.25.0
 */
package ru.iaie.reflexold.reflexOld;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflexold.reflexOld.State#getName <em>Name</em>}</li>
 *   <li>{@link ru.iaie.reflexold.reflexOld.State#getStateFunction <em>State Function</em>}</li>
 *   <li>{@link ru.iaie.reflexold.reflexOld.State#getTimeoutFunction <em>Timeout Function</em>}</li>
 * </ul>
 *
 * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getState_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ru.iaie.reflexold.reflexOld.State#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>State Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>State Function</em>' containment reference.
   * @see #setStateFunction(StatementSequence)
   * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getState_StateFunction()
   * @model containment="true"
   * @generated
   */
  StatementSequence getStateFunction();

  /**
   * Sets the value of the '{@link ru.iaie.reflexold.reflexOld.State#getStateFunction <em>State Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State Function</em>' containment reference.
   * @see #getStateFunction()
   * @generated
   */
  void setStateFunction(StatementSequence value);

  /**
   * Returns the value of the '<em><b>Timeout Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Timeout Function</em>' containment reference.
   * @see #setTimeoutFunction(TimeoutFunction)
   * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getState_TimeoutFunction()
   * @model containment="true"
   * @generated
   */
  TimeoutFunction getTimeoutFunction();

  /**
   * Sets the value of the '{@link ru.iaie.reflexold.reflexOld.State#getTimeoutFunction <em>Timeout Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Timeout Function</em>' containment reference.
   * @see #getTimeoutFunction()
   * @generated
   */
  void setTimeoutFunction(TimeoutFunction value);

} // State
