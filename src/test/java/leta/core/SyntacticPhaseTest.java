package leta.core;

import static org.junit.Assert.*;

import java.util.List;

import leta.core.grammar.SyntaxMessage;

import org.junit.Test;

public class SyntacticPhaseTest {
    
    @Test
    public void testErrorMessage() throws Exception {

	Generator gen = new Generator();
	
	List<SyntaxMessage> errorMessages = gen.checkSyntax("123 avc\n234'".getBytes());

	assertTrue(errorMessages.size() == 2);
    }

//    @Test
    public void test() throws Exception {
	
	String inputFile = ClassLoader.getSystemResource("leta/core/sample/syntax-phase-test.leta").toURI().getPath();
	
	Generator gen = new Generator();
	
	byte[] content = gen.readFile(inputFile);
	
	gen.syntacticPhase(content);
	
    }
}
