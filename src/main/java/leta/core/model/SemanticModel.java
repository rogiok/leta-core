package leta.core.model;

import java.util.ArrayList;
import java.util.List;

public class SemanticModel {

    private String packageName;
    
    private List<TestCase> testCases;
    private TestCase currentTestCase;
    
    private List<ClassElement> classElements;
    private List<JunctionElement> junctionElements;
    

    public SemanticModel() {
	this.testCases = new ArrayList<TestCase>();
	this.classElements = new ArrayList<ClassElement>();
	this.junctionElements = new ArrayList<JunctionElement>();
    }
    
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public void addTestCase(TestCase testCase) {
	this.testCases.add(testCase);
	
	this.currentTestCase = testCase;
    }
    
    public boolean hasTestCase(String id) {
	
	for (TestCase tc : this.testCases) {
	    if (tc.getId() != null && tc.getId().equals(id)) {
		return true;
	    }
	}
	
	return false;
    }
    
    public void removeTestCase(TestCase testCase) {
	this.testCases.remove(testCase);
    }
    
    public List<TestCase> getTestCases() {
	return this.testCases;
    }

    public TestCase getCurrentTestCase() {
        return currentTestCase;
    }

    public void addSequenceCode(SequenceCode sequenceCode) {
	
	if (sequenceCode instanceof JunctionElement) {
	    int seq = this.getSequenceOfJunctionElement(((JunctionElement) sequenceCode).getName());
		      
	    sequenceCode.setSequence(seq);
		      
	    this.junctionElements.add((JunctionElement) sequenceCode);
	} else if (sequenceCode instanceof ClassElement) {
	    int seq = this.getSequenceOfClassElement(((ClassElement) sequenceCode).getName());
		      
	    sequenceCode.setSequence(seq);
		      
	    this.classElements.add((ClassElement) sequenceCode);
	}
	
    }

    private int getSequenceOfClassElement(String id) {

	int result = 0;
	
	for (ClassElement c : this.classElements) {
	    if (c.getName().equals(id)) {
		result = c.getSequence() + 1;
	    }
	}
	
	return result;
    }

    private int getSequenceOfJunctionElement(String id) {

	int result = 0;
	
	for (JunctionElement c : this.junctionElements) {
	    if (c.getName().equals(id)) {
		result = c.getSequence() + 1;
	    }
	}
	
	return result;
    }
    
    public void resetSequence() {
	this.classElements.clear();
	this.junctionElements.clear();
    }
    
    public ClassElement findClassElement(ClassElement classNode) {
	
	for (ClassElement cl : this.classElements) {
	    if (cl.getName().equals(classNode.getName())) {
		return cl;
	    }
	}
	
	this.classElements.add(classNode);
	
	return classNode;
    }

}
