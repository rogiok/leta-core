package leta.core;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.CharArrayReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import leta.core.grammar.LetaGrammarLexer;
import leta.core.grammar.LetaGrammarParser;
import leta.core.grammar.LetaTreeGrammar;
import leta.core.grammar.SyntaxMessage;
import leta.core.grammar.SyntaxMessageManager;
import leta.core.model.SaveFiles;
import leta.core.model.TestCase;
import leta.core.runner.SemanticException;
import leta.core.runner.SyntaxException;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

public class Generator {

    private boolean verbose;
    private String inputFile;
    private String outputDir;
    
    public Generator(boolean verbose, String inputFile, String outputDir) {
	super();
	this.verbose = verbose;
	this.inputFile = inputFile;
	this.outputDir = outputDir;
    }

    public Generator() {
	super();
    }

    public static void main(String[] args) {

	boolean verbose = false;
	String inputFile = "";
	String outputDir = "";
	
	for (int i = 0; i < args.length; i++) {
	    String arg = args[i];

	    if (arg.equals("-file")) {
		try {
		    if (ClassLoader.getSystemResource(args[i + 1]) != null)
			inputFile = ClassLoader.getSystemResource(args[i + 1]).toURI().getPath();
		    else
			inputFile = args[i + 1];
		} catch (URISyntaxException e) {
		    e.printStackTrace();
		    
		    return;
		}
	    } else if (arg.equals("-outputDir")) {
		outputDir = args[i+1];
	    } else if (arg.equals("-verbose")) {
		verbose = true;
	    }
	}

	if (args.length == 0 || inputFile.equals("")) {
	    System.out.println("Usage: -file <file name> [-outputDir <dir name> -verbose]");
	    System.out.println();
	} else {
	    new Generator(verbose, inputFile, outputDir).generate();
	}
	
    }
    
    public void generate() {
	
	try {
	    StringBuffer result = this.readFile(this.inputFile, null);
	    
	    if (result != null) {
	
		convert(result, "[ \n\r\t]test[ \n\r\t]", "test", 1, 1);
		convert(result, "[ \n\r\t]verify[ \n\r\t]", "verify", 1, 1);
		convert(result, "[ \n\r\t]when[ \n\r\t]", "when", 1, 1);
		convert(result, "[ \n\r\t]set[ \n\r\t]", "set", 1, 1);
		convert(result, "[ \n\r\t]and[ \n\r\t]", "and", 1, 1);
		convert(result, "[ \n\r\t]or[ \n\r\t]", "or", 1, 1);
		convert(result, "[ \n\r\t]atleast[ \n\r\t]", "atleast", 1, 1);
		convert(result, "[ \n\r\t]atmost[ \n\r\t]", "atmost", 1, 1);
		convert(result, "[ \n\r\t]exactly[ \n\r\t]", "exactly", 1, 1);
		convert(result, "[ \n\r\t]atleastandatmost[ \n\r\t]", "atleastandatmost", 1, 1);
		convert(result, "[ \n\r\t]package[ \n\r\t]", "package", 1, 1);
		
		String outputContent = this.generate(result.toString().toCharArray());
	    
		new SaveFiles(outputContent, this.outputDir).execute();
	    }
	    
	} catch (IOException e) {
	    e.printStackTrace();
	} catch (RecognitionException e) {
	    e.printStackTrace();
	} catch (SyntaxException e) {
	    
	    for (SyntaxMessage message : SyntaxMessageManager.getInstance().getErrorMessages())
		System.out.println(message.getLine() + ": " + message.getToken() + " - " + message.getMessage());
	    
	    e.printStackTrace();
	} catch (URISyntaxException e) {
	    e.printStackTrace();
	} catch (SemanticException e) {
	    e.printStackTrace();
	}
	
    }
    
    protected void convert(StringBuffer sb, String expression, String replace, int charBefore, int charAfter) {
	
	String s = sb.toString().toLowerCase();
	
	Pattern p = Pattern.compile(expression);
	
	Matcher m = p.matcher(s);
	
	while (m.find()) {
	    sb.replace(m.start() + charBefore, m.end() - charAfter, replace);
	}
	
    }
    
    protected StringBuffer readFile(String inputFile, String encoding) throws IOException {
	
	BufferedReader in = new BufferedReader(new FileReader(inputFile));
	
	char[] line = new char[1024];
	int length = 0;
	
	StringBuffer sb = new StringBuffer("");
	
	while ((length = in.read(line)) != -1) {
	    sb.append(line, 0, length);
	}
	
	return sb;
    }
    
    private String generate(char[] content) throws IOException, RecognitionException, SyntaxException, URISyntaxException, SemanticException {
	
//	ByteArrayInputStream letaStream = new ByteArrayInputStream(content);
	
	CharArrayReader reader = new CharArrayReader(content);
	ANTLRReaderStream source = new ANTLRReaderStream(reader);
	LetaGrammarLexer lexer = new LetaGrammarLexer(source);
	CommonTokenStream tokens = new CommonTokenStream(lexer);

	LetaGrammarParser parser = new LetaGrammarParser(tokens);
	
	CommonTree ast = (CommonTree) parser.leta().getTree();

	if (SyntaxMessageManager.getInstance().hasFoundErrors()) {
	    throw new SyntaxException();
	}
	
	if (verbose) {
	    System.out.println("AST:");
	    System.out.println(ast.toStringTree());
	    System.out.println();
	}
	
	CommonTreeNodeStream nodes = new CommonTreeNodeStream(ast);
	LetaTreeGrammar semanticParser = new LetaTreeGrammar(nodes);

	Reader templatesIn = null;
	
	if (ClassLoader.getSystemResource("leta/core/template/LetaTemplate.stg") != null)
	    templatesIn = new InputStreamReader(ClassLoader.getSystemClassLoader().getResourceAsStream("leta/core/template/LetaTemplate.stg"));
	
	StringTemplateGroup templates = new StringTemplateGroup(templatesIn);

	semanticParser.setTemplateLib(templates);
	
	StringTemplate t = (StringTemplate) semanticParser.leta().getTemplate();

	if (verbose) {
	    System.out.println("Semantic Model:");
	    for (TestCase tc : semanticParser.getSemanticModel().getTestCases()) {
		System.out.println(tc.getStructure());
		System.out.println();
	    }
	}
	
	if (semanticParser.hasFoundErrors()) {
	    throw new SemanticException();
	}

	String result = t.toString();

	return result;
    }
    
    protected CommonTree syntacticPhase(char[] content) throws RecognitionException, SyntaxException, IOException {

	CharArrayReader reader = new CharArrayReader(content);
	ANTLRReaderStream source = new ANTLRReaderStream(reader);
	LetaGrammarLexer lexer = new LetaGrammarLexer(source);
	CommonTokenStream tokens = new CommonTokenStream(lexer);

	LetaGrammarParser parser = new LetaGrammarParser(tokens);
	
	CommonTree ast = (CommonTree) parser.leta().getTree();

	if (verbose)
	    System.out.println(ast.toStringTree());

	if (SyntaxMessageManager.getInstance().hasFoundErrors()) {
	    throw new SyntaxException();
	}
	
	return ast;
    }

    protected LetaTreeGrammar.leta_return semanticPhase(CommonTree ast) throws IOException, RecognitionException, SyntaxException, URISyntaxException, SemanticException {

	CommonTreeNodeStream nodes = new CommonTreeNodeStream(ast);
	LetaTreeGrammar semanticParser = new LetaTreeGrammar(nodes);

	Reader templatesIn = new FileReader(ClassLoader.getSystemResource("leta/core/template/LetaTemplate.stg").toURI().getPath());
	StringTemplateGroup templates = new StringTemplateGroup(templatesIn);

	semanticParser.setTemplateLib(templates);

	LetaTreeGrammar.leta_return l = semanticParser.leta();

	if (verbose)
	    for (TestCase tc : semanticParser.getSemanticModel().getTestCases()) {
		System.out.println(tc.getStructure());
	    }

	if (semanticParser.hasFoundErrors()) {
	    throw new SemanticException();
	}
	
	return l;
    }
    
    protected String generateCode(LetaTreeGrammar.leta_return leta) throws RecognitionException {

	StringTemplate t = (StringTemplate) leta.getTemplate();

	String result = t.toString();

	return result;
    }
    
    public List<SyntaxMessage> checkSyntax(byte[] content) throws IOException, RecognitionException {

	SyntaxMessageManager.getInstance().clear();
	
	ByteArrayInputStream atddStream = new ByteArrayInputStream(content);

	ANTLRInputStream source = new ANTLRInputStream(atddStream);
	LetaGrammarLexer lexer = new LetaGrammarLexer(source);
	CommonTokenStream tokens = new CommonTokenStream(lexer);

	LetaGrammarParser parser = new LetaGrammarParser(tokens);

	CommonTree ast = (CommonTree) parser.leta().getTree();

	if (verbose)
	    System.out.println(ast.toStringTree());

	List<SyntaxMessage> errors = new ArrayList<SyntaxMessage>();

	if (SyntaxMessageManager.getInstance().hasFoundErrors()) {
	    errors.addAll(SyntaxMessageManager.getInstance().getErrorMessages());
	}

	return errors;
    }
    
}
