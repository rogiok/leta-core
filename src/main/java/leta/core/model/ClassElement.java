package leta.core.model;

import java.util.ArrayList;
import java.util.List;

public class ClassElement extends Element implements SequenceCode {

    private Integer sequence = 0;
    private Quantifier quantifier;
    private String relationalOperator;
    private Integer indexOfSet;

    // Literals
    private String stringValue;
    private Integer intValue;
    private Double floatValue;
    private Date dateValue;

    private List<MethodElement> methodElements;
    private MethodElement methodElement;
    private boolean usedInstance;

    public ClassElement() {
	this(null);
    }

    public ClassElement(String name) {
	super();
	
	this.setName(name);
	this.methodElements = new ArrayList<MethodElement>();
    }

    /**
     * Add a MethodElement in the list to generate this class and your methods.
     * 
     * @param methodElement
     */
    public void addMethodElement(MethodElement methodElement) {

	boolean found = false;
	
	for (MethodElement m : this.methodElements) {
	    if (m.getName().toLowerCase().equals(methodElement.getName().toLowerCase()) 
		    && m.getClassElement().getClassName().toLowerCase().equals(methodElement.getClassElement().getClassName().toLowerCase())) {
		found = true;
		    
		break;
	    }
	}

	if (!found) {
	    this.methodElements.add(methodElement);
	}
	
    }

    public List<MethodElement> getMethodElements() {
        return methodElements;
    }

    public Integer getSequence() {
        return sequence;
    }

    public String getSequenceConverted() {
	if (this.sequence == 0) {
	    return "";
	}
	
	return Integer.toString(this.sequence);
    }
    
    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public MethodElement getMethodElement() {
        return methodElement;
    }

    public void setMethodElement(MethodElement methodElement) {
        this.methodElement = methodElement;
    }

    public boolean isUsedInstance() {
	try {
	    return usedInstance;
	} finally {
	    usedInstance = true;
	}
    }

    public void setUsedInstance(boolean usedInstance) {
        this.usedInstance = usedInstance;
    }

    public Quantifier getQuantifier() {
        return quantifier;
    }

    public void setQuantifier(Quantifier quantifier) {
        this.quantifier = quantifier;
    }

    public String getRelationalOperator() {
        return relationalOperator;
    }

    public void setRelationalOperator(String relationalOperator) {
        this.relationalOperator = relationalOperator;
    }

    public Integer getIndexOfSet() {
        return indexOfSet;
    }

    public void setIndexOfSet(Integer indexOfSet) {
        this.indexOfSet = indexOfSet;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public Integer getIntValue() {
        return intValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    public Double getFloatValue() {
        return floatValue;
    }

    public void setFloatValue(Double floatValue) {
        this.floatValue = floatValue;
    }
    
    public Date getDateValue() {
        return dateValue;
    }

    public void setDateValue(String dateValue) {
        this.dateValue = new Date(dateValue);
    }

    public boolean isAnyValue() {
	if (this.stringValue != null || this.floatValue != null || this.intValue != null || this.dateValue != null) {
	    return true;
	}
	
	return false;
    }
    
    public String getClassName() {
//	return this.getName();
	return this.getName().substring(0, 1).toUpperCase() + this.getName().substring(1);
    }

    public String getInstanceName() {
	return this.getName().substring(0, 1).toLowerCase() + this.getName().substring(1) + (this.sequence > 0 ? this.sequence : "");
    }

    public String getInstanceClassName() {
	return this.getName().substring(0, 1).toUpperCase() + this.getName().substring(1) + (this.sequence > 0 ? this.sequence : "");
    }

    public String toString() {
	return "C{" + (quantifier != null ? quantifier.getType() + " " + quantifier.getValue() + " " : "") + this.getName() + (this.methodElement != null ? " " +this.methodElement.toString() : "") + "}";
    }

    public String getStructure() {
	return "" + this.getName() + (this.methodElement != null ? " " +this.methodElement.getStructure() : "") + "";
    }
}
