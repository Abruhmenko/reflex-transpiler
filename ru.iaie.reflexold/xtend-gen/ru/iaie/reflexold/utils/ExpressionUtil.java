package ru.iaie.reflexold.utils;

import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import ru.iaie.reflexold.reflexOld.AssignmentExpression;
import ru.iaie.reflexold.reflexOld.Expression;
import ru.iaie.reflexold.reflexOld.FunctionCall;
import ru.iaie.reflexold.reflexOld.IdReference;
import ru.iaie.reflexold.reflexOld.PhysicalVariable;
import ru.iaie.reflexold.reflexOld.PrimaryExpression;
import ru.iaie.reflexold.reflexOld.ProgramVariable;
import ru.iaie.reflexold.reflexOld.UnaryExpression;
import ru.iaie.reflexold.reflexOld.UnaryOp;
import ru.iaie.reflexold.utils.TypeUtil;

@SuppressWarnings("all")
public class ExpressionUtil {
  public static boolean hasAssignment(final AssignmentExpression e) {
    IdReference _assignVar = e.getAssignVar();
    return (_assignVar != null);
  }
  
  public static boolean isReference(final PrimaryExpression e) {
    IdReference _reference = e.getReference();
    return (_reference != null);
  }
  
  public static boolean isNestedExpr(final PrimaryExpression e) {
    Expression _nestedExpr = e.getNestedExpr();
    return (_nestedExpr != null);
  }
  
  public static boolean isBoolean(final PrimaryExpression e) {
    Boolean _bool = e.getBool();
    return (_bool != null);
  }
  
  public static boolean isInteger(final PrimaryExpression e) {
    String _integer = e.getInteger();
    return (_integer != null);
  }
  
  public static boolean isFloating(final PrimaryExpression e) {
    String _floating = e.getFloating();
    return (_floating != null);
  }
  
  public static boolean hasFunctionCall(final Expression e) {
    boolean _isEmpty = EcoreUtil2.<FunctionCall>eAllOfType(e, FunctionCall.class).isEmpty();
    return (!_isEmpty);
  }
  
  public static boolean isConstExpr(final Expression e) {
    return (IterableExtensions.isEmpty(IterableExtensions.<IdReference>filter(EcoreUtil2.<IdReference>eAllOfType(e, IdReference.class), ((Function1<IdReference, Boolean>) (IdReference ref) -> {
      return Boolean.valueOf(((ref instanceof ProgramVariable) || (ref instanceof PhysicalVariable)));
    }))) && EcoreUtil2.<FunctionCall>eAllOfType(e, FunctionCall.class).isEmpty());
  }
  
  public static TypeUtil.OperationType getOperationType(final UnaryExpression e) {
    UnaryOp _unaryOp = e.getUnaryOp();
    if (_unaryOp != null) {
      switch (_unaryOp) {
        case BIT_NOT:
          return TypeUtil.OperationType.BIT;
        case LOGICAL_NOT:
          return TypeUtil.OperationType.LOGICAL;
        case MINUS:
          return TypeUtil.OperationType.ARITHMETIC;
        case PLUS:
          return TypeUtil.OperationType.ARITHMETIC;
        default:
          break;
      }
    }
    return null;
  }
}
