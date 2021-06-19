package ru.iaie.reflexold.generator

import org.eclipse.emf.ecore.EObject
import static extension ru.iaie.reflexold.utils.ReflexOldModelUtil.*
//import ru.iaie.reflexold.reflexOld.Process
import ru.iaie.reflexold.reflexOld.State
import ru.iaie.reflexold.reflexOld.TimeoutFunction
import ru.iaie.reflexold.reflexOld.StopProcStat
import ru.iaie.reflexold.reflexOld.SetStateStat
import ru.iaie.reflexold.reflexOld.IfElseStat
import ru.iaie.reflexold.reflexOld.Expression
import ru.iaie.reflexold.reflexOld.SwitchStat
import ru.iaie.reflexold.reflexOld.StartProcStat
import ru.iaie.reflexold.reflexOld.ResetStat
import ru.iaie.reflexold.reflexOld.RestartStat
import ru.iaie.reflexold.reflexOld.CompoundStatement
import ru.iaie.reflexold.utils.LiteralUtil
import ru.iaie.reflexold.reflexOld.LoopStat

class StatementGenerator {
	protected ExpressionGenerator expressionGenerator
	
	new(ExpressionGenerator expressionGenerator) {
		this.expressionGenerator = expressionGenerator
	}
	
	def translateName(String name) {
		expressionGenerator.toID(name)
	}
	
	def translateTimeoutFunction(State state, TimeoutFunction func) {
		return '''
		timeout «translateTimeout(func)» {
			«translateStatement(state, func.body)»
		}
		'''
	}

	def translateTimeout(TimeoutFunction func) {
		if (func.isClearTimeout)
			return LiteralUtil.parseInteger(func.time)
		if (func.isReferencedTimeout)
			expressionGenerator.getMapping(func.ref);
	}

	def String translateStatement(State state, EObject statement) {
		switch statement {
			StopProcStat:
				return translateStopProcStat(statement)
			SetStateStat:
				return translateSetStateStat(state, statement)
			IfElseStat:
				return translateIfElseStat(state, statement)
			Expression:
				return '''«expressionGenerator.translateExpr(statement)»;'''
			SwitchStat:
				return translateSwitchCaseStat(state, statement)
			StartProcStat:
				return translateStartProcStat(statement)
			ResetStat:
				return translateResetTimer()
			RestartStat:
				return translateRestartProcStat()
			CompoundStatement:
				return '''
				{
					«FOR stat : statement.statements»
					«translateStatement(state, stat)»
					«ENDFOR»
				}
				'''
		}
	}

	def translateIfElseStat(State state, IfElseStat stat) {
		return '''
		if («expressionGenerator.translateExpr(stat.cond)») «translateStatement(state, stat.then)»
		«IF stat.getElse !== null»	
		else «translateStatement(state, stat.getElse)»
		«ENDIF»
		'''
	}

	def translateSwitchCaseStat(State state, SwitchStat stat) {
		return '''
		switch («expressionGenerator.translateExpr(stat.expr)») {
			«FOR variant : stat.options»
			case («expressionGenerator.translateExpr(variant.option)»): {
				«FOR statement: variant.statements» 
					«translateStatement(state, statement)»
				«ENDFOR»
				«IF variant.hasBreak»break;«ENDIF»
			}
			«ENDFOR»
			«IF stat.hasDefaultOption»default: {
				«FOR statement: stat.defaultOption.statements» 
					«translateStatement(state, statement)»
				«ENDFOR»
				«IF stat.defaultOption.hasBreak»break;«ENDIF»
			}
			«ENDIF»
		}
		'''
	}

	def translateResetTimer() {
		return '''reset timer;
		'''
	}

	def translateSetStateStat(State state, SetStateStat sss) {
		if (sss.isNext) {
			return '''set next state;
			'''
		}
		return '''set state «translateName(sss.state.name)»;
		'''
	}

	def translateStopProcStat(StopProcStat sps) {
		if (sps.selfStop) {
			return '''stop;
			'''
		}
		return '''stop process «translateName(sps.process.name)»;
		'''
	}

	def translateStartProcStat(StartProcStat sps) {
		return '''start process «translateName(sps.process.name)»;
		'''
	}

	def translateRestartProcStat() {
		return '''restart;
		'''
	}
	
	def boolean isStateLooped(State state) {
		for (statement : state.stateFunction.statements) {
			if (statement.hasLoop)
				return true
		}
		return false
	}
	
	def boolean hasLoop(EObject statement) {
		switch statement {
			LoopStat:
				return true
			IfElseStat: {
				if (hasLoop(statement.then))
					return true
				if (statement.getElse !== null)
					return hasLoop(statement.getElse)
				return false
			}
			SwitchStat: {
				for (variant : statement.options) {
					for (stat : variant.statements) {
						if (hasLoop(stat))
							return true
					}
				}
				if (statement.hasDefaultOption) {
					for (stat : statement.defaultOption.statements) {
						if (hasLoop(stat))
							return true
					}
				}
				return false
			}
			CompoundStatement: {
				for (stat : statement.statements) {
					if (hasLoop(stat))
						return true
				}
				return false
			}
			default:
				return false
		}
	}
	
	
}