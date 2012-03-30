grammar LetaGrammar;

options {
  language=Java;
  output=AST;
  k=3;
  backtrack=true;
}

tokens {
  LETA;
  STMT;
  TESTCASE;
  WHEN;
  VERIFY;
  SET;
  FACTCOMPOSITE;
  CONJUNCTION;
  DISJUNCTION;
  FACT;
  FACTEXT;
  FACTUNARY;
  FACTBINARY;
  FACTNARY;
  TERMCOMPOSITE;
  FORMULA;
  TERM;
  TERMINSTANCE;
  TERMWITHASSOCIATION;
  COMPLEMENT;
  NULL;
  LITERAL;
  QUANTIFIER;
  FORMULAEXPRESSION;
  FORMULAEXPRESSIONCOMPOSITE;
  FORMULAITEM;
  OPERATOR;
  SET;
  LIST;
  AND;
  OR;
  PACKAGE;
}

@header {
  package leta.core.grammar;
  
  import leta.core.model.*;
}

@lexer::header {
  package leta.core.grammar;
  
  import leta.core.model.*;
}

@members {

  private SyntaxMessageManager syntaxMessageManager = SyntaxMessageManager.getInstance();

  public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
    String msg = getErrorMessage(e, tokenNames);
    msg = ErrorMessage.getErrorMessage(e, tokenNames, msg);
    syntaxMessageManager.add(new SyntaxMessage(e.line, e.charPositionInLine, e.token != null ? e.token.getText() : null, msg));
  }

  /*
  public void reportError(RecognitionException e) {
    displayRecognitionError(this.getTokenNames(), e);
  }
  
  public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
    String msg = getErrorMessage(e, tokenNames);
    errorMessages.add(new SyntaxMessage(e.line, e.charPositionInLine, e.token.getText(), msg));
  }
  
  public String getErrorMessage(RecognitionException e, String[] tokenNames) {
    String msg = super.getErrorMessage(e, tokenNames);
    
    System.out.println("error message");
    
    errorMessages.add(new SyntaxMessage(e.line, e.charPositionInLine, e.token.getText(), msg));
    
    return msg;
  }
  
  public void reportError(RecognitionException e) {
    state.syntaxErrors++; // don't count spurious
    state.errorRecovery = true;

    displayRecognitionError(this.getTokenNames(), e);
  }

  public void reportError(RecognitionException e) {
    errorMessages.add(new SyntaxMessage(e.line, e.charPositionInLine, e.token.getText(), e.getMessage()));
    
    super.reportError(e);
  }*/

}

@lexer::members {

  private SyntaxMessageManager syntaxMessageManager = SyntaxMessageManager.getInstance();

  public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
    String msg = getErrorMessage(e, tokenNames);
    msg = ErrorMessage.getErrorMessage(e, tokenNames, msg);
    syntaxMessageManager.add(new SyntaxMessage(e.line, e.charPositionInLine, e.token != null ? e.token.getText() : null, msg));
  }

}

//@rulecatch {
//  catch (RecognitionException re) {
//    reportError(re);
//    
//    errorMessages.add(new SyntaxMessage(re.line, re.charPositionInLine, re.token.getText(), null));
//    
//    recover(input,re);
//    retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
//  }
//}

leta
  : testPackage? testCase+ 
    -> ^(LETA testPackage? testCase+)
  ;

testCase
  : 'test' ID verifyClause whenClause setClause?
    -> ^(TESTCASE ID setClause? verifyClause whenClause)
  ;

verifyClause
  : 'verify' factComposite
    -> ^(VERIFY factComposite)
  ;

whenClause
  : 'when' factComposite
    -> ^(WHEN factComposite)
  ;

setClause
  : 'set' '{' (s=set)? '}'
    -> ^(SET $s)
  ;

factComposite
  : (f=fact | fo=formula) (op=logicalOperator fc=factComposite)?
    -> {op != null && op.value.equals("And") && f != null}? ^('and' $f $fc)
    -> {op != null && op.value.equals("Or") && f != null}? ^('or' $f $fc)
    -> {op != null && op.value.equals("And") && fo != null}? ^('and' $fo $fc)
    -> {op != null && op.value.equals("Or") && fo != null}? ^('or' $fo $fc)
    -> {f != null}? ^(FACTCOMPOSITE $f)
    -> ^(FACTCOMPOSITE $fo)
  | '(' fc1=factComposite ')' (op=logicalOperator fc2=factComposite)?
    -> {op != null && op.value.equals("And")}? ^('and' $fc1 $fc2)
    -> {op != null && op.value.equals("Or")}? ^('or' $fc1 $fc2)
    -> ^(FACTCOMPOSITE $fc1)
  ;

logicalOperator returns [String value]
  : 'and'
    { $value = "And"; }
  | 'or'
    { $value = "Or"; }
  ;

fact
  : tc=termComposite c=complement (tc2=termComposite fe=factExt?)?
    -> ^(FACT $tc $c ($tc2 $fe?)?)
  ;

factExt
  : complement (termComposite factExt?)?
    -> ^(FACTEXT complement (termComposite factExt?)?)
  ;

termComposite
  : quantifier? (t=term | ti=termInstance | twa=termWithAssociation)
    -> {t != null}? ^(TERMCOMPOSITE quantifier? term)
    -> {ti != null}? ^(TERMCOMPOSITE quantifier? termInstance)
    -> ^(TERMCOMPOSITE quantifier? termWithAssociation)
  ;

term
  : ID
    -> ^(TERM ID)
  ;

termInstance
  : term notEqualOperator? stringLiteral
    -> ^(TERMINSTANCE term notEqualOperator? stringLiteral)
  | term relationalOperator? otherLiteral
    -> ^(TERMINSTANCE term relationalOperator? otherLiteral)
  ;

termWithAssociation
  : term relationalOperator? '@' INT
    -> ^(TERMWITHASSOCIATION term relationalOperator? INT)
  ;
  
quantifier
  : 'atleast' INT
    -> ^(QUANTIFIER 'atleast' INT)
  | 'atmost' INT
    -> ^(QUANTIFIER 'atmost' INT)
  | 'exactly' INT
    -> ^(QUANTIFIER 'exactly' INT)
  | 'atleastandatmost' i1=INT i2=INT
    -> ^(QUANTIFIER 'atleastandatmost' $i1 $i2)
  ;

complement
  : ID
    -> ^(COMPLEMENT ID)
  ;

formula
  : formulaItem '=' formulaExpression
    -> ^(FORMULA formulaItem formulaExpression)
  ;

formulaExpression
  : formulaItem (mathOperator formulaExpression)?
    -> ^(FORMULAEXPRESSION formulaItem (mathOperator formulaExpression)?)
  | '(' formulaExpression ')' (mathOperator formulaExpression)? 
    -> ^(FORMULAEXPRESSION formulaExpression (mathOperator formulaExpression)?)
  ;

formulaItem
  : (term | termInstance | termWithAssociation)
    -> ^(FORMULAITEM term? termInstance? termWithAssociation?)
  ;

mathOperator
  : '+'
    -> ^(OPERATOR '+')
  | '-'
    -> ^(OPERATOR '-')
  | '/'
    -> ^(OPERATOR '/')
  | '*'
    -> ^(OPERATOR '*')
  | '%'
    -> ^(OPERATOR '%')
  | '**'
    -> ^(OPERATOR '**')
  ;

relationalOperator
  : '>'
    -> ^(OPERATOR '>')
  | '<'
    -> ^(OPERATOR '<')
  | '>='
    -> ^(OPERATOR '>=')
  | '<='
    -> ^(OPERATOR '<=')
  | notEqualOperator
  ;

notEqualOperator
  : '!='
    -> ^(OPERATOR '!=')
  ;

set
  : '{' list '}' (',' set)?
    -> ^(SET list set?)
  ;

list
  : (stringLiteral | otherLiteral) (',' list)?
    -> ^(LIST stringLiteral? otherLiteral? list?)
  ;

stringLiteral
  : STRING
    -> ^(LITERAL STRING)
  | 'null'
    -> ^(LITERAL NULL)
  ;

otherLiteral
  : FLOAT
    -> ^(LITERAL FLOAT)
  | MINUS_FLOAT
    -> ^(LITERAL MINUS_FLOAT)
  | INT
    -> ^(LITERAL INT)
  | MINUS_INT
    -> ^(LITERAL MINUS_INT)
  | DATE_TIME
    -> ^(LITERAL DATE_TIME)
  | 'null'
    -> ^(LITERAL NULL)
  ;

testPackage
  : 'package' PACKAGE_ID
    -> ^(PACKAGE PACKAGE_ID)
  ;

ID
  : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*
  ;

fragment
DIGIT
  : '0'..'9'
  ;

INT
  : DIGIT+
  ;

MINUS_INT
  : '-' DIGIT+
  ;

FLOAT
  : DIGIT+ '\.' DIGIT*
  ;

MINUS_FLOAT
  : '-' DIGIT+ '\.' DIGIT*
  ;

STRING
  : '"' (ESC_SEQ | ~('"' | '\\'))* '"'
  ;

DATE_TIME
  : '[' DIGIT+ ('-' DIGIT+ ('-' DIGIT+)?)? (' ' DIGIT+ ':' DIGIT+ (':' DIGIT+ ('.' DIGIT+)?)? ('AM' | 'PM')? (('+' | '-') DIGIT+ ':' DIGIT+)?)? ']'
  ;

PACKAGE_ID
  : ID ('.' ID)*
  ;

COMMENT
  : '/*' (options {greedy=false;} : .)* '*/' {$channel = HIDDEN;}
  ;

LINE_COMMENT
  : '//' (~'\n')* '\n' {$channel = HIDDEN;}
  ;

WS
  : (' ' | '\t' | '\n' | '\r')+ { $channel=HIDDEN; }
  ;

fragment  
HEX_DIGIT 
  : ('0'..'9'|'a'..'f'|'A'..'F');  
  
fragment  
ESC_SEQ 
  : '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') 
  | UNICODE_ESC 
  | OCTAL_ESC
  ;  
  
fragment  
OCTAL_ESC
  : '\\' ('0'..'3') ('0'..'7') ('0'..'7')
  | '\\' ('0'..'7') ('0'..'7')
  | '\\' ('0'..'7')
  ;  
  
fragment  
UNICODE_ESC 
  : '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
  ;

  