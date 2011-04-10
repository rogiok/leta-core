package leta.core;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import leta.core.grammar.LetaGrammarLexer;
import leta.core.grammar.LetaGrammarParser;
import leta.core.grammar.LetaTreeGrammar;
import leta.core.model.SaveFiles;
import leta.core.model.TestCase;
import leta.core.runner.SemanticException;
import leta.core.runner.SyntaxException;

public class Generator {

    private String inputFile;
    private String outputDir;
    
    public Generator(String inputFile, String outputDir) {
	super();
	this.inputFile = inputFile;
	this.outputDir = outputDir;
    }

    public static void main(String[] args) {

	String inputFile = "";
	String outputDir = "";

	for (int i = 0; i < args.length - 1; i++) {
	    String arg = args[i];
	    
	    if (arg.equals("-file")) {
//		inputFile = args[i+1];
		try {
		    inputFile = ClassLoader.getSystemResource(args[i+1]).toURI().getPath();
		} catch (URISyntaxException e) {
		    e.printStackTrace();
		    
		    return;
		}
	    } else if (arg.equals("-outputDir")) {
		outputDir = args[i+1];
	    }
	}

	new Generator(inputFile, outputDir).generate();
	
    }
    
    public void generate() {
	
	try {
	    byte[] result = this.readFile(this.inputFile);
	    
	    if (result != null) {
		String outputContent = this.generate(result);
	    
		new SaveFiles(outputContent, this.outputDir).execute();
	    }
	    
	} catch (IOException e) {
	    e.printStackTrace();
	} catch (RecognitionException e) {
	    e.printStackTrace();
	} catch (SyntaxException e) {
	    e.printStackTrace();
	} catch (URISyntaxException e) {
	    e.printStackTrace();
	} catch (SemanticException e) {
	    e.printStackTrace();
	}
	
    }
    
    private byte[] readFile(String inputFile) throws IOException {
	ByteArrayOutputStream baos = new ByteArrayOutputStream();
	
	byte[] line = new byte[1024];
	int length = 0;
	
	FileInputStream fis = new FileInputStream(inputFile);
	
	while ((length = fis.read(line)) != -1) {
	    baos.write(line, 0, length);
	}
	
	return baos.toByteArray();
    }
    
    private String generate(byte[] content) throws IOException, RecognitionException, SyntaxException, URISyntaxException, SemanticException {
	ByteArrayInputStream atddStream = new ByteArrayInputStream(content);

	ANTLRInputStream source = new ANTLRInputStream(atddStream);
	LetaGrammarLexer lexer = new LetaGrammarLexer(source);
	CommonTokenStream tokens = new CommonTokenStream(lexer);

	LetaGrammarParser parser = new LetaGrammarParser(tokens);
	
	CommonTree ast = (CommonTree) parser.leta().getTree();

	if (parser.hasFoundErrors()) {
	    throw new SyntaxException();
	}
	
	System.out.println(ast.toStringTree());
	
	CommonTreeNodeStream nodes = new CommonTreeNodeStream(ast);
	LetaTreeGrammar semanticParser = new LetaTreeGrammar(nodes);

	Reader templatesIn = new FileReader(ClassLoader.getSystemResource("atdd/transformer/LetaTemplate.stg").toURI().getPath());
	StringTemplateGroup templates = new StringTemplateGroup(templatesIn);

	semanticParser.setTemplateLib(templates);
	
	StringTemplate t = (StringTemplate) semanticParser.leta().getTemplate();


	for (TestCase tc : semanticParser.getSemanticModel().getTestCases()) {
	    System.out.println(tc.getStructure());
	}

	
	if (semanticParser.hasFoundErrors()) {
	    throw new SemanticException();
	}

	String result = t.toString();

	return result;
    }

}
