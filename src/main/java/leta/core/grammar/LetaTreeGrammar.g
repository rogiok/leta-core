tree grammar LetaTreeGrammar;

options {
  tokenVocab=LetaGrammar;
  ASTLabelType=CommonTree;
  output=template;
  k=3;
  backtrack=true;
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
    
    List<Element> elements = null;
  }
  : ^(TESTCASE ID sc=setClause? vc=verifyClause wc=whenClause)
    {
      if (this.semanticModel.findTestCase($ID.text) != null) {
        throw new FailedPredicateException(input, "testCase", "Nome do teste ja existe.");
      }

      testCase.setId($ID.text);
      testCase.setVerifyClause($vc.element);
      testCase.setWhenClause($wc.element);
      
      testCase.generateElements();
      
      elements = testCase.getElements();
    }
    -> generateTestCase(id={$ID.text}, objectId={$ID.text.substring(0,1).toLowerCase() + $ID.text.substring(1)}, verifyClause={vc}, whenClause={wc}, matrix={testCase.getMatrix()}, packageName={this.semanticModel.getPackageName()}, elements={elements}, date={new java.util.Date()})
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

setClause
  : ^(SET set)
    {
      Matrix m = this.semanticModel.getCurrentTestCase().newMatrix();
      
      m.addRows($set.items);
    }
  ;

factComposite returns [Element element]
  : ^('and' f=fact fc=factComposite)
    { $element = new JunctionElement("And", $f.element, $fc.element); }
  | ^('or' f=fact fc=factComposite)
    { $element = new JunctionElement("Or", $f.element, $fc.element); }
  | ^('and' fo=formula fc=factComposite)
    { $element = new JunctionElement("And", $fo.element, $fc.element); }
  | ^('or' fo=formula fc=factComposite)
    { $element = new JunctionElement("Or", $fo.element, $fc.element); }
  | ^('and' fc=factComposite fc2=factComposite)
    { $element = new JunctionElement("And", $fc.element, $fc2.element); }
  | ^('or' fc=factComposite fc2=factComposite)
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
      
        if (fe != null && $fe.methodElement != null) {
          $tc2.classElement.setMethodElement($fe.methodElement);
	      }
      }

      $element = $tc.classElement;
    }
  ;

factExt returns [MethodElement methodElement]
  : ^(FACTEXT c=complement (tc=termComposite fe=factExt?)?)
    {
      if (tc != null) {
        $c.methodElement.setClassElement($tc.classElement);
        
        if (fe != null && $fe.methodElement != null) {
          $tc.classElement.setMethodElement($fe.methodElement);
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
    }
  ;

termInstance returns [ClassElement classElement]
  : ^(TERMINSTANCE t=term neo=notEqualOperator? sl=stringLiteral)
    {
      $classElement = $t.classElement;
      $classElement.setRelationalOperator($neo.operator);
      
      if ($sl.stringValue != null)
        $classElement.setStringValue($sl.stringValue);
    }
  | ^(TERMINSTANCE t=term ro=relationalOperator? ol=otherLiteral)
    {
      $classElement = $t.classElement;
      $classElement.setRelationalOperator($ro.operator);
      
      if ($ol.floatValue != null)
        $classElement.setFloatValue($ol.floatValue);
      else if ($ol.intValue != null)
        $classElement.setIntValue($ol.intValue);
      else if ($ol.dateValue != null)
        $classElement.setDateValue($ol.dateValue);
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
        if (this.semanticModel.getCurrentTestCase().getMatrix().hasDateValue($classElement.getIndexOfSet()))
          $classElement.setDateValue("");
      }
    }
  ;
  
quantifier returns [String type, String operator, Integer value, Integer value2]
  : ^(QUANTIFIER 'atleast' INT)
    { $type = "atLeast"; $operator = ">="; $value = Integer.parseInt($INT.text); }
  | ^(QUANTIFIER 'atmost' INT)
    { $type = "atMost"; $operator = "<="; $value = Integer.parseInt($INT.text); }
  | ^(QUANTIFIER 'exactly' INT)
    { $type = "exactly"; $operator = "=="; $value = Integer.parseInt($INT.text); }
  | ^(QUANTIFIER 'atleastandatmost' v1=INT v2=INT)
    { $type = "atLeastAndAtMost"; $operator = ">=&<="; $value = Integer.parseInt($v1.text); $value2 = Integer.parseInt($v2.text); }
  ;

complement returns [MethodElement methodElement]
  : ^(COMPLEMENT ID)
    {
      $methodElement = new MethodElement($ID.text);
    }
  ;

formula returns [ClassElement element]
  : ^(FORMULA fi=formulaItem fe=formulaExpression)
    {
      $element = $fi.classElement;
      
      MethodElement me = new MethodElement("equals");
      me.setClassElement($fe.classElement);
      $element.setMethodElement(me);
    }
  ;

formulaExpression returns [ClassElement classElement]
  : ^(FORMULAEXPRESSION fi=formulaItem (mo=mathOperator fe=formulaExpression)?)
    {
      $classElement = $fi.classElement;
        
      if (mo != null) {
        MethodElement me = new MethodElement((
          $mo.operator.equals("+") ? "sum" : 
          $mo.operator.equals("-") ? "minus" : 
          $mo.operator.equals("*") ? "multiply" : 
          $mo.operator.equals("/") ? "divide" : 
          $mo.operator.equals("\%") ? "remainder" : "power"));
          
        me.setClassElement($fe.classElement);
        
        $classElement.setMethodElement(me);
      }
    }
  | ^(FORMULAEXPRESSION fe=formulaExpression (mo=mathOperator fe2=formulaExpression)?)
    {
      $classElement = $fe.classElement;
        
      if (mo != null) {
        MethodElement me = new MethodElement((
          $mo.operator.equals("+") ? "sum" : 
          $mo.operator.equals("-") ? "minus" : 
          $mo.operator.equals("*") ? "multiply" : 
          $mo.operator.equals("/") ? "divide" : 
          $mo.operator.equals("\%") ? "remainder" : "power"));
          
        me.setClassElement($fe2.classElement);
        
        $classElement.setMethodElement(me);
      }
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
    { $operator = "MoreOrEqualThan"; }
  | ^(OPERATOR '<=')
    { $operator = "LessOrEqualThan"; }
  | notEqualOperator
  ;

notEqualOperator returns [String operator]
  : ^(OPERATOR '!=')
    { $operator = "NotEqual"; }
  ;

set returns [ArrayList<MatrixItem> items = new ArrayList<MatrixItem>()]
  : ^(SET ls=list s=set?)
    {
      $items.add($ls.matrixItem);
      
      if (s != null)
       $items.addAll($s.items); 
    }
  ;

list returns [MatrixItem matrixItem = new MatrixItem()]
  : ^(LIST sl=stringLiteral? ol=otherLiteral? ss=list? )
    {
      if (sl != null && $sl.stringValue != null)
        $matrixItem.addColumn($sl.stringValue);

      if (ol != null)
	      if ($ol.intValue != null)
	        $matrixItem.addColumn($ol.intValue);
	      else if ($ol.floatValue != null)
	        $matrixItem.addColumn($ol.floatValue);
	      else if ($ol.dateValue != null)
	        $matrixItem.addColumn($ol.dateValue);
        
      if (ss != null)
        $matrixItem.addColumns($ss.matrixItem.getColumns());
    }
  ;

stringLiteral returns [String stringValue]
  : ^(LITERAL STRING)
    { $stringValue = $STRING.text; }
  | ^(LITERAL NULL)
  ;

otherLiteral returns [Integer intValue, Double floatValue, String dateValue]
  : ^(LITERAL FLOAT)
    { $floatValue = new Double($FLOAT.text); }
  | ^(LITERAL MINUS_FLOAT)
    { $floatValue = new Double($MINUS_FLOAT.text); }
  | ^(LITERAL INT)
    { $intValue = new Integer($INT.text); }
  | ^(LITERAL MINUS_INT)
    { $intValue = new Integer($MINUS_INT.text); }
  | ^(LITERAL DATE_TIME)
    { $dateValue = $DATE_TIME.text; }
  | ^(LITERAL NULL)
  ;

testPackage
  : ^(PACKAGE PACKAGE_ID)
    {
      this.semanticModel.setPackageName($PACKAGE_ID.text.replaceAll("'", ""));
    }
  ;

