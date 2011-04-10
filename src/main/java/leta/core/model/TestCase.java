package leta.core.model;

import java.util.ArrayList;
import java.util.List;

public class TestCase {

    private String id;
    private Element verifyClause;
    private Element whenClause;
//    private Element currentNode;
    private List<Element> elements;
    private Matrix matrix;

    public TestCase(String id) {
	super();

	this.id = id;
	this.verifyClause = new Element();
	this.whenClause = new Element();
	
	this.elements = new ArrayList<Element>();
    }

    public TestCase() {
	this(null);
    }

    public void generateElements() {
	
	this.walk(this.verifyClause);
	this.walk(this.whenClause);
	
    }
    
    private void walk(Element element) {
	if (element instanceof CompositeElement) {
	    CompositeElement cn = (CompositeElement) element;
	    
	    Element n = this.findElement(element);
	    
	    if (element instanceof JunctionElement) {
		((CompositeElement) n).addConstructor(new JunctionElement(cn.getName(), cn.getLeft(), cn.getRight()));
	    } else if (element instanceof OperatorElement) {
		((CompositeElement) n).addConstructor(new OperatorElement(cn.getName(), cn.getLeft(), cn.getRight()));
	    }
	    
	    walk(cn.getLeft());
	    walk(cn.getRight());
	} else if (element instanceof ClassElement) {
	    ClassElement classElement = (ClassElement) element;
	    
	    ClassElement newClassElement = (ClassElement) this.findElement(element);

	    if (classElement.getStringValue() != null) {
		newClassElement.setStringValue("");
	    }
	    if (classElement.getFloatValue() != null) {
		newClassElement.setFloatValue(new Double(0));
	    }
	    if (classElement.getIntValue() != null) {
		newClassElement.setIntValue(new Integer(0));
	    }
	    
	    if (classElement.getRelationalOperator() != null) {
		newClassElement.setRelationalOperator("*");
	    }
	    
	    if (classElement.getMethodElement() != null) {
		// Adiciona os m�todos numa lista para a gera��o do c�digo no template
		// porque podem existir mais de um m�todo para a mesma classe.
		newClassElement.addMethodElement(classElement.getMethodElement());

		if (classElement.getMethodElement().getClassElement() != null) {

		    for (ClassElement next : classElement.getMethodElement().getClassElement().getAllNext()) {
			walk(next);    
		    }
		}
	    }
	}
    }
    
    public Element findElement(Element element) {
	
	for (Element n : this.elements) {
	    if (n.getName().equals(element.getName())) {
		return n;
	    }
	}
	
	Element newElement = null;
	
	if (element instanceof ClassElement) {
	    newElement = new ClassElement(element.getName());
	} else if (element instanceof JunctionElement) {
	    newElement = new JunctionElement(element.getName(), ((CompositeElement) element).getLeft(), ((CompositeElement) element).getRight());
	} else if (element instanceof OperatorElement) {
	    newElement = new OperatorElement(element.getName(), ((CompositeElement) element).getLeft(), ((CompositeElement) element).getRight());
	}
	
	this.elements.add(newElement);
	
	return newElement;
    }
    
    public List<Element> getElements() {
        return elements;
    }

    public String getId() {
	return id;
    }

    public void setId(String id) {
	this.id = id;
    }

    public Element getVerifyClause() {
        return verifyClause;
    }

    public void setVerifyClause(Element verifyClause) {
        this.verifyClause = verifyClause;
    }

    public Element getWhenClause() {
        return whenClause;
    }

    public void setWhenClause(Element whenClause) {
        this.whenClause = whenClause;
    }

    /*
    public Element getCurrentElement() {
        return currentElement;
    }

    public void setCurrentElement(Element currentElement) {
        this.currentElement = currentElement;
    }*/
    
    public Matrix getMatrix() {
        return matrix;
    }
    
    public void setMatrix(Matrix matrix) {
        this.matrix = matrix;
        
        this.matrix.setTestCase(this);
    }

    public String toString() {
	return "Verify[" + this.verifyClause.toString() + "] When[" + this.whenClause.toString() + "]";
    }

    public String getStructure() {
	return "Test [" + this.getId() + "] Verify [" + this.verifyClause.getStructure() + "] When [" + this.whenClause.getStructure() + "]";
    }

}
