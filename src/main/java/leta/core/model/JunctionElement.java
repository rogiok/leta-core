package leta.core.model;

public class JunctionElement extends CompositeElement implements ClassCode {

//    private Integer sequence;

    public JunctionElement(String name, Element left, Element right) {
	super();
	this.setName(name);
	this.setLeft(left);
	this.setRight(right);
    }

    /*
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
    }*/

    public String getClassName() {
	return this.getName().substring(0, 1).toUpperCase() + this.getName().substring(1);
    }

    public String getInstanceName() {
//	return this.getName().substring(0, 1).toLowerCase() + this.getName().substring(1) + (this.sequence > 0 ? this.sequence : "");
	return this.getName().substring(0, 1).toLowerCase() + this.getName().substring(1);
    }

    public String getInstanceClassName() {
//	return this.getName().substring(0, 1).toUpperCase() + this.getName().substring(1) + (this.sequence > 0 ? this.sequence : "");
	return this.getName().substring(0, 1).toUpperCase() + this.getName().substring(1);
    }

    public String toString() {
	return "L[ " + this.getLeft().toString() + " ] " + this.getName() + " R[ " + (this.getRight() != null?this.getRight().toString():"") + " ]";
    }

}
