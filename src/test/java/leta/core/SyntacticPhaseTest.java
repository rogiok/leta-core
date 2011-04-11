package leta.core;

import org.junit.Test;

public class SyntacticPhaseTest {

    @Test
    public void test() throws Exception {
	
	String inputFile = ClassLoader.getSystemResource("leta/core/sample/syntax.leta").toURI().getPath();
	
	Generator gen = new Generator();
	
	byte[] content = gen.readFile(inputFile);
	
	gen.syntacticPhase(content);
	
    }
}
