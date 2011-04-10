// $ANTLR 3.2 Sep 23, 2009 14:05:07 /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g 2011-04-10 17:10:41

  package leta.core.grammar;
  
  import leta.core.model.*;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;
import java.util.HashMap;
public class LetaTreeGrammar extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LETA", "STMT", "TESTCASE", "WHEN", "VERIFY", "SET", "FACTCOMPOSITE", "CONJUNCTION", "DISJUNCTION", "FACT", "FACTEXT", "FACTUNARY", "FACTBINARY", "FACTNARY", "TERMCOMPOSITE", "FORMULA", "TERM", "TERMINSTANCE", "TERMWITHASSOCIATION", "COMPLEMENT", "NULL", "LITERAL", "QUANTIFIER", "FORMULAEXPRESSION", "FORMULAEXPRESSIONCOMPOSITE", "FORMULAITEM", "OPERATOR", "SUBSET", "SEPARATOR", "AND", "OR", "PACKAGE", "ID", "INT", "STRING", "FLOAT", "MINUS_FLOAT", "MINUS_INT", "PACKAGE_ID", "DIGIT", "COMMENT", "LINE_COMMENT", "WS", "'Test'", "'Verify'", "'When'", "'Set'", "'{'", "'}'", "'('", "')'", "'And'", "'Or'", "','", "'@'", "'each'", "'some'", "'atLeastOne'", "'atLeast'", "'atMostOne'", "'atMost'", "'exactlyOne'", "'exactly'", "'moreThanOne'", "'atLeastAndAtMost'", "'='", "'+'", "'-'", "'/'", "'*'", "'%'", "'**'", "'>'", "'<'", "'>='", "'<='", "'!='", "'null'", "'Package'"
    };
    public static final int PACKAGE=35;
    public static final int TERM=20;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int STMT=5;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int FORMULA=19;
    public static final int TERMINSTANCE=21;
    public static final int T__63=63;
    public static final int FACTCOMPOSITE=10;
    public static final int TERMCOMPOSITE=18;
    public static final int LETA=4;
    public static final int FLOAT=39;
    public static final int SEPARATOR=32;
    public static final int ID=36;
    public static final int AND=33;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int PACKAGE_ID=42;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int FACTEXT=14;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int DIGIT=43;
    public static final int COMMENT=44;
    public static final int FACTUNARY=15;
    public static final int T__50=50;
    public static final int FACT=13;
    public static final int MINUS_INT=41;
    public static final int MINUS_FLOAT=40;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__82=82;
    public static final int LINE_COMMENT=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int OPERATOR=30;
    public static final int CONJUNCTION=11;
    public static final int FORMULAEXPRESSION=27;
    public static final int NULL=24;
    public static final int FACTBINARY=16;
    public static final int SET=9;
    public static final int LITERAL=25;
    public static final int INT=37;
    public static final int FORMULAEXPRESSIONCOMPOSITE=28;
    public static final int FACTNARY=17;
    public static final int DISJUNCTION=12;
    public static final int T__71=71;
    public static final int SUBSET=31;
    public static final int WS=46;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int TESTCASE=6;
    public static final int WHEN=7;
    public static final int OR=34;
    public static final int FORMULAITEM=29;
    public static final int COMPLEMENT=23;
    public static final int QUANTIFIER=26;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int VERIFY=8;
    public static final int TERMWITHASSOCIATION=22;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int STRING=38;
    public static final int T__77=77;

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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:36:1: leta : ^( LETA ( testPackage )? (testCases+= testCase )+ ) -> generateLeta(testCases=$testCases);
    public final LetaTreeGrammar.leta_return leta() throws RecognitionException {
        LetaTreeGrammar.leta_return retval = new LetaTreeGrammar.leta_return();
        retval.start = input.LT(1);

        List list_testCases=null;
        RuleReturnScope testCases = null;
        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:37:3: ( ^( LETA ( testPackage )? (testCases+= testCase )+ ) -> generateLeta(testCases=$testCases))
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:37:5: ^( LETA ( testPackage )? (testCases+= testCase )+ )
            {
            match(input,LETA,FOLLOW_LETA_in_leta53); 

            match(input, Token.DOWN, null); 
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:37:12: ( testPackage )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:37:12: testPackage
                    {
                    pushFollow(FOLLOW_testPackage_in_leta55);
                    testPackage();

                    state._fsp--;


                    }
                    break;

            }

            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:37:34: (testCases+= testCase )+
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
            	    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:37:34: testCases+= testCase
            	    {
            	    pushFollow(FOLLOW_testCase_in_leta60);
            	    testCases=testCase();

            	    state._fsp--;

            	    if (list_testCases==null) list_testCases=new ArrayList();
            	    list_testCases.add(testCases.getTemplate());


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            match(input, Token.UP, null); 


            // TEMPLATE REWRITE
            // 38:5: -> generateLeta(testCases=$testCases)
            {
                retval.st = templateLib.getInstanceOf("generateLeta",
              new STAttrMap().put("testCases", list_testCases));
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:41:1: testCase : ^( TESTCASE ID (sc= setClause )? vc= verifyClause wc= whenClause ) -> generateTestCase(id=$ID.textverifyClause=vcwhenClause=wcsetClause=scpackageName=this.semanticModel.getPackageName()elements=elements);
    public final LetaTreeGrammar.testCase_return testCase() throws RecognitionException {
        LetaTreeGrammar.testCase_return retval = new LetaTreeGrammar.testCase_return();
        retval.start = input.LT(1);

        CommonTree ID1=null;
        LetaTreeGrammar.setClause_return sc = null;

        LetaTreeGrammar.verifyClause_return vc = null;

        LetaTreeGrammar.whenClause_return wc = null;



            TestCase testCase = new TestCase();
            
            this.semanticModel.addTestCase(testCase);
          
        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:47:3: ( ^( TESTCASE ID (sc= setClause )? vc= verifyClause wc= whenClause ) -> generateTestCase(id=$ID.textverifyClause=vcwhenClause=wcsetClause=scpackageName=this.semanticModel.getPackageName()elements=elements))
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:47:5: ^( TESTCASE ID (sc= setClause )? vc= verifyClause wc= whenClause )
            {
            match(input,TESTCASE,FOLLOW_TESTCASE_in_testCase96); 

            match(input, Token.DOWN, null); 
            ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_testCase98); 
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:47:21: (sc= setClause )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==SET) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:47:21: sc= setClause
                    {
                    pushFollow(FOLLOW_setClause_in_testCase102);
                    sc=setClause();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_verifyClause_in_testCase107);
            vc=verifyClause();

            state._fsp--;

            pushFollow(FOLLOW_whenClause_in_testCase111);
            wc=whenClause();

            state._fsp--;


            match(input, Token.UP, null); 

                  if (this.semanticModel.hasTestCase((ID1!=null?ID1.getText():null))) {
                    throw new FailedPredicateException(input, "testCase", "Nome do teste ja existe.");
                  }

                  testCase.setId((ID1!=null?ID1.getText():null));
                  testCase.setVerifyClause((vc!=null?vc.element:null));
                  testCase.setWhenClause((wc!=null?wc.element:null));
                  
                  testCase.generateElements();
                  
                  this.semanticModel.resetSequence();
                  
                  List<Element> elements = testCase.getElements();
                


            // TEMPLATE REWRITE
            // 63:5: -> generateTestCase(id=$ID.textverifyClause=vcwhenClause=wcsetClause=scpackageName=this.semanticModel.getPackageName()elements=elements)
            {
                retval.st = templateLib.getInstanceOf("generateTestCase",
              new STAttrMap().put("id", (ID1!=null?ID1.getText():null)).put("verifyClause", vc).put("whenClause", wc).put("setClause", sc).put("packageName", this.semanticModel.getPackageName()).put("elements", elements));
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:66:1: verifyClause returns [Element element] : ^( VERIFY fc= factComposite ) ;
    public final LetaTreeGrammar.verifyClause_return verifyClause() throws RecognitionException {
        LetaTreeGrammar.verifyClause_return retval = new LetaTreeGrammar.verifyClause_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.factComposite_return fc = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:67:3: ( ^( VERIFY fc= factComposite ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:67:5: ^( VERIFY fc= factComposite )
            {
            match(input,VERIFY,FOLLOW_VERIFY_in_verifyClause174); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_factComposite_in_verifyClause178);
            fc=factComposite();

            state._fsp--;


            match(input, Token.UP, null); 

                  retval.element = (fc!=null?fc.element:null);
                

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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:73:1: whenClause returns [Element element] : ^( WHEN fc= factComposite ) ;
    public final LetaTreeGrammar.whenClause_return whenClause() throws RecognitionException {
        LetaTreeGrammar.whenClause_return retval = new LetaTreeGrammar.whenClause_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.factComposite_return fc = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:74:3: ( ^( WHEN fc= factComposite ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:74:5: ^( WHEN fc= factComposite )
            {
            match(input,WHEN,FOLLOW_WHEN_in_whenClause203); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_factComposite_in_whenClause207);
            fc=factComposite();

            state._fsp--;


            match(input, Token.UP, null); 

                  retval.element = (fc!=null?fc.element:null);
                

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
        public Matrix matrix;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "setClause"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:80:1: setClause returns [Matrix matrix] : ^( SET set ) ;
    public final LetaTreeGrammar.setClause_return setClause() throws RecognitionException {
        LetaTreeGrammar.setClause_return retval = new LetaTreeGrammar.setClause_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.set_return set2 = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:81:3: ( ^( SET set ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:81:5: ^( SET set )
            {
            match(input,SET,FOLLOW_SET_in_setClause232); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_set_in_setClause234);
            set2=set();

            state._fsp--;


            match(input, Token.UP, null); 

                  Matrix m = new Matrix();
                  
                  m.addRows((set2!=null?set2.items:null));
                  
                  this.semanticModel.getCurrentTestCase().setMatrix(m);
                  
                  retval.matrix = m;
                

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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:93:1: factComposite returns [Element element] : ( ^( 'And' f= fact fc= factComposite ) | ^( 'Or' f= fact fc= factComposite ) | ^( 'And' fo= formula fc= factComposite ) | ^( 'Or' fo= formula fc= factComposite ) | ^( 'And' fc= factComposite fc2= factComposite ) | ^( 'Or' fc= factComposite fc2= factComposite ) | ^( FACTCOMPOSITE f= fact ) | ^( FACTCOMPOSITE fo= formula ) | ^( FACTCOMPOSITE fc= factComposite ) );
    public final LetaTreeGrammar.factComposite_return factComposite() throws RecognitionException {
        LetaTreeGrammar.factComposite_return retval = new LetaTreeGrammar.factComposite_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.fact_return f = null;

        LetaTreeGrammar.factComposite_return fc = null;

        LetaTreeGrammar.formula_return fo = null;

        LetaTreeGrammar.factComposite_return fc2 = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:99:3: ( ^( 'And' f= fact fc= factComposite ) | ^( 'Or' f= fact fc= factComposite ) | ^( 'And' fo= formula fc= factComposite ) | ^( 'Or' fo= formula fc= factComposite ) | ^( 'And' fc= factComposite fc2= factComposite ) | ^( 'Or' fc= factComposite fc2= factComposite ) | ^( FACTCOMPOSITE f= fact ) | ^( FACTCOMPOSITE fo= formula ) | ^( FACTCOMPOSITE fc= factComposite ) )
            int alt4=9;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:99:5: ^( 'And' f= fact fc= factComposite )
                    {
                    match(input,55,FOLLOW_55_in_factComposite266); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_fact_in_factComposite270);
                    f=fact();

                    state._fsp--;

                    pushFollow(FOLLOW_factComposite_in_factComposite274);
                    fc=factComposite();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     retval.element = new JunctionElement("And", (f!=null?f.element:null), (fc!=null?fc.element:null)); 

                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:101:5: ^( 'Or' f= fact fc= factComposite )
                    {
                    match(input,56,FOLLOW_56_in_factComposite288); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_fact_in_factComposite292);
                    f=fact();

                    state._fsp--;

                    pushFollow(FOLLOW_factComposite_in_factComposite296);
                    fc=factComposite();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     retval.element = new JunctionElement("Or", (f!=null?f.element:null), (fc!=null?fc.element:null)); 

                    }
                    break;
                case 3 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:103:5: ^( 'And' fo= formula fc= factComposite )
                    {
                    match(input,55,FOLLOW_55_in_factComposite310); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_formula_in_factComposite314);
                    fo=formula();

                    state._fsp--;

                    pushFollow(FOLLOW_factComposite_in_factComposite318);
                    fc=factComposite();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     retval.element = new JunctionElement("And", (fo!=null?fo.element:null), (fc!=null?fc.element:null)); 

                    }
                    break;
                case 4 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:105:5: ^( 'Or' fo= formula fc= factComposite )
                    {
                    match(input,56,FOLLOW_56_in_factComposite332); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_formula_in_factComposite336);
                    fo=formula();

                    state._fsp--;

                    pushFollow(FOLLOW_factComposite_in_factComposite340);
                    fc=factComposite();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     retval.element = new JunctionElement("Or", (fo!=null?fo.element:null), (fc!=null?fc.element:null)); 

                    }
                    break;
                case 5 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:107:5: ^( 'And' fc= factComposite fc2= factComposite )
                    {
                    match(input,55,FOLLOW_55_in_factComposite354); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_factComposite_in_factComposite358);
                    fc=factComposite();

                    state._fsp--;

                    pushFollow(FOLLOW_factComposite_in_factComposite362);
                    fc2=factComposite();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     retval.element = new JunctionElement("And", (fc!=null?fc.element:null), (fc2!=null?fc2.element:null)); 

                    }
                    break;
                case 6 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:109:5: ^( 'Or' fc= factComposite fc2= factComposite )
                    {
                    match(input,56,FOLLOW_56_in_factComposite376); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_factComposite_in_factComposite380);
                    fc=factComposite();

                    state._fsp--;

                    pushFollow(FOLLOW_factComposite_in_factComposite384);
                    fc2=factComposite();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     retval.element = new JunctionElement("Or", (fc!=null?fc.element:null), (fc2!=null?fc2.element:null)); 

                    }
                    break;
                case 7 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:111:5: ^( FACTCOMPOSITE f= fact )
                    {
                    match(input,FACTCOMPOSITE,FOLLOW_FACTCOMPOSITE_in_factComposite398); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_fact_in_factComposite402);
                    f=fact();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     retval.element = (f!=null?f.element:null); 

                    }
                    break;
                case 8 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:113:5: ^( FACTCOMPOSITE fo= formula )
                    {
                    match(input,FACTCOMPOSITE,FOLLOW_FACTCOMPOSITE_in_factComposite416); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_formula_in_factComposite420);
                    fo=formula();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     retval.element = (fo!=null?fo.element:null); 

                    }
                    break;
                case 9 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:115:5: ^( FACTCOMPOSITE fc= factComposite )
                    {
                    match(input,FACTCOMPOSITE,FOLLOW_FACTCOMPOSITE_in_factComposite434); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_factComposite_in_factComposite438);
                    fc=factComposite();

                    state._fsp--;


                    match(input, Token.UP, null); 
                     retval.element = (fc!=null?fc.element:null); 

                    }
                    break;

            }

                if (retval.element instanceof SequenceCode) {
                  this.semanticModel.addSequenceCode((SequenceCode) retval.element);
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:119:1: fact returns [Element element] : ^( FACT tc= termComposite c= complement (tc2= termComposite (fe= factExt )? )? ) ;
    public final LetaTreeGrammar.fact_return fact() throws RecognitionException {
        LetaTreeGrammar.fact_return retval = new LetaTreeGrammar.fact_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.termComposite_return tc = null;

        LetaTreeGrammar.complement_return c = null;

        LetaTreeGrammar.termComposite_return tc2 = null;

        LetaTreeGrammar.factExt_return fe = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:120:3: ( ^( FACT tc= termComposite c= complement (tc2= termComposite (fe= factExt )? )? ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:120:5: ^( FACT tc= termComposite c= complement (tc2= termComposite (fe= factExt )? )? )
            {
            match(input,FACT,FOLLOW_FACT_in_fact463); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_termComposite_in_fact467);
            tc=termComposite();

            state._fsp--;

            pushFollow(FOLLOW_complement_in_fact471);
            c=complement();

            state._fsp--;

            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:120:42: (tc2= termComposite (fe= factExt )? )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==TERMCOMPOSITE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:120:43: tc2= termComposite (fe= factExt )?
                    {
                    pushFollow(FOLLOW_termComposite_in_fact476);
                    tc2=termComposite();

                    state._fsp--;

                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:120:63: (fe= factExt )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==FACTEXT) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:120:63: fe= factExt
                            {
                            pushFollow(FOLLOW_factExt_in_fact480);
                            fe=factExt();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }


            match(input, Token.UP, null); 

                  (tc!=null?tc.classElement:null).setMethodElement((c!=null?c.methodElement:null));
                  
                  if (tc2 != null) {
                    (c!=null?c.methodElement:null).setClassElement((tc2!=null?tc2.classElement:null));
                  
                    if (fe != null) {
                      if ((fe!=null?fe.methodElement:null) != null) {
                        (tc2!=null?tc2.classElement:null).setMethodElement((fe!=null?fe.methodElement:null));
            	        } else if ((fe!=null?fe.classElement:null) != null) {
                        (tc2!=null?tc2.classElement:null).setNext((fe!=null?fe.classElement:null));
                        (tc2!=null?tc2.classElement:null).setMethodElement((fe!=null?fe.classElement:null).getMethodElement());
            	        }
            	      }
                  }

                  retval.element = (tc!=null?tc.classElement:null);
                

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
        public ClassElement classElement;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "factExt"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:141:1: factExt returns [MethodElement methodElement, ClassElement classElement] : ( ^( FACTEXT SEPARATOR tc= termComposite (fe= factExt )? ) | ^( FACTEXT c= complement (tc= termComposite (fe= factExt )? )? ) );
    public final LetaTreeGrammar.factExt_return factExt() throws RecognitionException {
        LetaTreeGrammar.factExt_return retval = new LetaTreeGrammar.factExt_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.termComposite_return tc = null;

        LetaTreeGrammar.factExt_return fe = null;

        LetaTreeGrammar.complement_return c = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:143:3: ( ^( FACTEXT SEPARATOR tc= termComposite (fe= factExt )? ) | ^( FACTEXT c= complement (tc= termComposite (fe= factExt )? )? ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==FACTEXT) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==DOWN) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==SEPARATOR) ) {
                        alt10=1;
                    }
                    else if ( (LA10_2==COMPLEMENT) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:143:5: ^( FACTEXT SEPARATOR tc= termComposite (fe= factExt )? )
                    {
                    match(input,FACTEXT,FOLLOW_FACTEXT_in_factExt511); 

                    match(input, Token.DOWN, null); 
                    match(input,SEPARATOR,FOLLOW_SEPARATOR_in_factExt513); 
                    pushFollow(FOLLOW_termComposite_in_factExt517);
                    tc=termComposite();

                    state._fsp--;

                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:143:44: (fe= factExt )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==FACTEXT) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:143:44: fe= factExt
                            {
                            pushFollow(FOLLOW_factExt_in_factExt521);
                            fe=factExt();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                          if (fe != null) {
                    	      // Verifica se existe um factExt.methodElement
                            if ((fe!=null?fe.methodElement:null) != null) {
                              (tc!=null?tc.classElement:null).setMethodElement((fe!=null?fe.methodElement:null));
                    	      } else if ((fe!=null?fe.classElement:null) != null) {
                              (tc!=null?tc.classElement:null).setNext((fe!=null?fe.classElement:null));
                              (tc!=null?tc.classElement:null).setMethodElement((fe!=null?fe.classElement:null).getMethodElement());
                    	      }
                          }
                          
                          retval.classElement = (tc!=null?tc.classElement:null);
                        

                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:157:5: ^( FACTEXT c= complement (tc= termComposite (fe= factExt )? )? )
                    {
                    match(input,FACTEXT,FOLLOW_FACTEXT_in_factExt536); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_complement_in_factExt540);
                    c=complement();

                    state._fsp--;

                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:157:28: (tc= termComposite (fe= factExt )? )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==TERMCOMPOSITE) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:157:29: tc= termComposite (fe= factExt )?
                            {
                            pushFollow(FOLLOW_termComposite_in_factExt545);
                            tc=termComposite();

                            state._fsp--;

                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:157:48: (fe= factExt )?
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0==FACTEXT) ) {
                                alt8=1;
                            }
                            switch (alt8) {
                                case 1 :
                                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:157:48: fe= factExt
                                    {
                                    pushFollow(FOLLOW_factExt_in_factExt549);
                                    fe=factExt();

                                    state._fsp--;


                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                          if (tc != null) {
                            (c!=null?c.methodElement:null).setClassElement((tc!=null?tc.classElement:null));
                            
                            if (fe != null) {
                              if ((fe!=null?fe.methodElement:null) != null) {
                                (tc!=null?tc.classElement:null).setMethodElement((fe!=null?fe.methodElement:null));
                    		      } else if ((fe!=null?fe.classElement:null) != null) {
                    		        (tc!=null?tc.classElement:null).setNext((fe!=null?fe.classElement:null));
                    		        (tc!=null?tc.classElement:null).setMethodElement((fe!=null?fe.classElement:null).getMethodElement());
                    		      }
                    	      }
                          }

                          retval.methodElement = (c!=null?c.methodElement:null);
                        

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
    // $ANTLR end "factExt"

    public static class termComposite_return extends TreeRuleReturnScope {
        public ClassElement classElement;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "termComposite"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:176:1: termComposite returns [ClassElement classElement] : ^( TERMCOMPOSITE (q= quantifier )? (t= term )? (ti= termInstance )? (twa= termWithAssociation )? ) ;
    public final LetaTreeGrammar.termComposite_return termComposite() throws RecognitionException {
        LetaTreeGrammar.termComposite_return retval = new LetaTreeGrammar.termComposite_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.quantifier_return q = null;

        LetaTreeGrammar.term_return t = null;

        LetaTreeGrammar.termInstance_return ti = null;

        LetaTreeGrammar.termWithAssociation_return twa = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:177:3: ( ^( TERMCOMPOSITE (q= quantifier )? (t= term )? (ti= termInstance )? (twa= termWithAssociation )? ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:177:5: ^( TERMCOMPOSITE (q= quantifier )? (t= term )? (ti= termInstance )? (twa= termWithAssociation )? )
            {
            match(input,TERMCOMPOSITE,FOLLOW_TERMCOMPOSITE_in_termComposite577); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:177:22: (q= quantifier )?
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==QUANTIFIER) ) {
                    alt11=1;
                }
                switch (alt11) {
                    case 1 :
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:177:22: q= quantifier
                        {
                        pushFollow(FOLLOW_quantifier_in_termComposite581);
                        q=quantifier();

                        state._fsp--;


                        }
                        break;

                }

                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:177:36: (t= term )?
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==TERM) ) {
                    alt12=1;
                }
                switch (alt12) {
                    case 1 :
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:177:36: t= term
                        {
                        pushFollow(FOLLOW_term_in_termComposite586);
                        t=term();

                        state._fsp--;


                        }
                        break;

                }

                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:177:45: (ti= termInstance )?
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==TERMINSTANCE) ) {
                    alt13=1;
                }
                switch (alt13) {
                    case 1 :
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:177:45: ti= termInstance
                        {
                        pushFollow(FOLLOW_termInstance_in_termComposite591);
                        ti=termInstance();

                        state._fsp--;


                        }
                        break;

                }

                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:177:63: (twa= termWithAssociation )?
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==TERMWITHASSOCIATION) ) {
                    alt14=1;
                }
                switch (alt14) {
                    case 1 :
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:177:63: twa= termWithAssociation
                        {
                        pushFollow(FOLLOW_termWithAssociation_in_termComposite596);
                        twa=termWithAssociation();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:194:1: term returns [ClassElement classElement] : ^( TERM ID ) ;
    public final LetaTreeGrammar.term_return term() throws RecognitionException {
        LetaTreeGrammar.term_return retval = new LetaTreeGrammar.term_return();
        retval.start = input.LT(1);

        CommonTree ID3=null;

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:195:3: ( ^( TERM ID ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:195:5: ^( TERM ID )
            {
            match(input,TERM,FOLLOW_TERM_in_term622); 

            match(input, Token.DOWN, null); 
            ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_term624); 

            match(input, Token.UP, null); 

                  retval.classElement = new ClassElement((ID3!=null?ID3.getText():null));
                  
                  this.semanticModel.addSequenceCode((SequenceCode) retval.classElement);
                

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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:203:1: termInstance returns [ClassElement classElement] : ^( TERMINSTANCE t= term (ro= relationalOperator )? l= literal ) ;
    public final LetaTreeGrammar.termInstance_return termInstance() throws RecognitionException {
        LetaTreeGrammar.termInstance_return retval = new LetaTreeGrammar.termInstance_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.term_return t = null;

        LetaTreeGrammar.relationalOperator_return ro = null;

        LetaTreeGrammar.literal_return l = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:204:3: ( ^( TERMINSTANCE t= term (ro= relationalOperator )? l= literal ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:204:5: ^( TERMINSTANCE t= term (ro= relationalOperator )? l= literal )
            {
            match(input,TERMINSTANCE,FOLLOW_TERMINSTANCE_in_termInstance649); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_term_in_termInstance653);
            t=term();

            state._fsp--;

            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:204:29: (ro= relationalOperator )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==OPERATOR) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:204:29: ro= relationalOperator
                    {
                    pushFollow(FOLLOW_relationalOperator_in_termInstance657);
                    ro=relationalOperator();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_literal_in_termInstance662);
            l=literal();

            state._fsp--;


            match(input, Token.UP, null); 

                  retval.classElement = (t!=null?t.classElement:null);
                  retval.classElement.setRelationalOperator((ro!=null?ro.operator:null));
                  
                  if ((l!=null?l.stringValue:null) != null)
                    retval.classElement.setStringValue((l!=null?l.stringValue:null));
                  else if ((l!=null?l.floatValue:null) != null)
                    retval.classElement.setFloatValue((l!=null?l.floatValue:null));
                  else if ((l!=null?l.intValue:null) != null)
                    retval.classElement.setIntValue((l!=null?l.intValue:null));
                

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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:218:1: termWithAssociation returns [ClassElement classElement] : ^( TERMWITHASSOCIATION t= term (ro= relationalOperator )? INT ) ;
    public final LetaTreeGrammar.termWithAssociation_return termWithAssociation() throws RecognitionException {
        LetaTreeGrammar.termWithAssociation_return retval = new LetaTreeGrammar.termWithAssociation_return();
        retval.start = input.LT(1);

        CommonTree INT4=null;
        LetaTreeGrammar.term_return t = null;

        LetaTreeGrammar.relationalOperator_return ro = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:219:3: ( ^( TERMWITHASSOCIATION t= term (ro= relationalOperator )? INT ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:219:5: ^( TERMWITHASSOCIATION t= term (ro= relationalOperator )? INT )
            {
            match(input,TERMWITHASSOCIATION,FOLLOW_TERMWITHASSOCIATION_in_termWithAssociation687); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_term_in_termWithAssociation691);
            t=term();

            state._fsp--;

            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:219:36: (ro= relationalOperator )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==OPERATOR) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:219:36: ro= relationalOperator
                    {
                    pushFollow(FOLLOW_relationalOperator_in_termWithAssociation695);
                    ro=relationalOperator();

                    state._fsp--;


                    }
                    break;

            }

            INT4=(CommonTree)match(input,INT,FOLLOW_INT_in_termWithAssociation698); 

            match(input, Token.UP, null); 

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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:236:1: quantifier returns [String type, String operator, Integer value, Integer value2] : ( ^( QUANTIFIER 'each' ) | ^( QUANTIFIER 'some' ) | ^( QUANTIFIER 'atLeastOne' ) | ^( QUANTIFIER 'atLeast' INT ) | ^( QUANTIFIER 'atMostOne' ) | ^( QUANTIFIER 'atMost' INT ) | ^( QUANTIFIER 'exactlyOne' ) | ^( QUANTIFIER 'exactly' INT ) | ^( QUANTIFIER 'moreThanOne' ) | ^( QUANTIFIER 'atLeastAndAtMost' v1= INT v2= INT ) );
    public final LetaTreeGrammar.quantifier_return quantifier() throws RecognitionException {
        LetaTreeGrammar.quantifier_return retval = new LetaTreeGrammar.quantifier_return();
        retval.start = input.LT(1);

        CommonTree v1=null;
        CommonTree v2=null;
        CommonTree INT5=null;
        CommonTree INT6=null;
        CommonTree INT7=null;

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:237:3: ( ^( QUANTIFIER 'each' ) | ^( QUANTIFIER 'some' ) | ^( QUANTIFIER 'atLeastOne' ) | ^( QUANTIFIER 'atLeast' INT ) | ^( QUANTIFIER 'atMostOne' ) | ^( QUANTIFIER 'atMost' INT ) | ^( QUANTIFIER 'exactlyOne' ) | ^( QUANTIFIER 'exactly' INT ) | ^( QUANTIFIER 'moreThanOne' ) | ^( QUANTIFIER 'atLeastAndAtMost' v1= INT v2= INT ) )
            int alt17=10;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:237:5: ^( QUANTIFIER 'each' )
                    {
                    match(input,QUANTIFIER,FOLLOW_QUANTIFIER_in_quantifier725); 

                    match(input, Token.DOWN, null); 
                    match(input,59,FOLLOW_59_in_quantifier727); 

                    match(input, Token.UP, null); 
                     retval.type = "each"; retval.operator = "=="; 

                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:239:5: ^( QUANTIFIER 'some' )
                    {
                    match(input,QUANTIFIER,FOLLOW_QUANTIFIER_in_quantifier741); 

                    match(input, Token.DOWN, null); 
                    match(input,60,FOLLOW_60_in_quantifier743); 

                    match(input, Token.UP, null); 
                     retval.type = "some"; retval.operator = "=="; 

                    }
                    break;
                case 3 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:241:5: ^( QUANTIFIER 'atLeastOne' )
                    {
                    match(input,QUANTIFIER,FOLLOW_QUANTIFIER_in_quantifier757); 

                    match(input, Token.DOWN, null); 
                    match(input,61,FOLLOW_61_in_quantifier759); 

                    match(input, Token.UP, null); 
                     retval.type = "atLeastOne"; retval.operator = ">="; 

                    }
                    break;
                case 4 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:243:5: ^( QUANTIFIER 'atLeast' INT )
                    {
                    match(input,QUANTIFIER,FOLLOW_QUANTIFIER_in_quantifier773); 

                    match(input, Token.DOWN, null); 
                    match(input,62,FOLLOW_62_in_quantifier775); 
                    INT5=(CommonTree)match(input,INT,FOLLOW_INT_in_quantifier777); 

                    match(input, Token.UP, null); 
                     retval.type = "atLeast"; retval.operator = ">="; retval.value = Integer.parseInt((INT5!=null?INT5.getText():null)); 

                    }
                    break;
                case 5 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:245:5: ^( QUANTIFIER 'atMostOne' )
                    {
                    match(input,QUANTIFIER,FOLLOW_QUANTIFIER_in_quantifier791); 

                    match(input, Token.DOWN, null); 
                    match(input,63,FOLLOW_63_in_quantifier793); 

                    match(input, Token.UP, null); 
                     retval.type = "atMostOne"; retval.operator = "<="; 

                    }
                    break;
                case 6 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:247:5: ^( QUANTIFIER 'atMost' INT )
                    {
                    match(input,QUANTIFIER,FOLLOW_QUANTIFIER_in_quantifier807); 

                    match(input, Token.DOWN, null); 
                    match(input,64,FOLLOW_64_in_quantifier809); 
                    INT6=(CommonTree)match(input,INT,FOLLOW_INT_in_quantifier811); 

                    match(input, Token.UP, null); 
                     retval.type = "atMost"; retval.operator = "<="; retval.value = Integer.parseInt((INT6!=null?INT6.getText():null)); 

                    }
                    break;
                case 7 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:249:5: ^( QUANTIFIER 'exactlyOne' )
                    {
                    match(input,QUANTIFIER,FOLLOW_QUANTIFIER_in_quantifier825); 

                    match(input, Token.DOWN, null); 
                    match(input,65,FOLLOW_65_in_quantifier827); 

                    match(input, Token.UP, null); 
                     retval.type = "exactlyOne"; retval.operator = "=="; 

                    }
                    break;
                case 8 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:251:5: ^( QUANTIFIER 'exactly' INT )
                    {
                    match(input,QUANTIFIER,FOLLOW_QUANTIFIER_in_quantifier841); 

                    match(input, Token.DOWN, null); 
                    match(input,66,FOLLOW_66_in_quantifier843); 
                    INT7=(CommonTree)match(input,INT,FOLLOW_INT_in_quantifier845); 

                    match(input, Token.UP, null); 
                     retval.type = "exactly"; retval.operator = "=="; retval.value = Integer.parseInt((INT7!=null?INT7.getText():null)); 

                    }
                    break;
                case 9 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:253:5: ^( QUANTIFIER 'moreThanOne' )
                    {
                    match(input,QUANTIFIER,FOLLOW_QUANTIFIER_in_quantifier859); 

                    match(input, Token.DOWN, null); 
                    match(input,67,FOLLOW_67_in_quantifier861); 

                    match(input, Token.UP, null); 
                     retval.type = "moreThanOne"; retval.operator = ">="; 

                    }
                    break;
                case 10 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:255:5: ^( QUANTIFIER 'atLeastAndAtMost' v1= INT v2= INT )
                    {
                    match(input,QUANTIFIER,FOLLOW_QUANTIFIER_in_quantifier875); 

                    match(input, Token.DOWN, null); 
                    match(input,68,FOLLOW_68_in_quantifier877); 
                    v1=(CommonTree)match(input,INT,FOLLOW_INT_in_quantifier881); 
                    v2=(CommonTree)match(input,INT,FOLLOW_INT_in_quantifier885); 

                    match(input, Token.UP, null); 
                     retval.type = "atLeastAndAtMost"; retval.operator = ">=&<="; retval.value = Integer.parseInt((v1!=null?v1.getText():null)); retval.value2 = Integer.parseInt((v2!=null?v2.getText():null)); 

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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:259:1: complement returns [MethodElement methodElement] : ^( COMPLEMENT ID ) ;
    public final LetaTreeGrammar.complement_return complement() throws RecognitionException {
        LetaTreeGrammar.complement_return retval = new LetaTreeGrammar.complement_return();
        retval.start = input.LT(1);

        CommonTree ID8=null;

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:260:3: ( ^( COMPLEMENT ID ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:260:5: ^( COMPLEMENT ID )
            {
            match(input,COMPLEMENT,FOLLOW_COMPLEMENT_in_complement910); 

            match(input, Token.DOWN, null); 
            ID8=(CommonTree)match(input,ID,FOLLOW_ID_in_complement912); 

            match(input, Token.UP, null); 

                  retval.methodElement = new MethodElement((ID8!=null?ID8.getText():null));
                

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
        public Element element;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "formula"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:266:1: formula returns [Element element] : ^( FORMULA fi= formulaItem fe= formulaExpression ) ;
    public final LetaTreeGrammar.formula_return formula() throws RecognitionException {
        LetaTreeGrammar.formula_return retval = new LetaTreeGrammar.formula_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.formulaItem_return fi = null;

        LetaTreeGrammar.formulaExpression_return fe = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:267:3: ( ^( FORMULA fi= formulaItem fe= formulaExpression ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:267:5: ^( FORMULA fi= formulaItem fe= formulaExpression )
            {
            match(input,FORMULA,FOLLOW_FORMULA_in_formula937); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_formulaItem_in_formula941);
            fi=formulaItem();

            state._fsp--;

            pushFollow(FOLLOW_formulaExpression_in_formula945);
            fe=formulaExpression();

            state._fsp--;


            match(input, Token.UP, null); 

                  retval.element = new OperatorElement("equals", (fi!=null?fi.classElement:null), (fe!=null?fe.element:null));
                

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
        public Element element;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "formulaExpression"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:273:1: formulaExpression returns [Element element] : ( ^( FORMULAEXPRESSION fi= formulaItem (mo= mathOperator fe= formulaExpression )? ) | ^( FORMULAEXPRESSION fe= formulaExpression (mo= mathOperator fe2= formulaExpression )? ) );
    public final LetaTreeGrammar.formulaExpression_return formulaExpression() throws RecognitionException {
        LetaTreeGrammar.formulaExpression_return retval = new LetaTreeGrammar.formulaExpression_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.formulaItem_return fi = null;

        LetaTreeGrammar.mathOperator_return mo = null;

        LetaTreeGrammar.formulaExpression_return fe = null;

        LetaTreeGrammar.formulaExpression_return fe2 = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:274:3: ( ^( FORMULAEXPRESSION fi= formulaItem (mo= mathOperator fe= formulaExpression )? ) | ^( FORMULAEXPRESSION fe= formulaExpression (mo= mathOperator fe2= formulaExpression )? ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==FORMULAEXPRESSION) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==DOWN) ) {
                    int LA20_2 = input.LA(3);

                    if ( (LA20_2==FORMULAEXPRESSION) ) {
                        alt20=2;
                    }
                    else if ( (LA20_2==FORMULAITEM) ) {
                        alt20=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:274:5: ^( FORMULAEXPRESSION fi= formulaItem (mo= mathOperator fe= formulaExpression )? )
                    {
                    match(input,FORMULAEXPRESSION,FOLLOW_FORMULAEXPRESSION_in_formulaExpression970); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_formulaItem_in_formulaExpression974);
                    fi=formulaItem();

                    state._fsp--;

                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:274:40: (mo= mathOperator fe= formulaExpression )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==OPERATOR) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:274:41: mo= mathOperator fe= formulaExpression
                            {
                            pushFollow(FOLLOW_mathOperator_in_formulaExpression979);
                            mo=mathOperator();

                            state._fsp--;

                            pushFollow(FOLLOW_formulaExpression_in_formulaExpression983);
                            fe=formulaExpression();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                          if (mo != null)
                            retval.element = new OperatorElement((
                              (mo!=null?mo.operator:null).equals("+") ? "sum" : 
                              (mo!=null?mo.operator:null).equals("-") ? "minus" : 
                              (mo!=null?mo.operator:null).equals("*") ? "multiply" : 
                              (mo!=null?mo.operator:null).equals("/") ? "divide" : "power"), (fi!=null?fi.classElement:null), (fe!=null?fe.element:null));
                          else
                            retval.element = (fi!=null?fi.classElement:null);
                        

                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:285:5: ^( FORMULAEXPRESSION fe= formulaExpression (mo= mathOperator fe2= formulaExpression )? )
                    {
                    match(input,FORMULAEXPRESSION,FOLLOW_FORMULAEXPRESSION_in_formulaExpression999); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_formulaExpression_in_formulaExpression1003);
                    fe=formulaExpression();

                    state._fsp--;

                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:285:46: (mo= mathOperator fe2= formulaExpression )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==OPERATOR) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:285:47: mo= mathOperator fe2= formulaExpression
                            {
                            pushFollow(FOLLOW_mathOperator_in_formulaExpression1008);
                            mo=mathOperator();

                            state._fsp--;

                            pushFollow(FOLLOW_formulaExpression_in_formulaExpression1012);
                            fe2=formulaExpression();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

                          retval.element = new OperatorElement((
                            (mo!=null?mo.operator:null).equals("+") ? "sum" : 
                            (mo!=null?mo.operator:null).equals("-") ? "minus" : 
                            (mo!=null?mo.operator:null).equals("*") ? "multiply" : 
                            (mo!=null?mo.operator:null).equals("/") ? "divide" : "power"), (fe!=null?fe.element:null), (fe2!=null?fe2.element:null));
                        

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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:295:1: formulaItem returns [ClassElement classElement] : ^( FORMULAITEM (t= term )? (ti= termInstance )? (twa= termWithAssociation )? ) ;
    public final LetaTreeGrammar.formulaItem_return formulaItem() throws RecognitionException {
        LetaTreeGrammar.formulaItem_return retval = new LetaTreeGrammar.formulaItem_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.term_return t = null;

        LetaTreeGrammar.termInstance_return ti = null;

        LetaTreeGrammar.termWithAssociation_return twa = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:296:3: ( ^( FORMULAITEM (t= term )? (ti= termInstance )? (twa= termWithAssociation )? ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:296:5: ^( FORMULAITEM (t= term )? (ti= termInstance )? (twa= termWithAssociation )? )
            {
            match(input,FORMULAITEM,FOLLOW_FORMULAITEM_in_formulaItem1039); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:296:20: (t= term )?
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==TERM) ) {
                    alt21=1;
                }
                switch (alt21) {
                    case 1 :
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:296:20: t= term
                        {
                        pushFollow(FOLLOW_term_in_formulaItem1043);
                        t=term();

                        state._fsp--;


                        }
                        break;

                }

                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:296:29: (ti= termInstance )?
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==TERMINSTANCE) ) {
                    alt22=1;
                }
                switch (alt22) {
                    case 1 :
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:296:29: ti= termInstance
                        {
                        pushFollow(FOLLOW_termInstance_in_formulaItem1048);
                        ti=termInstance();

                        state._fsp--;


                        }
                        break;

                }

                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:296:47: (twa= termWithAssociation )?
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==TERMWITHASSOCIATION) ) {
                    alt23=1;
                }
                switch (alt23) {
                    case 1 :
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:296:47: twa= termWithAssociation
                        {
                        pushFollow(FOLLOW_termWithAssociation_in_formulaItem1053);
                        twa=termWithAssociation();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:309:1: mathOperator returns [String operator] : ( ^( OPERATOR '+' ) | ^( OPERATOR '-' ) | ^( OPERATOR '/' ) | ^( OPERATOR '*' ) | ^( OPERATOR '%' ) | ^( OPERATOR '**' ) );
    public final LetaTreeGrammar.mathOperator_return mathOperator() throws RecognitionException {
        LetaTreeGrammar.mathOperator_return retval = new LetaTreeGrammar.mathOperator_return();
        retval.start = input.LT(1);

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:310:3: ( ^( OPERATOR '+' ) | ^( OPERATOR '-' ) | ^( OPERATOR '/' ) | ^( OPERATOR '*' ) | ^( OPERATOR '%' ) | ^( OPERATOR '**' ) )
            int alt24=6;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==OPERATOR) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case 70:
                        {
                        alt24=1;
                        }
                        break;
                    case 71:
                        {
                        alt24=2;
                        }
                        break;
                    case 72:
                        {
                        alt24=3;
                        }
                        break;
                    case 73:
                        {
                        alt24=4;
                        }
                        break;
                    case 74:
                        {
                        alt24=5;
                        }
                        break;
                    case 75:
                        {
                        alt24=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:310:5: ^( OPERATOR '+' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_mathOperator1079); 

                    match(input, Token.DOWN, null); 
                    match(input,70,FOLLOW_70_in_mathOperator1081); 

                    match(input, Token.UP, null); 
                     retval.operator = "+"; 

                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:312:5: ^( OPERATOR '-' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_mathOperator1095); 

                    match(input, Token.DOWN, null); 
                    match(input,71,FOLLOW_71_in_mathOperator1097); 

                    match(input, Token.UP, null); 
                     retval.operator = "-"; 

                    }
                    break;
                case 3 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:314:5: ^( OPERATOR '/' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_mathOperator1111); 

                    match(input, Token.DOWN, null); 
                    match(input,72,FOLLOW_72_in_mathOperator1113); 

                    match(input, Token.UP, null); 
                     retval.operator = "/"; 

                    }
                    break;
                case 4 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:316:5: ^( OPERATOR '*' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_mathOperator1127); 

                    match(input, Token.DOWN, null); 
                    match(input,73,FOLLOW_73_in_mathOperator1129); 

                    match(input, Token.UP, null); 
                     retval.operator = "*"; 

                    }
                    break;
                case 5 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:318:5: ^( OPERATOR '%' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_mathOperator1143); 

                    match(input, Token.DOWN, null); 
                    match(input,74,FOLLOW_74_in_mathOperator1145); 

                    match(input, Token.UP, null); 
                     retval.operator = "%"; 

                    }
                    break;
                case 6 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:320:5: ^( OPERATOR '**' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_mathOperator1159); 

                    match(input, Token.DOWN, null); 
                    match(input,75,FOLLOW_75_in_mathOperator1161); 

                    match(input, Token.UP, null); 
                     retval.operator = "**"; 

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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:324:1: relationalOperator returns [String operator] : ( ^( OPERATOR '>' ) | ^( OPERATOR '<' ) | ^( OPERATOR '>=' ) | ^( OPERATOR '<=' ) | ^( OPERATOR '!=' ) );
    public final LetaTreeGrammar.relationalOperator_return relationalOperator() throws RecognitionException {
        LetaTreeGrammar.relationalOperator_return retval = new LetaTreeGrammar.relationalOperator_return();
        retval.start = input.LT(1);

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:325:3: ( ^( OPERATOR '>' ) | ^( OPERATOR '<' ) | ^( OPERATOR '>=' ) | ^( OPERATOR '<=' ) | ^( OPERATOR '!=' ) )
            int alt25=5;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==OPERATOR) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case 76:
                        {
                        alt25=1;
                        }
                        break;
                    case 77:
                        {
                        alt25=2;
                        }
                        break;
                    case 78:
                        {
                        alt25=3;
                        }
                        break;
                    case 79:
                        {
                        alt25=4;
                        }
                        break;
                    case 80:
                        {
                        alt25=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:325:5: ^( OPERATOR '>' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_relationalOperator1186); 

                    match(input, Token.DOWN, null); 
                    match(input,76,FOLLOW_76_in_relationalOperator1188); 

                    match(input, Token.UP, null); 
                     retval.operator = "MoreThan"; 

                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:327:5: ^( OPERATOR '<' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_relationalOperator1202); 

                    match(input, Token.DOWN, null); 
                    match(input,77,FOLLOW_77_in_relationalOperator1204); 

                    match(input, Token.UP, null); 
                     retval.operator = "LessThan"; 

                    }
                    break;
                case 3 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:329:5: ^( OPERATOR '>=' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_relationalOperator1218); 

                    match(input, Token.DOWN, null); 
                    match(input,78,FOLLOW_78_in_relationalOperator1220); 

                    match(input, Token.UP, null); 
                     retval.operator = "EqualOrMoreThan"; 

                    }
                    break;
                case 4 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:331:5: ^( OPERATOR '<=' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_relationalOperator1234); 

                    match(input, Token.DOWN, null); 
                    match(input,79,FOLLOW_79_in_relationalOperator1236); 

                    match(input, Token.UP, null); 
                     retval.operator = "EqualOrLessThan"; 

                    }
                    break;
                case 5 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:333:5: ^( OPERATOR '!=' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_relationalOperator1250); 

                    match(input, Token.DOWN, null); 
                    match(input,80,FOLLOW_80_in_relationalOperator1252); 

                    match(input, Token.UP, null); 
                     retval.operator = "NotEqual"; 

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

    public static class set_return extends TreeRuleReturnScope {
        public ArrayList<MatrixItem> items = new ArrayList<MatrixItem>();
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "set"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:337:1: set returns [ArrayList<MatrixItem> items = new ArrayList<MatrixItem>()] : ^( SET sb= subSet (s= set )? ) ;
    public final LetaTreeGrammar.set_return set() throws RecognitionException {
        LetaTreeGrammar.set_return retval = new LetaTreeGrammar.set_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.subSet_return sb = null;

        LetaTreeGrammar.set_return s = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:338:3: ( ^( SET sb= subSet (s= set )? ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:338:5: ^( SET sb= subSet (s= set )? )
            {
            match(input,SET,FOLLOW_SET_in_set1277); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subSet_in_set1281);
            sb=subSet();

            state._fsp--;

            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:338:22: (s= set )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==SET) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:338:22: s= set
                    {
                    pushFollow(FOLLOW_set_in_set1285);
                    s=set();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

                  retval.items.add((sb!=null?sb.matrixItem:null));
                  
                  if (s != null)
                   retval.items.addAll((s!=null?s.items:null)); 
                

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

    public static class subSet_return extends TreeRuleReturnScope {
        public MatrixItem matrixItem = new MatrixItem();
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "subSet"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:347:1: subSet returns [MatrixItem matrixItem = new MatrixItem()] : ^( SUBSET lt= literal (ss= subSet )? ) ;
    public final LetaTreeGrammar.subSet_return subSet() throws RecognitionException {
        LetaTreeGrammar.subSet_return retval = new LetaTreeGrammar.subSet_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.literal_return lt = null;

        LetaTreeGrammar.subSet_return ss = null;


        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:348:3: ( ^( SUBSET lt= literal (ss= subSet )? ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:348:5: ^( SUBSET lt= literal (ss= subSet )? )
            {
            match(input,SUBSET,FOLLOW_SUBSET_in_subSet1311); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_literal_in_subSet1315);
            lt=literal();

            state._fsp--;

            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:348:27: (ss= subSet )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==SUBSET) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:348:27: ss= subSet
                    {
                    pushFollow(FOLLOW_subSet_in_subSet1319);
                    ss=subSet();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

                  if ((lt!=null?lt.stringValue:null) != null)
                    retval.matrixItem.addColumn((lt!=null?lt.stringValue:null));
                  else if ((lt!=null?lt.intValue:null) != null)
                    retval.matrixItem.addColumn((lt!=null?lt.intValue:null));
                  if ((lt!=null?lt.floatValue:null) != null)
                    retval.matrixItem.addColumn((lt!=null?lt.floatValue:null));

                  if (ss != null)
                    retval.matrixItem.addColumns((ss!=null?ss.matrixItem:null).getColumns());
                

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
    // $ANTLR end "subSet"

    public static class literal_return extends TreeRuleReturnScope {
        public String stringValue;
        public Integer intValue;
        public Double floatValue;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "literal"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:362:1: literal returns [String stringValue, Integer intValue, Double floatValue] : ( ^( LITERAL STRING ) | ^( LITERAL FLOAT ) | ^( LITERAL MINUS_FLOAT ) | ^( LITERAL INT ) | ^( LITERAL MINUS_INT ) | ^( LITERAL NULL ) );
    public final LetaTreeGrammar.literal_return literal() throws RecognitionException {
        LetaTreeGrammar.literal_return retval = new LetaTreeGrammar.literal_return();
        retval.start = input.LT(1);

        CommonTree STRING9=null;
        CommonTree FLOAT10=null;
        CommonTree MINUS_FLOAT11=null;
        CommonTree INT12=null;
        CommonTree MINUS_INT13=null;

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:363:3: ( ^( LITERAL STRING ) | ^( LITERAL FLOAT ) | ^( LITERAL MINUS_FLOAT ) | ^( LITERAL INT ) | ^( LITERAL MINUS_INT ) | ^( LITERAL NULL ) )
            int alt28=6;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==LITERAL) ) {
                int LA28_1 = input.LA(2);

                if ( (LA28_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case STRING:
                        {
                        alt28=1;
                        }
                        break;
                    case FLOAT:
                        {
                        alt28=2;
                        }
                        break;
                    case MINUS_FLOAT:
                        {
                        alt28=3;
                        }
                        break;
                    case INT:
                        {
                        alt28=4;
                        }
                        break;
                    case MINUS_INT:
                        {
                        alt28=5;
                        }
                        break;
                    case NULL:
                        {
                        alt28=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 28, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 28, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:363:5: ^( LITERAL STRING )
                    {
                    match(input,LITERAL,FOLLOW_LITERAL_in_literal1346); 

                    match(input, Token.DOWN, null); 
                    STRING9=(CommonTree)match(input,STRING,FOLLOW_STRING_in_literal1348); 

                    match(input, Token.UP, null); 
                     retval.stringValue = (STRING9!=null?STRING9.getText():null); 

                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:365:5: ^( LITERAL FLOAT )
                    {
                    match(input,LITERAL,FOLLOW_LITERAL_in_literal1362); 

                    match(input, Token.DOWN, null); 
                    FLOAT10=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_literal1364); 

                    match(input, Token.UP, null); 
                     retval.floatValue = new Double((FLOAT10!=null?FLOAT10.getText():null)); 

                    }
                    break;
                case 3 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:367:5: ^( LITERAL MINUS_FLOAT )
                    {
                    match(input,LITERAL,FOLLOW_LITERAL_in_literal1378); 

                    match(input, Token.DOWN, null); 
                    MINUS_FLOAT11=(CommonTree)match(input,MINUS_FLOAT,FOLLOW_MINUS_FLOAT_in_literal1380); 

                    match(input, Token.UP, null); 
                     retval.floatValue = new Double((MINUS_FLOAT11!=null?MINUS_FLOAT11.getText():null)); 

                    }
                    break;
                case 4 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:369:5: ^( LITERAL INT )
                    {
                    match(input,LITERAL,FOLLOW_LITERAL_in_literal1394); 

                    match(input, Token.DOWN, null); 
                    INT12=(CommonTree)match(input,INT,FOLLOW_INT_in_literal1396); 

                    match(input, Token.UP, null); 
                     retval.intValue = new Integer((INT12!=null?INT12.getText():null)); 

                    }
                    break;
                case 5 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:371:5: ^( LITERAL MINUS_INT )
                    {
                    match(input,LITERAL,FOLLOW_LITERAL_in_literal1410); 

                    match(input, Token.DOWN, null); 
                    MINUS_INT13=(CommonTree)match(input,MINUS_INT,FOLLOW_MINUS_INT_in_literal1412); 

                    match(input, Token.UP, null); 
                     retval.intValue = new Integer((MINUS_INT13!=null?MINUS_INT13.getText():null)); 

                    }
                    break;
                case 6 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:373:5: ^( LITERAL NULL )
                    {
                    match(input,LITERAL,FOLLOW_LITERAL_in_literal1426); 

                    match(input, Token.DOWN, null); 
                    match(input,NULL,FOLLOW_NULL_in_literal1428); 

                    match(input, Token.UP, null); 

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
    // $ANTLR end "literal"

    public static class testPackage_return extends TreeRuleReturnScope {
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "testPackage"
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:376:1: testPackage : ^( PACKAGE PACKAGE_ID ) ;
    public final LetaTreeGrammar.testPackage_return testPackage() throws RecognitionException {
        LetaTreeGrammar.testPackage_return retval = new LetaTreeGrammar.testPackage_return();
        retval.start = input.LT(1);

        CommonTree PACKAGE_ID14=null;

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:377:3: ( ^( PACKAGE PACKAGE_ID ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaTreeGrammar.g:377:5: ^( PACKAGE PACKAGE_ID )
            {
            match(input,PACKAGE,FOLLOW_PACKAGE_in_testPackage1443); 

            match(input, Token.DOWN, null); 
            PACKAGE_ID14=(CommonTree)match(input,PACKAGE_ID,FOLLOW_PACKAGE_ID_in_testPackage1445); 

            match(input, Token.UP, null); 

                  this.semanticModel.setPackageName((PACKAGE_ID14!=null?PACKAGE_ID14.getText():null).replaceAll("'", ""));
                

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

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA4_eotS =
        "\20\uffff";
    static final String DFA4_eofS =
        "\20\uffff";
    static final String DFA4_minS =
        "\1\12\3\2\3\12\11\uffff";
    static final String DFA4_maxS =
        "\1\70\3\2\3\70\11\uffff";
    static final String DFA4_acceptS =
        "\7\uffff\1\5\1\3\1\1\1\2\1\6\1\4\1\10\1\11\1\7";
    static final String DFA4_specialS =
        "\20\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\54\uffff\1\1\1\2",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\7\2\uffff\1\11\5\uffff\1\10\43\uffff\2\7",
            "\1\13\2\uffff\1\12\5\uffff\1\14\43\uffff\2\13",
            "\1\16\2\uffff\1\17\5\uffff\1\15\43\uffff\2\16",
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
            return "93:1: factComposite returns [Element element] : ( ^( 'And' f= fact fc= factComposite ) | ^( 'Or' f= fact fc= factComposite ) | ^( 'And' fo= formula fc= factComposite ) | ^( 'Or' fo= formula fc= factComposite ) | ^( 'And' fc= factComposite fc2= factComposite ) | ^( 'Or' fc= factComposite fc2= factComposite ) | ^( FACTCOMPOSITE f= fact ) | ^( FACTCOMPOSITE fo= formula ) | ^( FACTCOMPOSITE fc= factComposite ) );";
        }
    }
    static final String DFA17_eotS =
        "\15\uffff";
    static final String DFA17_eofS =
        "\15\uffff";
    static final String DFA17_minS =
        "\1\32\1\2\1\73\12\uffff";
    static final String DFA17_maxS =
        "\1\32\1\2\1\104\12\uffff";
    static final String DFA17_acceptS =
        "\3\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA17_specialS =
        "\15\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14",
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

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "236:1: quantifier returns [String type, String operator, Integer value, Integer value2] : ( ^( QUANTIFIER 'each' ) | ^( QUANTIFIER 'some' ) | ^( QUANTIFIER 'atLeastOne' ) | ^( QUANTIFIER 'atLeast' INT ) | ^( QUANTIFIER 'atMostOne' ) | ^( QUANTIFIER 'atMost' INT ) | ^( QUANTIFIER 'exactlyOne' ) | ^( QUANTIFIER 'exactly' INT ) | ^( QUANTIFIER 'moreThanOne' ) | ^( QUANTIFIER 'atLeastAndAtMost' v1= INT v2= INT ) );";
        }
    }
 

    public static final BitSet FOLLOW_LETA_in_leta53 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_testPackage_in_leta55 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_testCase_in_leta60 = new BitSet(new long[]{0x0000000000000048L});
    public static final BitSet FOLLOW_TESTCASE_in_testCase96 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_testCase98 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_setClause_in_testCase102 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_verifyClause_in_testCase107 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_whenClause_in_testCase111 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VERIFY_in_verifyClause174 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factComposite_in_verifyClause178 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHEN_in_whenClause203 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factComposite_in_whenClause207 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SET_in_setClause232 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_setClause234 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_55_in_factComposite266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fact_in_factComposite270 = new BitSet(new long[]{0x0180000000000400L});
    public static final BitSet FOLLOW_factComposite_in_factComposite274 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_56_in_factComposite288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fact_in_factComposite292 = new BitSet(new long[]{0x0180000000000400L});
    public static final BitSet FOLLOW_factComposite_in_factComposite296 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_55_in_factComposite310 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formula_in_factComposite314 = new BitSet(new long[]{0x0180000000000400L});
    public static final BitSet FOLLOW_factComposite_in_factComposite318 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_56_in_factComposite332 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formula_in_factComposite336 = new BitSet(new long[]{0x0180000000000400L});
    public static final BitSet FOLLOW_factComposite_in_factComposite340 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_55_in_factComposite354 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factComposite_in_factComposite358 = new BitSet(new long[]{0x0180000000000400L});
    public static final BitSet FOLLOW_factComposite_in_factComposite362 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_56_in_factComposite376 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factComposite_in_factComposite380 = new BitSet(new long[]{0x0180000000000400L});
    public static final BitSet FOLLOW_factComposite_in_factComposite384 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FACTCOMPOSITE_in_factComposite398 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fact_in_factComposite402 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FACTCOMPOSITE_in_factComposite416 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formula_in_factComposite420 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FACTCOMPOSITE_in_factComposite434 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factComposite_in_factComposite438 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FACT_in_fact463 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_termComposite_in_fact467 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_complement_in_fact471 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_termComposite_in_fact476 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_factExt_in_fact480 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FACTEXT_in_factExt511 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_SEPARATOR_in_factExt513 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_termComposite_in_factExt517 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_factExt_in_factExt521 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FACTEXT_in_factExt536 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_complement_in_factExt540 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_termComposite_in_factExt545 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_factExt_in_factExt549 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERMCOMPOSITE_in_termComposite577 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_quantifier_in_termComposite581 = new BitSet(new long[]{0x0000000000700008L});
    public static final BitSet FOLLOW_term_in_termComposite586 = new BitSet(new long[]{0x0000000000600008L});
    public static final BitSet FOLLOW_termInstance_in_termComposite591 = new BitSet(new long[]{0x0000000000400008L});
    public static final BitSet FOLLOW_termWithAssociation_in_termComposite596 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERM_in_term622 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_term624 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERMINSTANCE_in_termInstance649 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_term_in_termInstance653 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_relationalOperator_in_termInstance657 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_literal_in_termInstance662 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERMWITHASSOCIATION_in_termWithAssociation687 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_term_in_termWithAssociation691 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_relationalOperator_in_termWithAssociation695 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_termWithAssociation698 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUANTIFIER_in_quantifier725 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_59_in_quantifier727 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUANTIFIER_in_quantifier741 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_60_in_quantifier743 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUANTIFIER_in_quantifier757 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_61_in_quantifier759 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUANTIFIER_in_quantifier773 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_62_in_quantifier775 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier777 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUANTIFIER_in_quantifier791 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_63_in_quantifier793 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUANTIFIER_in_quantifier807 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_64_in_quantifier809 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier811 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUANTIFIER_in_quantifier825 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_65_in_quantifier827 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUANTIFIER_in_quantifier841 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_quantifier843 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier845 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUANTIFIER_in_quantifier859 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_67_in_quantifier861 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUANTIFIER_in_quantifier875 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_68_in_quantifier877 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier881 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier885 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMPLEMENT_in_complement910 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_complement912 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMULA_in_formula937 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formulaItem_in_formula941 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_formulaExpression_in_formula945 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMULAEXPRESSION_in_formulaExpression970 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formulaItem_in_formulaExpression974 = new BitSet(new long[]{0x0000000040000008L});
    public static final BitSet FOLLOW_mathOperator_in_formulaExpression979 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_formulaExpression_in_formulaExpression983 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMULAEXPRESSION_in_formulaExpression999 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formulaExpression_in_formulaExpression1003 = new BitSet(new long[]{0x0000000040000008L});
    public static final BitSet FOLLOW_mathOperator_in_formulaExpression1008 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_formulaExpression_in_formulaExpression1012 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMULAITEM_in_formulaItem1039 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_term_in_formulaItem1043 = new BitSet(new long[]{0x0000000000600008L});
    public static final BitSet FOLLOW_termInstance_in_formulaItem1048 = new BitSet(new long[]{0x0000000000400008L});
    public static final BitSet FOLLOW_termWithAssociation_in_formulaItem1053 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_mathOperator1079 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_70_in_mathOperator1081 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_mathOperator1095 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_71_in_mathOperator1097 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_mathOperator1111 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_72_in_mathOperator1113 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_mathOperator1127 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_73_in_mathOperator1129 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_mathOperator1143 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_74_in_mathOperator1145 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_mathOperator1159 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_75_in_mathOperator1161 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_relationalOperator1186 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_76_in_relationalOperator1188 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_relationalOperator1202 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_77_in_relationalOperator1204 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_relationalOperator1218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_78_in_relationalOperator1220 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_relationalOperator1234 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_79_in_relationalOperator1236 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_relationalOperator1250 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_80_in_relationalOperator1252 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SET_in_set1277 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subSet_in_set1281 = new BitSet(new long[]{0x0000000000000208L});
    public static final BitSet FOLLOW_set_in_set1285 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSET_in_subSet1311 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_literal_in_subSet1315 = new BitSet(new long[]{0x0000000080000008L});
    public static final BitSet FOLLOW_subSet_in_subSet1319 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LITERAL_in_literal1346 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_literal1348 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LITERAL_in_literal1362 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_literal1364 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LITERAL_in_literal1378 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_FLOAT_in_literal1380 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LITERAL_in_literal1394 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_literal1396 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LITERAL_in_literal1410 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_INT_in_literal1412 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LITERAL_in_literal1426 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NULL_in_literal1428 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PACKAGE_in_testPackage1443 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PACKAGE_ID_in_testPackage1445 = new BitSet(new long[]{0x0000000000000008L});

}