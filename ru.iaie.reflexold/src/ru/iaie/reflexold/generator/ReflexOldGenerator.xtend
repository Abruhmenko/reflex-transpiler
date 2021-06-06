/*
 * generated by Xtext 2.25.0
 */
package ru.iaie.reflexold.generator

import static extension ru.iaie.reflexold.utils.ReflexOldModelUtil.*
//import static extension ru.iaie.reflexold.utils.TransliterationUtil.*
//import static extension org.eclipse.xtext.EcoreUtil2.*

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import ru.iaie.reflexold.reflexOld.Program

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class ReflexOldGenerator implements IReflexOldGenerator {
	
	protected boolean isEnglish
	protected String GENERATED_DIR_NAME = "generated-code"
	protected String fileName
	
	protected Program program
	protected IFileSystemAccess2 fsa
	protected GeneratorHelper generatorHelper

	override void afterGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {}
	
	override void beforeGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		program = resource.getProgram()
		isEnglish = program.en
		generatorHelper = new GeneratorHelper(isEnglish)
		fileName = '''�GENERATED_DIR_NAME�/�generatorHelper.translateName(program.name)�.txt'''
	}
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		fsa.generateFile(fileName, generateReflexProgram)
	}
	
	def generateReflexProgram() {
		return '''
		program �generatorHelper.translateName(program.name)� {
			clock �program.clock.value�;
			
			�generateConsts()�
			
			�generateEnums()�
			
			�generateFunctions()�
			
			�generatePorts()�
			
			�generateProcesses()�
		}
		'''
	}
	/*
	def identifier(String name) {
		if (isEnglish) return name.toLowerCase
		else return name.toLowerCase.transliterate()
	}*/
	
	def generateConsts() {
		return '''
		�FOR constant : program.consts�
		�generatorHelper.generateConstantDefinition(constant)�
		�ENDFOR�
		'''
	}
	def generateEnums() {
		return '''
		�FOR enumerator : program.enums�
		�generatorHelper.generateEnumDefinition(enumerator)�
		�ENDFOR�
		'''
	}
	def generateFunctions() {
		return '''
		�FOR function : program.functions�
		�generatorHelper.generateFunctionDefinition(function)�
		�ENDFOR�
		'''
	}
	def generatePorts() {
		return '''
		�FOR port : program.ports�
		�generatorHelper.generatePortDefinition(port)�
		�ENDFOR�
		'''
	}
	def generateProcesses() {
		return '''
		�FOR process : program.processes�
		�generatorHelper.generateProcessDefinition(process)�
		�ENDFOR�
		'''
	}
	
}
