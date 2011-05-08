package leta.core;

import org.junit.Test;

public class GeneratorTest {
    
    @Test
    public void testGenerator() throws Exception {
	
	String inputFile = ClassLoader.getSystemResource("leta/core/sample/semantic-phase-test.leta").toURI().getPath();
	
	new Generator(true, inputFile, "./src/test/java").generate();
	
    }
}

