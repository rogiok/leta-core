package leta.core.grammar;

import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;

public class ErrorMessage {

    public static String getErrorMessage(RecognitionException e, String[] tokenNames, String message) {
	
	String type = tokenNames != null && e.c > 0 ? tokenNames[e.c] : "";
	
	if (e instanceof NoViableAltException) {
	    if (type.equals("STRING")) {
		return "String inválido, verifique se há um termo";
	    }
	}
	
	return message;
    }
    
}
