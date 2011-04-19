package leta.core.model;

import java.util.ArrayList;
import java.util.List;

public class Matrix {

    private ArrayList<MatrixItem> content;
    private int sequence;
    private TestCase testCase;
    private MatrixIterator iterator;

    public Matrix() {
	super();
	
	this.content = new ArrayList<MatrixItem>();
	this.sequence = 0;
	
	this.iterator = new MatrixIterator();
    }
    
    public void setTestCase(TestCase testCase) {
        this.testCase = testCase;
    }

    public void addRow(ArrayList<Object> row) {
	MatrixItem matrixItem = new MatrixItem(row);
	
	this.content.add(matrixItem);
    }

    public void addRow(MatrixItem matrixItem) {
	this.content.add(matrixItem);
    }

    public void addRows(ArrayList<MatrixItem> matrixItems) {
	this.content.addAll(matrixItems);
    }

    public boolean hasStringValue(int column) {
	for (MatrixItem item : this.content) {
	    if (item.getColumn(column - 1) instanceof String) {
		return true;
	    }
	}
	
	return false;
    }

    public boolean hasIntegerValue(int column) {
	for (MatrixItem item : this.content) {
	    if (item.getColumn(column - 1) instanceof Integer) {
		return true;
	    }
	}
	
	return false;
    }

    public boolean hasFloatValue(int column) {
	for (MatrixItem item : this.content) {
	    if (item.getColumn(column - 1) instanceof Float) {
		return true;
	    }
	}
	
	return false;
    }

    public boolean hasDateValue(int column) {
	for (MatrixItem item : this.content) {
	    if (item.getColumn(column - 1) instanceof Date) {
		return true;
	    }
	}
	
	return false;
    }

    public ArrayList<MatrixItem> getContent() {
        return content;
    }
    
    public String getSequence() {
	return "" + this.sequence;
    }

    public MatrixIterator getIterator() {
        return iterator;
    }
    
    class MatrixIterator {

	public boolean isHasNext() {

	    Matrix.this.sequence++;

	    if (Matrix.this.sequence > Matrix.this.content.size())
		return false;

	    List<ClassElement> classElements = new ArrayList<ClassElement>();

	    // Recupera todas as ClassNodes das clausulas Verify e When
	    this.getClassElements(Matrix.this.testCase.getVerifyClause(), classElements);
	    this.getClassElements(Matrix.this.testCase.getWhenClause(), classElements);

	    // Redefine os Values
	    // Voltar o valor no atributo usedInstance no ClassNode
	    for (ClassElement classElement : classElements) {
		classElement.setUsedInstance(false);
		
		if (classElement.getIndexOfSet() != null && classElement.getIndexOfSet() > 0) {
		    MatrixItem matrixItem = Matrix.this.content.get(Matrix.this.sequence - 1);

		    Object value = matrixItem.getColumn(classElement.getIndexOfSet());

		    if (value instanceof String)
			classElement.setStringValue((String) value);
		    else if (value instanceof Integer)
			classElement.setIntValue((Integer) value);
		    else if (value instanceof Double)
			classElement.setFloatValue((Double) value);
		}
	    }

	    return true;
	}
	
	private void getClassElements(Element element, List<ClassElement> classElements) {
	    if (element instanceof CompositeElement) {
		this.getClassElements(((CompositeElement) element).getLeft(), classElements);
		this.getClassElements(((CompositeElement) element).getRight(), classElements);
	    } else if (element instanceof ClassElement) {
		classElements.add((ClassElement) element);
		
		if (((ClassElement) element).getMethodElement() != null && ((ClassElement) element).getMethodElement().getClassElement() != null) {
		    this.getClassElements(((ClassElement) element).getMethodElement().getClassElement(), classElements);
		}
		
//		if (((ClassElement) element).getNext() != null) {
//		    throw new RuntimeException("Point with NEXT");
//		    this.getClassElements(((ClassElement) element).getNext(), classElements);
//		}
	    }
	}

    }
    
}
