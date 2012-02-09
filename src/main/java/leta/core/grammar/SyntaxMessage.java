package leta.core.grammar;

public class SyntaxMessage {

    private int line;
    private int charPositionInLine;
    private String token;
    private String message;

    public SyntaxMessage(int line, int charPositionInLine, String token, String message) {
	super();
	this.line = line;
	this.charPositionInLine = charPositionInLine;
	this.token = token;
	this.message = message;
    }

    public int getLine() {
	return line;
    }

    public int getCharPositionInLine() {
	return charPositionInLine;
    }

    public String getToken() {
        return token;
    }

    public String getMessage() {
	return message;
    }

    public String toString() {
	return "[" + this.line + ", " + this.charPositionInLine + ", " + this.token + "] " + this.message;
    }
}
