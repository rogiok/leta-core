package leta.core;

import org.junit.Test;

public class GenerateCodePhaseTest {

    @Test
    public void test() throws Exception {
	
	String inputFile = ClassLoader.getSystemResource("leta/core/sample/semantic-phase-test.leta").toURI().getPath();
	
	Generator gen = new Generator();
	
	byte[] content = gen.readFile(inputFile);
	
	String result = gen.generateCode(gen.semanticPhase(gen.syntacticPhase(content)));
	
	System.out.println(result);
	
    }
}
