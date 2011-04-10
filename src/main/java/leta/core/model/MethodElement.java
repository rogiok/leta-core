package leta.core.model;

public class MethodElement extends Element implements MethodCode {

    private boolean parameterNull;
    private ClassElement classElement;

    public MethodElement(String name, ClassElement classElement) { 
	super();
	
	this.setName(name);
	this.classElement = classElement;
    }

    public MethodElement(String name) { 
	this(name, null);
    }

    public boolean isParameterNull() {
        return parameterNull;
    }

    public void setParameterNull(boolean parameterNull) {
        this.parameterNull = parameterNull;
    }

    public ClassElement getClassElement() {
        return classElement;
    }

    public void setClassElement(ClassElement classElement) {
        this.classElement = classElement;
    }

    public String getInstanceName() {
	return this.getName().substring(0, 1).toLowerCase() + this.getName().substring(1);
    }

    public String getMethodName() {
	return this.getName().substring(0, 1).toUpperCase() + this.getName().substring(1);
    }

    public String getClassName() {
	return this.getName().substring(0, 1).toUpperCase() + this.getName().substring(1);
    }

    public String toString() {
	return "M[" + this.getName() + (this.getClassElement() != null ? " " + this.getClassElement().toString() : "") + "]";
    }

    public String getStructure() {
	return "" + this.getName() + (this.getClassElement() != null ? " " + this.getClassElement().getStructure() : "") + "";
    }

}
