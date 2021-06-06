/**
 * generated by Xtext 2.25.0
 */
package ru.iaie.reflexold.reflexOld;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imported Variable List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflexold.reflexOld.ImportedVariableList#getProcess <em>Process</em>}</li>
 *   <li>{@link ru.iaie.reflexold.reflexOld.ImportedVariableList#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getImportedVariableList()
 * @model
 * @generated
 */
public interface ImportedVariableList extends EObject
{
  /**
   * Returns the value of the '<em><b>Process</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Process</em>' reference.
   * @see #setProcess(ru.iaie.reflexold.reflexOld.Process)
   * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getImportedVariableList_Process()
   * @model
   * @generated
   */
  ru.iaie.reflexold.reflexOld.Process getProcess();

  /**
   * Sets the value of the '{@link ru.iaie.reflexold.reflexOld.ImportedVariableList#getProcess <em>Process</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Process</em>' reference.
   * @see #getProcess()
   * @generated
   */
  void setProcess(ru.iaie.reflexold.reflexOld.Process value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' reference list.
   * The list contents are of type {@link ru.iaie.reflexold.reflexOld.ProcessVariable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' reference list.
   * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getImportedVariableList_Variables()
   * @model
   * @generated
   */
  EList<ProcessVariable> getVariables();

} // ImportedVariableList