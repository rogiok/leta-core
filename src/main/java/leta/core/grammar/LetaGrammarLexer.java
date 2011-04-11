// $ANTLR 3.3 Nov 30, 2010 12:46:29 C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g 2011-04-11 13:50:42

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

    public LetaGrammarLexer() {;} 
    public LetaGrammarLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LetaGrammarLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g"; }

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:13:7: ( 'Test' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:13:9: 'Test'
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:14:7: ( 'Verify' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:14:9: 'Verify'
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:15:7: ( 'When' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:15:9: 'When'
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:16:7: ( 'Set' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:16:9: 'Set'
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:17:7: ( '{' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:17:9: '{'
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:18:7: ( '}' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:18:9: '}'
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:19:7: ( '(' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:19:9: '('
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:20:7: ( ')' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:20:9: ')'
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:21:7: ( 'And' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:21:9: 'And'
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:22:7: ( 'Or' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:22:9: 'Or'
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:23:7: ( ',' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:23:9: ','
            {
            match(','); 

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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:24:7: ( '@' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:24:9: '@'
            {
            match('@'); 

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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:25:7: ( 'each' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:25:9: 'each'
            {
            match("each"); 


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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:26:7: ( 'some' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:26:9: 'some'
            {
            match("some"); 


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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:27:7: ( 'atLeastOne' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:27:9: 'atLeastOne'
            {
            match("atLeastOne"); 


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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:28:7: ( 'atLeast' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:28:9: 'atLeast'
            {
            match("atLeast"); 


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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:29:7: ( 'atMostOne' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:29:9: 'atMostOne'
            {
            match("atMostOne"); 


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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:30:7: ( 'atMost' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:30:9: 'atMost'
            {
            match("atMost"); 


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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:31:7: ( 'exactlyOne' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:31:9: 'exactlyOne'
            {
            match("exactlyOne"); 


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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:32:7: ( 'exactly' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:32:9: 'exactly'
            {
            match("exactly"); 


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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:33:7: ( 'moreThanOne' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:33:9: 'moreThanOne'
            {
            match("moreThanOne"); 


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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:34:7: ( 'atLeastAndAtMost' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:34:9: 'atLeastAndAtMost'
            {
            match("atLeastAndAtMost"); 


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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:35:7: ( '=' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:35:9: '='
            {
            match('='); 

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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:36:7: ( '+' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:36:9: '+'
            {
            match('+'); 

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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:37:7: ( '-' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:37:9: '-'
            {
            match('-'); 

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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:38:7: ( '/' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:38:9: '/'
            {
            match('/'); 

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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:39:7: ( '*' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:39:9: '*'
            {
            match('*'); 

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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:40:7: ( '%' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:40:9: '%'
            {
            match('%'); 

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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:41:7: ( '**' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:41:9: '**'
            {
            match("**"); 


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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:42:7: ( '>' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:42:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:43:7: ( '<' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:43:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:44:7: ( '>=' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:44:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:45:7: ( '<=' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:45:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:46:7: ( '!=' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:46:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:47:7: ( 'null' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:47:9: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:48:7: ( 'Package' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:48:9: 'Package'
            {
            match("Package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:257:3: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:257:5: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:257:33: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:262:3: ( '0' .. '9' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:262:5: '0' .. '9'
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:266:3: ( ( DIGIT )+ )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:266:5: ( DIGIT )+
            {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:266:5: ( DIGIT )+
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
            	    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:266:5: DIGIT
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:270:3: ( '-' ( DIGIT )+ )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:270:5: '-' ( DIGIT )+
            {
            match('-'); 
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:270:9: ( DIGIT )+
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
            	    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:270:9: DIGIT
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:274:3: ( ( DIGIT )+ '\\.' ( DIGIT )* )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:274:5: ( DIGIT )+ '\\.' ( DIGIT )*
            {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:274:5: ( DIGIT )+
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
            	    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:274:5: DIGIT
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:274:17: ( DIGIT )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:274:17: DIGIT
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:278:3: ( '-' ( DIGIT )+ '\\.' ( DIGIT )* )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:278:5: '-' ( DIGIT )+ '\\.' ( DIGIT )*
            {
            match('-'); 
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:278:9: ( DIGIT )+
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
            	    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:278:9: DIGIT
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:278:21: ( DIGIT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:278:21: DIGIT
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:282:3: ( '\"' (~ ( '\"' | '\\\\' ) )* '\"' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:282:5: '\"' (~ ( '\"' | '\\\\' ) )* '\"'
            {
            match('\"'); 
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:282:9: (~ ( '\"' | '\\\\' ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:282:10: ~ ( '\"' | '\\\\' )
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

    // $ANTLR start "PACKAGE_ID"
    public final void mPACKAGE_ID() throws RecognitionException {
        try {
            int _type = PACKAGE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:286:3: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '0' .. '9' )* ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:286:5: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '0' .. '9' )* ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:286:27: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '.' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||(LA9_0>='a' && LA9_0<='z')) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='.'||(LA9_1>='0' && LA9_1<='9')||(LA9_1>='A' && LA9_1<='Z')||LA9_1=='_'||(LA9_1>='a' && LA9_1<='z')) ) {
                        alt9=1;
                    }


                }
                else if ( (LA9_0=='.'||LA9_0=='_') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:
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
            	    break loop9;
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:290:3: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:290:5: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:290:10: ( options {greedy=false; } : . )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='*') ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1=='/') ) {
                        alt10=2;
                    }
                    else if ( ((LA10_1>='\u0000' && LA10_1<='.')||(LA10_1>='0' && LA10_1<='\uFFFF')) ) {
                        alt10=1;
                    }


                }
                else if ( ((LA10_0>='\u0000' && LA10_0<=')')||(LA10_0>='+' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:290:37: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:294:3: ( '//' (~ '\\n' )* '\\n' )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:294:5: '//' (~ '\\n' )* '\\n'
            {
            match("//"); 

            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:294:10: (~ '\\n' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='\t')||(LA11_0>='\u000B' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:294:11: ~ '\\n'
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
            	    break loop11;
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
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:298:3: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:298:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
            {
            // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:298:5: ( ' ' | '\\t' | '\\n' | '\\r' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:
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
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
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
        // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:8: ( T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | ID | INT | MINUS_INT | FLOAT | MINUS_FLOAT | STRING | PACKAGE_ID | COMMENT | LINE_COMMENT | WS )
        int alt13=46;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:10: T__47
                {
                mT__47(); 

                }
                break;
            case 2 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:16: T__48
                {
                mT__48(); 

                }
                break;
            case 3 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:22: T__49
                {
                mT__49(); 

                }
                break;
            case 4 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:28: T__50
                {
                mT__50(); 

                }
                break;
            case 5 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:34: T__51
                {
                mT__51(); 

                }
                break;
            case 6 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:40: T__52
                {
                mT__52(); 

                }
                break;
            case 7 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:46: T__53
                {
                mT__53(); 

                }
                break;
            case 8 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:52: T__54
                {
                mT__54(); 

                }
                break;
            case 9 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:58: T__55
                {
                mT__55(); 

                }
                break;
            case 10 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:64: T__56
                {
                mT__56(); 

                }
                break;
            case 11 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:70: T__57
                {
                mT__57(); 

                }
                break;
            case 12 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:76: T__58
                {
                mT__58(); 

                }
                break;
            case 13 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:82: T__59
                {
                mT__59(); 

                }
                break;
            case 14 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:88: T__60
                {
                mT__60(); 

                }
                break;
            case 15 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:94: T__61
                {
                mT__61(); 

                }
                break;
            case 16 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:100: T__62
                {
                mT__62(); 

                }
                break;
            case 17 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:106: T__63
                {
                mT__63(); 

                }
                break;
            case 18 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:112: T__64
                {
                mT__64(); 

                }
                break;
            case 19 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:118: T__65
                {
                mT__65(); 

                }
                break;
            case 20 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:124: T__66
                {
                mT__66(); 

                }
                break;
            case 21 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:130: T__67
                {
                mT__67(); 

                }
                break;
            case 22 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:136: T__68
                {
                mT__68(); 

                }
                break;
            case 23 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:142: T__69
                {
                mT__69(); 

                }
                break;
            case 24 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:148: T__70
                {
                mT__70(); 

                }
                break;
            case 25 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:154: T__71
                {
                mT__71(); 

                }
                break;
            case 26 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:160: T__72
                {
                mT__72(); 

                }
                break;
            case 27 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:166: T__73
                {
                mT__73(); 

                }
                break;
            case 28 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:172: T__74
                {
                mT__74(); 

                }
                break;
            case 29 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:178: T__75
                {
                mT__75(); 

                }
                break;
            case 30 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:184: T__76
                {
                mT__76(); 

                }
                break;
            case 31 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:190: T__77
                {
                mT__77(); 

                }
                break;
            case 32 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:196: T__78
                {
                mT__78(); 

                }
                break;
            case 33 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:202: T__79
                {
                mT__79(); 

                }
                break;
            case 34 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:208: T__80
                {
                mT__80(); 

                }
                break;
            case 35 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:214: T__81
                {
                mT__81(); 

                }
                break;
            case 36 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:220: T__82
                {
                mT__82(); 

                }
                break;
            case 37 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:226: ID
                {
                mID(); 

                }
                break;
            case 38 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:229: INT
                {
                mINT(); 

                }
                break;
            case 39 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:233: MINUS_INT
                {
                mMINUS_INT(); 

                }
                break;
            case 40 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:243: FLOAT
                {
                mFLOAT(); 

                }
                break;
            case 41 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:249: MINUS_FLOAT
                {
                mMINUS_FLOAT(); 

                }
                break;
            case 42 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:261: STRING
                {
                mSTRING(); 

                }
                break;
            case 43 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:268: PACKAGE_ID
                {
                mPACKAGE_ID(); 

                }
                break;
            case 44 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:279: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 45 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:287: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 46 :
                // C:\\Projects\\LetaCore\\src\\main\\java\\leta\\core\\grammar\\LetaGrammar.g:1:300: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\4\37\4\uffff\2\37\2\uffff\4\37\2\uffff\1\57\1\63\1\65"+
        "\1\uffff\1\67\1\71\1\uffff\3\37\1\74\3\uffff\2\37\1\uffff\5\37\1"+
        "\103\5\37\1\uffff\1\112\11\uffff\2\37\2\uffff\3\37\1\121\1\122\1"+
        "\uffff\6\37\2\uffff\2\37\1\133\1\37\1\135\2\uffff\1\136\1\37\1\140"+
        "\3\37\1\144\1\37\1\uffff\1\37\2\uffff\1\37\1\uffff\3\37\1\uffff"+
        "\1\37\1\154\2\37\1\160\2\37\1\uffff\1\164\1\167\1\37\1\uffff\1\37"+
        "\1\172\1\37\1\uffff\2\37\1\uffff\2\37\1\uffff\3\37\1\u0083\1\37"+
        "\1\u0085\1\u0086\1\37\1\uffff\1\37\2\uffff\1\37\1\u008a\1\37\1\uffff"+
        "\3\37\1\u008f\1\uffff";
    static final String DFA13_eofS =
        "\u0090\uffff";
    static final String DFA13_minS =
        "\1\11\4\56\4\uffff\2\56\2\uffff\4\56\2\uffff\1\60\2\52\1\uffff"+
        "\2\75\1\uffff\4\56\3\uffff\2\56\1\uffff\13\56\1\uffff\1\56\11\uffff"+
        "\2\56\2\uffff\5\56\1\uffff\6\56\2\uffff\5\56\2\uffff\10\56\1\uffff"+
        "\1\56\2\uffff\1\56\1\uffff\3\56\1\uffff\7\56\1\uffff\3\56\1\uffff"+
        "\3\56\1\uffff\2\56\1\uffff\2\56\1\uffff\10\56\1\uffff\1\56\2\uffff"+
        "\3\56\1\uffff\4\56\1\uffff";
    static final String DFA13_maxS =
        "\1\175\4\172\4\uffff\2\172\2\uffff\4\172\2\uffff\1\71\1\57\1\52"+
        "\1\uffff\2\75\1\uffff\3\172\1\71\3\uffff\2\172\1\uffff\13\172\1"+
        "\uffff\1\71\11\uffff\2\172\2\uffff\5\172\1\uffff\6\172\2\uffff\5"+
        "\172\2\uffff\10\172\1\uffff\1\172\2\uffff\1\172\1\uffff\3\172\1"+
        "\uffff\7\172\1\uffff\3\172\1\uffff\3\172\1\uffff\2\172\1\uffff\2"+
        "\172\1\uffff\10\172\1\uffff\1\172\2\uffff\3\172\1\uffff\4\172\1"+
        "\uffff";
    static final String DFA13_acceptS =
        "\5\uffff\1\5\1\6\1\7\1\10\2\uffff\1\13\1\14\4\uffff\1\27\1\30\3"+
        "\uffff\1\34\2\uffff\1\42\4\uffff\1\52\1\45\1\56\2\uffff\1\53\13"+
        "\uffff\1\31\1\uffff\1\54\1\55\1\32\1\35\1\33\1\40\1\36\1\41\1\37"+
        "\2\uffff\1\46\1\50\5\uffff\1\12\6\uffff\1\47\1\51\5\uffff\1\4\1"+
        "\11\10\uffff\1\1\1\uffff\1\3\1\15\1\uffff\1\16\3\uffff\1\43\7\uffff"+
        "\1\2\3\uffff\1\22\3\uffff\1\24\2\uffff\1\20\2\uffff\1\44\10\uffff"+
        "\1\21\1\uffff\1\23\1\17\3\uffff\1\25\4\uffff\1\26";
    static final String DFA13_specialS =
        "\u0090\uffff}>";
    static final String[] DFA13_transitionS = {
            "\2\40\2\uffff\1\40\22\uffff\1\40\1\31\1\36\2\uffff\1\26\2\uffff"+
            "\1\7\1\10\1\25\1\22\1\13\1\23\1\uffff\1\24\12\35\2\uffff\1\30"+
            "\1\21\1\27\1\uffff\1\14\1\11\15\34\1\12\1\33\2\34\1\4\1\1\1"+
            "\34\1\2\1\3\3\34\4\uffff\1\37\1\uffff\1\17\3\34\1\15\7\34\1"+
            "\20\1\32\4\34\1\16\7\34\1\5\1\uffff\1\6",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\4\42"+
            "\1\41\25\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\4\42"+
            "\1\45\25\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\7\42"+
            "\1\46\22\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\4\42"+
            "\1\47\25\42",
            "",
            "",
            "",
            "",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\15"+
            "\42\1\50\14\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\21"+
            "\42\1\51\10\42",
            "",
            "",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\1\52"+
            "\26\42\1\53\2\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\16"+
            "\42\1\54\13\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\23"+
            "\42\1\55\6\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\16"+
            "\42\1\56\13\42",
            "",
            "",
            "\12\60",
            "\1\61\4\uffff\1\62",
            "\1\64",
            "",
            "\1\66",
            "\1\70",
            "",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\24"+
            "\42\1\72\5\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\1\73"+
            "\31\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\32"+
            "\42",
            "\1\75\1\uffff\12\35",
            "",
            "",
            "",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\22"+
            "\42\1\76\7\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\32"+
            "\42",
            "",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\32"+
            "\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\21"+
            "\42\1\77\10\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\4\42"+
            "\1\100\25\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\23"+
            "\42\1\101\6\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\3\42"+
            "\1\102\26\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\32"+
            "\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\2\42"+
            "\1\104\27\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\1\105"+
            "\31\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\14"+
            "\42\1\106\15\42",
            "\1\43\1\uffff\12\42\7\uffff\13\42\1\107\1\110\15\42\4\uffff"+
            "\1\44\1\uffff\32\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\21"+
            "\42\1\111\10\42",
            "",
            "\1\113\1\uffff\12\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\13"+
            "\42\1\114\16\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\2\42"+
            "\1\115\27\42",
            "",
            "",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\23"+
            "\42\1\116\6\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\10"+
            "\42\1\117\21\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\15"+
            "\42\1\120\14\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\32"+
            "\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\32"+
            "\42",
            "",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\7\42"+
            "\1\123\22\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\2\42"+
            "\1\124\27\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\4\42"+
            "\1\125\25\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\4\42"+
            "\1\126\25\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\16"+
            "\42\1\127\13\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\4\42"+
            "\1\130\25\42",
            "",
            "",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\13"+
            "\42\1\131\16\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\12"+
            "\42\1\132\17\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\32"+
            "\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\5\42"+
            "\1\134\24\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\32"+
            "\42",
            "",
            "",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\32"+
            "\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\23"+
            "\42\1\137\6\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\32"+
            "\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\1\141"+
            "\31\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\22"+
            "\42\1\142\7\42",
            "\1\43\1\uffff\12\42\7\uffff\23\42\1\143\6\42\4\uffff\1\44"+
            "\1\uffff\32\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\32"+
            "\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\1\145"+
            "\31\42",
            "",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\30"+
            "\42\1\146\1\42",
            "",
            "",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\13"+
            "\42\1\147\16\42",
            "",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\22"+
            "\42\1\150\7\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\23"+
            "\42\1\151\6\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\7\42"+
            "\1\152\22\42",
            "",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\6\42"+
            "\1\153\23\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\32"+
            "\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\30"+
            "\42\1\155\1\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\23"+
            "\42\1\156\6\42",
            "\1\43\1\uffff\12\42\7\uffff\16\42\1\157\13\42\4\uffff\1\44"+
            "\1\uffff\32\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\1\161"+
            "\31\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\4\42"+
            "\1\162\25\42",
            "",
            "\1\43\1\uffff\12\42\7\uffff\16\42\1\163\13\42\4\uffff\1\44"+
            "\1\uffff\32\42",
            "\1\43\1\uffff\12\42\7\uffff\1\166\15\42\1\165\13\42\4\uffff"+
            "\1\44\1\uffff\32\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\15"+
            "\42\1\170\14\42",
            "",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\15"+
            "\42\1\171\14\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\32"+
            "\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\15"+
            "\42\1\173\14\42",
            "",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\15"+
            "\42\1\174\14\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\15"+
            "\42\1\175\14\42",
            "",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\4\42"+
            "\1\176\25\42",
            "\1\43\1\uffff\12\42\7\uffff\16\42\1\177\13\42\4\uffff\1\44"+
            "\1\uffff\32\42",
            "",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\4\42"+
            "\1\u0080\25\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\4\42"+
            "\1\u0081\25\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\3\42"+
            "\1\u0082\26\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\32"+
            "\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\15"+
            "\42\1\u0084\14\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\32"+
            "\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\32"+
            "\42",
            "\1\43\1\uffff\12\42\7\uffff\1\u0087\31\42\4\uffff\1\44\1\uffff"+
            "\32\42",
            "",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\4\42"+
            "\1\u0088\25\42",
            "",
            "",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\23"+
            "\42\1\u0089\6\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\32"+
            "\42",
            "\1\43\1\uffff\12\42\7\uffff\14\42\1\u008b\15\42\4\uffff\1"+
            "\44\1\uffff\32\42",
            "",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\16"+
            "\42\1\u008c\13\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\22"+
            "\42\1\u008d\7\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\23"+
            "\42\1\u008e\6\42",
            "\1\43\1\uffff\12\42\7\uffff\32\42\4\uffff\1\44\1\uffff\32"+
            "\42",
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
            return "1:1: Tokens : ( T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | ID | INT | MINUS_INT | FLOAT | MINUS_FLOAT | STRING | PACKAGE_ID | COMMENT | LINE_COMMENT | WS );";
        }
    }
 

}