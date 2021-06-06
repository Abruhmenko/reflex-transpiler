/**
 * generated by Xtext 2.25.0
 */
package ru.iaie.reflexold.reflexOld.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ru.iaie.reflexold.reflexOld.IdReference;
import ru.iaie.reflexold.reflexOld.InfixOp;
import ru.iaie.reflexold.reflexOld.InfixPostfixOp;
import ru.iaie.reflexold.reflexOld.ReflexOldPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Infix Op</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflexold.reflexOld.impl.InfixOpImpl#getOp <em>Op</em>}</li>
 *   <li>{@link ru.iaie.reflexold.reflexOld.impl.InfixOpImpl#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InfixOpImpl extends UnaryExpressionImpl implements InfixOp
{
  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final InfixPostfixOp OP_EDEFAULT = InfixPostfixOp.INC;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected InfixPostfixOp op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected IdReference ref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InfixOpImpl()
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
    return ReflexOldPackage.Literals.INFIX_OP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InfixPostfixOp getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOp(InfixPostfixOp newOp)
  {
    InfixPostfixOp oldOp = op;
    op = newOp == null ? OP_EDEFAULT : newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReflexOldPackage.INFIX_OP__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IdReference getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (IdReference)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReflexOldPackage.INFIX_OP__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IdReference basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRef(IdReference newRef)
  {
    IdReference oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReflexOldPackage.INFIX_OP__REF, oldRef, ref));
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
      case ReflexOldPackage.INFIX_OP__OP:
        return getOp();
      case ReflexOldPackage.INFIX_OP__REF:
        if (resolve) return getRef();
        return basicGetRef();
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
      case ReflexOldPackage.INFIX_OP__OP:
        setOp((InfixPostfixOp)newValue);
        return;
      case ReflexOldPackage.INFIX_OP__REF:
        setRef((IdReference)newValue);
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
      case ReflexOldPackage.INFIX_OP__OP:
        setOp(OP_EDEFAULT);
        return;
      case ReflexOldPackage.INFIX_OP__REF:
        setRef((IdReference)null);
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
      case ReflexOldPackage.INFIX_OP__OP:
        return op != OP_EDEFAULT;
      case ReflexOldPackage.INFIX_OP__REF:
        return ref != null;
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
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //InfixOpImpl