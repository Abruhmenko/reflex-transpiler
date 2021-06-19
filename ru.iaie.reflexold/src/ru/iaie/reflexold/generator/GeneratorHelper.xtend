package ru.iaie.reflexold.generator

//import static extension ru.iaie.reflexold.utils.ExpressionUtil.*
import static extension ru.iaie.reflexold.utils.ReflexOldModelUtil.*
import ru.iaie.reflexold.reflexOld.Const
import ru.iaie.reflexold.reflexOld.Enum
import ru.iaie.reflexold.reflexOld.Function
import ru.iaie.reflexold.reflexOld.Type
import ru.iaie.reflexold.reflexOld.Port
import ru.iaie.reflexold.reflexOld.Process
import ru.iaie.reflexold.reflexOld.ProcessVariable
import ru.iaie.reflexold.reflexOld.PhysicalVariable
import ru.iaie.reflexold.reflexOld.State

class GeneratorHelper {
	
	protected ExpressionGenerator expressionGenerator
	protected StatementGenerator statementGenerator
	protected int enumCount
	
	new (boolean isEnglish) {
		this.expressionGenerator = new ExpressionGenerator(isEnglish)
		this.statementGenerator = new StatementGenerator(expressionGenerator)
		enumCount = 0
	}
	
	def translateName(String name) {
		expressionGenerator.toID(name)
	}
	
	def translateArgType(Type t) {
		expressionGenerator.translateType(t)
	}
	
	def translateProcVarName(ProcessVariable pv) {
		expressionGenerator.getMapping(pv)
	}
	
	def translatePortMapping(PhysicalVariable physVar) {
		return '''«translateName(physVar.mapping.port.name)»[«IF physVar.mapping.isSingleBitMapping»0«ENDIF»]'''
	}
	
	def generateConstantDefinition(Const c) {
		val constType = expressionGenerator.resolveExprType(c.value)
		return '''const «expressionGenerator.translateType(constType)» «expressionGenerator.getMapping(c)» = «expressionGenerator.translateExpr(c.value)»;
		'''
	}
	
	def generateEnumDefinition(Enum en) {
		var result = '''
		enum enumerator_«enumCount» {
			«FOR enumMember : en.enumMembers»
			«expressionGenerator.getMapping(enumMember)»«IF enumMember.hasValue» = «expressionGenerator.translateExpr(enumMember.value)»«ENDIF»«IF isEnumMemberLast(enumMember, en)»«ELSE»,«ENDIF»
			«ENDFOR»
		}
		'''
		enumCount++
		return result
	}
	
	def generateFunctionDefinition(Function f) {
		return '''«expressionGenerator.translateType(f.returnType)» «f.name»(«String.join(", ", f.argTypes.map[translateArgType])»);
		'''
	}
	
	def generatePortDefinition(Port p) {
		switch p.type {
			case INPUT_EN: return '''input «translateName(p.name)» «p.addr1» «p.addr2» «p.size»;
			'''
			case INPUT_RU: return '''input «translateName(p.name)» «p.addr1» «p.addr2» «p.size»;
			'''
			case OUTPUT_EN: return '''output «translateName(p.name)» «p.addr1» «p.addr2» «p.size»;
			'''
			case OUTPUT_RU: '''output «translateName(p.name)» «p.addr1» «p.addr2» «p.size»;
			'''
		}
	}
	
	/*
	Process:
		("PROC" | "ÏÐÎÖ") name=ID "{"
		((imports+=ImportedVariableList | variables+=ProcessVariable) ";")*
		states+=State*
		"}";
	
	ImportedVariableList:
		(("FROM" "PROC") | ("ÈÇ" "ÏÐÎÖ")) process=[Process]
		variables+=[ProcessVariable] ("," variables+=[ProcessVariable])*;
	
	ProcessVariable:
		(PhysicalVariable | ProgramVariable)
		(
			(local?=("LOCAL" | "ËÎÊÀË")) |
			(shared?=("FOR" | "ÄËß")
				(
					("ALL" | "ÂÑÅÕ") |
					((("PROC") | ("ÏÐÎÖ")) processes+=[Process] ("," processes+=[Process])*)
				)
			)
		);
	*/
	def generateProcessDefinition(Process p) {
		return '''
		process «translateName(p.name)» {
			«FOR importList : p.imports»
			shared «String.join(", ", importList.variables.map[translateProcVarName])» from process «translateName(p.name)»;
			«ENDFOR»
		
			«FOR procVar : p.variables»
			«generateProcVarDefinition(procVar)»
			«ENDFOR»
			
			«FOR state : p.states»
			«generateStateDefinition(state)»
			«ENDFOR»
		}
		
		'''
	}
	
	/*
	ProgramVariable:
		type=Type name=ID;
	PhysicalVariable:
		type=Type name=ID "=" mapping=PortMapping;
	PortMapping:
		"{" port=[Port] "[" (bits=INTEGER) "]" "}";
	Port:
		type=PortType name=ID addr1=INTEGER addr2=INTEGER size=INTEGER ";";
	*/
	def generateProcVarDefinition(ProcessVariable pv) {
		var String pvScope = pv.isShared? "shared" : ""
		return '''«expressionGenerator.translateType(pv.type)» «translateName(pv.name)»«IF pv.isPhysical» = «translatePortMapping(pv as PhysicalVariable)»«ENDIF» «pvScope»;
		'''
	}
	
	def generateStateDefinition(State state) {
		return '''
		state «translateName(state.name)» «IF statementGenerator.isStateLooped(state)»looped «ENDIF»{
			«FOR stat : state.stateFunction.statements»
			«statementGenerator.translateStatement(state, stat)»
			«ENDFOR»
			
			«IF state.timeoutFunction !== null »
			«statementGenerator.translateTimeoutFunction(state, state.timeoutFunction)»
			«ENDIF»
		}
		
		'''
	}
	
}