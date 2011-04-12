// $ANTLR 3.3 Nov 30, 2010 12:46:29 C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g 2011-04-12 20:16:27

  package leta.core.grammar;
  
  import leta.core.model.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class LetaGrammarParser extends Parser {
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


        public LetaGrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public LetaGrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return LetaGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g"; }


      private boolean foundErrors = false;

      public boolean hasFoundErrors() {
        return this.foundErrors;
      }
      
      public String getErrorMessage(RecognitionException e, String[] tokenNames) {
        foundErrors = true;

        String msg = super.getErrorMessage(e, tokenNames);
        return msg;
      }


    public static class leta_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "leta"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:72:1: leta : ( testPackage )? ( testCase )+ -> ^( LETA ( testPackage )? ( testCase )+ ) ;
    public final LetaGrammarParser.leta_return leta() throws RecognitionException {
        LetaGrammarParser.leta_return retval = new LetaGrammarParser.leta_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LetaGrammarParser.testPackage_return testPackage1 = null;

        LetaGrammarParser.testCase_return testCase2 = null;


        RewriteRuleSubtreeStream stream_testCase=new RewriteRuleSubtreeStream(adaptor,"rule testCase");
        RewriteRuleSubtreeStream stream_testPackage=new RewriteRuleSubtreeStream(adaptor,"rule testPackage");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:73:3: ( ( testPackage )? ( testCase )+ -> ^( LETA ( testPackage )? ( testCase )+ ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:73:5: ( testPackage )? ( testCase )+
            {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:73:5: ( testPackage )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==75) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:0:0: testPackage
                    {
                    pushFollow(FOLLOW_testPackage_in_leta231);
                    testPackage1=testPackage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_testPackage.add(testPackage1.getTree());

                    }
                    break;

            }

            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:73:18: ( testCase )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==46) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:0:0: testCase
            	    {
            	    pushFollow(FOLLOW_testCase_in_leta234);
            	    testCase2=testCase();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_testCase.add(testCase2.getTree());

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



            // AST REWRITE
            // elements: testPackage, testCase
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 74:5: -> ^( LETA ( testPackage )? ( testCase )+ )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:74:8: ^( LETA ( testPackage )? ( testCase )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LETA, "LETA"), root_1);

                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:74:15: ( testPackage )?
                if ( stream_testPackage.hasNext() ) {
                    adaptor.addChild(root_1, stream_testPackage.nextTree());

                }
                stream_testPackage.reset();
                if ( !(stream_testCase.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_testCase.hasNext() ) {
                    adaptor.addChild(root_1, stream_testCase.nextTree());

                }
                stream_testCase.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "leta"

    public static class testCase_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testCase"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:77:1: testCase : 'Test' ID verifyClause whenClause ( setClause )? -> ^( TESTCASE ID ( setClause )? verifyClause whenClause ) ;
    public final LetaGrammarParser.testCase_return testCase() throws RecognitionException {
        LetaGrammarParser.testCase_return retval = new LetaGrammarParser.testCase_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal3=null;
        Token ID4=null;
        LetaGrammarParser.verifyClause_return verifyClause5 = null;

        LetaGrammarParser.whenClause_return whenClause6 = null;

        LetaGrammarParser.setClause_return setClause7 = null;


        Object string_literal3_tree=null;
        Object ID4_tree=null;
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_verifyClause=new RewriteRuleSubtreeStream(adaptor,"rule verifyClause");
        RewriteRuleSubtreeStream stream_whenClause=new RewriteRuleSubtreeStream(adaptor,"rule whenClause");
        RewriteRuleSubtreeStream stream_setClause=new RewriteRuleSubtreeStream(adaptor,"rule setClause");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:78:3: ( 'Test' ID verifyClause whenClause ( setClause )? -> ^( TESTCASE ID ( setClause )? verifyClause whenClause ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:78:5: 'Test' ID verifyClause whenClause ( setClause )?
            {
            string_literal3=(Token)match(input,46,FOLLOW_46_in_testCase265); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_46.add(string_literal3);

            ID4=(Token)match(input,ID,FOLLOW_ID_in_testCase267); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID4);

            pushFollow(FOLLOW_verifyClause_in_testCase269);
            verifyClause5=verifyClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_verifyClause.add(verifyClause5.getTree());
            pushFollow(FOLLOW_whenClause_in_testCase271);
            whenClause6=whenClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_whenClause.add(whenClause6.getTree());
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:78:39: ( setClause )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==49) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:0:0: setClause
                    {
                    pushFollow(FOLLOW_setClause_in_testCase273);
                    setClause7=setClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_setClause.add(setClause7.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: ID, verifyClause, setClause, whenClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 79:5: -> ^( TESTCASE ID ( setClause )? verifyClause whenClause )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:79:8: ^( TESTCASE ID ( setClause )? verifyClause whenClause )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TESTCASE, "TESTCASE"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:79:22: ( setClause )?
                if ( stream_setClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_setClause.nextTree());

                }
                stream_setClause.reset();
                adaptor.addChild(root_1, stream_verifyClause.nextTree());
                adaptor.addChild(root_1, stream_whenClause.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "testCase"

    public static class verifyClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "verifyClause"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:82:1: verifyClause : 'Verify' factComposite -> ^( VERIFY factComposite ) ;
    public final LetaGrammarParser.verifyClause_return verifyClause() throws RecognitionException {
        LetaGrammarParser.verifyClause_return retval = new LetaGrammarParser.verifyClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal8=null;
        LetaGrammarParser.factComposite_return factComposite9 = null;


        Object string_literal8_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleSubtreeStream stream_factComposite=new RewriteRuleSubtreeStream(adaptor,"rule factComposite");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:83:3: ( 'Verify' factComposite -> ^( VERIFY factComposite ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:83:5: 'Verify' factComposite
            {
            string_literal8=(Token)match(input,47,FOLLOW_47_in_verifyClause306); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(string_literal8);

            pushFollow(FOLLOW_factComposite_in_verifyClause308);
            factComposite9=factComposite();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_factComposite.add(factComposite9.getTree());


            // AST REWRITE
            // elements: factComposite
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 84:5: -> ^( VERIFY factComposite )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:84:8: ^( VERIFY factComposite )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VERIFY, "VERIFY"), root_1);

                adaptor.addChild(root_1, stream_factComposite.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "verifyClause"

    public static class whenClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whenClause"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:87:1: whenClause : 'When' factComposite -> ^( WHEN factComposite ) ;
    public final LetaGrammarParser.whenClause_return whenClause() throws RecognitionException {
        LetaGrammarParser.whenClause_return retval = new LetaGrammarParser.whenClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal10=null;
        LetaGrammarParser.factComposite_return factComposite11 = null;


        Object string_literal10_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleSubtreeStream stream_factComposite=new RewriteRuleSubtreeStream(adaptor,"rule factComposite");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:88:3: ( 'When' factComposite -> ^( WHEN factComposite ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:88:5: 'When' factComposite
            {
            string_literal10=(Token)match(input,48,FOLLOW_48_in_whenClause333); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_48.add(string_literal10);

            pushFollow(FOLLOW_factComposite_in_whenClause335);
            factComposite11=factComposite();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_factComposite.add(factComposite11.getTree());


            // AST REWRITE
            // elements: factComposite
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 89:5: -> ^( WHEN factComposite )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:89:8: ^( WHEN factComposite )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHEN, "WHEN"), root_1);

                adaptor.addChild(root_1, stream_factComposite.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "whenClause"

    public static class setClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setClause"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:92:1: setClause : 'Set' '{' set '}' -> ^( SET set ) ;
    public final LetaGrammarParser.setClause_return setClause() throws RecognitionException {
        LetaGrammarParser.setClause_return retval = new LetaGrammarParser.setClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal12=null;
        Token char_literal13=null;
        Token char_literal15=null;
        LetaGrammarParser.set_return set14 = null;


        Object string_literal12_tree=null;
        Object char_literal13_tree=null;
        Object char_literal15_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_set=new RewriteRuleSubtreeStream(adaptor,"rule set");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:93:3: ( 'Set' '{' set '}' -> ^( SET set ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:93:5: 'Set' '{' set '}'
            {
            string_literal12=(Token)match(input,49,FOLLOW_49_in_setClause360); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(string_literal12);

            char_literal13=(Token)match(input,50,FOLLOW_50_in_setClause362); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_50.add(char_literal13);

            pushFollow(FOLLOW_set_in_setClause364);
            set14=set();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_set.add(set14.getTree());
            char_literal15=(Token)match(input,51,FOLLOW_51_in_setClause366); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal15);



            // AST REWRITE
            // elements: set
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 94:5: -> ^( SET set )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:94:8: ^( SET set )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SET, "SET"), root_1);

                adaptor.addChild(root_1, stream_set.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "setClause"

    public static class factComposite_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factComposite"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:97:1: factComposite : ( (f= fact | fo= formula ) (op= logicalOperator fc= factComposite )? -> {op != null && op.value.equals(\"And\") && f != null}? ^( 'And' $f $fc) -> {op != null && op.value.equals(\"Or\") && f != null}? ^( 'Or' $f $fc) -> {op != null && op.value.equals(\"And\") && fo != null}? ^( 'And' $fo $fc) -> {op != null && op.value.equals(\"Or\") && fo != null}? ^( 'Or' $fo $fc) -> {f != null}? ^( FACTCOMPOSITE $f) -> ^( FACTCOMPOSITE $fo) | '(' fc1= factComposite ')' (op= logicalOperator fc2= factComposite )? -> {op != null && op.value.equals(\"And\")}? ^( 'And' $fc1 $fc2) -> {op != null && op.value.equals(\"Or\")}? ^( 'Or' $fc1 $fc2) -> ^( FACTCOMPOSITE $fc1) );
    public final LetaGrammarParser.factComposite_return factComposite() throws RecognitionException {
        LetaGrammarParser.factComposite_return retval = new LetaGrammarParser.factComposite_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal16=null;
        Token char_literal17=null;
        LetaGrammarParser.fact_return f = null;

        LetaGrammarParser.formula_return fo = null;

        LetaGrammarParser.logicalOperator_return op = null;

        LetaGrammarParser.factComposite_return fc = null;

        LetaGrammarParser.factComposite_return fc1 = null;

        LetaGrammarParser.factComposite_return fc2 = null;


        Object char_literal16_tree=null;
        Object char_literal17_tree=null;
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_logicalOperator=new RewriteRuleSubtreeStream(adaptor,"rule logicalOperator");
        RewriteRuleSubtreeStream stream_fact=new RewriteRuleSubtreeStream(adaptor,"rule fact");
        RewriteRuleSubtreeStream stream_factComposite=new RewriteRuleSubtreeStream(adaptor,"rule factComposite");
        RewriteRuleSubtreeStream stream_formula=new RewriteRuleSubtreeStream(adaptor,"rule formula");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:98:3: ( (f= fact | fo= formula ) (op= logicalOperator fc= factComposite )? -> {op != null && op.value.equals(\"And\") && f != null}? ^( 'And' $f $fc) -> {op != null && op.value.equals(\"Or\") && f != null}? ^( 'Or' $f $fc) -> {op != null && op.value.equals(\"And\") && fo != null}? ^( 'And' $fo $fc) -> {op != null && op.value.equals(\"Or\") && fo != null}? ^( 'Or' $fo $fc) -> {f != null}? ^( FACTCOMPOSITE $f) -> ^( FACTCOMPOSITE $fo) | '(' fc1= factComposite ')' (op= logicalOperator fc2= factComposite )? -> {op != null && op.value.equals(\"And\")}? ^( 'And' $fc1 $fc2) -> {op != null && op.value.equals(\"Or\")}? ^( 'Or' $fc1 $fc2) -> ^( FACTCOMPOSITE $fc1) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID||(LA7_0>=57 && LA7_0<=60)) ) {
                alt7=1;
            }
            else if ( (LA7_0==52) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:98:5: (f= fact | fo= formula ) (op= logicalOperator fc= factComposite )?
                    {
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:98:5: (f= fact | fo= formula )
                    int alt4=2;
                    alt4 = dfa4.predict(input);
                    switch (alt4) {
                        case 1 :
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:98:6: f= fact
                            {
                            pushFollow(FOLLOW_fact_in_factComposite394);
                            f=fact();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fact.add(f.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:98:15: fo= formula
                            {
                            pushFollow(FOLLOW_formula_in_factComposite400);
                            fo=formula();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formula.add(fo.getTree());

                            }
                            break;

                    }

                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:98:27: (op= logicalOperator fc= factComposite )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=54 && LA5_0<=55)) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:98:28: op= logicalOperator fc= factComposite
                            {
                            pushFollow(FOLLOW_logicalOperator_in_factComposite406);
                            op=logicalOperator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_logicalOperator.add(op.getTree());
                            pushFollow(FOLLOW_factComposite_in_factComposite410);
                            fc=factComposite();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_factComposite.add(fc.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 55, 54, fc, f, fo, fo, f, fc, 55, fo, f, fc, 54, fc
                    // token labels: 
                    // rule labels: f, retval, fo, fc
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"rule f",f!=null?f.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_fo=new RewriteRuleSubtreeStream(adaptor,"rule fo",fo!=null?fo.tree:null);
                    RewriteRuleSubtreeStream stream_fc=new RewriteRuleSubtreeStream(adaptor,"rule fc",fc!=null?fc.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 99:5: -> {op != null && op.value.equals(\"And\") && f != null}? ^( 'And' $f $fc)
                    if (op != null && op.value.equals("And") && f != null) {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:99:61: ^( 'And' $f $fc)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(54, "54"), root_1);

                        adaptor.addChild(root_1, stream_f.nextTree());
                        adaptor.addChild(root_1, stream_fc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 100:5: -> {op != null && op.value.equals(\"Or\") && f != null}? ^( 'Or' $f $fc)
                    if (op != null && op.value.equals("Or") && f != null) {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:100:60: ^( 'Or' $f $fc)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(55, "55"), root_1);

                        adaptor.addChild(root_1, stream_f.nextTree());
                        adaptor.addChild(root_1, stream_fc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 101:5: -> {op != null && op.value.equals(\"And\") && fo != null}? ^( 'And' $fo $fc)
                    if (op != null && op.value.equals("And") && fo != null) {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:101:62: ^( 'And' $fo $fc)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(54, "54"), root_1);

                        adaptor.addChild(root_1, stream_fo.nextTree());
                        adaptor.addChild(root_1, stream_fc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 102:5: -> {op != null && op.value.equals(\"Or\") && fo != null}? ^( 'Or' $fo $fc)
                    if (op != null && op.value.equals("Or") && fo != null) {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:102:61: ^( 'Or' $fo $fc)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(55, "55"), root_1);

                        adaptor.addChild(root_1, stream_fo.nextTree());
                        adaptor.addChild(root_1, stream_fc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 103:5: -> {f != null}? ^( FACTCOMPOSITE $f)
                    if (f != null) {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:103:21: ^( FACTCOMPOSITE $f)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FACTCOMPOSITE, "FACTCOMPOSITE"), root_1);

                        adaptor.addChild(root_1, stream_f.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 104:5: -> ^( FACTCOMPOSITE $fo)
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:104:8: ^( FACTCOMPOSITE $fo)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FACTCOMPOSITE, "FACTCOMPOSITE"), root_1);

                        adaptor.addChild(root_1, stream_fo.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:105:5: '(' fc1= factComposite ')' (op= logicalOperator fc2= factComposite )?
                    {
                    char_literal16=(Token)match(input,52,FOLLOW_52_in_factComposite518); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_52.add(char_literal16);

                    pushFollow(FOLLOW_factComposite_in_factComposite522);
                    fc1=factComposite();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_factComposite.add(fc1.getTree());
                    char_literal17=(Token)match(input,53,FOLLOW_53_in_factComposite524); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal17);

                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:105:31: (op= logicalOperator fc2= factComposite )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=54 && LA6_0<=55)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:105:32: op= logicalOperator fc2= factComposite
                            {
                            pushFollow(FOLLOW_logicalOperator_in_factComposite529);
                            op=logicalOperator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_logicalOperator.add(op.getTree());
                            pushFollow(FOLLOW_factComposite_in_factComposite533);
                            fc2=factComposite();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_factComposite.add(fc2.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 54, fc2, fc1, 55, fc2, fc1, fc1
                    // token labels: 
                    // rule labels: retval, fc1, fc2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_fc1=new RewriteRuleSubtreeStream(adaptor,"rule fc1",fc1!=null?fc1.tree:null);
                    RewriteRuleSubtreeStream stream_fc2=new RewriteRuleSubtreeStream(adaptor,"rule fc2",fc2!=null?fc2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 106:5: -> {op != null && op.value.equals(\"And\")}? ^( 'And' $fc1 $fc2)
                    if (op != null && op.value.equals("And")) {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:106:48: ^( 'And' $fc1 $fc2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(54, "54"), root_1);

                        adaptor.addChild(root_1, stream_fc1.nextTree());
                        adaptor.addChild(root_1, stream_fc2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 107:5: -> {op != null && op.value.equals(\"Or\")}? ^( 'Or' $fc1 $fc2)
                    if (op != null && op.value.equals("Or")) {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:107:47: ^( 'Or' $fc1 $fc2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(55, "55"), root_1);

                        adaptor.addChild(root_1, stream_fc1.nextTree());
                        adaptor.addChild(root_1, stream_fc2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 108:5: -> ^( FACTCOMPOSITE $fc1)
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:108:8: ^( FACTCOMPOSITE $fc1)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FACTCOMPOSITE, "FACTCOMPOSITE"), root_1);

                        adaptor.addChild(root_1, stream_fc1.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "factComposite"

    public static class logicalOperator_return extends ParserRuleReturnScope {
        public String value;
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "logicalOperator"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:111:1: logicalOperator returns [String value] : ( 'And' | 'Or' );
    public final LetaGrammarParser.logicalOperator_return logicalOperator() throws RecognitionException {
        LetaGrammarParser.logicalOperator_return retval = new LetaGrammarParser.logicalOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal18=null;
        Token string_literal19=null;

        Object string_literal18_tree=null;
        Object string_literal19_tree=null;

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:112:3: ( 'And' | 'Or' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==54) ) {
                alt8=1;
            }
            else if ( (LA8_0==55) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:112:5: 'And'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal18=(Token)match(input,54,FOLLOW_54_in_logicalOperator601); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal18_tree = (Object)adaptor.create(string_literal18);
                    adaptor.addChild(root_0, string_literal18_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.value = "And"; 
                    }

                    }
                    break;
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:114:5: 'Or'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal19=(Token)match(input,55,FOLLOW_55_in_logicalOperator613); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal19_tree = (Object)adaptor.create(string_literal19);
                    adaptor.addChild(root_0, string_literal19_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.value = "Or"; 
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "logicalOperator"

    public static class fact_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "fact"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:118:1: fact : tc= termComposite c= complement (tc2= termComposite (fe= factExt )? )? -> ^( FACT $tc $c ( $tc2 ( $fe)? )? ) ;
    public final LetaGrammarParser.fact_return fact() throws RecognitionException {
        LetaGrammarParser.fact_return retval = new LetaGrammarParser.fact_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LetaGrammarParser.termComposite_return tc = null;

        LetaGrammarParser.complement_return c = null;

        LetaGrammarParser.termComposite_return tc2 = null;

        LetaGrammarParser.factExt_return fe = null;


        RewriteRuleSubtreeStream stream_complement=new RewriteRuleSubtreeStream(adaptor,"rule complement");
        RewriteRuleSubtreeStream stream_factExt=new RewriteRuleSubtreeStream(adaptor,"rule factExt");
        RewriteRuleSubtreeStream stream_termComposite=new RewriteRuleSubtreeStream(adaptor,"rule termComposite");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:119:3: (tc= termComposite c= complement (tc2= termComposite (fe= factExt )? )? -> ^( FACT $tc $c ( $tc2 ( $fe)? )? ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:119:5: tc= termComposite c= complement (tc2= termComposite (fe= factExt )? )?
            {
            pushFollow(FOLLOW_termComposite_in_fact634);
            tc=termComposite();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_termComposite.add(tc.getTree());
            pushFollow(FOLLOW_complement_in_fact638);
            c=complement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_complement.add(c.getTree());
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:119:35: (tc2= termComposite (fe= factExt )? )?
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:119:36: tc2= termComposite (fe= factExt )?
                    {
                    pushFollow(FOLLOW_termComposite_in_fact643);
                    tc2=termComposite();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_termComposite.add(tc2.getTree());
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:119:56: (fe= factExt )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==ID) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:0:0: fe= factExt
                            {
                            pushFollow(FOLLOW_factExt_in_fact647);
                            fe=factExt();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_factExt.add(fe.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: c, tc, fe, tc2
            // token labels: 
            // rule labels: retval, tc, c, tc2, fe
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_tc=new RewriteRuleSubtreeStream(adaptor,"rule tc",tc!=null?tc.tree:null);
            RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
            RewriteRuleSubtreeStream stream_tc2=new RewriteRuleSubtreeStream(adaptor,"rule tc2",tc2!=null?tc2.tree:null);
            RewriteRuleSubtreeStream stream_fe=new RewriteRuleSubtreeStream(adaptor,"rule fe",fe!=null?fe.tree:null);

            root_0 = (Object)adaptor.nil();
            // 120:5: -> ^( FACT $tc $c ( $tc2 ( $fe)? )? )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:120:8: ^( FACT $tc $c ( $tc2 ( $fe)? )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FACT, "FACT"), root_1);

                adaptor.addChild(root_1, stream_tc.nextTree());
                adaptor.addChild(root_1, stream_c.nextTree());
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:120:22: ( $tc2 ( $fe)? )?
                if ( stream_fe.hasNext()||stream_tc2.hasNext() ) {
                    adaptor.addChild(root_1, stream_tc2.nextTree());
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:120:28: ( $fe)?
                    if ( stream_fe.hasNext() ) {
                        adaptor.addChild(root_1, stream_fe.nextTree());

                    }
                    stream_fe.reset();

                }
                stream_fe.reset();
                stream_tc2.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "fact"

    public static class factExt_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factExt"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:123:1: factExt : complement ( termComposite ( factExt )? )? -> ^( FACTEXT complement ( termComposite ( factExt )? )? ) ;
    public final LetaGrammarParser.factExt_return factExt() throws RecognitionException {
        LetaGrammarParser.factExt_return retval = new LetaGrammarParser.factExt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LetaGrammarParser.complement_return complement20 = null;

        LetaGrammarParser.termComposite_return termComposite21 = null;

        LetaGrammarParser.factExt_return factExt22 = null;


        RewriteRuleSubtreeStream stream_complement=new RewriteRuleSubtreeStream(adaptor,"rule complement");
        RewriteRuleSubtreeStream stream_factExt=new RewriteRuleSubtreeStream(adaptor,"rule factExt");
        RewriteRuleSubtreeStream stream_termComposite=new RewriteRuleSubtreeStream(adaptor,"rule termComposite");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:124:3: ( complement ( termComposite ( factExt )? )? -> ^( FACTEXT complement ( termComposite ( factExt )? )? ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:124:5: complement ( termComposite ( factExt )? )?
            {
            pushFollow(FOLLOW_complement_in_factExt689);
            complement20=complement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_complement.add(complement20.getTree());
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:124:16: ( termComposite ( factExt )? )?
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:124:17: termComposite ( factExt )?
                    {
                    pushFollow(FOLLOW_termComposite_in_factExt692);
                    termComposite21=termComposite();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_termComposite.add(termComposite21.getTree());
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:124:31: ( factExt )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==ID) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:0:0: factExt
                            {
                            pushFollow(FOLLOW_factExt_in_factExt694);
                            factExt22=factExt();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_factExt.add(factExt22.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: termComposite, factExt, complement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 125:5: -> ^( FACTEXT complement ( termComposite ( factExt )? )? )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:125:8: ^( FACTEXT complement ( termComposite ( factExt )? )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FACTEXT, "FACTEXT"), root_1);

                adaptor.addChild(root_1, stream_complement.nextTree());
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:125:29: ( termComposite ( factExt )? )?
                if ( stream_termComposite.hasNext()||stream_factExt.hasNext() ) {
                    adaptor.addChild(root_1, stream_termComposite.nextTree());
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:125:44: ( factExt )?
                    if ( stream_factExt.hasNext() ) {
                        adaptor.addChild(root_1, stream_factExt.nextTree());

                    }
                    stream_factExt.reset();

                }
                stream_termComposite.reset();
                stream_factExt.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "factExt"

    public static class termComposite_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termComposite"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:128:1: termComposite : ( quantifier )? (t= term | ti= termInstance | twa= termWithAssociation ) -> {t != null}? ^( TERMCOMPOSITE ( quantifier )? term ) -> {ti != null}? ^( TERMCOMPOSITE ( quantifier )? termInstance ) -> ^( TERMCOMPOSITE ( quantifier )? termWithAssociation ) ;
    public final LetaGrammarParser.termComposite_return termComposite() throws RecognitionException {
        LetaGrammarParser.termComposite_return retval = new LetaGrammarParser.termComposite_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LetaGrammarParser.term_return t = null;

        LetaGrammarParser.termInstance_return ti = null;

        LetaGrammarParser.termWithAssociation_return twa = null;

        LetaGrammarParser.quantifier_return quantifier23 = null;


        RewriteRuleSubtreeStream stream_quantifier=new RewriteRuleSubtreeStream(adaptor,"rule quantifier");
        RewriteRuleSubtreeStream stream_termWithAssociation=new RewriteRuleSubtreeStream(adaptor,"rule termWithAssociation");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_termInstance=new RewriteRuleSubtreeStream(adaptor,"rule termInstance");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:129:3: ( ( quantifier )? (t= term | ti= termInstance | twa= termWithAssociation ) -> {t != null}? ^( TERMCOMPOSITE ( quantifier )? term ) -> {ti != null}? ^( TERMCOMPOSITE ( quantifier )? termInstance ) -> ^( TERMCOMPOSITE ( quantifier )? termWithAssociation ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:129:5: ( quantifier )? (t= term | ti= termInstance | twa= termWithAssociation )
            {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:129:5: ( quantifier )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=57 && LA13_0<=60)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:0:0: quantifier
                    {
                    pushFollow(FOLLOW_quantifier_in_termComposite730);
                    quantifier23=quantifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_quantifier.add(quantifier23.getTree());

                    }
                    break;

            }

            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:129:17: (t= term | ti= termInstance | twa= termWithAssociation )
            int alt14=3;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:129:18: t= term
                    {
                    pushFollow(FOLLOW_term_in_termComposite736);
                    t=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_term.add(t.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:129:27: ti= termInstance
                    {
                    pushFollow(FOLLOW_termInstance_in_termComposite742);
                    ti=termInstance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_termInstance.add(ti.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:129:45: twa= termWithAssociation
                    {
                    pushFollow(FOLLOW_termWithAssociation_in_termComposite748);
                    twa=termWithAssociation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_termWithAssociation.add(twa.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: quantifier, term, termWithAssociation, quantifier, quantifier, termInstance
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 130:5: -> {t != null}? ^( TERMCOMPOSITE ( quantifier )? term )
            if (t != null) {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:130:21: ^( TERMCOMPOSITE ( quantifier )? term )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERMCOMPOSITE, "TERMCOMPOSITE"), root_1);

                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:130:37: ( quantifier )?
                if ( stream_quantifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_quantifier.nextTree());

                }
                stream_quantifier.reset();
                adaptor.addChild(root_1, stream_term.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 131:5: -> {ti != null}? ^( TERMCOMPOSITE ( quantifier )? termInstance )
            if (ti != null) {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:131:22: ^( TERMCOMPOSITE ( quantifier )? termInstance )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERMCOMPOSITE, "TERMCOMPOSITE"), root_1);

                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:131:38: ( quantifier )?
                if ( stream_quantifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_quantifier.nextTree());

                }
                stream_quantifier.reset();
                adaptor.addChild(root_1, stream_termInstance.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 132:5: -> ^( TERMCOMPOSITE ( quantifier )? termWithAssociation )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:132:8: ^( TERMCOMPOSITE ( quantifier )? termWithAssociation )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERMCOMPOSITE, "TERMCOMPOSITE"), root_1);

                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:132:24: ( quantifier )?
                if ( stream_quantifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_quantifier.nextTree());

                }
                stream_quantifier.reset();
                adaptor.addChild(root_1, stream_termWithAssociation.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "termComposite"

    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:135:1: term : ID -> ^( TERM ID ) ;
    public final LetaGrammarParser.term_return term() throws RecognitionException {
        LetaGrammarParser.term_return retval = new LetaGrammarParser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID24=null;

        Object ID24_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:136:3: ( ID -> ^( TERM ID ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:136:5: ID
            {
            ID24=(Token)match(input,ID,FOLLOW_ID_in_term811); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID24);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 137:5: -> ^( TERM ID )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:137:8: ^( TERM ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERM, "TERM"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class termInstance_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termInstance"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:140:1: termInstance : term ( relationalOperator )? literal -> ^( TERMINSTANCE term ( relationalOperator )? literal ) ;
    public final LetaGrammarParser.termInstance_return termInstance() throws RecognitionException {
        LetaGrammarParser.termInstance_return retval = new LetaGrammarParser.termInstance_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LetaGrammarParser.term_return term25 = null;

        LetaGrammarParser.relationalOperator_return relationalOperator26 = null;

        LetaGrammarParser.literal_return literal27 = null;


        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_relationalOperator=new RewriteRuleSubtreeStream(adaptor,"rule relationalOperator");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:141:3: ( term ( relationalOperator )? literal -> ^( TERMINSTANCE term ( relationalOperator )? literal ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:141:5: term ( relationalOperator )? literal
            {
            pushFollow(FOLLOW_term_in_termInstance836);
            term25=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_term.add(term25.getTree());
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:141:10: ( relationalOperator )?
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:0:0: relationalOperator
                    {
                    pushFollow(FOLLOW_relationalOperator_in_termInstance838);
                    relationalOperator26=relationalOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relationalOperator.add(relationalOperator26.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_literal_in_termInstance841);
            literal27=literal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_literal.add(literal27.getTree());


            // AST REWRITE
            // elements: term, literal, relationalOperator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 142:5: -> ^( TERMINSTANCE term ( relationalOperator )? literal )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:142:8: ^( TERMINSTANCE term ( relationalOperator )? literal )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERMINSTANCE, "TERMINSTANCE"), root_1);

                adaptor.addChild(root_1, stream_term.nextTree());
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:142:28: ( relationalOperator )?
                if ( stream_relationalOperator.hasNext() ) {
                    adaptor.addChild(root_1, stream_relationalOperator.nextTree());

                }
                stream_relationalOperator.reset();
                adaptor.addChild(root_1, stream_literal.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "termInstance"

    public static class termWithAssociation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termWithAssociation"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:145:1: termWithAssociation : term ( relationalOperator )? '@' INT -> ^( TERMWITHASSOCIATION term ( relationalOperator )? INT ) ;
    public final LetaGrammarParser.termWithAssociation_return termWithAssociation() throws RecognitionException {
        LetaGrammarParser.termWithAssociation_return retval = new LetaGrammarParser.termWithAssociation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal30=null;
        Token INT31=null;
        LetaGrammarParser.term_return term28 = null;

        LetaGrammarParser.relationalOperator_return relationalOperator29 = null;


        Object char_literal30_tree=null;
        Object INT31_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_relationalOperator=new RewriteRuleSubtreeStream(adaptor,"rule relationalOperator");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:146:3: ( term ( relationalOperator )? '@' INT -> ^( TERMWITHASSOCIATION term ( relationalOperator )? INT ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:146:5: term ( relationalOperator )? '@' INT
            {
            pushFollow(FOLLOW_term_in_termWithAssociation871);
            term28=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_term.add(term28.getTree());
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:146:10: ( relationalOperator )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=68 && LA16_0<=72)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:0:0: relationalOperator
                    {
                    pushFollow(FOLLOW_relationalOperator_in_termWithAssociation873);
                    relationalOperator29=relationalOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relationalOperator.add(relationalOperator29.getTree());

                    }
                    break;

            }

            char_literal30=(Token)match(input,56,FOLLOW_56_in_termWithAssociation876); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_56.add(char_literal30);

            INT31=(Token)match(input,INT,FOLLOW_INT_in_termWithAssociation878); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INT.add(INT31);



            // AST REWRITE
            // elements: INT, relationalOperator, term
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 147:5: -> ^( TERMWITHASSOCIATION term ( relationalOperator )? INT )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:147:8: ^( TERMWITHASSOCIATION term ( relationalOperator )? INT )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERMWITHASSOCIATION, "TERMWITHASSOCIATION"), root_1);

                adaptor.addChild(root_1, stream_term.nextTree());
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:147:35: ( relationalOperator )?
                if ( stream_relationalOperator.hasNext() ) {
                    adaptor.addChild(root_1, stream_relationalOperator.nextTree());

                }
                stream_relationalOperator.reset();
                adaptor.addChild(root_1, stream_INT.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "termWithAssociation"

    public static class quantifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "quantifier"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:150:1: quantifier : ( 'atLeast' INT -> ^( QUANTIFIER 'atLeast' INT ) | 'atMost' INT -> ^( QUANTIFIER 'atMost' INT ) | 'exactly' INT -> ^( QUANTIFIER 'exactly' INT ) | 'atLeastAndAtMost' i1= INT i2= INT -> ^( QUANTIFIER 'atLeastAndAtMost' $i1 $i2) );
    public final LetaGrammarParser.quantifier_return quantifier() throws RecognitionException {
        LetaGrammarParser.quantifier_return retval = new LetaGrammarParser.quantifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token i1=null;
        Token i2=null;
        Token string_literal32=null;
        Token INT33=null;
        Token string_literal34=null;
        Token INT35=null;
        Token string_literal36=null;
        Token INT37=null;
        Token string_literal38=null;

        Object i1_tree=null;
        Object i2_tree=null;
        Object string_literal32_tree=null;
        Object INT33_tree=null;
        Object string_literal34_tree=null;
        Object INT35_tree=null;
        Object string_literal36_tree=null;
        Object INT37_tree=null;
        Object string_literal38_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:151:3: ( 'atLeast' INT -> ^( QUANTIFIER 'atLeast' INT ) | 'atMost' INT -> ^( QUANTIFIER 'atMost' INT ) | 'exactly' INT -> ^( QUANTIFIER 'exactly' INT ) | 'atLeastAndAtMost' i1= INT i2= INT -> ^( QUANTIFIER 'atLeastAndAtMost' $i1 $i2) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt17=1;
                }
                break;
            case 58:
                {
                alt17=2;
                }
                break;
            case 59:
                {
                alt17=3;
                }
                break;
            case 60:
                {
                alt17=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:151:5: 'atLeast' INT
                    {
                    string_literal32=(Token)match(input,57,FOLLOW_57_in_quantifier910); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(string_literal32);

                    INT33=(Token)match(input,INT,FOLLOW_INT_in_quantifier912); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(INT33);



                    // AST REWRITE
                    // elements: 57, INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 152:5: -> ^( QUANTIFIER 'atLeast' INT )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:152:8: ^( QUANTIFIER 'atLeast' INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_57.nextNode());
                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:153:5: 'atMost' INT
                    {
                    string_literal34=(Token)match(input,58,FOLLOW_58_in_quantifier932); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_58.add(string_literal34);

                    INT35=(Token)match(input,INT,FOLLOW_INT_in_quantifier934); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(INT35);



                    // AST REWRITE
                    // elements: INT, 58
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 154:5: -> ^( QUANTIFIER 'atMost' INT )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:154:8: ^( QUANTIFIER 'atMost' INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_58.nextNode());
                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:155:5: 'exactly' INT
                    {
                    string_literal36=(Token)match(input,59,FOLLOW_59_in_quantifier954); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_59.add(string_literal36);

                    INT37=(Token)match(input,INT,FOLLOW_INT_in_quantifier956); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(INT37);



                    // AST REWRITE
                    // elements: INT, 59
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 156:5: -> ^( QUANTIFIER 'exactly' INT )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:156:8: ^( QUANTIFIER 'exactly' INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_59.nextNode());
                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:157:5: 'atLeastAndAtMost' i1= INT i2= INT
                    {
                    string_literal38=(Token)match(input,60,FOLLOW_60_in_quantifier976); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_60.add(string_literal38);

                    i1=(Token)match(input,INT,FOLLOW_INT_in_quantifier980); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(i1);

                    i2=(Token)match(input,INT,FOLLOW_INT_in_quantifier984); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(i2);



                    // AST REWRITE
                    // elements: i2, i1, 60
                    // token labels: i2, i1
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_i2=new RewriteRuleTokenStream(adaptor,"token i2",i2);
                    RewriteRuleTokenStream stream_i1=new RewriteRuleTokenStream(adaptor,"token i1",i1);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 158:5: -> ^( QUANTIFIER 'atLeastAndAtMost' $i1 $i2)
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:158:8: ^( QUANTIFIER 'atLeastAndAtMost' $i1 $i2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_60.nextNode());
                        adaptor.addChild(root_1, stream_i1.nextNode());
                        adaptor.addChild(root_1, stream_i2.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "quantifier"

    public static class complement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "complement"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:161:1: complement : ID -> ^( COMPLEMENT ID ) ;
    public final LetaGrammarParser.complement_return complement() throws RecognitionException {
        LetaGrammarParser.complement_return retval = new LetaGrammarParser.complement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID39=null;

        Object ID39_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:162:3: ( ID -> ^( COMPLEMENT ID ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:162:5: ID
            {
            ID39=(Token)match(input,ID,FOLLOW_ID_in_complement1015); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID39);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 163:5: -> ^( COMPLEMENT ID )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:163:8: ^( COMPLEMENT ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMPLEMENT, "COMPLEMENT"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "complement"

    public static class formula_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formula"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:166:1: formula : formulaItem '=' formulaExpression -> ^( FORMULA formulaItem formulaExpression ) ;
    public final LetaGrammarParser.formula_return formula() throws RecognitionException {
        LetaGrammarParser.formula_return retval = new LetaGrammarParser.formula_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal41=null;
        LetaGrammarParser.formulaItem_return formulaItem40 = null;

        LetaGrammarParser.formulaExpression_return formulaExpression42 = null;


        Object char_literal41_tree=null;
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_formulaExpression=new RewriteRuleSubtreeStream(adaptor,"rule formulaExpression");
        RewriteRuleSubtreeStream stream_formulaItem=new RewriteRuleSubtreeStream(adaptor,"rule formulaItem");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:167:3: ( formulaItem '=' formulaExpression -> ^( FORMULA formulaItem formulaExpression ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:167:5: formulaItem '=' formulaExpression
            {
            pushFollow(FOLLOW_formulaItem_in_formula1040);
            formulaItem40=formulaItem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_formulaItem.add(formulaItem40.getTree());
            char_literal41=(Token)match(input,61,FOLLOW_61_in_formula1042); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_61.add(char_literal41);

            pushFollow(FOLLOW_formulaExpression_in_formula1044);
            formulaExpression42=formulaExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_formulaExpression.add(formulaExpression42.getTree());


            // AST REWRITE
            // elements: formulaItem, formulaExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 168:5: -> ^( FORMULA formulaItem formulaExpression )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:168:8: ^( FORMULA formulaItem formulaExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMULA, "FORMULA"), root_1);

                adaptor.addChild(root_1, stream_formulaItem.nextTree());
                adaptor.addChild(root_1, stream_formulaExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formula"

    public static class formulaExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formulaExpression"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:171:1: formulaExpression : ( formulaItem ( mathOperator formulaExpression )? -> ^( FORMULAEXPRESSION formulaItem ( mathOperator formulaExpression )? ) | '(' formulaExpression ')' ( mathOperator formulaExpression )? -> ^( FORMULAEXPRESSION formulaExpression ( mathOperator formulaExpression )? ) );
    public final LetaGrammarParser.formulaExpression_return formulaExpression() throws RecognitionException {
        LetaGrammarParser.formulaExpression_return retval = new LetaGrammarParser.formulaExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal46=null;
        Token char_literal48=null;
        LetaGrammarParser.formulaItem_return formulaItem43 = null;

        LetaGrammarParser.mathOperator_return mathOperator44 = null;

        LetaGrammarParser.formulaExpression_return formulaExpression45 = null;

        LetaGrammarParser.formulaExpression_return formulaExpression47 = null;

        LetaGrammarParser.mathOperator_return mathOperator49 = null;

        LetaGrammarParser.formulaExpression_return formulaExpression50 = null;


        Object char_literal46_tree=null;
        Object char_literal48_tree=null;
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_formulaExpression=new RewriteRuleSubtreeStream(adaptor,"rule formulaExpression");
        RewriteRuleSubtreeStream stream_mathOperator=new RewriteRuleSubtreeStream(adaptor,"rule mathOperator");
        RewriteRuleSubtreeStream stream_formulaItem=new RewriteRuleSubtreeStream(adaptor,"rule formulaItem");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:172:3: ( formulaItem ( mathOperator formulaExpression )? -> ^( FORMULAEXPRESSION formulaItem ( mathOperator formulaExpression )? ) | '(' formulaExpression ')' ( mathOperator formulaExpression )? -> ^( FORMULAEXPRESSION formulaExpression ( mathOperator formulaExpression )? ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==52) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:172:5: formulaItem ( mathOperator formulaExpression )?
                    {
                    pushFollow(FOLLOW_formulaItem_in_formulaExpression1071);
                    formulaItem43=formulaItem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formulaItem.add(formulaItem43.getTree());
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:172:17: ( mathOperator formulaExpression )?
                    int alt18=2;
                    alt18 = dfa18.predict(input);
                    switch (alt18) {
                        case 1 :
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:172:18: mathOperator formulaExpression
                            {
                            pushFollow(FOLLOW_mathOperator_in_formulaExpression1074);
                            mathOperator44=mathOperator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_mathOperator.add(mathOperator44.getTree());
                            pushFollow(FOLLOW_formulaExpression_in_formulaExpression1076);
                            formulaExpression45=formulaExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formulaExpression.add(formulaExpression45.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: mathOperator, formulaItem, formulaExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 173:5: -> ^( FORMULAEXPRESSION formulaItem ( mathOperator formulaExpression )? )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:173:8: ^( FORMULAEXPRESSION formulaItem ( mathOperator formulaExpression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMULAEXPRESSION, "FORMULAEXPRESSION"), root_1);

                        adaptor.addChild(root_1, stream_formulaItem.nextTree());
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:173:40: ( mathOperator formulaExpression )?
                        if ( stream_mathOperator.hasNext()||stream_formulaExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_mathOperator.nextTree());
                            adaptor.addChild(root_1, stream_formulaExpression.nextTree());

                        }
                        stream_mathOperator.reset();
                        stream_formulaExpression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:174:5: '(' formulaExpression ')' ( mathOperator formulaExpression )?
                    {
                    char_literal46=(Token)match(input,52,FOLLOW_52_in_formulaExpression1103); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_52.add(char_literal46);

                    pushFollow(FOLLOW_formulaExpression_in_formulaExpression1105);
                    formulaExpression47=formulaExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formulaExpression.add(formulaExpression47.getTree());
                    char_literal48=(Token)match(input,53,FOLLOW_53_in_formulaExpression1107); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal48);

                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:174:31: ( mathOperator formulaExpression )?
                    int alt19=2;
                    alt19 = dfa19.predict(input);
                    switch (alt19) {
                        case 1 :
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:174:32: mathOperator formulaExpression
                            {
                            pushFollow(FOLLOW_mathOperator_in_formulaExpression1110);
                            mathOperator49=mathOperator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_mathOperator.add(mathOperator49.getTree());
                            pushFollow(FOLLOW_formulaExpression_in_formulaExpression1112);
                            formulaExpression50=formulaExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formulaExpression.add(formulaExpression50.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: mathOperator, formulaExpression, formulaExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 175:5: -> ^( FORMULAEXPRESSION formulaExpression ( mathOperator formulaExpression )? )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:175:8: ^( FORMULAEXPRESSION formulaExpression ( mathOperator formulaExpression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMULAEXPRESSION, "FORMULAEXPRESSION"), root_1);

                        adaptor.addChild(root_1, stream_formulaExpression.nextTree());
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:175:46: ( mathOperator formulaExpression )?
                        if ( stream_mathOperator.hasNext()||stream_formulaExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_mathOperator.nextTree());
                            adaptor.addChild(root_1, stream_formulaExpression.nextTree());

                        }
                        stream_mathOperator.reset();
                        stream_formulaExpression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formulaExpression"

    public static class formulaItem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "formulaItem"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:178:1: formulaItem : ( term | termInstance | termWithAssociation ) -> ^( FORMULAITEM ( term )? ( termInstance )? ( termWithAssociation )? ) ;
    public final LetaGrammarParser.formulaItem_return formulaItem() throws RecognitionException {
        LetaGrammarParser.formulaItem_return retval = new LetaGrammarParser.formulaItem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LetaGrammarParser.term_return term51 = null;

        LetaGrammarParser.termInstance_return termInstance52 = null;

        LetaGrammarParser.termWithAssociation_return termWithAssociation53 = null;


        RewriteRuleSubtreeStream stream_termWithAssociation=new RewriteRuleSubtreeStream(adaptor,"rule termWithAssociation");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_termInstance=new RewriteRuleSubtreeStream(adaptor,"rule termInstance");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:179:3: ( ( term | termInstance | termWithAssociation ) -> ^( FORMULAITEM ( term )? ( termInstance )? ( termWithAssociation )? ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:179:5: ( term | termInstance | termWithAssociation )
            {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:179:5: ( term | termInstance | termWithAssociation )
            int alt21=3;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:179:6: term
                    {
                    pushFollow(FOLLOW_term_in_formulaItem1148);
                    term51=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_term.add(term51.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:179:13: termInstance
                    {
                    pushFollow(FOLLOW_termInstance_in_formulaItem1152);
                    termInstance52=termInstance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_termInstance.add(termInstance52.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:179:28: termWithAssociation
                    {
                    pushFollow(FOLLOW_termWithAssociation_in_formulaItem1156);
                    termWithAssociation53=termWithAssociation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_termWithAssociation.add(termWithAssociation53.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: termWithAssociation, termInstance, term
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 180:5: -> ^( FORMULAITEM ( term )? ( termInstance )? ( termWithAssociation )? )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:180:8: ^( FORMULAITEM ( term )? ( termInstance )? ( termWithAssociation )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMULAITEM, "FORMULAITEM"), root_1);

                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:180:22: ( term )?
                if ( stream_term.hasNext() ) {
                    adaptor.addChild(root_1, stream_term.nextTree());

                }
                stream_term.reset();
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:180:28: ( termInstance )?
                if ( stream_termInstance.hasNext() ) {
                    adaptor.addChild(root_1, stream_termInstance.nextTree());

                }
                stream_termInstance.reset();
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:180:42: ( termWithAssociation )?
                if ( stream_termWithAssociation.hasNext() ) {
                    adaptor.addChild(root_1, stream_termWithAssociation.nextTree());

                }
                stream_termWithAssociation.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "formulaItem"

    public static class mathOperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "mathOperator"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:183:1: mathOperator : ( '+' -> ^( OPERATOR '+' ) | '-' -> ^( OPERATOR '-' ) | '/' -> ^( OPERATOR '/' ) | '*' -> ^( OPERATOR '*' ) | '%' -> ^( OPERATOR '%' ) | '**' -> ^( OPERATOR '**' ) );
    public final LetaGrammarParser.mathOperator_return mathOperator() throws RecognitionException {
        LetaGrammarParser.mathOperator_return retval = new LetaGrammarParser.mathOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal54=null;
        Token char_literal55=null;
        Token char_literal56=null;
        Token char_literal57=null;
        Token char_literal58=null;
        Token string_literal59=null;

        Object char_literal54_tree=null;
        Object char_literal55_tree=null;
        Object char_literal56_tree=null;
        Object char_literal57_tree=null;
        Object char_literal58_tree=null;
        Object string_literal59_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:184:3: ( '+' -> ^( OPERATOR '+' ) | '-' -> ^( OPERATOR '-' ) | '/' -> ^( OPERATOR '/' ) | '*' -> ^( OPERATOR '*' ) | '%' -> ^( OPERATOR '%' ) | '**' -> ^( OPERATOR '**' ) )
            int alt22=6;
            switch ( input.LA(1) ) {
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
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:184:5: '+'
                    {
                    char_literal54=(Token)match(input,62,FOLLOW_62_in_mathOperator1189); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_62.add(char_literal54);



                    // AST REWRITE
                    // elements: 62
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 185:5: -> ^( OPERATOR '+' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:185:8: ^( OPERATOR '+' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_62.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:186:5: '-'
                    {
                    char_literal55=(Token)match(input,63,FOLLOW_63_in_mathOperator1207); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_63.add(char_literal55);



                    // AST REWRITE
                    // elements: 63
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 187:5: -> ^( OPERATOR '-' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:187:8: ^( OPERATOR '-' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_63.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:188:5: '/'
                    {
                    char_literal56=(Token)match(input,64,FOLLOW_64_in_mathOperator1225); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_64.add(char_literal56);



                    // AST REWRITE
                    // elements: 64
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 189:5: -> ^( OPERATOR '/' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:189:8: ^( OPERATOR '/' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_64.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:190:5: '*'
                    {
                    char_literal57=(Token)match(input,65,FOLLOW_65_in_mathOperator1243); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_65.add(char_literal57);



                    // AST REWRITE
                    // elements: 65
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 191:5: -> ^( OPERATOR '*' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:191:8: ^( OPERATOR '*' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_65.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:192:5: '%'
                    {
                    char_literal58=(Token)match(input,66,FOLLOW_66_in_mathOperator1261); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_66.add(char_literal58);



                    // AST REWRITE
                    // elements: 66
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 193:5: -> ^( OPERATOR '%' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:193:8: ^( OPERATOR '%' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_66.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:194:5: '**'
                    {
                    string_literal59=(Token)match(input,67,FOLLOW_67_in_mathOperator1279); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_67.add(string_literal59);



                    // AST REWRITE
                    // elements: 67
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 195:5: -> ^( OPERATOR '**' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:195:8: ^( OPERATOR '**' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_67.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "mathOperator"

    public static class relationalOperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "relationalOperator"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:198:1: relationalOperator : ( '>' -> ^( OPERATOR '>' ) | '<' -> ^( OPERATOR '<' ) | '>=' -> ^( OPERATOR '>=' ) | '<=' -> ^( OPERATOR '<=' ) | '!=' -> ^( OPERATOR '!=' ) );
    public final LetaGrammarParser.relationalOperator_return relationalOperator() throws RecognitionException {
        LetaGrammarParser.relationalOperator_return retval = new LetaGrammarParser.relationalOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal60=null;
        Token char_literal61=null;
        Token string_literal62=null;
        Token string_literal63=null;
        Token string_literal64=null;

        Object char_literal60_tree=null;
        Object char_literal61_tree=null;
        Object string_literal62_tree=null;
        Object string_literal63_tree=null;
        Object string_literal64_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:199:3: ( '>' -> ^( OPERATOR '>' ) | '<' -> ^( OPERATOR '<' ) | '>=' -> ^( OPERATOR '>=' ) | '<=' -> ^( OPERATOR '<=' ) | '!=' -> ^( OPERATOR '!=' ) )
            int alt23=5;
            switch ( input.LA(1) ) {
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
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:199:5: '>'
                    {
                    char_literal60=(Token)match(input,68,FOLLOW_68_in_relationalOperator1304); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_68.add(char_literal60);



                    // AST REWRITE
                    // elements: 68
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 200:5: -> ^( OPERATOR '>' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:200:8: ^( OPERATOR '>' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_68.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:201:5: '<'
                    {
                    char_literal61=(Token)match(input,69,FOLLOW_69_in_relationalOperator1322); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_69.add(char_literal61);



                    // AST REWRITE
                    // elements: 69
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 202:5: -> ^( OPERATOR '<' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:202:8: ^( OPERATOR '<' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_69.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:203:5: '>='
                    {
                    string_literal62=(Token)match(input,70,FOLLOW_70_in_relationalOperator1340); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_70.add(string_literal62);



                    // AST REWRITE
                    // elements: 70
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 204:5: -> ^( OPERATOR '>=' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:204:8: ^( OPERATOR '>=' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_70.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:205:5: '<='
                    {
                    string_literal63=(Token)match(input,71,FOLLOW_71_in_relationalOperator1358); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_71.add(string_literal63);



                    // AST REWRITE
                    // elements: 71
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 206:5: -> ^( OPERATOR '<=' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:206:8: ^( OPERATOR '<=' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_71.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:207:5: '!='
                    {
                    string_literal64=(Token)match(input,72,FOLLOW_72_in_relationalOperator1376); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_72.add(string_literal64);



                    // AST REWRITE
                    // elements: 72
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 208:5: -> ^( OPERATOR '!=' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:208:8: ^( OPERATOR '!=' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_72.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "relationalOperator"

    public static class set_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "set"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:211:1: set : '{' subSet '}' ( ',' set )? -> ^( SET subSet ( set )? ) ;
    public final LetaGrammarParser.set_return set() throws RecognitionException {
        LetaGrammarParser.set_return retval = new LetaGrammarParser.set_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal65=null;
        Token char_literal67=null;
        Token char_literal68=null;
        LetaGrammarParser.subSet_return subSet66 = null;

        LetaGrammarParser.set_return set69 = null;


        Object char_literal65_tree=null;
        Object char_literal67_tree=null;
        Object char_literal68_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_set=new RewriteRuleSubtreeStream(adaptor,"rule set");
        RewriteRuleSubtreeStream stream_subSet=new RewriteRuleSubtreeStream(adaptor,"rule subSet");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:212:3: ( '{' subSet '}' ( ',' set )? -> ^( SET subSet ( set )? ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:212:5: '{' subSet '}' ( ',' set )?
            {
            char_literal65=(Token)match(input,50,FOLLOW_50_in_set1401); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_50.add(char_literal65);

            pushFollow(FOLLOW_subSet_in_set1403);
            subSet66=subSet();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_subSet.add(subSet66.getTree());
            char_literal67=(Token)match(input,51,FOLLOW_51_in_set1405); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal67);

            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:212:20: ( ',' set )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==73) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:212:21: ',' set
                    {
                    char_literal68=(Token)match(input,73,FOLLOW_73_in_set1408); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_73.add(char_literal68);

                    pushFollow(FOLLOW_set_in_set1410);
                    set69=set();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_set.add(set69.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: set, subSet
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 213:5: -> ^( SET subSet ( set )? )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:213:8: ^( SET subSet ( set )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SET, "SET"), root_1);

                adaptor.addChild(root_1, stream_subSet.nextTree());
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:213:21: ( set )?
                if ( stream_set.hasNext() ) {
                    adaptor.addChild(root_1, stream_set.nextTree());

                }
                stream_set.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "set"

    public static class subSet_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subSet"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:216:1: subSet : literal ( ',' subSet )? -> ^( SUBSET literal ( subSet )? ) ;
    public final LetaGrammarParser.subSet_return subSet() throws RecognitionException {
        LetaGrammarParser.subSet_return retval = new LetaGrammarParser.subSet_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal71=null;
        LetaGrammarParser.literal_return literal70 = null;

        LetaGrammarParser.subSet_return subSet72 = null;


        Object char_literal71_tree=null;
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_subSet=new RewriteRuleSubtreeStream(adaptor,"rule subSet");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:217:3: ( literal ( ',' subSet )? -> ^( SUBSET literal ( subSet )? ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:217:5: literal ( ',' subSet )?
            {
            pushFollow(FOLLOW_literal_in_subSet1440);
            literal70=literal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_literal.add(literal70.getTree());
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:217:13: ( ',' subSet )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==73) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:217:14: ',' subSet
                    {
                    char_literal71=(Token)match(input,73,FOLLOW_73_in_subSet1443); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_73.add(char_literal71);

                    pushFollow(FOLLOW_subSet_in_subSet1445);
                    subSet72=subSet();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_subSet.add(subSet72.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: subSet, literal
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 218:5: -> ^( SUBSET literal ( subSet )? )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:218:8: ^( SUBSET literal ( subSet )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SUBSET, "SUBSET"), root_1);

                adaptor.addChild(root_1, stream_literal.nextTree());
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:218:25: ( subSet )?
                if ( stream_subSet.hasNext() ) {
                    adaptor.addChild(root_1, stream_subSet.nextTree());

                }
                stream_subSet.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "subSet"

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "literal"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:221:1: literal : ( STRING -> ^( LITERAL STRING ) | FLOAT -> ^( LITERAL FLOAT ) | MINUS_FLOAT -> ^( LITERAL MINUS_FLOAT ) | INT -> ^( LITERAL INT ) | MINUS_INT -> ^( LITERAL MINUS_INT ) | 'null' -> ^( LITERAL NULL ) );
    public final LetaGrammarParser.literal_return literal() throws RecognitionException {
        LetaGrammarParser.literal_return retval = new LetaGrammarParser.literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING73=null;
        Token FLOAT74=null;
        Token MINUS_FLOAT75=null;
        Token INT76=null;
        Token MINUS_INT77=null;
        Token string_literal78=null;

        Object STRING73_tree=null;
        Object FLOAT74_tree=null;
        Object MINUS_FLOAT75_tree=null;
        Object INT76_tree=null;
        Object MINUS_INT77_tree=null;
        Object string_literal78_tree=null;
        RewriteRuleTokenStream stream_MINUS_INT=new RewriteRuleTokenStream(adaptor,"token MINUS_INT");
        RewriteRuleTokenStream stream_MINUS_FLOAT=new RewriteRuleTokenStream(adaptor,"token MINUS_FLOAT");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:222:3: ( STRING -> ^( LITERAL STRING ) | FLOAT -> ^( LITERAL FLOAT ) | MINUS_FLOAT -> ^( LITERAL MINUS_FLOAT ) | INT -> ^( LITERAL INT ) | MINUS_INT -> ^( LITERAL MINUS_INT ) | 'null' -> ^( LITERAL NULL ) )
            int alt26=6;
            switch ( input.LA(1) ) {
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
            case 74:
                {
                alt26=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:222:5: STRING
                    {
                    STRING73=(Token)match(input,STRING,FOLLOW_STRING_in_literal1475); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(STRING73);



                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 223:5: -> ^( LITERAL STRING )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:223:8: ^( LITERAL STRING )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LITERAL, "LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_STRING.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:224:5: FLOAT
                    {
                    FLOAT74=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_literal1493); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOAT.add(FLOAT74);



                    // AST REWRITE
                    // elements: FLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 225:5: -> ^( LITERAL FLOAT )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:225:8: ^( LITERAL FLOAT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LITERAL, "LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_FLOAT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:226:5: MINUS_FLOAT
                    {
                    MINUS_FLOAT75=(Token)match(input,MINUS_FLOAT,FOLLOW_MINUS_FLOAT_in_literal1511); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS_FLOAT.add(MINUS_FLOAT75);



                    // AST REWRITE
                    // elements: MINUS_FLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 227:5: -> ^( LITERAL MINUS_FLOAT )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:227:8: ^( LITERAL MINUS_FLOAT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LITERAL, "LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_MINUS_FLOAT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:228:5: INT
                    {
                    INT76=(Token)match(input,INT,FOLLOW_INT_in_literal1529); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(INT76);



                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 229:5: -> ^( LITERAL INT )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:229:8: ^( LITERAL INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LITERAL, "LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:230:5: MINUS_INT
                    {
                    MINUS_INT77=(Token)match(input,MINUS_INT,FOLLOW_MINUS_INT_in_literal1547); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS_INT.add(MINUS_INT77);



                    // AST REWRITE
                    // elements: MINUS_INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 231:5: -> ^( LITERAL MINUS_INT )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:231:8: ^( LITERAL MINUS_INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LITERAL, "LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_MINUS_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:232:5: 'null'
                    {
                    string_literal78=(Token)match(input,74,FOLLOW_74_in_literal1565); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_74.add(string_literal78);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 233:5: -> ^( LITERAL NULL )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:233:8: ^( LITERAL NULL )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LITERAL, "LITERAL"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(NULL, "NULL"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal"

    public static class testPackage_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testPackage"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:236:1: testPackage : 'Package' PACKAGE_ID -> ^( PACKAGE PACKAGE_ID ) ;
    public final LetaGrammarParser.testPackage_return testPackage() throws RecognitionException {
        LetaGrammarParser.testPackage_return retval = new LetaGrammarParser.testPackage_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal79=null;
        Token PACKAGE_ID80=null;

        Object string_literal79_tree=null;
        Object PACKAGE_ID80_tree=null;
        RewriteRuleTokenStream stream_PACKAGE_ID=new RewriteRuleTokenStream(adaptor,"token PACKAGE_ID");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:237:3: ( 'Package' PACKAGE_ID -> ^( PACKAGE PACKAGE_ID ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:237:5: 'Package' PACKAGE_ID
            {
            string_literal79=(Token)match(input,75,FOLLOW_75_in_testPackage1590); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_75.add(string_literal79);

            PACKAGE_ID80=(Token)match(input,PACKAGE_ID,FOLLOW_PACKAGE_ID_in_testPackage1592); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PACKAGE_ID.add(PACKAGE_ID80);



            // AST REWRITE
            // elements: PACKAGE_ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 238:5: -> ^( PACKAGE PACKAGE_ID )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:238:8: ^( PACKAGE PACKAGE_ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PACKAGE, "PACKAGE"), root_1);

                adaptor.addChild(root_1, stream_PACKAGE_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "testPackage"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA21 dfa21 = new DFA21(this);
    static final String DFA4_eotS =
        "\u0091\uffff";
    static final String DFA4_eofS =
        "\u0091\uffff";
    static final String DFA4_minS =
        "\1\43\4\uffff\1\43\1\uffff\5\44\6\43\1\44\1\uffff\6\43\1\44\6\43"+
        "\1\44\6\43\1\44\6\43\1\44\6\43\1\44\14\uffff\1\43\14\uffff\1\43"+
        "\14\uffff\1\43\14\uffff\1\43\14\uffff\1\43\14\uffff\1\43\14\uffff";
    static final String DFA4_maxS =
        "\1\74\4\uffff\1\112\1\uffff\5\112\6\75\1\44\1\uffff\6\75\1\44\6"+
        "\75\1\44\6\75\1\44\6\75\1\44\6\75\1\44\14\uffff\1\75\14\uffff\1"+
        "\75\14\uffff\1\75\14\uffff\1\75\14\uffff\1\75\14\uffff\1\75\14\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\21\uffff\1\2\175\uffff";
    static final String DFA4_specialS =
        "\u0091\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\5\25\uffff\4\1",
            "",
            "",
            "",
            "",
            "\1\1\1\17\1\14\1\15\1\16\1\20\17\uffff\1\22\4\uffff\1\23\6"+
            "\uffff\1\7\1\10\1\11\1\12\1\13\1\uffff\1\21",
            "",
            "\1\27\1\24\1\25\1\26\1\30\17\uffff\1\32\21\uffff\1\31",
            "\1\36\1\33\1\34\1\35\1\37\17\uffff\1\41\21\uffff\1\40",
            "\1\45\1\42\1\43\1\44\1\46\17\uffff\1\50\21\uffff\1\47",
            "\1\54\1\51\1\52\1\53\1\55\17\uffff\1\57\21\uffff\1\56",
            "\1\63\1\60\1\61\1\62\1\64\17\uffff\1\66\21\uffff\1\65",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\103",
            "",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\120",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\135",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\152",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\167",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\1\31\uffff\1\23",
            "\1\u0084",
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
            "\1\1\31\uffff\1\23",
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
            "\1\1\31\uffff\1\23",
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
            "\1\1\31\uffff\1\23",
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
            "\1\1\31\uffff\1\23",
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
            "\1\1\31\uffff\1\23",
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
            "\1\1\31\uffff\1\23",
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
            return "98:5: (f= fact | fo= formula )";
        }
    }
    static final String DFA10_eotS =
        "\15\uffff";
    static final String DFA10_eofS =
        "\1\6\14\uffff";
    static final String DFA10_minS =
        "\1\43\14\uffff";
    static final String DFA10_maxS =
        "\1\74\14\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\6\uffff";
    static final String DFA10_specialS =
        "\15\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\12\uffff\1\6\1\uffff\2\6\3\uffff\3\6\1\uffff\4\1",
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

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "119:35: (tc2= termComposite (fe= factExt )? )?";
        }
    }
    static final String DFA12_eotS =
        "\15\uffff";
    static final String DFA12_eofS =
        "\1\6\14\uffff";
    static final String DFA12_minS =
        "\1\43\14\uffff";
    static final String DFA12_maxS =
        "\1\74\14\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\6\uffff";
    static final String DFA12_specialS =
        "\15\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\12\uffff\1\6\1\uffff\2\6\3\uffff\3\6\1\uffff\4\1",
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

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "124:16: ( termComposite ( factExt )? )?";
        }
    }
    static final String DFA14_eotS =
        "\71\uffff";
    static final String DFA14_eofS =
        "\1\uffff\1\2\67\uffff";
    static final String DFA14_minS =
        "\2\43\10\uffff\5\44\52\uffff";
    static final String DFA14_maxS =
        "\1\43\1\112\10\uffff\5\112\52\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\1\14\uffff\1\2\5\uffff\1\3\43\uffff";
    static final String DFA14_specialS =
        "\71\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1",
            "\1\2\5\17\5\uffff\1\2\1\uffff\2\2\3\uffff\3\2\1\25\13\uffff"+
            "\1\12\1\13\1\14\1\15\1\16\1\uffff\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\5\17\17\uffff\1\25\21\uffff\1\17",
            "\5\17\17\uffff\1\25\21\uffff\1\17",
            "\5\17\17\uffff\1\25\21\uffff\1\17",
            "\5\17\17\uffff\1\25\21\uffff\1\17",
            "\5\17\17\uffff\1\25\21\uffff\1\17",
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

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "129:17: (t= term | ti= termInstance | twa= termWithAssociation )";
        }
    }
    static final String DFA15_eotS =
        "\14\uffff";
    static final String DFA15_eofS =
        "\14\uffff";
    static final String DFA15_minS =
        "\1\44\13\uffff";
    static final String DFA15_maxS =
        "\1\112\13\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\5\uffff";
    static final String DFA15_specialS =
        "\14\uffff}>";
    static final String[] DFA15_transitionS = {
            "\5\6\33\uffff\5\1\1\uffff\1\6",
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

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "141:10: ( relationalOperator )?";
        }
    }
    static final String DFA18_eotS =
        "\16\uffff";
    static final String DFA18_eofS =
        "\1\7\15\uffff";
    static final String DFA18_minS =
        "\1\56\15\uffff";
    static final String DFA18_maxS =
        "\1\103\15\uffff";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\5\uffff\1\2\6\uffff";
    static final String DFA18_specialS =
        "\16\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\7\1\uffff\2\7\3\uffff\3\7\6\uffff\6\1",
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

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "172:17: ( mathOperator formulaExpression )?";
        }
    }
    static final String DFA19_eotS =
        "\16\uffff";
    static final String DFA19_eofS =
        "\1\7\15\uffff";
    static final String DFA19_minS =
        "\1\56\15\uffff";
    static final String DFA19_maxS =
        "\1\103\15\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\1\5\uffff\1\2\6\uffff";
    static final String DFA19_specialS =
        "\16\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\7\1\uffff\2\7\3\uffff\3\7\6\uffff\6\1",
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

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "174:31: ( mathOperator formulaExpression )?";
        }
    }
    static final String DFA21_eotS =
        "\77\uffff";
    static final String DFA21_eofS =
        "\1\uffff\1\2\75\uffff";
    static final String DFA21_minS =
        "\1\43\1\44\16\uffff\5\44\52\uffff";
    static final String DFA21_maxS =
        "\1\43\1\112\16\uffff\5\112\52\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\1\22\uffff\1\2\5\uffff\1\3\43\uffff";
    static final String DFA21_specialS =
        "\77\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\1",
            "\5\25\5\uffff\1\2\1\uffff\2\2\3\uffff\3\2\1\33\4\uffff\7\2"+
            "\1\20\1\21\1\22\1\23\1\24\1\uffff\1\25",
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
            "\5\25\17\uffff\1\33\21\uffff\1\25",
            "\5\25\17\uffff\1\33\21\uffff\1\25",
            "\5\25\17\uffff\1\33\21\uffff\1\25",
            "\5\25\17\uffff\1\33\21\uffff\1\25",
            "\5\25\17\uffff\1\33\21\uffff\1\25",
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

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "179:5: ( term | termInstance | termWithAssociation )";
        }
    }
 

    public static final BitSet FOLLOW_testPackage_in_leta231 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_testCase_in_leta234 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_46_in_testCase265 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_testCase267 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_verifyClause_in_testCase269 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_whenClause_in_testCase271 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_setClause_in_testCase273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_verifyClause306 = new BitSet(new long[]{0x1E10000800000000L});
    public static final BitSet FOLLOW_factComposite_in_verifyClause308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_whenClause333 = new BitSet(new long[]{0x1E10000800000000L});
    public static final BitSet FOLLOW_factComposite_in_whenClause335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_setClause360 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_setClause362 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_set_in_setClause364 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_setClause366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fact_in_factComposite394 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_formula_in_factComposite400 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_logicalOperator_in_factComposite406 = new BitSet(new long[]{0x1E10000800000000L});
    public static final BitSet FOLLOW_factComposite_in_factComposite410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_factComposite518 = new BitSet(new long[]{0x1E10000800000000L});
    public static final BitSet FOLLOW_factComposite_in_factComposite522 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_factComposite524 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_logicalOperator_in_factComposite529 = new BitSet(new long[]{0x1E10000800000000L});
    public static final BitSet FOLLOW_factComposite_in_factComposite533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_logicalOperator601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_logicalOperator613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termComposite_in_fact634 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_complement_in_fact638 = new BitSet(new long[]{0x1E00000800000002L});
    public static final BitSet FOLLOW_termComposite_in_fact643 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_factExt_in_fact647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_complement_in_factExt689 = new BitSet(new long[]{0x1E00000800000002L});
    public static final BitSet FOLLOW_termComposite_in_factExt692 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_factExt_in_factExt694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quantifier_in_termComposite730 = new BitSet(new long[]{0x1E00000800000000L});
    public static final BitSet FOLLOW_term_in_termComposite736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termInstance_in_termComposite742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termWithAssociation_in_termComposite748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_termInstance836 = new BitSet(new long[]{0x000001F000000000L,0x00000000000005F0L});
    public static final BitSet FOLLOW_relationalOperator_in_termInstance838 = new BitSet(new long[]{0x000001F000000000L,0x00000000000005F0L});
    public static final BitSet FOLLOW_literal_in_termInstance841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_termWithAssociation871 = new BitSet(new long[]{0x0100000000000000L,0x00000000000001F0L});
    public static final BitSet FOLLOW_relationalOperator_in_termWithAssociation873 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_termWithAssociation876 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_termWithAssociation878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_quantifier910 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_quantifier932 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_quantifier954 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_quantifier976 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier980 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_complement1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formulaItem_in_formula1040 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_formula1042 = new BitSet(new long[]{0x1E10000800000000L});
    public static final BitSet FOLLOW_formulaExpression_in_formula1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formulaItem_in_formulaExpression1071 = new BitSet(new long[]{0xC000000000000002L,0x000000000000000FL});
    public static final BitSet FOLLOW_mathOperator_in_formulaExpression1074 = new BitSet(new long[]{0x1E10000800000000L});
    public static final BitSet FOLLOW_formulaExpression_in_formulaExpression1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_formulaExpression1103 = new BitSet(new long[]{0x1E10000800000000L});
    public static final BitSet FOLLOW_formulaExpression_in_formulaExpression1105 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_formulaExpression1107 = new BitSet(new long[]{0xC000000000000002L,0x000000000000000FL});
    public static final BitSet FOLLOW_mathOperator_in_formulaExpression1110 = new BitSet(new long[]{0x1E10000800000000L});
    public static final BitSet FOLLOW_formulaExpression_in_formulaExpression1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_formulaItem1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termInstance_in_formulaItem1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termWithAssociation_in_formulaItem1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_mathOperator1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_mathOperator1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_mathOperator1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_mathOperator1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_mathOperator1261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_mathOperator1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_relationalOperator1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_relationalOperator1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_relationalOperator1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_relationalOperator1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_relationalOperator1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_set1401 = new BitSet(new long[]{0x000001F000000000L,0x00000000000005F0L});
    public static final BitSet FOLLOW_subSet_in_set1403 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_set1405 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_set1408 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_set_in_set1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_subSet1440 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_subSet1443 = new BitSet(new long[]{0x000001F000000000L,0x00000000000005F0L});
    public static final BitSet FOLLOW_subSet_in_subSet1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_FLOAT_in_literal1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_INT_in_literal1547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_literal1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_testPackage1590 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_PACKAGE_ID_in_testPackage1592 = new BitSet(new long[]{0x0000000000000002L});

}