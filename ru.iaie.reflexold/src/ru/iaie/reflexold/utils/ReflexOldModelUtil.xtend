package ru.iaie.reflexold.utils

import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.EcoreUtil2.ElementReferenceAcceptor
import static extension org.eclipse.xtext.EcoreUtil2.*
import ru.iaie.reflexold.reflexOld.Program
import ru.iaie.reflexold.reflexOld.EnumMember
import ru.iaie.reflexold.reflexOld.StopProcStat
import ru.iaie.reflexold.reflexOld.ErrorStat
import ru.iaie.reflexold.reflexOld.TimeoutFunction
import ru.iaie.reflexold.reflexOld.State
import ru.iaie.reflexold.reflexOld.SwitchStat
import ru.iaie.reflexold.reflexOld.ProcessVariable
import ru.iaie.reflexold.reflexOld.ProgramVariable
import ru.iaie.reflexold.reflexOld.PhysicalVariable
import ru.iaie.reflexold.reflexOld.Process
import ru.iaie.reflexold.reflexOld.Type
import ru.iaie.reflexold.reflexOld.ImportedVariableList
import ru.iaie.reflexold.reflexOld.PortType
import ru.iaie.reflexold.reflexOld.PortMapping
import ru.iaie.reflexold.reflexOld.CompoundStatement
import ru.iaie.reflexold.reflexOld.Statement
import ru.iaie.reflexold.reflexOld.IdReference
import ru.iaie.reflexold.reflexOld.Const
import ru.iaie.reflexold.reflexOld.Port
import ru.iaie.reflexold.reflexOld.Enum

class ReflexOldModelUtil {
	
	//def static String toEnglish(String name) {
	//	return TransliterationUtil.transliterate(name)
	//}
	
	def static Program getProgram(Resource resource) {
		return resource.allContents.toIterable.filter(Program).get(0);
	}
	
	def static boolean isEnglish(Program p) {
		return p.en
	}

	def static boolean hasValue(EnumMember em) {
		return em.value !== null
	}

	def static boolean selfStop(StopProcStat sps) {
		return sps.process === null
	}

	def static boolean selfError(ErrorStat es) {
		return es.process === null
	}

	def static boolean isClearTimeout(TimeoutFunction f) { // INTEGER
		return f.time !== null
	}

	def static boolean isReferencedTimeout(TimeoutFunction f) { // IdReference
		return f.ref !== null
	}

	def static boolean hasTimeout(State s) {
		return s.timeoutFunction !== null
	}
	
	def static boolean hasDefaultOption(SwitchStat s) {
		return s.defaultOption !== null
	}

	def static boolean isShared(ProcessVariable v) {
		switch v {
			ProgramVariable:
				return v.shared
			PhysicalVariable:
				return v.shared
		}
		return false
	}
	
	/*
	def static boolean hasLogicalNot(CheckStateExpression cse) {
		return cse.logicalNot
	}
	*/

	def static List<ProcessVariable> getImportedVariables(Process p) {
		return p.imports.map[variables].flatten.toList
	}
	
	def static Process getProcess(ProcessVariable v) {
		return v.getContainerOfType(Process)
	}

	def static Type getType(ProcessVariable v) {
		if(v instanceof PhysicalVariable) return v.type
		if(v instanceof ProgramVariable) return v.type
	}

	def static String getName(ProcessVariable v) {
		if(v instanceof ProgramVariable) return v.name
		if(v instanceof PhysicalVariable) return v.name
	}

	def static boolean isImportedList(ProcessVariable v) {
		return v instanceof ImportedVariableList
	}

	def static boolean isPhysical(ProcessVariable v) {
		return v instanceof PhysicalVariable
	}

	def static PortType getMappedPortType(PhysicalVariable v) {
		return v.mapping.port.type
	}
	
	def static isFullMapping(PortMapping m) { // TODO: proper check (done(?))
		return m.bits == m.port.size
		//return m.bits === null
	}
	
	def static isSingleBitMapping(PortMapping m) {
		return (LiteralUtil.parseInteger(m.bits).intValue == 1)
	}
	
	def static boolean isEmpty(CompoundStatement compStat) {
		// Check recursively, for cases with nested empty compound statements
		return compStat.eAllOfType(Statement).reject(CompoundStatement).empty
	}
	
	def static boolean hasTimeoutReaction(State state) {
		return state.timeoutFunction !== null
	}
	
	def static int getIndex(Process p) {
		return p.getContainerOfType(Program).processes.indexOf(p)
	}
	
	def static int getIndex(State s) {
		return s.getContainerOfType(Process).states.indexOf(s)
	}
	
	def static boolean isEnumMemberLast(EnumMember m, Enum e) {
		return e.enumMembers.indexOf(m) == (e.enumMembers.length - 1)
	}
	
	def static Type resolveType(IdReference ref) {
		switch ref {
			Const:
				return Type.DOUBLE_EN // TODO: type???
			PhysicalVariable:
				return ref.type
			ProgramVariable:
				return ref.type
			EnumMember:
				return Type.LONG_EN // TODO: type???
		}
	}
	
	/*
	def static boolean hasTimeFormat(ClockDefinition clck) {
		return clck.timeValue !== null
	}*/
	
	
	def static Type getSuitableTypeForPort(Port p) {
		switch (LiteralUtil.parseInteger(p.size).intValue) { // TODO: add LiteralUtils file to the project (done)
			case 8: return Type.SHORT_EN
			case 16: return Type.INT_EN
			default: throw new IllegalStateException()
		} 
	}

	def static boolean containsReferencesOfType(EObject context, EObject target, EReference refType) {
		val targetSet = newHashSet(target)
		val refered = newArrayList()
		val ElementReferenceAcceptor acceptor = [ EObject referrer, EObject referenced, EReference reference, int index |
			if (reference == refType) {
				refered.add(referrer)
			}
		]
		findCrossReferences(context, targetSet, acceptor)
		return !refered.empty
	}
	
	/*
	def static Map<String, String> collectNamespaceAnnotations(Program prog, String ns) {
		return prog.annotations.collectAnnotationsOfNamespace(ns)
	}

	private def static Map<String, String> collectAnnotationsOfNamespace(List<Annotation> annotations, String ns) {
		return annotations.map[a | 
			val nsName = parseAnnotationKey(a.key)
			if (nsName.key.equals(ns)) {
				return nsName.value -> a.value
			}
		].toMap([p | p.key],[p | p.value])
	}

	private def static Pair<String, String> parseAnnotationKey(String key) {
		val splitted = key.split('\\.');
		if (splitted.size == 1) {
			return splitted.get(0) -> null
		} else {
			return splitted.get(0) -> splitted.get(1)
		}
	}
	*/
}