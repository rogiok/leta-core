// $ANTLR 3.2 Sep 23, 2009 14:05:07 /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g 2011-04-10 17:02:35

  package leta.core.grammar;
  
  import leta.core.model.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class LetaGrammarParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LETA", "STMT", "TESTCASE", "WHEN", "VERIFY", "SET", "FACTCOMPOSITE", "CONJUNCTION", "DISJUNCTION", "FACT", "FACTEXT", "FACTUNARY", "FACTBINARY", "FACTNARY", "TERMCOMPOSITE", "FORMULA", "TERM", "TERMINSTANCE", "TERMWITHASSOCIATION", "COMPLEMENT", "NULL", "LITERAL", "QUANTIFIER", "FORMULAEXPRESSION", "FORMULAEXPRESSIONCOMPOSITE", "FORMULAITEM", "OPERATOR", "SUBSET", "SEPARATOR", "AND", "OR", "PACKAGE", "ID", "INT", "STRING", "FLOAT", "MINUS_FLOAT", "MINUS_INT", "PACKAGE_ID", "DIGIT", "COMMENT", "LINE_COMMENT", "WS", "'Test'", "'Verify'", "'When'", "'Set'", "'{'", "'}'", "'('", "')'", "'And'", "'Or'", "','", "'@'", "'each'", "'some'", "'atLeastOne'", "'atLeast'", "'atMostOne'", "'atMost'", "'exactlyOne'", "'exactly'", "'moreThanOne'", "'atLeastAndAtMost'", "'='", "'+'", "'-'", "'/'", "'*'", "'%'", "'**'", "'>'", "'<'", "'>='", "'<='", "'!='", "'null'", "'Package'"
    };
    public static final int PACKAGE=35;
    public static final int TERM=20;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int STMT=5;
    public static final int T__65=65;
    public static final int TERMINSTANCE=21;
    public static final int FORMULA=19;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int FACTCOMPOSITE=10;
    public static final int TERMCOMPOSITE=18;
    public static final int LETA=4;
    public static final int FLOAT=39;
    public static final int SEPARATOR=32;
    public static final int ID=36;
    public static final int AND=33;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
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
    public static final int T__47=47;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int LINE_COMMENT=45;
    public static final int T__48=48;
    public static final int OPERATOR=30;
    public static final int T__49=49;
    public static final int FORMULAEXPRESSION=27;
    public static final int CONJUNCTION=11;
    public static final int NULL=24;
    public static final int FACTBINARY=16;
    public static final int LITERAL=25;
    public static final int SET=9;
    public static final int INT=37;
    public static final int FORMULAEXPRESSIONCOMPOSITE=28;
    public static final int FACTNARY=17;
    public static final int DISJUNCTION=12;
    public static final int WS=46;
    public static final int SUBSET=31;
    public static final int T__71=71;
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
    public static final int TERMWITHASSOCIATION=22;
    public static final int VERIFY=8;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int STRING=38;
    public static final int T__78=78;
    public static final int T__77=77;

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
    public String getGrammarFileName() { return "/Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g"; }


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
    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:70:1: leta : ( testPackage )? ( testCase )+ -> ^( LETA ( testPackage )? ( testCase )+ ) ;
    public final LetaGrammarParser.leta_return leta() throws RecognitionException {
        LetaGrammarParser.leta_return retval = new LetaGrammarParser.leta_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        LetaGrammarParser.testPackage_return testPackage1 = null;

        LetaGrammarParser.testCase_return testCase2 = null;


        RewriteRuleSubtreeStream stream_testCase=new RewriteRuleSubtreeStream(adaptor,"rule testCase");
        RewriteRuleSubtreeStream stream_testPackage=new RewriteRuleSubtreeStream(adaptor,"rule testPackage");
        try {
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:71:3: ( ( testPackage )? ( testCase )+ -> ^( LETA ( testPackage )? ( testCase )+ ) )
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:71:5: ( testPackage )? ( testCase )+
            {
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:71:5: ( testPackage )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==82) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:71:5: testPackage
                    {
                    pushFollow(FOLLOW_testPackage_in_leta215);
                    testPackage1=testPackage();

                    state._fsp--;

                    stream_testPackage.add(testPackage1.getTree());

                    }
                    break;

            }

            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:71:18: ( testCase )+
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
            	    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:71:18: testCase
            	    {
            	    pushFollow(FOLLOW_testCase_in_leta218);
            	    testCase2=testCase();

            	    state._fsp--;

            	    stream_testCase.add(testCase2.getTree());

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



            // AST REWRITE
            // elements: testCase, testPackage
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 72:5: -> ^( LETA ( testPackage )? ( testCase )+ )
            {
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:72:8: ^( LETA ( testPackage )? ( testCase )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LETA, "LETA"), root_1);

                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:72:15: ( testPackage )?
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

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:75:1: testCase : 'Test' ID verifyClause whenClause ( setClause )? -> ^( TESTCASE ID ( setClause )? verifyClause whenClause ) ;
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
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:76:3: ( 'Test' ID verifyClause whenClause ( setClause )? -> ^( TESTCASE ID ( setClause )? verifyClause whenClause ) )
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:76:5: 'Test' ID verifyClause whenClause ( setClause )?
            {
            string_literal3=(Token)match(input,47,FOLLOW_47_in_testCase249);  
            stream_47.add(string_literal3);

            ID4=(Token)match(input,ID,FOLLOW_ID_in_testCase251);  
            stream_ID.add(ID4);

            pushFollow(FOLLOW_verifyClause_in_testCase253);
            verifyClause5=verifyClause();

            state._fsp--;

            stream_verifyClause.add(verifyClause5.getTree());
            pushFollow(FOLLOW_whenClause_in_testCase255);
            whenClause6=whenClause();

            state._fsp--;

            stream_whenClause.add(whenClause6.getTree());
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:76:39: ( setClause )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==50) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:76:39: setClause
                    {
                    pushFollow(FOLLOW_setClause_in_testCase257);
                    setClause7=setClause();

                    state._fsp--;

                    stream_setClause.add(setClause7.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: whenClause, verifyClause, setClause, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 77:5: -> ^( TESTCASE ID ( setClause )? verifyClause whenClause )
            {
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:77:8: ^( TESTCASE ID ( setClause )? verifyClause whenClause )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TESTCASE, "TESTCASE"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:77:22: ( setClause )?
                if ( stream_setClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_setClause.nextTree());

                }
                stream_setClause.reset();
                adaptor.addChild(root_1, stream_verifyClause.nextTree());
                adaptor.addChild(root_1, stream_whenClause.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:80:1: verifyClause : 'Verify' factComposite -> ^( VERIFY factComposite ) ;
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
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:81:3: ( 'Verify' factComposite -> ^( VERIFY factComposite ) )
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:81:5: 'Verify' factComposite
            {
            string_literal8=(Token)match(input,48,FOLLOW_48_in_verifyClause290);  
            stream_48.add(string_literal8);

            pushFollow(FOLLOW_factComposite_in_verifyClause292);
            factComposite9=factComposite();

            state._fsp--;

            stream_factComposite.add(factComposite9.getTree());


            // AST REWRITE
            // elements: factComposite
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 82:5: -> ^( VERIFY factComposite )
            {
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:82:8: ^( VERIFY factComposite )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(VERIFY, "VERIFY"), root_1);

                adaptor.addChild(root_1, stream_factComposite.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:85:1: whenClause : 'When' factComposite -> ^( WHEN factComposite ) ;
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
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:86:3: ( 'When' factComposite -> ^( WHEN factComposite ) )
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:86:5: 'When' factComposite
            {
            string_literal10=(Token)match(input,49,FOLLOW_49_in_whenClause317);  
            stream_49.add(string_literal10);

            pushFollow(FOLLOW_factComposite_in_whenClause319);
            factComposite11=factComposite();

            state._fsp--;

            stream_factComposite.add(factComposite11.getTree());


            // AST REWRITE
            // elements: factComposite
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 87:5: -> ^( WHEN factComposite )
            {
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:87:8: ^( WHEN factComposite )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(WHEN, "WHEN"), root_1);

                adaptor.addChild(root_1, stream_factComposite.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:90:1: setClause : 'Set' '{' set '}' -> ^( SET set ) ;
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
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:91:3: ( 'Set' '{' set '}' -> ^( SET set ) )
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:91:5: 'Set' '{' set '}'
            {
            string_literal12=(Token)match(input,50,FOLLOW_50_in_setClause344);  
            stream_50.add(string_literal12);

            char_literal13=(Token)match(input,51,FOLLOW_51_in_setClause346);  
            stream_51.add(char_literal13);

            pushFollow(FOLLOW_set_in_setClause348);
            set14=set();

            state._fsp--;

            stream_set.add(set14.getTree());
            char_literal15=(Token)match(input,52,FOLLOW_52_in_setClause350);  
            stream_52.add(char_literal15);



            // AST REWRITE
            // elements: set
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 92:5: -> ^( SET set )
            {
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:92:8: ^( SET set )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SET, "SET"), root_1);

                adaptor.addChild(root_1, stream_set.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:95:1: factComposite : ( (f= fact | fo= formula ) (op= logicalOperator fc= factComposite )? -> {op != null && op.value.equals(\"And\") && f != null}? ^( 'And' $f $fc) -> {op != null && op.value.equals(\"Or\") && f != null}? ^( 'Or' $f $fc) -> {op != null && op.value.equals(\"And\") && fo != null}? ^( 'And' $fo $fc) -> {op != null && op.value.equals(\"Or\") && fo != null}? ^( 'Or' $fo $fc) -> {f != null}? ^( FACTCOMPOSITE $f) -> ^( FACTCOMPOSITE $fo) | '(' fc1= factComposite ')' (op= logicalOperator fc2= factComposite )? -> {op != null && op.value.equals(\"And\")}? ^( 'And' $fc1 $fc2) -> {op != null && op.value.equals(\"Or\")}? ^( 'Or' $fc1 $fc2) -> ^( FACTCOMPOSITE $fc1) );
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
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:96:3: ( (f= fact | fo= formula ) (op= logicalOperator fc= factComposite )? -> {op != null && op.value.equals(\"And\") && f != null}? ^( 'And' $f $fc) -> {op != null && op.value.equals(\"Or\") && f != null}? ^( 'Or' $f $fc) -> {op != null && op.value.equals(\"And\") && fo != null}? ^( 'And' $fo $fc) -> {op != null && op.value.equals(\"Or\") && fo != null}? ^( 'Or' $fo $fc) -> {f != null}? ^( FACTCOMPOSITE $f) -> ^( FACTCOMPOSITE $fo) | '(' fc1= factComposite ')' (op= logicalOperator fc2= factComposite )? -> {op != null && op.value.equals(\"And\")}? ^( 'And' $fc1 $fc2) -> {op != null && op.value.equals(\"Or\")}? ^( 'Or' $fc1 $fc2) -> ^( FACTCOMPOSITE $fc1) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID||(LA7_0>=59 && LA7_0<=68)) ) {
                alt7=1;
            }
            else if ( (LA7_0==53) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:96:5: (f= fact | fo= formula ) (op= logicalOperator fc= factComposite )?
                    {
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:96:5: (f= fact | fo= formula )
                    int alt4=2;
                    alt4 = dfa4.predict(input);
                    switch (alt4) {
                        case 1 :
                            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:96:6: f= fact
                            {
                            pushFollow(FOLLOW_fact_in_factComposite378);
                            f=fact();

                            state._fsp--;

                            stream_fact.add(f.getTree());

                            }
                            break;
                        case 2 :
                            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:96:15: fo= formula
                            {
                            pushFollow(FOLLOW_formula_in_factComposite384);
                            fo=formula();

                            state._fsp--;

                            stream_formula.add(fo.getTree());

                            }
                            break;

                    }

                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:96:27: (op= logicalOperator fc= factComposite )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=55 && LA5_0<=56)) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:96:28: op= logicalOperator fc= factComposite
                            {
                            pushFollow(FOLLOW_logicalOperator_in_factComposite390);
                            op=logicalOperator();

                            state._fsp--;

                            stream_logicalOperator.add(op.getTree());
                            pushFollow(FOLLOW_factComposite_in_factComposite394);
                            fc=factComposite();

                            state._fsp--;

                            stream_factComposite.add(fc.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: fc, fc, fc, fo, 55, fo, 55, f, f, f, fc, fo, 56, 56
                    // token labels: 
                    // rule labels: f, retval, fo, fc
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_f=new RewriteRuleSubtreeStream(adaptor,"rule f",f!=null?f.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_fo=new RewriteRuleSubtreeStream(adaptor,"rule fo",fo!=null?fo.tree:null);
                    RewriteRuleSubtreeStream stream_fc=new RewriteRuleSubtreeStream(adaptor,"rule fc",fc!=null?fc.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 97:5: -> {op != null && op.value.equals(\"And\") && f != null}? ^( 'And' $f $fc)
                    if (op != null && op.value.equals("And") && f != null) {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:97:61: ^( 'And' $f $fc)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(55, "55"), root_1);

                        adaptor.addChild(root_1, stream_f.nextTree());
                        adaptor.addChild(root_1, stream_fc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 98:5: -> {op != null && op.value.equals(\"Or\") && f != null}? ^( 'Or' $f $fc)
                    if (op != null && op.value.equals("Or") && f != null) {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:98:60: ^( 'Or' $f $fc)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(56, "56"), root_1);

                        adaptor.addChild(root_1, stream_f.nextTree());
                        adaptor.addChild(root_1, stream_fc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 99:5: -> {op != null && op.value.equals(\"And\") && fo != null}? ^( 'And' $fo $fc)
                    if (op != null && op.value.equals("And") && fo != null) {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:99:62: ^( 'And' $fo $fc)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(55, "55"), root_1);

                        adaptor.addChild(root_1, stream_fo.nextTree());
                        adaptor.addChild(root_1, stream_fc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 100:5: -> {op != null && op.value.equals(\"Or\") && fo != null}? ^( 'Or' $fo $fc)
                    if (op != null && op.value.equals("Or") && fo != null) {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:100:61: ^( 'Or' $fo $fc)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(56, "56"), root_1);

                        adaptor.addChild(root_1, stream_fo.nextTree());
                        adaptor.addChild(root_1, stream_fc.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 101:5: -> {f != null}? ^( FACTCOMPOSITE $f)
                    if (f != null) {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:101:21: ^( FACTCOMPOSITE $f)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FACTCOMPOSITE, "FACTCOMPOSITE"), root_1);

                        adaptor.addChild(root_1, stream_f.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 102:5: -> ^( FACTCOMPOSITE $fo)
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:102:8: ^( FACTCOMPOSITE $fo)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FACTCOMPOSITE, "FACTCOMPOSITE"), root_1);

                        adaptor.addChild(root_1, stream_fo.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:103:5: '(' fc1= factComposite ')' (op= logicalOperator fc2= factComposite )?
                    {
                    char_literal16=(Token)match(input,53,FOLLOW_53_in_factComposite502);  
                    stream_53.add(char_literal16);

                    pushFollow(FOLLOW_factComposite_in_factComposite506);
                    fc1=factComposite();

                    state._fsp--;

                    stream_factComposite.add(fc1.getTree());
                    char_literal17=(Token)match(input,54,FOLLOW_54_in_factComposite508);  
                    stream_54.add(char_literal17);

                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:103:31: (op= logicalOperator fc2= factComposite )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=55 && LA6_0<=56)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:103:32: op= logicalOperator fc2= factComposite
                            {
                            pushFollow(FOLLOW_logicalOperator_in_factComposite513);
                            op=logicalOperator();

                            state._fsp--;

                            stream_logicalOperator.add(op.getTree());
                            pushFollow(FOLLOW_factComposite_in_factComposite517);
                            fc2=factComposite();

                            state._fsp--;

                            stream_factComposite.add(fc2.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: fc2, fc1, fc1, fc1, fc2, 55, 56
                    // token labels: 
                    // rule labels: retval, fc1, fc2
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_fc1=new RewriteRuleSubtreeStream(adaptor,"rule fc1",fc1!=null?fc1.tree:null);
                    RewriteRuleSubtreeStream stream_fc2=new RewriteRuleSubtreeStream(adaptor,"rule fc2",fc2!=null?fc2.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 104:5: -> {op != null && op.value.equals(\"And\")}? ^( 'And' $fc1 $fc2)
                    if (op != null && op.value.equals("And")) {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:104:48: ^( 'And' $fc1 $fc2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(55, "55"), root_1);

                        adaptor.addChild(root_1, stream_fc1.nextTree());
                        adaptor.addChild(root_1, stream_fc2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 105:5: -> {op != null && op.value.equals(\"Or\")}? ^( 'Or' $fc1 $fc2)
                    if (op != null && op.value.equals("Or")) {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:105:47: ^( 'Or' $fc1 $fc2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(56, "56"), root_1);

                        adaptor.addChild(root_1, stream_fc1.nextTree());
                        adaptor.addChild(root_1, stream_fc2.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }
                    else // 106:5: -> ^( FACTCOMPOSITE $fc1)
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:106:8: ^( FACTCOMPOSITE $fc1)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FACTCOMPOSITE, "FACTCOMPOSITE"), root_1);

                        adaptor.addChild(root_1, stream_fc1.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:109:1: logicalOperator returns [String value] : ( 'And' | 'Or' );
    public final LetaGrammarParser.logicalOperator_return logicalOperator() throws RecognitionException {
        LetaGrammarParser.logicalOperator_return retval = new LetaGrammarParser.logicalOperator_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal18=null;
        Token string_literal19=null;

        Object string_literal18_tree=null;
        Object string_literal19_tree=null;

        try {
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:110:3: ( 'And' | 'Or' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==55) ) {
                alt8=1;
            }
            else if ( (LA8_0==56) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:110:5: 'And'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal18=(Token)match(input,55,FOLLOW_55_in_logicalOperator585); 
                    string_literal18_tree = (Object)adaptor.create(string_literal18);
                    adaptor.addChild(root_0, string_literal18_tree);

                     retval.value = "And"; 

                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:112:5: 'Or'
                    {
                    root_0 = (Object)adaptor.nil();

                    string_literal19=(Token)match(input,56,FOLLOW_56_in_logicalOperator597); 
                    string_literal19_tree = (Object)adaptor.create(string_literal19);
                    adaptor.addChild(root_0, string_literal19_tree);

                     retval.value = "Or"; 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:116:1: fact : tc= termComposite c= complement (tc2= termComposite (fe= factExt )? )? -> ^( FACT $tc $c ( $tc2 ( $fe)? )? ) ;
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
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:117:3: (tc= termComposite c= complement (tc2= termComposite (fe= factExt )? )? -> ^( FACT $tc $c ( $tc2 ( $fe)? )? ) )
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:117:5: tc= termComposite c= complement (tc2= termComposite (fe= factExt )? )?
            {
            pushFollow(FOLLOW_termComposite_in_fact618);
            tc=termComposite();

            state._fsp--;

            stream_termComposite.add(tc.getTree());
            pushFollow(FOLLOW_complement_in_fact622);
            c=complement();

            state._fsp--;

            stream_complement.add(c.getTree());
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:117:35: (tc2= termComposite (fe= factExt )? )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ID||(LA10_0>=59 && LA10_0<=68)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:117:36: tc2= termComposite (fe= factExt )?
                    {
                    pushFollow(FOLLOW_termComposite_in_fact627);
                    tc2=termComposite();

                    state._fsp--;

                    stream_termComposite.add(tc2.getTree());
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:117:56: (fe= factExt )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0==ID||LA9_0==57) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:117:56: fe= factExt
                            {
                            pushFollow(FOLLOW_factExt_in_fact631);
                            fe=factExt();

                            state._fsp--;

                            stream_factExt.add(fe.getTree());

                            }
                            break;

                    }


                    }
                    break;

            }



            // AST REWRITE
            // elements: c, fe, tc2, tc
            // token labels: 
            // rule labels: retval, tc, c, tc2, fe
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_tc=new RewriteRuleSubtreeStream(adaptor,"rule tc",tc!=null?tc.tree:null);
            RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"rule c",c!=null?c.tree:null);
            RewriteRuleSubtreeStream stream_tc2=new RewriteRuleSubtreeStream(adaptor,"rule tc2",tc2!=null?tc2.tree:null);
            RewriteRuleSubtreeStream stream_fe=new RewriteRuleSubtreeStream(adaptor,"rule fe",fe!=null?fe.tree:null);

            root_0 = (Object)adaptor.nil();
            // 118:5: -> ^( FACT $tc $c ( $tc2 ( $fe)? )? )
            {
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:118:8: ^( FACT $tc $c ( $tc2 ( $fe)? )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FACT, "FACT"), root_1);

                adaptor.addChild(root_1, stream_tc.nextTree());
                adaptor.addChild(root_1, stream_c.nextTree());
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:118:22: ( $tc2 ( $fe)? )?
                if ( stream_fe.hasNext()||stream_tc2.hasNext() ) {
                    adaptor.addChild(root_1, stream_tc2.nextTree());
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:118:28: ( $fe)?
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

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:121:1: factExt : ( ',' termComposite ( factExt )? -> ^( FACTEXT SEPARATOR termComposite ( factExt )? ) | complement ( termComposite ( factExt )? )? -> ^( FACTEXT complement ( termComposite ( factExt )? )? ) );
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
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:122:3: ( ',' termComposite ( factExt )? -> ^( FACTEXT SEPARATOR termComposite ( factExt )? ) | complement ( termComposite ( factExt )? )? -> ^( FACTEXT complement ( termComposite ( factExt )? )? ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==57) ) {
                alt14=1;
            }
            else if ( (LA14_0==ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:122:5: ',' termComposite ( factExt )?
                    {
                    char_literal20=(Token)match(input,57,FOLLOW_57_in_factExt673);  
                    stream_57.add(char_literal20);

                    pushFollow(FOLLOW_termComposite_in_factExt675);
                    termComposite21=termComposite();

                    state._fsp--;

                    stream_termComposite.add(termComposite21.getTree());
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:122:23: ( factExt )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==ID||LA11_0==57) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:122:23: factExt
                            {
                            pushFollow(FOLLOW_factExt_in_factExt677);
                            factExt22=factExt();

                            state._fsp--;

                            stream_factExt.add(factExt22.getTree());

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
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 123:5: -> ^( FACTEXT SEPARATOR termComposite ( factExt )? )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:123:8: ^( FACTEXT SEPARATOR termComposite ( factExt )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FACTEXT, "FACTEXT"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(SEPARATOR, "SEPARATOR"));
                        adaptor.addChild(root_1, stream_termComposite.nextTree());
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:123:42: ( factExt )?
                        if ( stream_factExt.hasNext() ) {
                            adaptor.addChild(root_1, stream_factExt.nextTree());

                        }
                        stream_factExt.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:124:5: complement ( termComposite ( factExt )? )?
                    {
                    pushFollow(FOLLOW_complement_in_factExt701);
                    complement23=complement();

                    state._fsp--;

                    stream_complement.add(complement23.getTree());
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:124:16: ( termComposite ( factExt )? )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==ID||(LA13_0>=59 && LA13_0<=68)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:124:17: termComposite ( factExt )?
                            {
                            pushFollow(FOLLOW_termComposite_in_factExt704);
                            termComposite24=termComposite();

                            state._fsp--;

                            stream_termComposite.add(termComposite24.getTree());
                            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:124:31: ( factExt )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==ID||LA12_0==57) ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:124:31: factExt
                                    {
                                    pushFollow(FOLLOW_factExt_in_factExt706);
                                    factExt25=factExt();

                                    state._fsp--;

                                    stream_factExt.add(factExt25.getTree());

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
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 125:5: -> ^( FACTEXT complement ( termComposite ( factExt )? )? )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:125:8: ^( FACTEXT complement ( termComposite ( factExt )? )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FACTEXT, "FACTEXT"), root_1);

                        adaptor.addChild(root_1, stream_complement.nextTree());
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:125:29: ( termComposite ( factExt )? )?
                        if ( stream_termComposite.hasNext()||stream_factExt.hasNext() ) {
                            adaptor.addChild(root_1, stream_termComposite.nextTree());
                            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:125:44: ( factExt )?
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

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:128:1: termComposite : ( quantifier )? (t= term | ti= termInstance | twa= termWithAssociation ) -> {t != null}? ^( TERMCOMPOSITE ( quantifier )? term ) -> {ti != null}? ^( TERMCOMPOSITE ( quantifier )? termInstance ) -> ^( TERMCOMPOSITE ( quantifier )? termWithAssociation ) ;
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
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:129:3: ( ( quantifier )? (t= term | ti= termInstance | twa= termWithAssociation ) -> {t != null}? ^( TERMCOMPOSITE ( quantifier )? term ) -> {ti != null}? ^( TERMCOMPOSITE ( quantifier )? termInstance ) -> ^( TERMCOMPOSITE ( quantifier )? termWithAssociation ) )
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:129:5: ( quantifier )? (t= term | ti= termInstance | twa= termWithAssociation )
            {
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:129:5: ( quantifier )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=59 && LA15_0<=68)) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:129:5: quantifier
                    {
                    pushFollow(FOLLOW_quantifier_in_termComposite742);
                    quantifier26=quantifier();

                    state._fsp--;

                    stream_quantifier.add(quantifier26.getTree());

                    }
                    break;

            }

            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:129:17: (t= term | ti= termInstance | twa= termWithAssociation )
            int alt16=3;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:129:18: t= term
                    {
                    pushFollow(FOLLOW_term_in_termComposite748);
                    t=term();

                    state._fsp--;

                    stream_term.add(t.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:129:27: ti= termInstance
                    {
                    pushFollow(FOLLOW_termInstance_in_termComposite754);
                    ti=termInstance();

                    state._fsp--;

                    stream_termInstance.add(ti.getTree());

                    }
                    break;
                case 3 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:129:45: twa= termWithAssociation
                    {
                    pushFollow(FOLLOW_termWithAssociation_in_termComposite760);
                    twa=termWithAssociation();

                    state._fsp--;

                    stream_termWithAssociation.add(twa.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: termWithAssociation, term, quantifier, termInstance, quantifier, quantifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 130:5: -> {t != null}? ^( TERMCOMPOSITE ( quantifier )? term )
            if (t != null) {
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:130:21: ^( TERMCOMPOSITE ( quantifier )? term )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERMCOMPOSITE, "TERMCOMPOSITE"), root_1);

                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:130:37: ( quantifier )?
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
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:131:22: ^( TERMCOMPOSITE ( quantifier )? termInstance )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERMCOMPOSITE, "TERMCOMPOSITE"), root_1);

                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:131:38: ( quantifier )?
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
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:132:8: ^( TERMCOMPOSITE ( quantifier )? termWithAssociation )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERMCOMPOSITE, "TERMCOMPOSITE"), root_1);

                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:132:24: ( quantifier )?
                if ( stream_quantifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_quantifier.nextTree());

                }
                stream_quantifier.reset();
                adaptor.addChild(root_1, stream_termWithAssociation.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:135:1: term : ID -> ^( TERM ID ) ;
    public final LetaGrammarParser.term_return term() throws RecognitionException {
        LetaGrammarParser.term_return retval = new LetaGrammarParser.term_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID27=null;

        Object ID27_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:136:3: ( ID -> ^( TERM ID ) )
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:136:5: ID
            {
            ID27=(Token)match(input,ID,FOLLOW_ID_in_term823);  
            stream_ID.add(ID27);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 137:5: -> ^( TERM ID )
            {
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:137:8: ^( TERM ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERM, "TERM"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:140:1: termInstance : term ( relationalOperator )? literal -> ^( TERMINSTANCE term ( relationalOperator )? literal ) ;
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
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:141:3: ( term ( relationalOperator )? literal -> ^( TERMINSTANCE term ( relationalOperator )? literal ) )
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:141:5: term ( relationalOperator )? literal
            {
            pushFollow(FOLLOW_term_in_termInstance848);
            term28=term();

            state._fsp--;

            stream_term.add(term28.getTree());
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:141:10: ( relationalOperator )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=76 && LA17_0<=80)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:141:10: relationalOperator
                    {
                    pushFollow(FOLLOW_relationalOperator_in_termInstance850);
                    relationalOperator29=relationalOperator();

                    state._fsp--;

                    stream_relationalOperator.add(relationalOperator29.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_literal_in_termInstance853);
            literal30=literal();

            state._fsp--;

            stream_literal.add(literal30.getTree());


            // AST REWRITE
            // elements: relationalOperator, term, literal
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 142:5: -> ^( TERMINSTANCE term ( relationalOperator )? literal )
            {
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:142:8: ^( TERMINSTANCE term ( relationalOperator )? literal )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERMINSTANCE, "TERMINSTANCE"), root_1);

                adaptor.addChild(root_1, stream_term.nextTree());
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:142:28: ( relationalOperator )?
                if ( stream_relationalOperator.hasNext() ) {
                    adaptor.addChild(root_1, stream_relationalOperator.nextTree());

                }
                stream_relationalOperator.reset();
                adaptor.addChild(root_1, stream_literal.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:145:1: termWithAssociation : term ( relationalOperator )? '@' INT -> ^( TERMWITHASSOCIATION term ( relationalOperator )? INT ) ;
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
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:146:3: ( term ( relationalOperator )? '@' INT -> ^( TERMWITHASSOCIATION term ( relationalOperator )? INT ) )
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:146:5: term ( relationalOperator )? '@' INT
            {
            pushFollow(FOLLOW_term_in_termWithAssociation883);
            term31=term();

            state._fsp--;

            stream_term.add(term31.getTree());
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:146:10: ( relationalOperator )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=76 && LA18_0<=80)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:146:10: relationalOperator
                    {
                    pushFollow(FOLLOW_relationalOperator_in_termWithAssociation885);
                    relationalOperator32=relationalOperator();

                    state._fsp--;

                    stream_relationalOperator.add(relationalOperator32.getTree());

                    }
                    break;

            }

            char_literal33=(Token)match(input,58,FOLLOW_58_in_termWithAssociation888);  
            stream_58.add(char_literal33);

            INT34=(Token)match(input,INT,FOLLOW_INT_in_termWithAssociation890);  
            stream_INT.add(INT34);



            // AST REWRITE
            // elements: relationalOperator, term, INT
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 147:5: -> ^( TERMWITHASSOCIATION term ( relationalOperator )? INT )
            {
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:147:8: ^( TERMWITHASSOCIATION term ( relationalOperator )? INT )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TERMWITHASSOCIATION, "TERMWITHASSOCIATION"), root_1);

                adaptor.addChild(root_1, stream_term.nextTree());
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:147:35: ( relationalOperator )?
                if ( stream_relationalOperator.hasNext() ) {
                    adaptor.addChild(root_1, stream_relationalOperator.nextTree());

                }
                stream_relationalOperator.reset();
                adaptor.addChild(root_1, stream_INT.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:150:1: quantifier : ( 'each' -> ^( QUANTIFIER 'each' ) | 'some' -> ^( QUANTIFIER 'some' ) | 'atLeastOne' -> ^( QUANTIFIER 'atLeastOne' ) | 'atLeast' INT -> ^( QUANTIFIER 'atLeast' INT ) | 'atMostOne' -> ^( QUANTIFIER 'atMostOne' ) | 'atMost' INT -> ^( QUANTIFIER 'atMost' INT ) | 'exactlyOne' -> ^( QUANTIFIER 'exactlyOne' ) | 'exactly' INT -> ^( QUANTIFIER 'exactly' INT ) | 'moreThanOne' -> ^( QUANTIFIER 'moreThanOne' ) | 'atLeastAndAtMost' i1= INT i2= INT -> ^( QUANTIFIER 'atLeastAndAtMost' $i1 $i2) );
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
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:151:3: ( 'each' -> ^( QUANTIFIER 'each' ) | 'some' -> ^( QUANTIFIER 'some' ) | 'atLeastOne' -> ^( QUANTIFIER 'atLeastOne' ) | 'atLeast' INT -> ^( QUANTIFIER 'atLeast' INT ) | 'atMostOne' -> ^( QUANTIFIER 'atMostOne' ) | 'atMost' INT -> ^( QUANTIFIER 'atMost' INT ) | 'exactlyOne' -> ^( QUANTIFIER 'exactlyOne' ) | 'exactly' INT -> ^( QUANTIFIER 'exactly' INT ) | 'moreThanOne' -> ^( QUANTIFIER 'moreThanOne' ) | 'atLeastAndAtMost' i1= INT i2= INT -> ^( QUANTIFIER 'atLeastAndAtMost' $i1 $i2) )
            int alt19=10;
            switch ( input.LA(1) ) {
            case 59:
                {
                alt19=1;
                }
                break;
            case 60:
                {
                alt19=2;
                }
                break;
            case 61:
                {
                alt19=3;
                }
                break;
            case 62:
                {
                alt19=4;
                }
                break;
            case 63:
                {
                alt19=5;
                }
                break;
            case 64:
                {
                alt19=6;
                }
                break;
            case 65:
                {
                alt19=7;
                }
                break;
            case 66:
                {
                alt19=8;
                }
                break;
            case 67:
                {
                alt19=9;
                }
                break;
            case 68:
                {
                alt19=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:151:5: 'each'
                    {
                    string_literal35=(Token)match(input,59,FOLLOW_59_in_quantifier922);  
                    stream_59.add(string_literal35);



                    // AST REWRITE
                    // elements: 59
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 152:5: -> ^( QUANTIFIER 'each' )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:152:8: ^( QUANTIFIER 'each' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_59.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:153:5: 'some'
                    {
                    string_literal36=(Token)match(input,60,FOLLOW_60_in_quantifier940);  
                    stream_60.add(string_literal36);



                    // AST REWRITE
                    // elements: 60
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 154:5: -> ^( QUANTIFIER 'some' )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:154:8: ^( QUANTIFIER 'some' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_60.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:155:5: 'atLeastOne'
                    {
                    string_literal37=(Token)match(input,61,FOLLOW_61_in_quantifier958);  
                    stream_61.add(string_literal37);



                    // AST REWRITE
                    // elements: 61
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 156:5: -> ^( QUANTIFIER 'atLeastOne' )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:156:8: ^( QUANTIFIER 'atLeastOne' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_61.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:157:5: 'atLeast' INT
                    {
                    string_literal38=(Token)match(input,62,FOLLOW_62_in_quantifier976);  
                    stream_62.add(string_literal38);

                    INT39=(Token)match(input,INT,FOLLOW_INT_in_quantifier978);  
                    stream_INT.add(INT39);



                    // AST REWRITE
                    // elements: INT, 62
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 158:5: -> ^( QUANTIFIER 'atLeast' INT )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:158:8: ^( QUANTIFIER 'atLeast' INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_62.nextNode());
                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:159:5: 'atMostOne'
                    {
                    string_literal40=(Token)match(input,63,FOLLOW_63_in_quantifier998);  
                    stream_63.add(string_literal40);



                    // AST REWRITE
                    // elements: 63
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 160:5: -> ^( QUANTIFIER 'atMostOne' )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:160:8: ^( QUANTIFIER 'atMostOne' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_63.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:161:5: 'atMost' INT
                    {
                    string_literal41=(Token)match(input,64,FOLLOW_64_in_quantifier1016);  
                    stream_64.add(string_literal41);

                    INT42=(Token)match(input,INT,FOLLOW_INT_in_quantifier1018);  
                    stream_INT.add(INT42);



                    // AST REWRITE
                    // elements: INT, 64
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 162:5: -> ^( QUANTIFIER 'atMost' INT )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:162:8: ^( QUANTIFIER 'atMost' INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_64.nextNode());
                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 7 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:163:5: 'exactlyOne'
                    {
                    string_literal43=(Token)match(input,65,FOLLOW_65_in_quantifier1038);  
                    stream_65.add(string_literal43);



                    // AST REWRITE
                    // elements: 65
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 164:5: -> ^( QUANTIFIER 'exactlyOne' )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:164:8: ^( QUANTIFIER 'exactlyOne' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_65.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 8 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:165:5: 'exactly' INT
                    {
                    string_literal44=(Token)match(input,66,FOLLOW_66_in_quantifier1056);  
                    stream_66.add(string_literal44);

                    INT45=(Token)match(input,INT,FOLLOW_INT_in_quantifier1058);  
                    stream_INT.add(INT45);



                    // AST REWRITE
                    // elements: INT, 66
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 166:5: -> ^( QUANTIFIER 'exactly' INT )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:166:8: ^( QUANTIFIER 'exactly' INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_66.nextNode());
                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 9 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:167:5: 'moreThanOne'
                    {
                    string_literal46=(Token)match(input,67,FOLLOW_67_in_quantifier1078);  
                    stream_67.add(string_literal46);



                    // AST REWRITE
                    // elements: 67
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 168:5: -> ^( QUANTIFIER 'moreThanOne' )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:168:8: ^( QUANTIFIER 'moreThanOne' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_67.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 10 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:169:5: 'atLeastAndAtMost' i1= INT i2= INT
                    {
                    string_literal47=(Token)match(input,68,FOLLOW_68_in_quantifier1096);  
                    stream_68.add(string_literal47);

                    i1=(Token)match(input,INT,FOLLOW_INT_in_quantifier1100);  
                    stream_INT.add(i1);

                    i2=(Token)match(input,INT,FOLLOW_INT_in_quantifier1104);  
                    stream_INT.add(i2);



                    // AST REWRITE
                    // elements: 68, i2, i1
                    // token labels: i2, i1
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_i2=new RewriteRuleTokenStream(adaptor,"token i2",i2);
                    RewriteRuleTokenStream stream_i1=new RewriteRuleTokenStream(adaptor,"token i1",i1);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 170:5: -> ^( QUANTIFIER 'atLeastAndAtMost' $i1 $i2)
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:170:8: ^( QUANTIFIER 'atLeastAndAtMost' $i1 $i2)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(QUANTIFIER, "QUANTIFIER"), root_1);

                        adaptor.addChild(root_1, stream_68.nextNode());
                        adaptor.addChild(root_1, stream_i1.nextNode());
                        adaptor.addChild(root_1, stream_i2.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:173:1: complement : ID -> ^( COMPLEMENT ID ) ;
    public final LetaGrammarParser.complement_return complement() throws RecognitionException {
        LetaGrammarParser.complement_return retval = new LetaGrammarParser.complement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID48=null;

        Object ID48_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");

        try {
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:174:3: ( ID -> ^( COMPLEMENT ID ) )
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:174:5: ID
            {
            ID48=(Token)match(input,ID,FOLLOW_ID_in_complement1135);  
            stream_ID.add(ID48);



            // AST REWRITE
            // elements: ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 175:5: -> ^( COMPLEMENT ID )
            {
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:175:8: ^( COMPLEMENT ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMPLEMENT, "COMPLEMENT"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:178:1: formula : formulaItem '=' formulaExpression -> ^( FORMULA formulaItem formulaExpression ) ;
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
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:179:3: ( formulaItem '=' formulaExpression -> ^( FORMULA formulaItem formulaExpression ) )
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:179:5: formulaItem '=' formulaExpression
            {
            pushFollow(FOLLOW_formulaItem_in_formula1160);
            formulaItem49=formulaItem();

            state._fsp--;

            stream_formulaItem.add(formulaItem49.getTree());
            char_literal50=(Token)match(input,69,FOLLOW_69_in_formula1162);  
            stream_69.add(char_literal50);

            pushFollow(FOLLOW_formulaExpression_in_formula1164);
            formulaExpression51=formulaExpression();

            state._fsp--;

            stream_formulaExpression.add(formulaExpression51.getTree());


            // AST REWRITE
            // elements: formulaItem, formulaExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 180:5: -> ^( FORMULA formulaItem formulaExpression )
            {
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:180:8: ^( FORMULA formulaItem formulaExpression )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMULA, "FORMULA"), root_1);

                adaptor.addChild(root_1, stream_formulaItem.nextTree());
                adaptor.addChild(root_1, stream_formulaExpression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:183:1: formulaExpression : ( formulaItem ( mathOperator formulaExpression )? -> ^( FORMULAEXPRESSION formulaItem ( mathOperator formulaExpression )? ) | '(' formulaExpression ')' ( mathOperator formulaExpression )? -> ^( FORMULAEXPRESSION formulaExpression ( mathOperator formulaExpression )? ) );
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
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:184:3: ( formulaItem ( mathOperator formulaExpression )? -> ^( FORMULAEXPRESSION formulaItem ( mathOperator formulaExpression )? ) | '(' formulaExpression ')' ( mathOperator formulaExpression )? -> ^( FORMULAEXPRESSION formulaExpression ( mathOperator formulaExpression )? ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==ID) ) {
                alt22=1;
            }
            else if ( (LA22_0==53) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:184:5: formulaItem ( mathOperator formulaExpression )?
                    {
                    pushFollow(FOLLOW_formulaItem_in_formulaExpression1191);
                    formulaItem52=formulaItem();

                    state._fsp--;

                    stream_formulaItem.add(formulaItem52.getTree());
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:184:17: ( mathOperator formulaExpression )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=70 && LA20_0<=75)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:184:18: mathOperator formulaExpression
                            {
                            pushFollow(FOLLOW_mathOperator_in_formulaExpression1194);
                            mathOperator53=mathOperator();

                            state._fsp--;

                            stream_mathOperator.add(mathOperator53.getTree());
                            pushFollow(FOLLOW_formulaExpression_in_formulaExpression1196);
                            formulaExpression54=formulaExpression();

                            state._fsp--;

                            stream_formulaExpression.add(formulaExpression54.getTree());

                            }
                            break;

                    }



                    // AST REWRITE
                    // elements: formulaExpression, formulaItem, mathOperator
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 185:5: -> ^( FORMULAEXPRESSION formulaItem ( mathOperator formulaExpression )? )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:185:8: ^( FORMULAEXPRESSION formulaItem ( mathOperator formulaExpression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMULAEXPRESSION, "FORMULAEXPRESSION"), root_1);

                        adaptor.addChild(root_1, stream_formulaItem.nextTree());
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:185:40: ( mathOperator formulaExpression )?
                        if ( stream_formulaExpression.hasNext()||stream_mathOperator.hasNext() ) {
                            adaptor.addChild(root_1, stream_mathOperator.nextTree());
                            adaptor.addChild(root_1, stream_formulaExpression.nextTree());

                        }
                        stream_formulaExpression.reset();
                        stream_mathOperator.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:186:5: '(' formulaExpression ')' ( mathOperator formulaExpression )?
                    {
                    char_literal55=(Token)match(input,53,FOLLOW_53_in_formulaExpression1223);  
                    stream_53.add(char_literal55);

                    pushFollow(FOLLOW_formulaExpression_in_formulaExpression1225);
                    formulaExpression56=formulaExpression();

                    state._fsp--;

                    stream_formulaExpression.add(formulaExpression56.getTree());
                    char_literal57=(Token)match(input,54,FOLLOW_54_in_formulaExpression1227);  
                    stream_54.add(char_literal57);

                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:186:31: ( mathOperator formulaExpression )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=70 && LA21_0<=75)) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:186:32: mathOperator formulaExpression
                            {
                            pushFollow(FOLLOW_mathOperator_in_formulaExpression1230);
                            mathOperator58=mathOperator();

                            state._fsp--;

                            stream_mathOperator.add(mathOperator58.getTree());
                            pushFollow(FOLLOW_formulaExpression_in_formulaExpression1232);
                            formulaExpression59=formulaExpression();

                            state._fsp--;

                            stream_formulaExpression.add(formulaExpression59.getTree());

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
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 187:5: -> ^( FORMULAEXPRESSION formulaExpression ( mathOperator formulaExpression )? )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:187:8: ^( FORMULAEXPRESSION formulaExpression ( mathOperator formulaExpression )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMULAEXPRESSION, "FORMULAEXPRESSION"), root_1);

                        adaptor.addChild(root_1, stream_formulaExpression.nextTree());
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:187:46: ( mathOperator formulaExpression )?
                        if ( stream_mathOperator.hasNext()||stream_formulaExpression.hasNext() ) {
                            adaptor.addChild(root_1, stream_mathOperator.nextTree());
                            adaptor.addChild(root_1, stream_formulaExpression.nextTree());

                        }
                        stream_mathOperator.reset();
                        stream_formulaExpression.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:190:1: formulaItem : ( term | termInstance | termWithAssociation ) -> ^( FORMULAITEM ( term )? ( termInstance )? ( termWithAssociation )? ) ;
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
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:191:3: ( ( term | termInstance | termWithAssociation ) -> ^( FORMULAITEM ( term )? ( termInstance )? ( termWithAssociation )? ) )
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:191:5: ( term | termInstance | termWithAssociation )
            {
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:191:5: ( term | termInstance | termWithAssociation )
            int alt23=3;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:191:6: term
                    {
                    pushFollow(FOLLOW_term_in_formulaItem1268);
                    term60=term();

                    state._fsp--;

                    stream_term.add(term60.getTree());

                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:191:13: termInstance
                    {
                    pushFollow(FOLLOW_termInstance_in_formulaItem1272);
                    termInstance61=termInstance();

                    state._fsp--;

                    stream_termInstance.add(termInstance61.getTree());

                    }
                    break;
                case 3 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:191:28: termWithAssociation
                    {
                    pushFollow(FOLLOW_termWithAssociation_in_formulaItem1276);
                    termWithAssociation62=termWithAssociation();

                    state._fsp--;

                    stream_termWithAssociation.add(termWithAssociation62.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: termInstance, termWithAssociation, term
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 192:5: -> ^( FORMULAITEM ( term )? ( termInstance )? ( termWithAssociation )? )
            {
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:192:8: ^( FORMULAITEM ( term )? ( termInstance )? ( termWithAssociation )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FORMULAITEM, "FORMULAITEM"), root_1);

                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:192:22: ( term )?
                if ( stream_term.hasNext() ) {
                    adaptor.addChild(root_1, stream_term.nextTree());

                }
                stream_term.reset();
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:192:28: ( termInstance )?
                if ( stream_termInstance.hasNext() ) {
                    adaptor.addChild(root_1, stream_termInstance.nextTree());

                }
                stream_termInstance.reset();
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:192:42: ( termWithAssociation )?
                if ( stream_termWithAssociation.hasNext() ) {
                    adaptor.addChild(root_1, stream_termWithAssociation.nextTree());

                }
                stream_termWithAssociation.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:195:1: mathOperator : ( '+' -> ^( OPERATOR '+' ) | '-' -> ^( OPERATOR '-' ) | '/' -> ^( OPERATOR '/' ) | '*' -> ^( OPERATOR '*' ) | '%' -> ^( OPERATOR '%' ) | '**' -> ^( OPERATOR '**' ) );
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
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:196:3: ( '+' -> ^( OPERATOR '+' ) | '-' -> ^( OPERATOR '-' ) | '/' -> ^( OPERATOR '/' ) | '*' -> ^( OPERATOR '*' ) | '%' -> ^( OPERATOR '%' ) | '**' -> ^( OPERATOR '**' ) )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:196:5: '+'
                    {
                    char_literal63=(Token)match(input,70,FOLLOW_70_in_mathOperator1309);  
                    stream_70.add(char_literal63);



                    // AST REWRITE
                    // elements: 70
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 197:5: -> ^( OPERATOR '+' )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:197:8: ^( OPERATOR '+' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_70.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:198:5: '-'
                    {
                    char_literal64=(Token)match(input,71,FOLLOW_71_in_mathOperator1327);  
                    stream_71.add(char_literal64);



                    // AST REWRITE
                    // elements: 71
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 199:5: -> ^( OPERATOR '-' )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:199:8: ^( OPERATOR '-' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_71.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:200:5: '/'
                    {
                    char_literal65=(Token)match(input,72,FOLLOW_72_in_mathOperator1345);  
                    stream_72.add(char_literal65);



                    // AST REWRITE
                    // elements: 72
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 201:5: -> ^( OPERATOR '/' )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:201:8: ^( OPERATOR '/' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_72.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:202:5: '*'
                    {
                    char_literal66=(Token)match(input,73,FOLLOW_73_in_mathOperator1363);  
                    stream_73.add(char_literal66);



                    // AST REWRITE
                    // elements: 73
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 203:5: -> ^( OPERATOR '*' )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:203:8: ^( OPERATOR '*' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_73.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:204:5: '%'
                    {
                    char_literal67=(Token)match(input,74,FOLLOW_74_in_mathOperator1381);  
                    stream_74.add(char_literal67);



                    // AST REWRITE
                    // elements: 74
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 205:5: -> ^( OPERATOR '%' )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:205:8: ^( OPERATOR '%' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_74.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:206:5: '**'
                    {
                    string_literal68=(Token)match(input,75,FOLLOW_75_in_mathOperator1399);  
                    stream_75.add(string_literal68);



                    // AST REWRITE
                    // elements: 75
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 207:5: -> ^( OPERATOR '**' )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:207:8: ^( OPERATOR '**' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_75.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:210:1: relationalOperator : ( '>' -> ^( OPERATOR '>' ) | '<' -> ^( OPERATOR '<' ) | '>=' -> ^( OPERATOR '>=' ) | '<=' -> ^( OPERATOR '<=' ) | '!=' -> ^( OPERATOR '!=' ) );
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
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:211:3: ( '>' -> ^( OPERATOR '>' ) | '<' -> ^( OPERATOR '<' ) | '>=' -> ^( OPERATOR '>=' ) | '<=' -> ^( OPERATOR '<=' ) | '!=' -> ^( OPERATOR '!=' ) )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:211:5: '>'
                    {
                    char_literal69=(Token)match(input,76,FOLLOW_76_in_relationalOperator1424);  
                    stream_76.add(char_literal69);



                    // AST REWRITE
                    // elements: 76
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 212:5: -> ^( OPERATOR '>' )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:212:8: ^( OPERATOR '>' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_76.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:213:5: '<'
                    {
                    char_literal70=(Token)match(input,77,FOLLOW_77_in_relationalOperator1442);  
                    stream_77.add(char_literal70);



                    // AST REWRITE
                    // elements: 77
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 214:5: -> ^( OPERATOR '<' )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:214:8: ^( OPERATOR '<' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_77.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:215:5: '>='
                    {
                    string_literal71=(Token)match(input,78,FOLLOW_78_in_relationalOperator1460);  
                    stream_78.add(string_literal71);



                    // AST REWRITE
                    // elements: 78
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 216:5: -> ^( OPERATOR '>=' )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:216:8: ^( OPERATOR '>=' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_78.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:217:5: '<='
                    {
                    string_literal72=(Token)match(input,79,FOLLOW_79_in_relationalOperator1478);  
                    stream_79.add(string_literal72);



                    // AST REWRITE
                    // elements: 79
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 218:5: -> ^( OPERATOR '<=' )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:218:8: ^( OPERATOR '<=' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_79.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:219:5: '!='
                    {
                    string_literal73=(Token)match(input,80,FOLLOW_80_in_relationalOperator1496);  
                    stream_80.add(string_literal73);



                    // AST REWRITE
                    // elements: 80
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 220:5: -> ^( OPERATOR '!=' )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:220:8: ^( OPERATOR '!=' )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPERATOR, "OPERATOR"), root_1);

                        adaptor.addChild(root_1, stream_80.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:223:1: set : '{' subSet '}' ( ',' set )? -> ^( SET subSet ( set )? ) ;
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
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:224:3: ( '{' subSet '}' ( ',' set )? -> ^( SET subSet ( set )? ) )
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:224:5: '{' subSet '}' ( ',' set )?
            {
            char_literal74=(Token)match(input,51,FOLLOW_51_in_set1521);  
            stream_51.add(char_literal74);

            pushFollow(FOLLOW_subSet_in_set1523);
            subSet75=subSet();

            state._fsp--;

            stream_subSet.add(subSet75.getTree());
            char_literal76=(Token)match(input,52,FOLLOW_52_in_set1525);  
            stream_52.add(char_literal76);

            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:224:20: ( ',' set )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==57) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:224:21: ',' set
                    {
                    char_literal77=(Token)match(input,57,FOLLOW_57_in_set1528);  
                    stream_57.add(char_literal77);

                    pushFollow(FOLLOW_set_in_set1530);
                    set78=set();

                    state._fsp--;

                    stream_set.add(set78.getTree());

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
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 225:5: -> ^( SET subSet ( set )? )
            {
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:225:8: ^( SET subSet ( set )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SET, "SET"), root_1);

                adaptor.addChild(root_1, stream_subSet.nextTree());
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:225:21: ( set )?
                if ( stream_set.hasNext() ) {
                    adaptor.addChild(root_1, stream_set.nextTree());

                }
                stream_set.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:228:1: subSet : literal ( ',' subSet )? -> ^( SUBSET literal ( subSet )? ) ;
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
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:229:3: ( literal ( ',' subSet )? -> ^( SUBSET literal ( subSet )? ) )
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:229:5: literal ( ',' subSet )?
            {
            pushFollow(FOLLOW_literal_in_subSet1560);
            literal79=literal();

            state._fsp--;

            stream_literal.add(literal79.getTree());
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:229:13: ( ',' subSet )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==57) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:229:14: ',' subSet
                    {
                    char_literal80=(Token)match(input,57,FOLLOW_57_in_subSet1563);  
                    stream_57.add(char_literal80);

                    pushFollow(FOLLOW_subSet_in_subSet1565);
                    subSet81=subSet();

                    state._fsp--;

                    stream_subSet.add(subSet81.getTree());

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
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 230:5: -> ^( SUBSET literal ( subSet )? )
            {
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:230:8: ^( SUBSET literal ( subSet )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SUBSET, "SUBSET"), root_1);

                adaptor.addChild(root_1, stream_literal.nextTree());
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:230:25: ( subSet )?
                if ( stream_subSet.hasNext() ) {
                    adaptor.addChild(root_1, stream_subSet.nextTree());

                }
                stream_subSet.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:233:1: literal : ( STRING -> ^( LITERAL STRING ) | FLOAT -> ^( LITERAL FLOAT ) | MINUS_FLOAT -> ^( LITERAL MINUS_FLOAT ) | INT -> ^( LITERAL INT ) | MINUS_INT -> ^( LITERAL MINUS_INT ) | 'null' -> ^( LITERAL NULL ) );
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
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:234:3: ( STRING -> ^( LITERAL STRING ) | FLOAT -> ^( LITERAL FLOAT ) | MINUS_FLOAT -> ^( LITERAL MINUS_FLOAT ) | INT -> ^( LITERAL INT ) | MINUS_INT -> ^( LITERAL MINUS_INT ) | 'null' -> ^( LITERAL NULL ) )
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
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:234:5: STRING
                    {
                    STRING82=(Token)match(input,STRING,FOLLOW_STRING_in_literal1595);  
                    stream_STRING.add(STRING82);



                    // AST REWRITE
                    // elements: STRING
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 235:5: -> ^( LITERAL STRING )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:235:8: ^( LITERAL STRING )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LITERAL, "LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_STRING.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:236:5: FLOAT
                    {
                    FLOAT83=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_literal1613);  
                    stream_FLOAT.add(FLOAT83);



                    // AST REWRITE
                    // elements: FLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 237:5: -> ^( LITERAL FLOAT )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:237:8: ^( LITERAL FLOAT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LITERAL, "LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_FLOAT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 3 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:238:5: MINUS_FLOAT
                    {
                    MINUS_FLOAT84=(Token)match(input,MINUS_FLOAT,FOLLOW_MINUS_FLOAT_in_literal1631);  
                    stream_MINUS_FLOAT.add(MINUS_FLOAT84);



                    // AST REWRITE
                    // elements: MINUS_FLOAT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 239:5: -> ^( LITERAL MINUS_FLOAT )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:239:8: ^( LITERAL MINUS_FLOAT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LITERAL, "LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_MINUS_FLOAT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 4 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:240:5: INT
                    {
                    INT85=(Token)match(input,INT,FOLLOW_INT_in_literal1649);  
                    stream_INT.add(INT85);



                    // AST REWRITE
                    // elements: INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 241:5: -> ^( LITERAL INT )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:241:8: ^( LITERAL INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LITERAL, "LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 5 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:242:5: MINUS_INT
                    {
                    MINUS_INT86=(Token)match(input,MINUS_INT,FOLLOW_MINUS_INT_in_literal1667);  
                    stream_MINUS_INT.add(MINUS_INT86);



                    // AST REWRITE
                    // elements: MINUS_INT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 243:5: -> ^( LITERAL MINUS_INT )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:243:8: ^( LITERAL MINUS_INT )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LITERAL, "LITERAL"), root_1);

                        adaptor.addChild(root_1, stream_MINUS_INT.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 6 :
                    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:244:5: 'null'
                    {
                    string_literal87=(Token)match(input,81,FOLLOW_81_in_literal1685);  
                    stream_81.add(string_literal87);



                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 245:5: -> ^( LITERAL NULL )
                    {
                        // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:245:8: ^( LITERAL NULL )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LITERAL, "LITERAL"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(NULL, "NULL"));

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:248:1: testPackage : 'Package' PACKAGE_ID -> ^( PACKAGE PACKAGE_ID ) ;
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
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:249:3: ( 'Package' PACKAGE_ID -> ^( PACKAGE PACKAGE_ID ) )
            // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:249:5: 'Package' PACKAGE_ID
            {
            string_literal88=(Token)match(input,82,FOLLOW_82_in_testPackage1710);  
            stream_82.add(string_literal88);

            PACKAGE_ID89=(Token)match(input,PACKAGE_ID,FOLLOW_PACKAGE_ID_in_testPackage1712);  
            stream_PACKAGE_ID.add(PACKAGE_ID89);



            // AST REWRITE
            // elements: PACKAGE_ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 250:5: -> ^( PACKAGE PACKAGE_ID )
            {
                // /Users/Rogerio/Projects/core/src/main/java/leta/core/grammar/LetaGrammar.g:250:8: ^( PACKAGE PACKAGE_ID )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PACKAGE, "PACKAGE"), root_1);

                adaptor.addChild(root_1, stream_PACKAGE_ID.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

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
    protected DFA16 dfa16 = new DFA16(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA4_eotS =
        "\21\uffff";
    static final String DFA4_eofS =
        "\21\uffff";
    static final String DFA4_minS =
        "\1\44\1\uffff\1\44\5\45\6\44\1\45\1\uffff\1\44";
    static final String DFA4_maxS =
        "\1\104\1\uffff\6\121\6\105\1\45\1\uffff\1\105";
    static final String DFA4_acceptS =
        "\1\uffff\1\1\15\uffff\1\2\1\uffff";
    static final String DFA4_specialS =
        "\21\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\26\uffff\12\1",
            "",
            "\1\1\1\13\1\10\1\11\1\12\1\14\20\uffff\1\16\12\uffff\1\17\6"+
            "\uffff\1\3\1\4\1\5\1\6\1\7\1\15",
            "\1\13\1\10\1\11\1\12\1\14\20\uffff\1\16\26\uffff\1\15",
            "\1\13\1\10\1\11\1\12\1\14\20\uffff\1\16\26\uffff\1\15",
            "\1\13\1\10\1\11\1\12\1\14\20\uffff\1\16\26\uffff\1\15",
            "\1\13\1\10\1\11\1\12\1\14\20\uffff\1\16\26\uffff\1\15",
            "\1\13\1\10\1\11\1\12\1\14\20\uffff\1\16\26\uffff\1\15",
            "\1\1\40\uffff\1\17",
            "\1\1\40\uffff\1\17",
            "\1\1\40\uffff\1\17",
            "\1\1\40\uffff\1\17",
            "\1\1\40\uffff\1\17",
            "\1\1\40\uffff\1\17",
            "\1\20",
            "",
            "\1\1\40\uffff\1\17"
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
            return "96:5: (f= fact | fo= formula )";
        }
    }
    static final String DFA16_eotS =
        "\12\uffff";
    static final String DFA16_eofS =
        "\1\uffff\1\11\10\uffff";
    static final String DFA16_minS =
        "\2\44\5\45\3\uffff";
    static final String DFA16_maxS =
        "\1\44\6\121\3\uffff";
    static final String DFA16_acceptS =
        "\7\uffff\1\3\1\2\1\1";
    static final String DFA16_specialS =
        "\12\uffff}>";
    static final String[] DFA16_transitionS = {
            "\1\1",
            "\1\11\5\10\5\uffff\1\11\1\uffff\2\11\3\uffff\4\11\1\7\21\uffff"+
            "\1\2\1\3\1\4\1\5\1\6\1\10",
            "\5\10\20\uffff\1\7\26\uffff\1\10",
            "\5\10\20\uffff\1\7\26\uffff\1\10",
            "\5\10\20\uffff\1\7\26\uffff\1\10",
            "\5\10\20\uffff\1\7\26\uffff\1\10",
            "\5\10\20\uffff\1\7\26\uffff\1\10",
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
            return "129:17: (t= term | ti= termInstance | twa= termWithAssociation )";
        }
    }
    static final String DFA23_eotS =
        "\12\uffff";
    static final String DFA23_eofS =
        "\1\uffff\1\2\10\uffff";
    static final String DFA23_minS =
        "\1\44\1\45\1\uffff\5\45\2\uffff";
    static final String DFA23_maxS =
        "\1\44\1\121\1\uffff\5\121\2\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\1\5\uffff\1\3\1\2";
    static final String DFA23_specialS =
        "\12\uffff}>";
    static final String[] DFA23_transitionS = {
            "\1\1",
            "\5\11\5\uffff\1\2\1\uffff\2\2\3\uffff\3\2\1\uffff\1\10\12\uffff"+
            "\7\2\1\3\1\4\1\5\1\6\1\7\1\11",
            "",
            "\5\11\20\uffff\1\10\26\uffff\1\11",
            "\5\11\20\uffff\1\10\26\uffff\1\11",
            "\5\11\20\uffff\1\10\26\uffff\1\11",
            "\5\11\20\uffff\1\10\26\uffff\1\11",
            "\5\11\20\uffff\1\10\26\uffff\1\11",
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
            return "191:5: ( term | termInstance | termWithAssociation )";
        }
    }
 

    public static final BitSet FOLLOW_testPackage_in_leta215 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_testCase_in_leta218 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_47_in_testCase249 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_ID_in_testCase251 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_verifyClause_in_testCase253 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_whenClause_in_testCase255 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_setClause_in_testCase257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_verifyClause290 = new BitSet(new long[]{0xF820001000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_factComposite_in_verifyClause292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_whenClause317 = new BitSet(new long[]{0xF820001000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_factComposite_in_whenClause319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_setClause344 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_setClause346 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_set_in_setClause348 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_setClause350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fact_in_factComposite378 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_formula_in_factComposite384 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_logicalOperator_in_factComposite390 = new BitSet(new long[]{0xF820001000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_factComposite_in_factComposite394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_factComposite502 = new BitSet(new long[]{0xF820001000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_factComposite_in_factComposite506 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_factComposite508 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_logicalOperator_in_factComposite513 = new BitSet(new long[]{0xF820001000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_factComposite_in_factComposite517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_logicalOperator585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_logicalOperator597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termComposite_in_fact618 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_complement_in_fact622 = new BitSet(new long[]{0xF800001000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_termComposite_in_fact627 = new BitSet(new long[]{0x0200001000000002L});
    public static final BitSet FOLLOW_factExt_in_fact631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_factExt673 = new BitSet(new long[]{0xF800001000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_termComposite_in_factExt675 = new BitSet(new long[]{0x0200001000000002L});
    public static final BitSet FOLLOW_factExt_in_factExt677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_complement_in_factExt701 = new BitSet(new long[]{0xF800001000000002L,0x000000000000001FL});
    public static final BitSet FOLLOW_termComposite_in_factExt704 = new BitSet(new long[]{0x0200001000000002L});
    public static final BitSet FOLLOW_factExt_in_factExt706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_quantifier_in_termComposite742 = new BitSet(new long[]{0xF800001000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_term_in_termComposite748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termInstance_in_termComposite754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termWithAssociation_in_termComposite760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_termInstance848 = new BitSet(new long[]{0x000003E000000000L,0x000000000003F000L});
    public static final BitSet FOLLOW_relationalOperator_in_termInstance850 = new BitSet(new long[]{0x000003E000000000L,0x000000000003F000L});
    public static final BitSet FOLLOW_literal_in_termInstance853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_termWithAssociation883 = new BitSet(new long[]{0x0400000000000000L,0x000000000001F000L});
    public static final BitSet FOLLOW_relationalOperator_in_termWithAssociation885 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_termWithAssociation888 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_termWithAssociation890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_quantifier922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_quantifier940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_quantifier958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_quantifier976 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_quantifier998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_quantifier1016 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_quantifier1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_quantifier1056 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_quantifier1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_quantifier1096 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier1100 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_quantifier1104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_complement1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formulaItem_in_formula1160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_formula1162 = new BitSet(new long[]{0xF820001000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_formulaExpression_in_formula1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_formulaItem_in_formulaExpression1191 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_mathOperator_in_formulaExpression1194 = new BitSet(new long[]{0xF820001000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_formulaExpression_in_formulaExpression1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_formulaExpression1223 = new BitSet(new long[]{0xF820001000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_formulaExpression_in_formulaExpression1225 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_formulaExpression1227 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000FC0L});
    public static final BitSet FOLLOW_mathOperator_in_formulaExpression1230 = new BitSet(new long[]{0xF820001000000000L,0x000000000000001FL});
    public static final BitSet FOLLOW_formulaExpression_in_formulaExpression1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_formulaItem1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termInstance_in_formulaItem1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_termWithAssociation_in_formulaItem1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_mathOperator1309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_mathOperator1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_mathOperator1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_mathOperator1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_mathOperator1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_mathOperator1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_relationalOperator1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_relationalOperator1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_relationalOperator1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_relationalOperator1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_relationalOperator1496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_set1521 = new BitSet(new long[]{0x000003E000000000L,0x000000000003F000L});
    public static final BitSet FOLLOW_subSet_in_set1523 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_set1525 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_set1528 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_set_in_set1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_subSet1560 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_57_in_subSet1563 = new BitSet(new long[]{0x000003E000000000L,0x000000000003F000L});
    public static final BitSet FOLLOW_subSet_in_subSet1565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_literal1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_literal1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_FLOAT_in_literal1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_literal1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_INT_in_literal1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_literal1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_testPackage1710 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_PACKAGE_ID_in_testPackage1712 = new BitSet(new long[]{0x0000000000000002L});

}