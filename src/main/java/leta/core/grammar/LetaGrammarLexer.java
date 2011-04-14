// $ANTLR 3.3 Nov 30, 2010 12:46:29 /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g 2011-04-13 23:18:39

  package leta.core.grammar;
  
  import leta.core.model.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class LetaGrammarLexer extends Lexer {
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
    public static final int DATE_TIME=41;
    public static final int PACKAGE_ID=42;
    public static final int DIGIT=43;
    public static final int COMMENT=44;
    public static final int LINE_COMMENT=45;
    public static final int WS=46;

    // delegates
    // delegators

    public LetaGrammarLexer() {;} 
    public LetaGrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LetaGrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g"; }

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:13:7: ( 'Test' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:13:9: 'Test'
            {
            match("Test"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:14:7: ( 'Verify' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:14:9: 'Verify'
            {
            match("Verify"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:15:7: ( 'When' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:15:9: 'When'
            {
            match("When"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:16:7: ( 'Set' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:16:9: 'Set'
            {
            match("Set"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:17:7: ( '{' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:17:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:18:7: ( '}' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:18:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:19:7: ( '(' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:19:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:20:7: ( ')' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:20:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:21:7: ( 'And' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:21:9: 'And'
            {
            match("And"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:22:7: ( 'Or' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:22:9: 'Or'
            {
            match("Or"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:23:7: ( '@' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:23:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:24:7: ( 'atLeast' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:24:9: 'atLeast'
            {
            match("atLeast"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:25:7: ( 'atMost' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:25:9: 'atMost'
            {
            match("atMost"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:26:7: ( 'exactly' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:26:9: 'exactly'
            {
            match("exactly"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:27:7: ( 'atLeastAndAtMost' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:27:9: 'atLeastAndAtMost'
            {
            match("atLeastAndAtMost"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:28:7: ( '=' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:28:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:29:7: ( '+' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:29:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:30:7: ( '-' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:30:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:31:7: ( '/' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:31:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:32:7: ( '*' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:32:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:33:7: ( '%' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:33:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:34:7: ( '**' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:34:9: '**'
            {
            match("**"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:35:7: ( '>' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:35:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:36:7: ( '<' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:36:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:37:7: ( '>=' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:37:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:38:7: ( '<=' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:38:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:39:7: ( '!=' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:39:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:40:7: ( ',' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:40:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:41:7: ( 'null' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:41:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:42:7: ( 'Package' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:42:9: 'Package'
            {
            match("Package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:255:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:255:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:255:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:260:3: ( '0' .. '9' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:260:5: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:264:3: ( ( DIGIT )+ )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:264:5: ( DIGIT )+
            {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:264:5: ( DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:264:5: DIGIT
            	    {
            	    mDIGIT(); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "MINUS_INT"
    public final void mMINUS_INT() throws RecognitionException {
        try {
            int _type = MINUS_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:268:3: ( '-' ( DIGIT )+ )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:268:5: '-' ( DIGIT )+
            {
            match('-'); 
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:268:9: ( DIGIT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:268:9: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS_INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:272:3: ( ( DIGIT )+ '\\.' ( DIGIT )* )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:272:5: ( DIGIT )+ '\\.' ( DIGIT )*
            {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:272:5: ( DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:272:5: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            match('.'); 
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:272:17: ( DIGIT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:272:17: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "MINUS_FLOAT"
    public final void mMINUS_FLOAT() throws RecognitionException {
        try {
            int _type = MINUS_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:276:3: ( '-' ( DIGIT )+ '\\.' ( DIGIT )* )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:276:5: '-' ( DIGIT )+ '\\.' ( DIGIT )*
            {
            match('-'); 
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:276:9: ( DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:276:9: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            match('.'); 
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:276:21: ( DIGIT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:276:21: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS_FLOAT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:280:3: ( '\"' (~ ( '\"' | '\\\\' ) )* '\"' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:280:5: '\"' (~ ( '\"' | '\\\\' ) )* '\"'
            {
            match('\"'); 
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:280:9: (~ ( '\"' | '\\\\' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:280:10: ~ ( '\"' | '\\\\' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "DATE_TIME"
    public final void mDATE_TIME() throws RecognitionException {
        try {
            int _type = DATE_TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:3: ( '[' ( DIGIT )+ ( '-' ( DIGIT )+ ( '-' ( DIGIT )+ )? )? ( ' ' ( DIGIT )+ ':' ( DIGIT )+ ( ':' ( DIGIT )+ ( '.' ( DIGIT )+ )? )? ( 'AM' | 'PM' )? ( ( '+' | '-' ) ( DIGIT )+ ':' ( DIGIT )+ )? )? ']' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:5: '[' ( DIGIT )+ ( '-' ( DIGIT )+ ( '-' ( DIGIT )+ )? )? ( ' ' ( DIGIT )+ ':' ( DIGIT )+ ( ':' ( DIGIT )+ ( '.' ( DIGIT )+ )? )? ( 'AM' | 'PM' )? ( ( '+' | '-' ) ( DIGIT )+ ':' ( DIGIT )+ )? )? ']'
            {
            match('['); 
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:9: ( DIGIT )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:9: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:16: ( '-' ( DIGIT )+ ( '-' ( DIGIT )+ )? )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='-') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:17: '-' ( DIGIT )+ ( '-' ( DIGIT )+ )?
                    {
                    match('-'); 
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:21: ( DIGIT )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:21: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);

                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:28: ( '-' ( DIGIT )+ )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0=='-') ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:29: '-' ( DIGIT )+
                            {
                            match('-'); 
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:33: ( DIGIT )+
                            int cnt11=0;
                            loop11:
                            do {
                                int alt11=2;
                                int LA11_0 = input.LA(1);

                                if ( ((LA11_0>='0' && LA11_0<='9')) ) {
                                    alt11=1;
                                }


                                switch (alt11) {
                            	case 1 :
                            	    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:33: DIGIT
                            	    {
                            	    mDIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt11 >= 1 ) break loop11;
                                        EarlyExitException eee =
                                            new EarlyExitException(11, input);
                                        throw eee;
                                }
                                cnt11++;
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:44: ( ' ' ( DIGIT )+ ':' ( DIGIT )+ ( ':' ( DIGIT )+ ( '.' ( DIGIT )+ )? )? ( 'AM' | 'PM' )? ( ( '+' | '-' ) ( DIGIT )+ ':' ( DIGIT )+ )? )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==' ') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:45: ' ' ( DIGIT )+ ':' ( DIGIT )+ ( ':' ( DIGIT )+ ( '.' ( DIGIT )+ )? )? ( 'AM' | 'PM' )? ( ( '+' | '-' ) ( DIGIT )+ ':' ( DIGIT )+ )?
                    {
                    match(' '); 
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:49: ( DIGIT )+
                    int cnt14=0;
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:49: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt14 >= 1 ) break loop14;
                                EarlyExitException eee =
                                    new EarlyExitException(14, input);
                                throw eee;
                        }
                        cnt14++;
                    } while (true);

                    match(':'); 
                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:60: ( DIGIT )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0>='0' && LA15_0<='9')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:60: DIGIT
                    	    {
                    	    mDIGIT(); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:67: ( ':' ( DIGIT )+ ( '.' ( DIGIT )+ )? )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==':') ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:68: ':' ( DIGIT )+ ( '.' ( DIGIT )+ )?
                            {
                            match(':'); 
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:72: ( DIGIT )+
                            int cnt16=0;
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:72: DIGIT
                            	    {
                            	    mDIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt16 >= 1 ) break loop16;
                                        EarlyExitException eee =
                                            new EarlyExitException(16, input);
                                        throw eee;
                                }
                                cnt16++;
                            } while (true);

                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:79: ( '.' ( DIGIT )+ )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0=='.') ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:80: '.' ( DIGIT )+
                                    {
                                    match('.'); 
                                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:84: ( DIGIT )+
                                    int cnt17=0;
                                    loop17:
                                    do {
                                        int alt17=2;
                                        int LA17_0 = input.LA(1);

                                        if ( ((LA17_0>='0' && LA17_0<='9')) ) {
                                            alt17=1;
                                        }


                                        switch (alt17) {
                                    	case 1 :
                                    	    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:84: DIGIT
                                    	    {
                                    	    mDIGIT(); 

                                    	    }
                                    	    break;

                                    	default :
                                    	    if ( cnt17 >= 1 ) break loop17;
                                                EarlyExitException eee =
                                                    new EarlyExitException(17, input);
                                                throw eee;
                                        }
                                        cnt17++;
                                    } while (true);


                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:95: ( 'AM' | 'PM' )?
                    int alt20=3;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='A') ) {
                        alt20=1;
                    }
                    else if ( (LA20_0=='P') ) {
                        alt20=2;
                    }
                    switch (alt20) {
                        case 1 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:96: 'AM'
                            {
                            match("AM"); 


                            }
                            break;
                        case 2 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:103: 'PM'
                            {
                            match("PM"); 


                            }
                            break;

                    }

                    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:110: ( ( '+' | '-' ) ( DIGIT )+ ':' ( DIGIT )+ )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='+'||LA23_0=='-') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:111: ( '+' | '-' ) ( DIGIT )+ ':' ( DIGIT )+
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:123: ( DIGIT )+
                            int cnt21=0;
                            loop21:
                            do {
                                int alt21=2;
                                int LA21_0 = input.LA(1);

                                if ( ((LA21_0>='0' && LA21_0<='9')) ) {
                                    alt21=1;
                                }


                                switch (alt21) {
                            	case 1 :
                            	    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:123: DIGIT
                            	    {
                            	    mDIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt21 >= 1 ) break loop21;
                                        EarlyExitException eee =
                                            new EarlyExitException(21, input);
                                        throw eee;
                                }
                                cnt21++;
                            } while (true);

                            match(':'); 
                            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:134: ( DIGIT )+
                            int cnt22=0;
                            loop22:
                            do {
                                int alt22=2;
                                int LA22_0 = input.LA(1);

                                if ( ((LA22_0>='0' && LA22_0<='9')) ) {
                                    alt22=1;
                                }


                                switch (alt22) {
                            	case 1 :
                            	    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:284:134: DIGIT
                            	    {
                            	    mDIGIT(); 

                            	    }
                            	    break;

                            	default :
                            	    if ( cnt22 >= 1 ) break loop22;
                                        EarlyExitException eee =
                                            new EarlyExitException(22, input);
                                        throw eee;
                                }
                                cnt22++;
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;

            }

            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DATE_TIME"

    // $ANTLR start "PACKAGE_ID"
    public final void mPACKAGE_ID() throws RecognitionException {
        try {
            int _type = PACKAGE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:288:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '0' .. '9' )* ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:288:5: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '0' .. '9' )* ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:288:27: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '0' .. '9' )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='0' && LA25_0<='9')||(LA25_0>='A' && LA25_0<='Z')||(LA25_0>='a' && LA25_0<='z')) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1=='.'||(LA25_1>='0' && LA25_1<='9')||(LA25_1>='A' && LA25_1<='Z')||LA25_1=='_'||(LA25_1>='a' && LA25_1<='z')) ) {
                        alt25=1;
                    }


                }
                else if ( (LA25_0=='.'||LA25_0=='_') ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:
            	    {
            	    if ( input.LA(1)=='.'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PACKAGE_ID"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:292:3: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:292:5: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:292:10: ( options {greedy=false; } : . )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0=='*') ) {
                    int LA26_1 = input.LA(2);

                    if ( (LA26_1=='/') ) {
                        alt26=2;
                    }
                    else if ( ((LA26_1>='\u0000' && LA26_1<='.')||(LA26_1>='0' && LA26_1<='\uFFFF')) ) {
                        alt26=1;
                    }


                }
                else if ( ((LA26_0>='\u0000' && LA26_0<=')')||(LA26_0>='+' && LA26_0<='\uFFFF')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:292:37: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            match("*/"); 

            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:296:3: ( '//' (~ '\\n' )* '\\n' )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:296:5: '//' (~ '\\n' )* '\\n'
            {
            match("//"); 

            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:296:10: (~ '\\n' )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>='\u0000' && LA27_0<='\t')||(LA27_0>='\u000B' && LA27_0<='\uFFFF')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:296:11: ~ '\\n'
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            match('\n'); 
            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:300:3: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:300:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:300:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>='\t' && LA28_0<='\n')||LA28_0=='\r'||LA28_0==' ') ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt28 >= 1 ) break loop28;
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
            } while (true);

             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:8: ( T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | ID | INT | MINUS_INT | FLOAT | MINUS_FLOAT | STRING | DATE_TIME | PACKAGE_ID | COMMENT | LINE_COMMENT | WS )
        int alt29=41;
        alt29 = dfa29.predict(input);
        switch (alt29) {
            case 1 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:10: T__47
                {
                mT__47(); 

                }
                break;
            case 2 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:16: T__48
                {
                mT__48(); 

                }
                break;
            case 3 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:22: T__49
                {
                mT__49(); 

                }
                break;
            case 4 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:28: T__50
                {
                mT__50(); 

                }
                break;
            case 5 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:34: T__51
                {
                mT__51(); 

                }
                break;
            case 6 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:40: T__52
                {
                mT__52(); 

                }
                break;
            case 7 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:46: T__53
                {
                mT__53(); 

                }
                break;
            case 8 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:52: T__54
                {
                mT__54(); 

                }
                break;
            case 9 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:58: T__55
                {
                mT__55(); 

                }
                break;
            case 10 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:64: T__56
                {
                mT__56(); 

                }
                break;
            case 11 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:70: T__57
                {
                mT__57(); 

                }
                break;
            case 12 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:76: T__58
                {
                mT__58(); 

                }
                break;
            case 13 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:82: T__59
                {
                mT__59(); 

                }
                break;
            case 14 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:88: T__60
                {
                mT__60(); 

                }
                break;
            case 15 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:94: T__61
                {
                mT__61(); 

                }
                break;
            case 16 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:100: T__62
                {
                mT__62(); 

                }
                break;
            case 17 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:106: T__63
                {
                mT__63(); 

                }
                break;
            case 18 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:112: T__64
                {
                mT__64(); 

                }
                break;
            case 19 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:118: T__65
                {
                mT__65(); 

                }
                break;
            case 20 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:124: T__66
                {
                mT__66(); 

                }
                break;
            case 21 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:130: T__67
                {
                mT__67(); 

                }
                break;
            case 22 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:136: T__68
                {
                mT__68(); 

                }
                break;
            case 23 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:142: T__69
                {
                mT__69(); 

                }
                break;
            case 24 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:148: T__70
                {
                mT__70(); 

                }
                break;
            case 25 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:154: T__71
                {
                mT__71(); 

                }
                break;
            case 26 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:160: T__72
                {
                mT__72(); 

                }
                break;
            case 27 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:166: T__73
                {
                mT__73(); 

                }
                break;
            case 28 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:172: T__74
                {
                mT__74(); 

                }
                break;
            case 29 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:178: T__75
                {
                mT__75(); 

                }
                break;
            case 30 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:184: T__76
                {
                mT__76(); 

                }
                break;
            case 31 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:190: ID
                {
                mID(); 

                }
                break;
            case 32 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:193: INT
                {
                mINT(); 

                }
                break;
            case 33 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:197: MINUS_INT
                {
                mMINUS_INT(); 

                }
                break;
            case 34 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:207: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 35 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:213: MINUS_FLOAT
                {
                mMINUS_FLOAT(); 

                }
                break;
            case 36 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:225: STRING
                {
                mSTRING(); 

                }
                break;
            case 37 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:232: DATE_TIME
                {
                mDATE_TIME(); 

                }
                break;
            case 38 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:242: PACKAGE_ID
                {
                mPACKAGE_ID(); 

                }
                break;
            case 39 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:253: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 40 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:261: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 41 :
                // /Users/Rogerio/Projects/LetaCore/src/main/java/leta/core/grammar/LetaGrammar.g:1:274: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA29_eotS =
        "\1\uffff\4\36\4\uffff\2\36\1\uffff\2\36\2\uffff\1\53\1\57\1\61\1"+
        "\uffff\1\63\1\65\2\uffff\3\36\1\70\4\uffff\2\36\1\uffff\5\36\1\77"+
        "\2\36\1\uffff\1\103\11\uffff\2\36\2\uffff\3\36\1\112\1\113\1\uffff"+
        "\3\36\2\uffff\2\36\1\121\1\36\1\123\2\uffff\3\36\1\127\1\36\1\uffff"+
        "\1\36\1\uffff\3\36\1\uffff\1\36\1\136\1\36\1\140\2\36\1\uffff\1"+
        "\144\1\uffff\1\145\1\146\1\36\3\uffff\7\36\1\157\1\uffff";
    static final String DFA29_eofS =
        "\160\uffff";
    static final String DFA29_minS =
        "\1\11\4\56\4\uffff\2\56\1\uffff\2\56\2\uffff\1\60\2\52\1\uffff\2"+
        "\75\2\uffff\4\56\4\uffff\2\56\1\uffff\10\56\1\uffff\1\56\11\uffff"+
        "\2\56\2\uffff\5\56\1\uffff\3\56\2\uffff\5\56\2\uffff\5\56\1\uffff"+
        "\1\56\1\uffff\3\56\1\uffff\6\56\1\uffff\1\56\1\uffff\3\56\3\uffff"+
        "\10\56\1\uffff";
    static final String DFA29_maxS =
        "\1\175\4\172\4\uffff\2\172\1\uffff\2\172\2\uffff\1\71\1\57\1\52"+
        "\1\uffff\2\75\2\uffff\3\172\1\71\4\uffff\2\172\1\uffff\10\172\1"+
        "\uffff\1\71\11\uffff\2\172\2\uffff\5\172\1\uffff\3\172\2\uffff\5"+
        "\172\2\uffff\5\172\1\uffff\1\172\1\uffff\3\172\1\uffff\6\172\1\uffff"+
        "\1\172\1\uffff\3\172\3\uffff\10\172\1\uffff";
    static final String DFA29_acceptS =
        "\5\uffff\1\5\1\6\1\7\1\10\2\uffff\1\13\2\uffff\1\20\1\21\3\uffff"+
        "\1\25\2\uffff\1\33\1\34\4\uffff\1\44\1\45\1\37\1\51\2\uffff\1\46"+
        "\10\uffff\1\22\1\uffff\1\47\1\50\1\23\1\26\1\24\1\31\1\27\1\32\1"+
        "\30\2\uffff\1\40\1\42\5\uffff\1\12\3\uffff\1\41\1\43\5\uffff\1\4"+
        "\1\11\5\uffff\1\1\1\uffff\1\3\3\uffff\1\35\6\uffff\1\2\1\uffff\1"+
        "\15\3\uffff\1\14\1\16\1\36\10\uffff\1\17";
    static final String DFA29_specialS =
        "\160\uffff}>";
    static final String[] DFA29_transitionS = {
            "\2\37\2\uffff\1\37\22\uffff\1\37\1\26\1\34\2\uffff\1\23\2\uffff"+
            "\1\7\1\10\1\22\1\17\1\27\1\20\1\uffff\1\21\12\33\2\uffff\1\25"+
            "\1\16\1\24\1\uffff\1\13\1\11\15\32\1\12\1\31\2\32\1\4\1\1\1"+
            "\32\1\2\1\3\3\32\1\35\3\uffff\1\36\1\uffff\1\14\3\32\1\15\10"+
            "\32\1\30\14\32\1\5\1\uffff\1\6",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\4\41"+
            "\1\40\25\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\4\41"+
            "\1\44\25\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\7\41"+
            "\1\45\22\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\4\41"+
            "\1\46\25\41",
            "",
            "",
            "",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\15\41"+
            "\1\47\14\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\21\41"+
            "\1\50\10\41",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\23\41"+
            "\1\51\6\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\27\41"+
            "\1\52\2\41",
            "",
            "",
            "\12\54",
            "\1\55\4\uffff\1\56",
            "\1\60",
            "",
            "\1\62",
            "\1\64",
            "",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\24\41"+
            "\1\66\5\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\1\67"+
            "\31\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\71\1\uffff\12\33",
            "",
            "",
            "",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\22\41"+
            "\1\72\7\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\21\41"+
            "\1\73\10\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\4\41"+
            "\1\74\25\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\23\41"+
            "\1\75\6\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\3\41"+
            "\1\76\26\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\13\41\1\100\1\101\15\41\4\uffff"+
            "\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\1\102"+
            "\31\41",
            "",
            "\1\104\1\uffff\12\54",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\13\41"+
            "\1\105\16\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\2\41"+
            "\1\106\27\41",
            "",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\23\41"+
            "\1\107\6\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\10\41"+
            "\1\110\21\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\15\41"+
            "\1\111\14\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\4\41"+
            "\1\114\25\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\16\41"+
            "\1\115\13\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\2\41"+
            "\1\116\27\41",
            "",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\13\41"+
            "\1\117\16\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\12\41"+
            "\1\120\17\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\5\41"+
            "\1\122\24\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\1\124"+
            "\31\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\22\41"+
            "\1\125\7\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\23\41"+
            "\1\126\6\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\1\130"+
            "\31\41",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\30\41"+
            "\1\131\1\41",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\22\41"+
            "\1\132\7\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\23\41"+
            "\1\133\6\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\13\41"+
            "\1\134\16\41",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\6\41"+
            "\1\135\23\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\23\41"+
            "\1\137\6\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\30\41"+
            "\1\141\1\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\4\41"+
            "\1\142\25\41",
            "",
            "\1\42\1\uffff\12\41\7\uffff\1\143\31\41\4\uffff\1\43\1\uffff"+
            "\32\41",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\15\41"+
            "\1\147\14\41",
            "",
            "",
            "",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\3\41"+
            "\1\150\26\41",
            "\1\42\1\uffff\12\41\7\uffff\1\151\31\41\4\uffff\1\43\1\uffff"+
            "\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\23\41"+
            "\1\152\6\41",
            "\1\42\1\uffff\12\41\7\uffff\14\41\1\153\15\41\4\uffff\1\43"+
            "\1\uffff\32\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\16\41"+
            "\1\154\13\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\22\41"+
            "\1\155\7\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\23\41"+
            "\1\156\6\41",
            "\1\42\1\uffff\12\41\7\uffff\32\41\4\uffff\1\43\1\uffff\32\41",
            ""
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | ID | INT | MINUS_INT | FLOAT | MINUS_FLOAT | STRING | DATE_TIME | PACKAGE_ID | COMMENT | LINE_COMMENT | WS );";
        }
    }
 

}