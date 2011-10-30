package leta.core.model;

import java.util.ArrayList;
import java.util.List;

public class SemanticModel {

    private String packageName;
    private List<TestCase> testCases;
    private TestCase currentTestCase;
    
//    @Deprecated
//    private List<ClassElement> classElements;
//    @Deprecated
//    private List<JunctionElement> junctionElements;
    

    public SemanticModel() {
	this.testCases = new ArrayList<TestCase>();
//	this.classElements = new ArrayList<ClassElement>();
//	this.junctionElements = new ArrayList<JunctionElement>();
    }
    
    /**
     * Add a TestCase.
     * 
     * @param testCase
     */
    public void addTestCase(TestCase testCase) {
	this.testCases.add(testCase);
	
	this.currentTestCase = testCase;
    }

    /**
     * Remove a TestCase.
     * 
     * @param testCase
     */
    public void removeTestCase(TestCase testCase) {
	this.testCases.remove(testCase);
    }

    /**
     * Find a TestCase by your id.
     * 
     * @param id
     * @return TestCase
     */
    public TestCase findTestCase(String id) {
	for (TestCase tc : this.testCases) {
	    if (tc.getId() != null && tc.getId().equals(id)) {
		return tc;
	    }
	}
	
	return null;
    }
    
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public List<TestCase> getTestCases() {
	return this.testCases;
    }

    public TestCase getCurrentTestCase() {
        return currentTestCase;
    }
    
    
    /*
    @Deprecated
    public void resetSequence() {
	this.classElements.clear();
	this.junctionElements.clear();
    }
    
    @Deprecated
    public boolean hasTestCase(String id) {
	
	for (TestCase tc : this.testCases) {
	    if (tc.getId() != null && tc.getId().equals(id)) {
		return true;
	    }
	}
	
	return false;
    }

    @Deprecated
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

    @Deprecated
    private int getSequenceOfClassElement(String id) {

	int result = 0;
	
	for (ClassElement c : this.classElements) {
	    if (c.getName().equals(id)) {
		result = c.getSequence() + 1;
	    }
	}
	
	return result;
    }

    @Deprecated
    private int getSequenceOfJunctionElement(String id) {

	int result = 0;
	
	for (JunctionElement c : this.junctionElements) {
	    if (c.getName().equals(id)) {
		result = c.getSequence() + 1;
	    }
	}
	
	return result;
    }

    @Deprecated
    public ClassElement findClassElement(ClassElement classNode) {
	
	for (ClassElement cl : this.classElements) {
	    if (cl.getName().equals(classNode.getName())) {
		return cl;
	    }
	}
	
	this.classElements.add(classNode);
	
	return classNode;
    }*/

}
