package leta.core.model;

public class OperatorElement extends CompositeElement {

    public OperatorElement(String name, Element left, Element right) {
	super();
	
	this.setName(name);
	this.setLeft(left);
	this.setRight(right);
    }
    
    public String getInstanceName() {
	return this.getName().substring(0, 1).toLowerCase() + this.getName().substring(1);
    }

    public String getClassName() {
	return this.getName().substring(0, 1).toUpperCase() + this.getName().substring(1);
    }

    public String getInstanceClassName() {
	return this.getName().substring(0, 1).toUpperCase() + this.getName().substring(1);
    }

    public String toString() {
	return "L[ " + this.getLeft().toString() + " ] " + this.getName() + " R[ " + (this.getRight() != null?this.getRight().toString():"") + " ]";
    }

}
