package leta.core.model;

public class JunctionElement extends CompositeElement {

    public JunctionElement(String name, Element left, Element right) {
	super(name, left, right);
    }

    public String getClassName() {
	return this.getName().substring(0, 1).toUpperCase() + this.getName().substring(1);
    }

    public String getInstanceName() {
	return this.getName().substring(0, 1).toLowerCase() + this.getName().substring(1);
    }

    public String getInstanceClassName() {
	return this.getName().substring(0, 1).toUpperCase() + this.getName().substring(1);
    }

    public String toString() {
	return "L[ " + this.getLeft().toString() + " ] " + this.getName() + " R[ " + (this.getRight() != null?this.getRight().toString():"") + " ]";
    }

}
