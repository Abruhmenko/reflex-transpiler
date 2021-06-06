/**
 * generated by Xtext 2.25.0
 */
package ru.iaie.reflexold.reflexOld.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ru.iaie.reflexold.reflexOld.AssignOperator;
import ru.iaie.reflexold.reflexOld.AssignmentExpression;
import ru.iaie.reflexold.reflexOld.IdReference;
import ru.iaie.reflexold.reflexOld.LogicalOrExpression;
import ru.iaie.reflexold.reflexOld.ReflexOldPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflexold.reflexOld.impl.AssignmentExpressionImpl#getAssignVar <em>Assign Var</em>}</li>
 *   <li>{@link ru.iaie.reflexold.reflexOld.impl.AssignmentExpressionImpl#getAssignOp <em>Assign Op</em>}</li>
 *   <li>{@link ru.iaie.reflexold.reflexOld.impl.AssignmentExpressionImpl#getExpr <em>Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentExpressionImpl extends ExpressionImpl implements AssignmentExpression
{
  /**
   * The cached value of the '{@link #getAssignVar() <em>Assign Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignVar()
   * @generated
   * @ordered
   */
  protected IdReference assignVar;

  /**
   * The default value of the '{@link #getAssignOp() <em>Assign Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignOp()
   * @generated
   * @ordered
   */
  protected static final AssignOperator ASSIGN_OP_EDEFAULT = AssignOperator.ASSIGN;

  /**
   * The cached value of the '{@link #getAssignOp() <em>Assign Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignOp()
   * @generated
   * @ordered
   */
  protected AssignOperator assignOp = ASSIGN_OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getExpr() <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpr()
   * @generated
   * @ordered
   */
  protected LogicalOrExpression expr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssignmentExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ReflexOldPackage.Literals.ASSIGNMENT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IdReference getAssignVar()
  {
    if (assignVar != null && assignVar.eIsProxy())
    {
      InternalEObject oldAssignVar = (InternalEObject)assignVar;
      assignVar = (IdReference)eResolveProxy(oldAssignVar);
      if (assignVar != oldAssignVar)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReflexOldPackage.ASSIGNMENT_EXPRESSION__ASSIGN_VAR, oldAssignVar, assignVar));
      }
    }
    return assignVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdReference basicGetAssignVar()
  {
    return assignVar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAssignVar(IdReference newAssignVar)
  {
    IdReference oldAssignVar = assignVar;
    assignVar = newAssignVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReflexOldPackage.ASSIGNMENT_EXPRESSION__ASSIGN_VAR, oldAssignVar, assignVar));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AssignOperator getAssignOp()
  {
    return assignOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAssignOp(AssignOperator newAssignOp)
  {
    AssignOperator oldAssignOp = assignOp;
    assignOp = newAssignOp == null ? ASSIGN_OP_EDEFAULT : newAssignOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReflexOldPackage.ASSIGNMENT_EXPRESSION__ASSIGN_OP, oldAssignOp, assignOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LogicalOrExpression getExpr()
  {
    return expr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpr(LogicalOrExpression newExpr, NotificationChain msgs)
  {
    LogicalOrExpression oldExpr = expr;
    expr = newExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReflexOldPackage.ASSIGNMENT_EXPRESSION__EXPR, oldExpr, newExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExpr(LogicalOrExpression newExpr)
  {
    if (newExpr != expr)
    {
      NotificationChain msgs = null;
      if (expr != null)
        msgs = ((InternalEObject)expr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReflexOldPackage.ASSIGNMENT_EXPRESSION__EXPR, null, msgs);
      if (newExpr != null)
        msgs = ((InternalEObject)newExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReflexOldPackage.ASSIGNMENT_EXPRESSION__EXPR, null, msgs);
      msgs = basicSetExpr(newExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReflexOldPackage.ASSIGNMENT_EXPRESSION__EXPR, newExpr, newExpr));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ReflexOldPackage.ASSIGNMENT_EXPRESSION__EXPR:
        return basicSetExpr(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ReflexOldPackage.ASSIGNMENT_EXPRESSION__ASSIGN_VAR:
        if (resolve) return getAssignVar();
        return basicGetAssignVar();
      case ReflexOldPackage.ASSIGNMENT_EXPRESSION__ASSIGN_OP:
        return getAssignOp();
      case ReflexOldPackage.ASSIGNMENT_EXPRESSION__EXPR:
        return getExpr();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ReflexOldPackage.ASSIGNMENT_EXPRESSION__ASSIGN_VAR:
        setAssignVar((IdReference)newValue);
        return;
      case ReflexOldPackage.ASSIGNMENT_EXPRESSION__ASSIGN_OP:
        setAssignOp((AssignOperator)newValue);
        return;
      case ReflexOldPackage.ASSIGNMENT_EXPRESSION__EXPR:
        setExpr((LogicalOrExpression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ReflexOldPackage.ASSIGNMENT_EXPRESSION__ASSIGN_VAR:
        setAssignVar((IdReference)null);
        return;
      case ReflexOldPackage.ASSIGNMENT_EXPRESSION__ASSIGN_OP:
        setAssignOp(ASSIGN_OP_EDEFAULT);
        return;
      case ReflexOldPackage.ASSIGNMENT_EXPRESSION__EXPR:
        setExpr((LogicalOrExpression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ReflexOldPackage.ASSIGNMENT_EXPRESSION__ASSIGN_VAR:
        return assignVar != null;
      case ReflexOldPackage.ASSIGNMENT_EXPRESSION__ASSIGN_OP:
        return assignOp != ASSIGN_OP_EDEFAULT;
      case ReflexOldPackage.ASSIGNMENT_EXPRESSION__EXPR:
        return expr != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (assignOp: ");
    result.append(assignOp);
    result.append(')');
    return result.toString();
  }

} //AssignmentExpressionImpl