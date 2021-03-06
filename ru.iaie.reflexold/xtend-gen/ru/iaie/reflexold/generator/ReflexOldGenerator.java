/**
 * generated by Xtext 2.25.0
 */
package ru.iaie.reflexold.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import ru.iaie.reflexold.reflexOld.Const;
import ru.iaie.reflexold.reflexOld.Function;
import ru.iaie.reflexold.reflexOld.Port;
import ru.iaie.reflexold.reflexOld.Program;
import ru.iaie.reflexold.utils.ReflexOldModelUtil;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class ReflexOldGenerator implements IReflexOldGenerator {
  protected boolean isEnglish;
  
  protected String GENERATED_DIR_NAME = "generated-code";
  
  protected String fileName;
  
  protected Program program;
  
  protected IFileSystemAccess2 fsa;
  
  protected GeneratorHelper generatorHelper;
  
  @Override
  public void afterGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
  }
  
  @Override
  public void beforeGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.program = ReflexOldModelUtil.getProgram(resource);
    this.isEnglish = this.program.isEn();
    GeneratorHelper _generatorHelper = new GeneratorHelper(this.isEnglish);
    this.generatorHelper = _generatorHelper;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(this.GENERATED_DIR_NAME);
    _builder.append("/");
    String _translateName = this.generatorHelper.translateName(this.program.getName());
    _builder.append(_translateName);
    _builder.append(".txt");
    this.fileName = _builder.toString();
  }
  
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    fsa.generateFile(this.fileName, this.generateReflexProgram());
  }
  
  public String generateReflexProgram() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("program ");
    String _translateName = this.generatorHelper.translateName(this.program.getName());
    _builder.append(_translateName);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("clock ");
    String _value = this.program.getClock().getValue();
    _builder.append(_value, "\t");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _generateConsts = this.generateConsts();
    _builder.append(_generateConsts, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _generateEnums = this.generateEnums();
    _builder.append(_generateEnums, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _generateFunctions = this.generateFunctions();
    _builder.append(_generateFunctions, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _generatePorts = this.generatePorts();
    _builder.append(_generatePorts, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    String _generateProcesses = this.generateProcesses();
    _builder.append(_generateProcesses, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateConsts() {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Const> _consts = this.program.getConsts();
      for(final Const constant : _consts) {
        String _generateConstantDefinition = this.generatorHelper.generateConstantDefinition(constant);
        _builder.append(_generateConstantDefinition);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  /**
   * def identifier(String name) {
   * if (isEnglish) return name.toLowerCase
   * else return name.toLowerCase.transliterate()
   * }
   */
  public String generateEnums() {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<ru.iaie.reflexold.reflexOld.Enum> _enums = this.program.getEnums();
      for(final ru.iaie.reflexold.reflexOld.Enum enumerator : _enums) {
        String _generateEnumDefinition = this.generatorHelper.generateEnumDefinition(enumerator);
        _builder.append(_generateEnumDefinition);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  public String generateFunctions() {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Function> _functions = this.program.getFunctions();
      for(final Function function : _functions) {
        String _generateFunctionDefinition = this.generatorHelper.generateFunctionDefinition(function);
        _builder.append(_generateFunctionDefinition);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  public String generatePorts() {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<Port> _ports = this.program.getPorts();
      for(final Port port : _ports) {
        CharSequence _generatePortDefinition = this.generatorHelper.generatePortDefinition(port);
        _builder.append(_generatePortDefinition);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  public String generateProcesses() {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<ru.iaie.reflexold.reflexOld.Process> _processes = this.program.getProcesses();
      for(final ru.iaie.reflexold.reflexOld.Process process : _processes) {
        String _generateProcessDefinition = this.generatorHelper.generateProcessDefinition(process);
        _builder.append(_generateProcessDefinition);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
}
