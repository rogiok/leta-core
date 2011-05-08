// $ANTLR 3.3 Nov 30, 2010 12:46:29 /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g 2011-05-08 10:55:23

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
    public String getGrammarFileName() { return "/Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g"; }


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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:72:1: leta : ( testPackage )? ( testCase )+ -> ^( LETA ( testPackage )? ( testCase )+ ) ;
    public final LetaGrammarParser.leta_return leta() throws RecognitionException {
        LetaGrammarParser.leta_return retval = new LetaGrammarParser.leta_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LetaGrammarParser.testPackage_return testPackage1 = null;

        LetaGrammarParser.testCase_return testCase2 = null;


        RewriteRuleSubtreeStream stream_testCase=new RewriteRuleSubtreeStream(adaptor,"rule testCase");
        RewriteRuleSubtreeStream stream_testPackage=new RewriteRuleSubtreeStream(adaptor,"rule testPackage");
        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:73:3: ( ( testPackage )? ( testCase )+ -> ^( LETA ( testPackage )? ( testCase )+ ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:73:5: ( testPackage )? ( testCase )+
            {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:73:5: ( testPackage )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==76) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:0:0: testPackage
                    {
                    pushFollow(FOLLOW_testPackage_in_leta231);
                    testPackage1=testPackage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_testPackage.add(testPackage1.getTree());

                    }
                    break;

            }

            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:73:18: ( testCase )+
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
            	    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:0:0: testCase
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
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:74:8: ^( LETA ( testPackage )? ( testCase )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LETA, "LETA"), root_1);

                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:74:15: ( testPackage )?
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:77:1: testCase : 'Test' ID verifyClause whenClause ( setClause )? -> ^( TESTCASE ID ( setClause )? verifyClause whenClause ) ;
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
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:78:3: ( 'Test' ID verifyClause whenClause ( setClause )? -> ^( TESTCASE ID ( setClause )? verifyClause whenClause ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:78:5: 'Test' ID verifyClause whenClause ( setClause )?
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
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:78:39: ( setClause )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==50) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:0:0: setClause
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
            // elements: setClause, ID, whenClause, verifyClause
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
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:79:8: ^( TESTCASE ID ( setClause )? verifyClause whenClause )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TESTCASE, "TESTCASE"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:79:22: ( setClause )?
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:82:1: verifyClause : 'Verify' factComposite -> ^( VERIFY factComposite ) ;
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
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:83:3: ( 'Verify' factComposite -> ^( VERIFY factComposite ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:83:5: 'Verify' factComposite
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
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:84:8: ^( VERIFY factComposite )
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:87:1: whenClause : 'When' factComposite -> ^( WHEN factComposite ) ;
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
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:88:3: ( 'When' factComposite -> ^( WHEN factComposite ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:88:5: 'When' factComposite
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
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:89:8: ^( WHEN factComposite )
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:92:1: setClause : 'Set' '{' (s= set )? '}' -> {s != null}? ^( SET $s) ->;
    public final LetaGrammarParser.setClause_return setClause() throws RecognitionException {
        LetaGrammarParser.setClause_return retval = new LetaGrammarParser.setClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal12=null;
        Token char_literal13=null;
        Token char_literal14=null;
        LetaGrammarParser.set_return s = null;


        Object string_literal12_tree=null;
        Object char_literal13_tree=null;
        Object char_literal14_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_set=new RewriteRuleSubtreeStream(adaptor,"rule set");
        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:93:3: ( 'Set' '{' (s= set )? '}' -> {s != null}? ^( SET $s) ->)
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:93:5: 'Set' '{' (s= set )? '}'
            {
            string_literal12=(Token)match(input,50,FOLLOW_50_in_setClause360); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_50.add(string_literal12);

            char_literal13=(Token)match(input,51,FOLLOW_51_in_setClause362); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal13);

            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:93:15: (s= set )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==51) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:93:16: s= set
                    {
                    pushFollow(FOLLOW_set_in_setClause367);
                    s=set();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_set.add(s.getTree());

                    }
                    break;

            }

            char_literal14=(Token)match(input,52,FOLLOW_52_in_setClause371); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_52.add(char_literal14);



            // AST REWRITE
            // elements: s
            // token labels: 
            // rule labels: retval, s
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.tree:null);

            root_0 = (Object)adaptor.nil();
            // 94:5: -> {s != null}? ^( SET $s)
            if (s != null) {
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:94:21: ^( SET $s)
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SET, "SET"), root_1);

                adaptor.addChild(root_1, stream_s.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 95:5: ->
            {
                root_0 = null;
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:98:1: factComposite : ( (f= fact | fo= formula ) (op= logicalOperator fc= factComposite )? -> {op != null && op.value.equals(\"And\") && f != null}? ^( 'And' $f $fc) -> {op != null && op.value.equals(\"Or\") && f != null}? ^( 'Or' $f $fc) -> {op != null && op.value.equals(\"And\") && fo != null}? ^( 'And' $fo $fc) -> {op != null && op.value.equals(\"Or\") && fo != null}? ^( 'Or' $fo $fc) -> {f != null}? ^( FACTCOMPOSITE $f) -> ^( FACTCOMPOSITE $fo) | '(' fc1= factComposite ')' (op= logicalOperator fc2= factComposite )? -> {op != null && op.value.equals(\"And\")}? ^( 'And' $fc1 $fc2) -> {op != null && op.value.equals(\"Or\")}? ^( 'Or' $fc1 $fc2) -> ^( FACTCOMPOSITE $fc1) );
    public final LetaGrammarParser.factComposite_return factComposite() throws RecognitionException {
        LetaGrammarParser.factComposite_return retval = new LetaGrammarParser.factComposite_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal15=null;
        Token char_literal16=null;
        LetaGrammarParser.fact_return f = null;

        LetaGrammarParser.formula_return fo = null;

        LetaGrammarParser.logicalOperator_return op = null;

        LetaGrammarParser.factComposite_return fc = null;

        LetaGrammarParser.factComposite_return fc1 = null;

        LetaGrammarParser.factComposite_return fc2 = null;


        Object char_literal15_tree=null;
        Object char_literal16_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_logicalOperator=new RewriteRuleSubtreeStream(adaptor,"rule logicalOperator");
        RewriteRuleSubtreeStream stream_fact=new RewriteRuleSubtreeStream(adaptor,"rule fact");
        RewriteRuleSubtreeStream stream_factComposite=new RewriteRuleSubtreeStream(adaptor,"rule factComposite");
        RewriteRuleSubtreeStream stream_formula=new RewriteRuleSubtreeStream(adaptor,"rule formula");
        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:99:3: ( (f= fact | fo= formula ) (op= logicalOperator fc= factComposite )? -> {op != null && op.value.equals(\"And\") && f != null}? ^( 'And' $f $fc) -> {op != null && op.value.equals(\"Or\") && f != null}? ^( 'Or' $f $fc) -> {op != null && op.value.equals(\"And\") && fo != null}? ^( 'And' $fo $fc) -> {op != null && op.value.equals(\"Or\") && fo != null}? ^( 'Or' $fo $fc) -> {f != null}? ^( FACTCOMPOSITE $f) -> ^( FACTCOMPOSITE $fo) | '(' fc1= factComposite ')' (op= logicalOperator fc2= factComposite )? -> {op != null && op.value.equals(\"And\")}? ^( 'And' $fc1 $fc2) -> {op != null && op.value.equals(\"Or\")}? ^( 'Or' $fc1 $fc2) -> ^( FACTCOMPOSITE $fc1) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID||(LA8_0>=58 && LA8_0<=61)) ) {
                alt8=1;
            }
            else if ( (LA8_0==53) ) {
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
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:99:5: (f= fact | fo= formula ) (op= logicalOperator fc= factComposite )?
                    {
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:99:5: (f= fact | fo= formula )
                    int alt5=2;
                    alt5 = dfa5.predict(input);
                    switch (alt5) {
                        case 1 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:99:6: f= fact
                            {
                            pushFollow(FOLLOW_fact_in_factComposite409);
                            f=fact();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fact.add(f.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:99:15: fo= formula
                            {
                            pushFollow(FOLLOW_formula_in_factComposite415);
                            fo=formula();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formula.add(fo.getTree());

                            }
                            break;

                    }

                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:99:27: (op= logicalOperator fc= factComposite )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=55 && LA6_0<=56)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:99:28: op= logicalOperator fc= factComposite
                            {
                            pushFollow(FOLLOW_logicalOperator_in_factComposite421);
                            op=logicalOperator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_logicalOperator.add(op.getTree());
                            pushFollow(FOLLOW_factComposite_in_factComposite425);
                            fc=factComposite();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_factComposite.add(fc.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 56, f, 55, fc, fc, fc, 56, fo, f, fc, f, fo, 55, fo
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
                    // 100:5: -> {op != null && op.value.equals(\"And\") && f != null}? ^( 'And' $f $fc)
                    if (op != null && op.value.equals("And") && f != null) {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:100:61: ^( 'And' $f $fc)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(55, "55"), root_1);

                        adaptor.addChild(root_1, stream_f.nextTree());
                        adaptor.addChild(root_1, stream_fc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 101:5: -> {op != null && op.value.equals(\"Or\") && f != null}? ^( 'Or' $f $fc)
                    if (op != null && op.value.equals("Or") && f != null) {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:101:60: ^( 'Or' $f $fc)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(56, "56"), root_1);

                        adaptor.addChild(root_1, stream_f.nextTree());
                        adaptor.addChild(root_1, stream_fc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 102:5: -> {op != null && op.value.equals(\"And\") && fo != null}? ^( 'And' $fo $fc)
                    if (op != null && op.value.equals("And") && fo != null) {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:102:62: ^( 'And' $fo $fc)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(55, "55"), root_1);

                        adaptor.addChild(root_1, stream_fo.nextTree());
                        adaptor.addChild(root_1, stream_fc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 103:5: -> {op != null && op.value.equals(\"Or\") && fo != null}? ^( 'Or' $fo $fc)
                    if (op != null && op.value.equals("Or") && fo != null) {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:103:61: ^( 'Or' $fo $fc)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(56, "56"), root_1);

                        adaptor.addChild(root_1, stream_fo.nextTree());
                        adaptor.addChild(root_1, stream_fc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 104:5: -> {f != null}? ^( FACTCOMPOSITE $f)
                    if (f != null) {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:104:21: ^( FACTCOMPOSITE $f)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FACTCOMPOSITE, "FACTCOMPOSITE"), root_1);

                        adaptor.addChild(root_1, stream_f.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 105:5: -> ^( FACTCOMPOSITE $fo)
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:105:8: ^( FACTCOMPOSITE $fo)
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
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:106:5: '(' fc1= factComposite ')' (op= logicalOperator fc2= factComposite )?
                    {
                    char_literal15=(Token)match(input,53,FOLLOW_53_in_factComposite533); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal15);

                    pushFollow(FOLLOW_factComposite_in_factComposite537);
                    fc1=factComposite();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_factComposite.add(fc1.getTree());
                    char_literal16=(Token)match(input,54,FOLLOW_54_in_factComposite539); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal16);

                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:106:31: (op= logicalOperator fc2= factComposite )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( ((LA7_0>=55 && LA7_0<=56)) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:106:32: op= logicalOperator fc2= factComposite
                            {
                            pushFollow(FOLLOW_logicalOperator_in_factComposite544);
                            op=logicalOperator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_logicalOperator.add(op.getTree());
                            pushFollow(FOLLOW_factComposite_in_factComposite548);
                            fc2=factComposite();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_factComposite.add(fc2.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: fc1, 55, fc1, fc2, fc1, fc2, 56
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
                    // 107:5: -> {op != null && op.value.equals(\"And\")}? ^( 'And' $fc1 $fc2)
                    if (op != null && op.value.equals("And")) {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:107:48: ^( 'And' $fc1 $fc2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(55, "55"), root_1);

                        adaptor.addChild(root_1, stream_fc1.nextTree());
                        adaptor.addChild(root_1, stream_fc2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 108:5: -> {op != null && op.value.equals(\"Or\")}? ^( 'Or' $fc1 $fc2)
                    if (op != null && op.value.equals("Or")) {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:108:47: ^( 'Or' $fc1 $fc2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(56, "56"), root_1);

                        adaptor.addChild(root_1, stream_fc1.nextTree());
                        adaptor.addChild(root_1, stream_fc2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 109:5: -> ^( FACTCOMPOSITE $fc1)
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:109:8: ^( FACTCOMPOSITE $fc1)
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:112:1: logicalOperator returns [String value] : ( 'And' | 'Or' );
    public final LetaGrammarParser.logicalOperator_return logicalOperator() throws RecognitionException {
        LetaGrammarParser.logicalOperator_return retval = new LetaGrammarParser.logicalOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal17=null;
        Token string_literal18=null;

        Object string_literal17_tree=null;
        Object string_literal18_tree=null;

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:113:3: ( 'And' | 'Or' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==55) ) {
                alt9=1;
            }
            else if ( (LA9_0==56) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:113:5: 'And'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal17=(Token)match(input,55,FOLLOW_55_in_logicalOperator616); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal17_tree = (Object)adaptor.create(string_literal17);
                    adaptor.addChild(root_0, string_literal17_tree);
                    }
                    if ( state.backtracking==0 ) {
                       retval.value = "And"; 
                    }

                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:115:5: 'Or'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal18=(Token)match(input,56,FOLLOW_56_in_logicalOperator628); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    string_literal18_tree = (Object)adaptor.create(string_literal18);
                    adaptor.addChild(root_0, string_literal18_tree);
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:119:1: fact : tc= termComposite c= complement (tc2= termComposite (fe= factExt )? )? -> ^( FACT $tc $c ( $tc2 ( $fe)? )? ) ;
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
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:120:3: (tc= termComposite c= complement (tc2= termComposite (fe= factExt )? )? -> ^( FACT $tc $c ( $tc2 ( $fe)? )? ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:120:5: tc= termComposite c= complement (tc2= termComposite (fe= factExt )? )?
            {
            pushFollow(FOLLOW_termComposite_in_fact649);
            tc=termComposite();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_termComposite.add(tc.getTree());
            pushFollow(FOLLOW_complement_in_fact653);
            c=complement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_complement.add(c.getTree());
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:120:35: (tc2= termComposite (fe= factExt )? )?
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:120:36: tc2= termComposite (fe= factExt )?
                    {
                    pushFollow(FOLLOW_termComposite_in_fact658);
                    tc2=termComposite();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_termComposite.add(tc2.getTree());
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:120:56: (fe= factExt )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==ID) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:0:0: fe= factExt
                            {
                            pushFollow(FOLLOW_factExt_in_fact662);
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
            // elements: c, tc, tc2, fe
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
            // 121:5: -> ^( FACT $tc $c ( $tc2 ( $fe)? )? )
            {
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:121:8: ^( FACT $tc $c ( $tc2 ( $fe)? )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FACT, "FACT"), root_1);

                adaptor.addChild(root_1, stream_tc.nextTree());
                adaptor.addChild(root_1, stream_c.nextTree());
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:121:22: ( $tc2 ( $fe)? )?
                if ( stream_tc2.hasNext()||stream_fe.hasNext() ) {
                    adaptor.addChild(root_1, stream_tc2.nextTree());
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:121:28: ( $fe)?
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:124:1: factExt : complement ( termComposite ( factExt )? )? -> ^( FACTEXT complement ( termComposite ( factExt )? )? ) ;
    public final LetaGrammarParser.factExt_return factExt() throws RecognitionException {
        LetaGrammarParser.factExt_return retval = new LetaGrammarParser.factExt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LetaGrammarParser.complement_return complement19 = null;

        LetaGrammarParser.termComposite_return termComposite20 = null;

        LetaGrammarParser.factExt_return factExt21 = null;


        RewriteRuleSubtreeStream stream_complement=new RewriteRuleSubtreeStream(adaptor,"rule complement");
        RewriteRuleSubtreeStream stream_factExt=new RewriteRuleSubtreeStream(adaptor,"rule factExt");
        RewriteRuleSubtreeStream stream_termComposite=new RewriteRuleSubtreeStream(adaptor,"rule termComposite");
        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:125:3: ( complement ( termComposite ( factExt )? )? -> ^( FACTEXT complement ( termComposite ( factExt )? )? ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:125:5: complement ( termComposite ( factExt )? )?
            {
            pushFollow(FOLLOW_complement_in_factExt704);
            complement19=complement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_complement.add(complement19.getTree());
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:125:16: ( termComposite ( factExt )? )?
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:125:17: termComposite ( factExt )?
                    {
                    pushFollow(FOLLOW_termComposite_in_factExt707);
                    termComposite20=termComposite();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_termComposite.add(termComposite20.getTree());
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:125:31: ( factExt )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==ID) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:0:0: factExt
                            {
                            pushFollow(FOLLOW_factExt_in_factExt709);
                            factExt21=factExt();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_factExt.add(factExt21.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: termComposite, complement, factExt
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 126:5: -> ^( FACTEXT complement ( termComposite ( factExt )? )? )
            {
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:126:8: ^( FACTEXT complement ( termComposite ( factExt )? )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FACTEXT, "FACTEXT"), root_1);

                adaptor.addChild(root_1, stream_complement.nextTree());
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:126:29: ( termComposite ( factExt )? )?
                if ( stream_termComposite.hasNext()||stream_factExt.hasNext() ) {
                    adaptor.addChild(root_1, stream_termComposite.nextTree());
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:126:44: ( factExt )?
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:129:1: termComposite : ( quantifier )? (t= term | ti= termInstance | twa= termWithAssociation ) -> {t != null}? ^( TERMCOMPOSITE ( quantifier )? term ) -> {ti != null}? ^( TERMCOMPOSITE ( quantifier )? termInstance ) -> ^( TERMCOMPOSITE ( quantifier )? termWithAssociation ) ;
    public final LetaGrammarParser.termComposite_return termComposite() throws RecognitionException {
        LetaGrammarParser.termComposite_return retval = new LetaGrammarParser.termComposite_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LetaGrammarParser.term_return t = null;

        LetaGrammarParser.termInstance_return ti = null;

        LetaGrammarParser.termWithAssociation_return twa = null;

        LetaGrammarParser.quantifier_return quantifier22 = null;


        RewriteRuleSubtreeStream stream_quantifier=new RewriteRuleSubtreeStream(adaptor,"rule quantifier");
        RewriteRuleSubtreeStream stream_termWithAssociation=new RewriteRuleSubtreeStream(adaptor,"rule termWithAssociation");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_termInstance=new RewriteRuleSubtreeStream(adaptor,"rule termInstance");
        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:130:3: ( ( quantifier )? (t= term | ti= termInstance | twa= termWithAssociation ) -> {t != null}? ^( TERMCOMPOSITE ( quantifier )? term ) -> {ti != null}? ^( TERMCOMPOSITE ( quantifier )? termInstance ) -> ^( TERMCOMPOSITE ( quantifier )? termWithAssociation ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:130:5: ( quantifier )? (t= term | ti= termInstance | twa= termWithAssociation )
            {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:130:5: ( quantifier )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=58 && LA14_0<=61)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:0:0: quantifier
                    {
                    pushFollow(FOLLOW_quantifier_in_termComposite745);
                    quantifier22=quantifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_quantifier.add(quantifier22.getTree());

                    }
                    break;

            }

            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:130:17: (t= term | ti= termInstance | twa= termWithAssociation )
            int alt15=3;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:130:18: t= term
                    {
                    pushFollow(FOLLOW_term_in_termComposite751);
                    t=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_term.add(t.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:130:27: ti= termInstance
                    {
                    pushFollow(FOLLOW_termInstance_in_termComposite757);
                    ti=termInstance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_termInstance.add(ti.getTree());

                    }
                    break;
                case 3 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:130:45: twa= termWithAssociation
                    {
                    pushFollow(FOLLOW_termWithAssociation_in_termComposite763);
                    twa=termWithAssociation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_termWithAssociation.add(twa.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: quantifier, quantifier, termInstance, term, quantifier, termWithAssociation
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 131:5: -> {t != null}? ^( TERMCOMPOSITE ( quantifier )? term )
            if (t != null) {
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:131:21: ^( TERMCOMPOSITE ( quantifier )? term )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERMCOMPOSITE, "TERMCOMPOSITE"), root_1);

                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:131:37: ( quantifier )?
                if ( stream_quantifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_quantifier.nextTree());

                }
                stream_quantifier.reset();
                adaptor.addChild(root_1, stream_term.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 132:5: -> {ti != null}? ^( TERMCOMPOSITE ( quantifier )? termInstance )
            if (ti != null) {
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:132:22: ^( TERMCOMPOSITE ( quantifier )? termInstance )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERMCOMPOSITE, "TERMCOMPOSITE"), root_1);

                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:132:38: ( quantifier )?
                if ( stream_quantifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_quantifier.nextTree());

                }
                stream_quantifier.reset();
                adaptor.addChild(root_1, stream_termInstance.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 133:5: -> ^( TERMCOMPOSITE ( quantifier )? termWithAssociation )
            {
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:133:8: ^( TERMCOMPOSITE ( quantifier )? termWithAssociation )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERMCOMPOSITE, "TERMCOMPOSITE"), root_1);

                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:133:24: ( quantifier )?
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:136:1: term : ID -> ^( TERM ID ) ;
    public final LetaGrammarParser.term_return term() throws RecognitionException {
        LetaGrammarParser.term_return retval = new LetaGrammarParser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID23=null;

        Object ID23_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:137:3: ( ID -> ^( TERM ID ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:137:5: ID
            {
            ID23=(Token)match(input,ID,FOLLOW_ID_in_term826); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID23);



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
            // 138:5: -> ^( TERM ID )
            {
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:138:8: ^( TERM ID )
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:141:1: termInstance : ( term ( notEqualOperator )? stringLiteral -> ^( TERMINSTANCE term ( notEqualOperator )? stringLiteral ) | term ( relationalOperator )? otherLiteral -> ^( TERMINSTANCE term ( relationalOperator )? otherLiteral ) );
    public final LetaGrammarParser.termInstance_return termInstance() throws RecognitionException {
        LetaGrammarParser.termInstance_return retval = new LetaGrammarParser.termInstance_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LetaGrammarParser.term_return term24 = null;

        LetaGrammarParser.notEqualOperator_return notEqualOperator25 = null;

        LetaGrammarParser.stringLiteral_return stringLiteral26 = null;

        LetaGrammarParser.term_return term27 = null;

        LetaGrammarParser.relationalOperator_return relationalOperator28 = null;

        LetaGrammarParser.otherLiteral_return otherLiteral29 = null;


        RewriteRuleSubtreeStream stream_otherLiteral=new RewriteRuleSubtreeStream(adaptor,"rule otherLiteral");
        RewriteRuleSubtreeStream stream_relationalOperator=new RewriteRuleSubtreeStream(adaptor,"rule relationalOperator");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_notEqualOperator=new RewriteRuleSubtreeStream(adaptor,"rule notEqualOperator");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:142:3: ( term ( notEqualOperator )? stringLiteral -> ^( TERMINSTANCE term ( notEqualOperator )? stringLiteral ) | term ( relationalOperator )? otherLiteral -> ^( TERMINSTANCE term ( relationalOperator )? otherLiteral ) )
            int alt18=2;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:142:5: term ( notEqualOperator )? stringLiteral
                    {
                    pushFollow(FOLLOW_term_in_termInstance851);
                    term24=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_term.add(term24.getTree());
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:142:10: ( notEqualOperator )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==73) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:0:0: notEqualOperator
                            {
                            pushFollow(FOLLOW_notEqualOperator_in_termInstance853);
                            notEqualOperator25=notEqualOperator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_notEqualOperator.add(notEqualOperator25.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_stringLiteral_in_termInstance856);
                    stringLiteral26=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringLiteral.add(stringLiteral26.getTree());


                    // AST REWRITE
                    // elements: stringLiteral, term, notEqualOperator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 143:5: -> ^( TERMINSTANCE term ( notEqualOperator )? stringLiteral )
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:143:8: ^( TERMINSTANCE term ( notEqualOperator )? stringLiteral )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERMINSTANCE, "TERMINSTANCE"), root_1);

                        adaptor.addChild(root_1, stream_term.nextTree());
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:143:28: ( notEqualOperator )?
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
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:144:5: term ( relationalOperator )? otherLiteral
                    {
                    pushFollow(FOLLOW_term_in_termInstance879);
                    term27=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_term.add(term27.getTree());
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:144:10: ( relationalOperator )?
                    int alt17=2;
                    alt17 = dfa17.predict(input);
                    switch (alt17) {
                        case 1 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:0:0: relationalOperator
                            {
                            pushFollow(FOLLOW_relationalOperator_in_termInstance881);
                            relationalOperator28=relationalOperator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_relationalOperator.add(relationalOperator28.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_otherLiteral_in_termInstance884);
                    otherLiteral29=otherLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_otherLiteral.add(otherLiteral29.getTree());


                    // AST REWRITE
                    // elements: relationalOperator, term, otherLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 145:5: -> ^( TERMINSTANCE term ( relationalOperator )? otherLiteral )
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:145:8: ^( TERMINSTANCE term ( relationalOperator )? otherLiteral )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERMINSTANCE, "TERMINSTANCE"), root_1);

                        adaptor.addChild(root_1, stream_term.nextTree());
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:145:28: ( relationalOperator )?
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:148:1: termWithAssociation : term ( relationalOperator )? '@' INT -> ^( TERMWITHASSOCIATION term ( relationalOperator )? INT ) ;
    public final LetaGrammarParser.termWithAssociation_return termWithAssociation() throws RecognitionException {
        LetaGrammarParser.termWithAssociation_return retval = new LetaGrammarParser.termWithAssociation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal32=null;
        Token INT33=null;
        LetaGrammarParser.term_return term30 = null;

        LetaGrammarParser.relationalOperator_return relationalOperator31 = null;


        Object char_literal32_tree=null;
        Object INT33_tree=null;
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_relationalOperator=new RewriteRuleSubtreeStream(adaptor,"rule relationalOperator");
        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:149:3: ( term ( relationalOperator )? '@' INT -> ^( TERMWITHASSOCIATION term ( relationalOperator )? INT ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:149:5: term ( relationalOperator )? '@' INT
            {
            pushFollow(FOLLOW_term_in_termWithAssociation914);
            term30=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_term.add(term30.getTree());
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:149:10: ( relationalOperator )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=69 && LA19_0<=73)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:0:0: relationalOperator
                    {
                    pushFollow(FOLLOW_relationalOperator_in_termWithAssociation916);
                    relationalOperator31=relationalOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relationalOperator.add(relationalOperator31.getTree());

                    }
                    break;

            }

            char_literal32=(Token)match(input,57,FOLLOW_57_in_termWithAssociation919); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_57.add(char_literal32);

            INT33=(Token)match(input,INT,FOLLOW_INT_in_termWithAssociation921); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INT.add(INT33);



            // AST REWRITE
            // elements: INT, term, relationalOperator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 150:5: -> ^( TERMWITHASSOCIATION term ( relationalOperator )? INT )
            {
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:150:8: ^( TERMWITHASSOCIATION term ( relationalOperator )? INT )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERMWITHASSOCIATION, "TERMWITHASSOCIATION"), root_1);

                adaptor.addChild(root_1, stream_term.nextTree());
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:150:35: ( relationalOperator )?
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:153:1: quantifier : ( 'atLeast' INT -> ^( QUANTIFIER 'atLeast' INT ) | 'atMost' INT -> ^( QUANTIFIER 'atMost' INT ) | 'exactly' INT -> ^( QUANTIFIER 'exactly' INT ) | 'atLeastAndAtMost' i1= INT i2= INT -> ^( QUANTIFIER 'atLeastAndAtMost' $i1 $i2) );
    public final LetaGrammarParser.quantifier_return quantifier() throws RecognitionException {
        LetaGrammarParser.quantifier_return retval = new LetaGrammarParser.quantifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token i1=null;
        Token i2=null;
        Token string_literal34=null;
        Token INT35=null;
        Token string_literal36=null;
        Token INT37=null;
        Token string_literal38=null;
        Token INT39=null;
        Token string_literal40=null;

        Object i1_tree=null;
        Object i2_tree=null;
        Object string_literal34_tree=null;
        Object INT35_tree=null;
        Object string_literal36_tree=null;
        Object INT37_tree=null;
        Object string_literal38_tree=null;
        Object INT39_tree=null;
        Object string_literal40_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:154:3: ( 'atLeast' INT -> ^( QUANTIFIER 'atLeast' INT ) | 'atMost' INT -> ^( QUANTIFIER 'atMost' INT ) | 'exactly' INT -> ^( QUANTIFIER 'exactly' INT ) | 'atLeastAndAtMost' i1= INT i2= INT -> ^( QUANTIFIER 'atLeastAndAtMost' $i1 $i2) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt20=1;
                }
                break;
            case 59:
                {
                alt20=2;
                }
                break;
            case 60:
                {
                alt20=3;
                }
                break;
            case 61:
                {
                alt20=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:154:5: 'atLeast' INT
                    {
                    string_literal34=(Token)match(input,58,FOLLOW_58_in_quantifier953); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_58.add(string_literal34);

                    INT35=(Token)match(input,INT,FOLLOW_INT_in_quantifier955); if (state.failed) return retval; 
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
                    // 155:5: -> ^( QUANTIFIER 'atLeast' INT )
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:155:8: ^( QUANTIFIER 'atLeast' INT )
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
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:156:5: 'atMost' INT
                    {
                    string_literal36=(Token)match(input,59,FOLLOW_59_in_quantifier975); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_59.add(string_literal36);

                    INT37=(Token)match(input,INT,FOLLOW_INT_in_quantifier977); if (state.failed) return retval; 
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
                    // 157:5: -> ^( QUANTIFIER 'atMost' INT )
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:157:8: ^( QUANTIFIER 'atMost' INT )
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
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:158:5: 'exactly' INT
                    {
                    string_literal38=(Token)match(input,60,FOLLOW_60_in_quantifier997); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_60.add(string_literal38);

                    INT39=(Token)match(input,INT,FOLLOW_INT_in_quantifier999); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(INT39);



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
                    // 159:5: -> ^( QUANTIFIER 'exactly' INT )
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:159:8: ^( QUANTIFIER 'exactly' INT )
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
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:160:5: 'atLeastAndAtMost' i1= INT i2= INT
                    {
                    string_literal40=(Token)match(input,61,FOLLOW_61_in_quantifier1019); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_61.add(string_literal40);

                    i1=(Token)match(input,INT,FOLLOW_INT_in_quantifier1023); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(i1);

                    i2=(Token)match(input,INT,FOLLOW_INT_in_quantifier1027); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(i2);



                    // AST REWRITE
                    // elements: i1, i2, 61
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
                    // 161:5: -> ^( QUANTIFIER 'atLeastAndAtMost' $i1 $i2)
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:161:8: ^( QUANTIFIER 'atLeastAndAtMost' $i1 $i2)
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:164:1: complement : ID -> ^( COMPLEMENT ID ) ;
    public final LetaGrammarParser.complement_return complement() throws RecognitionException {
        LetaGrammarParser.complement_return retval = new LetaGrammarParser.complement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID41=null;

        Object ID41_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:165:3: ( ID -> ^( COMPLEMENT ID ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:165:5: ID
            {
            ID41=(Token)match(input,ID,FOLLOW_ID_in_complement1058); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID41);



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
            // 166:5: -> ^( COMPLEMENT ID )
            {
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:166:8: ^( COMPLEMENT ID )
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:169:1: formula : formulaItem '=' formulaExpression -> ^( FORMULA formulaItem formulaExpression ) ;
    public final LetaGrammarParser.formula_return formula() throws RecognitionException {
        LetaGrammarParser.formula_return retval = new LetaGrammarParser.formula_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal43=null;
        LetaGrammarParser.formulaItem_return formulaItem42 = null;

        LetaGrammarParser.formulaExpression_return formulaExpression44 = null;


        Object char_literal43_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_formulaExpression=new RewriteRuleSubtreeStream(adaptor,"rule formulaExpression");
        RewriteRuleSubtreeStream stream_formulaItem=new RewriteRuleSubtreeStream(adaptor,"rule formulaItem");
        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:170:3: ( formulaItem '=' formulaExpression -> ^( FORMULA formulaItem formulaExpression ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:170:5: formulaItem '=' formulaExpression
            {
            pushFollow(FOLLOW_formulaItem_in_formula1083);
            formulaItem42=formulaItem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_formulaItem.add(formulaItem42.getTree());
            char_literal43=(Token)match(input,62,FOLLOW_62_in_formula1085); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_62.add(char_literal43);

            pushFollow(FOLLOW_formulaExpression_in_formula1087);
            formulaExpression44=formulaExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_formulaExpression.add(formulaExpression44.getTree());


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
            // 171:5: -> ^( FORMULA formulaItem formulaExpression )
            {
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:171:8: ^( FORMULA formulaItem formulaExpression )
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:174:1: formulaExpression : ( formulaItem ( mathOperator formulaExpression )? -> ^( FORMULAEXPRESSION formulaItem ( mathOperator formulaExpression )? ) | '(' formulaExpression ')' ( mathOperator formulaExpression )? -> ^( FORMULAEXPRESSION formulaExpression ( mathOperator formulaExpression )? ) );
    public final LetaGrammarParser.formulaExpression_return formulaExpression() throws RecognitionException {
        LetaGrammarParser.formulaExpression_return retval = new LetaGrammarParser.formulaExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal48=null;
        Token char_literal50=null;
        LetaGrammarParser.formulaItem_return formulaItem45 = null;

        LetaGrammarParser.mathOperator_return mathOperator46 = null;

        LetaGrammarParser.formulaExpression_return formulaExpression47 = null;

        LetaGrammarParser.formulaExpression_return formulaExpression49 = null;

        LetaGrammarParser.mathOperator_return mathOperator51 = null;

        LetaGrammarParser.formulaExpression_return formulaExpression52 = null;


        Object char_literal48_tree=null;
        Object char_literal50_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_formulaExpression=new RewriteRuleSubtreeStream(adaptor,"rule formulaExpression");
        RewriteRuleSubtreeStream stream_mathOperator=new RewriteRuleSubtreeStream(adaptor,"rule mathOperator");
        RewriteRuleSubtreeStream stream_formulaItem=new RewriteRuleSubtreeStream(adaptor,"rule formulaItem");
        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:175:3: ( formulaItem ( mathOperator formulaExpression )? -> ^( FORMULAEXPRESSION formulaItem ( mathOperator formulaExpression )? ) | '(' formulaExpression ')' ( mathOperator formulaExpression )? -> ^( FORMULAEXPRESSION formulaExpression ( mathOperator formulaExpression )? ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==ID) ) {
                alt23=1;
            }
            else if ( (LA23_0==53) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:175:5: formulaItem ( mathOperator formulaExpression )?
                    {
                    pushFollow(FOLLOW_formulaItem_in_formulaExpression1114);
                    formulaItem45=formulaItem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formulaItem.add(formulaItem45.getTree());
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:175:17: ( mathOperator formulaExpression )?
                    int alt21=2;
                    alt21 = dfa21.predict(input);
                    switch (alt21) {
                        case 1 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:175:18: mathOperator formulaExpression
                            {
                            pushFollow(FOLLOW_mathOperator_in_formulaExpression1117);
                            mathOperator46=mathOperator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_mathOperator.add(mathOperator46.getTree());
                            pushFollow(FOLLOW_formulaExpression_in_formulaExpression1119);
                            formulaExpression47=formulaExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formulaExpression.add(formulaExpression47.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: formulaItem, mathOperator, formulaExpression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 176:5: -> ^( FORMULAEXPRESSION formulaItem ( mathOperator formulaExpression )? )
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:176:8: ^( FORMULAEXPRESSION formulaItem ( mathOperator formulaExpression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMULAEXPRESSION, "FORMULAEXPRESSION"), root_1);

                        adaptor.addChild(root_1, stream_formulaItem.nextTree());
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:176:40: ( mathOperator formulaExpression )?
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
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:177:5: '(' formulaExpression ')' ( mathOperator formulaExpression )?
                    {
                    char_literal48=(Token)match(input,53,FOLLOW_53_in_formulaExpression1146); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal48);

                    pushFollow(FOLLOW_formulaExpression_in_formulaExpression1148);
                    formulaExpression49=formulaExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formulaExpression.add(formulaExpression49.getTree());
                    char_literal50=(Token)match(input,54,FOLLOW_54_in_formulaExpression1150); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal50);

                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:177:31: ( mathOperator formulaExpression )?
                    int alt22=2;
                    alt22 = dfa22.predict(input);
                    switch (alt22) {
                        case 1 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:177:32: mathOperator formulaExpression
                            {
                            pushFollow(FOLLOW_mathOperator_in_formulaExpression1153);
                            mathOperator51=mathOperator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_mathOperator.add(mathOperator51.getTree());
                            pushFollow(FOLLOW_formulaExpression_in_formulaExpression1155);
                            formulaExpression52=formulaExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formulaExpression.add(formulaExpression52.getTree());

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
                    // 178:5: -> ^( FORMULAEXPRESSION formulaExpression ( mathOperator formulaExpression )? )
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:178:8: ^( FORMULAEXPRESSION formulaExpression ( mathOperator formulaExpression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMULAEXPRESSION, "FORMULAEXPRESSION"), root_1);

                        adaptor.addChild(root_1, stream_formulaExpression.nextTree());
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:178:46: ( mathOperator formulaExpression )?
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:181:1: formulaItem : ( term | termInstance | termWithAssociation ) -> ^( FORMULAITEM ( term )? ( termInstance )? ( termWithAssociation )? ) ;
    public final LetaGrammarParser.formulaItem_return formulaItem() throws RecognitionException {
        LetaGrammarParser.formulaItem_return retval = new LetaGrammarParser.formulaItem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LetaGrammarParser.term_return term53 = null;

        LetaGrammarParser.termInstance_return termInstance54 = null;

        LetaGrammarParser.termWithAssociation_return termWithAssociation55 = null;


        RewriteRuleSubtreeStream stream_termWithAssociation=new RewriteRuleSubtreeStream(adaptor,"rule termWithAssociation");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_termInstance=new RewriteRuleSubtreeStream(adaptor,"rule termInstance");
        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:182:3: ( ( term | termInstance | termWithAssociation ) -> ^( FORMULAITEM ( term )? ( termInstance )? ( termWithAssociation )? ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:182:5: ( term | termInstance | termWithAssociation )
            {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:182:5: ( term | termInstance | termWithAssociation )
            int alt24=3;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:182:6: term
                    {
                    pushFollow(FOLLOW_term_in_formulaItem1191);
                    term53=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_term.add(term53.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:182:13: termInstance
                    {
                    pushFollow(FOLLOW_termInstance_in_formulaItem1195);
                    termInstance54=termInstance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_termInstance.add(termInstance54.getTree());

                    }
                    break;
                case 3 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:182:28: termWithAssociation
                    {
                    pushFollow(FOLLOW_termWithAssociation_in_formulaItem1199);
                    termWithAssociation55=termWithAssociation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_termWithAssociation.add(termWithAssociation55.getTree());

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
            // 183:5: -> ^( FORMULAITEM ( term )? ( termInstance )? ( termWithAssociation )? )
            {
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:183:8: ^( FORMULAITEM ( term )? ( termInstance )? ( termWithAssociation )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMULAITEM, "FORMULAITEM"), root_1);

                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:183:22: ( term )?
                if ( stream_term.hasNext() ) {
                    adaptor.addChild(root_1, stream_term.nextTree());

                }
                stream_term.reset();
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:183:28: ( termInstance )?
                if ( stream_termInstance.hasNext() ) {
                    adaptor.addChild(root_1, stream_termInstance.nextTree());

                }
                stream_termInstance.reset();
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:183:42: ( termWithAssociation )?
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:186:1: mathOperator : ( '+' -> ^( OPERATOR '+' ) | '-' -> ^( OPERATOR '-' ) | '/' -> ^( OPERATOR '/' ) | '*' -> ^( OPERATOR '*' ) | '%' -> ^( OPERATOR '%' ) | '**' -> ^( OPERATOR '**' ) );
    public final LetaGrammarParser.mathOperator_return mathOperator() throws RecognitionException {
        LetaGrammarParser.mathOperator_return retval = new LetaGrammarParser.mathOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal56=null;
        Token char_literal57=null;
        Token char_literal58=null;
        Token char_literal59=null;
        Token char_literal60=null;
        Token string_literal61=null;

        Object char_literal56_tree=null;
        Object char_literal57_tree=null;
        Object char_literal58_tree=null;
        Object char_literal59_tree=null;
        Object char_literal60_tree=null;
        Object string_literal61_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:187:3: ( '+' -> ^( OPERATOR '+' ) | '-' -> ^( OPERATOR '-' ) | '/' -> ^( OPERATOR '/' ) | '*' -> ^( OPERATOR '*' ) | '%' -> ^( OPERATOR '%' ) | '**' -> ^( OPERATOR '**' ) )
            int alt25=6;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt25=1;
                }
                break;
            case 64:
                {
                alt25=2;
                }
                break;
            case 65:
                {
                alt25=3;
                }
                break;
            case 66:
                {
                alt25=4;
                }
                break;
            case 67:
                {
                alt25=5;
                }
                break;
            case 68:
                {
                alt25=6;
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
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:187:5: '+'
                    {
                    char_literal56=(Token)match(input,63,FOLLOW_63_in_mathOperator1232); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_63.add(char_literal56);



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
                    // 188:5: -> ^( OPERATOR '+' )
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:188:8: ^( OPERATOR '+' )
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
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:189:5: '-'
                    {
                    char_literal57=(Token)match(input,64,FOLLOW_64_in_mathOperator1250); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_64.add(char_literal57);



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
                    // 190:5: -> ^( OPERATOR '-' )
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:190:8: ^( OPERATOR '-' )
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
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:191:5: '/'
                    {
                    char_literal58=(Token)match(input,65,FOLLOW_65_in_mathOperator1268); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_65.add(char_literal58);



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
                    // 192:5: -> ^( OPERATOR '/' )
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:192:8: ^( OPERATOR '/' )
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
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:193:5: '*'
                    {
                    char_literal59=(Token)match(input,66,FOLLOW_66_in_mathOperator1286); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_66.add(char_literal59);



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
                    // 194:5: -> ^( OPERATOR '*' )
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:194:8: ^( OPERATOR '*' )
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
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:195:5: '%'
                    {
                    char_literal60=(Token)match(input,67,FOLLOW_67_in_mathOperator1304); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_67.add(char_literal60);



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
                    // 196:5: -> ^( OPERATOR '%' )
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:196:8: ^( OPERATOR '%' )
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
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:197:5: '**'
                    {
                    string_literal61=(Token)match(input,68,FOLLOW_68_in_mathOperator1322); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_68.add(string_literal61);



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
                    // 198:5: -> ^( OPERATOR '**' )
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:198:8: ^( OPERATOR '**' )
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:201:1: relationalOperator : ( '>' -> ^( OPERATOR '>' ) | '<' -> ^( OPERATOR '<' ) | '>=' -> ^( OPERATOR '>=' ) | '<=' -> ^( OPERATOR '<=' ) | notEqualOperator );
    public final LetaGrammarParser.relationalOperator_return relationalOperator() throws RecognitionException {
        LetaGrammarParser.relationalOperator_return retval = new LetaGrammarParser.relationalOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal62=null;
        Token char_literal63=null;
        Token string_literal64=null;
        Token string_literal65=null;
        LetaGrammarParser.notEqualOperator_return notEqualOperator66 = null;


        Object char_literal62_tree=null;
        Object char_literal63_tree=null;
        Object string_literal64_tree=null;
        Object string_literal65_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:202:3: ( '>' -> ^( OPERATOR '>' ) | '<' -> ^( OPERATOR '<' ) | '>=' -> ^( OPERATOR '>=' ) | '<=' -> ^( OPERATOR '<=' ) | notEqualOperator )
            int alt26=5;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt26=1;
                }
                break;
            case 70:
                {
                alt26=2;
                }
                break;
            case 71:
                {
                alt26=3;
                }
                break;
            case 72:
                {
                alt26=4;
                }
                break;
            case 73:
                {
                alt26=5;
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
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:202:5: '>'
                    {
                    char_literal62=(Token)match(input,69,FOLLOW_69_in_relationalOperator1347); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_69.add(char_literal62);



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
                    // 203:5: -> ^( OPERATOR '>' )
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:203:8: ^( OPERATOR '>' )
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
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:204:5: '<'
                    {
                    char_literal63=(Token)match(input,70,FOLLOW_70_in_relationalOperator1365); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_70.add(char_literal63);



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
                    // 205:5: -> ^( OPERATOR '<' )
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:205:8: ^( OPERATOR '<' )
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
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:206:5: '>='
                    {
                    string_literal64=(Token)match(input,71,FOLLOW_71_in_relationalOperator1383); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_71.add(string_literal64);



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
                    // 207:5: -> ^( OPERATOR '>=' )
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:207:8: ^( OPERATOR '>=' )
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
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:208:5: '<='
                    {
                    string_literal65=(Token)match(input,72,FOLLOW_72_in_relationalOperator1401); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_72.add(string_literal65);



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
                    // 209:5: -> ^( OPERATOR '<=' )
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:209:8: ^( OPERATOR '<=' )
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
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:210:5: notEqualOperator
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_notEqualOperator_in_relationalOperator1419);
                    notEqualOperator66=notEqualOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, notEqualOperator66.getTree());

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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:213:1: notEqualOperator : '!=' -> ^( OPERATOR '!=' ) ;
    public final LetaGrammarParser.notEqualOperator_return notEqualOperator() throws RecognitionException {
        LetaGrammarParser.notEqualOperator_return retval = new LetaGrammarParser.notEqualOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal67=null;

        Object string_literal67_tree=null;
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:214:3: ( '!=' -> ^( OPERATOR '!=' ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:214:5: '!='
            {
            string_literal67=(Token)match(input,73,FOLLOW_73_in_notEqualOperator1432); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_73.add(string_literal67);



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
            // 215:5: -> ^( OPERATOR '!=' )
            {
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:215:8: ^( OPERATOR '!=' )
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:218:1: set : '{' list '}' ( ',' set )? -> ^( SET list ( set )? ) ;
    public final LetaGrammarParser.set_return set() throws RecognitionException {
        LetaGrammarParser.set_return retval = new LetaGrammarParser.set_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal68=null;
        Token char_literal70=null;
        Token char_literal71=null;
        LetaGrammarParser.list_return list69 = null;

        LetaGrammarParser.set_return set72 = null;


        Object char_literal68_tree=null;
        Object char_literal70_tree=null;
        Object char_literal71_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_set=new RewriteRuleSubtreeStream(adaptor,"rule set");
        RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");
        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:219:3: ( '{' list '}' ( ',' set )? -> ^( SET list ( set )? ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:219:5: '{' list '}' ( ',' set )?
            {
            char_literal68=(Token)match(input,51,FOLLOW_51_in_set1457); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal68);

            pushFollow(FOLLOW_list_in_set1459);
            list69=list();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_list.add(list69.getTree());
            char_literal70=(Token)match(input,52,FOLLOW_52_in_set1461); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_52.add(char_literal70);

            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:219:18: ( ',' set )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==74) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:219:19: ',' set
                    {
                    char_literal71=(Token)match(input,74,FOLLOW_74_in_set1464); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_74.add(char_literal71);

                    pushFollow(FOLLOW_set_in_set1466);
                    set72=set();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_set.add(set72.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: list, set
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 220:5: -> ^( SET list ( set )? )
            {
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:220:8: ^( SET list ( set )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SET, "SET"), root_1);

                adaptor.addChild(root_1, stream_list.nextTree());
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:220:19: ( set )?
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:223:1: list : ( stringLiteral | otherLiteral ) ( ',' list )? -> ^( LIST ( stringLiteral )? ( otherLiteral )? ( list )? ) ;
    public final LetaGrammarParser.list_return list() throws RecognitionException {
        LetaGrammarParser.list_return retval = new LetaGrammarParser.list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal75=null;
        LetaGrammarParser.stringLiteral_return stringLiteral73 = null;

        LetaGrammarParser.otherLiteral_return otherLiteral74 = null;

        LetaGrammarParser.list_return list76 = null;


        Object char_literal75_tree=null;
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_otherLiteral=new RewriteRuleSubtreeStream(adaptor,"rule otherLiteral");
        RewriteRuleSubtreeStream stream_stringLiteral=new RewriteRuleSubtreeStream(adaptor,"rule stringLiteral");
        RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");
        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:224:3: ( ( stringLiteral | otherLiteral ) ( ',' list )? -> ^( LIST ( stringLiteral )? ( otherLiteral )? ( list )? ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:224:5: ( stringLiteral | otherLiteral ) ( ',' list )?
            {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:224:5: ( stringLiteral | otherLiteral )
            int alt28=2;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:224:6: stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_list1497);
                    stringLiteral73=stringLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_stringLiteral.add(stringLiteral73.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:224:22: otherLiteral
                    {
                    pushFollow(FOLLOW_otherLiteral_in_list1501);
                    otherLiteral74=otherLiteral();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_otherLiteral.add(otherLiteral74.getTree());

                    }
                    break;

            }

            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:224:36: ( ',' list )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==74) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:224:37: ',' list
                    {
                    char_literal75=(Token)match(input,74,FOLLOW_74_in_list1505); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_74.add(char_literal75);

                    pushFollow(FOLLOW_list_in_list1507);
                    list76=list();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_list.add(list76.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: stringLiteral, otherLiteral, list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 225:5: -> ^( LIST ( stringLiteral )? ( otherLiteral )? ( list )? )
            {
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:225:8: ^( LIST ( stringLiteral )? ( otherLiteral )? ( list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:225:15: ( stringLiteral )?
                if ( stream_stringLiteral.hasNext() ) {
                    adaptor.addChild(root_1, stream_stringLiteral.nextTree());

                }
                stream_stringLiteral.reset();
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:225:30: ( otherLiteral )?
                if ( stream_otherLiteral.hasNext() ) {
                    adaptor.addChild(root_1, stream_otherLiteral.nextTree());

                }
                stream_otherLiteral.reset();
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:225:44: ( list )?
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:228:1: stringLiteral : ( STRING -> ^( LITERAL STRING ) | 'null' -> ^( LITERAL NULL ) );
    public final LetaGrammarParser.stringLiteral_return stringLiteral() throws RecognitionException {
        LetaGrammarParser.stringLiteral_return retval = new LetaGrammarParser.stringLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING77=null;
        Token string_literal78=null;

        Object STRING77_tree=null;
        Object string_literal78_tree=null;
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:229:3: ( STRING -> ^( LITERAL STRING ) | 'null' -> ^( LITERAL NULL ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==STRING) ) {
                alt30=1;
            }
            else if ( (LA30_0==75) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:229:5: STRING
                    {
                    STRING77=(Token)match(input,STRING,FOLLOW_STRING_in_stringLiteral1541); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(STRING77);



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
                    // 230:5: -> ^( LITERAL STRING )
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:230:8: ^( LITERAL STRING )
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
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:231:5: 'null'
                    {
                    string_literal78=(Token)match(input,75,FOLLOW_75_in_stringLiteral1559); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(string_literal78);



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
                    // 232:5: -> ^( LITERAL NULL )
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:232:8: ^( LITERAL NULL )
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:235:1: otherLiteral : ( FLOAT -> ^( LITERAL FLOAT ) | MINUS_FLOAT -> ^( LITERAL MINUS_FLOAT ) | INT -> ^( LITERAL INT ) | MINUS_INT -> ^( LITERAL MINUS_INT ) | DATE_TIME -> ^( LITERAL DATE_TIME ) | 'null' -> ^( LITERAL NULL ) );
    public final LetaGrammarParser.otherLiteral_return otherLiteral() throws RecognitionException {
        LetaGrammarParser.otherLiteral_return retval = new LetaGrammarParser.otherLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token FLOAT79=null;
        Token MINUS_FLOAT80=null;
        Token INT81=null;
        Token MINUS_INT82=null;
        Token DATE_TIME83=null;
        Token string_literal84=null;

        Object FLOAT79_tree=null;
        Object MINUS_FLOAT80_tree=null;
        Object INT81_tree=null;
        Object MINUS_INT82_tree=null;
        Object DATE_TIME83_tree=null;
        Object string_literal84_tree=null;
        RewriteRuleTokenStream stream_DATE_TIME=new RewriteRuleTokenStream(adaptor,"token DATE_TIME");
        RewriteRuleTokenStream stream_MINUS_INT=new RewriteRuleTokenStream(adaptor,"token MINUS_INT");
        RewriteRuleTokenStream stream_MINUS_FLOAT=new RewriteRuleTokenStream(adaptor,"token MINUS_FLOAT");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:236:3: ( FLOAT -> ^( LITERAL FLOAT ) | MINUS_FLOAT -> ^( LITERAL MINUS_FLOAT ) | INT -> ^( LITERAL INT ) | MINUS_INT -> ^( LITERAL MINUS_INT ) | DATE_TIME -> ^( LITERAL DATE_TIME ) | 'null' -> ^( LITERAL NULL ) )
            int alt31=6;
            switch ( input.LA(1) ) {
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
            case 75:
                {
                alt31=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:236:5: FLOAT
                    {
                    FLOAT79=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_otherLiteral1584); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOAT.add(FLOAT79);



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
                    // 237:5: -> ^( LITERAL FLOAT )
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:237:8: ^( LITERAL FLOAT )
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
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:238:5: MINUS_FLOAT
                    {
                    MINUS_FLOAT80=(Token)match(input,MINUS_FLOAT,FOLLOW_MINUS_FLOAT_in_otherLiteral1602); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS_FLOAT.add(MINUS_FLOAT80);



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
                    // 239:5: -> ^( LITERAL MINUS_FLOAT )
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:239:8: ^( LITERAL MINUS_FLOAT )
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
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:240:5: INT
                    {
                    INT81=(Token)match(input,INT,FOLLOW_INT_in_otherLiteral1620); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(INT81);



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
                    // 241:5: -> ^( LITERAL INT )
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:241:8: ^( LITERAL INT )
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
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:242:5: MINUS_INT
                    {
                    MINUS_INT82=(Token)match(input,MINUS_INT,FOLLOW_MINUS_INT_in_otherLiteral1638); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS_INT.add(MINUS_INT82);



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
                    // 243:5: -> ^( LITERAL MINUS_INT )
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:243:8: ^( LITERAL MINUS_INT )
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
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:244:5: DATE_TIME
                    {
                    DATE_TIME83=(Token)match(input,DATE_TIME,FOLLOW_DATE_TIME_in_otherLiteral1656); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DATE_TIME.add(DATE_TIME83);



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
                    // 245:5: -> ^( LITERAL DATE_TIME )
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:245:8: ^( LITERAL DATE_TIME )
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
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:246:5: 'null'
                    {
                    string_literal84=(Token)match(input,75,FOLLOW_75_in_otherLiteral1674); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(string_literal84);



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
                    // 247:5: -> ^( LITERAL NULL )
                    {
                        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:247:8: ^( LITERAL NULL )
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
    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:250:1: testPackage : 'Package' PACKAGE_ID -> ^( PACKAGE PACKAGE_ID ) ;
    public final LetaGrammarParser.testPackage_return testPackage() throws RecognitionException {
        LetaGrammarParser.testPackage_return retval = new LetaGrammarParser.testPackage_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal85=null;
        Token PACKAGE_ID86=null;

        Object string_literal85_tree=null;
        Object PACKAGE_ID86_tree=null;
        RewriteRuleTokenStream stream_PACKAGE_ID=new RewriteRuleTokenStream(adaptor,"token PACKAGE_ID");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");

        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:251:3: ( 'Package' PACKAGE_ID -> ^( PACKAGE PACKAGE_ID ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:251:5: 'Package' PACKAGE_ID
            {
            string_literal85=(Token)match(input,76,FOLLOW_76_in_testPackage1699); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_76.add(string_literal85);

            PACKAGE_ID86=(Token)match(input,PACKAGE_ID,FOLLOW_PACKAGE_ID_in_testPackage1701); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PACKAGE_ID.add(PACKAGE_ID86);



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
            // 252:5: -> ^( PACKAGE PACKAGE_ID )
            {
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:252:8: ^( PACKAGE PACKAGE_ID )
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

    // $ANTLR start synpred5_LetaGrammar
    public final void synpred5_LetaGrammar_fragment() throws RecognitionException {   
        LetaGrammarParser.fact_return f = null;


        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:99:6: (f= fact )
        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:99:6: f= fact
        {
        pushFollow(FOLLOW_fact_in_synpred5_LetaGrammar409);
        f=fact();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_LetaGrammar

    // $ANTLR start synpred18_LetaGrammar
    public final void synpred18_LetaGrammar_fragment() throws RecognitionException {   
        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:142:5: ( term ( notEqualOperator )? stringLiteral )
        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:142:5: term ( notEqualOperator )? stringLiteral
        {
        pushFollow(FOLLOW_term_in_synpred18_LetaGrammar851);
        term();

        state._fsp--;
        if (state.failed) return ;
        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:142:10: ( notEqualOperator )?
        int alt36=2;
        int LA36_0 = input.LA(1);

        if ( (LA36_0==73) ) {
            alt36=1;
        }
        switch (alt36) {
            case 1 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:0:0: notEqualOperator
                {
                pushFollow(FOLLOW_notEqualOperator_in_synpred18_LetaGrammar853);
                notEqualOperator();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }

        pushFollow(FOLLOW_stringLiteral_in_synpred18_LetaGrammar856);
        stringLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_LetaGrammar

    // $ANTLR start synpred39_LetaGrammar
    public final void synpred39_LetaGrammar_fragment() throws RecognitionException {   
        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:224:6: ( stringLiteral )
        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:224:6: stringLiteral
        {
        pushFollow(FOLLOW_stringLiteral_in_synpred39_LetaGrammar1497);
        stringLiteral();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred39_LetaGrammar

    // Delegated rules

    public final boolean synpred39_LetaGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_LetaGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_LetaGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_LetaGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_LetaGrammar() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_LetaGrammar_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA18 dfa18 = new DFA18(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA24 dfa24 = new DFA24(this);
    protected DFA28 dfa28 = new DFA28(this);
    static final String DFA5_eotS =
        "\110\uffff";
    static final String DFA5_eofS =
        "\110\uffff";
    static final String DFA5_minS =
        "\1\43\4\uffff\1\43\1\uffff\1\44\2\43\4\44\5\43\1\44\1\uffff\10\0"+
        "\4\uffff\34\0\12\uffff\1\0";
    static final String DFA5_maxS =
        "\1\75\4\uffff\1\113\1\uffff\1\113\2\76\4\113\5\76\1\44\1\uffff\10"+
        "\0\4\uffff\34\0\12\uffff\1\0";
    static final String DFA5_acceptS =
        "\1\uffff\1\1\22\uffff\1\2\63\uffff";
    static final String DFA5_specialS =
        "\25\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\4\uffff\1\10\1\11\1\12"+
        "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
        "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\12"+
        "\uffff\1\44}>";
    static final String[] DFA5_transitionS = {
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

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "99:5: (f= fact | fo= formula )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_21 = input.LA(1);

                         
                        int index5_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_21);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA5_22 = input.LA(1);

                         
                        int index5_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_22);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA5_23 = input.LA(1);

                         
                        int index5_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_23);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA5_24 = input.LA(1);

                         
                        int index5_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_24);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA5_25 = input.LA(1);

                         
                        int index5_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_25);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA5_26 = input.LA(1);

                         
                        int index5_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_26);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA5_27 = input.LA(1);

                         
                        int index5_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_27);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA5_28 = input.LA(1);

                         
                        int index5_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_28);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA5_33 = input.LA(1);

                         
                        int index5_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_33);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA5_34 = input.LA(1);

                         
                        int index5_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_34);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA5_35 = input.LA(1);

                         
                        int index5_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_35);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA5_36 = input.LA(1);

                         
                        int index5_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_36);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA5_37 = input.LA(1);

                         
                        int index5_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_37);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA5_38 = input.LA(1);

                         
                        int index5_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_38);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA5_39 = input.LA(1);

                         
                        int index5_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_39);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA5_40 = input.LA(1);

                         
                        int index5_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_40);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA5_41 = input.LA(1);

                         
                        int index5_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_41);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA5_42 = input.LA(1);

                         
                        int index5_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_42);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA5_43 = input.LA(1);

                         
                        int index5_43 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_43);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA5_44 = input.LA(1);

                         
                        int index5_44 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_44);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA5_45 = input.LA(1);

                         
                        int index5_45 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_45);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA5_46 = input.LA(1);

                         
                        int index5_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_46);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA5_47 = input.LA(1);

                         
                        int index5_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_47);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA5_48 = input.LA(1);

                         
                        int index5_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_48);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA5_49 = input.LA(1);

                         
                        int index5_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_49);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA5_50 = input.LA(1);

                         
                        int index5_50 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_50);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA5_51 = input.LA(1);

                         
                        int index5_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_51);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA5_52 = input.LA(1);

                         
                        int index5_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_52);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA5_53 = input.LA(1);

                         
                        int index5_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_53);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA5_54 = input.LA(1);

                         
                        int index5_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_54);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA5_55 = input.LA(1);

                         
                        int index5_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_55);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA5_56 = input.LA(1);

                         
                        int index5_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_56);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA5_57 = input.LA(1);

                         
                        int index5_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_57);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA5_58 = input.LA(1);

                         
                        int index5_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_58);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA5_59 = input.LA(1);

                         
                        int index5_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_59);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA5_60 = input.LA(1);

                         
                        int index5_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_60);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA5_71 = input.LA(1);

                         
                        int index5_71 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred5_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 20;}

                         
                        input.seek(index5_71);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA11_eotS =
        "\15\uffff";
    static final String DFA11_eofS =
        "\1\6\14\uffff";
    static final String DFA11_minS =
        "\1\43\14\uffff";
    static final String DFA11_maxS =
        "\1\75\14\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\6\uffff";
    static final String DFA11_specialS =
        "\15\uffff}>";
    static final String[] DFA11_transitionS = {
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

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "120:35: (tc2= termComposite (fe= factExt )? )?";
        }
    }
    static final String DFA13_eotS =
        "\15\uffff";
    static final String DFA13_eofS =
        "\1\6\14\uffff";
    static final String DFA13_minS =
        "\1\43\14\uffff";
    static final String DFA13_maxS =
        "\1\75\14\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\6\uffff";
    static final String DFA13_specialS =
        "\15\uffff}>";
    static final String[] DFA13_transitionS = {
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

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "125:16: ( termComposite ( factExt )? )?";
        }
    }
    static final String DFA15_eotS =
        "\73\uffff";
    static final String DFA15_eofS =
        "\1\uffff\1\2\71\uffff";
    static final String DFA15_minS =
        "\2\43\10\uffff\1\44\2\uffff\4\44\52\uffff";
    static final String DFA15_maxS =
        "\1\43\1\113\10\uffff\1\113\2\uffff\4\113\52\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\1\10\uffff\1\2\12\uffff\1\3\44\uffff";
    static final String DFA15_specialS =
        "\73\uffff}>";
    static final String[] DFA15_transitionS = {
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
            return "130:17: (t= term | ti= termInstance | twa= termWithAssociation )";
        }
    }
    static final String DFA18_eotS =
        "\44\uffff";
    static final String DFA18_eofS =
        "\44\uffff";
    static final String DFA18_minS =
        "\1\43\2\44\1\uffff\1\0\12\uffff\1\0\24\uffff";
    static final String DFA18_maxS =
        "\1\43\2\113\1\uffff\1\0\12\uffff\1\0\24\uffff";
    static final String DFA18_acceptS =
        "\3\uffff\1\1\1\uffff\1\2\36\uffff";
    static final String DFA18_specialS =
        "\4\uffff\1\0\12\uffff\1\1\24\uffff}>";
    static final String[] DFA18_transitionS = {
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
            return "141:1: termInstance : ( term ( notEqualOperator )? stringLiteral -> ^( TERMINSTANCE term ( notEqualOperator )? stringLiteral ) | term ( relationalOperator )? otherLiteral -> ^( TERMINSTANCE term ( relationalOperator )? otherLiteral ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_4 = input.LA(1);

                         
                        int index18_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_LetaGrammar()) ) {s = 3;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index18_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_15 = input.LA(1);

                         
                        int index18_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred18_LetaGrammar()) ) {s = 3;}

                        else if ( (true) ) {s = 5;}

                         
                        input.seek(index18_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA17_eotS =
        "\14\uffff";
    static final String DFA17_eofS =
        "\14\uffff";
    static final String DFA17_minS =
        "\1\44\13\uffff";
    static final String DFA17_maxS =
        "\1\113\13\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\5\uffff";
    static final String DFA17_specialS =
        "\14\uffff}>";
    static final String[] DFA17_transitionS = {
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
            return "144:10: ( relationalOperator )?";
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
            return "175:17: ( mathOperator formulaExpression )?";
        }
    }
    static final String DFA22_eotS =
        "\16\uffff";
    static final String DFA22_eofS =
        "\1\7\15\uffff";
    static final String DFA22_minS =
        "\1\57\15\uffff";
    static final String DFA22_maxS =
        "\1\104\15\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\1\5\uffff\1\2\6\uffff";
    static final String DFA22_specialS =
        "\16\uffff}>";
    static final String[] DFA22_transitionS = {
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

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "177:31: ( mathOperator formulaExpression )?";
        }
    }
    static final String DFA24_eotS =
        "\101\uffff";
    static final String DFA24_eofS =
        "\1\uffff\1\2\77\uffff";
    static final String DFA24_minS =
        "\1\43\1\44\16\uffff\1\44\2\uffff\4\44\52\uffff";
    static final String DFA24_maxS =
        "\1\43\1\113\16\uffff\1\113\2\uffff\4\113\52\uffff";
    static final String DFA24_acceptS =
        "\2\uffff\1\1\16\uffff\1\2\12\uffff\1\3\44\uffff";
    static final String DFA24_specialS =
        "\101\uffff}>";
    static final String[] DFA24_transitionS = {
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

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "182:5: ( term | termInstance | termWithAssociation )";
        }
    }
    static final String DFA28_eotS =
        "\13\uffff";
    static final String DFA28_eofS =
        "\13\uffff";
    static final String DFA28_minS =
        "\1\44\1\uffff\1\0\10\uffff";
    static final String DFA28_maxS =
        "\1\113\1\uffff\1\0\10\uffff";
    static final String DFA28_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\7\uffff";
    static final String DFA28_specialS =
        "\2\uffff\1\0\10\uffff}>";
    static final String[] DFA28_transitionS = {
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

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "224:5: ( stringLiteral | otherLiteral )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_2 = input.LA(1);

                         
                        int index28_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred39_LetaGrammar()) ) {s = 1;}

                        else if ( (true) ) {s = 3;}

                         
                        input.seek(index28_2);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
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
    public static final BitSet FOLLOW_51_in_setClause362 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_set_in_setClause367 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_setClause371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fact_in_factComposite409 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_formula_in_factComposite415 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_logicalOperator_in_factComposite421 = new BitSet(new long[]{0x3C20000800000000L});
    public static final BitSet FOLLOW_factComposite_in_factComposite425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_factComposite533 = new BitSet(new long[]{0x3C20000800000000L});
    public static final BitSet FOLLOW_factComposite_in_factComposite537 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_factComposite539 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_logicalOperator_in_factComposite544 = new BitSet(new long[]{0x3C20000800000000L});
    public static final BitSet FOLLOW_factComposite_in_factComposite548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_logicalOperator616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_logicalOperator628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termComposite_in_fact649 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_complement_in_fact653 = new BitSet(new long[]{0x3C00000800000002L});
    public static final BitSet FOLLOW_termComposite_in_fact658 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_factExt_in_fact662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_complement_in_factExt704 = new BitSet(new long[]{0x3C00000800000002L});
    public static final BitSet FOLLOW_termComposite_in_factExt707 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_factExt_in_factExt709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quantifier_in_termComposite745 = new BitSet(new long[]{0x3C00000800000000L});
    public static final BitSet FOLLOW_term_in_termComposite751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termInstance_in_termComposite757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termWithAssociation_in_termComposite763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_termInstance851 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000A00L});
    public static final BitSet FOLLOW_notEqualOperator_in_termInstance853 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000A00L});
    public static final BitSet FOLLOW_stringLiteral_in_termInstance856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_termInstance879 = new BitSet(new long[]{0x000003D000000000L,0x0000000000000BE0L});
    public static final BitSet FOLLOW_relationalOperator_in_termInstance881 = new BitSet(new long[]{0x000003D000000000L,0x0000000000000BE0L});
    public static final BitSet FOLLOW_otherLiteral_in_termInstance884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_termWithAssociation914 = new BitSet(new long[]{0x0200000000000000L,0x00000000000003E0L});
    public static final BitSet FOLLOW_relationalOperator_in_termWithAssociation916 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_termWithAssociation919 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_termWithAssociation921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_quantifier953 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_quantifier975 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_quantifier997 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_quantifier1019 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier1023 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_complement1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formulaItem_in_formula1083 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_formula1085 = new BitSet(new long[]{0x3C20000800000000L});
    public static final BitSet FOLLOW_formulaExpression_in_formula1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formulaItem_in_formulaExpression1114 = new BitSet(new long[]{0x8000000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_mathOperator_in_formulaExpression1117 = new BitSet(new long[]{0x3C20000800000000L});
    public static final BitSet FOLLOW_formulaExpression_in_formulaExpression1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_formulaExpression1146 = new BitSet(new long[]{0x3C20000800000000L});
    public static final BitSet FOLLOW_formulaExpression_in_formulaExpression1148 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_formulaExpression1150 = new BitSet(new long[]{0x8000000000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_mathOperator_in_formulaExpression1153 = new BitSet(new long[]{0x3C20000800000000L});
    public static final BitSet FOLLOW_formulaExpression_in_formulaExpression1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_formulaItem1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termInstance_in_formulaItem1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termWithAssociation_in_formulaItem1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_mathOperator1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_mathOperator1250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_mathOperator1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_mathOperator1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_mathOperator1304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_mathOperator1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_relationalOperator1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_relationalOperator1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_relationalOperator1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_relationalOperator1401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_notEqualOperator_in_relationalOperator1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_notEqualOperator1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_set1457 = new BitSet(new long[]{0x000003F000000000L,0x0000000000000BE0L});
    public static final BitSet FOLLOW_list_in_set1459 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_set1461 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_set1464 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_set_in_set1466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_list1497 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_otherLiteral_in_list1501 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_list1505 = new BitSet(new long[]{0x000003F000000000L,0x0000000000000BE0L});
    public static final BitSet FOLLOW_list_in_list1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_stringLiteral1541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_stringLiteral1559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_otherLiteral1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_FLOAT_in_otherLiteral1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_otherLiteral1620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_INT_in_otherLiteral1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_TIME_in_otherLiteral1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_otherLiteral1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_testPackage1699 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_PACKAGE_ID_in_testPackage1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fact_in_synpred5_LetaGrammar409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_synpred18_LetaGrammar851 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000A00L});
    public static final BitSet FOLLOW_notEqualOperator_in_synpred18_LetaGrammar853 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000A00L});
    public static final BitSet FOLLOW_stringLiteral_in_synpred18_LetaGrammar856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_stringLiteral_in_synpred39_LetaGrammar1497 = new BitSet(new long[]{0x0000000000000002L});

}