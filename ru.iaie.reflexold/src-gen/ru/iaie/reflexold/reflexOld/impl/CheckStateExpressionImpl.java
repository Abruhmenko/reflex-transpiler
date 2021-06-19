/**
 * generated by Xtext 2.25.0
 */
package ru.iaie.reflexold.reflexOld.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ru.iaie.reflexold.reflexOld.CheckStateExpression;
import ru.iaie.reflexold.reflexOld.ReflexOldPackage;
import ru.iaie.reflexold.reflexOld.StateQualifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Check State Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflexold.reflexOld.impl.CheckStateExpressionImpl#isLogicalNot <em>Logical Not</em>}</li>
 *   <li>{@link ru.iaie.reflexold.reflexOld.impl.CheckStateExpressionImpl#getProcess <em>Process</em>}</li>
 *   <li>{@link ru.iaie.reflexold.reflexOld.impl.CheckStateExpressionImpl#getQualfier <em>Qualfier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckStateExpressionImpl extends CompareExpressionImpl implements CheckStateExpression
{
  /**
   * The default value of the '{@link #isLogicalNot() <em>Logical Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLogicalNot()
   * @generated
   * @ordered
   */
  protected static final boolean LOGICAL_NOT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isLogicalNot() <em>Logical Not</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isLogicalNot()
   * @generated
   * @ordered
   */
  protected boolean logicalNot = LOGICAL_NOT_EDEFAULT;

  /**
   * The cached value of the '{@link #getProcess() <em>Process</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcess()
   * @generated
   * @ordered
   */
  protected ru.iaie.reflexold.reflexOld.Process process;

  /**
   * The default value of the '{@link #getQualfier() <em>Qualfier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualfier()
   * @generated
   * @ordered
   */
  protected static final StateQualifier QUALFIER_EDEFAULT = StateQualifier.ACTIVE_EN;

  /**
   * The cached value of the '{@link #getQualfier() <em>Qualfier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualfier()
   * @generated
   * @ordered
   */
  protected StateQualifier qualfier = QUALFIER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CheckStateExpressionImpl()
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
    return ReflexOldPackage.Literals.CHECK_STATE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isLogicalNot()
  {
    return logicalNot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLogicalNot(boolean newLogicalNot)
  {
    boolean oldLogicalNot = logicalNot;
    logicalNot = newLogicalNot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReflexOldPackage.CHECK_STATE_EXPRESSION__LOGICAL_NOT, oldLogicalNot, logicalNot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ru.iaie.reflexold.reflexOld.Process getProcess()
  {
    if (process != null && process.eIsProxy())
    {
      InternalEObject oldProcess = (InternalEObject)process;
      process = (ru.iaie.reflexold.reflexOld.Process)eResolveProxy(oldProcess);
      if (process != oldProcess)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReflexOldPackage.CHECK_STATE_EXPRESSION__PROCESS, oldProcess, process));
      }
    }
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ru.iaie.reflexold.reflexOld.Process basicGetProcess()
  {
    return process;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProcess(ru.iaie.reflexold.reflexOld.Process newProcess)
  {
    ru.iaie.reflexold.reflexOld.Process oldProcess = process;
    process = newProcess;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReflexOldPackage.CHECK_STATE_EXPRESSION__PROCESS, oldProcess, process));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StateQualifier getQualfier()
  {
    return qualfier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setQualfier(StateQualifier newQualfier)
  {
    StateQualifier oldQualfier = qualfier;
    qualfier = newQualfier == null ? QUALFIER_EDEFAULT : newQualfier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ReflexOldPackage.CHECK_STATE_EXPRESSION__QUALFIER, oldQualfier, qualfier));
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
      case ReflexOldPackage.CHECK_STATE_EXPRESSION__LOGICAL_NOT:
        return isLogicalNot();
      case ReflexOldPackage.CHECK_STATE_EXPRESSION__PROCESS:
        if (resolve) return getProcess();
        return basicGetProcess();
      case ReflexOldPackage.CHECK_STATE_EXPRESSION__QUALFIER:
        return getQualfier();
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
      case ReflexOldPackage.CHECK_STATE_EXPRESSION__LOGICAL_NOT:
        setLogicalNot((Boolean)newValue);
        return;
      case ReflexOldPackage.CHECK_STATE_EXPRESSION__PROCESS:
        setProcess((ru.iaie.reflexold.reflexOld.Process)newValue);
        return;
      case ReflexOldPackage.CHECK_STATE_EXPRESSION__QUALFIER:
        setQualfier((StateQualifier)newValue);
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
      case ReflexOldPackage.CHECK_STATE_EXPRESSION__LOGICAL_NOT:
        setLogicalNot(LOGICAL_NOT_EDEFAULT);
        return;
      case ReflexOldPackage.CHECK_STATE_EXPRESSION__PROCESS:
        setProcess((ru.iaie.reflexold.reflexOld.Process)null);
        return;
      case ReflexOldPackage.CHECK_STATE_EXPRESSION__QUALFIER:
        setQualfier(QUALFIER_EDEFAULT);
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
      case ReflexOldPackage.CHECK_STATE_EXPRESSION__LOGICAL_NOT:
        return logicalNot != LOGICAL_NOT_EDEFAULT;
      case ReflexOldPackage.CHECK_STATE_EXPRESSION__PROCESS:
        return process != null;
      case ReflexOldPackage.CHECK_STATE_EXPRESSION__QUALFIER:
        return qualfier != QUALFIER_EDEFAULT;
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
    result.append(" (logicalNot: ");
    result.append(logicalNot);
    result.append(", qualfier: ");
    result.append(qualfier);
    result.append(')');
    return result.toString();
  }

} //CheckStateExpressionImpl
