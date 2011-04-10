package leta.core.runner;

public class SyntaxException extends Exception {

    private static final long serialVersionUID = 1L;

    public SyntaxException() {
	super();
    }

    public SyntaxException(String arg0, Throwable arg1) {
	super(arg0, arg1);
    }

    public SyntaxException(String arg0) {
	super(arg0);
    }

    public SyntaxException(Throwable arg0) {
	super(arg0);
    }

}
