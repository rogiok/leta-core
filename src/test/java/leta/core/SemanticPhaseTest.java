package leta.core;

import org.junit.Test;

public class SemanticPhaseTest {

    @Test
    public void test() throws Exception {
	
	String inputFile = ClassLoader.getSystemResource("leta/core/sample/semantic-phase-test.leta").toURI().getPath();
	
	Generator gen = new Generator();
	
	char[] content = gen.readFile(inputFile, null).toString().toCharArray();
	
	gen.semanticPhase(gen.syntacticPhase(content));
	
    }
}
