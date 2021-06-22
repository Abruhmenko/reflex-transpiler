package ru.iaie.reflexold.generator

//import static extension ru.iaie.reflexold.utils.ReflexOldModelUtil.*
//import static extension ru.iaie.reflexold.utils.LiteralUtil.*
import static extension ru.iaie.reflexold.utils.ExpressionUtil.*
import static extension ru.iaie.reflexold.utils.TransliterationUtil.*
//import static extension ru.iaie.reflexold.utils.TypeUtil.*
//import ru.iaie.reflexold.utils.TypeUtil
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import ru.iaie.reflexold.reflexOld.InfixOp
import ru.iaie.reflexold.reflexOld.PostfixOp
import ru.iaie.reflexold.reflexOld.FunctionCall
import ru.iaie.reflexold.reflexOld.IdReference
import ru.iaie.reflexold.reflexOld.PrimaryExpression
import ru.iaie.reflexold.reflexOld.UnaryExpression
import ru.iaie.reflexold.reflexOld.CastExpression
import ru.iaie.reflexold.reflexOld.MultiplicativeExpression
import ru.iaie.reflexold.reflexOld.AdditiveExpression
import ru.iaie.reflexold.reflexOld.CheckStateExpression
import ru.iaie.reflexold.reflexOld.ShiftExpression
import ru.iaie.reflexold.reflexOld.CompareExpression
import ru.iaie.reflexold.reflexOld.EqualityExpression
import ru.iaie.reflexold.reflexOld.BitAndExpression
import ru.iaie.reflexold.reflexOld.BitXorExpression
import ru.iaie.reflexold.reflexOld.BitOrExpression
import ru.iaie.reflexold.reflexOld.LogicalAndExpression
import ru.iaie.reflexold.reflexOld.LogicalOrExpression
import ru.iaie.reflexold.reflexOld.AssignmentExpression
import ru.iaie.reflexold.reflexOld.PhysicalVariable
import ru.iaie.reflexold.reflexOld.ProgramVariable
//import ru.iaie.reflexold.reflexOld.Process
import ru.iaie.reflexold.reflexOld.Const
import ru.iaie.reflexold.reflexOld.EnumMember
//import ru.iaie.reflexold.reflexOld.ProcessVariable
import ru.iaie.reflexold.reflexOld.Type
import java.util.Set
import java.util.Map
import ru.iaie.reflexold.reflexOld.ProcessVariable

class ExpressionGenerator {
	
	protected Set<Type> UNSIGNED_TYPES
	protected Set<Type> INT_TYPES
	protected Set<Type> FLOAT_TYPES
	protected Map<Type, Integer> TYPE_ORDER
	protected Map<Type, Integer> INT_TYPE_SIZES
	
	protected boolean isEnglish
	
	new (boolean isEnglish) {
		this.isEnglish = isEnglish
		UNSIGNED_TYPES = newHashSet(Type.USHORT_EN, Type.USHORT_RU, Type.UINT_EN, Type.UINT_RU, Type.ULONG_EN, Type.ULONG_RU)
		INT_TYPES = newHashSet(Type.SHORT_EN, Type.SHORT_RU, Type.INT_EN, Type.INT_RU, Type.LONG_EN, Type.LONG_RU)
		FLOAT_TYPES = newHashSet(Type.FLOAT_EN, Type.FLOAT_RU, Type.DOUBLE_EN, Type.DOUBLE_RU)
		TYPE_ORDER = newHashMap(
			Type.BOOL_RU	-> 0,
			Type.BOOL_EN	-> 0,
			Type.SHORT_RU	-> 1,
			Type.SHORT_EN	-> 1,
			Type.USHORT_RU	-> 2,
			Type.USHORT_EN	-> 2,
			Type.INT_RU		-> 3,
			Type.INT_EN		-> 3,
			Type.UINT_RU	-> 4,
			Type.UINT_EN	-> 4,
			Type.LONG_RU	-> 5,
			Type.LONG_EN	-> 5,
			Type.ULONG_RU	-> 6,
			Type.ULONG_EN	-> 6,
			Type.FLOAT_RU	-> 7,
			Type.FLOAT_EN	-> 7,
			Type.DOUBLE_RU	-> 8,
			Type.DOUBLE_EN	-> 8
		)
		INT_TYPE_SIZES = newHashMap(
			Type.SHORT_EN	-> 8,
			Type.SHORT_RU	-> 8,
			Type.USHORT_EN	-> 8,
			Type.USHORT_RU	-> 8,
			Type.INT_EN		-> 16,
			Type.INT_RU		-> 16,
			Type.UINT_EN	-> 16,
			Type.UINT_RU	-> 16,
			Type.LONG_EN	-> 32,
			Type.LONG_RU	-> 32,
			Type.ULONG_EN	-> 32,
			Type.ULONG_RU	-> 32
		)
	}
	
	def boolean isUnsigned(Type type) {
		return UNSIGNED_TYPES.contains(type)
	}

	def boolean isIntType(Type type) {
		return INT_TYPES.contains(type)
	}
	
	def boolean isFloatType(Type type) {
		return FLOAT_TYPES.contains(type)
	}
	
	def boolean isBoolType(Type type) {
		return (type == Type.BOOL_EN || type == Type.BOOL_RU)
	}
	
	def int getSize(Type type) {
		if (isIntType(type)) {
			return INT_TYPE_SIZES.get(type)
		}
		throw new IllegalArgumentException('''Type size is undefined for «type»''');
	}

	def boolean isSigned(Type type) {
		return !isUnsigned(type)
	}
	
	def Type max(Type t1, Type t2) { // TODO: stack overflow exception
		if (t1.isIntType && t2.isIntType) {
			if (t1.size == t2.size) {
				if (t1.signed) return t1;
				if (t2.signed) return t2;
			}
		}
		return (TYPE_ORDER.get(t1) >= TYPE_ORDER.get(t2)) ? t1 : t2;
	}
	
	def isCompitableInArithmeticExpression(Type t1, Type t2) {
		if (t1.isIntType && t2.isIntType) return true;
		if (t1.isFloatType && t2.isFloatType) return true;
		if (t1.isBoolType && t2.isBoolType) return true;
	}
		
	def isCompitableInLogicalExpression(Type t1, Type t2) {
		return true;
	}
	
	//enum OperationType {
	//	ARITHMETIC, LOGICAL, BIT, COMPARE, EQ
	//}
	
	
	
	
	def toID(String name) {
		if (isEnglish) return name.toLowerCase
		else return name.toLowerCase.transliterate
	}
	
	def getMapping(ProcessVariable pv) {
		switch (pv) {
			PhysicalVariable:
				return '''«pv.name.toID»'''
			ProgramVariable:
				return '''«pv.name.toID»'''
		}
	}
	
	def getMapping(IdReference ref) {
		switch (ref) {
			PhysicalVariable:
				return '''«ref.name.toID»'''
			ProgramVariable:
				return '''«ref.name.toID»'''
			Const:
				return '''«ref.name.toID»'''
			EnumMember:
				return '''«ref.name.toID»'''
		}
	}
	
	def String translateBoolLiteral(Boolean l) {
		return l.booleanValue ? "true" : "false"
	}
	
	def String translateType(Type t) {
		switch (t) {
			case SHORT_EN: return "int8"
			case SHORT_RU: return "int8"
			case USHORT_EN: return "uint8"
			case USHORT_RU: return "uint8"
			case INT_EN: return "int16"
			case INT_RU: return "int16"
			case UINT_EN: return "uint16"
			case UINT_RU: return "uint16"
			case LONG_EN: return "int32"
			case LONG_RU: return "int32"
			case ULONG_EN: return "uint32"
			case ULONG_RU: return "uint32"
			case FLOAT_EN: return "float"
			case FLOAT_RU: return "float"
			case DOUBLE_EN: return "double"
			case DOUBLE_RU: return "double"
			case BOOL_EN: return "bool"
			case BOOL_RU: return "bool"
			case VOID_EN: return "void"
			case VOID_RU: return "void"
		}
	}
	
	def translateCheckStateExpression(CheckStateExpression cse) {
		var s1 = cse.logicalNot? "!(" : ""
		var s2 = cse.logicalNot? ")" : ""
		switch (cse.qualfier) {
			case STOP_EN:
				return '''«s1»process «cse.process.name.toID» in state stop«s2»'''
			case STOP_RU:
				return '''«s1»process «cse.process.name.toID» in state stop«s2»'''
			case ERROR_EN:
				return '''«s1»process «cse.process.name.toID» in state error«s2»'''
			case ERROR_RU:
				return '''«s1»process «cse.process.name.toID» in state error«s2»'''
			case ACTIVE_EN:
				return '''«s1»process «cse.process.name.toID» in state active«s2»'''
			case ACTIVE_RU:
				return '''«s1»process «cse.process.name.toID» in state active«s2»'''
			case PASSIVE_EN:
				return '''«s1»process «cse.process.name.toID» in state passive«s2»'''
			case PASSIVE_RU:
				return '''«s1»process «cse.process.name.toID» in state passive«s2»'''
		}
	}
	
	def String translateExpr(EObject expr) {
		switch (expr) {
			InfixOp:
				return '''«expr.op» «getMapping(expr.ref)»'''
			PostfixOp:
				return '''«getMapping(expr.ref)» «expr.op»'''
			FunctionCall:
				return '''«expr.function.name»(«String.join(", ", expr.args.map[translateExpr])»)'''
			IdReference:
				return '''«getMapping(expr)»'''
			PrimaryExpression: {
				if (expr.isNestedExpr) return '''(«translateExpr(expr.nestedExpr)»)'''
				if (expr.isBoolean) {
					return translateBoolLiteral(expr.bool)
				}
				if (expr.isReference) {
					return translateExpr(expr.reference)
				}
				return NodeModelUtils.getNode(expr).text.trim	//TODO: get the type from the PrimaryExpression (ReflexOld.xtext)
			}
			UnaryExpression:
				return '''«IF !expr.referenceOp»«expr.unaryOp»«ENDIF»«translateExpr(expr.right)»'''
			CastExpression:
				return '''(«translateType(expr.type)») «translateExpr(expr.right)»'''
			MultiplicativeExpression:
				return '''«translateExpr(expr.left)» «expr.mulOp» «translateExpr(expr.right)»'''
			AdditiveExpression:
				return '''«translateExpr(expr.left)» «expr.addOp» «translateExpr(expr.right)»'''
			CheckStateExpression:
				return translateCheckStateExpression(expr)
			ShiftExpression:
				return '''«translateExpr(expr.left)» «expr.shiftOp» «translateExpr(expr.right)»'''
			CompareExpression:
				return '''«translateExpr(expr.left)» «expr.cmpOp» «translateExpr(expr.right)»'''
			EqualityExpression:
				return '''«translateExpr(expr.left)» «expr.eqCmpOp» «translateExpr(expr.right)»'''
			BitAndExpression:
				return '''«translateExpr(expr.left)» & «translateExpr(expr.right)»'''
			BitXorExpression:
				return '''«translateExpr(expr.left)» ^ «translateExpr(expr.right)»'''
			BitOrExpression:
				return '''«translateExpr(expr.left)» | «translateExpr(expr.right)»'''
			LogicalAndExpression:
				return '''«translateExpr(expr.left)» && «translateExpr(expr.right)»'''
			LogicalOrExpression:
				return '''«translateExpr(expr.left)» || «translateExpr(expr.right)»'''
			AssignmentExpression: {
				if (expr.hasAssignment)
					return '''«translateExpr(expr.assignVar)» «expr.assignOp» «translateExpr(expr.expr)»'''
				return '''«translateExpr(expr.expr)»'''
			}
		}
	}
	
	def Type resolveIdReferenceType(IdReference ref) {
		switch ref {
			PhysicalVariable:
				return ref.type // good
			ProgramVariable:
				return ref.type // good
			EnumMember:
				return resolveExprType(ref.value) // unclear
			Const:
				return resolveExprType(ref.value)
		}
	}
	
	def Type resolveExprType(EObject expr) {
		switch (expr) {
			InfixOp:
				return resolveExprType(expr.ref)
			PostfixOp:
				return resolveExprType(expr.ref)
			FunctionCall:
				return expr.function.returnType
			IdReference: {
				return resolveIdReferenceType(expr)
				//return resolveExprType(expr)
			}
			PrimaryExpression: {
				if (expr.isNestedExpr) {
					return resolveExprType(expr.nestedExpr)
				}
				if (expr.isBoolean) {
					return Type.BOOL_EN
				}
				if (expr.isReference) {
					return resolveExprType(expr.reference)
				}
				if (expr.isInteger) {
					return Type.LONG_EN
				}
				if (expr.isFloating) {
					return Type.DOUBLE_EN
				}
			}
			UnaryExpression:
				return resolveExprType(expr.right)
			CastExpression:
				return expr.type
			CheckStateExpression:
				return Type.BOOL_EN
			AssignmentExpression: {
				if (expr.hasAssignment) {
					return resolveExprType(expr.assignVar)
				}
				return resolveExprType(expr.expr)
			}
			default:
				resolveBinaryExprType(expr)
		}
	}

	def Type resolveBinaryExprType(EObject expr) {
		var EObject left
		var EObject right
		switch (expr) {
			MultiplicativeExpression: {
				left = expr.left
				right = expr.right
			}
			AdditiveExpression: {
				left = expr.left
				right = expr.right
			}
			ShiftExpression: {
				left = expr.left
				right = expr.right
			}
			CompareExpression: {
				left = expr.left
				right = expr.right
			}
			EqualityExpression: {
				left = expr.left
				right = expr.right
			}
			BitAndExpression: {
				left = expr.left
				right = expr.right
			}
			BitXorExpression: {
				left = expr.left
				right = expr.right
			}
			BitOrExpression: {
				left = expr.left
				right = expr.right
			}
			LogicalAndExpression: {
				left = expr.left
				right = expr.right
			}
			LogicalOrExpression: {
				left = expr.left
				right = expr.right
			}
		}
		val leftType = resolveExprType(left)
		val rightType = resolveExprType(right)
		//return leftType
		return max(leftType, rightType)
	}
	
	
	
}