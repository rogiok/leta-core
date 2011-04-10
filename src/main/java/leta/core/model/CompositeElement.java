package leta.core.model;

import java.util.ArrayList;
import java.util.List;

public class CompositeElement extends Element {

    private Element left;
    private Element right;
    
    private List<CompositeElement> constructors;

    public CompositeElement(String name, Element left, Element right) {
	super();
	
	this.setName(name);
	this.setComposite(true);
	this.left = left;
	this.right = right;
	
	this.constructors = new ArrayList<CompositeElement>();
    }
    
    public CompositeElement() {
	this(null, null, null);
    }

    public Element getLeft() {
	return left;
    }

    public void setLeft(Element left) {
	this.left = left;

	this.left.setParent(this);
    }

    public Element getRight() {
	return right;
    }

    public void setRight(Element right) {
	this.right = right;

	this.right.setParent(this);
    }
    
    public List<Element> getElements() {
	
	List<Element> result = new ArrayList<Element>();
	
	for (CompositeElement cn : this.constructors) {
	    if (!result.contains(cn.getLeft()))
		result.add(cn.getLeft());
	    if (!result.contains(cn.getRight()))
		result.add(cn.getRight());
	}
	
	return result;
    }

    public void addConstructor(CompositeElement compositeElement) {
	
	boolean found = false;
	
	for (CompositeElement cn : this.constructors) {
	    if (cn.getLeft().getClass().getSimpleName().equals(compositeElement.getLeft().getClass().getSimpleName())
		    && cn.getRight().getClass().getSimpleName().equals(compositeElement.getRight().getClass().getSimpleName())) {
		found = true;
		
		break;
	    }
	}
	
	if (!found)
	    this.constructors.add(compositeElement);
    }

    public List<CompositeElement> getConstructors() {
        return constructors;
    }

    public Element getLeftLeaf() {
	if (this.left instanceof CompositeElement) {
	    return ((CompositeElement) this.left).getLeftLeaf();
	}
	
	return this.left;
    }
 
    public String getStructure() {
	return "(" + this.getLeft().getStructure() + ") " + this.getName() + " (" + (this.getRight() != null?this.getRight().getStructure():"") + ")";
    }

}
