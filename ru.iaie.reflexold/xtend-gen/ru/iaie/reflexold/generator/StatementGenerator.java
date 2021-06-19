package ru.iaie.reflexold.generator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import ru.iaie.reflexold.reflexOld.CaseStat;
import ru.iaie.reflexold.reflexOld.CompoundStatement;
import ru.iaie.reflexold.reflexOld.Expression;
import ru.iaie.reflexold.reflexOld.IfElseStat;
import ru.iaie.reflexold.reflexOld.LoopStat;
import ru.iaie.reflexold.reflexOld.ResetStat;
import ru.iaie.reflexold.reflexOld.RestartStat;
import ru.iaie.reflexold.reflexOld.SetStateStat;
import ru.iaie.reflexold.reflexOld.StartProcStat;
import ru.iaie.reflexold.reflexOld.State;
import ru.iaie.reflexold.reflexOld.Statement;
import ru.iaie.reflexold.reflexOld.StopProcStat;
import ru.iaie.reflexold.reflexOld.SwitchStat;
import ru.iaie.reflexold.reflexOld.TimeoutFunction;
import ru.iaie.reflexold.utils.LiteralUtil;
import ru.iaie.reflexold.utils.ReflexOldModelUtil;

@SuppressWarnings("all")
public class StatementGenerator {
  protected ExpressionGenerator expressionGenerator;
  
  public StatementGenerator(final ExpressionGenerator expressionGenerator) {
    this.expressionGenerator = expressionGenerator;
  }
  
  public String translateName(final String name) {
    return this.expressionGenerator.toID(name);
  }
  
  public String translateTimeoutFunction(final State state, final TimeoutFunction func) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("timeout ");
    Object _translateTimeout = this.translateTimeout(func);
    _builder.append(_translateTimeout);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    String _translateStatement = this.translateStatement(state, func.getBody());
    _builder.append(_translateStatement, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public Object translateTimeout(final TimeoutFunction func) {
    String _xblockexpression = null;
    {
      boolean _isClearTimeout = ReflexOldModelUtil.isClearTimeout(func);
      if (_isClearTimeout) {
        return Long.valueOf(LiteralUtil.parseInteger(func.getTime()));
      }
      String _xifexpression = null;
      boolean _isReferencedTimeout = ReflexOldModelUtil.isReferencedTimeout(func);
      if (_isReferencedTimeout) {
        _xifexpression = this.expressionGenerator.getMapping(func.getRef());
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public String translateStatement(final State state, final EObject statement) {
    boolean _matched = false;
    if (statement instanceof StopProcStat) {
      _matched=true;
      return this.translateStopProcStat(((StopProcStat)statement));
    }
    if (!_matched) {
      if (statement instanceof SetStateStat) {
        _matched=true;
        return this.translateSetStateStat(state, ((SetStateStat)statement));
      }
    }
    if (!_matched) {
      if (statement instanceof IfElseStat) {
        _matched=true;
        return this.translateIfElseStat(state, ((IfElseStat)statement));
      }
    }
    if (!_matched) {
      if (statement instanceof Expression) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        String _translateExpr = this.expressionGenerator.translateExpr(statement);
        _builder.append(_translateExpr);
        _builder.append(";");
        return _builder.toString();
      }
    }
    if (!_matched) {
      if (statement instanceof SwitchStat) {
        _matched=true;
        return this.translateSwitchCaseStat(state, ((SwitchStat)statement));
      }
    }
    if (!_matched) {
      if (statement instanceof StartProcStat) {
        _matched=true;
        return this.translateStartProcStat(((StartProcStat)statement));
      }
    }
    if (!_matched) {
      if (statement instanceof ResetStat) {
        _matched=true;
        return this.translateResetTimer();
      }
    }
    if (!_matched) {
      if (statement instanceof RestartStat) {
        _matched=true;
        return this.translateRestartProcStat();
      }
    }
    if (!_matched) {
      if (statement instanceof CompoundStatement) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("{");
        _builder.newLine();
        {
          EList<Statement> _statements = ((CompoundStatement)statement).getStatements();
          for(final Statement stat : _statements) {
            _builder.append("\t");
            String _translateStatement = this.translateStatement(state, stat);
            _builder.append(_translateStatement, "\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("}");
        _builder.newLine();
        return _builder.toString();
      }
    }
    return null;
  }
  
  public String translateIfElseStat(final State state, final IfElseStat stat) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("if (");
    String _translateExpr = this.expressionGenerator.translateExpr(stat.getCond());
    _builder.append(_translateExpr);
    _builder.append(") ");
    String _translateStatement = this.translateStatement(state, stat.getThen());
    _builder.append(_translateStatement);
    _builder.newLineIfNotEmpty();
    {
      Statement _else = stat.getElse();
      boolean _tripleNotEquals = (_else != null);
      if (_tripleNotEquals) {
        _builder.append("else ");
        String _translateStatement_1 = this.translateStatement(state, stat.getElse());
        _builder.append(_translateStatement_1);
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder.toString();
  }
  
  public String translateSwitchCaseStat(final State state, final SwitchStat stat) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("switch (");
    String _translateExpr = this.expressionGenerator.translateExpr(stat.getExpr());
    _builder.append(_translateExpr);
    _builder.append(") {");
    _builder.newLineIfNotEmpty();
    {
      EList<CaseStat> _options = stat.getOptions();
      for(final CaseStat variant : _options) {
        _builder.append("\t");
        _builder.append("case (");
        String _translateExpr_1 = this.expressionGenerator.translateExpr(variant.getOption());
        _builder.append(_translateExpr_1, "\t");
        _builder.append("): {");
        _builder.newLineIfNotEmpty();
        {
          EList<Statement> _statements = variant.getStatements();
          for(final Statement statement : _statements) {
            _builder.append("\t");
            _builder.append("\t");
            String _translateStatement = this.translateStatement(state, statement);
            _builder.append(_translateStatement, "\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        {
          boolean _isHasBreak = variant.isHasBreak();
          if (_isHasBreak) {
            _builder.append("break;");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    {
      boolean _hasDefaultOption = ReflexOldModelUtil.hasDefaultOption(stat);
      if (_hasDefaultOption) {
        _builder.append("default: {");
        _builder.newLineIfNotEmpty();
        {
          EList<Statement> _statements_1 = stat.getDefaultOption().getStatements();
          for(final Statement statement_1 : _statements_1) {
            _builder.append("\t");
            _builder.append("\t");
            String _translateStatement_1 = this.translateStatement(state, statement_1);
            _builder.append(_translateStatement_1, "\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("\t");
        {
          boolean _isHasBreak_1 = stat.getDefaultOption().isHasBreak();
          if (_isHasBreak_1) {
            _builder.append("break;");
          }
        }
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String translateResetTimer() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("reset timer;");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String translateSetStateStat(final State state, final SetStateStat sss) {
    boolean _isNext = sss.isNext();
    if (_isNext) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("set next state;");
      _builder.newLine();
      return _builder.toString();
    }
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("set state ");
    String _translateName = this.translateName(sss.getState().getName());
    _builder_1.append(_translateName);
    _builder_1.append(";");
    _builder_1.newLineIfNotEmpty();
    return _builder_1.toString();
  }
  
  public String translateStopProcStat(final StopProcStat sps) {
    boolean _selfStop = ReflexOldModelUtil.selfStop(sps);
    if (_selfStop) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("stop;");
      _builder.newLine();
      return _builder.toString();
    }
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("stop process ");
    String _translateName = this.translateName(sps.getProcess().getName());
    _builder_1.append(_translateName);
    _builder_1.append(";");
    _builder_1.newLineIfNotEmpty();
    return _builder_1.toString();
  }
  
  public String translateStartProcStat(final StartProcStat sps) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("start process ");
    String _translateName = this.translateName(sps.getProcess().getName());
    _builder.append(_translateName);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String translateRestartProcStat() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("restart;");
    _builder.newLine();
    return _builder.toString();
  }
  
  public boolean isStateLooped(final State state) {
    EList<Statement> _statements = state.getStateFunction().getStatements();
    for (final Statement statement : _statements) {
      boolean _hasLoop = this.hasLoop(statement);
      if (_hasLoop) {
        return true;
      }
    }
    return false;
  }
  
  public boolean hasLoop(final EObject statement) {
    boolean _matched = false;
    if (statement instanceof LoopStat) {
      _matched=true;
      return true;
    }
    if (!_matched) {
      if (statement instanceof IfElseStat) {
        _matched=true;
        boolean _hasLoop = this.hasLoop(((IfElseStat)statement).getThen());
        if (_hasLoop) {
          return true;
        }
        Statement _else = ((IfElseStat)statement).getElse();
        boolean _tripleNotEquals = (_else != null);
        if (_tripleNotEquals) {
          return this.hasLoop(((IfElseStat)statement).getElse());
        }
        return false;
      }
    }
    if (!_matched) {
      if (statement instanceof SwitchStat) {
        _matched=true;
        EList<CaseStat> _options = ((SwitchStat)statement).getOptions();
        for (final CaseStat variant : _options) {
          EList<Statement> _statements = variant.getStatements();
          for (final Statement stat : _statements) {
            boolean _hasLoop = this.hasLoop(stat);
            if (_hasLoop) {
              return true;
            }
          }
        }
        boolean _hasDefaultOption = ReflexOldModelUtil.hasDefaultOption(((SwitchStat)statement));
        if (_hasDefaultOption) {
          EList<Statement> _statements_1 = ((SwitchStat)statement).getDefaultOption().getStatements();
          for (final Statement stat_1 : _statements_1) {
            boolean _hasLoop_1 = this.hasLoop(stat_1);
            if (_hasLoop_1) {
              return true;
            }
          }
        }
        return false;
      }
    }
    if (!_matched) {
      if (statement instanceof CompoundStatement) {
        _matched=true;
        EList<Statement> _statements = ((CompoundStatement)statement).getStatements();
        for (final Statement stat : _statements) {
          boolean _hasLoop = this.hasLoop(stat);
          if (_hasLoop) {
            return true;
          }
        }
        return false;
      }
    }
    return false;
  }
}
