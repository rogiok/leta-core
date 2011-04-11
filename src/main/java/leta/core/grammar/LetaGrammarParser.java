// $ANTLR 3.3 Nov 30, 2010 12:46:29 C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g 2011-04-11 13:50:42

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LETA", "STMT", "TESTCASE", "WHEN", "VERIFY", "SET", "FACTCOMPOSITE", "CONJUNCTION", "DISJUNCTION", "FACT", "FACTEXT", "FACTUNARY", "FACTBINARY", "FACTNARY", "TERMCOMPOSITE", "FORMULA", "TERM", "TERMINSTANCE", "TERMWITHASSOCIATION", "COMPLEMENT", "NULL", "LITERAL", "QUANTIFIER", "FORMULAEXPRESSION", "FORMULAEXPRESSIONCOMPOSITE", "FORMULAITEM", "OPERATOR", "SUBSET", "SEPARATOR", "AND", "OR", "PACKAGE", "ID", "INT", "STRING", "FLOAT", "MINUS_FLOAT", "MINUS_INT", "PACKAGE_ID", "DIGIT", "COMMENT", "LINE_COMMENT", "WS", "'Test'", "'Verify'", "'When'", "'Set'", "'{'", "'}'", "'('", "')'", "'And'", "'Or'", "','", "'@'", "'each'", "'some'", "'atLeastOne'", "'atLeast'", "'atMostOne'", "'atMost'", "'exactlyOne'", "'exactly'", "'moreThanOne'", "'atLeastAndAtMost'", "'='", "'+'", "'-'", "'/'", "'*'", "'%'", "'**'", "'>'", "'<'", "'>='", "'<='", "'!='", "'null'", "'Package'"
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
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
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
    public static final int SEPARATOR=32;
    public static final int AND=33;
    public static final int OR=34;
    public static final int PACKAGE=35;
    public static final int ID=36;
    public static final int INT=37;
    public static final int STRING=38;
    public static final int FLOAT=39;
    public static final int MINUS_FLOAT=40;
    public static final int MINUS_INT=41;
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:73:1: leta : ( testPackage )? ( testCase )+ -> ^( LETA ( testPackage )? ( testCase )+ ) ;
    public final LetaGrammarParser.leta_return leta() throws RecognitionException {
        LetaGrammarParser.leta_return retval = new LetaGrammarParser.leta_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LetaGrammarParser.testPackage_return testPackage1 = null;

        LetaGrammarParser.testCase_return testCase2 = null;


        RewriteRuleSubtreeStream stream_testCase=new RewriteRuleSubtreeStream(adaptor,"rule testCase");
        RewriteRuleSubtreeStream stream_testPackage=new RewriteRuleSubtreeStream(adaptor,"rule testPackage");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:74:3: ( ( testPackage )? ( testCase )+ -> ^( LETA ( testPackage )? ( testCase )+ ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:74:5: ( testPackage )? ( testCase )+
            {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:74:5: ( testPackage )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==82) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:0:0: testPackage
                    {
                    pushFollow(FOLLOW_testPackage_in_leta236);
                    testPackage1=testPackage();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_testPackage.add(testPackage1.getTree());

                    }
                    break;

            }

            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:74:18: ( testCase )+
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
            	    pushFollow(FOLLOW_testCase_in_leta239);
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
            // 75:5: -> ^( LETA ( testPackage )? ( testCase )+ )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:75:8: ^( LETA ( testPackage )? ( testCase )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LETA, "LETA"), root_1);

                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:75:15: ( testPackage )?
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:78:1: testCase : 'Test' ID verifyClause whenClause ( setClause )? -> ^( TESTCASE ID ( setClause )? verifyClause whenClause ) ;
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:79:3: ( 'Test' ID verifyClause whenClause ( setClause )? -> ^( TESTCASE ID ( setClause )? verifyClause whenClause ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:79:5: 'Test' ID verifyClause whenClause ( setClause )?
            {
            string_literal3=(Token)match(input,47,FOLLOW_47_in_testCase270); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_47.add(string_literal3);

            ID4=(Token)match(input,ID,FOLLOW_ID_in_testCase272); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID4);

            pushFollow(FOLLOW_verifyClause_in_testCase274);
            verifyClause5=verifyClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_verifyClause.add(verifyClause5.getTree());
            pushFollow(FOLLOW_whenClause_in_testCase276);
            whenClause6=whenClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_whenClause.add(whenClause6.getTree());
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:79:39: ( setClause )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==50) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:0:0: setClause
                    {
                    pushFollow(FOLLOW_setClause_in_testCase278);
                    setClause7=setClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_setClause.add(setClause7.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: whenClause, setClause, ID, verifyClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 80:5: -> ^( TESTCASE ID ( setClause )? verifyClause whenClause )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:80:8: ^( TESTCASE ID ( setClause )? verifyClause whenClause )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TESTCASE, "TESTCASE"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:80:22: ( setClause )?
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:83:1: verifyClause : 'Verify' factComposite -> ^( VERIFY factComposite ) ;
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:84:3: ( 'Verify' factComposite -> ^( VERIFY factComposite ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:84:5: 'Verify' factComposite
            {
            string_literal8=(Token)match(input,48,FOLLOW_48_in_verifyClause311); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_48.add(string_literal8);

            pushFollow(FOLLOW_factComposite_in_verifyClause313);
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
            // 85:5: -> ^( VERIFY factComposite )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:85:8: ^( VERIFY factComposite )
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:88:1: whenClause : 'When' factComposite -> ^( WHEN factComposite ) ;
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:89:3: ( 'When' factComposite -> ^( WHEN factComposite ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:89:5: 'When' factComposite
            {
            string_literal10=(Token)match(input,49,FOLLOW_49_in_whenClause338); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_49.add(string_literal10);

            pushFollow(FOLLOW_factComposite_in_whenClause340);
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
            // 90:5: -> ^( WHEN factComposite )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:90:8: ^( WHEN factComposite )
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:93:1: setClause : 'Set' '{' set '}' -> ^( SET set ) ;
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:94:3: ( 'Set' '{' set '}' -> ^( SET set ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:94:5: 'Set' '{' set '}'
            {
            string_literal12=(Token)match(input,50,FOLLOW_50_in_setClause365); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_50.add(string_literal12);

            char_literal13=(Token)match(input,51,FOLLOW_51_in_setClause367); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal13);

            pushFollow(FOLLOW_set_in_setClause369);
            set14=set();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_set.add(set14.getTree());
            char_literal15=(Token)match(input,52,FOLLOW_52_in_setClause371); if (state.failed) return retval; 
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
            // 95:5: -> ^( SET set )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:95:8: ^( SET set )
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:98:1: factComposite : ( (f= fact | fo= formula ) (op= logicalOperator fc= factComposite )? -> {op != null && op.value.equals(\"And\") && f != null}? ^( 'And' $f $fc) -> {op != null && op.value.equals(\"Or\") && f != null}? ^( 'Or' $f $fc) -> {op != null && op.value.equals(\"And\") && fo != null}? ^( 'And' $fo $fc) -> {op != null && op.value.equals(\"Or\") && fo != null}? ^( 'Or' $fo $fc) -> {f != null}? ^( FACTCOMPOSITE $f) -> ^( FACTCOMPOSITE $fo) | '(' fc1= factComposite ')' (op= logicalOperator fc2= factComposite )? -> {op != null && op.value.equals(\"And\")}? ^( 'And' $fc1 $fc2) -> {op != null && op.value.equals(\"Or\")}? ^( 'Or' $fc1 $fc2) -> ^( FACTCOMPOSITE $fc1) );
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:99:3: ( (f= fact | fo= formula ) (op= logicalOperator fc= factComposite )? -> {op != null && op.value.equals(\"And\") && f != null}? ^( 'And' $f $fc) -> {op != null && op.value.equals(\"Or\") && f != null}? ^( 'Or' $f $fc) -> {op != null && op.value.equals(\"And\") && fo != null}? ^( 'And' $fo $fc) -> {op != null && op.value.equals(\"Or\") && fo != null}? ^( 'Or' $fo $fc) -> {f != null}? ^( FACTCOMPOSITE $f) -> ^( FACTCOMPOSITE $fo) | '(' fc1= factComposite ')' (op= logicalOperator fc2= factComposite )? -> {op != null && op.value.equals(\"And\")}? ^( 'And' $fc1 $fc2) -> {op != null && op.value.equals(\"Or\")}? ^( 'Or' $fc1 $fc2) -> ^( FACTCOMPOSITE $fc1) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:99:5: (f= fact | fo= formula ) (op= logicalOperator fc= factComposite )?
                    {
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:99:5: (f= fact | fo= formula )
                    int alt4=2;
                    alt4 = dfa4.predict(input);
                    switch (alt4) {
                        case 1 :
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:99:6: f= fact
                            {
                            pushFollow(FOLLOW_fact_in_factComposite399);
                            f=fact();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_fact.add(f.getTree());

                            }
                            break;
                        case 2 :
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:99:15: fo= formula
                            {
                            pushFollow(FOLLOW_formula_in_factComposite405);
                            fo=formula();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formula.add(fo.getTree());

                            }
                            break;

                    }

                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:99:27: (op= logicalOperator fc= factComposite )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=55 && LA5_0<=56)) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:99:28: op= logicalOperator fc= factComposite
                            {
                            pushFollow(FOLLOW_logicalOperator_in_factComposite411);
                            op=logicalOperator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_logicalOperator.add(op.getTree());
                            pushFollow(FOLLOW_factComposite_in_factComposite415);
                            fc=factComposite();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_factComposite.add(fc.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 56, 55, fc, f, fo, fo, f, fc, 56, fo, f, fc, 55, fc
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
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:100:61: ^( 'And' $f $fc)
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
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:101:60: ^( 'Or' $f $fc)
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
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:102:62: ^( 'And' $fo $fc)
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
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:103:61: ^( 'Or' $fo $fc)
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
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:104:21: ^( FACTCOMPOSITE $f)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FACTCOMPOSITE, "FACTCOMPOSITE"), root_1);

                        adaptor.addChild(root_1, stream_f.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 105:5: -> ^( FACTCOMPOSITE $fo)
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:105:8: ^( FACTCOMPOSITE $fo)
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
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:106:5: '(' fc1= factComposite ')' (op= logicalOperator fc2= factComposite )?
                    {
                    char_literal16=(Token)match(input,53,FOLLOW_53_in_factComposite523); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal16);

                    pushFollow(FOLLOW_factComposite_in_factComposite527);
                    fc1=factComposite();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_factComposite.add(fc1.getTree());
                    char_literal17=(Token)match(input,54,FOLLOW_54_in_factComposite529); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal17);

                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:106:31: (op= logicalOperator fc2= factComposite )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=55 && LA6_0<=56)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:106:32: op= logicalOperator fc2= factComposite
                            {
                            pushFollow(FOLLOW_logicalOperator_in_factComposite534);
                            op=logicalOperator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_logicalOperator.add(op.getTree());
                            pushFollow(FOLLOW_factComposite_in_factComposite538);
                            fc2=factComposite();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_factComposite.add(fc2.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: 55, fc2, fc1, 56, fc2, fc1, fc1
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
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:107:48: ^( 'And' $fc1 $fc2)
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
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:108:47: ^( 'Or' $fc1 $fc2)
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
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:109:8: ^( FACTCOMPOSITE $fc1)
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:112:1: logicalOperator returns [String value] : ( 'And' | 'Or' );
    public final LetaGrammarParser.logicalOperator_return logicalOperator() throws RecognitionException {
        LetaGrammarParser.logicalOperator_return retval = new LetaGrammarParser.logicalOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal18=null;
        Token string_literal19=null;

        Object string_literal18_tree=null;
        Object string_literal19_tree=null;

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:113:3: ( 'And' | 'Or' )
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
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:113:5: 'And'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal18=(Token)match(input,55,FOLLOW_55_in_logicalOperator606); if (state.failed) return retval;
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
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:115:5: 'Or'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal19=(Token)match(input,56,FOLLOW_56_in_logicalOperator618); if (state.failed) return retval;
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:119:1: fact : tc= termComposite c= complement (tc2= termComposite (fe= factExt )? )? -> ^( FACT $tc $c ( $tc2 ( $fe)? )? ) ;
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:120:3: (tc= termComposite c= complement (tc2= termComposite (fe= factExt )? )? -> ^( FACT $tc $c ( $tc2 ( $fe)? )? ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:120:5: tc= termComposite c= complement (tc2= termComposite (fe= factExt )? )?
            {
            pushFollow(FOLLOW_termComposite_in_fact639);
            tc=termComposite();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_termComposite.add(tc.getTree());
            pushFollow(FOLLOW_complement_in_fact643);
            c=complement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_complement.add(c.getTree());
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:120:35: (tc2= termComposite (fe= factExt )? )?
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:120:36: tc2= termComposite (fe= factExt )?
                    {
                    pushFollow(FOLLOW_termComposite_in_fact648);
                    tc2=termComposite();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_termComposite.add(tc2.getTree());
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:120:56: (fe= factExt )?
                    int alt9=2;
                    alt9 = dfa9.predict(input);
                    switch (alt9) {
                        case 1 :
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:0:0: fe= factExt
                            {
                            pushFollow(FOLLOW_factExt_in_fact652);
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
            // 121:5: -> ^( FACT $tc $c ( $tc2 ( $fe)? )? )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:121:8: ^( FACT $tc $c ( $tc2 ( $fe)? )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FACT, "FACT"), root_1);

                adaptor.addChild(root_1, stream_tc.nextTree());
                adaptor.addChild(root_1, stream_c.nextTree());
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:121:22: ( $tc2 ( $fe)? )?
                if ( stream_fe.hasNext()||stream_tc2.hasNext() ) {
                    adaptor.addChild(root_1, stream_tc2.nextTree());
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:121:28: ( $fe)?
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:124:1: factExt : ( ',' termComposite ( factExt )? -> ^( FACTEXT SEPARATOR termComposite ( factExt )? ) | complement ( termComposite ( factExt )? )? -> ^( FACTEXT complement ( termComposite ( factExt )? )? ) );
    public final LetaGrammarParser.factExt_return factExt() throws RecognitionException {
        LetaGrammarParser.factExt_return retval = new LetaGrammarParser.factExt_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal20=null;
        LetaGrammarParser.termComposite_return termComposite21 = null;

        LetaGrammarParser.factExt_return factExt22 = null;

        LetaGrammarParser.complement_return complement23 = null;

        LetaGrammarParser.termComposite_return termComposite24 = null;

        LetaGrammarParser.factExt_return factExt25 = null;


        Object char_literal20_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_complement=new RewriteRuleSubtreeStream(adaptor,"rule complement");
        RewriteRuleSubtreeStream stream_factExt=new RewriteRuleSubtreeStream(adaptor,"rule factExt");
        RewriteRuleSubtreeStream stream_termComposite=new RewriteRuleSubtreeStream(adaptor,"rule termComposite");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:125:3: ( ',' termComposite ( factExt )? -> ^( FACTEXT SEPARATOR termComposite ( factExt )? ) | complement ( termComposite ( factExt )? )? -> ^( FACTEXT complement ( termComposite ( factExt )? )? ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==57) ) {
                alt14=1;
            }
            else if ( (LA14_0==ID) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:125:5: ',' termComposite ( factExt )?
                    {
                    char_literal20=(Token)match(input,57,FOLLOW_57_in_factExt694); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal20);

                    pushFollow(FOLLOW_termComposite_in_factExt696);
                    termComposite21=termComposite();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_termComposite.add(termComposite21.getTree());
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:125:23: ( factExt )?
                    int alt11=2;
                    alt11 = dfa11.predict(input);
                    switch (alt11) {
                        case 1 :
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:0:0: factExt
                            {
                            pushFollow(FOLLOW_factExt_in_factExt698);
                            factExt22=factExt();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_factExt.add(factExt22.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: termComposite, factExt
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 126:5: -> ^( FACTEXT SEPARATOR termComposite ( factExt )? )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:126:8: ^( FACTEXT SEPARATOR termComposite ( factExt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FACTEXT, "FACTEXT"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(SEPARATOR, "SEPARATOR"));
                        adaptor.addChild(root_1, stream_termComposite.nextTree());
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:126:42: ( factExt )?
                        if ( stream_factExt.hasNext() ) {
                            adaptor.addChild(root_1, stream_factExt.nextTree());

                        }
                        stream_factExt.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:127:5: complement ( termComposite ( factExt )? )?
                    {
                    pushFollow(FOLLOW_complement_in_factExt722);
                    complement23=complement();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_complement.add(complement23.getTree());
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:127:16: ( termComposite ( factExt )? )?
                    int alt13=2;
                    alt13 = dfa13.predict(input);
                    switch (alt13) {
                        case 1 :
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:127:17: termComposite ( factExt )?
                            {
                            pushFollow(FOLLOW_termComposite_in_factExt725);
                            termComposite24=termComposite();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_termComposite.add(termComposite24.getTree());
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:127:31: ( factExt )?
                            int alt12=2;
                            alt12 = dfa12.predict(input);
                            switch (alt12) {
                                case 1 :
                                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:0:0: factExt
                                    {
                                    pushFollow(FOLLOW_factExt_in_factExt727);
                                    factExt25=factExt();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_factExt.add(factExt25.getTree());

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
                    // 128:5: -> ^( FACTEXT complement ( termComposite ( factExt )? )? )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:128:8: ^( FACTEXT complement ( termComposite ( factExt )? )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FACTEXT, "FACTEXT"), root_1);

                        adaptor.addChild(root_1, stream_complement.nextTree());
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:128:29: ( termComposite ( factExt )? )?
                        if ( stream_factExt.hasNext()||stream_termComposite.hasNext() ) {
                            adaptor.addChild(root_1, stream_termComposite.nextTree());
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:128:44: ( factExt )?
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
    // $ANTLR end "factExt"

    public static class termComposite_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "termComposite"
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:131:1: termComposite : ( quantifier )? (t= term | ti= termInstance | twa= termWithAssociation ) -> {t != null}? ^( TERMCOMPOSITE ( quantifier )? term ) -> {ti != null}? ^( TERMCOMPOSITE ( quantifier )? termInstance ) -> ^( TERMCOMPOSITE ( quantifier )? termWithAssociation ) ;
    public final LetaGrammarParser.termComposite_return termComposite() throws RecognitionException {
        LetaGrammarParser.termComposite_return retval = new LetaGrammarParser.termComposite_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LetaGrammarParser.term_return t = null;

        LetaGrammarParser.termInstance_return ti = null;

        LetaGrammarParser.termWithAssociation_return twa = null;

        LetaGrammarParser.quantifier_return quantifier26 = null;


        RewriteRuleSubtreeStream stream_quantifier=new RewriteRuleSubtreeStream(adaptor,"rule quantifier");
        RewriteRuleSubtreeStream stream_termWithAssociation=new RewriteRuleSubtreeStream(adaptor,"rule termWithAssociation");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_termInstance=new RewriteRuleSubtreeStream(adaptor,"rule termInstance");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:132:3: ( ( quantifier )? (t= term | ti= termInstance | twa= termWithAssociation ) -> {t != null}? ^( TERMCOMPOSITE ( quantifier )? term ) -> {ti != null}? ^( TERMCOMPOSITE ( quantifier )? termInstance ) -> ^( TERMCOMPOSITE ( quantifier )? termWithAssociation ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:132:5: ( quantifier )? (t= term | ti= termInstance | twa= termWithAssociation )
            {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:132:5: ( quantifier )?
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:0:0: quantifier
                    {
                    pushFollow(FOLLOW_quantifier_in_termComposite763);
                    quantifier26=quantifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_quantifier.add(quantifier26.getTree());

                    }
                    break;

            }

            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:132:17: (t= term | ti= termInstance | twa= termWithAssociation )
            int alt16=3;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:132:18: t= term
                    {
                    pushFollow(FOLLOW_term_in_termComposite769);
                    t=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_term.add(t.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:132:27: ti= termInstance
                    {
                    pushFollow(FOLLOW_termInstance_in_termComposite775);
                    ti=termInstance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_termInstance.add(ti.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:132:45: twa= termWithAssociation
                    {
                    pushFollow(FOLLOW_termWithAssociation_in_termComposite781);
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
            // 133:5: -> {t != null}? ^( TERMCOMPOSITE ( quantifier )? term )
            if (t != null) {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:133:21: ^( TERMCOMPOSITE ( quantifier )? term )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERMCOMPOSITE, "TERMCOMPOSITE"), root_1);

                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:133:37: ( quantifier )?
                if ( stream_quantifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_quantifier.nextTree());

                }
                stream_quantifier.reset();
                adaptor.addChild(root_1, stream_term.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 134:5: -> {ti != null}? ^( TERMCOMPOSITE ( quantifier )? termInstance )
            if (ti != null) {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:134:22: ^( TERMCOMPOSITE ( quantifier )? termInstance )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERMCOMPOSITE, "TERMCOMPOSITE"), root_1);

                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:134:38: ( quantifier )?
                if ( stream_quantifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_quantifier.nextTree());

                }
                stream_quantifier.reset();
                adaptor.addChild(root_1, stream_termInstance.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }
            else // 135:5: -> ^( TERMCOMPOSITE ( quantifier )? termWithAssociation )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:135:8: ^( TERMCOMPOSITE ( quantifier )? termWithAssociation )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERMCOMPOSITE, "TERMCOMPOSITE"), root_1);

                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:135:24: ( quantifier )?
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:138:1: term : ID -> ^( TERM ID ) ;
    public final LetaGrammarParser.term_return term() throws RecognitionException {
        LetaGrammarParser.term_return retval = new LetaGrammarParser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID27=null;

        Object ID27_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:139:3: ( ID -> ^( TERM ID ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:139:5: ID
            {
            ID27=(Token)match(input,ID,FOLLOW_ID_in_term844); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID27);



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
            // 140:5: -> ^( TERM ID )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:140:8: ^( TERM ID )
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:143:1: termInstance : term ( relationalOperator )? literal -> ^( TERMINSTANCE term ( relationalOperator )? literal ) ;
    public final LetaGrammarParser.termInstance_return termInstance() throws RecognitionException {
        LetaGrammarParser.termInstance_return retval = new LetaGrammarParser.termInstance_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LetaGrammarParser.term_return term28 = null;

        LetaGrammarParser.relationalOperator_return relationalOperator29 = null;

        LetaGrammarParser.literal_return literal30 = null;


        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_relationalOperator=new RewriteRuleSubtreeStream(adaptor,"rule relationalOperator");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:144:3: ( term ( relationalOperator )? literal -> ^( TERMINSTANCE term ( relationalOperator )? literal ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:144:5: term ( relationalOperator )? literal
            {
            pushFollow(FOLLOW_term_in_termInstance869);
            term28=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_term.add(term28.getTree());
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:144:10: ( relationalOperator )?
            int alt17=2;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:0:0: relationalOperator
                    {
                    pushFollow(FOLLOW_relationalOperator_in_termInstance871);
                    relationalOperator29=relationalOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relationalOperator.add(relationalOperator29.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_literal_in_termInstance874);
            literal30=literal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_literal.add(literal30.getTree());


            // AST REWRITE
            // elements: relationalOperator, literal, term
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 145:5: -> ^( TERMINSTANCE term ( relationalOperator )? literal )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:145:8: ^( TERMINSTANCE term ( relationalOperator )? literal )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERMINSTANCE, "TERMINSTANCE"), root_1);

                adaptor.addChild(root_1, stream_term.nextTree());
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:145:28: ( relationalOperator )?
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:148:1: termWithAssociation : term ( relationalOperator )? '@' INT -> ^( TERMWITHASSOCIATION term ( relationalOperator )? INT ) ;
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
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_relationalOperator=new RewriteRuleSubtreeStream(adaptor,"rule relationalOperator");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:149:3: ( term ( relationalOperator )? '@' INT -> ^( TERMWITHASSOCIATION term ( relationalOperator )? INT ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:149:5: term ( relationalOperator )? '@' INT
            {
            pushFollow(FOLLOW_term_in_termWithAssociation904);
            term31=term();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_term.add(term31.getTree());
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:149:10: ( relationalOperator )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=76 && LA18_0<=80)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:0:0: relationalOperator
                    {
                    pushFollow(FOLLOW_relationalOperator_in_termWithAssociation906);
                    relationalOperator32=relationalOperator();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_relationalOperator.add(relationalOperator32.getTree());

                    }
                    break;

            }

            char_literal33=(Token)match(input,58,FOLLOW_58_in_termWithAssociation909); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_58.add(char_literal33);

            INT34=(Token)match(input,INT,FOLLOW_INT_in_termWithAssociation911); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_INT.add(INT34);



            // AST REWRITE
            // elements: term, INT, relationalOperator
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
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:150:8: ^( TERMWITHASSOCIATION term ( relationalOperator )? INT )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERMWITHASSOCIATION, "TERMWITHASSOCIATION"), root_1);

                adaptor.addChild(root_1, stream_term.nextTree());
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:150:35: ( relationalOperator )?
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:153:1: quantifier : ( 'each' -> ^( QUANTIFIER 'each' ) | 'some' -> ^( QUANTIFIER 'some' ) | 'atLeastOne' -> ^( QUANTIFIER 'atLeastOne' ) | 'atLeast' INT -> ^( QUANTIFIER 'atLeast' INT ) | 'atMostOne' -> ^( QUANTIFIER 'atMostOne' ) | 'atMost' INT -> ^( QUANTIFIER 'atMost' INT ) | 'exactlyOne' -> ^( QUANTIFIER 'exactlyOne' ) | 'exactly' INT -> ^( QUANTIFIER 'exactly' INT ) | 'moreThanOne' -> ^( QUANTIFIER 'moreThanOne' ) | 'atLeastAndAtMost' i1= INT i2= INT -> ^( QUANTIFIER 'atLeastAndAtMost' $i1 $i2) );
    public final LetaGrammarParser.quantifier_return quantifier() throws RecognitionException {
        LetaGrammarParser.quantifier_return retval = new LetaGrammarParser.quantifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token i1=null;
        Token i2=null;
        Token string_literal35=null;
        Token string_literal36=null;
        Token string_literal37=null;
        Token string_literal38=null;
        Token INT39=null;
        Token string_literal40=null;
        Token string_literal41=null;
        Token INT42=null;
        Token string_literal43=null;
        Token string_literal44=null;
        Token INT45=null;
        Token string_literal46=null;
        Token string_literal47=null;

        Object i1_tree=null;
        Object i2_tree=null;
        Object string_literal35_tree=null;
        Object string_literal36_tree=null;
        Object string_literal37_tree=null;
        Object string_literal38_tree=null;
        Object INT39_tree=null;
        Object string_literal40_tree=null;
        Object string_literal41_tree=null;
        Object INT42_tree=null;
        Object string_literal43_tree=null;
        Object string_literal44_tree=null;
        Object INT45_tree=null;
        Object string_literal46_tree=null;
        Object string_literal47_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:154:3: ( 'each' -> ^( QUANTIFIER 'each' ) | 'some' -> ^( QUANTIFIER 'some' ) | 'atLeastOne' -> ^( QUANTIFIER 'atLeastOne' ) | 'atLeast' INT -> ^( QUANTIFIER 'atLeast' INT ) | 'atMostOne' -> ^( QUANTIFIER 'atMostOne' ) | 'atMost' INT -> ^( QUANTIFIER 'atMost' INT ) | 'exactlyOne' -> ^( QUANTIFIER 'exactlyOne' ) | 'exactly' INT -> ^( QUANTIFIER 'exactly' INT ) | 'moreThanOne' -> ^( QUANTIFIER 'moreThanOne' ) | 'atLeastAndAtMost' i1= INT i2= INT -> ^( QUANTIFIER 'atLeastAndAtMost' $i1 $i2) )
            int alt19=10;
            alt19 = dfa19.predict(input);
            switch (alt19) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:154:5: 'each'
                    {
                    string_literal35=(Token)match(input,59,FOLLOW_59_in_quantifier943); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_59.add(string_literal35);



                    // AST REWRITE
                    // elements: 59
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 155:5: -> ^( QUANTIFIER 'each' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:155:8: ^( QUANTIFIER 'each' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_59.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:156:5: 'some'
                    {
                    string_literal36=(Token)match(input,60,FOLLOW_60_in_quantifier961); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_60.add(string_literal36);



                    // AST REWRITE
                    // elements: 60
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 157:5: -> ^( QUANTIFIER 'some' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:157:8: ^( QUANTIFIER 'some' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_60.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:158:5: 'atLeastOne'
                    {
                    string_literal37=(Token)match(input,61,FOLLOW_61_in_quantifier979); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_61.add(string_literal37);



                    // AST REWRITE
                    // elements: 61
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 159:5: -> ^( QUANTIFIER 'atLeastOne' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:159:8: ^( QUANTIFIER 'atLeastOne' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_61.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:160:5: 'atLeast' INT
                    {
                    string_literal38=(Token)match(input,62,FOLLOW_62_in_quantifier997); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_62.add(string_literal38);

                    INT39=(Token)match(input,INT,FOLLOW_INT_in_quantifier999); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(INT39);



                    // AST REWRITE
                    // elements: INT, 62
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 161:5: -> ^( QUANTIFIER 'atLeast' INT )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:161:8: ^( QUANTIFIER 'atLeast' INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_62.nextNode());
                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:162:5: 'atMostOne'
                    {
                    string_literal40=(Token)match(input,63,FOLLOW_63_in_quantifier1019); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_63.add(string_literal40);



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
                    // 163:5: -> ^( QUANTIFIER 'atMostOne' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:163:8: ^( QUANTIFIER 'atMostOne' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_63.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:164:5: 'atMost' INT
                    {
                    string_literal41=(Token)match(input,64,FOLLOW_64_in_quantifier1037); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_64.add(string_literal41);

                    INT42=(Token)match(input,INT,FOLLOW_INT_in_quantifier1039); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(INT42);



                    // AST REWRITE
                    // elements: INT, 64
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 165:5: -> ^( QUANTIFIER 'atMost' INT )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:165:8: ^( QUANTIFIER 'atMost' INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_64.nextNode());
                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 7 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:166:5: 'exactlyOne'
                    {
                    string_literal43=(Token)match(input,65,FOLLOW_65_in_quantifier1059); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_65.add(string_literal43);



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
                    // 167:5: -> ^( QUANTIFIER 'exactlyOne' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:167:8: ^( QUANTIFIER 'exactlyOne' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_65.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 8 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:168:5: 'exactly' INT
                    {
                    string_literal44=(Token)match(input,66,FOLLOW_66_in_quantifier1077); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_66.add(string_literal44);

                    INT45=(Token)match(input,INT,FOLLOW_INT_in_quantifier1079); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(INT45);



                    // AST REWRITE
                    // elements: INT, 66
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 169:5: -> ^( QUANTIFIER 'exactly' INT )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:169:8: ^( QUANTIFIER 'exactly' INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_66.nextNode());
                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 9 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:170:5: 'moreThanOne'
                    {
                    string_literal46=(Token)match(input,67,FOLLOW_67_in_quantifier1099); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_67.add(string_literal46);



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
                    // 171:5: -> ^( QUANTIFIER 'moreThanOne' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:171:8: ^( QUANTIFIER 'moreThanOne' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_67.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 10 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:172:5: 'atLeastAndAtMost' i1= INT i2= INT
                    {
                    string_literal47=(Token)match(input,68,FOLLOW_68_in_quantifier1117); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_68.add(string_literal47);

                    i1=(Token)match(input,INT,FOLLOW_INT_in_quantifier1121); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(i1);

                    i2=(Token)match(input,INT,FOLLOW_INT_in_quantifier1125); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(i2);



                    // AST REWRITE
                    // elements: i2, 68, i1
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
                    // 173:5: -> ^( QUANTIFIER 'atLeastAndAtMost' $i1 $i2)
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:173:8: ^( QUANTIFIER 'atLeastAndAtMost' $i1 $i2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_68.nextNode());
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:176:1: complement : ID -> ^( COMPLEMENT ID ) ;
    public final LetaGrammarParser.complement_return complement() throws RecognitionException {
        LetaGrammarParser.complement_return retval = new LetaGrammarParser.complement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID48=null;

        Object ID48_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:177:3: ( ID -> ^( COMPLEMENT ID ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:177:5: ID
            {
            ID48=(Token)match(input,ID,FOLLOW_ID_in_complement1156); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_ID.add(ID48);



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
            // 178:5: -> ^( COMPLEMENT ID )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:178:8: ^( COMPLEMENT ID )
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:181:1: formula : formulaItem '=' formulaExpression -> ^( FORMULA formulaItem formulaExpression ) ;
    public final LetaGrammarParser.formula_return formula() throws RecognitionException {
        LetaGrammarParser.formula_return retval = new LetaGrammarParser.formula_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal50=null;
        LetaGrammarParser.formulaItem_return formulaItem49 = null;

        LetaGrammarParser.formulaExpression_return formulaExpression51 = null;


        Object char_literal50_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleSubtreeStream stream_formulaExpression=new RewriteRuleSubtreeStream(adaptor,"rule formulaExpression");
        RewriteRuleSubtreeStream stream_formulaItem=new RewriteRuleSubtreeStream(adaptor,"rule formulaItem");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:182:3: ( formulaItem '=' formulaExpression -> ^( FORMULA formulaItem formulaExpression ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:182:5: formulaItem '=' formulaExpression
            {
            pushFollow(FOLLOW_formulaItem_in_formula1181);
            formulaItem49=formulaItem();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_formulaItem.add(formulaItem49.getTree());
            char_literal50=(Token)match(input,69,FOLLOW_69_in_formula1183); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_69.add(char_literal50);

            pushFollow(FOLLOW_formulaExpression_in_formula1185);
            formulaExpression51=formulaExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_formulaExpression.add(formulaExpression51.getTree());


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
            // 183:5: -> ^( FORMULA formulaItem formulaExpression )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:183:8: ^( FORMULA formulaItem formulaExpression )
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:186:1: formulaExpression : ( formulaItem ( mathOperator formulaExpression )? -> ^( FORMULAEXPRESSION formulaItem ( mathOperator formulaExpression )? ) | '(' formulaExpression ')' ( mathOperator formulaExpression )? -> ^( FORMULAEXPRESSION formulaExpression ( mathOperator formulaExpression )? ) );
    public final LetaGrammarParser.formulaExpression_return formulaExpression() throws RecognitionException {
        LetaGrammarParser.formulaExpression_return retval = new LetaGrammarParser.formulaExpression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal55=null;
        Token char_literal57=null;
        LetaGrammarParser.formulaItem_return formulaItem52 = null;

        LetaGrammarParser.mathOperator_return mathOperator53 = null;

        LetaGrammarParser.formulaExpression_return formulaExpression54 = null;

        LetaGrammarParser.formulaExpression_return formulaExpression56 = null;

        LetaGrammarParser.mathOperator_return mathOperator58 = null;

        LetaGrammarParser.formulaExpression_return formulaExpression59 = null;


        Object char_literal55_tree=null;
        Object char_literal57_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_formulaExpression=new RewriteRuleSubtreeStream(adaptor,"rule formulaExpression");
        RewriteRuleSubtreeStream stream_mathOperator=new RewriteRuleSubtreeStream(adaptor,"rule mathOperator");
        RewriteRuleSubtreeStream stream_formulaItem=new RewriteRuleSubtreeStream(adaptor,"rule formulaItem");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:187:3: ( formulaItem ( mathOperator formulaExpression )? -> ^( FORMULAEXPRESSION formulaItem ( mathOperator formulaExpression )? ) | '(' formulaExpression ')' ( mathOperator formulaExpression )? -> ^( FORMULAEXPRESSION formulaExpression ( mathOperator formulaExpression )? ) )
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
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:187:5: formulaItem ( mathOperator formulaExpression )?
                    {
                    pushFollow(FOLLOW_formulaItem_in_formulaExpression1212);
                    formulaItem52=formulaItem();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formulaItem.add(formulaItem52.getTree());
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:187:17: ( mathOperator formulaExpression )?
                    int alt20=2;
                    alt20 = dfa20.predict(input);
                    switch (alt20) {
                        case 1 :
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:187:18: mathOperator formulaExpression
                            {
                            pushFollow(FOLLOW_mathOperator_in_formulaExpression1215);
                            mathOperator53=mathOperator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_mathOperator.add(mathOperator53.getTree());
                            pushFollow(FOLLOW_formulaExpression_in_formulaExpression1217);
                            formulaExpression54=formulaExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formulaExpression.add(formulaExpression54.getTree());

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
                    // 188:5: -> ^( FORMULAEXPRESSION formulaItem ( mathOperator formulaExpression )? )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:188:8: ^( FORMULAEXPRESSION formulaItem ( mathOperator formulaExpression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMULAEXPRESSION, "FORMULAEXPRESSION"), root_1);

                        adaptor.addChild(root_1, stream_formulaItem.nextTree());
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:188:40: ( mathOperator formulaExpression )?
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
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:189:5: '(' formulaExpression ')' ( mathOperator formulaExpression )?
                    {
                    char_literal55=(Token)match(input,53,FOLLOW_53_in_formulaExpression1244); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_53.add(char_literal55);

                    pushFollow(FOLLOW_formulaExpression_in_formulaExpression1246);
                    formulaExpression56=formulaExpression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_formulaExpression.add(formulaExpression56.getTree());
                    char_literal57=(Token)match(input,54,FOLLOW_54_in_formulaExpression1248); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_54.add(char_literal57);

                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:189:31: ( mathOperator formulaExpression )?
                    int alt21=2;
                    alt21 = dfa21.predict(input);
                    switch (alt21) {
                        case 1 :
                            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:189:32: mathOperator formulaExpression
                            {
                            pushFollow(FOLLOW_mathOperator_in_formulaExpression1251);
                            mathOperator58=mathOperator();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_mathOperator.add(mathOperator58.getTree());
                            pushFollow(FOLLOW_formulaExpression_in_formulaExpression1253);
                            formulaExpression59=formulaExpression();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_formulaExpression.add(formulaExpression59.getTree());

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
                    // 190:5: -> ^( FORMULAEXPRESSION formulaExpression ( mathOperator formulaExpression )? )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:190:8: ^( FORMULAEXPRESSION formulaExpression ( mathOperator formulaExpression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMULAEXPRESSION, "FORMULAEXPRESSION"), root_1);

                        adaptor.addChild(root_1, stream_formulaExpression.nextTree());
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:190:46: ( mathOperator formulaExpression )?
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:193:1: formulaItem : ( term | termInstance | termWithAssociation ) -> ^( FORMULAITEM ( term )? ( termInstance )? ( termWithAssociation )? ) ;
    public final LetaGrammarParser.formulaItem_return formulaItem() throws RecognitionException {
        LetaGrammarParser.formulaItem_return retval = new LetaGrammarParser.formulaItem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LetaGrammarParser.term_return term60 = null;

        LetaGrammarParser.termInstance_return termInstance61 = null;

        LetaGrammarParser.termWithAssociation_return termWithAssociation62 = null;


        RewriteRuleSubtreeStream stream_termWithAssociation=new RewriteRuleSubtreeStream(adaptor,"rule termWithAssociation");
        RewriteRuleSubtreeStream stream_term=new RewriteRuleSubtreeStream(adaptor,"rule term");
        RewriteRuleSubtreeStream stream_termInstance=new RewriteRuleSubtreeStream(adaptor,"rule termInstance");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:194:3: ( ( term | termInstance | termWithAssociation ) -> ^( FORMULAITEM ( term )? ( termInstance )? ( termWithAssociation )? ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:194:5: ( term | termInstance | termWithAssociation )
            {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:194:5: ( term | termInstance | termWithAssociation )
            int alt23=3;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:194:6: term
                    {
                    pushFollow(FOLLOW_term_in_formulaItem1289);
                    term60=term();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_term.add(term60.getTree());

                    }
                    break;
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:194:13: termInstance
                    {
                    pushFollow(FOLLOW_termInstance_in_formulaItem1293);
                    termInstance61=termInstance();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_termInstance.add(termInstance61.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:194:28: termWithAssociation
                    {
                    pushFollow(FOLLOW_termWithAssociation_in_formulaItem1297);
                    termWithAssociation62=termWithAssociation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_termWithAssociation.add(termWithAssociation62.getTree());

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
            // 195:5: -> ^( FORMULAITEM ( term )? ( termInstance )? ( termWithAssociation )? )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:195:8: ^( FORMULAITEM ( term )? ( termInstance )? ( termWithAssociation )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMULAITEM, "FORMULAITEM"), root_1);

                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:195:22: ( term )?
                if ( stream_term.hasNext() ) {
                    adaptor.addChild(root_1, stream_term.nextTree());

                }
                stream_term.reset();
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:195:28: ( termInstance )?
                if ( stream_termInstance.hasNext() ) {
                    adaptor.addChild(root_1, stream_termInstance.nextTree());

                }
                stream_termInstance.reset();
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:195:42: ( termWithAssociation )?
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:198:1: mathOperator : ( '+' -> ^( OPERATOR '+' ) | '-' -> ^( OPERATOR '-' ) | '/' -> ^( OPERATOR '/' ) | '*' -> ^( OPERATOR '*' ) | '%' -> ^( OPERATOR '%' ) | '**' -> ^( OPERATOR '**' ) );
    public final LetaGrammarParser.mathOperator_return mathOperator() throws RecognitionException {
        LetaGrammarParser.mathOperator_return retval = new LetaGrammarParser.mathOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal63=null;
        Token char_literal64=null;
        Token char_literal65=null;
        Token char_literal66=null;
        Token char_literal67=null;
        Token string_literal68=null;

        Object char_literal63_tree=null;
        Object char_literal64_tree=null;
        Object char_literal65_tree=null;
        Object char_literal66_tree=null;
        Object char_literal67_tree=null;
        Object string_literal68_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:199:3: ( '+' -> ^( OPERATOR '+' ) | '-' -> ^( OPERATOR '-' ) | '/' -> ^( OPERATOR '/' ) | '*' -> ^( OPERATOR '*' ) | '%' -> ^( OPERATOR '%' ) | '**' -> ^( OPERATOR '**' ) )
            int alt24=6;
            switch ( input.LA(1) ) {
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
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:199:5: '+'
                    {
                    char_literal63=(Token)match(input,70,FOLLOW_70_in_mathOperator1330); if (state.failed) return retval; 
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
                    // 200:5: -> ^( OPERATOR '+' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:200:8: ^( OPERATOR '+' )
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
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:201:5: '-'
                    {
                    char_literal64=(Token)match(input,71,FOLLOW_71_in_mathOperator1348); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_71.add(char_literal64);



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
                    // 202:5: -> ^( OPERATOR '-' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:202:8: ^( OPERATOR '-' )
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
                case 3 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:203:5: '/'
                    {
                    char_literal65=(Token)match(input,72,FOLLOW_72_in_mathOperator1366); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_72.add(char_literal65);



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
                    // 204:5: -> ^( OPERATOR '/' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:204:8: ^( OPERATOR '/' )
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
                case 4 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:205:5: '*'
                    {
                    char_literal66=(Token)match(input,73,FOLLOW_73_in_mathOperator1384); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_73.add(char_literal66);



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
                    // 206:5: -> ^( OPERATOR '*' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:206:8: ^( OPERATOR '*' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_73.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:207:5: '%'
                    {
                    char_literal67=(Token)match(input,74,FOLLOW_74_in_mathOperator1402); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_74.add(char_literal67);



                    // AST REWRITE
                    // elements: 74
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 208:5: -> ^( OPERATOR '%' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:208:8: ^( OPERATOR '%' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_74.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:209:5: '**'
                    {
                    string_literal68=(Token)match(input,75,FOLLOW_75_in_mathOperator1420); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_75.add(string_literal68);



                    // AST REWRITE
                    // elements: 75
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 210:5: -> ^( OPERATOR '**' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:210:8: ^( OPERATOR '**' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_75.nextNode());

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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:213:1: relationalOperator : ( '>' -> ^( OPERATOR '>' ) | '<' -> ^( OPERATOR '<' ) | '>=' -> ^( OPERATOR '>=' ) | '<=' -> ^( OPERATOR '<=' ) | '!=' -> ^( OPERATOR '!=' ) );
    public final LetaGrammarParser.relationalOperator_return relationalOperator() throws RecognitionException {
        LetaGrammarParser.relationalOperator_return retval = new LetaGrammarParser.relationalOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal69=null;
        Token char_literal70=null;
        Token string_literal71=null;
        Token string_literal72=null;
        Token string_literal73=null;

        Object char_literal69_tree=null;
        Object char_literal70_tree=null;
        Object string_literal71_tree=null;
        Object string_literal72_tree=null;
        Object string_literal73_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:214:3: ( '>' -> ^( OPERATOR '>' ) | '<' -> ^( OPERATOR '<' ) | '>=' -> ^( OPERATOR '>=' ) | '<=' -> ^( OPERATOR '<=' ) | '!=' -> ^( OPERATOR '!=' ) )
            int alt25=5;
            switch ( input.LA(1) ) {
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
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:214:5: '>'
                    {
                    char_literal69=(Token)match(input,76,FOLLOW_76_in_relationalOperator1445); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_76.add(char_literal69);



                    // AST REWRITE
                    // elements: 76
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 215:5: -> ^( OPERATOR '>' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:215:8: ^( OPERATOR '>' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_76.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:216:5: '<'
                    {
                    char_literal70=(Token)match(input,77,FOLLOW_77_in_relationalOperator1463); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_77.add(char_literal70);



                    // AST REWRITE
                    // elements: 77
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 217:5: -> ^( OPERATOR '<' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:217:8: ^( OPERATOR '<' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_77.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:218:5: '>='
                    {
                    string_literal71=(Token)match(input,78,FOLLOW_78_in_relationalOperator1481); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_78.add(string_literal71);



                    // AST REWRITE
                    // elements: 78
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 219:5: -> ^( OPERATOR '>=' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:219:8: ^( OPERATOR '>=' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_78.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:220:5: '<='
                    {
                    string_literal72=(Token)match(input,79,FOLLOW_79_in_relationalOperator1499); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_79.add(string_literal72);



                    // AST REWRITE
                    // elements: 79
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 221:5: -> ^( OPERATOR '<=' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:221:8: ^( OPERATOR '<=' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_79.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:222:5: '!='
                    {
                    string_literal73=(Token)match(input,80,FOLLOW_80_in_relationalOperator1517); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_80.add(string_literal73);



                    // AST REWRITE
                    // elements: 80
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 223:5: -> ^( OPERATOR '!=' )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:223:8: ^( OPERATOR '!=' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_80.nextNode());

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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:226:1: set : '{' subSet '}' ( ',' set )? -> ^( SET subSet ( set )? ) ;
    public final LetaGrammarParser.set_return set() throws RecognitionException {
        LetaGrammarParser.set_return retval = new LetaGrammarParser.set_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal74=null;
        Token char_literal76=null;
        Token char_literal77=null;
        LetaGrammarParser.subSet_return subSet75 = null;

        LetaGrammarParser.set_return set78 = null;


        Object char_literal74_tree=null;
        Object char_literal76_tree=null;
        Object char_literal77_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_set=new RewriteRuleSubtreeStream(adaptor,"rule set");
        RewriteRuleSubtreeStream stream_subSet=new RewriteRuleSubtreeStream(adaptor,"rule subSet");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:227:3: ( '{' subSet '}' ( ',' set )? -> ^( SET subSet ( set )? ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:227:5: '{' subSet '}' ( ',' set )?
            {
            char_literal74=(Token)match(input,51,FOLLOW_51_in_set1542); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_51.add(char_literal74);

            pushFollow(FOLLOW_subSet_in_set1544);
            subSet75=subSet();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_subSet.add(subSet75.getTree());
            char_literal76=(Token)match(input,52,FOLLOW_52_in_set1546); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_52.add(char_literal76);

            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:227:20: ( ',' set )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==57) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:227:21: ',' set
                    {
                    char_literal77=(Token)match(input,57,FOLLOW_57_in_set1549); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal77);

                    pushFollow(FOLLOW_set_in_set1551);
                    set78=set();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_set.add(set78.getTree());

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
            // 228:5: -> ^( SET subSet ( set )? )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:228:8: ^( SET subSet ( set )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SET, "SET"), root_1);

                adaptor.addChild(root_1, stream_subSet.nextTree());
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:228:21: ( set )?
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:231:1: subSet : literal ( ',' subSet )? -> ^( SUBSET literal ( subSet )? ) ;
    public final LetaGrammarParser.subSet_return subSet() throws RecognitionException {
        LetaGrammarParser.subSet_return retval = new LetaGrammarParser.subSet_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal80=null;
        LetaGrammarParser.literal_return literal79 = null;

        LetaGrammarParser.subSet_return subSet81 = null;


        Object char_literal80_tree=null;
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleSubtreeStream stream_subSet=new RewriteRuleSubtreeStream(adaptor,"rule subSet");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:232:3: ( literal ( ',' subSet )? -> ^( SUBSET literal ( subSet )? ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:232:5: literal ( ',' subSet )?
            {
            pushFollow(FOLLOW_literal_in_subSet1581);
            literal79=literal();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_literal.add(literal79.getTree());
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:232:13: ( ',' subSet )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==57) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:232:14: ',' subSet
                    {
                    char_literal80=(Token)match(input,57,FOLLOW_57_in_subSet1584); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_57.add(char_literal80);

                    pushFollow(FOLLOW_subSet_in_subSet1586);
                    subSet81=subSet();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_subSet.add(subSet81.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: literal, subSet
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 233:5: -> ^( SUBSET literal ( subSet )? )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:233:8: ^( SUBSET literal ( subSet )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SUBSET, "SUBSET"), root_1);

                adaptor.addChild(root_1, stream_literal.nextTree());
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:233:25: ( subSet )?
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:236:1: literal : ( STRING -> ^( LITERAL STRING ) | FLOAT -> ^( LITERAL FLOAT ) | MINUS_FLOAT -> ^( LITERAL MINUS_FLOAT ) | INT -> ^( LITERAL INT ) | MINUS_INT -> ^( LITERAL MINUS_INT ) | 'null' -> ^( LITERAL NULL ) );
    public final LetaGrammarParser.literal_return literal() throws RecognitionException {
        LetaGrammarParser.literal_return retval = new LetaGrammarParser.literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING82=null;
        Token FLOAT83=null;
        Token MINUS_FLOAT84=null;
        Token INT85=null;
        Token MINUS_INT86=null;
        Token string_literal87=null;

        Object STRING82_tree=null;
        Object FLOAT83_tree=null;
        Object MINUS_FLOAT84_tree=null;
        Object INT85_tree=null;
        Object MINUS_INT86_tree=null;
        Object string_literal87_tree=null;
        RewriteRuleTokenStream stream_MINUS_INT=new RewriteRuleTokenStream(adaptor,"token MINUS_INT");
        RewriteRuleTokenStream stream_MINUS_FLOAT=new RewriteRuleTokenStream(adaptor,"token MINUS_FLOAT");
        RewriteRuleTokenStream stream_INT=new RewriteRuleTokenStream(adaptor,"token INT");
        RewriteRuleTokenStream stream_FLOAT=new RewriteRuleTokenStream(adaptor,"token FLOAT");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:237:3: ( STRING -> ^( LITERAL STRING ) | FLOAT -> ^( LITERAL FLOAT ) | MINUS_FLOAT -> ^( LITERAL MINUS_FLOAT ) | INT -> ^( LITERAL INT ) | MINUS_INT -> ^( LITERAL MINUS_INT ) | 'null' -> ^( LITERAL NULL ) )
            int alt28=6;
            switch ( input.LA(1) ) {
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
            case 81:
                {
                alt28=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:237:5: STRING
                    {
                    STRING82=(Token)match(input,STRING,FOLLOW_STRING_in_literal1616); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STRING.add(STRING82);



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
                    // 238:5: -> ^( LITERAL STRING )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:238:8: ^( LITERAL STRING )
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
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:239:5: FLOAT
                    {
                    FLOAT83=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_literal1634); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_FLOAT.add(FLOAT83);



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
                    // 240:5: -> ^( LITERAL FLOAT )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:240:8: ^( LITERAL FLOAT )
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
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:241:5: MINUS_FLOAT
                    {
                    MINUS_FLOAT84=(Token)match(input,MINUS_FLOAT,FOLLOW_MINUS_FLOAT_in_literal1652); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS_FLOAT.add(MINUS_FLOAT84);



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
                    // 242:5: -> ^( LITERAL MINUS_FLOAT )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:242:8: ^( LITERAL MINUS_FLOAT )
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
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:243:5: INT
                    {
                    INT85=(Token)match(input,INT,FOLLOW_INT_in_literal1670); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_INT.add(INT85);



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
                    // 244:5: -> ^( LITERAL INT )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:244:8: ^( LITERAL INT )
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
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:245:5: MINUS_INT
                    {
                    MINUS_INT86=(Token)match(input,MINUS_INT,FOLLOW_MINUS_INT_in_literal1688); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_MINUS_INT.add(MINUS_INT86);



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
                    // 246:5: -> ^( LITERAL MINUS_INT )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:246:8: ^( LITERAL MINUS_INT )
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
                    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:247:5: 'null'
                    {
                    string_literal87=(Token)match(input,81,FOLLOW_81_in_literal1706); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_81.add(string_literal87);



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
                    // 248:5: -> ^( LITERAL NULL )
                    {
                        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:248:8: ^( LITERAL NULL )
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
    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:251:1: testPackage : 'Package' PACKAGE_ID -> ^( PACKAGE PACKAGE_ID ) ;
    public final LetaGrammarParser.testPackage_return testPackage() throws RecognitionException {
        LetaGrammarParser.testPackage_return retval = new LetaGrammarParser.testPackage_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal88=null;
        Token PACKAGE_ID89=null;

        Object string_literal88_tree=null;
        Object PACKAGE_ID89_tree=null;
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_PACKAGE_ID=new RewriteRuleTokenStream(adaptor,"token PACKAGE_ID");

        try {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:252:3: ( 'Package' PACKAGE_ID -> ^( PACKAGE PACKAGE_ID ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:252:5: 'Package' PACKAGE_ID
            {
            string_literal88=(Token)match(input,82,FOLLOW_82_in_testPackage1731); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_82.add(string_literal88);

            PACKAGE_ID89=(Token)match(input,PACKAGE_ID,FOLLOW_PACKAGE_ID_in_testPackage1733); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_PACKAGE_ID.add(PACKAGE_ID89);



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
            // 253:5: -> ^( PACKAGE PACKAGE_ID )
            {
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:253:8: ^( PACKAGE PACKAGE_ID )
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


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA17 dfa17 = new DFA17(this);
    protected DFA19 dfa19 = new DFA19(this);
    protected DFA20 dfa20 = new DFA20(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA7_eotS =
        "\15\uffff";
    static final String DFA7_eofS =
        "\15\uffff";
    static final String DFA7_minS =
        "\1\44\14\uffff";
    static final String DFA7_maxS =
        "\1\104\14\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\12\uffff\1\2";
    static final String DFA7_specialS =
        "\15\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\20\uffff\1\14\5\uffff\12\1",
            "",
            "",
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

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "98:1: factComposite : ( (f= fact | fo= formula ) (op= logicalOperator fc= factComposite )? -> {op != null && op.value.equals(\"And\") && f != null}? ^( 'And' $f $fc) -> {op != null && op.value.equals(\"Or\") && f != null}? ^( 'Or' $f $fc) -> {op != null && op.value.equals(\"And\") && fo != null}? ^( 'And' $fo $fc) -> {op != null && op.value.equals(\"Or\") && fo != null}? ^( 'Or' $fo $fc) -> {f != null}? ^( FACTCOMPOSITE $f) -> ^( FACTCOMPOSITE $fo) | '(' fc1= factComposite ')' (op= logicalOperator fc2= factComposite )? -> {op != null && op.value.equals(\"And\")}? ^( 'And' $fc1 $fc2) -> {op != null && op.value.equals(\"Or\")}? ^( 'Or' $fc1 $fc2) -> ^( FACTCOMPOSITE $fc1) );";
        }
    }
    static final String DFA4_eotS =
        "\u0097\uffff";
    static final String DFA4_eofS =
        "\u0097\uffff";
    static final String DFA4_minS =
        "\1\44\12\uffff\1\44\1\uffff\5\45\6\44\1\45\1\uffff\6\44\1\45\6"+
        "\44\1\45\6\44\1\45\6\44\1\45\6\44\1\45\14\uffff\1\44\14\uffff\1"+
        "\44\14\uffff\1\44\14\uffff\1\44\14\uffff\1\44\14\uffff\1\44\14\uffff";
    static final String DFA4_maxS =
        "\1\104\12\uffff\1\121\1\uffff\5\121\6\105\1\45\1\uffff\6\105\1"+
        "\45\6\105\1\45\6\105\1\45\6\105\1\45\6\105\1\45\14\uffff\1\105\14"+
        "\uffff\1\105\14\uffff\1\105\14\uffff\1\105\14\uffff\1\105\14\uffff"+
        "\1\105\14\uffff";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\27\uffff\1\2\175\uffff";
    static final String DFA4_specialS =
        "\u0097\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\13\26\uffff\12\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\1\1\25\1\22\1\23\1\24\1\26\20\uffff\1\30\12\uffff\1\31"+
            "\6\uffff\1\15\1\16\1\17\1\20\1\21\1\27",
            "",
            "\1\35\1\32\1\33\1\34\1\36\20\uffff\1\40\26\uffff\1\37",
            "\1\44\1\41\1\42\1\43\1\45\20\uffff\1\47\26\uffff\1\46",
            "\1\53\1\50\1\51\1\52\1\54\20\uffff\1\56\26\uffff\1\55",
            "\1\62\1\57\1\60\1\61\1\63\20\uffff\1\65\26\uffff\1\64",
            "\1\71\1\66\1\67\1\70\1\72\20\uffff\1\74\26\uffff\1\73",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\111",
            "",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\126",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\143",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\160",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\175",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\1\40\uffff\1\31",
            "\1\u008a",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\1\40\uffff\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\1\40\uffff\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\1\40\uffff\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\1\40\uffff\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\1\40\uffff\1\31",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\1\40\uffff\1\31",
            "",
            "",
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
            return "99:5: (f= fact | fo= formula )";
        }
    }
    static final String DFA10_eotS =
        "\23\uffff";
    static final String DFA10_eofS =
        "\1\14\22\uffff";
    static final String DFA10_minS =
        "\1\44\22\uffff";
    static final String DFA10_maxS =
        "\1\104\22\uffff";
    static final String DFA10_acceptS =
        "\1\uffff\1\1\12\uffff\1\2\6\uffff";
    static final String DFA10_specialS =
        "\23\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\1\12\uffff\1\14\1\uffff\2\14\3\uffff\3\14\2\uffff\12\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "120:35: (tc2= termComposite (fe= factExt )? )?";
        }
    }
    static final String DFA9_eotS =
        "\12\uffff";
    static final String DFA9_eofS =
        "\1\3\11\uffff";
    static final String DFA9_minS =
        "\1\44\11\uffff";
    static final String DFA9_maxS =
        "\1\71\11\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\6\uffff";
    static final String DFA9_specialS =
        "\12\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\1\12\uffff\1\3\1\uffff\2\3\3\uffff\3\3\1\1",
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

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "120:56: (fe= factExt )?";
        }
    }
    static final String DFA11_eotS =
        "\12\uffff";
    static final String DFA11_eofS =
        "\1\3\11\uffff";
    static final String DFA11_minS =
        "\1\44\11\uffff";
    static final String DFA11_maxS =
        "\1\71\11\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\6\uffff";
    static final String DFA11_specialS =
        "\12\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1\12\uffff\1\3\1\uffff\2\3\3\uffff\3\3\1\1",
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
            return "125:23: ( factExt )?";
        }
    }
    static final String DFA13_eotS =
        "\23\uffff";
    static final String DFA13_eofS =
        "\1\14\22\uffff";
    static final String DFA13_minS =
        "\1\44\22\uffff";
    static final String DFA13_maxS =
        "\1\104\22\uffff";
    static final String DFA13_acceptS =
        "\1\uffff\1\1\12\uffff\1\2\6\uffff";
    static final String DFA13_specialS =
        "\23\uffff}>";
    static final String[] DFA13_transitionS = {
            "\1\1\12\uffff\1\14\1\uffff\2\14\3\uffff\3\14\2\uffff\12\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "127:16: ( termComposite ( factExt )? )?";
        }
    }
    static final String DFA12_eotS =
        "\12\uffff";
    static final String DFA12_eofS =
        "\1\3\11\uffff";
    static final String DFA12_minS =
        "\1\44\11\uffff";
    static final String DFA12_maxS =
        "\1\71\11\uffff";
    static final String DFA12_acceptS =
        "\1\uffff\1\1\1\uffff\1\2\6\uffff";
    static final String DFA12_specialS =
        "\12\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\12\uffff\1\3\1\uffff\2\3\3\uffff\3\3\1\1",
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
            return "127:31: ( factExt )?";
        }
    }
    static final String DFA15_eotS =
        "\14\uffff";
    static final String DFA15_eofS =
        "\14\uffff";
    static final String DFA15_minS =
        "\1\44\13\uffff";
    static final String DFA15_maxS =
        "\1\104\13\uffff";
    static final String DFA15_acceptS =
        "\1\uffff\1\1\11\uffff\1\2";
    static final String DFA15_specialS =
        "\14\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\13\26\uffff\12\1",
            "",
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
            return "132:5: ( quantifier )?";
        }
    }
    static final String DFA16_eotS =
        "\72\uffff";
    static final String DFA16_eofS =
        "\1\uffff\1\2\70\uffff";
    static final String DFA16_minS =
        "\2\44\11\uffff\5\45\52\uffff";
    static final String DFA16_maxS =
        "\1\44\1\121\11\uffff\5\121\52\uffff";
    static final String DFA16_acceptS =
        "\2\uffff\1\1\15\uffff\1\2\5\uffff\1\3\43\uffff";
    static final String DFA16_specialS =
        "\72\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1",
            "\1\2\5\20\5\uffff\1\2\1\uffff\2\2\3\uffff\4\2\1\26\21\uffff"+
            "\1\13\1\14\1\15\1\16\1\17\1\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\5\20\20\uffff\1\26\26\uffff\1\20",
            "\5\20\20\uffff\1\26\26\uffff\1\20",
            "\5\20\20\uffff\1\26\26\uffff\1\20",
            "\5\20\20\uffff\1\26\26\uffff\1\20",
            "\5\20\20\uffff\1\26\26\uffff\1\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "132:17: (t= term | ti= termInstance | twa= termWithAssociation )";
        }
    }
    static final String DFA17_eotS =
        "\14\uffff";
    static final String DFA17_eofS =
        "\14\uffff";
    static final String DFA17_minS =
        "\1\45\13\uffff";
    static final String DFA17_maxS =
        "\1\121\13\uffff";
    static final String DFA17_acceptS =
        "\1\uffff\1\1\4\uffff\1\2\5\uffff";
    static final String DFA17_specialS =
        "\14\uffff}>";
    static final String[] DFA17_transitionS = {
            "\5\6\42\uffff\5\1\1\6",
            "",
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
    static final String DFA19_eotS =
        "\13\uffff";
    static final String DFA19_eofS =
        "\13\uffff";
    static final String DFA19_minS =
        "\1\73\12\uffff";
    static final String DFA19_maxS =
        "\1\104\12\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12";
    static final String DFA19_specialS =
        "\13\uffff}>";
    static final String[] DFA19_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12",
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
            return "153:1: quantifier : ( 'each' -> ^( QUANTIFIER 'each' ) | 'some' -> ^( QUANTIFIER 'some' ) | 'atLeastOne' -> ^( QUANTIFIER 'atLeastOne' ) | 'atLeast' INT -> ^( QUANTIFIER 'atLeast' INT ) | 'atMostOne' -> ^( QUANTIFIER 'atMostOne' ) | 'atMost' INT -> ^( QUANTIFIER 'atMost' INT ) | 'exactlyOne' -> ^( QUANTIFIER 'exactlyOne' ) | 'exactly' INT -> ^( QUANTIFIER 'exactly' INT ) | 'moreThanOne' -> ^( QUANTIFIER 'moreThanOne' ) | 'atLeastAndAtMost' i1= INT i2= INT -> ^( QUANTIFIER 'atLeastAndAtMost' $i1 $i2) );";
        }
    }
    static final String DFA20_eotS =
        "\16\uffff";
    static final String DFA20_eofS =
        "\1\7\15\uffff";
    static final String DFA20_minS =
        "\1\57\15\uffff";
    static final String DFA20_maxS =
        "\1\113\15\uffff";
    static final String DFA20_acceptS =
        "\1\uffff\1\1\5\uffff\1\2\6\uffff";
    static final String DFA20_specialS =
        "\16\uffff}>";
    static final String[] DFA20_transitionS = {
            "\1\7\1\uffff\2\7\3\uffff\3\7\15\uffff\6\1",
            "",
            "",
            "",
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
            return "187:17: ( mathOperator formulaExpression )?";
        }
    }
    static final String DFA21_eotS =
        "\16\uffff";
    static final String DFA21_eofS =
        "\1\7\15\uffff";
    static final String DFA21_minS =
        "\1\57\15\uffff";
    static final String DFA21_maxS =
        "\1\113\15\uffff";
    static final String DFA21_acceptS =
        "\1\uffff\1\1\5\uffff\1\2\6\uffff";
    static final String DFA21_specialS =
        "\16\uffff}>";
    static final String[] DFA21_transitionS = {
            "\1\7\1\uffff\2\7\3\uffff\3\7\15\uffff\6\1",
            "",
            "",
            "",
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
            return "189:31: ( mathOperator formulaExpression )?";
        }
    }
    static final String DFA23_eotS =
        "\77\uffff";
    static final String DFA23_eofS =
        "\1\uffff\1\2\75\uffff";
    static final String DFA23_minS =
        "\1\44\1\45\16\uffff\5\45\52\uffff";
    static final String DFA23_maxS =
        "\1\44\1\121\16\uffff\5\121\52\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\1\22\uffff\1\2\5\uffff\1\3\43\uffff";
    static final String DFA23_specialS =
        "\77\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1",
            "\5\25\5\uffff\1\2\1\uffff\2\2\3\uffff\3\2\1\uffff\1\33\12"+
            "\uffff\7\2\1\20\1\21\1\22\1\23\1\24\1\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\5\25\20\uffff\1\33\26\uffff\1\25",
            "\5\25\20\uffff\1\33\26\uffff\1\25",
            "\5\25\20\uffff\1\33\26\uffff\1\25",
            "\5\25\20\uffff\1\33\26\uffff\1\25",
            "\5\25\20\uffff\1\33\26\uffff\1\25",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
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
            return "194:5: ( term | termInstance | termWithAssociation )";
        }
    }
 

    public static final BitSet FOLLOW_testPackage_in_leta236 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_testCase_in_leta239 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_testCase270 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ID_in_testCase272 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_verifyClause_in_testCase274 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_whenClause_in_testCase276 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_setClause_in_testCase278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_verifyClause311 = new BitSet(new long[]{0xF820001000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_factComposite_in_verifyClause313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_whenClause338 = new BitSet(new long[]{0xF820001000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_factComposite_in_whenClause340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_setClause365 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_setClause367 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_set_in_setClause369 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_setClause371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fact_in_factComposite399 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_formula_in_factComposite405 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_logicalOperator_in_factComposite411 = new BitSet(new long[]{0xF820001000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_factComposite_in_factComposite415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_factComposite523 = new BitSet(new long[]{0xF820001000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_factComposite_in_factComposite527 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_factComposite529 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_logicalOperator_in_factComposite534 = new BitSet(new long[]{0xF820001000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_factComposite_in_factComposite538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_logicalOperator606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_logicalOperator618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termComposite_in_fact639 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_complement_in_fact643 = new BitSet(new long[]{0xF800001000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_termComposite_in_fact648 = new BitSet(new long[]{0x0200001000000002L});
    public static final BitSet FOLLOW_factExt_in_fact652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_factExt694 = new BitSet(new long[]{0xF800001000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_termComposite_in_factExt696 = new BitSet(new long[]{0x0200001000000002L});
    public static final BitSet FOLLOW_factExt_in_factExt698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_complement_in_factExt722 = new BitSet(new long[]{0xF800001000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_termComposite_in_factExt725 = new BitSet(new long[]{0x0200001000000002L});
    public static final BitSet FOLLOW_factExt_in_factExt727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quantifier_in_termComposite763 = new BitSet(new long[]{0xF800001000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_term_in_termComposite769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termInstance_in_termComposite775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termWithAssociation_in_termComposite781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_termInstance869 = new BitSet(new long[]{0x000003E000000000L,0x000000000003F000L});
    public static final BitSet FOLLOW_relationalOperator_in_termInstance871 = new BitSet(new long[]{0x000003E000000000L,0x000000000003F000L});
    public static final BitSet FOLLOW_literal_in_termInstance874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_termWithAssociation904 = new BitSet(new long[]{0x0400000000000000L,0x000000000001F000L});
    public static final BitSet FOLLOW_relationalOperator_in_termWithAssociation906 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_termWithAssociation909 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_termWithAssociation911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_quantifier943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_quantifier961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_quantifier979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_quantifier997 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_quantifier1019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_quantifier1037 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_quantifier1059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_quantifier1077 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_quantifier1099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_quantifier1117 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier1121 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_complement1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formulaItem_in_formula1181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_formula1183 = new BitSet(new long[]{0xF820001000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_formulaExpression_in_formula1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formulaItem_in_formulaExpression1212 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_mathOperator_in_formulaExpression1215 = new BitSet(new long[]{0xF820001000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_formulaExpression_in_formulaExpression1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_formulaExpression1244 = new BitSet(new long[]{0xF820001000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_formulaExpression_in_formulaExpression1246 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_formulaExpression1248 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_mathOperator_in_formulaExpression1251 = new BitSet(new long[]{0xF820001000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_formulaExpression_in_formulaExpression1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_formulaItem1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termInstance_in_formulaItem1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termWithAssociation_in_formulaItem1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_mathOperator1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_mathOperator1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_mathOperator1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_mathOperator1384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_mathOperator1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_mathOperator1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_relationalOperator1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_relationalOperator1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_relationalOperator1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_relationalOperator1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_relationalOperator1517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_set1542 = new BitSet(new long[]{0x000003E000000000L,0x000000000003F000L});
    public static final BitSet FOLLOW_subSet_in_set1544 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_set1546 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_set1549 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_set_in_set1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_subSet1581 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_subSet1584 = new BitSet(new long[]{0x000003E000000000L,0x000000000003F000L});
    public static final BitSet FOLLOW_subSet_in_subSet1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal1616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_FLOAT_in_literal1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal1670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_INT_in_literal1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_literal1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_testPackage1731 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_PACKAGE_ID_in_testPackage1733 = new BitSet(new long[]{0x0000000000000002L});

}