package leta.core.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SaveFiles {

    private String content;
    private String outputDir;

    public SaveFiles(String content, String outputDir) {
	super();
	this.content = content;
	this.outputDir = outputDir == null ? "." : outputDir;
    }
    
    public void execute() {
	
	Pattern p = Pattern.compile("<fo.*?>.*?</fo>", Pattern.DOTALL);
	Matcher m = p.matcher(this.content);
	
	while (m.find()) {
	    String group = m.group();
	    
	    int startPos = group.indexOf("name='");
	    
	    try {
		if (startPos > -1) {
		    int endPos = group.indexOf("'", startPos + 6);

		    if (endPos > -1) {
			String filename = group.substring(startPos + 6, endPos).replace('.', '/');

			if (!filename.isEmpty()) {
			    writeFile(group, filename + ".java");
			} else {
			    throw new Exception("Filename not defined.");
			}
		    } else {
			throw new Exception("Filename not defined.");
		    }
		} else {
		    throw new Exception("Filename not defined.");
		}
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	}
	
    }
    
    private void writeFile(String contentFile, String filename) throws IOException {

	File outputFile = new File(this.outputDir + File.separator + filename);
	
	outputFile.getParentFile().mkdirs();
	
	FileWriter fw = new FileWriter(outputFile);
	
	contentFile = contentFile.replaceFirst("<fo.*?>", "");
	contentFile = contentFile.replaceFirst("</fo>", "");
	
	fw.write(contentFile);
	
	fw.close();
    }
}
