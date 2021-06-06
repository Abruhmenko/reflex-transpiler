package ru.iaie.reflexold.utils

import ru.iaie.reflexold.reflexOld.Type
import java.util.Set
import java.util.Map
//import ru.iaie.reflexold.reflexOld.EnumMember

class TypeUtil {
	
	static val Set<Type> UNSIGNED_TYPES = newHashSet(Type.USHORT_EN, Type.USHORT_RU,
		Type.UINT_EN, Type.UINT_RU, Type.ULONG_EN, Type.ULONG_RU)
	
	static val Set<Type> INT_TYPES = newHashSet(Type.SHORT_EN, Type.SHORT_RU,
		Type.INT_EN, Type.INT_RU, Type.LONG_EN, Type.LONG_RU)
	
	static val Set<Type> FLOAT_TYPES = newHashSet(Type.FLOAT_EN, Type.FLOAT_RU,
		Type.DOUBLE_EN, Type.DOUBLE_RU)

	static val Map<Type, Integer> TYPE_ORDER = newHashMap(
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
		Type.DOUBLE_RU	-> 8
	) 
	
	static val Map<Type, Integer> INT_TYPE_SIZES = newHashMap(
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

	def static boolean isUnsigned(Type type) {
		return UNSIGNED_TYPES.contains(type)
	}

	def static boolean isIntType(Type type) {
		return INT_TYPES.contains(type)
	}
	
	def static boolean isFloatType(Type type) {
		return FLOAT_TYPES.contains(type)
	}
	
	def static boolean isBoolType(Type type) {
		return (type == Type.BOOL_EN || type == Type.BOOL_RU)
	}
	
	def static int getSize(Type type) {
		if (isIntType(type)) {
			return INT_TYPE_SIZES.get(type)
		}
		throw new IllegalArgumentException('''Type size is undefined for «type»''');
	}

	def static boolean isSigned(Type type) {
		return !isUnsigned(type)
	}
	
	/*
	def static boolean canBeSafelyCastedTo(Type from, Type to) {
		return true
	}
	
	def static boolean canBeSafelySignedTo(Type from, Type to) {
		return TYPE_ORDER.get(from) <= TYPE_ORDER.get(to)
	}
	
	def static Type getDefaultIntLiteralType() {
		return Type.INT8
	}
	
	def static Type getDefaultTimeLiteralType() {
		return Type.INT32_U
	}
	
	def static Type getDefaultType(EnumMember em) {
		return Type.INT32
	}
	
	def static Type getDefaultFloatLiteralType() {
		return Type.FLOAT
	}
	*/
	
	def static Type max(Type t1, Type t2) { // TODO: stack overflow exception
		if (t1.isIntType && t2.isIntType) {
			if (t1.size == t2.size) {
				if (t1.signed) return t1;
				if (t2.signed) return t2;
			}
		}
		return (TYPE_ORDER.get(t1) >= TYPE_ORDER.get(t2)) ? t1 : t2;
	}
	
	def static isCompitableInArithmeticExpression(Type t1, Type t2) {
		if (t1.isIntType && t2.isIntType) return true;
		if (t1.isFloatType && t2.isFloatType) return true;
		if (t1.isBoolType && t2.isBoolType) return true;
	}
		
	def static isCompitableInLogicalExpression(Type t1, Type t2) {
		return true;
	}
	
	enum OperationType {
		ARITHMETIC, LOGICAL, BIT, COMPARE, EQ
	}
	
	/*
	static def doUnaryTypeChecking(OperationType opType, Type type) {
		switch opType {
			case ARITHMETIC: {
				type.isBoolType throw new TypeIssue("Arithmetic operation on boolean type")
			}
			case LOGICAL: {}
			case BIT: {}
			case COMPARE: {}
			case EQ: {}
		}
	}

	static def doBinaryTypeChecking(OperationType opType, Type type1, Type type2) {
		switch opType {
			case ARITHMETIC: {
				if (type1.isBoolType || type2.isBoolType) { 
					throw new TypeIssue("Arithmetic operation on boolean type")
				}
				if ((type1.isIntType && type2.isFloatType) || (type2.isIntType && type1.isFloatType)) { 
					throw new TypeIssue("Arithmetic operation between float and integer type")
				}
			}
			case COMPARE: {
				if (type1.isBoolType || type2.isBoolType) { 
					throw new TypeIssue("Comparison operation on boolean type")
				}
			}
			case EQ: {
				if ((type1.isIntType && type2.isFloatType) || (type2.isIntType && type1.isFloatType)) { 
					throw new TypeIssue("Equality operation between float and integer type")
				}
			}
			case LOGICAL: {}
			case BIT: {}
		}
	}
	
	static class TypeIssue extends Exception {
		new (String message) {
			super(message)
		}	
	}
	*/
	}