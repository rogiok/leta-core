package leta.core.model;

public class Element {

    private String name;
    private Element parent;
    private boolean composite;
    
    public Element() {
	super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Element getParent() {
        return parent;
    }

    public void setParent(Element parent) {
        this.parent = parent;
    }
    
    public String getStructure() {
	return null;
    }

    public boolean isComposite() {
        return composite;
    }

    public void setComposite(boolean composite) {
        this.composite = composite;
    }
    
}
