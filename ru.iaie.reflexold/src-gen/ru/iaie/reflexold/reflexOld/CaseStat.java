/**
 * generated by Xtext 2.25.0
 */
package ru.iaie.reflexold.reflexOld;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Stat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflexold.reflexOld.CaseStat#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getCaseStat()
 * @model
 * @generated
 */
public interface CaseStat extends SwitchOptionStatSequence
{
  /**
   * Returns the value of the '<em><b>Option</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Option</em>' containment reference.
   * @see #setOption(Expression)
   * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getCaseStat_Option()
   * @model containment="true"
   * @generated
   */
  Expression getOption();

  /**
   * Sets the value of the '{@link ru.iaie.reflexold.reflexOld.CaseStat#getOption <em>Option</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Option</em>' containment reference.
   * @see #getOption()
   * @generated
   */
  void setOption(Expression value);

} // CaseStat
