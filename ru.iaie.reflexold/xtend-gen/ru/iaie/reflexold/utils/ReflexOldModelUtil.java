package ru.iaie.reflexold.utils;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import ru.iaie.reflexold.reflexOld.CompoundStatement;
import ru.iaie.reflexold.reflexOld.Const;
import ru.iaie.reflexold.reflexOld.DefaultStat;
import ru.iaie.reflexold.reflexOld.EnumMember;
import ru.iaie.reflexold.reflexOld.ErrorStat;
import ru.iaie.reflexold.reflexOld.Expression;
import ru.iaie.reflexold.reflexOld.IdReference;
import ru.iaie.reflexold.reflexOld.ImportedVariableList;
import ru.iaie.reflexold.reflexOld.PhysicalVariable;
import ru.iaie.reflexold.reflexOld.Port;
import ru.iaie.reflexold.reflexOld.PortMapping;
import ru.iaie.reflexold.reflexOld.PortType;
import ru.iaie.reflexold.reflexOld.ProcessVariable;
import ru.iaie.reflexold.reflexOld.Program;
import ru.iaie.reflexold.reflexOld.ProgramVariable;
import ru.iaie.reflexold.reflexOld.State;
import ru.iaie.reflexold.reflexOld.Statement;
import ru.iaie.reflexold.reflexOld.StopProcStat;
import ru.iaie.reflexold.reflexOld.SwitchStat;
import ru.iaie.reflexold.reflexOld.TimeoutFunction;
import ru.iaie.reflexold.reflexOld.Type;

@SuppressWarnings("all")
public class ReflexOldModelUtil {
  public static Program getProgram(final Resource resource) {
    return ((Program[])Conversions.unwrapArray((Iterables.<Program>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Program.class)), Program.class))[0];
  }
  
  public static boolean isEnglish(final Program p) {
    return p.isEn();
  }
  
  public static boolean hasValue(final EnumMember em) {
    Expression _value = em.getValue();
    return (_value != null);
  }
  
  public static boolean selfStop(final StopProcStat sps) {
    ru.iaie.reflexold.reflexOld.Process _process = sps.getProcess();
    return (_process == null);
  }
  
  public static boolean selfError(final ErrorStat es) {
    ru.iaie.reflexold.reflexOld.Process _process = es.getProcess();
    return (_process == null);
  }
  
  public static boolean isClearTimeout(final TimeoutFunction f) {
    String _time = f.getTime();
    return (_time != null);
  }
  
  public static boolean isReferencedTimeout(final TimeoutFunction f) {
    IdReference _ref = f.getRef();
    return (_ref != null);
  }
  
  public static boolean hasTimeout(final State s) {
    TimeoutFunction _timeoutFunction = s.getTimeoutFunction();
    return (_timeoutFunction != null);
  }
  
  public static boolean hasDefaultOption(final SwitchStat s) {
    DefaultStat _defaultOption = s.getDefaultOption();
    return (_defaultOption != null);
  }
  
  public static boolean isShared(final ProcessVariable v) {
    boolean _matched = false;
    if (v instanceof ProgramVariable) {
      _matched=true;
      return ((ProgramVariable)v).isShared();
    }
    if (!_matched) {
      if (v instanceof PhysicalVariable) {
        _matched=true;
        return ((PhysicalVariable)v).isShared();
      }
    }
    return false;
  }
  
  /**
   * def static boolean hasLogicalNot(CheckStateExpression cse) {
   * return cse.logicalNot
   * }
   */
  public static List<ProcessVariable> getImportedVariables(final ru.iaie.reflexold.reflexOld.Process p) {
    final Function1<ImportedVariableList, EList<ProcessVariable>> _function = (ImportedVariableList it) -> {
      return it.getVariables();
    };
    return IterableExtensions.<ProcessVariable>toList(Iterables.<ProcessVariable>concat(ListExtensions.<ImportedVariableList, EList<ProcessVariable>>map(p.getImports(), _function)));
  }
  
  public static ru.iaie.reflexold.reflexOld.Process getProcess(final ProcessVariable v) {
    return EcoreUtil2.<ru.iaie.reflexold.reflexOld.Process>getContainerOfType(v, ru.iaie.reflexold.reflexOld.Process.class);
  }
  
  public static Type getType(final ProcessVariable v) {
    if ((v instanceof PhysicalVariable)) {
      return ((PhysicalVariable)v).getType();
    }
    if ((v instanceof ProgramVariable)) {
      return ((ProgramVariable)v).getType();
    }
    return null;
  }
  
  public static String getName(final ProcessVariable v) {
    if ((v instanceof ProgramVariable)) {
      return ((ProgramVariable)v).getName();
    }
    if ((v instanceof PhysicalVariable)) {
      return ((PhysicalVariable)v).getName();
    }
    return null;
  }
  
  public static boolean isImportedList(final ProcessVariable v) {
    return (v instanceof ImportedVariableList);
  }
  
  public static boolean isPhysical(final ProcessVariable v) {
    return (v instanceof PhysicalVariable);
  }
  
  public static PortType getMappedPortType(final PhysicalVariable v) {
    return v.getMapping().getPort().getType();
  }
  
  public static boolean isFullMapping(final PortMapping m) {
    String _bits = m.getBits();
    String _size = m.getPort().getSize();
    return Objects.equal(_bits, _size);
  }
  
  public static boolean isSingleBitMapping(final PortMapping m) {
    int _intValue = Long.valueOf(LiteralUtil.parseInteger(m.getBits())).intValue();
    return (_intValue == 1);
  }
  
  public static boolean isEmpty(final CompoundStatement compStat) {
    return IterableExtensions.isEmpty(IterableExtensions.<Statement>reject(EcoreUtil2.<Statement>eAllOfType(compStat, Statement.class), CompoundStatement.class));
  }
  
  public static boolean hasTimeoutReaction(final State state) {
    TimeoutFunction _timeoutFunction = state.getTimeoutFunction();
    return (_timeoutFunction != null);
  }
  
  public static int getIndex(final ru.iaie.reflexold.reflexOld.Process p) {
    return EcoreUtil2.<Program>getContainerOfType(p, Program.class).getProcesses().indexOf(p);
  }
  
  public static int getIndex(final State s) {
    return EcoreUtil2.<ru.iaie.reflexold.reflexOld.Process>getContainerOfType(s, ru.iaie.reflexold.reflexOld.Process.class).getStates().indexOf(s);
  }
  
  public static boolean isEnumMemberLast(final EnumMember m, final ru.iaie.reflexold.reflexOld.Enum e) {
    int _indexOf = e.getEnumMembers().indexOf(m);
    int _length = ((Object[])Conversions.unwrapArray(e.getEnumMembers(), Object.class)).length;
    int _minus = (_length - 1);
    return (_indexOf == _minus);
  }
  
  public static Type resolveType(final IdReference ref) {
    boolean _matched = false;
    if (ref instanceof Const) {
      _matched=true;
      return Type.DOUBLE_EN;
    }
    if (!_matched) {
      if (ref instanceof PhysicalVariable) {
        _matched=true;
        return ((PhysicalVariable)ref).getType();
      }
    }
    if (!_matched) {
      if (ref instanceof ProgramVariable) {
        _matched=true;
        return ((ProgramVariable)ref).getType();
      }
    }
    if (!_matched) {
      if (ref instanceof EnumMember) {
        _matched=true;
        return Type.LONG_EN;
      }
    }
    return null;
  }
  
  /**
   * def static boolean hasTimeFormat(ClockDefinition clck) {
   * return clck.timeValue !== null
   * }
   */
  public static Type getSuitableTypeForPort(final Port p) {
    int _intValue = Long.valueOf(LiteralUtil.parseInteger(p.getSize())).intValue();
    switch (_intValue) {
      case 8:
        return Type.SHORT_EN;
      case 16:
        return Type.INT_EN;
      default:
        throw new IllegalStateException();
    }
  }
  
  public static boolean containsReferencesOfType(final EObject context, final EObject target, final EReference refType) {
    final HashSet<EObject> targetSet = CollectionLiterals.<EObject>newHashSet(target);
    final ArrayList<EObject> refered = CollectionLiterals.<EObject>newArrayList();
    final EcoreUtil2.ElementReferenceAcceptor _function = (EObject referrer, EObject referenced, EReference reference, int index) -> {
      boolean _equals = Objects.equal(reference, refType);
      if (_equals) {
        refered.add(referrer);
      }
    };
    final EcoreUtil2.ElementReferenceAcceptor acceptor = _function;
    EcoreUtil2.findCrossReferences(context, targetSet, acceptor);
    boolean _isEmpty = refered.isEmpty();
    return (!_isEmpty);
  }
}
