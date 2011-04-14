// $ANTLR 3.3 Nov 30, 2010 12:46:29 C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g 2011-04-14 13:40:40

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LETA", "STMT", "TESTCASE", "WHEN", "VERIFY", "SET", "FACTCOMPOSITE", "CONJUNCTION", "DISJUNCTION", "FACT", "FACTEXT", "FACTUNARY", "FACTBINARY", "FACTNARY", "TERMCOMPOSITE", "FORMULA", "TERM", "TERMINSTANCE", "TERMWITHASSOCIATION", "COMPLEMENT", "NULL", "LITERAL", "QUANTIFIER", "FORMULAEXPRESSION", "FORMULAEXPRESSIONCOMPOSITE", "FORMULAITEM", "OPERATOR", "LIST", "AND", "OR", "PACKAGE", "ID", "INT", "STRING", "FLOAT", "MINUS_FLOAT", "MINUS_INT", "DATE_TIME", "PACKAGE_ID", "DIGIT", "COMMENT", "LINE_COMMENT", "WS", "'Test'", "'Verify'", "'When'", "'Set'", "'{'", "'}'", "'('", "')'", "'And'", "'Or'", "'@'", "'atLeast'", "'atMost'", "'exactly'", "'atLeastAndAtMost'", "'='", "'+'", "'-'", "'/'", "'*'", "'%'", "'**'", "'>'", "'<'", "'>='", "'<='", "'!='", "','", "'null'", "'Package'"
    };
    public static final int EOF=-1;
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
    public static final int T__76=76;
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
    public static final int COMMENT=44;
    public static final int LINE_COMMENT=45;
    public static final int WS=46;

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

            if ( (LA1_0==76) ) {
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

                if ( (LA2_0==47) ) {
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
            // elements: testCase, testPackage
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
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleSubtreeStream stream_verifyClause=new RewriteRuleSubtreeStream(adaptor,"rule verifyClause");
        RewriteRuleSubtreeStream stream_whenClause=new RewriteRuleSubtreeStream(adaptor,"rule whenClause");
        RewriteRuleSubtreeStream stream_setClause=new RewriteRuleSubtreeStream(adaptor,"rule setClause");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:78:3: ( 'Test' ID verifyClause whenClause ( setClause )? -> ^( TESTCASE ID ( setClause )? verifyClause whenClause ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:78:5: 'Test' ID verifyClause whenClause ( setClause )?
            {
            string_literal3=(Token)match(input,47,FOLLOW_47_in_testCase265); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(string_literal3);

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

            if ( (LA3_0==50) ) {
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
            // elements: whenClause, ID, verifyClause, setClause
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
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleSubtreeStream stream_factComposite=new RewriteRuleSubtreeStream(adaptor,"rule factComposite");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:83:3: ( 'Verify' factComposite -> ^( VERIFY factComposite ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:83:5: 'Verify' factComposite
            {
            string_literal8=(Token)match(input,48,FOLLOW_48_in_verifyClause306); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_48.add(string_literal8);

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
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleSubtreeStream stream_factComposite=new RewriteRuleSubtreeStream(adaptor,"rule factComposite");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:88:3: ( 'When' factComposite -> ^( WHEN factComposite ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:88:5: 'When' factComposite
            {
            string_literal10=(Token)match(input,49,FOLLOW_49_in_whenClause333); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(string_literal10);

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
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_set=new RewriteRuleSubtreeStream(adaptor,"rule set");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:93:3: ( 'Set' '{' set '}' -> ^( SET set ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:93:5: 'Set' '{' set '}'
            {
            string_literal12=(Token)match(input,50,FOLLOW_50_in_setClause360); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_50.add(string_literal12);

            char_literal13=(Token)match(input,51,FOLLOW_51_in_setClause362); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal13);

            pushFollow(FOLLOW_set_in_setClause364);
            set14=set();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_set.add(set14.getTree());
            char_literal15=(Token)match(input,52,FOLLOW_52_in_setClause366); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_52.add(char_literal15);



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
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_logicalOperator=new RewriteRuleSubtreeStream(adaptor,"rule logicalOperator");
        RewriteRuleSubtreeStream stream_fact=new RewriteRuleSubtreeStream(adaptor,"rule fact");
        RewriteRuleSubtreeStream stream_factComposite=new RewriteRuleSubtreeStream(adaptor,"rule factComposite");
        RewriteRuleSubtreeStream stream_formula=new RewriteRuleSubtreeStream(adaptor,"rule formula");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:98:3: ( (f= fact | fo= formula ) (op= logicalOperator fc= factComposite )? -> {op != null && op.value.equals(\"And\") && f != null}? ^( 'And' $f $fc) -> {op != null && op.value.equals(\"Or\") && f != null}? ^( 'Or' $f $fc) -> {op != null && op.value.equals(\"And\") && fo != null}? ^( 'And' $fo $fc) -> {op != null && op.value.equals(\"Or\") && fo != null}? ^( 'Or' $fo $fc) -> {f != null}? ^( FACTCOMPOSITE $f) -> ^( FACTCOMPOSITE $fo) | '(' fc1= factComposite ')' (op= logicalOperator fc2= factComposite )? -> {op != null && op.value.equals(\"And\")}? ^( 'And' $fc1 $fc2) -> {op != null && op.value.equals(\"Or\")}? ^( 'Or' $fc1 $fc2) -> ^( FACTCOMPOSITE $fc1) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID||(LA7_0>=58 && LA7_0<=61)) ) {
                alt7=1;
            }
            else if ( (LA7_0==53) ) {
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

                    if ( ((LA5_0>=55 && LA5_0<=56)) ) {
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
                    // elements: f, fo, 55, 55, 56, fc, fo, fo, fc, 56, fc, f, fc, f
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
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(55, "55"), root_1);

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
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(56, "56"), root_1);

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
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(55, "55"), root_1);

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
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(56, "56"), root_1);

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
                    char_literal16=(Token)match(input,53,FOLLOW_53_in_factComposite518); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal16);

                    pushFollow(FOLLOW_factComposite_in_factComposite522);
                    fc1=factComposite();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_factComposite.add(fc1.getTree());
                    char_literal17=(Token)match(input,54,FOLLOW_54_in_factComposite524); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal17);

                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:105:31: (op= logicalOperator fc2= factComposite )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=55 && LA6_0<=56)) ) {
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
                    // elements: fc1, fc2, fc1, 56, 55, fc2, fc1
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
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(55, "55"), root_1);

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
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(56, "56"), root_1);

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

            if ( (LA8_0==55) ) {
                alt8=1;
            }
            else if ( (LA8_0==56) ) {
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

                    string_literal18=(Token)match(input,55,FOLLOW_55_in_logicalOperator601); if (state.failed) return retval;
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

                    string_literal19=(Token)match(input,56,FOLLOW_56_in_logicalOperator613); if (state.failed) return retval;
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
            // elements: tc2, tc, fe, c
            // token labels: 
            // rule labels: retval, c, tc, tc2, fe
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
            RewriteRuleSubtreeStream stream_tc=new RewriteRuleSubtreeStream(adaptor,"rule tc",tc!=null?tc.tree:null);
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
                if ( stream_tc2.hasNext()||stream_fe.hasNext() ) {
                    adaptor.addChild(root_1, stream_tc2.nextTree());
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:120:28: ( $fe)?
                    if ( stream_fe.hasNext() ) {
                        adaptor.addChild(root_1, stream_fe.nextTree());

                    }
                    stream_fe.reset();

                }
                stream_tc2.reset();
                stream_fe.reset();

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
            // elements: factExt, complement, termComposite
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
                if ( stream_factExt.hasNext()||stream_termComposite.hasNext() ) {
                    adaptor.addChild(root_1, stream_termComposite.nextTree());
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:125:44: ( factExt )?
                    if ( stream_factExt.hasNext() ) {
                        adaptor.addChild(root_1, stream_factExt.nextTree());

                    }
                    stream_factExt.reset();

                }
                stream_factExt.reset();
                stream_termComposite.reset();

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

            if ( ((LA13_0>=58 && LA13_0<=61)) ) {
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
            // elements: quantifier, quantifier, termWithAssociation, term, termInstance, quantifier
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:140:1: termInstance : ( term ( notEqualOperator )? stringLiteral -> ^( TERMINSTANCE term ( notEqualOperator )? stringLiteral ) | term ( relationalOperator )? otherLiteral -> ^( TERMINSTANCE term ( relationalOperator )? otherLiteral ) );
    public final LetaGrammarParser.termInstance_return termInstance() throws RecognitionException {
        LetaGrammarParser.termInstance_return retval = new LetaGrammarParser.termInstance_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LetaGrammarParser.term_return term25 = null;

        LetaGrammarParser.notEqualOperator_return notEqualOperator26 = null;

        LetaGrammarParser.stringLiteral_return stringLiteral27 = null;

        LetaGrammarParser.term_return term28 = null;

        LetaGrammarParser.relationalOperator_return relationalOperator29 = null;

        LetaGrammarParser.otherLiteral_return otherLiteral30 = null;


        RewriteRuleSubtreeStream stream_otherLiteral=new RewriteRuleSubtreeStream(adaptor,"rule otherLiteral");
        RewriteRuleSubtreeStream stream_relationalOperator=new RewriteRuleSubtreeStream(adaptor,"rule relationalOperator");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_notEqualOperator=new RewriteRuleSubtreeStream(adaptor,"rule notEqualOperator");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:141:3: ( term ( notEqualOperator )? stringLiteral -> ^( TERMINSTANCE term ( notEqualOperator )? stringLiteral ) | term ( relationalOperator )? otherLiteral -> ^( TERMINSTANCE term ( relationalOperator )? otherLiteral ) )
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:141:5: term ( notEqualOperator )? stringLiteral
                    {
                    pushFollow(FOLLOW_term_in_termInstance836);
                    term25=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_term.add(term25.getTree());
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:141:10: ( notEqualOperator )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==73) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:0:0: notEqualOperator
                            {
                            pushFollow(FOLLOW_notEqualOperator_in_termInstance838);
                            notEqualOperator26=notEqualOperator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_notEqualOperator.add(notEqualOperator26.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_stringLiteral_in_termInstance841);
                    stringLiteral27=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringLiteral.add(stringLiteral27.getTree());


                    // AST REWRITE
                    // elements: notEqualOperator, stringLiteral, term
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 142:5: -> ^( TERMINSTANCE term ( notEqualOperator )? stringLiteral )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:142:8: ^( TERMINSTANCE term ( notEqualOperator )? stringLiteral )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERMINSTANCE, "TERMINSTANCE"), root_1);

                        adaptor.addChild(root_1, stream_term.nextTree());
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:142:28: ( notEqualOperator )?
                        if ( stream_notEqualOperator.hasNext() ) {
                            adaptor.addChild(root_1, stream_notEqualOperator.nextTree());

                        }
                        stream_notEqualOperator.reset();
                        adaptor.addChild(root_1, stream_stringLiteral.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:143:5: term ( relationalOperator )? otherLiteral
                    {
                    pushFollow(FOLLOW_term_in_termInstance864);
                    term28=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_term.add(term28.getTree());
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:143:10: ( relationalOperator )?
                    int alt16=2;
                    alt16 = dfa16.predict(input);
                    switch (alt16) {
                        case 1 :
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:0:0: relationalOperator
                            {
                            pushFollow(FOLLOW_relationalOperator_in_termInstance866);
                            relationalOperator29=relationalOperator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_relationalOperator.add(relationalOperator29.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_otherLiteral_in_termInstance869);
                    otherLiteral30=otherLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_otherLiteral.add(otherLiteral30.getTree());


                    // AST REWRITE
                    // elements: term, otherLiteral, relationalOperator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 144:5: -> ^( TERMINSTANCE term ( relationalOperator )? otherLiteral )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:144:8: ^( TERMINSTANCE term ( relationalOperator )? otherLiteral )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERMINSTANCE, "TERMINSTANCE"), root_1);

                        adaptor.addChild(root_1, stream_term.nextTree());
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:144:28: ( relationalOperator )?
                        if ( stream_relationalOperator.hasNext() ) {
                            adaptor.addChild(root_1, stream_relationalOperator.nextTree());

                        }
                        stream_relationalOperator.reset();
                        adaptor.addChild(root_1, stream_otherLiteral.nextTree());

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
    // $ANTLR end "termInstance"

    public static class termWithAssociation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termWithAssociation"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:147:1: termWithAssociation : term ( relationalOperator )? '@' INT -> ^( TERMWITHASSOCIATION term ( relationalOperator )? INT ) ;
    public final LetaGrammarParser.termWithAssociation_return termWithAssociation() throws RecognitionException {
        LetaGrammarParser.termWithAssociation_return retval = new LetaGrammarParser.termWithAssociation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal33=null;
        Token INT34=null;
        LetaGrammarParser.term_return term31 = null;

        LetaGrammarParser.relationalOperator_return relationalOperator32 = null;


        Object char_literal33_tree=null;
        Object INT34_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_relationalOperator=new RewriteRuleSubtreeStream(adaptor,"rule relationalOperator");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:148:3: ( term ( relationalOperator )? '@' INT -> ^( TERMWITHASSOCIATION term ( relationalOperator )? INT ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:148:5: term ( relationalOperator )? '@' INT
            {
            pushFollow(FOLLOW_term_in_termWithAssociation899);
            term31=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_term.add(term31.getTree());
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:148:10: ( relationalOperator )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=69 && LA18_0<=73)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:0:0: relationalOperator
                    {
                    pushFollow(FOLLOW_relationalOperator_in_termWithAssociation901);
                    relationalOperator32=relationalOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relationalOperator.add(relationalOperator32.getTree());

                    }
                    break;

            }

            char_literal33=(Token)match(input,57,FOLLOW_57_in_termWithAssociation904); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal33);

            INT34=(Token)match(input,INT,FOLLOW_INT_in_termWithAssociation906); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INT.add(INT34);



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
            // 149:5: -> ^( TERMWITHASSOCIATION term ( relationalOperator )? INT )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:149:8: ^( TERMWITHASSOCIATION term ( relationalOperator )? INT )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERMWITHASSOCIATION, "TERMWITHASSOCIATION"), root_1);

                adaptor.addChild(root_1, stream_term.nextTree());
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:149:35: ( relationalOperator )?
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:152:1: quantifier : ( 'atLeast' INT -> ^( QUANTIFIER 'atLeast' INT ) | 'atMost' INT -> ^( QUANTIFIER 'atMost' INT ) | 'exactly' INT -> ^( QUANTIFIER 'exactly' INT ) | 'atLeastAndAtMost' i1= INT i2= INT -> ^( QUANTIFIER 'atLeastAndAtMost' $i1 $i2) );
    public final LetaGrammarParser.quantifier_return quantifier() throws RecognitionException {
        LetaGrammarParser.quantifier_return retval = new LetaGrammarParser.quantifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token i1=null;
        Token i2=null;
        Token string_literal35=null;
        Token INT36=null;
        Token string_literal37=null;
        Token INT38=null;
        Token string_literal39=null;
        Token INT40=null;
        Token string_literal41=null;

        Object i1_tree=null;
        Object i2_tree=null;
        Object string_literal35_tree=null;
        Object INT36_tree=null;
        Object string_literal37_tree=null;
        Object INT38_tree=null;
        Object string_literal39_tree=null;
        Object INT40_tree=null;
        Object string_literal41_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:153:3: ( 'atLeast' INT -> ^( QUANTIFIER 'atLeast' INT ) | 'atMost' INT -> ^( QUANTIFIER 'atMost' INT ) | 'exactly' INT -> ^( QUANTIFIER 'exactly' INT ) | 'atLeastAndAtMost' i1= INT i2= INT -> ^( QUANTIFIER 'atLeastAndAtMost' $i1 $i2) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt19=1;
                }
                break;
            case 59:
                {
                alt19=2;
                }
                break;
            case 60:
                {
                alt19=3;
                }
                break;
            case 61:
                {
                alt19=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:153:5: 'atLeast' INT
                    {
                    string_literal35=(Token)match(input,58,FOLLOW_58_in_quantifier938); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_58.add(string_literal35);

                    INT36=(Token)match(input,INT,FOLLOW_INT_in_quantifier940); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(INT36);



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
                    // 154:5: -> ^( QUANTIFIER 'atLeast' INT )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:154:8: ^( QUANTIFIER 'atLeast' INT )
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
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:155:5: 'atMost' INT
                    {
                    string_literal37=(Token)match(input,59,FOLLOW_59_in_quantifier960); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_59.add(string_literal37);

                    INT38=(Token)match(input,INT,FOLLOW_INT_in_quantifier962); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(INT38);



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
                    // 156:5: -> ^( QUANTIFIER 'atMost' INT )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:156:8: ^( QUANTIFIER 'atMost' INT )
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
                case 3 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:157:5: 'exactly' INT
                    {
                    string_literal39=(Token)match(input,60,FOLLOW_60_in_quantifier982); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_60.add(string_literal39);

                    INT40=(Token)match(input,INT,FOLLOW_INT_in_quantifier984); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(INT40);



                    // AST REWRITE
                    // elements: INT, 60
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 158:5: -> ^( QUANTIFIER 'exactly' INT )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:158:8: ^( QUANTIFIER 'exactly' INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_60.nextNode());
                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:159:5: 'atLeastAndAtMost' i1= INT i2= INT
                    {
                    string_literal41=(Token)match(input,61,FOLLOW_61_in_quantifier1004); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_61.add(string_literal41);

                    i1=(Token)match(input,INT,FOLLOW_INT_in_quantifier1008); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(i1);

                    i2=(Token)match(input,INT,FOLLOW_INT_in_quantifier1012); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(i2);



                    // AST REWRITE
                    // elements: i2, 61, i1
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
                    // 160:5: -> ^( QUANTIFIER 'atLeastAndAtMost' $i1 $i2)
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:160:8: ^( QUANTIFIER 'atLeastAndAtMost' $i1 $i2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_61.nextNode());
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:163:1: complement : ID -> ^( COMPLEMENT ID ) ;
    public final LetaGrammarParser.complement_return complement() throws RecognitionException {
        LetaGrammarParser.complement_return retval = new LetaGrammarParser.complement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID42=null;

        Object ID42_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:164:3: ( ID -> ^( COMPLEMENT ID ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:164:5: ID
            {
            ID42=(Token)match(input,ID,FOLLOW_ID_in_complement1043); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID42);



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
            // 165:5: -> ^( COMPLEMENT ID )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:165:8: ^( COMPLEMENT ID )
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:168:1: formula : formulaItem '=' formulaExpression -> ^( FORMULA formulaItem formulaExpression ) ;
    public final LetaGrammarParser.formula_return formula() throws RecognitionException {
        LetaGrammarParser.formula_return retval = new LetaGrammarParser.formula_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal44=null;
        LetaGrammarParser.formulaItem_return formulaItem43 = null;

        LetaGrammarParser.formulaExpression_return formulaExpression45 = null;


        Object char_literal44_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_formulaExpression=new RewriteRuleSubtreeStream(adaptor,"rule formulaExpression");
        RewriteRuleSubtreeStream stream_formulaItem=new RewriteRuleSubtreeStream(adaptor,"rule formulaItem");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:169:3: ( formulaItem '=' formulaExpression -> ^( FORMULA formulaItem formulaExpression ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:169:5: formulaItem '=' formulaExpression
            {
            pushFollow(FOLLOW_formulaItem_in_formula1068);
            formulaItem43=formulaItem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_formulaItem.add(formulaItem43.getTree());
            char_literal44=(Token)match(input,62,FOLLOW_62_in_formula1070); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_62.add(char_literal44);

            pushFollow(FOLLOW_formulaExpression_in_formula1072);
            formulaExpression45=formulaExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_formulaExpression.add(formulaExpression45.getTree());


            // AST REWRITE
            // elements: formulaExpression, formulaItem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 170:5: -> ^( FORMULA formulaItem formulaExpression )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:170:8: ^( FORMULA formulaItem formulaExpression )
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:173:1: formulaExpression : ( formulaItem ( mathOperator formulaExpression )? -> ^( FORMULAEXPRESSION formulaItem ( mathOperator formulaExpression )? ) | '(' formulaExpression ')' ( mathOperator formulaExpression )? -> ^( FORMULAEXPRESSION formulaExpression ( mathOperator formulaExpression )? ) );
    public final LetaGrammarParser.formulaExpression_return formulaExpression() throws RecognitionException {
        LetaGrammarParser.formulaExpression_return retval = new LetaGrammarParser.formulaExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal49=null;
        Token char_literal51=null;
        LetaGrammarParser.formulaItem_return formulaItem46 = null;

        LetaGrammarParser.mathOperator_return mathOperator47 = null;

        LetaGrammarParser.formulaExpression_return formulaExpression48 = null;

        LetaGrammarParser.formulaExpression_return formulaExpression50 = null;

        LetaGrammarParser.mathOperator_return mathOperator52 = null;

        LetaGrammarParser.formulaExpression_return formulaExpression53 = null;


        Object char_literal49_tree=null;
        Object char_literal51_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_formulaExpression=new RewriteRuleSubtreeStream(adaptor,"rule formulaExpression");
        RewriteRuleSubtreeStream stream_mathOperator=new RewriteRuleSubtreeStream(adaptor,"rule mathOperator");
        RewriteRuleSubtreeStream stream_formulaItem=new RewriteRuleSubtreeStream(adaptor,"rule formulaItem");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:174:3: ( formulaItem ( mathOperator formulaExpression )? -> ^( FORMULAEXPRESSION formulaItem ( mathOperator formulaExpression )? ) | '(' formulaExpression ')' ( mathOperator formulaExpression )? -> ^( FORMULAEXPRESSION formulaExpression ( mathOperator formulaExpression )? ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ID) ) {
                alt22=1;
            }
            else if ( (LA22_0==53) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:174:5: formulaItem ( mathOperator formulaExpression )?
                    {
                    pushFollow(FOLLOW_formulaItem_in_formulaExpression1099);
                    formulaItem46=formulaItem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formulaItem.add(formulaItem46.getTree());
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:174:17: ( mathOperator formulaExpression )?
                    int alt20=2;
                    alt20 = dfa20.predict(input);
                    switch (alt20) {
                        case 1 :
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:174:18: mathOperator formulaExpression
                            {
                            pushFollow(FOLLOW_mathOperator_in_formulaExpression1102);
                            mathOperator47=mathOperator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_mathOperator.add(mathOperator47.getTree());
                            pushFollow(FOLLOW_formulaExpression_in_formulaExpression1104);
                            formulaExpression48=formulaExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formulaExpression.add(formulaExpression48.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: formulaExpression, mathOperator, formulaItem
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 175:5: -> ^( FORMULAEXPRESSION formulaItem ( mathOperator formulaExpression )? )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:175:8: ^( FORMULAEXPRESSION formulaItem ( mathOperator formulaExpression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMULAEXPRESSION, "FORMULAEXPRESSION"), root_1);

                        adaptor.addChild(root_1, stream_formulaItem.nextTree());
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:175:40: ( mathOperator formulaExpression )?
                        if ( stream_formulaExpression.hasNext()||stream_mathOperator.hasNext() ) {
                            adaptor.addChild(root_1, stream_mathOperator.nextTree());
                            adaptor.addChild(root_1, stream_formulaExpression.nextTree());

                        }
                        stream_formulaExpression.reset();
                        stream_mathOperator.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:176:5: '(' formulaExpression ')' ( mathOperator formulaExpression )?
                    {
                    char_literal49=(Token)match(input,53,FOLLOW_53_in_formulaExpression1131); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal49);

                    pushFollow(FOLLOW_formulaExpression_in_formulaExpression1133);
                    formulaExpression50=formulaExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formulaExpression.add(formulaExpression50.getTree());
                    char_literal51=(Token)match(input,54,FOLLOW_54_in_formulaExpression1135); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal51);

                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:176:31: ( mathOperator formulaExpression )?
                    int alt21=2;
                    alt21 = dfa21.predict(input);
                    switch (alt21) {
                        case 1 :
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:176:32: mathOperator formulaExpression
                            {
                            pushFollow(FOLLOW_mathOperator_in_formulaExpression1138);
                            mathOperator52=mathOperator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_mathOperator.add(mathOperator52.getTree());
                            pushFollow(FOLLOW_formulaExpression_in_formulaExpression1140);
                            formulaExpression53=formulaExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formulaExpression.add(formulaExpression53.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: formulaExpression, mathOperator, formulaExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 177:5: -> ^( FORMULAEXPRESSION formulaExpression ( mathOperator formulaExpression )? )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:177:8: ^( FORMULAEXPRESSION formulaExpression ( mathOperator formulaExpression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMULAEXPRESSION, "FORMULAEXPRESSION"), root_1);

                        adaptor.addChild(root_1, stream_formulaExpression.nextTree());
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:177:46: ( mathOperator formulaExpression )?
                        if ( stream_formulaExpression.hasNext()||stream_mathOperator.hasNext() ) {
                            adaptor.addChild(root_1, stream_mathOperator.nextTree());
                            adaptor.addChild(root_1, stream_formulaExpression.nextTree());

                        }
                        stream_formulaExpression.reset();
                        stream_mathOperator.reset();

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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:180:1: formulaItem : ( term | termInstance | termWithAssociation ) -> ^( FORMULAITEM ( term )? ( termInstance )? ( termWithAssociation )? ) ;
    public final LetaGrammarParser.formulaItem_return formulaItem() throws RecognitionException {
        LetaGrammarParser.formulaItem_return retval = new LetaGrammarParser.formulaItem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LetaGrammarParser.term_return term54 = null;

        LetaGrammarParser.termInstance_return termInstance55 = null;

        LetaGrammarParser.termWithAssociation_return termWithAssociation56 = null;


        RewriteRuleSubtreeStream stream_termWithAssociation=new RewriteRuleSubtreeStream(adaptor,"rule termWithAssociation");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_termInstance=new RewriteRuleSubtreeStream(adaptor,"rule termInstance");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:181:3: ( ( term | termInstance | termWithAssociation ) -> ^( FORMULAITEM ( term )? ( termInstance )? ( termWithAssociation )? ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:181:5: ( term | termInstance | termWithAssociation )
            {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:181:5: ( term | termInstance | termWithAssociation )
            int alt23=3;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:181:6: term
                    {
                    pushFollow(FOLLOW_term_in_formulaItem1176);
                    term54=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_term.add(term54.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:181:13: termInstance
                    {
                    pushFollow(FOLLOW_termInstance_in_formulaItem1180);
                    termInstance55=termInstance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_termInstance.add(termInstance55.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:181:28: termWithAssociation
                    {
                    pushFollow(FOLLOW_termWithAssociation_in_formulaItem1184);
                    termWithAssociation56=termWithAssociation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_termWithAssociation.add(termWithAssociation56.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: term, termInstance, termWithAssociation
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 182:5: -> ^( FORMULAITEM ( term )? ( termInstance )? ( termWithAssociation )? )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:182:8: ^( FORMULAITEM ( term )? ( termInstance )? ( termWithAssociation )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMULAITEM, "FORMULAITEM"), root_1);

                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:182:22: ( term )?
                if ( stream_term.hasNext() ) {
                    adaptor.addChild(root_1, stream_term.nextTree());

                }
                stream_term.reset();
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:182:28: ( termInstance )?
                if ( stream_termInstance.hasNext() ) {
                    adaptor.addChild(root_1, stream_termInstance.nextTree());

                }
                stream_termInstance.reset();
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:182:42: ( termWithAssociation )?
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:185:1: mathOperator : ( '+' -> ^( OPERATOR '+' ) | '-' -> ^( OPERATOR '-' ) | '/' -> ^( OPERATOR '/' ) | '*' -> ^( OPERATOR '*' ) | '%' -> ^( OPERATOR '%' ) | '**' -> ^( OPERATOR '**' ) );
    public final LetaGrammarParser.mathOperator_return mathOperator() throws RecognitionException {
        LetaGrammarParser.mathOperator_return retval = new LetaGrammarParser.mathOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal57=null;
        Token char_literal58=null;
        Token char_literal59=null;
        Token char_literal60=null;
        Token char_literal61=null;
        Token string_literal62=null;

        Object char_literal57_tree=null;
        Object char_literal58_tree=null;
        Object char_literal59_tree=null;
        Object char_literal60_tree=null;
        Object char_literal61_tree=null;
        Object string_literal62_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:186:3: ( '+' -> ^( OPERATOR '+' ) | '-' -> ^( OPERATOR '-' ) | '/' -> ^( OPERATOR '/' ) | '*' -> ^( OPERATOR '*' ) | '%' -> ^( OPERATOR '%' ) | '**' -> ^( OPERATOR '**' ) )
            int alt24=6;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt24=1;
                }
                break;
            case 64:
                {
                alt24=2;
                }
                break;
            case 65:
                {
                alt24=3;
                }
                break;
            case 66:
                {
                alt24=4;
                }
                break;
            case 67:
                {
                alt24=5;
                }
                break;
            case 68:
                {
                alt24=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:186:5: '+'
                    {
                    char_literal57=(Token)match(input,63,FOLLOW_63_in_mathOperator1217); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_63.add(char_literal57);



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
                    // 187:5: -> ^( OPERATOR '+' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:187:8: ^( OPERATOR '+' )
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
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:188:5: '-'
                    {
                    char_literal58=(Token)match(input,64,FOLLOW_64_in_mathOperator1235); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_64.add(char_literal58);



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
                    // 189:5: -> ^( OPERATOR '-' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:189:8: ^( OPERATOR '-' )
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
                case 3 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:190:5: '/'
                    {
                    char_literal59=(Token)match(input,65,FOLLOW_65_in_mathOperator1253); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_65.add(char_literal59);



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
                    // 191:5: -> ^( OPERATOR '/' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:191:8: ^( OPERATOR '/' )
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
                case 4 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:192:5: '*'
                    {
                    char_literal60=(Token)match(input,66,FOLLOW_66_in_mathOperator1271); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_66.add(char_literal60);



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
                    // 193:5: -> ^( OPERATOR '*' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:193:8: ^( OPERATOR '*' )
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
                case 5 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:194:5: '%'
                    {
                    char_literal61=(Token)match(input,67,FOLLOW_67_in_mathOperator1289); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_67.add(char_literal61);



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
                    // 195:5: -> ^( OPERATOR '%' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:195:8: ^( OPERATOR '%' )
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
                case 6 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:196:5: '**'
                    {
                    string_literal62=(Token)match(input,68,FOLLOW_68_in_mathOperator1307); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_68.add(string_literal62);



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
                    // 197:5: -> ^( OPERATOR '**' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:197:8: ^( OPERATOR '**' )
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:200:1: relationalOperator : ( '>' -> ^( OPERATOR '>' ) | '<' -> ^( OPERATOR '<' ) | '>=' -> ^( OPERATOR '>=' ) | '<=' -> ^( OPERATOR '<=' ) | notEqualOperator );
    public final LetaGrammarParser.relationalOperator_return relationalOperator() throws RecognitionException {
        LetaGrammarParser.relationalOperator_return retval = new LetaGrammarParser.relationalOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal63=null;
        Token char_literal64=null;
        Token string_literal65=null;
        Token string_literal66=null;
        LetaGrammarParser.notEqualOperator_return notEqualOperator67 = null;


        Object char_literal63_tree=null;
        Object char_literal64_tree=null;
        Object string_literal65_tree=null;
        Object string_literal66_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:201:3: ( '>' -> ^( OPERATOR '>' ) | '<' -> ^( OPERATOR '<' ) | '>=' -> ^( OPERATOR '>=' ) | '<=' -> ^( OPERATOR '<=' ) | notEqualOperator )
            int alt25=5;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt25=1;
                }
                break;
            case 70:
                {
                alt25=2;
                }
                break;
            case 71:
                {
                alt25=3;
                }
                break;
            case 72:
                {
                alt25=4;
                }
                break;
            case 73:
                {
                alt25=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:201:5: '>'
                    {
                    char_literal63=(Token)match(input,69,FOLLOW_69_in_relationalOperator1332); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_69.add(char_literal63);



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
                    // 202:5: -> ^( OPERATOR '>' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:202:8: ^( OPERATOR '>' )
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
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:203:5: '<'
                    {
                    char_literal64=(Token)match(input,70,FOLLOW_70_in_relationalOperator1350); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_70.add(char_literal64);



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
                    // 204:5: -> ^( OPERATOR '<' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:204:8: ^( OPERATOR '<' )
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
                case 3 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:205:5: '>='
                    {
                    string_literal65=(Token)match(input,71,FOLLOW_71_in_relationalOperator1368); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_71.add(string_literal65);



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
                    // 206:5: -> ^( OPERATOR '>=' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:206:8: ^( OPERATOR '>=' )
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
                case 4 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:207:5: '<='
                    {
                    string_literal66=(Token)match(input,72,FOLLOW_72_in_relationalOperator1386); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_72.add(string_literal66);



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
                    // 208:5: -> ^( OPERATOR '<=' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:208:8: ^( OPERATOR '<=' )
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
                case 5 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:209:5: notEqualOperator
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_notEqualOperator_in_relationalOperator1404);
                    notEqualOperator67=notEqualOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, notEqualOperator67.getTree());

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

    public static class notEqualOperator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "notEqualOperator"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:212:1: notEqualOperator : '!=' -> ^( OPERATOR '!=' ) ;
    public final LetaGrammarParser.notEqualOperator_return notEqualOperator() throws RecognitionException {
        LetaGrammarParser.notEqualOperator_return retval = new LetaGrammarParser.notEqualOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal68=null;

        Object string_literal68_tree=null;
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:213:3: ( '!=' -> ^( OPERATOR '!=' ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:213:5: '!='
            {
            string_literal68=(Token)match(input,73,FOLLOW_73_in_notEqualOperator1417); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_73.add(string_literal68);



            // AST REWRITE
            // elements: 73
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 214:5: -> ^( OPERATOR '!=' )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:214:8: ^( OPERATOR '!=' )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                adaptor.addChild(root_1, stream_73.nextNode());

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
    // $ANTLR end "notEqualOperator"

    public static class set_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "set"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:217:1: set : '{' list '}' ( ',' set )? -> ^( SET list ( set )? ) ;
    public final LetaGrammarParser.set_return set() throws RecognitionException {
        LetaGrammarParser.set_return retval = new LetaGrammarParser.set_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal69=null;
        Token char_literal71=null;
        Token char_literal72=null;
        LetaGrammarParser.list_return list70 = null;

        LetaGrammarParser.set_return set73 = null;


        Object char_literal69_tree=null;
        Object char_literal71_tree=null;
        Object char_literal72_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_set=new RewriteRuleSubtreeStream(adaptor,"rule set");
        RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:218:3: ( '{' list '}' ( ',' set )? -> ^( SET list ( set )? ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:218:5: '{' list '}' ( ',' set )?
            {
            char_literal69=(Token)match(input,51,FOLLOW_51_in_set1442); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal69);

            pushFollow(FOLLOW_list_in_set1444);
            list70=list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_list.add(list70.getTree());
            char_literal71=(Token)match(input,52,FOLLOW_52_in_set1446); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_52.add(char_literal71);

            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:218:18: ( ',' set )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==74) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:218:19: ',' set
                    {
                    char_literal72=(Token)match(input,74,FOLLOW_74_in_set1449); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_74.add(char_literal72);

                    pushFollow(FOLLOW_set_in_set1451);
                    set73=set();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_set.add(set73.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: set, list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 219:5: -> ^( SET list ( set )? )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:219:8: ^( SET list ( set )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SET, "SET"), root_1);

                adaptor.addChild(root_1, stream_list.nextTree());
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:219:19: ( set )?
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

    public static class list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:222:1: list : ( stringLiteral | otherLiteral ) ( ',' list )? -> ^( LIST ( stringLiteral )? ( otherLiteral )? ( list )? ) ;
    public final LetaGrammarParser.list_return list() throws RecognitionException {
        LetaGrammarParser.list_return retval = new LetaGrammarParser.list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal76=null;
        LetaGrammarParser.stringLiteral_return stringLiteral74 = null;

        LetaGrammarParser.otherLiteral_return otherLiteral75 = null;

        LetaGrammarParser.list_return list77 = null;


        Object char_literal76_tree=null;
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_otherLiteral=new RewriteRuleSubtreeStream(adaptor,"rule otherLiteral");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:223:3: ( ( stringLiteral | otherLiteral ) ( ',' list )? -> ^( LIST ( stringLiteral )? ( otherLiteral )? ( list )? ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:223:5: ( stringLiteral | otherLiteral ) ( ',' list )?
            {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:223:5: ( stringLiteral | otherLiteral )
            int alt27=2;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:223:6: stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_list1482);
                    stringLiteral74=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringLiteral.add(stringLiteral74.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:223:22: otherLiteral
                    {
                    pushFollow(FOLLOW_otherLiteral_in_list1486);
                    otherLiteral75=otherLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_otherLiteral.add(otherLiteral75.getTree());

                    }
                    break;

            }

            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:223:36: ( ',' list )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==74) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:223:37: ',' list
                    {
                    char_literal76=(Token)match(input,74,FOLLOW_74_in_list1490); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_74.add(char_literal76);

                    pushFollow(FOLLOW_list_in_list1492);
                    list77=list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_list.add(list77.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: list, stringLiteral, otherLiteral
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 224:5: -> ^( LIST ( stringLiteral )? ( otherLiteral )? ( list )? )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:224:8: ^( LIST ( stringLiteral )? ( otherLiteral )? ( list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:224:15: ( stringLiteral )?
                if ( stream_stringLiteral.hasNext() ) {
                    adaptor.addChild(root_1, stream_stringLiteral.nextTree());

                }
                stream_stringLiteral.reset();
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:224:30: ( otherLiteral )?
                if ( stream_otherLiteral.hasNext() ) {
                    adaptor.addChild(root_1, stream_otherLiteral.nextTree());

                }
                stream_otherLiteral.reset();
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:224:44: ( list )?
                if ( stream_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_list.nextTree());

                }
                stream_list.reset();

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
    // $ANTLR end "list"

    public static class stringLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "stringLiteral"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:227:1: stringLiteral : ( STRING -> ^( LITERAL STRING ) | 'null' -> ^( LITERAL NULL ) );
    public final LetaGrammarParser.stringLiteral_return stringLiteral() throws RecognitionException {
        LetaGrammarParser.stringLiteral_return retval = new LetaGrammarParser.stringLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING78=null;
        Token string_literal79=null;

        Object STRING78_tree=null;
        Object string_literal79_tree=null;
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:228:3: ( STRING -> ^( LITERAL STRING ) | 'null' -> ^( LITERAL NULL ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==STRING) ) {
                alt29=1;
            }
            else if ( (LA29_0==75) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:228:5: STRING
                    {
                    STRING78=(Token)match(input,STRING,FOLLOW_STRING_in_stringLiteral1526); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(STRING78);



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
                    // 229:5: -> ^( LITERAL STRING )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:229:8: ^( LITERAL STRING )
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
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:230:5: 'null'
                    {
                    string_literal79=(Token)match(input,75,FOLLOW_75_in_stringLiteral1544); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(string_literal79);



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
                    // 231:5: -> ^( LITERAL NULL )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:231:8: ^( LITERAL NULL )
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
    // $ANTLR end "stringLiteral"

    public static class otherLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "otherLiteral"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:234:1: otherLiteral : ( FLOAT -> ^( LITERAL FLOAT ) | MINUS_FLOAT -> ^( LITERAL MINUS_FLOAT ) | INT -> ^( LITERAL INT ) | MINUS_INT -> ^( LITERAL MINUS_INT ) | DATE_TIME -> ^( LITERAL DATE_TIME ) | 'null' -> ^( LITERAL NULL ) );
    public final LetaGrammarParser.otherLiteral_return otherLiteral() throws RecognitionException {
        LetaGrammarParser.otherLiteral_return retval = new LetaGrammarParser.otherLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FLOAT80=null;
        Token MINUS_FLOAT81=null;
        Token INT82=null;
        Token MINUS_INT83=null;
        Token DATE_TIME84=null;
        Token string_literal85=null;

        Object FLOAT80_tree=null;
        Object MINUS_FLOAT81_tree=null;
        Object INT82_tree=null;
        Object MINUS_INT83_tree=null;
        Object DATE_TIME84_tree=null;
        Object string_literal85_tree=null;
        RewriteRuleTokenStream stream_DATE_TIME=new RewriteRuleTokenStream(adaptor,"token DATE_TIME");
        RewriteRuleTokenStream stream_MINUS_INT=new RewriteRuleTokenStream(adaptor,"token MINUS_INT");
        RewriteRuleTokenStream stream_MINUS_FLOAT=new RewriteRuleTokenStream(adaptor,"token MINUS_FLOAT");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:235:3: ( FLOAT -> ^( LITERAL FLOAT ) | MINUS_FLOAT -> ^( LITERAL MINUS_FLOAT ) | INT -> ^( LITERAL INT ) | MINUS_INT -> ^( LITERAL MINUS_INT ) | DATE_TIME -> ^( LITERAL DATE_TIME ) | 'null' -> ^( LITERAL NULL ) )
            int alt30=6;
            switch ( input.LA(1) ) {
            case FLOAT:
                {
                alt30=1;
                }
                break;
            case MINUS_FLOAT:
                {
                alt30=2;
                }
                break;
            case INT:
                {
                alt30=3;
                }
                break;
            case MINUS_INT:
                {
                alt30=4;
                }
                break;
            case DATE_TIME:
                {
                alt30=5;
                }
                break;
            case 75:
                {
                alt30=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:235:5: FLOAT
                    {
                    FLOAT80=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_otherLiteral1569); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOAT.add(FLOAT80);



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
                    // 236:5: -> ^( LITERAL FLOAT )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:236:8: ^( LITERAL FLOAT )
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
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:237:5: MINUS_FLOAT
                    {
                    MINUS_FLOAT81=(Token)match(input,MINUS_FLOAT,FOLLOW_MINUS_FLOAT_in_otherLiteral1587); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS_FLOAT.add(MINUS_FLOAT81);



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
                    // 238:5: -> ^( LITERAL MINUS_FLOAT )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:238:8: ^( LITERAL MINUS_FLOAT )
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
                case 3 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:239:5: INT
                    {
                    INT82=(Token)match(input,INT,FOLLOW_INT_in_otherLiteral1605); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(INT82);



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
                    // 240:5: -> ^( LITERAL INT )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:240:8: ^( LITERAL INT )
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
                case 4 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:241:5: MINUS_INT
                    {
                    MINUS_INT83=(Token)match(input,MINUS_INT,FOLLOW_MINUS_INT_in_otherLiteral1623); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS_INT.add(MINUS_INT83);



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
                    // 242:5: -> ^( LITERAL MINUS_INT )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:242:8: ^( LITERAL MINUS_INT )
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
                case 5 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:243:5: DATE_TIME
                    {
                    DATE_TIME84=(Token)match(input,DATE_TIME,FOLLOW_DATE_TIME_in_otherLiteral1641); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DATE_TIME.add(DATE_TIME84);



                    // AST REWRITE
                    // elements: DATE_TIME
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 244:5: -> ^( LITERAL DATE_TIME )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:244:8: ^( LITERAL DATE_TIME )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LITERAL, "LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_DATE_TIME.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:245:5: 'null'
                    {
                    string_literal85=(Token)match(input,75,FOLLOW_75_in_otherLiteral1659); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(string_literal85);



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
                    // 246:5: -> ^( LITERAL NULL )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:246:8: ^( LITERAL NULL )
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
    // $ANTLR end "otherLiteral"

    public static class testPackage_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testPackage"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:249:1: testPackage : 'Package' PACKAGE_ID -> ^( PACKAGE PACKAGE_ID ) ;
    public final LetaGrammarParser.testPackage_return testPackage() throws RecognitionException {
        LetaGrammarParser.testPackage_return retval = new LetaGrammarParser.testPackage_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal86=null;
        Token PACKAGE_ID87=null;

        Object string_literal86_tree=null;
        Object PACKAGE_ID87_tree=null;
        RewriteRuleTokenStream stream_PACKAGE_ID=new RewriteRuleTokenStream(adaptor,"token PACKAGE_ID");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:250:3: ( 'Package' PACKAGE_ID -> ^( PACKAGE PACKAGE_ID ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:250:5: 'Package' PACKAGE_ID
            {
            string_literal86=(Token)match(input,76,FOLLOW_76_in_testPackage1684); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_76.add(string_literal86);

            PACKAGE_ID87=(Token)match(input,PACKAGE_ID,FOLLOW_PACKAGE_ID_in_testPackage1686); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PACKAGE_ID.add(PACKAGE_ID87);



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
            // 251:5: -> ^( PACKAGE PACKAGE_ID )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:251:8: ^( PACKAGE PACKAGE_ID )
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

    // $ANTLR start synpred4_LetaGrammar
    public final void synpred4_LetaGrammar_fragment() throws RecognitionException {   
        LetaGrammarParser.fact_return f = null;


        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:98:6: (f= fact )
        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:98:6: f= fact
        {
        pushFollow(FOLLOW_fact_in_synpred4_LetaGrammar394);
        f=fact();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_LetaGrammar

    // $ANTLR start synpred17_LetaGrammar
    public final void synpred17_LetaGrammar_fragment() throws RecognitionException {   
        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:141:5: ( term ( notEqualOperator )? stringLiteral )
        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:141:5: term ( notEqualOperator )? stringLiteral
        {
        pushFollow(FOLLOW_term_in_synpred17_LetaGrammar836);
        term();

        state._fsp--;
        if (state.failed) return ;
        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:141:10: ( notEqualOperator )?
        int alt35=2;
        int LA35_0 = input.LA(1);

        if ( (LA35_0==73) ) {
            alt35=1;
        }
        switch (alt35) {
            case 1 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:0:0: notEqualOperator
                {
                pushFollow(FOLLOW_notEqualOperator_in_synpred17_LetaGrammar838);
                notEqualOperator();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_stringLiteral_in_synpred17_LetaGrammar841);
        stringLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred17_LetaGrammar

    // $ANTLR start synpred38_LetaGrammar
    public final void synpred38_LetaGrammar_fragment() throws RecognitionException {   
        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:223:6: ( stringLiteral )
        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:223:6: stringLiteral
        {
        pushFollow(FOLLOW_stringLiteral_in_synpred38_LetaGrammar1482);
        stringLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_LetaGrammar

    // Delegated rules

    public final boolean synpred4_LetaGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_LetaGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_LetaGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_LetaGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_LetaGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_LetaGrammar_fragment(); // can never throw exception
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
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA27 dfa27 = new DFA27(this);
    static final String DFA4_eotS =
        "\110\uffff";
    static final String DFA4_eofS =
        "\110\uffff";
    static final String DFA4_minS =
        "\1\43\4\uffff\1\43\1\uffff\1\44\2\43\4\44\5\43\1\44\1\uffff\10"+
        "\0\4\uffff\34\0\12\uffff\1\0";
    static final String DFA4_maxS =
        "\1\75\4\uffff\1\113\1\uffff\1\113\2\76\4\113\5\76\1\44\1\uffff"+
        "\10\0\4\uffff\34\0\12\uffff\1\0";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\22\uffff\1\2\63\uffff";
    static final String DFA4_specialS =
        "\25\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\4\uffff\1\10\1\11\1\12"+
        "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
        "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\12"+
        "\uffff\1\44}>";
    static final String[] DFA4_transitionS = {
            "\1\5\26\uffff\4\1",
            "",
            "",
            "",
            "",
            "\1\1\1\20\1\10\1\16\1\17\1\21\1\22\17\uffff\1\23\4\uffff\1"+
            "\24\6\uffff\1\12\1\13\1\14\1\15\1\7\1\uffff\1\11",
            "",
            "\1\31\1\25\1\27\1\30\1\32\1\33\17\uffff\1\34\21\uffff\1\26",
            "\1\1\32\uffff\1\24",
            "\1\1\32\uffff\1\24",
            "\1\43\1\uffff\1\41\1\42\1\44\1\45\17\uffff\1\47\21\uffff\1"+
            "\46",
            "\1\52\1\uffff\1\50\1\51\1\53\1\54\17\uffff\1\56\21\uffff\1"+
            "\55",
            "\1\61\1\uffff\1\57\1\60\1\62\1\63\17\uffff\1\65\21\uffff\1"+
            "\64",
            "\1\70\1\uffff\1\66\1\67\1\71\1\72\17\uffff\1\74\21\uffff\1"+
            "\73",
            "\1\1\32\uffff\1\24",
            "\1\1\32\uffff\1\24",
            "\1\1\32\uffff\1\24",
            "\1\1\32\uffff\1\24",
            "\1\1\32\uffff\1\24",
            "\1\107",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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
            "\1\uffff"
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
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_21 = input.LA(1);

                         
                        int index4_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_21);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA4_22 = input.LA(1);

                         
                        int index4_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_22);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA4_23 = input.LA(1);

                         
                        int index4_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_23);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA4_24 = input.LA(1);

                         
                        int index4_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_24);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA4_25 = input.LA(1);

                         
                        int index4_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_25);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA4_26 = input.LA(1);

                         
                        int index4_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_26);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA4_27 = input.LA(1);

                         
                        int index4_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_27);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA4_28 = input.LA(1);

                         
                        int index4_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_28);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA4_33 = input.LA(1);

                         
                        int index4_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_33);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA4_34 = input.LA(1);

                         
                        int index4_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_34);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA4_35 = input.LA(1);

                         
                        int index4_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_35);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA4_36 = input.LA(1);

                         
                        int index4_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_36);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA4_37 = input.LA(1);

                         
                        int index4_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_37);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA4_38 = input.LA(1);

                         
                        int index4_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_38);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA4_39 = input.LA(1);

                         
                        int index4_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_39);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA4_40 = input.LA(1);

                         
                        int index4_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_40);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA4_41 = input.LA(1);

                         
                        int index4_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_41);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA4_42 = input.LA(1);

                         
                        int index4_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_42);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA4_43 = input.LA(1);

                         
                        int index4_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_43);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA4_44 = input.LA(1);

                         
                        int index4_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_44);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA4_45 = input.LA(1);

                         
                        int index4_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_45);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA4_46 = input.LA(1);

                         
                        int index4_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_46);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA4_47 = input.LA(1);

                         
                        int index4_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_47);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA4_48 = input.LA(1);

                         
                        int index4_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_48);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA4_49 = input.LA(1);

                         
                        int index4_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_49);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA4_50 = input.LA(1);

                         
                        int index4_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_50);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA4_51 = input.LA(1);

                         
                        int index4_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_51);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA4_52 = input.LA(1);

                         
                        int index4_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_52);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA4_53 = input.LA(1);

                         
                        int index4_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_53);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA4_54 = input.LA(1);

                         
                        int index4_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_54);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA4_55 = input.LA(1);

                         
                        int index4_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_55);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA4_56 = input.LA(1);

                         
                        int index4_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_56);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA4_57 = input.LA(1);

                         
                        int index4_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_57);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA4_58 = input.LA(1);

                         
                        int index4_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_58);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA4_59 = input.LA(1);

                         
                        int index4_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_59);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA4_60 = input.LA(1);

                         
                        int index4_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_60);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA4_71 = input.LA(1);

                         
                        int index4_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index4_71);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA10_eotS =
        "\15\uffff";
    static final String DFA10_eofS =
        "\1\6\14\uffff";
    static final String DFA10_minS =
        "\1\43\14\uffff";
    static final String DFA10_maxS =
        "\1\75\14\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\6\uffff";
    static final String DFA10_specialS =
        "\15\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\13\uffff\1\6\1\uffff\2\6\3\uffff\3\6\1\uffff\4\1",
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
        "\1\75\14\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\6\uffff";
    static final String DFA12_specialS =
        "\15\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\13\uffff\1\6\1\uffff\2\6\3\uffff\3\6\1\uffff\4\1",
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
        "\73\uffff";
    static final String DFA14_eofS =
        "\1\uffff\1\2\71\uffff";
    static final String DFA14_minS =
        "\2\43\10\uffff\1\44\2\uffff\4\44\52\uffff";
    static final String DFA14_maxS =
        "\1\43\1\113\10\uffff\1\113\2\uffff\4\113\52\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\1\10\uffff\1\2\12\uffff\1\3\44\uffff";
    static final String DFA14_specialS =
        "\73\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1",
            "\1\2\6\13\5\uffff\1\2\1\uffff\2\2\3\uffff\3\2\1\26\13\uffff"+
            "\1\15\1\16\1\17\1\20\1\12\1\uffff\1\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\6\13\17\uffff\1\26\21\uffff\1\13",
            "",
            "",
            "\1\13\1\uffff\4\13\17\uffff\1\26\21\uffff\1\13",
            "\1\13\1\uffff\4\13\17\uffff\1\26\21\uffff\1\13",
            "\1\13\1\uffff\4\13\17\uffff\1\26\21\uffff\1\13",
            "\1\13\1\uffff\4\13\17\uffff\1\26\21\uffff\1\13",
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
    static final String DFA17_eotS =
        "\44\uffff";
    static final String DFA17_eofS =
        "\44\uffff";
    static final String DFA17_minS =
        "\1\43\2\44\1\uffff\1\0\12\uffff\1\0\24\uffff";
    static final String DFA17_maxS =
        "\1\43\2\113\1\uffff\1\0\12\uffff\1\0\24\uffff";
    static final String DFA17_acceptS =
        "\3\uffff\1\1\1\uffff\1\2\36\uffff";
    static final String DFA17_specialS =
        "\4\uffff\1\0\12\uffff\1\1\24\uffff}>";
    static final String[] DFA17_transitionS = {
            "\1\1",
            "\1\5\1\3\4\5\33\uffff\4\5\1\2\1\uffff\1\4",
            "\1\5\1\3\4\5\41\uffff\1\17",
            "",
            "\1\uffff",
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
            "\1\uffff",
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
            return "140:1: termInstance : ( term ( notEqualOperator )? stringLiteral -> ^( TERMINSTANCE term ( notEqualOperator )? stringLiteral ) | term ( relationalOperator )? otherLiteral -> ^( TERMINSTANCE term ( relationalOperator )? otherLiteral ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_4 = input.LA(1);

                         
                        int index17_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_LetaGrammar()) ) {s = 3;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index17_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_15 = input.LA(1);

                         
                        int index17_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_LetaGrammar()) ) {s = 3;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index17_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA16_eotS =
        "\14\uffff";
    static final String DFA16_eofS =
        "\14\uffff";
    static final String DFA16_minS =
        "\1\44\13\uffff";
    static final String DFA16_maxS =
        "\1\113\13\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\5\uffff";
    static final String DFA16_specialS =
        "\14\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\6\1\uffff\4\6\33\uffff\5\1\1\uffff\1\6",
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

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "143:10: ( relationalOperator )?";
        }
    }
    static final String DFA20_eotS =
        "\16\uffff";
    static final String DFA20_eofS =
        "\1\7\15\uffff";
    static final String DFA20_minS =
        "\1\57\15\uffff";
    static final String DFA20_maxS =
        "\1\104\15\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\5\uffff\1\2\6\uffff";
    static final String DFA20_specialS =
        "\16\uffff}>";
    static final String[] DFA20_transitionS = {
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

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "174:17: ( mathOperator formulaExpression )?";
        }
    }
    static final String DFA21_eotS =
        "\16\uffff";
    static final String DFA21_eofS =
        "\1\7\15\uffff";
    static final String DFA21_minS =
        "\1\57\15\uffff";
    static final String DFA21_maxS =
        "\1\104\15\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\5\uffff\1\2\6\uffff";
    static final String DFA21_specialS =
        "\16\uffff}>";
    static final String[] DFA21_transitionS = {
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
            return "176:31: ( mathOperator formulaExpression )?";
        }
    }
    static final String DFA23_eotS =
        "\101\uffff";
    static final String DFA23_eofS =
        "\1\uffff\1\2\77\uffff";
    static final String DFA23_minS =
        "\1\43\1\44\16\uffff\1\44\2\uffff\4\44\52\uffff";
    static final String DFA23_maxS =
        "\1\43\1\113\16\uffff\1\113\2\uffff\4\113\52\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\1\16\uffff\1\2\12\uffff\1\3\44\uffff";
    static final String DFA23_specialS =
        "\101\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1",
            "\6\21\5\uffff\1\2\1\uffff\2\2\3\uffff\3\2\1\34\4\uffff\7\2"+
            "\1\23\1\24\1\25\1\26\1\20\1\uffff\1\21",
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
            "\6\21\17\uffff\1\34\21\uffff\1\21",
            "",
            "",
            "\1\21\1\uffff\4\21\17\uffff\1\34\21\uffff\1\21",
            "\1\21\1\uffff\4\21\17\uffff\1\34\21\uffff\1\21",
            "\1\21\1\uffff\4\21\17\uffff\1\34\21\uffff\1\21",
            "\1\21\1\uffff\4\21\17\uffff\1\34\21\uffff\1\21",
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

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "181:5: ( term | termInstance | termWithAssociation )";
        }
    }
    static final String DFA27_eotS =
        "\13\uffff";
    static final String DFA27_eofS =
        "\13\uffff";
    static final String DFA27_minS =
        "\1\44\1\uffff\1\0\10\uffff";
    static final String DFA27_maxS =
        "\1\113\1\uffff\1\0\10\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\7\uffff";
    static final String DFA27_specialS =
        "\2\uffff\1\0\10\uffff}>";
    static final String[] DFA27_transitionS = {
            "\1\3\1\1\4\3\41\uffff\1\2",
            "",
            "\1\uffff",
            "",
            "",
            "",
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
            return "223:5: ( stringLiteral | otherLiteral )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_2 = input.LA(1);

                         
                        int index27_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index27_2);
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
 

    public static final BitSet FOLLOW_testPackage_in_leta231 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_testCase_in_leta234 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_testCase265 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_ID_in_testCase267 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_verifyClause_in_testCase269 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_whenClause_in_testCase271 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_setClause_in_testCase273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_verifyClause306 = new BitSet(new long[]{0x3C20000800000000L});
    public static final BitSet FOLLOW_factComposite_in_verifyClause308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_whenClause333 = new BitSet(new long[]{0x3C20000800000000L});
    public static final BitSet FOLLOW_factComposite_in_whenClause335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_setClause360 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_setClause362 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_set_in_setClause364 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_setClause366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fact_in_factComposite394 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_formula_in_factComposite400 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_logicalOperator_in_factComposite406 = new BitSet(new long[]{0x3C20000800000000L});
    public static final BitSet FOLLOW_factComposite_in_factComposite410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_factComposite518 = new BitSet(new long[]{0x3C20000800000000L});
    public static final BitSet FOLLOW_factComposite_in_factComposite522 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_factComposite524 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_logicalOperator_in_factComposite529 = new BitSet(new long[]{0x3C20000800000000L});
    public static final BitSet FOLLOW_factComposite_in_factComposite533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_logicalOperator601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_logicalOperator613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termComposite_in_fact634 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_complement_in_fact638 = new BitSet(new long[]{0x3C00000800000002L});
    public static final BitSet FOLLOW_termComposite_in_fact643 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_factExt_in_fact647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_complement_in_factExt689 = new BitSet(new long[]{0x3C00000800000002L});
    public static final BitSet FOLLOW_termComposite_in_factExt692 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_factExt_in_factExt694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quantifier_in_termComposite730 = new BitSet(new long[]{0x3C00000800000000L});
    public static final BitSet FOLLOW_term_in_termComposite736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termInstance_in_termComposite742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termWithAssociation_in_termComposite748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_termInstance836 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000A00L});
    public static final BitSet FOLLOW_notEqualOperator_in_termInstance838 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000A00L});
    public static final BitSet FOLLOW_stringLiteral_in_termInstance841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_termInstance864 = new BitSet(new long[]{0x000003D000000000L,0x0000000000000BE0L});
    public static final BitSet FOLLOW_relationalOperator_in_termInstance866 = new BitSet(new long[]{0x000003D000000000L,0x0000000000000BE0L});
    public static final BitSet FOLLOW_otherLiteral_in_termInstance869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_termWithAssociation899 = new BitSet(new long[]{0x0200000000000000L,0x00000000000003E0L});
    public static final BitSet FOLLOW_relationalOperator_in_termWithAssociation901 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_termWithAssociation904 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_termWithAssociation906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_quantifier938 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_quantifier960 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_quantifier982 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_quantifier1004 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier1008 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier1012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_complement1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formulaItem_in_formula1068 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_formula1070 = new BitSet(new long[]{0x3C20000800000000L});
    public static final BitSet FOLLOW_formulaExpression_in_formula1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formulaItem_in_formulaExpression1099 = new BitSet(new long[]{0x8000000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_mathOperator_in_formulaExpression1102 = new BitSet(new long[]{0x3C20000800000000L});
    public static final BitSet FOLLOW_formulaExpression_in_formulaExpression1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_formulaExpression1131 = new BitSet(new long[]{0x3C20000800000000L});
    public static final BitSet FOLLOW_formulaExpression_in_formulaExpression1133 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_formulaExpression1135 = new BitSet(new long[]{0x8000000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_mathOperator_in_formulaExpression1138 = new BitSet(new long[]{0x3C20000800000000L});
    public static final BitSet FOLLOW_formulaExpression_in_formulaExpression1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_formulaItem1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termInstance_in_formulaItem1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termWithAssociation_in_formulaItem1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_mathOperator1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_mathOperator1235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_mathOperator1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_mathOperator1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_mathOperator1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_mathOperator1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_relationalOperator1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_relationalOperator1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_relationalOperator1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_relationalOperator1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notEqualOperator_in_relationalOperator1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_notEqualOperator1417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_set1442 = new BitSet(new long[]{0x000003F000000000L,0x0000000000000BE0L});
    public static final BitSet FOLLOW_list_in_set1444 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_set1446 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_set1449 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_set_in_set1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_list1482 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_otherLiteral_in_list1486 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_list1490 = new BitSet(new long[]{0x000003F000000000L,0x0000000000000BE0L});
    public static final BitSet FOLLOW_list_in_list1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_stringLiteral1526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_stringLiteral1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_otherLiteral1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_FLOAT_in_otherLiteral1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_otherLiteral1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_INT_in_otherLiteral1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_TIME_in_otherLiteral1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_otherLiteral1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_testPackage1684 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_PACKAGE_ID_in_testPackage1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fact_in_synpred4_LetaGrammar394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_synpred17_LetaGrammar836 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000A00L});
    public static final BitSet FOLLOW_notEqualOperator_in_synpred17_LetaGrammar838 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000A00L});
    public static final BitSet FOLLOW_stringLiteral_in_synpred17_LetaGrammar841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_synpred38_LetaGrammar1482 = new BitSet(new long[]{0x0000000000000002L});

}