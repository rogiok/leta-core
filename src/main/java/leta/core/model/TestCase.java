package leta.core.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestCase {

    private String id;
    private Element verifyClause;
    private Element whenClause;
    private List<Element> elements;
    private Matrix matrix;

    private List<ClassElement> classElements;
    
    public TestCase(String id) {
	super();

	this.id = id;
	this.verifyClause = new Element();
	this.whenClause = new Element();
	
	this.elements = new ArrayList<Element>();
	this.classElements = new ArrayList<ClassElement>();
    }

    public TestCase() {
	this(null);
    }

    public void generateElements() {
	
	this.walk(this.verifyClause, false);
	this.walk(this.whenClause, true);
	
    }
    
    private void walk(Element element, boolean processRelationalOperator) {
	if (element instanceof CompositeElement) {
	    CompositeElement cn = (CompositeElement) element;
	    
	    Element n = this.findElement(element);
	    
	    // Deprecated
	    if (element instanceof JunctionElement) {
		((CompositeElement) n).addConstructor(new JunctionElement(cn.getName(), cn.getLeft(), cn.getRight()));
	    } else if (element instanceof OperatorElement) {
		((CompositeElement) n).addConstructor(new OperatorElement(cn.getName(), cn.getLeft(), cn.getRight()));
	    }
	    
	    walk(cn.getLeft(), processRelationalOperator);
	    walk(cn.getRight(), processRelationalOperator);
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
	    if (classElement.getDateValue() != null) {
		newClassElement.setDateValue("");
	    }

	    if (classElement.getRelationalOperator() != null) {
		if (processRelationalOperator) {
		    this.createListInMatrix(classElement);

		    newClassElement.setRelationalOperator("*");
		} else {
//		    this.changeValue(classElement);
		}
	    }
	    
	    if (classElement.getMethodElement() != null) {
		// Adiciona os métodos numa lista para a geração do código no template
		// porque podem existir mais de um método para a mesma classe.
		newClassElement.addMethodElement(classElement.getMethodElement());

		if (classElement.getMethodElement().getClassElement() != null) {
		    walk(classElement.getMethodElement().getClassElement(), processRelationalOperator);
		}
	    }
	}
    }
    
    public Element findElement(Element element) {
	
	for (Element n : this.elements) {
//	    if (n.getName().equals(element.getName())) {
	    if (n.getName().toLowerCase().equals(element.getName().toLowerCase())) {
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
    
    @Deprecated
    public void addSequenceCode(SequenceCode sequenceCode) {
	
	if (sequenceCode instanceof ClassElement) {
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

    private void createListInMatrix(ClassElement classElement) {
	
	Object value1 = null;
	Object value2 = null;
	
	int v = new Random().nextInt(100);
	
	if (classElement.getRelationalOperator().equals("MoreOrEqualThan")) {
	    if (classElement.getIntValue() != null) {
		value1 = new Integer(classElement.getIntValue().intValue());
		value2 = new Integer(classElement.getIntValue().intValue() + v);
	    } else if (classElement.getFloatValue() != null) {
		value1 = new Double(classElement.getFloatValue().doubleValue());
		value2 = new Double(classElement.getFloatValue().doubleValue() + v);
	    } else if (classElement.getDateValue() != null) {
		value1 = new Date(classElement.getDateValue().getOriginal());
		value2 = new Date(classElement.getDateValue().sum().getOriginal());
	    }

	    updateMatrix(classElement, value1, value2);
	} else if (classElement.getRelationalOperator().equals("LessOrEqualThan")) {
	    if (classElement.getIntValue() != null) {
		value1 = new Integer(classElement.getIntValue().intValue());
		value2 = new Integer(classElement.getIntValue().intValue() - v);
	    } else if (classElement.getFloatValue() != null) {
		value1 = new Double(classElement.getFloatValue().doubleValue());
		value2 = new Double(classElement.getFloatValue().doubleValue() - v);
	    } else if (classElement.getDateValue() != null) {
		value1 = new Date(classElement.getDateValue().getOriginal());
		value2 = new Date(classElement.getDateValue().subtract().getOriginal());
	    }

	    updateMatrix(classElement, value1, value2);
	} else if (classElement.getRelationalOperator().equals("NotEqual")) {
	    if (classElement.getIntValue() != null) {
		value1 = new Integer(classElement.getIntValue().intValue() - v);
		value2 = new Integer(classElement.getIntValue().intValue() + v);
	    } else if (classElement.getFloatValue() != null) {
		value1 = new Double(classElement.getFloatValue().doubleValue() - v);
		value2 = new Double(classElement.getFloatValue().doubleValue() + v);
	    } else if (classElement.getDateValue() != null) {
		value1 = new Date(classElement.getDateValue().sum().getOriginal());
		value2 = new Date(classElement.getDateValue().subtract().getOriginal());
	    }

	    updateMatrix(classElement, value1, value2);
	}
	
    }
    
    private void changeValue(ClassElement classElement) {

	if (classElement.getRelationalOperator().equals("MoreOrEqualThan")) {
	    if (classElement.getIntValue() != null) {
		classElement.setIntValue(new Integer(classElement.getIntValue().intValue() + 1));
	    } else if (classElement.getFloatValue() != null) {
		classElement.setFloatValue(new Double(classElement.getFloatValue().doubleValue() + 1));
	    } else if (classElement.getDateValue() != null) {
		classElement.getDateValue().sum();
	    }
	} else if (classElement.getRelationalOperator().equals("LessOrEqualThan") || classElement.getRelationalOperator().equals("NotEqual")) {
	    if (classElement.getIntValue() != null) {
		classElement.setIntValue(new Integer(classElement.getIntValue().intValue() - 1));
	    } else if (classElement.getFloatValue() != null) {
		classElement.setFloatValue(classElement.getFloatValue().doubleValue() - 1);
	    } else if (classElement.getDateValue() != null) {
		classElement.getDateValue().subtract();
	    }
	}
	
    }

    private void updateMatrix(ClassElement classElement, Object value1, Object value2) {
	
	MatrixItem matrixItem = null;

	if (this.matrix == null) {
	    this.matrix = new Matrix();
	    this.matrix.setTestCase(this);
	    
	    // Adiciona o primeiro item com o primeiro valor
	    matrixItem = new MatrixItem();
	    matrixItem.addColumn(value1);

	    this.matrix.addRow(matrixItem);

	    // Adiciona o segundo item com o segundo valor
	    matrixItem = new MatrixItem();
	    matrixItem.addColumn(value2);

	    this.matrix.addRow(matrixItem);
	    
	} else {

	    int totalItems = this.matrix.totalItems();

	    for (int i = 0; i < totalItems; i++) {
		matrixItem = this.matrix.getContent(i);
		MatrixItem copy = (MatrixItem) matrixItem.clone();

		// Adiciona o primeiro valor ao item existente
		matrixItem.addColumn(value1);
		// Adiciona o segundo valor a um novo item
		copy.addColumn(value2);

		this.matrix.addRow(copy);
	    }
	}
	
	if (classElement.getIndexOfSet() == null)
	    classElement.setIndexOfSet(matrixItem.sizeColumns());
	
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

    public Matrix getMatrix() {
        return this.matrix;
    }

    public Matrix newMatrix() {
	if (this.matrix == null) {
	    this.matrix = new Matrix();
	    this.matrix.setTestCase(this);
	}
	
        return this.matrix;
    }

    @Deprecated
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
