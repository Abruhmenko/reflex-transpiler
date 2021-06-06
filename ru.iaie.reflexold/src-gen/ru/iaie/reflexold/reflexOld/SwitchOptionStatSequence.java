/**
 * generated by Xtext 2.25.0
 */
package ru.iaie.reflexold.reflexOld;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Option Stat Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflexold.reflexOld.SwitchOptionStatSequence#getStatements <em>Statements</em>}</li>
 *   <li>{@link ru.iaie.reflexold.reflexOld.SwitchOptionStatSequence#isHasBreak <em>Has Break</em>}</li>
 * </ul>
 *
 * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getSwitchOptionStatSequence()
 * @model
 * @generated
 */
public interface SwitchOptionStatSequence extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link ru.iaie.reflexold.reflexOld.Statement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getSwitchOptionStatSequence_Statements()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatements();

  /**
   * Returns the value of the '<em><b>Has Break</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Has Break</em>' attribute.
   * @see #setHasBreak(boolean)
   * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getSwitchOptionStatSequence_HasBreak()
   * @model
   * @generated
   */
  boolean isHasBreak();

  /**
   * Sets the value of the '{@link ru.iaie.reflexold.reflexOld.SwitchOptionStatSequence#isHasBreak <em>Has Break</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Has Break</em>' attribute.
   * @see #isHasBreak()
   * @generated
   */
  void setHasBreak(boolean value);

} // SwitchOptionStatSequence
