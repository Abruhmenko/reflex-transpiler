package ru.iaie.reflexold.utils;

@SuppressWarnings("all")
public class TransliterationUtil {
  public static String ru2en(final int charAsInt) {
    switch (charAsInt) {
      case 1072:
        return "a";
      case 1073:
        return "b";
      case 1074:
        return "v";
      case 1075:
        return "g";
      case 1076:
        return "d";
      case 1077:
        return "e";
      case 1105:
        return "e";
      case 1078:
        return "zh";
      case 1079:
        return "z";
      case 1080:
        return "i";
      case 1081:
        return "j";
      case 1082:
        return "k";
      case 1083:
        return "l";
      case 1084:
        return "m";
      case 1085:
        return "n";
      case 1086:
        return "o";
      case 1087:
        return "p";
      case 1088:
        return "r";
      case 1089:
        return "s";
      case 1090:
        return "t";
      case 1091:
        return "u";
      case 1092:
        return "f";
      case 1093:
        return "h";
      case 1094:
        return "ts";
      case 1095:
        return "ch";
      case 1096:
        return "sh";
      case 1097:
        return "sh";
      case 1098:
        return "q";
      case 1099:
        return "y";
      case 1100:
        return "q";
      case 1101:
        return "e";
      case 1102:
        return "yu";
      case 1103:
        return "ya";
      default:
        return Character.toString(charAsInt);
    }
  }
  
  public static String transliterate(final String str) {
    String newStr = "";
    char[] _charArray = str.toCharArray();
    for (final char ch : _charArray) {
      String _newStr = newStr;
      String _ru2en = TransliterationUtil.ru2en(ch);
      newStr = (_newStr + _ru2en);
    }
    return newStr;
  }
}
