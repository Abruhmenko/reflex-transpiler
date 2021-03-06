/**
 * generated by Xtext 2.25.0
 */
package ru.iaie.reflexold.reflexOld;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shift Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflexold.reflexOld.ShiftExpression#getShiftOp <em>Shift Op</em>}</li>
 * </ul>
 *
 * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getShiftExpression()
 * @model
 * @generated
 */
public interface ShiftExpression extends CompareExpression
{
  /**
   * Returns the value of the '<em><b>Shift Op</b></em>' attribute.
   * The literals are from the enumeration {@link ru.iaie.reflexold.reflexOld.ShiftOp}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shift Op</em>' attribute.
   * @see ru.iaie.reflexold.reflexOld.ShiftOp
   * @see #setShiftOp(ShiftOp)
   * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getShiftExpression_ShiftOp()
   * @model
   * @generated
   */
  ShiftOp getShiftOp();

  /**
   * Sets the value of the '{@link ru.iaie.reflexold.reflexOld.ShiftExpression#getShiftOp <em>Shift Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shift Op</em>' attribute.
   * @see ru.iaie.reflexold.reflexOld.ShiftOp
   * @see #getShiftOp()
   * @generated
   */
  void setShiftOp(ShiftOp value);

} // ShiftExpression
