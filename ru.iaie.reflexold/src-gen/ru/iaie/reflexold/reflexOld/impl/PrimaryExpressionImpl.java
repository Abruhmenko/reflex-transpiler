/**
 * generated by Xtext 2.25.0
 */
package ru.iaie.reflexold.reflexOld.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ru.iaie.reflexold.reflexOld.Expression;
import ru.iaie.reflexold.reflexOld.IdReference;
import ru.iaie.reflexold.reflexOld.PrimaryExpression;
import ru.iaie.reflexold.reflexOld.ReflexOldPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflexold.reflexOld.impl.PrimaryExpressionImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link ru.iaie.reflexold.reflexOld.impl.PrimaryExpressionImpl#getInteger <em>Integer</em>}</li>
 *   <li>{@link ru.iaie.reflexold.reflexOld.impl.PrimaryExpressionImpl#getFloating <em>Floating</em>}</li>
 *   <li>{@link ru.iaie.reflexold.reflexOld.impl.PrimaryExpressionImpl#getBool <em>Bool</em>}</li>
 *   <li>{@link ru.iaie.reflexold.reflexOld.impl.PrimaryExpressionImpl#getNestedExpr <em>Nested Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimaryExpressionImpl extends UnaryExpressionImpl implements PrimaryExpression
{
  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected IdReference reference;

  /**
   * The default value of the '{@link #getInteger() <em>Integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteger()
   * @generated
   * @ordered
   */
  protected static final String INTEGER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInteger() <em>Integer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteger()
   * @generated
   * @ordered
   */
  protected String integer = INTEGER_EDEFAULT;

  /**
   * The default value of the '{@link #getFloating() <em>Floating</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFloating()
   * @generated
   * @ordered
   */
  protected static final String FLOATING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFloating() <em>Floating</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFloating()
   * @generated
   * @ordered
   */
  protected String floating = FLOATING_EDEFAULT;

  /**
   * The default value of the '{@link #getBool() <em>Bool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBool()
   * @generated
   * @ordered
   */
  protected static final Boolean BOOL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBool() <em>Bool</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBool()
   * @generated
   * @ordered
   */
  protected Boolean bool = BOOL_EDEFAULT;

  /**
   * The cached value of the '{@link #getNestedExpr() <em>Nested Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNestedExpr()
   * @generated
   * @ordered
   */
  protected Expression nestedExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimaryExpressionImpl()
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
    return ReflexOldPackage.Literals.PRIMARY_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IdReference getReference()
  {
    if (reference != null && reference.eIsProxy())
    {
      InternalEObject oldReference = (InternalEObject)reference;
      reference = (IdReference)eResolveProxy(oldReference);
      if (reference != oldReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReflexOldPackage.PRIMARY_EXPRESSION__REFERENCE, oldReference, reference));
      }
    }
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdReference basicGetReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReference(IdReference newReference)
  {
    IdReference oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReflexOldPackage.PRIMARY_EXPRESSION__REFERENCE, oldReference, reference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getInteger()
  {
    return integer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInteger(String newInteger)
  {
    String oldInteger = integer;
    integer = newInteger;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReflexOldPackage.PRIMARY_EXPRESSION__INTEGER, oldInteger, integer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFloating()
  {
    return floating;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFloating(String newFloating)
  {
    String oldFloating = floating;
    floating = newFloating;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReflexOldPackage.PRIMARY_EXPRESSION__FLOATING, oldFloating, floating));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Boolean getBool()
  {
    return bool;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBool(Boolean newBool)
  {
    Boolean oldBool = bool;
    bool = newBool;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReflexOldPackage.PRIMARY_EXPRESSION__BOOL, oldBool, bool));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getNestedExpr()
  {
    return nestedExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNestedExpr(Expression newNestedExpr, NotificationChain msgs)
  {
    Expression oldNestedExpr = nestedExpr;
    nestedExpr = newNestedExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReflexOldPackage.PRIMARY_EXPRESSION__NESTED_EXPR, oldNestedExpr, newNestedExpr);
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
  public void setNestedExpr(Expression newNestedExpr)
  {
    if (newNestedExpr != nestedExpr)
    {
      NotificationChain msgs = null;
      if (nestedExpr != null)
        msgs = ((InternalEObject)nestedExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReflexOldPackage.PRIMARY_EXPRESSION__NESTED_EXPR, null, msgs);
      if (newNestedExpr != null)
        msgs = ((InternalEObject)newNestedExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReflexOldPackage.PRIMARY_EXPRESSION__NESTED_EXPR, null, msgs);
      msgs = basicSetNestedExpr(newNestedExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReflexOldPackage.PRIMARY_EXPRESSION__NESTED_EXPR, newNestedExpr, newNestedExpr));
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
      case ReflexOldPackage.PRIMARY_EXPRESSION__NESTED_EXPR:
        return basicSetNestedExpr(null, msgs);
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
      case ReflexOldPackage.PRIMARY_EXPRESSION__REFERENCE:
        if (resolve) return getReference();
        return basicGetReference();
      case ReflexOldPackage.PRIMARY_EXPRESSION__INTEGER:
        return getInteger();
      case ReflexOldPackage.PRIMARY_EXPRESSION__FLOATING:
        return getFloating();
      case ReflexOldPackage.PRIMARY_EXPRESSION__BOOL:
        return getBool();
      case ReflexOldPackage.PRIMARY_EXPRESSION__NESTED_EXPR:
        return getNestedExpr();
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
      case ReflexOldPackage.PRIMARY_EXPRESSION__REFERENCE:
        setReference((IdReference)newValue);
        return;
      case ReflexOldPackage.PRIMARY_EXPRESSION__INTEGER:
        setInteger((String)newValue);
        return;
      case ReflexOldPackage.PRIMARY_EXPRESSION__FLOATING:
        setFloating((String)newValue);
        return;
      case ReflexOldPackage.PRIMARY_EXPRESSION__BOOL:
        setBool((Boolean)newValue);
        return;
      case ReflexOldPackage.PRIMARY_EXPRESSION__NESTED_EXPR:
        setNestedExpr((Expression)newValue);
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
      case ReflexOldPackage.PRIMARY_EXPRESSION__REFERENCE:
        setReference((IdReference)null);
        return;
      case ReflexOldPackage.PRIMARY_EXPRESSION__INTEGER:
        setInteger(INTEGER_EDEFAULT);
        return;
      case ReflexOldPackage.PRIMARY_EXPRESSION__FLOATING:
        setFloating(FLOATING_EDEFAULT);
        return;
      case ReflexOldPackage.PRIMARY_EXPRESSION__BOOL:
        setBool(BOOL_EDEFAULT);
        return;
      case ReflexOldPackage.PRIMARY_EXPRESSION__NESTED_EXPR:
        setNestedExpr((Expression)null);
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
      case ReflexOldPackage.PRIMARY_EXPRESSION__REFERENCE:
        return reference != null;
      case ReflexOldPackage.PRIMARY_EXPRESSION__INTEGER:
        return INTEGER_EDEFAULT == null ? integer != null : !INTEGER_EDEFAULT.equals(integer);
      case ReflexOldPackage.PRIMARY_EXPRESSION__FLOATING:
        return FLOATING_EDEFAULT == null ? floating != null : !FLOATING_EDEFAULT.equals(floating);
      case ReflexOldPackage.PRIMARY_EXPRESSION__BOOL:
        return BOOL_EDEFAULT == null ? bool != null : !BOOL_EDEFAULT.equals(bool);
      case ReflexOldPackage.PRIMARY_EXPRESSION__NESTED_EXPR:
        return nestedExpr != null;
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
    result.append(" (integer: ");
    result.append(integer);
    result.append(", floating: ");
    result.append(floating);
    result.append(", bool: ");
    result.append(bool);
    result.append(')');
    return result.toString();
  }

} //PrimaryExpressionImpl