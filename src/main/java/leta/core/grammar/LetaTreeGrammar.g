tree grammar LetaTreeGrammar;

options {
  tokenVocab=LetaGrammar;
  ASTLabelType=CommonTree;
  output=template;
}

@header {
  package leta.core.grammar;
  
  import leta.core.model.*;
}

@members {
  private SemanticModel semanticModel = new SemanticModel();
  
  public SemanticModel getSemanticModel() {
    return this.semanticModel;
  }

  private boolean foundErrors = false;

  public boolean hasFoundErrors() {
    return this.foundErrors;
  }
  
  public String getErrorMessage(RecognitionException e, String[] tokenNames) {
    foundErrors = true;

    String msg = super.getErrorMessage(e, tokenNames);
    return msg;
  }  
}

leta
  : ^(LETA testPackage? testCases+=testCase+)
    -> generateLeta(testCases={$testCases})
  ;

testCase
  @init {
    TestCase testCase = new TestCase();
    
    this.semanticModel.addTestCase(testCase);
  }
  : ^(TESTCASE ID sc=setClause? vc=verifyClause wc=whenClause)
    {
      if (this.semanticModel.hasTestCase($ID.text)) {
        throw new FailedPredicateException(input, "testCase", "Nome do teste ja existe.");
      }

      testCase.setId($ID.text);
      testCase.setVerifyClause($vc.element);
      testCase.setWhenClause($wc.element);
      
      testCase.generateElements();
      
      this.semanticModel.resetSequence();
      
      List<Element> elements = testCase.getElements();
    }
    -> generateTestCase(id={$ID.text}, verifyClause={vc}, whenClause={wc}, setClause={sc}, packageName={this.semanticModel.getPackageName()}, elements={elements})
  ;

verifyClause returns [Element element]
  : ^(VERIFY fc=factComposite)
    {
      $element = $fc.element;
    }
  ;

whenClause returns [Element element]
  : ^(WHEN fc=factComposite)
    {
      $element = $fc.element;
    }
  ;

setClause returns [Matrix matrix]
  : ^(SET set)
    {
      Matrix m = new Matrix();
      
      m.addRows($set.items);
      
      this.semanticModel.getCurrentTestCase().setMatrix(m);
      
      $matrix = m;
    }
  ;

factComposite returns [Element element]
  @after {
    if ($element instanceof SequenceCode) {
      this.semanticModel.addSequenceCode((SequenceCode) $element);
    }
  }
  : ^('And' f=fact fc=factComposite)
    { $element = new JunctionElement("And", $f.element, $fc.element); }
  | ^('Or' f=fact fc=factComposite)
    { $element = new JunctionElement("Or", $f.element, $fc.element); }
  | ^('And' fo=formula fc=factComposite)
    { $element = new JunctionElement("And", $fo.element, $fc.element); }
  | ^('Or' fo=formula fc=factComposite)
    { $element = new JunctionElement("Or", $fo.element, $fc.element); }
  | ^('And' fc=factComposite fc2=factComposite)
    { $element = new JunctionElement("And", $fc.element, $fc2.element); }
  | ^('Or' fc=factComposite fc2=factComposite)
    { $element = new JunctionElement("Or", $fc.element, $fc2.element); }
  | ^(FACTCOMPOSITE f=fact)
    { $element = $f.element; }
  | ^(FACTCOMPOSITE fo=formula)
    { $element = $fo.element; }
  | ^(FACTCOMPOSITE fc=factComposite)
    { $element = $fc.element; }
  ;

fact returns [Element element]
  : ^(FACT tc=termComposite c=complement (tc2=termComposite fe=factExt?)?)
    {
      $tc.classElement.setMethodElement($c.methodElement);
      
      if (tc2 != null) {
        $c.methodElement.setClassElement($tc2.classElement);
      
        if (fe != null) {
          if ($fe.methodElement != null) {
            $tc2.classElement.setMethodElement($fe.methodElement);
	        } else if ($fe.classElement != null) {
            $tc2.classElement.setNext($fe.classElement);
            $tc2.classElement.setMethodElement($fe.classElement.getMethodElement());
	        }
	      }
      }

      $element = $tc.classElement;
    }
  ;

factExt 
  returns [MethodElement methodElement, ClassElement classElement]
  : ^(FACTEXT SEPARATOR tc=termComposite fe=factExt?)
    {
      if (fe != null) {
	      // Verifica se existe um factExt.methodElement
        if ($fe.methodElement != null) {
          $tc.classElement.setMethodElement($fe.methodElement);
	      } else if ($fe.classElement != null) {
          $tc.classElement.setNext($fe.classElement);
          $tc.classElement.setMethodElement($fe.classElement.getMethodElement());
	      }
      }
      
      $classElement = $tc.classElement;
    }
  | ^(FACTEXT c=complement (tc=termComposite fe=factExt?)?)
    {
      if (tc != null) {
        $c.methodElement.setClassElement($tc.classElement);
        
        if (fe != null) {
          if ($fe.methodElement != null) {
            $tc.classElement.setMethodElement($fe.methodElement);
		      } else if ($fe.classElement != null) {
		        $tc.classElement.setNext($fe.classElement);
		        $tc.classElement.setMethodElement($fe.classElement.getMethodElement());
		      }
	      }
      }

      $methodElement = $c.methodElement;
    }
  ;

termComposite returns [ClassElement classElement]
  : ^(TERMCOMPOSITE q=quantifier? t=term? ti=termInstance? twa=termWithAssociation?)
    {
      if ($t.classElement != null)
        $classElement = $t.classElement;
      else if ($ti.classElement != null)
        $classElement = $ti.classElement;
      else
        $classElement = $twa.classElement;
        
      if (q != null)
        if (q.value2 == null)
          $classElement.setQuantifier(new Quantifier($q.type, $q.operator, $q.value));
        else
          $classElement.setQuantifier(new Quantifier($q.type, $q.operator, $q.value, $q.value2));
    }
  ;

term returns [ClassElement classElement]
  : ^(TERM ID)
    {
      $classElement = new ClassElement($ID.text);
      
      this.semanticModel.addSequenceCode((SequenceCode) $classElement);
    }
  ;

termInstance returns [ClassElement classElement]
  : ^(TERMINSTANCE t=term ro=relationalOperator? l=literal)
    {
      $classElement = $t.classElement;
      $classElement.setRelationalOperator($ro.operator);
      
      if ($l.stringValue != null)
        $classElement.setStringValue($l.stringValue);
      else if ($l.floatValue != null)
        $classElement.setFloatValue($l.floatValue);
      else if ($l.intValue != null)
        $classElement.setIntValue($l.intValue);
    }
  ;

termWithAssociation returns [ClassElement classElement]
  : ^(TERMWITHASSOCIATION t=term ro=relationalOperator? INT)
    {
      $classElement = $t.classElement;
      $classElement.setRelationalOperator($ro.operator);
      $classElement.setIndexOfSet(Integer.parseInt($INT.text));
      
      if ($classElement.getIndexOfSet() > 0 && this.semanticModel.getCurrentTestCase().getMatrix() != null) {
	      if (this.semanticModel.getCurrentTestCase().getMatrix().hasStringValue($classElement.getIndexOfSet()))
	        $classElement.setStringValue("");
	      if (this.semanticModel.getCurrentTestCase().getMatrix().hasIntegerValue($classElement.getIndexOfSet()))
	        $classElement.setIntValue(0);
	      if (this.semanticModel.getCurrentTestCase().getMatrix().hasFloatValue($classElement.getIndexOfSet()))
	        $classElement.setFloatValue(0.0);
      }
    }
  ;
  
quantifier returns [String type, String operator, Integer value, Integer value2]
  : ^(QUANTIFIER 'each')
    { $type = "each"; $operator = "=="; }
  | ^(QUANTIFIER 'some')
    { $type = "some"; $operator = "=="; }
  | ^(QUANTIFIER 'atLeastOne')
    { $type = "atLeastOne"; $operator = ">="; }
  | ^(QUANTIFIER 'atLeast' INT)
    { $type = "atLeast"; $operator = ">="; $value = Integer.parseInt($INT.text); }
  | ^(QUANTIFIER 'atMostOne')
    { $type = "atMostOne"; $operator = "<="; }
  | ^(QUANTIFIER 'atMost' INT)
    { $type = "atMost"; $operator = "<="; $value = Integer.parseInt($INT.text); }
  | ^(QUANTIFIER 'exactlyOne')
    { $type = "exactlyOne"; $operator = "=="; }
  | ^(QUANTIFIER 'exactly' INT)
    { $type = "exactly"; $operator = "=="; $value = Integer.parseInt($INT.text); }
  | ^(QUANTIFIER 'moreThanOne')
    { $type = "moreThanOne"; $operator = ">="; }
  | ^(QUANTIFIER 'atLeastAndAtMost' v1=INT v2=INT)
    { $type = "atLeastAndAtMost"; $operator = ">=&<="; $value = Integer.parseInt($v1.text); $value2 = Integer.parseInt($v2.text); }
  ;

complement returns [MethodElement methodElement]
  : ^(COMPLEMENT ID)
    {
      $methodElement = new MethodElement($ID.text);
    }
  ;

formula returns [Element element]
  : ^(FORMULA fi=formulaItem fe=formulaExpression)
    {
      $element = new OperatorElement("equals", $fi.classElement, $fe.element);
    }
  ;

formulaExpression returns [Element element]
  : ^(FORMULAEXPRESSION fi=formulaItem (mo=mathOperator fe=formulaExpression)?)
    {
      if (mo != null)
        $element = new OperatorElement((
          $mo.operator.equals("+") ? "sum" : 
          $mo.operator.equals("-") ? "minus" : 
          $mo.operator.equals("*") ? "multiply" : 
          $mo.operator.equals("/") ? "divide" : "power"), $fi.classElement, $fe.element);
      else
        $element = $fi.classElement;
    }
  | ^(FORMULAEXPRESSION fe=formulaExpression (mo=mathOperator fe2=formulaExpression)?)
    {
      $element = new OperatorElement((
        $mo.operator.equals("+") ? "sum" : 
        $mo.operator.equals("-") ? "minus" : 
        $mo.operator.equals("*") ? "multiply" : 
        $mo.operator.equals("/") ? "divide" : "power"), $fe.element, $fe2.element);
    }
  ;

formulaItem returns [ClassElement classElement]
  : ^(FORMULAITEM t=term? ti=termInstance? twa=termWithAssociation?)
    {
      if (t != null)
        $classElement = $t.classElement;
      else if (ti != null)
        $classElement = $ti.classElement;
      else if (twa != null)
        $classElement = $twa.classElement;
      else
        $classElement = null;
    }
  ;

mathOperator returns [String operator]
  : ^(OPERATOR '+')
    { $operator = "+"; }
  | ^(OPERATOR '-')
    { $operator = "-"; }
  | ^(OPERATOR '/')
    { $operator = "/"; }
  | ^(OPERATOR '*')
    { $operator = "*"; }
  | ^(OPERATOR '%')
    { $operator = "\%"; }
  | ^(OPERATOR '**')
    { $operator = "**"; }
  ;

relationalOperator returns [String operator]
  : ^(OPERATOR '>')
    { $operator = "MoreThan"; }
  | ^(OPERATOR '<')
    { $operator = "LessThan"; }
  | ^(OPERATOR '>=')
    { $operator = "EqualOrMoreThan"; }
  | ^(OPERATOR '<=')
    { $operator = "EqualOrLessThan"; }
  | ^(OPERATOR '!=')
    { $operator = "NotEqual"; }
  ;

set returns [ArrayList<MatrixItem> items = new ArrayList<MatrixItem>()]
  : ^(SET sb=subSet s=set?)
    {
      $items.add($sb.matrixItem);
      
      if (s != null)
       $items.addAll($s.items); 
    }
  ;

subSet returns [MatrixItem matrixItem = new MatrixItem()]
  : ^(SUBSET lt=literal ss=subSet? )
    {
      if ($lt.stringValue != null)
        $matrixItem.addColumn($lt.stringValue);
      else if ($lt.intValue != null)
        $matrixItem.addColumn($lt.intValue);
      if ($lt.floatValue != null)
        $matrixItem.addColumn($lt.floatValue);

      if (ss != null)
        $matrixItem.addColumns($ss.matrixItem.getColumns());
    }
  ;

literal returns [String stringValue, Integer intValue, Double floatValue]
  : ^(LITERAL STRING)
    { $stringValue = $STRING.text; }
  | ^(LITERAL FLOAT)
    { $floatValue = new Double($FLOAT.text); }
  | ^(LITERAL MINUS_FLOAT)
    { $floatValue = new Double($MINUS_FLOAT.text); }
  | ^(LITERAL INT)
    { $intValue = new Integer($INT.text); }
  | ^(LITERAL MINUS_INT)
    { $intValue = new Integer($MINUS_INT.text); }
  | ^(LITERAL NULL)
  ;

testPackage
  : ^(PACKAGE PACKAGE_ID)
    {
      this.semanticModel.setPackageName($PACKAGE_ID.text.replaceAll("'", ""));
    }
  ;
