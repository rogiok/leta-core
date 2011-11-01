package leta.core.model;

import java.util.ArrayList;
import java.util.List;

public class SemanticModel {

    private String packageName;
    private List<TestCase> testCases;
    private TestCase currentTestCase;

    public SemanticModel() {
	this.testCases = new ArrayList<TestCase>();
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
    
}
