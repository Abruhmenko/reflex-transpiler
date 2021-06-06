package ru.iaie.reflexold.utils

class LiteralUtil { // TODO: more functions

	//static val MILLIS_PER_SECOND = 1000;
	//static val MILLIS_PER_MINUTE = 60 * MILLIS_PER_SECOND;
	//static val MILLIS_PER_HOUR = 60 * MILLIS_PER_MINUTE;
	//static val MILLIS_PER_DAY = 24 * MILLIS_PER_HOUR;

	def static long parseInteger(String literal) {
		val intRepr = literal.toLowerCase
		if (intRepr.endsWith("l")) {
			return Long.decode(intRepr.substring(0, intRepr.length - 2))
		}
		if (intRepr.endsWith("u")) {
			return Integer.decode(intRepr.substring(0, intRepr.length - 2))
		}
		return Integer.decode(literal.toLowerCase)
	}

	def static hasUnsignedModifier(String literal) {
		return literal.endsWith("L") || literal.endsWith("l")
	}

	def static hasLongModifier(String literal) {
		return literal.endsWith("U") || literal.endsWith("u")
	}

}
