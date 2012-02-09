package leta.core.grammar;

import java.util.ArrayList;
import java.util.List;

public class SyntaxMessageManager {
    
    private static SyntaxMessageManager instance;

    static {
	instance = new SyntaxMessageManager();
    }
    
    public static SyntaxMessageManager getInstance() {
	return instance;
    }
    
    private List<SyntaxMessage> errorMessages = new ArrayList<SyntaxMessage>();

    public boolean hasFoundErrors() {
	return !this.errorMessages.isEmpty();
    }

    public List<SyntaxMessage> getErrorMessages() {
	return this.errorMessages;
    }
    
    public void add(SyntaxMessage message) {
	this.errorMessages.add(message);
    }
    
    public void clear() {
	this.errorMessages.clear();
    }

}
