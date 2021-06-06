/**
 * generated by Xtext 2.25.0
 */
package ru.iaie.reflexold.reflexOld;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicative Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflexold.reflexOld.MultiplicativeExpression#getMulOp <em>Mul Op</em>}</li>
 * </ul>
 *
 * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getMultiplicativeExpression()
 * @model
 * @generated
 */
public interface MultiplicativeExpression extends AdditiveExpression
{
  /**
   * Returns the value of the '<em><b>Mul Op</b></em>' attribute.
   * The literals are from the enumeration {@link ru.iaie.reflexold.reflexOld.MultiplicativeOp}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mul Op</em>' attribute.
   * @see ru.iaie.reflexold.reflexOld.MultiplicativeOp
   * @see #setMulOp(MultiplicativeOp)
   * @see ru.iaie.reflexold.reflexOld.ReflexOldPackage#getMultiplicativeExpression_MulOp()
   * @model
   * @generated
   */
  MultiplicativeOp getMulOp();

  /**
   * Sets the value of the '{@link ru.iaie.reflexold.reflexOld.MultiplicativeExpression#getMulOp <em>Mul Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mul Op</em>' attribute.
   * @see ru.iaie.reflexold.reflexOld.MultiplicativeOp
   * @see #getMulOp()
   * @generated
   */
  void setMulOp(MultiplicativeOp value);

} // MultiplicativeExpression
