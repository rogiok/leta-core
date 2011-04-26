package leta.core;

import org.junit.Test;

public class GeneratorTest {
    
    @Test
    public void testGenerator() throws Exception {
	
	String inputFile = ClassLoader.getSystemResource("leta/core/sample/HistoriaQuatro.leta").toURI().getPath();
	
	new Generator(inputFile, "./src/test/java").generate();
	
    }
}

