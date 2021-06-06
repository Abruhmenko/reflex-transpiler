/**
 * generated by Xtext 2.25.0
 */
package ru.iaie.reflexold.reflexOld.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ru.iaie.reflexold.reflexOld.ReflexOldPackage;
import ru.iaie.reflexold.reflexOld.StopProcStat;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stop Proc Stat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ru.iaie.reflexold.reflexOld.impl.StopProcStatImpl#getProcess <em>Process</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StopProcStatImpl extends StatementImpl implements StopProcStat
{
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StopProcStatImpl()
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
    return ReflexOldPackage.Literals.STOP_PROC_STAT;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ReflexOldPackage.STOP_PROC_STAT__PROCESS, oldProcess, process));
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
      eNotify(new ENotificationImpl(this, Notification.SET, ReflexOldPackage.STOP_PROC_STAT__PROCESS, oldProcess, process));
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
      case ReflexOldPackage.STOP_PROC_STAT__PROCESS:
        if (resolve) return getProcess();
        return basicGetProcess();
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
      case ReflexOldPackage.STOP_PROC_STAT__PROCESS:
        setProcess((ru.iaie.reflexold.reflexOld.Process)newValue);
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
      case ReflexOldPackage.STOP_PROC_STAT__PROCESS:
        setProcess((ru.iaie.reflexold.reflexOld.Process)null);
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
      case ReflexOldPackage.STOP_PROC_STAT__PROCESS:
        return process != null;
    }
    return super.eIsSet(featureID);
  }

} //StopProcStatImpl
