package ru.iaie.reflexold.utils

import static extension org.eclipse.xtext.EcoreUtil2.*
//import static extension ru.iaie.reflexold.utils.ReflexOldModelUtil.*
//import static extension ru.iaie.reflexold.utils.TypeUtil.*
import ru.iaie.reflexold.reflexOld.AssignmentExpression
import ru.iaie.reflexold.reflexOld.PrimaryExpression
import ru.iaie.reflexold.reflexOld.Expression
import ru.iaie.reflexold.reflexOld.FunctionCall
import ru.iaie.reflexold.reflexOld.IdReference
import ru.iaie.reflexold.reflexOld.ProgramVariable
import ru.iaie.reflexold.reflexOld.PhysicalVariable
import ru.iaie.reflexold.reflexOld.UnaryExpression
import ru.iaie.reflexold.utils.TypeUtil.OperationType

class ExpressionUtil {
	static def boolean hasAssignment(AssignmentExpression e) {
		return e.assignVar !== null
	}

	static def boolean isReference(PrimaryExpression e) {
		return e.reference !== null
	}

	static def boolean isNestedExpr(PrimaryExpression e) {
		return e.nestedExpr !== null
	}

	static def boolean isBoolean(PrimaryExpression e) {
		return e.bool !== null
	}

	static def boolean isInteger(PrimaryExpression e) {
		return e.integer !== null
	}

	static def boolean isFloating(PrimaryExpression e) {
		return e.floating !== null
	}

	static def boolean hasFunctionCall(Expression e) {
		!e.eAllOfType(FunctionCall).empty
	}

	static def boolean isConstExpr(Expression e) {
		(e.eAllOfType(IdReference).filter(ref|ref instanceof ProgramVariable || ref instanceof PhysicalVariable).
			empty && e.eAllOfType(FunctionCall).empty)
	}

	static def OperationType getOperationType(UnaryExpression e) {
		switch (e.unaryOp) {
			case BIT_NOT: {
				return OperationType.BIT
			}
			case LOGICAL_NOT: {
				return OperationType.LOGICAL
			}
			case MINUS: {
				return OperationType.ARITHMETIC
			}
			case PLUS: {
				return OperationType.ARITHMETIC
			}
		}
	}
	
}