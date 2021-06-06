package ru.iaie.reflexold.utils;

import com.google.common.base.Objects;
import java.util.Map;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pair;
import ru.iaie.reflexold.reflexOld.Type;

@SuppressWarnings("all")
public class TypeUtil {
  public enum OperationType {
    ARITHMETIC,
    
    LOGICAL,
    
    BIT,
    
    COMPARE,
    
    EQ;
  }
  
  private static final Set<Type> UNSIGNED_TYPES = CollectionLiterals.<Type>newHashSet(Type.USHORT_EN, Type.USHORT_RU, 
    Type.UINT_EN, Type.UINT_RU, Type.ULONG_EN, Type.ULONG_RU);
  
  private static final Set<Type> INT_TYPES = CollectionLiterals.<Type>newHashSet(Type.SHORT_EN, Type.SHORT_RU, 
    Type.INT_EN, Type.INT_RU, Type.LONG_EN, Type.LONG_RU);
  
  private static final Set<Type> FLOAT_TYPES = CollectionLiterals.<Type>newHashSet(Type.FLOAT_EN, Type.FLOAT_RU, 
    Type.DOUBLE_EN, Type.DOUBLE_RU);
  
  private static final Map<Type, Integer> TYPE_ORDER = CollectionLiterals.<Type, Integer>newHashMap(
    Pair.<Type, Integer>of(Type.BOOL_RU, Integer.valueOf(0)), 
    Pair.<Type, Integer>of(Type.BOOL_EN, Integer.valueOf(0)), 
    Pair.<Type, Integer>of(Type.SHORT_RU, Integer.valueOf(1)), 
    Pair.<Type, Integer>of(Type.SHORT_EN, Integer.valueOf(1)), 
    Pair.<Type, Integer>of(Type.USHORT_RU, Integer.valueOf(2)), 
    Pair.<Type, Integer>of(Type.USHORT_EN, Integer.valueOf(2)), 
    Pair.<Type, Integer>of(Type.INT_RU, Integer.valueOf(3)), 
    Pair.<Type, Integer>of(Type.INT_EN, Integer.valueOf(3)), 
    Pair.<Type, Integer>of(Type.UINT_RU, Integer.valueOf(4)), 
    Pair.<Type, Integer>of(Type.UINT_EN, Integer.valueOf(4)), 
    Pair.<Type, Integer>of(Type.LONG_RU, Integer.valueOf(5)), 
    Pair.<Type, Integer>of(Type.LONG_EN, Integer.valueOf(5)), 
    Pair.<Type, Integer>of(Type.ULONG_RU, Integer.valueOf(6)), 
    Pair.<Type, Integer>of(Type.ULONG_EN, Integer.valueOf(6)), 
    Pair.<Type, Integer>of(Type.FLOAT_RU, Integer.valueOf(7)), 
    Pair.<Type, Integer>of(Type.FLOAT_EN, Integer.valueOf(7)), 
    Pair.<Type, Integer>of(Type.DOUBLE_RU, Integer.valueOf(8)), 
    Pair.<Type, Integer>of(Type.DOUBLE_RU, Integer.valueOf(8)));
  
  private static final Map<Type, Integer> INT_TYPE_SIZES = CollectionLiterals.<Type, Integer>newHashMap(
    Pair.<Type, Integer>of(Type.SHORT_EN, Integer.valueOf(8)), 
    Pair.<Type, Integer>of(Type.SHORT_RU, Integer.valueOf(8)), 
    Pair.<Type, Integer>of(Type.USHORT_EN, Integer.valueOf(8)), 
    Pair.<Type, Integer>of(Type.USHORT_RU, Integer.valueOf(8)), 
    Pair.<Type, Integer>of(Type.INT_EN, Integer.valueOf(16)), 
    Pair.<Type, Integer>of(Type.INT_RU, Integer.valueOf(16)), 
    Pair.<Type, Integer>of(Type.UINT_EN, Integer.valueOf(16)), 
    Pair.<Type, Integer>of(Type.UINT_RU, Integer.valueOf(16)), 
    Pair.<Type, Integer>of(Type.LONG_EN, Integer.valueOf(32)), 
    Pair.<Type, Integer>of(Type.LONG_RU, Integer.valueOf(32)), 
    Pair.<Type, Integer>of(Type.ULONG_EN, Integer.valueOf(32)), 
    Pair.<Type, Integer>of(Type.ULONG_RU, Integer.valueOf(32)));
  
  public static boolean isUnsigned(final Type type) {
    return TypeUtil.UNSIGNED_TYPES.contains(type);
  }
  
  public static boolean isIntType(final Type type) {
    return TypeUtil.INT_TYPES.contains(type);
  }
  
  public static boolean isFloatType(final Type type) {
    return TypeUtil.FLOAT_TYPES.contains(type);
  }
  
  public static boolean isBoolType(final Type type) {
    return (Objects.equal(type, Type.BOOL_EN) || Objects.equal(type, Type.BOOL_RU));
  }
  
  public static int getSize(final Type type) {
    boolean _isIntType = TypeUtil.isIntType(type);
    if (_isIntType) {
      return (TypeUtil.INT_TYPE_SIZES.get(type)).intValue();
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Type size is undefined for ");
    _builder.append(type);
    throw new IllegalArgumentException(_builder.toString());
  }
  
  public static boolean isSigned(final Type type) {
    boolean _isUnsigned = TypeUtil.isUnsigned(type);
    return (!_isUnsigned);
  }
  
  /**
   * def static boolean canBeSafelyCastedTo(Type from, Type to) {
   * return true
   * }
   * 
   * def static boolean canBeSafelySignedTo(Type from, Type to) {
   * return TYPE_ORDER.get(from) <= TYPE_ORDER.get(to)
   * }
   * 
   * def static Type getDefaultIntLiteralType() {
   * return Type.INT8
   * }
   * 
   * def static Type getDefaultTimeLiteralType() {
   * return Type.INT32_U
   * }
   * 
   * def static Type getDefaultType(EnumMember em) {
   * return Type.INT32
   * }
   * 
   * def static Type getDefaultFloatLiteralType() {
   * return Type.FLOAT
   * }
   */
  public static Type max(final Type t1, final Type t2) {
    if ((TypeUtil.isIntType(t1) && TypeUtil.isIntType(t2))) {
      int _size = TypeUtil.getSize(t1);
      int _size_1 = TypeUtil.getSize(t2);
      boolean _equals = (_size == _size_1);
      if (_equals) {
        boolean _isSigned = TypeUtil.isSigned(t1);
        if (_isSigned) {
          return t1;
        }
        boolean _isSigned_1 = TypeUtil.isSigned(t2);
        if (_isSigned_1) {
          return t2;
        }
      }
    }
    Type _xifexpression = null;
    Integer _get = TypeUtil.TYPE_ORDER.get(t1);
    Integer _get_1 = TypeUtil.TYPE_ORDER.get(t2);
    boolean _greaterEqualsThan = (_get.compareTo(_get_1) >= 0);
    if (_greaterEqualsThan) {
      _xifexpression = t1;
    } else {
      _xifexpression = t2;
    }
    return _xifexpression;
  }
  
  public static boolean isCompitableInArithmeticExpression(final Type t1, final Type t2) {
    if ((TypeUtil.isIntType(t1) && TypeUtil.isIntType(t2))) {
      return true;
    }
    if ((TypeUtil.isFloatType(t1) && TypeUtil.isFloatType(t2))) {
      return true;
    }
    if ((TypeUtil.isBoolType(t1) && TypeUtil.isBoolType(t2))) {
      return true;
    }
    return false;
  }
  
  public static boolean isCompitableInLogicalExpression(final Type t1, final Type t2) {
    return true;
  }
}
