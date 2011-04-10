package leta.core.model;

import java.util.ArrayList;
import java.util.List;

public class ClassElement extends Element implements SequenceCode, ClassCode {

    private Integer sequence;
    private Quantifier quantifier;
    private String relationalOperator;
    private Integer indexOfSet;

    // Literals
    private String stringValue;
    private Integer intValue;
    private Double floatValue;

    private List<MethodElement> methodElements;
    private MethodElement methodElement;
    private ClassElement next;
    private boolean usedInstance;
    
    public ClassElement(String name) {
	super();
	
	this.setName(name);
//	this.setLeaf(true);
	this.methodElements = new ArrayList<MethodElement>();
    }

    public ClassElement() {
	this(null);
    }

    /**
     * M�todo que retorna uma lista de MethodElements, pois uma classe pode ter mais de um m�todo.
     * 
     * @return
     */
    public List<MethodElement> getMethodElements() {
        return methodElements;
    }

    public void setMethodElement(List<MethodElement> methodElements) {
        this.methodElements = methodElements;
    }
    
    /**
     * Adiciona um MethodElement na lista para a gera��o da classe com todos os seus m�todos.
     * 
     * @param methodElement
     */
    public void addMethodElement(MethodElement methodElement) {

	boolean found = false;
	
	for (MethodElement m : this.methodElements) {
	    if (m.getName().equals(methodElement.getName()) && m.getClassElement() == methodElement.getClassElement()) {
		found = true;
		    
		break;
	    }
	}

	if (!found) {
	    this.methodElements.add(methodElement);
	}
	
    }

    public void addMethodElements(MethodElement methodElement, List<ClassElement> classElements) {
	for (ClassElement cl : classElements) {
	    this.methodElements.add(new MethodElement(methodElement.getName(), cl));
	}
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
    
    public boolean isAnyValue() {
	if (this.stringValue != null || this.floatValue != null || this.intValue != null) {
	    return true;
	}
	
	return false;
    }
    
    public ClassElement getNext() {
        return this.next;
    }

    public void setNext(ClassElement next) {
        this.next = next;
    }
    
    public List<ClassElement> getAllNext() {
	List<ClassElement> result = new ArrayList<ClassElement>();

	this.addNext(this, result);
	
	return result;
    }
    
    public boolean getHasNext() {
	if (this.next != null) {
	    return true;
	}
	
	return false;
    }
    
    private void addNext(ClassElement classNode, List<ClassElement> classNodeList) {
	classNodeList.add(classNode);
	
	if (classNode.getNext() != null) {
	    this.addNext(classNode.getNext(), classNodeList);
	}
    }

    public String getClassName() {
	return this.getName().substring(0, 1).toUpperCase() + this.getName().substring(1);
    }

    public String getInstanceName() {
	return this.getName().substring(0, 1).toLowerCase() + this.getName().substring(1) + (this.sequence > 0 ? this.sequence : "");
    }

    public String getInstanceClassName() {
	return this.getName().substring(0, 1).toUpperCase() + this.getName().substring(1) + (this.sequence > 0 ? this.sequence : "");
    }

    public String toString() {
	if (this.next == null)
	    return "C{" + (quantifier != null ? quantifier.getType() + " " + quantifier.getValue() + " " : "") + this.getName() + (this.methodElement != null ? " " +this.methodElement.toString() : "") + "}";
	else
	    return "C{" + (quantifier != null ? quantifier.getType() + " " + quantifier.getValue() + " " : "") + this.getName() + "}, " + this.next.toString();
    }

    public String getStructure() {
	if (this.next == null)
	    return "" + this.getName() + (this.methodElement != null ? " " +this.methodElement.getStructure() : "") + "";
	else
	    return "" + this.getName() + (this.methodElement != null ? " " +this.methodElement.getStructure() : "") + ", " + this.next.getStructure();
    }

}
