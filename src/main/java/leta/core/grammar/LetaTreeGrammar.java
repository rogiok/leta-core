// $ANTLR 3.3 Nov 30, 2010 12:46:29 C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g 2011-04-13 13:33:02

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LETA", "STMT", "TESTCASE", "WHEN", "VERIFY", "SET", "FACTCOMPOSITE", "CONJUNCTION", "DISJUNCTION", "FACT", "FACTEXT", "FACTUNARY", "FACTBINARY", "FACTNARY", "TERMCOMPOSITE", "FORMULA", "TERM", "TERMINSTANCE", "TERMWITHASSOCIATION", "COMPLEMENT", "NULL", "LITERAL", "QUANTIFIER", "FORMULAEXPRESSION", "FORMULAEXPRESSIONCOMPOSITE", "FORMULAITEM", "OPERATOR", "SUBSET", "AND", "OR", "PACKAGE", "ID", "INT", "STRING", "FLOAT", "MINUS_FLOAT", "MINUS_INT", "PACKAGE_ID", "DIGIT", "COMMENT", "LINE_COMMENT", "WS", "'Test'", "'Verify'", "'When'", "'Set'", "'{'", "'}'", "'('", "')'", "'And'", "'Or'", "'@'", "'atLeast'", "'atMost'", "'exactly'", "'atLeastAndAtMost'", "'='", "'+'", "'-'", "'/'", "'*'", "'%'", "'**'", "'>'", "'<'", "'>='", "'<='", "'!='", "','", "'null'", "'Package'"
    };
    public static final int EOF=-1;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
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
    public static final int SUBSET=31;
    public static final int AND=32;
    public static final int OR=33;
    public static final int PACKAGE=34;
    public static final int ID=35;
    public static final int INT=36;
    public static final int STRING=37;
    public static final int FLOAT=38;
    public static final int MINUS_FLOAT=39;
    public static final int MINUS_INT=40;
    public static final int PACKAGE_ID=41;
    public static final int DIGIT=42;
    public static final int COMMENT=43;
    public static final int LINE_COMMENT=44;
    public static final int WS=45;

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
    public String getGrammarFileName() { return "C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g"; }


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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:36:1: leta : ^( LETA ( testPackage )? (testCases+= testCase )+ ) -> generateLeta(testCases=$testCases);
    public final LetaTreeGrammar.leta_return leta() throws RecognitionException {
        LetaTreeGrammar.leta_return retval = new LetaTreeGrammar.leta_return();
        retval.start = input.LT(1);

        List list_testCases=null;
        RuleReturnScope testCases = null;
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:37:3: ( ^( LETA ( testPackage )? (testCases+= testCase )+ ) -> generateLeta(testCases=$testCases))
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:37:5: ^( LETA ( testPackage )? (testCases+= testCase )+ )
            {
            match(input,LETA,FOLLOW_LETA_in_leta53); 

            match(input, Token.DOWN, null); 
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:37:12: ( testPackage )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==PACKAGE) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:37:12: testPackage
                    {
                    pushFollow(FOLLOW_testPackage_in_leta55);
                    testPackage();

                    state._fsp--;


                    }
                    break;

            }

            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:37:34: (testCases+= testCase )+
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
            	    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:37:34: testCases+= testCase
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:41:1: testCase : ^( TESTCASE ID (sc= setClause )? vc= verifyClause wc= whenClause ) -> generateTestCase(id=$ID.textverifyClause=vcwhenClause=wcsetClause=scpackageName=this.semanticModel.getPackageName()elements=elements);
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:47:3: ( ^( TESTCASE ID (sc= setClause )? vc= verifyClause wc= whenClause ) -> generateTestCase(id=$ID.textverifyClause=vcwhenClause=wcsetClause=scpackageName=this.semanticModel.getPackageName()elements=elements))
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:47:5: ^( TESTCASE ID (sc= setClause )? vc= verifyClause wc= whenClause )
            {
            match(input,TESTCASE,FOLLOW_TESTCASE_in_testCase96); 

            match(input, Token.DOWN, null); 
            ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_testCase98); 
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:47:21: (sc= setClause )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==SET) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:47:21: sc= setClause
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

                  if (this.semanticModel.findTestCase((ID1!=null?ID1.getText():null)) != null) {
                    throw new FailedPredicateException(input, "testCase", "Nome do teste ja existe.");
                  }

                  testCase.setId((ID1!=null?ID1.getText():null));
                  testCase.setVerifyClause((vc!=null?vc.element:null));
                  testCase.setWhenClause((wc!=null?wc.element:null));
                  
                  testCase.generateElements();
                  
                  List<Element> elements = testCase.getElements();
                


            // TEMPLATE REWRITE
            // 61:5: -> generateTestCase(id=$ID.textverifyClause=vcwhenClause=wcsetClause=scpackageName=this.semanticModel.getPackageName()elements=elements)
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:64:1: verifyClause returns [Element element] : ^( VERIFY fc= factComposite ) ;
    public final LetaTreeGrammar.verifyClause_return verifyClause() throws RecognitionException {
        LetaTreeGrammar.verifyClause_return retval = new LetaTreeGrammar.verifyClause_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.factComposite_return fc = null;


        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:65:3: ( ^( VERIFY fc= factComposite ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:65:5: ^( VERIFY fc= factComposite )
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:71:1: whenClause returns [Element element] : ^( WHEN fc= factComposite ) ;
    public final LetaTreeGrammar.whenClause_return whenClause() throws RecognitionException {
        LetaTreeGrammar.whenClause_return retval = new LetaTreeGrammar.whenClause_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.factComposite_return fc = null;


        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:72:3: ( ^( WHEN fc= factComposite ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:72:5: ^( WHEN fc= factComposite )
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:78:1: setClause returns [Matrix matrix] : ^( SET set ) ;
    public final LetaTreeGrammar.setClause_return setClause() throws RecognitionException {
        LetaTreeGrammar.setClause_return retval = new LetaTreeGrammar.setClause_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.set_return set2 = null;


        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:79:3: ( ^( SET set ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:79:5: ^( SET set )
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:91:1: factComposite returns [Element element] : ( ^( 'And' f= fact fc= factComposite ) | ^( 'Or' f= fact fc= factComposite ) | ^( 'And' fo= formula fc= factComposite ) | ^( 'Or' fo= formula fc= factComposite ) | ^( 'And' fc= factComposite fc2= factComposite ) | ^( 'Or' fc= factComposite fc2= factComposite ) | ^( FACTCOMPOSITE f= fact ) | ^( FACTCOMPOSITE fo= formula ) | ^( FACTCOMPOSITE fc= factComposite ) );
    public final LetaTreeGrammar.factComposite_return factComposite() throws RecognitionException {
        LetaTreeGrammar.factComposite_return retval = new LetaTreeGrammar.factComposite_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.fact_return f = null;

        LetaTreeGrammar.factComposite_return fc = null;

        LetaTreeGrammar.formula_return fo = null;

        LetaTreeGrammar.factComposite_return fc2 = null;


        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:97:3: ( ^( 'And' f= fact fc= factComposite ) | ^( 'Or' f= fact fc= factComposite ) | ^( 'And' fo= formula fc= factComposite ) | ^( 'Or' fo= formula fc= factComposite ) | ^( 'And' fc= factComposite fc2= factComposite ) | ^( 'Or' fc= factComposite fc2= factComposite ) | ^( FACTCOMPOSITE f= fact ) | ^( FACTCOMPOSITE fo= formula ) | ^( FACTCOMPOSITE fc= factComposite ) )
            int alt4=9;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:97:5: ^( 'And' f= fact fc= factComposite )
                    {
                    match(input,54,FOLLOW_54_in_factComposite266); 

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
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:99:5: ^( 'Or' f= fact fc= factComposite )
                    {
                    match(input,55,FOLLOW_55_in_factComposite288); 

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
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:101:5: ^( 'And' fo= formula fc= factComposite )
                    {
                    match(input,54,FOLLOW_54_in_factComposite310); 

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
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:103:5: ^( 'Or' fo= formula fc= factComposite )
                    {
                    match(input,55,FOLLOW_55_in_factComposite332); 

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
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:105:5: ^( 'And' fc= factComposite fc2= factComposite )
                    {
                    match(input,54,FOLLOW_54_in_factComposite354); 

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
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:107:5: ^( 'Or' fc= factComposite fc2= factComposite )
                    {
                    match(input,55,FOLLOW_55_in_factComposite376); 

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
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:109:5: ^( FACTCOMPOSITE f= fact )
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
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:111:5: ^( FACTCOMPOSITE fo= formula )
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
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:113:5: ^( FACTCOMPOSITE fc= factComposite )
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
                  this.semanticModel.getCurrentTestCase().addSequenceCode((SequenceCode) retval.element);
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:117:1: fact returns [Element element] : ^( FACT tc= termComposite c= complement (tc2= termComposite (fe= factExt )? )? ) ;
    public final LetaTreeGrammar.fact_return fact() throws RecognitionException {
        LetaTreeGrammar.fact_return retval = new LetaTreeGrammar.fact_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.termComposite_return tc = null;

        LetaTreeGrammar.complement_return c = null;

        LetaTreeGrammar.termComposite_return tc2 = null;

        LetaTreeGrammar.factExt_return fe = null;


        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:118:3: ( ^( FACT tc= termComposite c= complement (tc2= termComposite (fe= factExt )? )? ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:118:5: ^( FACT tc= termComposite c= complement (tc2= termComposite (fe= factExt )? )? )
            {
            match(input,FACT,FOLLOW_FACT_in_fact463); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_termComposite_in_fact467);
            tc=termComposite();

            state._fsp--;

            pushFollow(FOLLOW_complement_in_fact471);
            c=complement();

            state._fsp--;

            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:118:42: (tc2= termComposite (fe= factExt )? )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==TERMCOMPOSITE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:118:43: tc2= termComposite (fe= factExt )?
                    {
                    pushFollow(FOLLOW_termComposite_in_fact476);
                    tc2=termComposite();

                    state._fsp--;

                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:118:63: (fe= factExt )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==FACTEXT) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:118:63: fe= factExt
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
                  
                    if (fe != null && (fe!=null?fe.methodElement:null) != null) {
                      (tc2!=null?tc2.classElement:null).setMethodElement((fe!=null?fe.methodElement:null));
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
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "factExt"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:134:1: factExt returns [MethodElement methodElement] : ^( FACTEXT c= complement (tc= termComposite (fe= factExt )? )? ) ;
    public final LetaTreeGrammar.factExt_return factExt() throws RecognitionException {
        LetaTreeGrammar.factExt_return retval = new LetaTreeGrammar.factExt_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.complement_return c = null;

        LetaTreeGrammar.termComposite_return tc = null;

        LetaTreeGrammar.factExt_return fe = null;


        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:135:3: ( ^( FACTEXT c= complement (tc= termComposite (fe= factExt )? )? ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:135:5: ^( FACTEXT c= complement (tc= termComposite (fe= factExt )? )? )
            {
            match(input,FACTEXT,FOLLOW_FACTEXT_in_factExt508); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_complement_in_factExt512);
            c=complement();

            state._fsp--;

            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:135:28: (tc= termComposite (fe= factExt )? )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==TERMCOMPOSITE) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:135:29: tc= termComposite (fe= factExt )?
                    {
                    pushFollow(FOLLOW_termComposite_in_factExt517);
                    tc=termComposite();

                    state._fsp--;

                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:135:48: (fe= factExt )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==FACTEXT) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:135:48: fe= factExt
                            {
                            pushFollow(FOLLOW_factExt_in_factExt521);
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
                    
                    if (fe != null && (fe!=null?fe.methodElement:null) != null) {
                      (tc!=null?tc.classElement:null).setMethodElement((fe!=null?fe.methodElement:null));
            	      }
                  }

                  retval.methodElement = (c!=null?c.methodElement:null);
                

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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:149:1: termComposite returns [ClassElement classElement] : ^( TERMCOMPOSITE (q= quantifier )? (t= term )? (ti= termInstance )? (twa= termWithAssociation )? ) ;
    public final LetaTreeGrammar.termComposite_return termComposite() throws RecognitionException {
        LetaTreeGrammar.termComposite_return retval = new LetaTreeGrammar.termComposite_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.quantifier_return q = null;

        LetaTreeGrammar.term_return t = null;

        LetaTreeGrammar.termInstance_return ti = null;

        LetaTreeGrammar.termWithAssociation_return twa = null;


        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:150:3: ( ^( TERMCOMPOSITE (q= quantifier )? (t= term )? (ti= termInstance )? (twa= termWithAssociation )? ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:150:5: ^( TERMCOMPOSITE (q= quantifier )? (t= term )? (ti= termInstance )? (twa= termWithAssociation )? )
            {
            match(input,TERMCOMPOSITE,FOLLOW_TERMCOMPOSITE_in_termComposite549); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:150:22: (q= quantifier )?
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==QUANTIFIER) ) {
                    alt9=1;
                }
                switch (alt9) {
                    case 1 :
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:150:22: q= quantifier
                        {
                        pushFollow(FOLLOW_quantifier_in_termComposite553);
                        q=quantifier();

                        state._fsp--;


                        }
                        break;

                }

                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:150:36: (t= term )?
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==TERM) ) {
                    alt10=1;
                }
                switch (alt10) {
                    case 1 :
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:150:36: t= term
                        {
                        pushFollow(FOLLOW_term_in_termComposite558);
                        t=term();

                        state._fsp--;


                        }
                        break;

                }

                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:150:45: (ti= termInstance )?
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==TERMINSTANCE) ) {
                    alt11=1;
                }
                switch (alt11) {
                    case 1 :
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:150:45: ti= termInstance
                        {
                        pushFollow(FOLLOW_termInstance_in_termComposite563);
                        ti=termInstance();

                        state._fsp--;


                        }
                        break;

                }

                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:150:63: (twa= termWithAssociation )?
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==TERMWITHASSOCIATION) ) {
                    alt12=1;
                }
                switch (alt12) {
                    case 1 :
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:150:63: twa= termWithAssociation
                        {
                        pushFollow(FOLLOW_termWithAssociation_in_termComposite568);
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:167:1: term returns [ClassElement classElement] : ^( TERM ID ) ;
    public final LetaTreeGrammar.term_return term() throws RecognitionException {
        LetaTreeGrammar.term_return retval = new LetaTreeGrammar.term_return();
        retval.start = input.LT(1);

        CommonTree ID3=null;

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:168:3: ( ^( TERM ID ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:168:5: ^( TERM ID )
            {
            match(input,TERM,FOLLOW_TERM_in_term594); 

            match(input, Token.DOWN, null); 
            ID3=(CommonTree)match(input,ID,FOLLOW_ID_in_term596); 

            match(input, Token.UP, null); 

                  retval.classElement = new ClassElement((ID3!=null?ID3.getText():null));
                  
                  this.semanticModel.getCurrentTestCase().addSequenceCode((SequenceCode) retval.classElement);
                

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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:176:1: termInstance returns [ClassElement classElement] : ^( TERMINSTANCE t= term (ro= relationalOperator )? l= literal ) ;
    public final LetaTreeGrammar.termInstance_return termInstance() throws RecognitionException {
        LetaTreeGrammar.termInstance_return retval = new LetaTreeGrammar.termInstance_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.term_return t = null;

        LetaTreeGrammar.relationalOperator_return ro = null;

        LetaTreeGrammar.literal_return l = null;


        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:177:3: ( ^( TERMINSTANCE t= term (ro= relationalOperator )? l= literal ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:177:5: ^( TERMINSTANCE t= term (ro= relationalOperator )? l= literal )
            {
            match(input,TERMINSTANCE,FOLLOW_TERMINSTANCE_in_termInstance621); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_term_in_termInstance625);
            t=term();

            state._fsp--;

            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:177:29: (ro= relationalOperator )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==OPERATOR) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:177:29: ro= relationalOperator
                    {
                    pushFollow(FOLLOW_relationalOperator_in_termInstance629);
                    ro=relationalOperator();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_literal_in_termInstance634);
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:191:1: termWithAssociation returns [ClassElement classElement] : ^( TERMWITHASSOCIATION t= term (ro= relationalOperator )? INT ) ;
    public final LetaTreeGrammar.termWithAssociation_return termWithAssociation() throws RecognitionException {
        LetaTreeGrammar.termWithAssociation_return retval = new LetaTreeGrammar.termWithAssociation_return();
        retval.start = input.LT(1);

        CommonTree INT4=null;
        LetaTreeGrammar.term_return t = null;

        LetaTreeGrammar.relationalOperator_return ro = null;


        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:192:3: ( ^( TERMWITHASSOCIATION t= term (ro= relationalOperator )? INT ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:192:5: ^( TERMWITHASSOCIATION t= term (ro= relationalOperator )? INT )
            {
            match(input,TERMWITHASSOCIATION,FOLLOW_TERMWITHASSOCIATION_in_termWithAssociation659); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_term_in_termWithAssociation663);
            t=term();

            state._fsp--;

            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:192:36: (ro= relationalOperator )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==OPERATOR) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:192:36: ro= relationalOperator
                    {
                    pushFollow(FOLLOW_relationalOperator_in_termWithAssociation667);
                    ro=relationalOperator();

                    state._fsp--;


                    }
                    break;

            }

            INT4=(CommonTree)match(input,INT,FOLLOW_INT_in_termWithAssociation670); 

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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:209:1: quantifier returns [String type, String operator, Integer value, Integer value2] : ( ^( QUANTIFIER 'atLeast' INT ) | ^( QUANTIFIER 'atMost' INT ) | ^( QUANTIFIER 'exactly' INT ) | ^( QUANTIFIER 'atLeastAndAtMost' v1= INT v2= INT ) );
    public final LetaTreeGrammar.quantifier_return quantifier() throws RecognitionException {
        LetaTreeGrammar.quantifier_return retval = new LetaTreeGrammar.quantifier_return();
        retval.start = input.LT(1);

        CommonTree v1=null;
        CommonTree v2=null;
        CommonTree INT5=null;
        CommonTree INT6=null;
        CommonTree INT7=null;

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:210:3: ( ^( QUANTIFIER 'atLeast' INT ) | ^( QUANTIFIER 'atMost' INT ) | ^( QUANTIFIER 'exactly' INT ) | ^( QUANTIFIER 'atLeastAndAtMost' v1= INT v2= INT ) )
            int alt15=4;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==QUANTIFIER) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case 57:
                        {
                        alt15=1;
                        }
                        break;
                    case 58:
                        {
                        alt15=2;
                        }
                        break;
                    case 59:
                        {
                        alt15=3;
                        }
                        break;
                    case 60:
                        {
                        alt15=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:210:5: ^( QUANTIFIER 'atLeast' INT )
                    {
                    match(input,QUANTIFIER,FOLLOW_QUANTIFIER_in_quantifier697); 

                    match(input, Token.DOWN, null); 
                    match(input,57,FOLLOW_57_in_quantifier699); 
                    INT5=(CommonTree)match(input,INT,FOLLOW_INT_in_quantifier701); 

                    match(input, Token.UP, null); 
                     retval.type = "atLeast"; retval.operator = ">="; retval.value = Integer.parseInt((INT5!=null?INT5.getText():null)); 

                    }
                    break;
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:212:5: ^( QUANTIFIER 'atMost' INT )
                    {
                    match(input,QUANTIFIER,FOLLOW_QUANTIFIER_in_quantifier715); 

                    match(input, Token.DOWN, null); 
                    match(input,58,FOLLOW_58_in_quantifier717); 
                    INT6=(CommonTree)match(input,INT,FOLLOW_INT_in_quantifier719); 

                    match(input, Token.UP, null); 
                     retval.type = "atMost"; retval.operator = "<="; retval.value = Integer.parseInt((INT6!=null?INT6.getText():null)); 

                    }
                    break;
                case 3 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:214:5: ^( QUANTIFIER 'exactly' INT )
                    {
                    match(input,QUANTIFIER,FOLLOW_QUANTIFIER_in_quantifier733); 

                    match(input, Token.DOWN, null); 
                    match(input,59,FOLLOW_59_in_quantifier735); 
                    INT7=(CommonTree)match(input,INT,FOLLOW_INT_in_quantifier737); 

                    match(input, Token.UP, null); 
                     retval.type = "exactly"; retval.operator = "=="; retval.value = Integer.parseInt((INT7!=null?INT7.getText():null)); 

                    }
                    break;
                case 4 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:216:5: ^( QUANTIFIER 'atLeastAndAtMost' v1= INT v2= INT )
                    {
                    match(input,QUANTIFIER,FOLLOW_QUANTIFIER_in_quantifier751); 

                    match(input, Token.DOWN, null); 
                    match(input,60,FOLLOW_60_in_quantifier753); 
                    v1=(CommonTree)match(input,INT,FOLLOW_INT_in_quantifier757); 
                    v2=(CommonTree)match(input,INT,FOLLOW_INT_in_quantifier761); 

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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:220:1: complement returns [MethodElement methodElement] : ^( COMPLEMENT ID ) ;
    public final LetaTreeGrammar.complement_return complement() throws RecognitionException {
        LetaTreeGrammar.complement_return retval = new LetaTreeGrammar.complement_return();
        retval.start = input.LT(1);

        CommonTree ID8=null;

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:221:3: ( ^( COMPLEMENT ID ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:221:5: ^( COMPLEMENT ID )
            {
            match(input,COMPLEMENT,FOLLOW_COMPLEMENT_in_complement786); 

            match(input, Token.DOWN, null); 
            ID8=(CommonTree)match(input,ID,FOLLOW_ID_in_complement788); 

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
        public ClassElement element;
        public StringTemplate st;
        public Object getTemplate() { return st; }
        public String toString() { return st==null?null:st.toString(); }
    };

    // $ANTLR start "formula"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:227:1: formula returns [ClassElement element] : ^( FORMULA fi= formulaItem fe= formulaExpression ) ;
    public final LetaTreeGrammar.formula_return formula() throws RecognitionException {
        LetaTreeGrammar.formula_return retval = new LetaTreeGrammar.formula_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.formulaItem_return fi = null;

        LetaTreeGrammar.formulaExpression_return fe = null;


        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:228:3: ( ^( FORMULA fi= formulaItem fe= formulaExpression ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:228:5: ^( FORMULA fi= formulaItem fe= formulaExpression )
            {
            match(input,FORMULA,FOLLOW_FORMULA_in_formula813); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_formulaItem_in_formula817);
            fi=formulaItem();

            state._fsp--;

            pushFollow(FOLLOW_formulaExpression_in_formula821);
            fe=formulaExpression();

            state._fsp--;


            match(input, Token.UP, null); 

                  retval.element = (fi!=null?fi.classElement:null);
                  
                  MethodElement me = new MethodElement("equals");
                  me.setClassElement((fe!=null?fe.classElement:null));
                  retval.element.setMethodElement(me);
                

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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:238:1: formulaExpression returns [ClassElement classElement] : ( ^( FORMULAEXPRESSION fi= formulaItem (mo= mathOperator fe= formulaExpression )? ) | ^( FORMULAEXPRESSION fe= formulaExpression (mo= mathOperator fe2= formulaExpression )? ) );
    public final LetaTreeGrammar.formulaExpression_return formulaExpression() throws RecognitionException {
        LetaTreeGrammar.formulaExpression_return retval = new LetaTreeGrammar.formulaExpression_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.formulaItem_return fi = null;

        LetaTreeGrammar.mathOperator_return mo = null;

        LetaTreeGrammar.formulaExpression_return fe = null;

        LetaTreeGrammar.formulaExpression_return fe2 = null;


        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:239:3: ( ^( FORMULAEXPRESSION fi= formulaItem (mo= mathOperator fe= formulaExpression )? ) | ^( FORMULAEXPRESSION fe= formulaExpression (mo= mathOperator fe2= formulaExpression )? ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==FORMULAEXPRESSION) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==DOWN) ) {
                    int LA18_2 = input.LA(3);

                    if ( (LA18_2==FORMULAITEM) ) {
                        alt18=1;
                    }
                    else if ( (LA18_2==FORMULAEXPRESSION) ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:239:5: ^( FORMULAEXPRESSION fi= formulaItem (mo= mathOperator fe= formulaExpression )? )
                    {
                    match(input,FORMULAEXPRESSION,FOLLOW_FORMULAEXPRESSION_in_formulaExpression846); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_formulaItem_in_formulaExpression850);
                    fi=formulaItem();

                    state._fsp--;

                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:239:40: (mo= mathOperator fe= formulaExpression )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==OPERATOR) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:239:41: mo= mathOperator fe= formulaExpression
                            {
                            pushFollow(FOLLOW_mathOperator_in_formulaExpression855);
                            mo=mathOperator();

                            state._fsp--;

                            pushFollow(FOLLOW_formulaExpression_in_formulaExpression859);
                            fe=formulaExpression();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

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
                    break;
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:256:5: ^( FORMULAEXPRESSION fe= formulaExpression (mo= mathOperator fe2= formulaExpression )? )
                    {
                    match(input,FORMULAEXPRESSION,FOLLOW_FORMULAEXPRESSION_in_formulaExpression875); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_formulaExpression_in_formulaExpression879);
                    fe=formulaExpression();

                    state._fsp--;

                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:256:46: (mo= mathOperator fe2= formulaExpression )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==OPERATOR) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:256:47: mo= mathOperator fe2= formulaExpression
                            {
                            pushFollow(FOLLOW_mathOperator_in_formulaExpression884);
                            mo=mathOperator();

                            state._fsp--;

                            pushFollow(FOLLOW_formulaExpression_in_formulaExpression888);
                            fe2=formulaExpression();

                            state._fsp--;


                            }
                            break;

                    }


                    match(input, Token.UP, null); 

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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:275:1: formulaItem returns [ClassElement classElement] : ^( FORMULAITEM (t= term )? (ti= termInstance )? (twa= termWithAssociation )? ) ;
    public final LetaTreeGrammar.formulaItem_return formulaItem() throws RecognitionException {
        LetaTreeGrammar.formulaItem_return retval = new LetaTreeGrammar.formulaItem_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.term_return t = null;

        LetaTreeGrammar.termInstance_return ti = null;

        LetaTreeGrammar.termWithAssociation_return twa = null;


        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:276:3: ( ^( FORMULAITEM (t= term )? (ti= termInstance )? (twa= termWithAssociation )? ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:276:5: ^( FORMULAITEM (t= term )? (ti= termInstance )? (twa= termWithAssociation )? )
            {
            match(input,FORMULAITEM,FOLLOW_FORMULAITEM_in_formulaItem915); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:276:20: (t= term )?
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==TERM) ) {
                    alt19=1;
                }
                switch (alt19) {
                    case 1 :
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:276:20: t= term
                        {
                        pushFollow(FOLLOW_term_in_formulaItem919);
                        t=term();

                        state._fsp--;


                        }
                        break;

                }

                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:276:29: (ti= termInstance )?
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==TERMINSTANCE) ) {
                    alt20=1;
                }
                switch (alt20) {
                    case 1 :
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:276:29: ti= termInstance
                        {
                        pushFollow(FOLLOW_termInstance_in_formulaItem924);
                        ti=termInstance();

                        state._fsp--;


                        }
                        break;

                }

                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:276:47: (twa= termWithAssociation )?
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==TERMWITHASSOCIATION) ) {
                    alt21=1;
                }
                switch (alt21) {
                    case 1 :
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:276:47: twa= termWithAssociation
                        {
                        pushFollow(FOLLOW_termWithAssociation_in_formulaItem929);
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:289:1: mathOperator returns [String operator] : ( ^( OPERATOR '+' ) | ^( OPERATOR '-' ) | ^( OPERATOR '/' ) | ^( OPERATOR '*' ) | ^( OPERATOR '%' ) | ^( OPERATOR '**' ) );
    public final LetaTreeGrammar.mathOperator_return mathOperator() throws RecognitionException {
        LetaTreeGrammar.mathOperator_return retval = new LetaTreeGrammar.mathOperator_return();
        retval.start = input.LT(1);

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:290:3: ( ^( OPERATOR '+' ) | ^( OPERATOR '-' ) | ^( OPERATOR '/' ) | ^( OPERATOR '*' ) | ^( OPERATOR '%' ) | ^( OPERATOR '**' ) )
            int alt22=6;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==OPERATOR) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case 62:
                        {
                        alt22=1;
                        }
                        break;
                    case 63:
                        {
                        alt22=2;
                        }
                        break;
                    case 64:
                        {
                        alt22=3;
                        }
                        break;
                    case 65:
                        {
                        alt22=4;
                        }
                        break;
                    case 66:
                        {
                        alt22=5;
                        }
                        break;
                    case 67:
                        {
                        alt22=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:290:5: ^( OPERATOR '+' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_mathOperator955); 

                    match(input, Token.DOWN, null); 
                    match(input,62,FOLLOW_62_in_mathOperator957); 

                    match(input, Token.UP, null); 
                     retval.operator = "+"; 

                    }
                    break;
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:292:5: ^( OPERATOR '-' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_mathOperator971); 

                    match(input, Token.DOWN, null); 
                    match(input,63,FOLLOW_63_in_mathOperator973); 

                    match(input, Token.UP, null); 
                     retval.operator = "-"; 

                    }
                    break;
                case 3 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:294:5: ^( OPERATOR '/' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_mathOperator987); 

                    match(input, Token.DOWN, null); 
                    match(input,64,FOLLOW_64_in_mathOperator989); 

                    match(input, Token.UP, null); 
                     retval.operator = "/"; 

                    }
                    break;
                case 4 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:296:5: ^( OPERATOR '*' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_mathOperator1003); 

                    match(input, Token.DOWN, null); 
                    match(input,65,FOLLOW_65_in_mathOperator1005); 

                    match(input, Token.UP, null); 
                     retval.operator = "*"; 

                    }
                    break;
                case 5 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:298:5: ^( OPERATOR '%' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_mathOperator1019); 

                    match(input, Token.DOWN, null); 
                    match(input,66,FOLLOW_66_in_mathOperator1021); 

                    match(input, Token.UP, null); 
                     retval.operator = "%"; 

                    }
                    break;
                case 6 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:300:5: ^( OPERATOR '**' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_mathOperator1035); 

                    match(input, Token.DOWN, null); 
                    match(input,67,FOLLOW_67_in_mathOperator1037); 

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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:304:1: relationalOperator returns [String operator] : ( ^( OPERATOR '>' ) | ^( OPERATOR '<' ) | ^( OPERATOR '>=' ) | ^( OPERATOR '<=' ) | ^( OPERATOR '!=' ) );
    public final LetaTreeGrammar.relationalOperator_return relationalOperator() throws RecognitionException {
        LetaTreeGrammar.relationalOperator_return retval = new LetaTreeGrammar.relationalOperator_return();
        retval.start = input.LT(1);

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:305:3: ( ^( OPERATOR '>' ) | ^( OPERATOR '<' ) | ^( OPERATOR '>=' ) | ^( OPERATOR '<=' ) | ^( OPERATOR '!=' ) )
            int alt23=5;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==OPERATOR) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case 68:
                        {
                        alt23=1;
                        }
                        break;
                    case 69:
                        {
                        alt23=2;
                        }
                        break;
                    case 70:
                        {
                        alt23=3;
                        }
                        break;
                    case 71:
                        {
                        alt23=4;
                        }
                        break;
                    case 72:
                        {
                        alt23=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:305:5: ^( OPERATOR '>' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_relationalOperator1062); 

                    match(input, Token.DOWN, null); 
                    match(input,68,FOLLOW_68_in_relationalOperator1064); 

                    match(input, Token.UP, null); 
                     retval.operator = "MoreThan"; 

                    }
                    break;
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:307:5: ^( OPERATOR '<' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_relationalOperator1078); 

                    match(input, Token.DOWN, null); 
                    match(input,69,FOLLOW_69_in_relationalOperator1080); 

                    match(input, Token.UP, null); 
                     retval.operator = "LessThan"; 

                    }
                    break;
                case 3 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:309:5: ^( OPERATOR '>=' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_relationalOperator1094); 

                    match(input, Token.DOWN, null); 
                    match(input,70,FOLLOW_70_in_relationalOperator1096); 

                    match(input, Token.UP, null); 
                     retval.operator = "EqualOrMoreThan"; 

                    }
                    break;
                case 4 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:311:5: ^( OPERATOR '<=' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_relationalOperator1110); 

                    match(input, Token.DOWN, null); 
                    match(input,71,FOLLOW_71_in_relationalOperator1112); 

                    match(input, Token.UP, null); 
                     retval.operator = "EqualOrLessThan"; 

                    }
                    break;
                case 5 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:313:5: ^( OPERATOR '!=' )
                    {
                    match(input,OPERATOR,FOLLOW_OPERATOR_in_relationalOperator1126); 

                    match(input, Token.DOWN, null); 
                    match(input,72,FOLLOW_72_in_relationalOperator1128); 

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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:317:1: set returns [ArrayList<MatrixItem> items = new ArrayList<MatrixItem>()] : ^( SET sb= subSet (s= set )? ) ;
    public final LetaTreeGrammar.set_return set() throws RecognitionException {
        LetaTreeGrammar.set_return retval = new LetaTreeGrammar.set_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.subSet_return sb = null;

        LetaTreeGrammar.set_return s = null;


        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:318:3: ( ^( SET sb= subSet (s= set )? ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:318:5: ^( SET sb= subSet (s= set )? )
            {
            match(input,SET,FOLLOW_SET_in_set1153); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subSet_in_set1157);
            sb=subSet();

            state._fsp--;

            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:318:22: (s= set )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==SET) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:318:22: s= set
                    {
                    pushFollow(FOLLOW_set_in_set1161);
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:327:1: subSet returns [MatrixItem matrixItem = new MatrixItem()] : ^( SUBSET lt= literal (ss= subSet )? ) ;
    public final LetaTreeGrammar.subSet_return subSet() throws RecognitionException {
        LetaTreeGrammar.subSet_return retval = new LetaTreeGrammar.subSet_return();
        retval.start = input.LT(1);

        LetaTreeGrammar.literal_return lt = null;

        LetaTreeGrammar.subSet_return ss = null;


        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:328:3: ( ^( SUBSET lt= literal (ss= subSet )? ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:328:5: ^( SUBSET lt= literal (ss= subSet )? )
            {
            match(input,SUBSET,FOLLOW_SUBSET_in_subSet1187); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_literal_in_subSet1191);
            lt=literal();

            state._fsp--;

            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:328:27: (ss= subSet )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==SUBSET) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:328:27: ss= subSet
                    {
                    pushFollow(FOLLOW_subSet_in_subSet1195);
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:342:1: literal returns [String stringValue, Integer intValue, Double floatValue] : ( ^( LITERAL STRING ) | ^( LITERAL FLOAT ) | ^( LITERAL MINUS_FLOAT ) | ^( LITERAL INT ) | ^( LITERAL MINUS_INT ) | ^( LITERAL NULL ) );
    public final LetaTreeGrammar.literal_return literal() throws RecognitionException {
        LetaTreeGrammar.literal_return retval = new LetaTreeGrammar.literal_return();
        retval.start = input.LT(1);

        CommonTree STRING9=null;
        CommonTree FLOAT10=null;
        CommonTree MINUS_FLOAT11=null;
        CommonTree INT12=null;
        CommonTree MINUS_INT13=null;

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:343:3: ( ^( LITERAL STRING ) | ^( LITERAL FLOAT ) | ^( LITERAL MINUS_FLOAT ) | ^( LITERAL INT ) | ^( LITERAL MINUS_INT ) | ^( LITERAL NULL ) )
            int alt26=6;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==LITERAL) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==DOWN) ) {
                    switch ( input.LA(3) ) {
                    case STRING:
                        {
                        alt26=1;
                        }
                        break;
                    case FLOAT:
                        {
                        alt26=2;
                        }
                        break;
                    case MINUS_FLOAT:
                        {
                        alt26=3;
                        }
                        break;
                    case INT:
                        {
                        alt26=4;
                        }
                        break;
                    case MINUS_INT:
                        {
                        alt26=5;
                        }
                        break;
                    case NULL:
                        {
                        alt26=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 26, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:343:5: ^( LITERAL STRING )
                    {
                    match(input,LITERAL,FOLLOW_LITERAL_in_literal1222); 

                    match(input, Token.DOWN, null); 
                    STRING9=(CommonTree)match(input,STRING,FOLLOW_STRING_in_literal1224); 

                    match(input, Token.UP, null); 
                     retval.stringValue = (STRING9!=null?STRING9.getText():null); 

                    }
                    break;
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:345:5: ^( LITERAL FLOAT )
                    {
                    match(input,LITERAL,FOLLOW_LITERAL_in_literal1238); 

                    match(input, Token.DOWN, null); 
                    FLOAT10=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_literal1240); 

                    match(input, Token.UP, null); 
                     retval.floatValue = new Double((FLOAT10!=null?FLOAT10.getText():null)); 

                    }
                    break;
                case 3 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:347:5: ^( LITERAL MINUS_FLOAT )
                    {
                    match(input,LITERAL,FOLLOW_LITERAL_in_literal1254); 

                    match(input, Token.DOWN, null); 
                    MINUS_FLOAT11=(CommonTree)match(input,MINUS_FLOAT,FOLLOW_MINUS_FLOAT_in_literal1256); 

                    match(input, Token.UP, null); 
                     retval.floatValue = new Double((MINUS_FLOAT11!=null?MINUS_FLOAT11.getText():null)); 

                    }
                    break;
                case 4 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:349:5: ^( LITERAL INT )
                    {
                    match(input,LITERAL,FOLLOW_LITERAL_in_literal1270); 

                    match(input, Token.DOWN, null); 
                    INT12=(CommonTree)match(input,INT,FOLLOW_INT_in_literal1272); 

                    match(input, Token.UP, null); 
                     retval.intValue = new Integer((INT12!=null?INT12.getText():null)); 

                    }
                    break;
                case 5 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:351:5: ^( LITERAL MINUS_INT )
                    {
                    match(input,LITERAL,FOLLOW_LITERAL_in_literal1286); 

                    match(input, Token.DOWN, null); 
                    MINUS_INT13=(CommonTree)match(input,MINUS_INT,FOLLOW_MINUS_INT_in_literal1288); 

                    match(input, Token.UP, null); 
                     retval.intValue = new Integer((MINUS_INT13!=null?MINUS_INT13.getText():null)); 

                    }
                    break;
                case 6 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:353:5: ^( LITERAL NULL )
                    {
                    match(input,LITERAL,FOLLOW_LITERAL_in_literal1302); 

                    match(input, Token.DOWN, null); 
                    match(input,NULL,FOLLOW_NULL_in_literal1304); 

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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:356:1: testPackage : ^( PACKAGE PACKAGE_ID ) ;
    public final LetaTreeGrammar.testPackage_return testPackage() throws RecognitionException {
        LetaTreeGrammar.testPackage_return retval = new LetaTreeGrammar.testPackage_return();
        retval.start = input.LT(1);

        CommonTree PACKAGE_ID14=null;

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:357:3: ( ^( PACKAGE PACKAGE_ID ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaTreeGrammar.g:357:5: ^( PACKAGE PACKAGE_ID )
            {
            match(input,PACKAGE,FOLLOW_PACKAGE_in_testPackage1319); 

            match(input, Token.DOWN, null); 
            PACKAGE_ID14=(CommonTree)match(input,PACKAGE_ID,FOLLOW_PACKAGE_ID_in_testPackage1321); 

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
    static final String DFA4_eotS =
        "\20\uffff";
    static final String DFA4_eofS =
        "\20\uffff";
    static final String DFA4_minS =
        "\1\12\3\2\3\12\11\uffff";
    static final String DFA4_maxS =
        "\1\67\3\2\3\67\11\uffff";
    static final String DFA4_acceptS =
        "\7\uffff\1\1\1\3\1\5\1\2\1\4\1\6\1\7\1\10\1\11";
    static final String DFA4_specialS =
        "\20\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\53\uffff\1\1\1\2",
            "\1\4",
            "\1\5",
            "\1\6",
            "\1\11\2\uffff\1\7\5\uffff\1\10\42\uffff\2\11",
            "\1\14\2\uffff\1\12\5\uffff\1\13\42\uffff\2\14",
            "\1\17\2\uffff\1\15\5\uffff\1\16\42\uffff\2\17",
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
            return "91:1: factComposite returns [Element element] : ( ^( 'And' f= fact fc= factComposite ) | ^( 'Or' f= fact fc= factComposite ) | ^( 'And' fo= formula fc= factComposite ) | ^( 'Or' fo= formula fc= factComposite ) | ^( 'And' fc= factComposite fc2= factComposite ) | ^( 'Or' fc= factComposite fc2= factComposite ) | ^( FACTCOMPOSITE f= fact ) | ^( FACTCOMPOSITE fo= formula ) | ^( FACTCOMPOSITE fc= factComposite ) );";
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
    public static final BitSet FOLLOW_54_in_factComposite266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fact_in_factComposite270 = new BitSet(new long[]{0x00C0000000000400L});
    public static final BitSet FOLLOW_factComposite_in_factComposite274 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_55_in_factComposite288 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_fact_in_factComposite292 = new BitSet(new long[]{0x00C0000000000400L});
    public static final BitSet FOLLOW_factComposite_in_factComposite296 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_54_in_factComposite310 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formula_in_factComposite314 = new BitSet(new long[]{0x00C0000000000400L});
    public static final BitSet FOLLOW_factComposite_in_factComposite318 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_55_in_factComposite332 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formula_in_factComposite336 = new BitSet(new long[]{0x00C0000000000400L});
    public static final BitSet FOLLOW_factComposite_in_factComposite340 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_54_in_factComposite354 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factComposite_in_factComposite358 = new BitSet(new long[]{0x00C0000000000400L});
    public static final BitSet FOLLOW_factComposite_in_factComposite362 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_55_in_factComposite376 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factComposite_in_factComposite380 = new BitSet(new long[]{0x00C0000000000400L});
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
    public static final BitSet FOLLOW_FACTEXT_in_factExt508 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_complement_in_factExt512 = new BitSet(new long[]{0x0000000000040008L});
    public static final BitSet FOLLOW_termComposite_in_factExt517 = new BitSet(new long[]{0x0000000000004008L});
    public static final BitSet FOLLOW_factExt_in_factExt521 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERMCOMPOSITE_in_termComposite549 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_quantifier_in_termComposite553 = new BitSet(new long[]{0x0000000000700008L});
    public static final BitSet FOLLOW_term_in_termComposite558 = new BitSet(new long[]{0x0000000000600008L});
    public static final BitSet FOLLOW_termInstance_in_termComposite563 = new BitSet(new long[]{0x0000000000400008L});
    public static final BitSet FOLLOW_termWithAssociation_in_termComposite568 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERM_in_term594 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_term596 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERMINSTANCE_in_termInstance621 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_term_in_termInstance625 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_relationalOperator_in_termInstance629 = new BitSet(new long[]{0x0000000042000000L});
    public static final BitSet FOLLOW_literal_in_termInstance634 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERMWITHASSOCIATION_in_termWithAssociation659 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_term_in_termWithAssociation663 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_relationalOperator_in_termWithAssociation667 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_termWithAssociation670 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUANTIFIER_in_quantifier697 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_57_in_quantifier699 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier701 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUANTIFIER_in_quantifier715 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_58_in_quantifier717 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier719 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUANTIFIER_in_quantifier733 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_59_in_quantifier735 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier737 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUANTIFIER_in_quantifier751 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_60_in_quantifier753 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier757 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier761 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMPLEMENT_in_complement786 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_complement788 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMULA_in_formula813 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formulaItem_in_formula817 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_formulaExpression_in_formula821 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMULAEXPRESSION_in_formulaExpression846 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formulaItem_in_formulaExpression850 = new BitSet(new long[]{0x0000000040000008L});
    public static final BitSet FOLLOW_mathOperator_in_formulaExpression855 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_formulaExpression_in_formulaExpression859 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMULAEXPRESSION_in_formulaExpression875 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_formulaExpression_in_formulaExpression879 = new BitSet(new long[]{0x0000000040000008L});
    public static final BitSet FOLLOW_mathOperator_in_formulaExpression884 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_formulaExpression_in_formulaExpression888 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMULAITEM_in_formulaItem915 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_term_in_formulaItem919 = new BitSet(new long[]{0x0000000000600008L});
    public static final BitSet FOLLOW_termInstance_in_formulaItem924 = new BitSet(new long[]{0x0000000000400008L});
    public static final BitSet FOLLOW_termWithAssociation_in_formulaItem929 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_mathOperator955 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_62_in_mathOperator957 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_mathOperator971 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_63_in_mathOperator973 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_mathOperator987 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_64_in_mathOperator989 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_mathOperator1003 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_65_in_mathOperator1005 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_mathOperator1019 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_mathOperator1021 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_mathOperator1035 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_67_in_mathOperator1037 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_relationalOperator1062 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_68_in_relationalOperator1064 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_relationalOperator1078 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_69_in_relationalOperator1080 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_relationalOperator1094 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_70_in_relationalOperator1096 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_relationalOperator1110 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_71_in_relationalOperator1112 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OPERATOR_in_relationalOperator1126 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_72_in_relationalOperator1128 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SET_in_set1153 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subSet_in_set1157 = new BitSet(new long[]{0x0000000000000208L});
    public static final BitSet FOLLOW_set_in_set1161 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSET_in_subSet1187 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_literal_in_subSet1191 = new BitSet(new long[]{0x0000000080000008L});
    public static final BitSet FOLLOW_subSet_in_subSet1195 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LITERAL_in_literal1222 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_literal1224 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LITERAL_in_literal1238 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_literal1240 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LITERAL_in_literal1254 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_FLOAT_in_literal1256 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LITERAL_in_literal1270 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_literal1272 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LITERAL_in_literal1286 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_MINUS_INT_in_literal1288 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LITERAL_in_literal1302 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NULL_in_literal1304 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PACKAGE_in_testPackage1319 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PACKAGE_ID_in_testPackage1321 = new BitSet(new long[]{0x0000000000000008L});

}