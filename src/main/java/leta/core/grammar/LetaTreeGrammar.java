// $ANTLR 3.3 Nov 30, 2010 12:46:29 /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g 2012-05-16 19:28:13

  package leta.core.grammar;
  
  import leta.core.model.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class LetaTreeGrammar extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LETA", "STMT", "TESTCASE", "WHEN", "VERIFY", "SET", "FACTCOMPOSITE", "CONJUNCTION", "DISJUNCTION", "FACT", "FACTEXT", "FACTUNARY", "FACTBINARY", "FACTNARY", "TERMCOMPOSITE", "FORMULA", "TERM", "TERMINSTANCE", "TERMWITHASSOCIATION", "COMPLEMENT", "NULL", "LITERAL", "QUANTIFIER", "FORMULAEXPRESSION", "FORMULAEXPRESSIONCOMPOSITE", "FORMULAITEM", "OPERATOR", "LIST", "AND", "OR", "PACKAGE", "ID", "INT", "STRING", "FLOAT", "MINUS_FLOAT", "MINUS_INT", "DATE_TIME", "PACKAGE_ID", "DIGIT", "ESC_SEQ", "COMMENT", "LINE_COMMENT", "WS", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'test'", "'verify'", "'when'", "'set'", "'{'", "'}'", "'('", "')'", "'and'", "'or'", "'@'", "'atleast'", "'atmost'", "'exactly'", "'atleastandatmost'", "'='", "'+'", "'-'", "'/'", "'*'", "'%'", "'**'", "'>'", "'<'", "'>='", "'<='", "'!='", "','", "'null'", "'package'"
    };
    public static final int EOF=-1;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int LETA=4;
    public static final int STMT=5;
    public static final int TESTCASE=6;
    public static final int WHEN=7;
    public static final int VERIFY=8;
    public static final int SET=9;
    public static final int FACTCOMPOSITE=10;
    public static final int CONJUNCTION=11;
    public static final int DISJUNCTION=12;
    public static final int FACT=13;
    public static final int FACTEXT=14;
    public static final int FACTUNARY=15;
    public static final int FACTBINARY=16;
    public static final int FACTNARY=17;
    public static final int TERMCOMPOSITE=18;
    public static final int FORMULA=19;
    public static final int TERM=20;
    public static final int TERMINSTANCE=21;
    public static final int TERMWITHASSOCIATION=22;
    public static final int COMPLEMENT=23;
    public static final int NULL=24;
    public static final int LITERAL=25;
    public static final int QUANTIFIER=26;
    public static final int FORMULAEXPRESSION=27;
    public static final int FORMULAEXPRESSIONCOMPOSITE=28;
    public static final int FORMULAITEM=29;
    public static final int OPERATOR=30;
    public static final int LIST=31;
    public static final int AND=32;
    public static final int OR=33;
    public static final int PACKAGE=34;
    public static final int ID=35;
    public static final int INT=36;
    public static final int STRING=37;
    public static final int FLOAT=38;
    public static final int MINUS_FLOAT=39;
    public static final int MINUS_INT=40;
    public static final int DATE_TIME=41;
    public static final int PACKAGE_ID=42;
    public static final int DIGIT=43;
    public static final int ESC_SEQ=44;
    public static final int COMMENT=45;
    public static final int LINE_COMMENT=46;
    public static final int WS=47;
    public static final int HEX_DIGIT=48;
    public static final int UNICODE_ESC=49;
    public static final int OCTAL_ESC=50;

    // delegates
    // delegators


        public LetaTreeGrammar(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public LetaTreeGrammar(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected StringTemplateGroup templateLib =
      new StringTemplateGroup("LetaTreeGrammarTemplates", AngleBracketTemplateLexer.class);

    public void setTemplateLib(StringTemplateGroup templateLib) {
      this.templateLib = templateLib;
    }
    public StringTemplateGroup getTemplateLib() {
      return templateLib;
    }
    /** allows convenient multi-value initialization:
     *  "new STAttrMap().put(...).put(...)"
     */
    public static class STAttrMap extends HashMap {
      public STAttrMap put(String attrName, Object value) {
        super.put(attrName, value);
        return this;
      }
      public STAttrMap put(String attrName, int value) {
        super.put(attrName, new Integer(value));
        return this;
      }
    }

    public String[] getTokenNames() { return LetaTreeGrammar.tokenNames; }
    public String getGrammarFileName() { return "/Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g"; }


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


    public static class leta_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "leta"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:38:1: leta : ^( LETA ( testPackage )? (testCases+= testCase )+ ) -> generateLeta(testCases=$testCases);
    public final LetaTreeGrammar.leta_return leta() throws RecognitionException {
        LetaTreeGrammar.leta_return retval = new LetaTreeGrammar.leta_return();
        retval.start = input.LT(1);

        List list_testCases=null;
        RuleReturnScope testCases = null;
        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:39:3: ( ^( LETA ( testPackage )? (testCases+= testCase )+ ) -> generateLeta(testCases=$testCases))
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:39:5: ^( LETA ( testPackage )? (testCases+= testCase )+ )
            {
            match(input,LETA,FOLLOW_LETA_in_leta67); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:39:12: ( testPackage )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:0:0: testPackage
                    {
                    pushFollow(FOLLOW_testPackage_in_leta69);
                    testPackage();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:39:34: (testCases+= testCase )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==TESTCASE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:0:0: testCases+= testCase
            	    {
            	    pushFollow(FOLLOW_testCase_in_leta74);
            	    testCases=testCase();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if (list_testCases==null) list_testCases=new ArrayList();
            	    list_testCases.add(testCases.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return retval;


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 40:5: -> generateLeta(testCases=$testCases)
              {
                  retval.st = templateLib.getInstanceOf("generateLeta",
                new STAttrMap().put("testCases", list_testCases));
              }

            }
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "leta"

    public static class testCase_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "testCase"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:43:1: testCase : ^( TESTCASE ID (sc= setClause )? vc= verifyClause wc= whenClause ) -> generateTestCase(id=$ID.textobjectId=$ID.text.substring(0,1).toLowerCase() + $ID.text.substring(1)verifyClause=vcwhenClause=wcmatrix=testCase.getMatrix()packageName=this.semanticModel.getPackageName()elements=elementsdate=new java.util.Date());
    public final LetaTreeGrammar.testCase_return testCase() throws RecognitionException {
        LetaTreeGrammar.testCase_return retval = new LetaTreeGrammar.testCase_return();
        retval.start = input.LT(1);

        CommonTree ID1=null;
        LetaTreeGrammar.setClause_return sc = null;

        LetaTreeGrammar.verifyClause_return vc = null;

        LetaTreeGrammar.whenClause_return wc = null;



            TestCase testCase = new TestCase();
            
            this.semanticModel.addTestCase(testCase);
            
            List<Element> elements = null;
          
        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:51:3: ( ^( TESTCASE ID (sc= setClause )? vc= verifyClause wc= whenClause ) -> generateTestCase(id=$ID.textobjectId=$ID.text.substring(0,1).toLowerCase() + $ID.text.substring(1)verifyClause=vcwhenClause=wcmatrix=testCase.getMatrix()packageName=this.semanticModel.getPackageName()elements=elementsdate=new java.util.Date()))
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:51:5: ^( TESTCASE ID (sc= setClause )? vc= verifyClause wc= whenClause )
            {
            match(input,TESTCASE,FOLLOW_TESTCASE_in_testCase110); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_testCase112); if (state.failed) return retval;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:51:21: (sc= setClause )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==SET) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:0:0: sc= setClause
                    {
                    pushFollow(FOLLOW_setClause_in_testCase116);
                    sc=setClause();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            pushFollow(FOLLOW_verifyClause_in_testCase121);
            vc=verifyClause();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_whenClause_in_testCase125);
            wc=whenClause();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                    if (this.semanticModel.findTestCase((ID1!=null?ID1.getText():null)) != null) {
                      throw new FailedPredicateException(input, "testCase", "Nome do teste ja existe.");
                    }

                    testCase.setId((ID1!=null?ID1.getText():null));
                    testCase.setVerifyClause((vc!=null?vc.element:null));
                    testCase.setWhenClause((wc!=null?wc.element:null));
                    
                    testCase.generateElements();
                    
                    elements = testCase.getElements();
                  
            }


            // TEMPLATE REWRITE
            if ( state.backtracking==0 ) {
              // 65:5: -> generateTestCase(id=$ID.textobjectId=$ID.text.substring(0,1).toLowerCase() + $ID.text.substring(1)verifyClause=vcwhenClause=wcmatrix=testCase.getMatrix()packageName=this.semanticModel.getPackageName()elements=elementsdate=new java.util.Date())
              {
                  retval.st = templateLib.getInstanceOf("generateTestCase",
                new STAttrMap().put("id", (ID1!=null?ID1.getText():null)).put("objectId", (ID1!=null?ID1.getText():null).substring(0,1).toLowerCase() + (ID1!=null?ID1.getText():null).substring(1)).put("verifyClause", vc).put("whenClause", wc).put("matrix", testCase.getMatrix()).put("packageName", this.semanticModel.getPackageName()).put("elements", elements).put("date", new java.util.Date()));
              }

            }
            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "testCase"

    public static class verifyClause_return extends TreeRuleReturnScope {
        public Element element;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "verifyClause"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:68:1: verifyClause returns [Element element] : ^( VERIFY fc= factComposite ) ;
    public final LetaTreeGrammar.verifyClause_return verifyClause() throws RecognitionException {
        LetaTreeGrammar.verifyClause_return retval = new LetaTreeGrammar.verifyClause_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.factComposite_return fc = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:69:3: ( ^( VERIFY fc= factComposite ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:69:5: ^( VERIFY fc= factComposite )
            {
            match(input,VERIFY,FOLLOW_VERIFY_in_verifyClause198); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_factComposite_in_verifyClause202);
            fc=factComposite();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                    retval.element = (fc!=null?fc.element:null);
                  
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "verifyClause"

    public static class whenClause_return extends TreeRuleReturnScope {
        public Element element;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "whenClause"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:75:1: whenClause returns [Element element] : ^( WHEN fc= factComposite ) ;
    public final LetaTreeGrammar.whenClause_return whenClause() throws RecognitionException {
        LetaTreeGrammar.whenClause_return retval = new LetaTreeGrammar.whenClause_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.factComposite_return fc = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:76:3: ( ^( WHEN fc= factComposite ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:76:5: ^( WHEN fc= factComposite )
            {
            match(input,WHEN,FOLLOW_WHEN_in_whenClause227); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_factComposite_in_whenClause231);
            fc=factComposite();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                    retval.element = (fc!=null?fc.element:null);
                  
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whenClause"

    public static class setClause_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "setClause"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:82:1: setClause : ^( SET set ) ;
    public final LetaTreeGrammar.setClause_return setClause() throws RecognitionException {
        LetaTreeGrammar.setClause_return retval = new LetaTreeGrammar.setClause_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.set_return set2 = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:83:3: ( ^( SET set ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:83:5: ^( SET set )
            {
            match(input,SET,FOLLOW_SET_in_setClause252); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_set_in_setClause254);
            set2=set();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                    Matrix m = this.semanticModel.getCurrentTestCase().newMatrix();
                    
                    m.addRows((set2!=null?set2.items:null));
                  
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "setClause"

    public static class factComposite_return extends TreeRuleReturnScope {
        public Element element;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "factComposite"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:91:1: factComposite returns [Element element] : ( ^( 'and' f= fact fc= factComposite ) | ^( 'or' f= fact fc= factComposite ) | ^( 'and' fo= formula fc= factComposite ) | ^( 'or' fo= formula fc= factComposite ) | ^( 'and' fc= factComposite fc2= factComposite ) | ^( 'or' fc= factComposite fc2= factComposite ) | ^( FACTCOMPOSITE f= fact ) | ^( FACTCOMPOSITE fo= formula ) | ^( FACTCOMPOSITE fc= factComposite ) );
    public final LetaTreeGrammar.factComposite_return factComposite() throws RecognitionException {
        LetaTreeGrammar.factComposite_return retval = new LetaTreeGrammar.factComposite_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.fact_return f = null;

        LetaTreeGrammar.factComposite_return fc = null;

        LetaTreeGrammar.formula_return fo = null;

        LetaTreeGrammar.factComposite_return fc2 = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:92:3: ( ^( 'and' f= fact fc= factComposite ) | ^( 'or' f= fact fc= factComposite ) | ^( 'and' fo= formula fc= factComposite ) | ^( 'or' fo= formula fc= factComposite ) | ^( 'and' fc= factComposite fc2= factComposite ) | ^( 'or' fc= factComposite fc2= factComposite ) | ^( FACTCOMPOSITE f= fact ) | ^( FACTCOMPOSITE fo= formula ) | ^( FACTCOMPOSITE fc= factComposite ) )
            int alt4=9;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:92:5: ^( 'and' f= fact fc= factComposite )
                    {
                    match(input,59,FOLLOW_59_in_factComposite279); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_fact_in_factComposite283);
                    f=fact();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_factComposite_in_factComposite287);
                    fc=factComposite();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.element = new JunctionElement("And", (f!=null?f.element:null), (fc!=null?fc.element:null)); 
                    }

                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:94:5: ^( 'or' f= fact fc= factComposite )
                    {
                    match(input,60,FOLLOW_60_in_factComposite301); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_fact_in_factComposite305);
                    f=fact();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_factComposite_in_factComposite309);
                    fc=factComposite();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.element = new JunctionElement("Or", (f!=null?f.element:null), (fc!=null?fc.element:null)); 
                    }

                    }
                    break;
                case 3 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:96:5: ^( 'and' fo= formula fc= factComposite )
                    {
                    match(input,59,FOLLOW_59_in_factComposite323); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_formula_in_factComposite327);
                    fo=formula();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_factComposite_in_factComposite331);
                    fc=factComposite();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.element = new JunctionElement("And", (fo!=null?fo.element:null), (fc!=null?fc.element:null)); 
                    }

                    }
                    break;
                case 4 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:98:5: ^( 'or' fo= formula fc= factComposite )
                    {
                    match(input,60,FOLLOW_60_in_factComposite345); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_formula_in_factComposite349);
                    fo=formula();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_factComposite_in_factComposite353);
                    fc=factComposite();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.element = new JunctionElement("Or", (fo!=null?fo.element:null), (fc!=null?fc.element:null)); 
                    }

                    }
                    break;
                case 5 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:100:5: ^( 'and' fc= factComposite fc2= factComposite )
                    {
                    match(input,59,FOLLOW_59_in_factComposite367); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_factComposite_in_factComposite371);
                    fc=factComposite();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_factComposite_in_factComposite375);
                    fc2=factComposite();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.element = new JunctionElement("And", (fc!=null?fc.element:null), (fc2!=null?fc2.element:null)); 
                    }

                    }
                    break;
                case 6 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:102:5: ^( 'or' fc= factComposite fc2= factComposite )
                    {
                    match(input,60,FOLLOW_60_in_factComposite389); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_factComposite_in_factComposite393);
                    fc=factComposite();

                    state._fsp--;
                    if (state.failed) return retval;
                    pushFollow(FOLLOW_factComposite_in_factComposite397);
                    fc2=factComposite();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.element = new JunctionElement("Or", (fc!=null?fc.element:null), (fc2!=null?fc2.element:null)); 
                    }

                    }
                    break;
                case 7 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:104:5: ^( FACTCOMPOSITE f= fact )
                    {
                    match(input,FACTCOMPOSITE,FOLLOW_FACTCOMPOSITE_in_factComposite411); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_fact_in_factComposite415);
                    f=fact();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.element = (f!=null?f.element:null); 
                    }

                    }
                    break;
                case 8 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:106:5: ^( FACTCOMPOSITE fo= formula )
                    {
                    match(input,FACTCOMPOSITE,FOLLOW_FACTCOMPOSITE_in_factComposite429); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_formula_in_factComposite433);
                    fo=formula();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.element = (fo!=null?fo.element:null); 
                    }

                    }
                    break;
                case 9 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:108:5: ^( FACTCOMPOSITE fc= factComposite )
                    {
                    match(input,FACTCOMPOSITE,FOLLOW_FACTCOMPOSITE_in_factComposite447); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_factComposite_in_factComposite451);
                    fc=factComposite();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.element = (fc!=null?fc.element:null); 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "factComposite"

    public static class fact_return extends TreeRuleReturnScope {
        public Element element;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "fact"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:112:1: fact returns [Element element] : ^( FACT tc= termComposite c= complement (tc2= termComposite (fe= factExt )? )? ) ;
    public final LetaTreeGrammar.fact_return fact() throws RecognitionException {
        LetaTreeGrammar.fact_return retval = new LetaTreeGrammar.fact_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.termComposite_return tc = null;

        LetaTreeGrammar.complement_return c = null;

        LetaTreeGrammar.termComposite_return tc2 = null;

        LetaTreeGrammar.factExt_return fe = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:113:3: ( ^( FACT tc= termComposite c= complement (tc2= termComposite (fe= factExt )? )? ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:113:5: ^( FACT tc= termComposite c= complement (tc2= termComposite (fe= factExt )? )? )
            {
            match(input,FACT,FOLLOW_FACT_in_fact476); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_termComposite_in_fact480);
            tc=termComposite();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_complement_in_fact484);
            c=complement();

            state._fsp--;
            if (state.failed) return retval;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:113:42: (tc2= termComposite (fe= factExt )? )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==TERMCOMPOSITE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:113:43: tc2= termComposite (fe= factExt )?
                    {
                    pushFollow(FOLLOW_termComposite_in_fact489);
                    tc2=termComposite();

                    state._fsp--;
                    if (state.failed) return retval;
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:113:63: (fe= factExt )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==FACTEXT) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:0:0: fe= factExt
                            {
                            pushFollow(FOLLOW_factExt_in_fact493);
                            fe=factExt();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                    (tc!=null?tc.classElement:null).setMethodElement((c!=null?c.methodElement:null));
                    
                    if (tc2 != null) {
                      (c!=null?c.methodElement:null).setClassElement((tc2!=null?tc2.classElement:null));
                    
                      if (fe != null && (fe!=null?fe.methodElement:null) != null) {
                        (tc2!=null?tc2.classElement:null).setMethodElement((fe!=null?fe.methodElement:null));
              	      }
                    }

                    retval.element = (tc!=null?tc.classElement:null);
                  
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fact"

    public static class factExt_return extends TreeRuleReturnScope {
        public MethodElement methodElement;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "factExt"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:129:1: factExt returns [MethodElement methodElement] : ^( FACTEXT c= complement (tc= termComposite (fe= factExt )? )? ) ;
    public final LetaTreeGrammar.factExt_return factExt() throws RecognitionException {
        LetaTreeGrammar.factExt_return retval = new LetaTreeGrammar.factExt_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.complement_return c = null;

        LetaTreeGrammar.termComposite_return tc = null;

        LetaTreeGrammar.factExt_return fe = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:130:3: ( ^( FACTEXT c= complement (tc= termComposite (fe= factExt )? )? ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:130:5: ^( FACTEXT c= complement (tc= termComposite (fe= factExt )? )? )
            {
            match(input,FACTEXT,FOLLOW_FACTEXT_in_factExt521); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_complement_in_factExt525);
            c=complement();

            state._fsp--;
            if (state.failed) return retval;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:130:28: (tc= termComposite (fe= factExt )? )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==TERMCOMPOSITE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:130:29: tc= termComposite (fe= factExt )?
                    {
                    pushFollow(FOLLOW_termComposite_in_factExt530);
                    tc=termComposite();

                    state._fsp--;
                    if (state.failed) return retval;
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:130:48: (fe= factExt )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==FACTEXT) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:0:0: fe= factExt
                            {
                            pushFollow(FOLLOW_factExt_in_factExt534);
                            fe=factExt();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                    if (tc != null) {
                      (c!=null?c.methodElement:null).setClassElement((tc!=null?tc.classElement:null));
                      
                      if (fe != null && (fe!=null?fe.methodElement:null) != null) {
                        (tc!=null?tc.classElement:null).setMethodElement((fe!=null?fe.methodElement:null));
              	      }
                    }

                    retval.methodElement = (c!=null?c.methodElement:null);
                  
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "factExt"

    public static class termComposite_return extends TreeRuleReturnScope {
        public ClassElement classElement;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "termComposite"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:144:1: termComposite returns [ClassElement classElement] : ^( TERMCOMPOSITE (q= quantifier )? (t= term )? (ti= termInstance )? (twa= termWithAssociation )? ) ;
    public final LetaTreeGrammar.termComposite_return termComposite() throws RecognitionException {
        LetaTreeGrammar.termComposite_return retval = new LetaTreeGrammar.termComposite_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.quantifier_return q = null;

        LetaTreeGrammar.term_return t = null;

        LetaTreeGrammar.termInstance_return ti = null;

        LetaTreeGrammar.termWithAssociation_return twa = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:145:3: ( ^( TERMCOMPOSITE (q= quantifier )? (t= term )? (ti= termInstance )? (twa= termWithAssociation )? ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:145:5: ^( TERMCOMPOSITE (q= quantifier )? (t= term )? (ti= termInstance )? (twa= termWithAssociation )? )
            {
            match(input,TERMCOMPOSITE,FOLLOW_TERMCOMPOSITE_in_termComposite562); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:145:22: (q= quantifier )?
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==QUANTIFIER) ) {
                    alt9=1;
                }
                switch (alt9) {
                    case 1 :
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:0:0: q= quantifier
                        {
                        pushFollow(FOLLOW_quantifier_in_termComposite566);
                        q=quantifier();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }

                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:145:36: (t= term )?
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==TERM) ) {
                    alt10=1;
                }
                switch (alt10) {
                    case 1 :
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:0:0: t= term
                        {
                        pushFollow(FOLLOW_term_in_termComposite571);
                        t=term();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }

                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:145:45: (ti= termInstance )?
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==TERMINSTANCE) ) {
                    alt11=1;
                }
                switch (alt11) {
                    case 1 :
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:0:0: ti= termInstance
                        {
                        pushFollow(FOLLOW_termInstance_in_termComposite576);
                        ti=termInstance();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }

                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:145:63: (twa= termWithAssociation )?
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==TERMWITHASSOCIATION) ) {
                    alt12=1;
                }
                switch (alt12) {
                    case 1 :
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:0:0: twa= termWithAssociation
                        {
                        pushFollow(FOLLOW_termWithAssociation_in_termComposite581);
                        twa=termWithAssociation();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }
            if ( state.backtracking==0 ) {

                    if ((t!=null?t.classElement:null) != null)
                      retval.classElement = (t!=null?t.classElement:null);
                    else if ((ti!=null?ti.classElement:null) != null)
                      retval.classElement = (ti!=null?ti.classElement:null);
                    else
                      retval.classElement = (twa!=null?twa.classElement:null);
                      
                    if (q != null)
                      if (q.value2 == null)
                        retval.classElement.setQuantifier(new Quantifier((q!=null?q.type:null), (q!=null?q.operator:null), (q!=null?q.value:null)));
                      else
                        retval.classElement.setQuantifier(new Quantifier((q!=null?q.type:null), (q!=null?q.operator:null), (q!=null?q.value:null), (q!=null?q.value2:null)));
                  
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "termComposite"

    public static class term_return extends TreeRuleReturnScope {
        public ClassElement classElement;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "term"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:162:1: term returns [ClassElement classElement] : ^( TERM ID ) ;
    public final LetaTreeGrammar.term_return term() throws RecognitionException {
        LetaTreeGrammar.term_return retval = new LetaTreeGrammar.term_return();
        retval.start = input.LT(1);

        CommonTree ID3=null;

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:163:3: ( ^( TERM ID ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:163:5: ^( TERM ID )
            {
            match(input,TERM,FOLLOW_TERM_in_term607); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_term609); if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                    retval.classElement = new ClassElement((ID3!=null?ID3.getText():null));
                  
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class termInstance_return extends TreeRuleReturnScope {
        public ClassElement classElement;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "termInstance"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:169:1: termInstance returns [ClassElement classElement] : ( ^( TERMINSTANCE t= term (neo= notEqualOperator )? sl= stringLiteral ) | ^( TERMINSTANCE t= term (ro= relationalOperator )? ol= otherLiteral ) );
    public final LetaTreeGrammar.termInstance_return termInstance() throws RecognitionException {
        LetaTreeGrammar.termInstance_return retval = new LetaTreeGrammar.termInstance_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.term_return t = null;

        LetaTreeGrammar.notEqualOperator_return neo = null;

        LetaTreeGrammar.stringLiteral_return sl = null;

        LetaTreeGrammar.relationalOperator_return ro = null;

        LetaTreeGrammar.otherLiteral_return ol = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:170:3: ( ^( TERMINSTANCE t= term (neo= notEqualOperator )? sl= stringLiteral ) | ^( TERMINSTANCE t= term (ro= relationalOperator )? ol= otherLiteral ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==TERMINSTANCE) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==DOWN) ) {
                    int LA15_2 = input.LA(3);

                    if ( (LA15_2==TERM) ) {
                        int LA15_3 = input.LA(4);

                        if ( (synpred21_LetaTreeGrammar()) ) {
                            alt15=1;
                        }
                        else if ( (true) ) {
                            alt15=2;
                        }
                        else {
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 3, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:170:5: ^( TERMINSTANCE t= term (neo= notEqualOperator )? sl= stringLiteral )
                    {
                    match(input,TERMINSTANCE,FOLLOW_TERMINSTANCE_in_termInstance634); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_term_in_termInstance638);
                    t=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:170:30: (neo= notEqualOperator )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==OPERATOR) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:0:0: neo= notEqualOperator
                            {
                            pushFollow(FOLLOW_notEqualOperator_in_termInstance642);
                            neo=notEqualOperator();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_stringLiteral_in_termInstance647);
                    sl=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                            retval.classElement = (t!=null?t.classElement:null);
                            retval.classElement.setRelationalOperator((neo!=null?neo.operator:null));
                            
                            if ((sl!=null?sl.stringValue:null) != null)
                              retval.classElement.setStringValue((sl!=null?sl.stringValue:null));
                          
                    }

                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:178:5: ^( TERMINSTANCE t= term (ro= relationalOperator )? ol= otherLiteral )
                    {
                    match(input,TERMINSTANCE,FOLLOW_TERMINSTANCE_in_termInstance661); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_term_in_termInstance665);
                    t=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:178:29: (ro= relationalOperator )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==OPERATOR) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:0:0: ro= relationalOperator
                            {
                            pushFollow(FOLLOW_relationalOperator_in_termInstance669);
                            ro=relationalOperator();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }

                    pushFollow(FOLLOW_otherLiteral_in_termInstance674);
                    ol=otherLiteral();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                            retval.classElement = (t!=null?t.classElement:null);
                            retval.classElement.setRelationalOperator((ro!=null?ro.operator:null));
                            
                            if ((ol!=null?ol.floatValue:null) != null)
                              retval.classElement.setFloatValue((ol!=null?ol.floatValue:null));
                            else if ((ol!=null?ol.intValue:null) != null)
                              retval.classElement.setIntValue((ol!=null?ol.intValue:null));
                            else if ((ol!=null?ol.dateValue:null) != null)
                              retval.classElement.setDateValue((ol!=null?ol.dateValue:null));
                          
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "termInstance"

    public static class termWithAssociation_return extends TreeRuleReturnScope {
        public ClassElement classElement;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "termWithAssociation"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:192:1: termWithAssociation returns [ClassElement classElement] : ^( TERMWITHASSOCIATION t= term (ro= relationalOperator )? INT ) ;
    public final LetaTreeGrammar.termWithAssociation_return termWithAssociation() throws RecognitionException {
        LetaTreeGrammar.termWithAssociation_return retval = new LetaTreeGrammar.termWithAssociation_return();
        retval.start = input.LT(1);

        CommonTree INT4=null;
        LetaTreeGrammar.term_return t = null;

        LetaTreeGrammar.relationalOperator_return ro = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:193:3: ( ^( TERMWITHASSOCIATION t= term (ro= relationalOperator )? INT ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:193:5: ^( TERMWITHASSOCIATION t= term (ro= relationalOperator )? INT )
            {
            match(input,TERMWITHASSOCIATION,FOLLOW_TERMWITHASSOCIATION_in_termWithAssociation699); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_term_in_termWithAssociation703);
            t=term();

            state._fsp--;
            if (state.failed) return retval;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:193:36: (ro= relationalOperator )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==OPERATOR) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:0:0: ro= relationalOperator
                    {
                    pushFollow(FOLLOW_relationalOperator_in_termWithAssociation707);
                    ro=relationalOperator();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }

            INT4=(CommonTree)match(input,INT,FOLLOW_INT_in_termWithAssociation710); if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                    retval.classElement = (t!=null?t.classElement:null);
                    retval.classElement.setRelationalOperator((ro!=null?ro.operator:null));
                    retval.classElement.setIndexOfSet(Integer.parseInt((INT4!=null?INT4.getText():null)));
                    
                    if (retval.classElement.getIndexOfSet() > 0 && this.semanticModel.getCurrentTestCase().getMatrix() != null) {
              	      if (this.semanticModel.getCurrentTestCase().getMatrix().hasStringValue(retval.classElement.getIndexOfSet()))
              	        retval.classElement.setStringValue("");
              	      if (this.semanticModel.getCurrentTestCase().getMatrix().hasIntegerValue(retval.classElement.getIndexOfSet()))
              	        retval.classElement.setIntValue(0);
              	      if (this.semanticModel.getCurrentTestCase().getMatrix().hasFloatValue(retval.classElement.getIndexOfSet()))
              	        retval.classElement.setFloatValue(0.0);
                      if (this.semanticModel.getCurrentTestCase().getMatrix().hasDateValue(retval.classElement.getIndexOfSet()))
                        retval.classElement.setDateValue("");
                    }
                  
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "termWithAssociation"

    public static class quantifier_return extends TreeRuleReturnScope {
        public String type;
        public String operator;
        public Integer value;
        public Integer value2;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "quantifier"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:212:1: quantifier returns [String type, String operator, Integer value, Integer value2] : ( ^( QUANTIFIER 'atleast' INT ) | ^( QUANTIFIER 'atmost' INT ) | ^( QUANTIFIER 'exactly' INT ) | ^( QUANTIFIER 'atleastandatmost' v1= INT v2= INT ) );
    public final LetaTreeGrammar.quantifier_return quantifier() throws RecognitionException {
        LetaTreeGrammar.quantifier_return retval = new LetaTreeGrammar.quantifier_return();
        retval.start = input.LT(1);

        CommonTree v1=null;
        CommonTree v2=null;
        CommonTree INT5=null;
        CommonTree INT6=null;
        CommonTree INT7=null;

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:213:3: ( ^( QUANTIFIER 'atleast' INT ) | ^( QUANTIFIER 'atmost' INT ) | ^( QUANTIFIER 'exactly' INT ) | ^( QUANTIFIER 'atleastandatmost' v1= INT v2= INT ) )
            int alt17=4;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==QUANTIFIER) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case 62:
                        {
                        alt17=1;
                        }
                        break;
                    case 63:
                        {
                        alt17=2;
                        }
                        break;
                    case 64:
                        {
                        alt17=3;
                        }
                        break;
                    case 65:
                        {
                        alt17=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 2, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:213:5: ^( QUANTIFIER 'atleast' INT )
                    {
                    match(input,QUANTIFIER,FOLLOW_QUANTIFIER_in_quantifier737); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,62,FOLLOW_62_in_quantifier739); if (state.failed) return retval;
                    INT5=(CommonTree)match(input,INT,FOLLOW_INT_in_quantifier741); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.type = "atLeast"; retval.operator = ">="; retval.value = Integer.parseInt((INT5!=null?INT5.getText():null)); 
                    }

                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:215:5: ^( QUANTIFIER 'atmost' INT )
                    {
                    match(input,QUANTIFIER,FOLLOW_QUANTIFIER_in_quantifier755); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,63,FOLLOW_63_in_quantifier757); if (state.failed) return retval;
                    INT6=(CommonTree)match(input,INT,FOLLOW_INT_in_quantifier759); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.type = "atMost"; retval.operator = "<="; retval.value = Integer.parseInt((INT6!=null?INT6.getText():null)); 
                    }

                    }
                    break;
                case 3 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:217:5: ^( QUANTIFIER 'exactly' INT )
                    {
                    match(input,QUANTIFIER,FOLLOW_QUANTIFIER_in_quantifier773); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,64,FOLLOW_64_in_quantifier775); if (state.failed) return retval;
                    INT7=(CommonTree)match(input,INT,FOLLOW_INT_in_quantifier777); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.type = "exactly"; retval.operator = "=="; retval.value = Integer.parseInt((INT7!=null?INT7.getText():null)); 
                    }

                    }
                    break;
                case 4 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:219:5: ^( QUANTIFIER 'atleastandatmost' v1= INT v2= INT )
                    {
                    match(input,QUANTIFIER,FOLLOW_QUANTIFIER_in_quantifier791); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,65,FOLLOW_65_in_quantifier793); if (state.failed) return retval;
                    v1=(CommonTree)match(input,INT,FOLLOW_INT_in_quantifier797); if (state.failed) return retval;
                    v2=(CommonTree)match(input,INT,FOLLOW_INT_in_quantifier801); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.type = "atLeastAndAtMost"; retval.operator = ">=&<="; retval.value = Integer.parseInt((v1!=null?v1.getText():null)); retval.value2 = Integer.parseInt((v2!=null?v2.getText():null)); 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "quantifier"

    public static class complement_return extends TreeRuleReturnScope {
        public MethodElement methodElement;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "complement"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:223:1: complement returns [MethodElement methodElement] : ^( COMPLEMENT ID ) ;
    public final LetaTreeGrammar.complement_return complement() throws RecognitionException {
        LetaTreeGrammar.complement_return retval = new LetaTreeGrammar.complement_return();
        retval.start = input.LT(1);

        CommonTree ID8=null;

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:224:3: ( ^( COMPLEMENT ID ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:224:5: ^( COMPLEMENT ID )
            {
            match(input,COMPLEMENT,FOLLOW_COMPLEMENT_in_complement826); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            ID8=(CommonTree)match(input,ID,FOLLOW_ID_in_complement828); if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                    retval.methodElement = new MethodElement((ID8!=null?ID8.getText():null));
                  
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "complement"

    public static class formula_return extends TreeRuleReturnScope {
        public ClassElement element;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "formula"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:230:1: formula returns [ClassElement element] : ^( FORMULA fi= formulaItem fe= formulaExpression ) ;
    public final LetaTreeGrammar.formula_return formula() throws RecognitionException {
        LetaTreeGrammar.formula_return retval = new LetaTreeGrammar.formula_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.formulaItem_return fi = null;

        LetaTreeGrammar.formulaExpression_return fe = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:231:3: ( ^( FORMULA fi= formulaItem fe= formulaExpression ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:231:5: ^( FORMULA fi= formulaItem fe= formulaExpression )
            {
            match(input,FORMULA,FOLLOW_FORMULA_in_formula853); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_formulaItem_in_formula857);
            fi=formulaItem();

            state._fsp--;
            if (state.failed) return retval;
            pushFollow(FOLLOW_formulaExpression_in_formula861);
            fe=formulaExpression();

            state._fsp--;
            if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                    retval.element = (fi!=null?fi.classElement:null);
                    
                    MethodElement me = new MethodElement("equals");
                    me.setClassElement((fe!=null?fe.classElement:null));
                    retval.element.setMethodElement(me);
                  
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formula"

    public static class formulaExpression_return extends TreeRuleReturnScope {
        public ClassElement classElement;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "formulaExpression"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:241:1: formulaExpression returns [ClassElement classElement] : ( ^( FORMULAEXPRESSION fi= formulaItem (mo= mathOperator fe= formulaExpression )? ) | ^( FORMULAEXPRESSION fe= formulaExpression (mo= mathOperator fe2= formulaExpression )? ) );
    public final LetaTreeGrammar.formulaExpression_return formulaExpression() throws RecognitionException {
        LetaTreeGrammar.formulaExpression_return retval = new LetaTreeGrammar.formulaExpression_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.formulaItem_return fi = null;

        LetaTreeGrammar.mathOperator_return mo = null;

        LetaTreeGrammar.formulaExpression_return fe = null;

        LetaTreeGrammar.formulaExpression_return fe2 = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:242:3: ( ^( FORMULAEXPRESSION fi= formulaItem (mo= mathOperator fe= formulaExpression )? ) | ^( FORMULAEXPRESSION fe= formulaExpression (mo= mathOperator fe2= formulaExpression )? ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==FORMULAEXPRESSION) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==DOWN) ) {
                    int LA20_2 = input.LA(3);

                    if ( (LA20_2==FORMULAITEM) ) {
                        alt20=1;
                    }
                    else if ( (LA20_2==FORMULAEXPRESSION) ) {
                        alt20=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:242:5: ^( FORMULAEXPRESSION fi= formulaItem (mo= mathOperator fe= formulaExpression )? )
                    {
                    match(input,FORMULAEXPRESSION,FOLLOW_FORMULAEXPRESSION_in_formulaExpression886); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_formulaItem_in_formulaExpression890);
                    fi=formulaItem();

                    state._fsp--;
                    if (state.failed) return retval;
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:242:40: (mo= mathOperator fe= formulaExpression )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==OPERATOR) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:242:41: mo= mathOperator fe= formulaExpression
                            {
                            pushFollow(FOLLOW_mathOperator_in_formulaExpression895);
                            mo=mathOperator();

                            state._fsp--;
                            if (state.failed) return retval;
                            pushFollow(FOLLOW_formulaExpression_in_formulaExpression899);
                            fe=formulaExpression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                            retval.classElement = (fi!=null?fi.classElement:null);
                              
                            if (mo != null) {
                              MethodElement me = new MethodElement((
                                (mo!=null?mo.operator:null).equals("+") ? "sum" : 
                                (mo!=null?mo.operator:null).equals("-") ? "minus" : 
                                (mo!=null?mo.operator:null).equals("*") ? "multiply" : 
                                (mo!=null?mo.operator:null).equals("/") ? "divide" : 
                                (mo!=null?mo.operator:null).equals("%") ? "remainder" : "power"));
                                
                              me.setClassElement((fe!=null?fe.classElement:null));
                              
                              retval.classElement.setMethodElement(me);
                            }
                          
                    }

                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:259:5: ^( FORMULAEXPRESSION fe= formulaExpression (mo= mathOperator fe2= formulaExpression )? )
                    {
                    match(input,FORMULAEXPRESSION,FOLLOW_FORMULAEXPRESSION_in_formulaExpression915); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_formulaExpression_in_formulaExpression919);
                    fe=formulaExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:259:46: (mo= mathOperator fe2= formulaExpression )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==OPERATOR) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:259:47: mo= mathOperator fe2= formulaExpression
                            {
                            pushFollow(FOLLOW_mathOperator_in_formulaExpression924);
                            mo=mathOperator();

                            state._fsp--;
                            if (state.failed) return retval;
                            pushFollow(FOLLOW_formulaExpression_in_formulaExpression928);
                            fe2=formulaExpression();

                            state._fsp--;
                            if (state.failed) return retval;

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {

                            retval.classElement = (fe!=null?fe.classElement:null);
                              
                            if (mo != null) {
                              MethodElement me = new MethodElement((
                                (mo!=null?mo.operator:null).equals("+") ? "sum" : 
                                (mo!=null?mo.operator:null).equals("-") ? "minus" : 
                                (mo!=null?mo.operator:null).equals("*") ? "multiply" : 
                                (mo!=null?mo.operator:null).equals("/") ? "divide" : 
                                (mo!=null?mo.operator:null).equals("%") ? "remainder" : "power"));
                                
                              me.setClassElement((fe2!=null?fe2.classElement:null));
                              
                              retval.classElement.setMethodElement(me);
                            }
                          
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formulaExpression"

    public static class formulaItem_return extends TreeRuleReturnScope {
        public ClassElement classElement;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "formulaItem"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:278:1: formulaItem returns [ClassElement classElement] : ^( FORMULAITEM (t= term )? (ti= termInstance )? (twa= termWithAssociation )? ) ;
    public final LetaTreeGrammar.formulaItem_return formulaItem() throws RecognitionException {
        LetaTreeGrammar.formulaItem_return retval = new LetaTreeGrammar.formulaItem_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.term_return t = null;

        LetaTreeGrammar.termInstance_return ti = null;

        LetaTreeGrammar.termWithAssociation_return twa = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:279:3: ( ^( FORMULAITEM (t= term )? (ti= termInstance )? (twa= termWithAssociation )? ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:279:5: ^( FORMULAITEM (t= term )? (ti= termInstance )? (twa= termWithAssociation )? )
            {
            match(input,FORMULAITEM,FOLLOW_FORMULAITEM_in_formulaItem955); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:279:20: (t= term )?
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==TERM) ) {
                    alt21=1;
                }
                switch (alt21) {
                    case 1 :
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:0:0: t= term
                        {
                        pushFollow(FOLLOW_term_in_formulaItem959);
                        t=term();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }

                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:279:29: (ti= termInstance )?
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==TERMINSTANCE) ) {
                    alt22=1;
                }
                switch (alt22) {
                    case 1 :
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:0:0: ti= termInstance
                        {
                        pushFollow(FOLLOW_termInstance_in_formulaItem964);
                        ti=termInstance();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }

                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:279:47: (twa= termWithAssociation )?
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==TERMWITHASSOCIATION) ) {
                    alt23=1;
                }
                switch (alt23) {
                    case 1 :
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:0:0: twa= termWithAssociation
                        {
                        pushFollow(FOLLOW_termWithAssociation_in_formulaItem969);
                        twa=termWithAssociation();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }
            if ( state.backtracking==0 ) {

                    if (t != null)
                      retval.classElement = (t!=null?t.classElement:null);
                    else if (ti != null)
                      retval.classElement = (ti!=null?ti.classElement:null);
                    else if (twa != null)
                      retval.classElement = (twa!=null?twa.classElement:null);
                    else
                      retval.classElement = null;
                  
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formulaItem"

    public static class mathOperator_return extends TreeRuleReturnScope {
        public String operator;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "mathOperator"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:292:1: mathOperator returns [String operator] : ( ^( OPERATOR '+' ) | ^( OPERATOR '-' ) | ^( OPERATOR '/' ) | ^( OPERATOR '*' ) | ^( OPERATOR '%' ) | ^( OPERATOR '**' ) );
    public final LetaTreeGrammar.mathOperator_return mathOperator() throws RecognitionException {
        LetaTreeGrammar.mathOperator_return retval = new LetaTreeGrammar.mathOperator_return();
        retval.start = input.LT(1);

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:293:3: ( ^( OPERATOR '+' ) | ^( OPERATOR '-' ) | ^( OPERATOR '/' ) | ^( OPERATOR '*' ) | ^( OPERATOR '%' ) | ^( OPERATOR '**' ) )
            int alt24=6;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==OPERATOR) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case 67:
                        {
                        alt24=1;
                        }
                        break;
                    case 68:
                        {
                        alt24=2;
                        }
                        break;
                    case 69:
                        {
                        alt24=3;
                        }
                        break;
                    case 70:
                        {
                        alt24=4;
                        }
                        break;
                    case 71:
                        {
                        alt24=5;
                        }
                        break;
                    case 72:
                        {
                        alt24=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 2, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:293:5: ^( OPERATOR '+' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_mathOperator995); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,67,FOLLOW_67_in_mathOperator997); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.operator = "+"; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:295:5: ^( OPERATOR '-' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_mathOperator1011); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,68,FOLLOW_68_in_mathOperator1013); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.operator = "-"; 
                    }

                    }
                    break;
                case 3 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:297:5: ^( OPERATOR '/' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_mathOperator1027); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,69,FOLLOW_69_in_mathOperator1029); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.operator = "/"; 
                    }

                    }
                    break;
                case 4 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:299:5: ^( OPERATOR '*' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_mathOperator1043); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,70,FOLLOW_70_in_mathOperator1045); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.operator = "*"; 
                    }

                    }
                    break;
                case 5 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:301:5: ^( OPERATOR '%' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_mathOperator1059); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,71,FOLLOW_71_in_mathOperator1061); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.operator = "%"; 
                    }

                    }
                    break;
                case 6 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:303:5: ^( OPERATOR '**' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_mathOperator1075); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,72,FOLLOW_72_in_mathOperator1077); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.operator = "**"; 
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mathOperator"

    public static class relationalOperator_return extends TreeRuleReturnScope {
        public String operator;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "relationalOperator"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:307:1: relationalOperator returns [String operator] : ( ^( OPERATOR '>' ) | ^( OPERATOR '<' ) | ^( OPERATOR '>=' ) | ^( OPERATOR '<=' ) | notEqualOperator );
    public final LetaTreeGrammar.relationalOperator_return relationalOperator() throws RecognitionException {
        LetaTreeGrammar.relationalOperator_return retval = new LetaTreeGrammar.relationalOperator_return();
        retval.start = input.LT(1);

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:308:3: ( ^( OPERATOR '>' ) | ^( OPERATOR '<' ) | ^( OPERATOR '>=' ) | ^( OPERATOR '<=' ) | notEqualOperator )
            int alt25=5;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==OPERATOR) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case 73:
                        {
                        alt25=1;
                        }
                        break;
                    case 74:
                        {
                        alt25=2;
                        }
                        break;
                    case 75:
                        {
                        alt25=3;
                        }
                        break;
                    case 76:
                        {
                        alt25=4;
                        }
                        break;
                    case 77:
                        {
                        alt25=5;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 2, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:308:5: ^( OPERATOR '>' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_relationalOperator1102); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,73,FOLLOW_73_in_relationalOperator1104); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.operator = "MoreThan"; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:310:5: ^( OPERATOR '<' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_relationalOperator1118); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,74,FOLLOW_74_in_relationalOperator1120); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.operator = "LessThan"; 
                    }

                    }
                    break;
                case 3 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:312:5: ^( OPERATOR '>=' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_relationalOperator1134); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,75,FOLLOW_75_in_relationalOperator1136); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.operator = "MoreOrEqualThan"; 
                    }

                    }
                    break;
                case 4 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:314:5: ^( OPERATOR '<=' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_relationalOperator1150); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,76,FOLLOW_76_in_relationalOperator1152); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.operator = "LessOrEqualThan"; 
                    }

                    }
                    break;
                case 5 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:316:5: notEqualOperator
                    {
                    pushFollow(FOLLOW_notEqualOperator_in_relationalOperator1165);
                    notEqualOperator();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relationalOperator"

    public static class notEqualOperator_return extends TreeRuleReturnScope {
        public String operator;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "notEqualOperator"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:319:1: notEqualOperator returns [String operator] : ^( OPERATOR '!=' ) ;
    public final LetaTreeGrammar.notEqualOperator_return notEqualOperator() throws RecognitionException {
        LetaTreeGrammar.notEqualOperator_return retval = new LetaTreeGrammar.notEqualOperator_return();
        retval.start = input.LT(1);

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:320:3: ( ^( OPERATOR '!=' ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:320:5: ^( OPERATOR '!=' )
            {
            match(input,OPERATOR,FOLLOW_OPERATOR_in_notEqualOperator1183); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            match(input,77,FOLLOW_77_in_notEqualOperator1185); if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
               retval.operator = "NotEqual"; 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "notEqualOperator"

    public static class set_return extends TreeRuleReturnScope {
        public ArrayList<MatrixItem> items = new ArrayList<MatrixItem>();
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "set"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:324:1: set returns [ArrayList<MatrixItem> items = new ArrayList<MatrixItem>()] : ^( SET ls= list (s= set )? ) ;
    public final LetaTreeGrammar.set_return set() throws RecognitionException {
        LetaTreeGrammar.set_return retval = new LetaTreeGrammar.set_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.list_return ls = null;

        LetaTreeGrammar.set_return s = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:325:3: ( ^( SET ls= list (s= set )? ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:325:5: ^( SET ls= list (s= set )? )
            {
            match(input,SET,FOLLOW_SET_in_set1210); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_list_in_set1214);
            ls=list();

            state._fsp--;
            if (state.failed) return retval;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:325:20: (s= set )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==SET) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:0:0: s= set
                    {
                    pushFollow(FOLLOW_set_in_set1218);
                    s=set();

                    state._fsp--;
                    if (state.failed) return retval;

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                    retval.items.add((ls!=null?ls.matrixItem:null));
                    
                    if (s != null)
                     retval.items.addAll((s!=null?s.items:null)); 
                  
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "set"

    public static class list_return extends TreeRuleReturnScope {
        public MatrixItem matrixItem = new MatrixItem();
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "list"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:334:1: list returns [MatrixItem matrixItem = new MatrixItem()] : ^( LIST (sl= stringLiteral )? (ol= otherLiteral )? (ss= list )? ) ;
    public final LetaTreeGrammar.list_return list() throws RecognitionException {
        LetaTreeGrammar.list_return retval = new LetaTreeGrammar.list_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.stringLiteral_return sl = null;

        LetaTreeGrammar.otherLiteral_return ol = null;

        LetaTreeGrammar.list_return ss = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:335:3: ( ^( LIST (sl= stringLiteral )? (ol= otherLiteral )? (ss= list )? ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:335:5: ^( LIST (sl= stringLiteral )? (ol= otherLiteral )? (ss= list )? )
            {
            match(input,LIST,FOLLOW_LIST_in_list1244); if (state.failed) return retval;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return retval;
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:335:14: (sl= stringLiteral )?
                int alt27=2;
                alt27 = dfa27.predict(input);
                switch (alt27) {
                    case 1 :
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:0:0: sl= stringLiteral
                        {
                        pushFollow(FOLLOW_stringLiteral_in_list1248);
                        sl=stringLiteral();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }

                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:335:32: (ol= otherLiteral )?
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==LITERAL) ) {
                    alt28=1;
                }
                switch (alt28) {
                    case 1 :
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:0:0: ol= otherLiteral
                        {
                        pushFollow(FOLLOW_otherLiteral_in_list1253);
                        ol=otherLiteral();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }

                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:335:49: (ss= list )?
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==LIST) ) {
                    alt29=1;
                }
                switch (alt29) {
                    case 1 :
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:0:0: ss= list
                        {
                        pushFollow(FOLLOW_list_in_list1258);
                        ss=list();

                        state._fsp--;
                        if (state.failed) return retval;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return retval;
            }
            if ( state.backtracking==0 ) {

                    if (sl != null && (sl!=null?sl.stringValue:null) != null)
                      retval.matrixItem.addColumn((sl!=null?sl.stringValue:null));

                    if (ol != null)
              	      if ((ol!=null?ol.intValue:null) != null)
              	        retval.matrixItem.addColumn((ol!=null?ol.intValue:null));
              	      else if ((ol!=null?ol.floatValue:null) != null)
              	        retval.matrixItem.addColumn((ol!=null?ol.floatValue:null));
              	      else if ((ol!=null?ol.dateValue:null) != null)
              	        retval.matrixItem.addColumn((ol!=null?ol.dateValue:null));
                      
                    if (ss != null)
                      retval.matrixItem.addColumns((ss!=null?ss.matrixItem:null).getColumns());
                  
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "list"

    public static class stringLiteral_return extends TreeRuleReturnScope {
        public String stringValue;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "stringLiteral"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:353:1: stringLiteral returns [String stringValue] : ( ^( LITERAL STRING ) | ^( LITERAL NULL ) );
    public final LetaTreeGrammar.stringLiteral_return stringLiteral() throws RecognitionException {
        LetaTreeGrammar.stringLiteral_return retval = new LetaTreeGrammar.stringLiteral_return();
        retval.start = input.LT(1);

        CommonTree STRING9=null;

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:354:3: ( ^( LITERAL STRING ) | ^( LITERAL NULL ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==LITERAL) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==DOWN) ) {
                    int LA30_2 = input.LA(3);

                    if ( (LA30_2==STRING) ) {
                        alt30=1;
                    }
                    else if ( (LA30_2==NULL) ) {
                        alt30=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:354:5: ^( LITERAL STRING )
                    {
                    match(input,LITERAL,FOLLOW_LITERAL_in_stringLiteral1285); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    STRING9=(CommonTree)match(input,STRING,FOLLOW_STRING_in_stringLiteral1287); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.stringValue = (STRING9!=null?STRING9.getText():null); 
                    }

                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:356:5: ^( LITERAL NULL )
                    {
                    match(input,LITERAL,FOLLOW_LITERAL_in_stringLiteral1301); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,NULL,FOLLOW_NULL_in_stringLiteral1303); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "stringLiteral"

    public static class otherLiteral_return extends TreeRuleReturnScope {
        public Integer intValue;
        public Double floatValue;
        public String dateValue;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "otherLiteral"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:359:1: otherLiteral returns [Integer intValue, Double floatValue, String dateValue] : ( ^( LITERAL FLOAT ) | ^( LITERAL MINUS_FLOAT ) | ^( LITERAL INT ) | ^( LITERAL MINUS_INT ) | ^( LITERAL DATE_TIME ) | ^( LITERAL NULL ) );
    public final LetaTreeGrammar.otherLiteral_return otherLiteral() throws RecognitionException {
        LetaTreeGrammar.otherLiteral_return retval = new LetaTreeGrammar.otherLiteral_return();
        retval.start = input.LT(1);

        CommonTree FLOAT10=null;
        CommonTree MINUS_FLOAT11=null;
        CommonTree INT12=null;
        CommonTree MINUS_INT13=null;
        CommonTree DATE_TIME14=null;

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:360:3: ( ^( LITERAL FLOAT ) | ^( LITERAL MINUS_FLOAT ) | ^( LITERAL INT ) | ^( LITERAL MINUS_INT ) | ^( LITERAL DATE_TIME ) | ^( LITERAL NULL ) )
            int alt31=6;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==LITERAL) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case FLOAT:
                        {
                        alt31=1;
                        }
                        break;
                    case MINUS_FLOAT:
                        {
                        alt31=2;
                        }
                        break;
                    case INT:
                        {
                        alt31=3;
                        }
                        break;
                    case MINUS_INT:
                        {
                        alt31=4;
                        }
                        break;
                    case DATE_TIME:
                        {
                        alt31=5;
                        }
                        break;
                    case NULL:
                        {
                        alt31=6;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 2, input);

                        throw nvae;
                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:360:5: ^( LITERAL FLOAT )
                    {
                    match(input,LITERAL,FOLLOW_LITERAL_in_otherLiteral1322); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    FLOAT10=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_otherLiteral1324); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.floatValue = new Double((FLOAT10!=null?FLOAT10.getText():null)); 
                    }

                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:362:5: ^( LITERAL MINUS_FLOAT )
                    {
                    match(input,LITERAL,FOLLOW_LITERAL_in_otherLiteral1338); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    MINUS_FLOAT11=(CommonTree)match(input,MINUS_FLOAT,FOLLOW_MINUS_FLOAT_in_otherLiteral1340); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.floatValue = new Double((MINUS_FLOAT11!=null?MINUS_FLOAT11.getText():null)); 
                    }

                    }
                    break;
                case 3 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:364:5: ^( LITERAL INT )
                    {
                    match(input,LITERAL,FOLLOW_LITERAL_in_otherLiteral1354); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    INT12=(CommonTree)match(input,INT,FOLLOW_INT_in_otherLiteral1356); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.intValue = new Integer((INT12!=null?INT12.getText():null)); 
                    }

                    }
                    break;
                case 4 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:366:5: ^( LITERAL MINUS_INT )
                    {
                    match(input,LITERAL,FOLLOW_LITERAL_in_otherLiteral1370); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    MINUS_INT13=(CommonTree)match(input,MINUS_INT,FOLLOW_MINUS_INT_in_otherLiteral1372); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.intValue = new Integer((MINUS_INT13!=null?MINUS_INT13.getText():null)); 
                    }

                    }
                    break;
                case 5 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:368:5: ^( LITERAL DATE_TIME )
                    {
                    match(input,LITERAL,FOLLOW_LITERAL_in_otherLiteral1386); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    DATE_TIME14=(CommonTree)match(input,DATE_TIME,FOLLOW_DATE_TIME_in_otherLiteral1388); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                       retval.dateValue = (DATE_TIME14!=null?DATE_TIME14.getText():null); 
                    }

                    }
                    break;
                case 6 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:370:5: ^( LITERAL NULL )
                    {
                    match(input,LITERAL,FOLLOW_LITERAL_in_otherLiteral1402); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    match(input,NULL,FOLLOW_NULL_in_otherLiteral1404); if (state.failed) return retval;

                    match(input, Token.UP, null); if (state.failed) return retval;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "otherLiteral"

    public static class testPackage_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "testPackage"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:373:1: testPackage : ^( PACKAGE PACKAGE_ID ) ;
    public final LetaTreeGrammar.testPackage_return testPackage() throws RecognitionException {
        LetaTreeGrammar.testPackage_return retval = new LetaTreeGrammar.testPackage_return();
        retval.start = input.LT(1);

        CommonTree PACKAGE_ID15=null;

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:374:3: ( ^( PACKAGE PACKAGE_ID ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:374:5: ^( PACKAGE PACKAGE_ID )
            {
            match(input,PACKAGE,FOLLOW_PACKAGE_in_testPackage1419); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            PACKAGE_ID15=(CommonTree)match(input,PACKAGE_ID,FOLLOW_PACKAGE_ID_in_testPackage1421); if (state.failed) return retval;

            match(input, Token.UP, null); if (state.failed) return retval;
            if ( state.backtracking==0 ) {

                    this.semanticModel.setPackageName((PACKAGE_ID15!=null?PACKAGE_ID15.getText():null).replaceAll("'", ""));
                  
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "testPackage"

    // $ANTLR start synpred21_LetaTreeGrammar
    public final void synpred21_LetaTreeGrammar_fragment() throws RecognitionException {   
        LetaTreeGrammar.term_return t = null;

        LetaTreeGrammar.notEqualOperator_return neo = null;

        LetaTreeGrammar.stringLiteral_return sl = null;


        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:170:5: ( ^( TERMINSTANCE t= term (neo= notEqualOperator )? sl= stringLiteral ) )
        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:170:5: ^( TERMINSTANCE t= term (neo= notEqualOperator )? sl= stringLiteral )
        {
        match(input,TERMINSTANCE,FOLLOW_TERMINSTANCE_in_synpred21_LetaTreeGrammar634); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_term_in_synpred21_LetaTreeGrammar638);
        t=term();

        state._fsp--;
        if (state.failed) return ;
        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:170:30: (neo= notEqualOperator )?
        int alt34=2;
        int LA34_0 = input.LA(1);

        if ( (LA34_0==OPERATOR) ) {
            alt34=1;
        }
        switch (alt34) {
            case 1 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:0:0: neo= notEqualOperator
                {
                pushFollow(FOLLOW_notEqualOperator_in_synpred21_LetaTreeGrammar642);
                neo=notEqualOperator();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_stringLiteral_in_synpred21_LetaTreeGrammar647);
        sl=stringLiteral();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred21_LetaTreeGrammar

    // $ANTLR start synpred43_LetaTreeGrammar
    public final void synpred43_LetaTreeGrammar_fragment() throws RecognitionException {   
        LetaTreeGrammar.stringLiteral_return sl = null;


        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:335:14: (sl= stringLiteral )
        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:335:14: sl= stringLiteral
        {
        pushFollow(FOLLOW_stringLiteral_in_synpred43_LetaTreeGrammar1248);
        sl=stringLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred43_LetaTreeGrammar

    // Delegated rules

    public final boolean synpred43_LetaTreeGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred43_LetaTreeGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred21_LetaTreeGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_LetaTreeGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA4_eotS =
        "\26\uffff";
    static final String DFA4_eofS =
        "\26\uffff";
    static final String DFA4_minS =
        "\1\12\3\2\3\12\17\uffff";
    static final String DFA4_maxS =
        "\1\74\3\2\3\74\17\uffff";
    static final String DFA4_acceptS =
        "\7\uffff\1\1\1\3\1\5\2\uffff\1\2\1\4\1\6\2\uffff\1\7\1\10\1\11\2"+
        "\uffff";
    static final String DFA4_specialS =
        "\26\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\60\uffff\1\1\1\2",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\11\2\uffff\1\7\5\uffff\1\10\47\uffff\2\11",
            "\1\16\2\uffff\1\14\5\uffff\1\15\47\uffff\2\16",
            "\1\23\2\uffff\1\21\5\uffff\1\22\47\uffff\2\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "91:1: factComposite returns [Element element] : ( ^( 'and' f= fact fc= factComposite ) | ^( 'or' f= fact fc= factComposite ) | ^( 'and' fo= formula fc= factComposite ) | ^( 'or' fo= formula fc= factComposite ) | ^( 'and' fc= factComposite fc2= factComposite ) | ^( 'or' fc= factComposite fc2= factComposite ) | ^( FACTCOMPOSITE f= fact ) | ^( FACTCOMPOSITE fo= formula ) | ^( FACTCOMPOSITE fc= factComposite ) );";
        }
    }
    static final String DFA27_eotS =
        "\14\uffff";
    static final String DFA27_eofS =
        "\14\uffff";
    static final String DFA27_minS =
        "\1\3\1\2\2\uffff\1\30\1\uffff\1\0\5\uffff";
    static final String DFA27_maxS =
        "\1\37\1\2\2\uffff\1\51\1\uffff\1\0\5\uffff";
    static final String DFA27_acceptS =
        "\2\uffff\1\2\2\uffff\1\1\6\uffff";
    static final String DFA27_specialS =
        "\6\uffff\1\0\5\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\2\25\uffff\1\1\5\uffff\1\2",
            "\1\4",
            "",
            "",
            "\1\6\13\uffff\1\2\1\5\4\2",
            "",
            "\1\uffff",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "335:14: (sl= stringLiteral )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TreeNodeStream input = (TreeNodeStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_6 = input.LA(1);

                         
                        int index27_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred43_LetaTreeGrammar()) ) {s = 5;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index27_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_LETA_in_leta67 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_testPackage_in_leta69 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_testCase_in_leta74 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_TESTCASE_in_testCase110 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_testCase112 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_setClause_in_testCase116 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_verifyClause_in_testCase121 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_whenClause_in_testCase125 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VERIFY_in_verifyClause198 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factComposite_in_verifyClause202 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHEN_in_whenClause227 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factComposite_in_whenClause231 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SET_in_setClause252 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_setClause254 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_59_in_factComposite279 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fact_in_factComposite283 = new BitSet(new long[]{0x1800000000000400L});
    public static final BitSet FOLLOW_factComposite_in_factComposite287 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_60_in_factComposite301 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fact_in_factComposite305 = new BitSet(new long[]{0x1800000000000400L});
    public static final BitSet FOLLOW_factComposite_in_factComposite309 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_59_in_factComposite323 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formula_in_factComposite327 = new BitSet(new long[]{0x1800000000000400L});
    public static final BitSet FOLLOW_factComposite_in_factComposite331 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_60_in_factComposite345 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formula_in_factComposite349 = new BitSet(new long[]{0x1800000000000400L});
    public static final BitSet FOLLOW_factComposite_in_factComposite353 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_59_in_factComposite367 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factComposite_in_factComposite371 = new BitSet(new long[]{0x1800000000000400L});
    public static final BitSet FOLLOW_factComposite_in_factComposite375 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_60_in_factComposite389 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factComposite_in_factComposite393 = new BitSet(new long[]{0x1800000000000400L});
    public static final BitSet FOLLOW_factComposite_in_factComposite397 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FACTCOMPOSITE_in_factComposite411 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fact_in_factComposite415 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FACTCOMPOSITE_in_factComposite429 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formula_in_factComposite433 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FACTCOMPOSITE_in_factComposite447 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factComposite_in_factComposite451 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FACT_in_fact476 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_termComposite_in_fact480 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_complement_in_fact484 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_termComposite_in_fact489 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_factExt_in_fact493 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FACTEXT_in_factExt521 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_complement_in_factExt525 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_termComposite_in_factExt530 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_factExt_in_factExt534 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERMCOMPOSITE_in_termComposite562 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_quantifier_in_termComposite566 = new BitSet(new long[]{0x0000000000700008L});
    public static final BitSet FOLLOW_term_in_termComposite571 = new BitSet(new long[]{0x0000000000600008L});
    public static final BitSet FOLLOW_termInstance_in_termComposite576 = new BitSet(new long[]{0x0000000000400008L});
    public static final BitSet FOLLOW_termWithAssociation_in_termComposite581 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERM_in_term607 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_term609 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERMINSTANCE_in_termInstance634 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_term_in_termInstance638 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_notEqualOperator_in_termInstance642 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_stringLiteral_in_termInstance647 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERMINSTANCE_in_termInstance661 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_term_in_termInstance665 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_relationalOperator_in_termInstance669 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_otherLiteral_in_termInstance674 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERMWITHASSOCIATION_in_termWithAssociation699 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_term_in_termWithAssociation703 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_relationalOperator_in_termWithAssociation707 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_termWithAssociation710 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUANTIFIER_in_quantifier737 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_62_in_quantifier739 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier741 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUANTIFIER_in_quantifier755 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_63_in_quantifier757 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier759 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUANTIFIER_in_quantifier773 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_64_in_quantifier775 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier777 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUANTIFIER_in_quantifier791 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_65_in_quantifier793 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier797 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier801 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMPLEMENT_in_complement826 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_complement828 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMULA_in_formula853 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formulaItem_in_formula857 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_formulaExpression_in_formula861 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMULAEXPRESSION_in_formulaExpression886 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formulaItem_in_formulaExpression890 = new BitSet(new long[]{0x0000000040000008L});
    public static final BitSet FOLLOW_mathOperator_in_formulaExpression895 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_formulaExpression_in_formulaExpression899 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMULAEXPRESSION_in_formulaExpression915 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formulaExpression_in_formulaExpression919 = new BitSet(new long[]{0x0000000040000008L});
    public static final BitSet FOLLOW_mathOperator_in_formulaExpression924 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_formulaExpression_in_formulaExpression928 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMULAITEM_in_formulaItem955 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_term_in_formulaItem959 = new BitSet(new long[]{0x0000000000600008L});
    public static final BitSet FOLLOW_termInstance_in_formulaItem964 = new BitSet(new long[]{0x0000000000400008L});
    public static final BitSet FOLLOW_termWithAssociation_in_formulaItem969 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_mathOperator995 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_67_in_mathOperator997 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_mathOperator1011 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_68_in_mathOperator1013 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_mathOperator1027 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_69_in_mathOperator1029 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_mathOperator1043 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_70_in_mathOperator1045 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_mathOperator1059 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_71_in_mathOperator1061 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_mathOperator1075 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_72_in_mathOperator1077 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_relationalOperator1102 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_73_in_relationalOperator1104 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_relationalOperator1118 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_74_in_relationalOperator1120 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_relationalOperator1134 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_75_in_relationalOperator1136 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_relationalOperator1150 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_76_in_relationalOperator1152 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_notEqualOperator_in_relationalOperator1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPERATOR_in_notEqualOperator1183 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_77_in_notEqualOperator1185 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SET_in_set1210 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_list_in_set1214 = new BitSet(new long[]{0x0000000000000208L});
    public static final BitSet FOLLOW_set_in_set1218 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIST_in_list1244 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stringLiteral_in_list1248 = new BitSet(new long[]{0x00000000C2000008L});
    public static final BitSet FOLLOW_otherLiteral_in_list1253 = new BitSet(new long[]{0x0000000080000008L});
    public static final BitSet FOLLOW_list_in_list1258 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LITERAL_in_stringLiteral1285 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_stringLiteral1287 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LITERAL_in_stringLiteral1301 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NULL_in_stringLiteral1303 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LITERAL_in_otherLiteral1322 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_otherLiteral1324 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LITERAL_in_otherLiteral1338 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_FLOAT_in_otherLiteral1340 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LITERAL_in_otherLiteral1354 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_otherLiteral1356 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LITERAL_in_otherLiteral1370 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_INT_in_otherLiteral1372 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LITERAL_in_otherLiteral1386 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_DATE_TIME_in_otherLiteral1388 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LITERAL_in_otherLiteral1402 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NULL_in_otherLiteral1404 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PACKAGE_in_testPackage1419 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PACKAGE_ID_in_testPackage1421 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERMINSTANCE_in_synpred21_LetaTreeGrammar634 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_term_in_synpred21_LetaTreeGrammar638 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_notEqualOperator_in_synpred21_LetaTreeGrammar642 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_stringLiteral_in_synpred21_LetaTreeGrammar647 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_stringLiteral_in_synpred43_LetaTreeGrammar1248 = new BitSet(new long[]{0x0000000000000002L});

}