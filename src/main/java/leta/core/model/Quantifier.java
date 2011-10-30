package leta.core.model;

public class Quantifier {

    private String type;
    private String operator;
    private Integer value;
    private Integer value2;

    public Quantifier(String type, String operator, Integer value, Integer value2) {
	super();
	this.type = type;
	this.operator = operator;
	this.value = value;
	this.value2 = value2;
    }

    public Quantifier(String type, String operator, Integer value) {
	this(type, operator, value, null);
    }

    public Quantifier(String type, String operator) {
	this(type, operator, null, null);
    }

    public String getType() {
	return type;
    }

    public void setType(String type) {
	this.type = type;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Integer getValue() {
	return value;
    }

    public void setValue(Integer value) {
	this.value = value;
    }

    public Integer getValue2() {
	return value2;
    }

    public void setValue2(Integer value2) {
	this.value2 = value2;
    }
    
    public String getTypeName() {
	return this.getType().substring(0, 1).toUpperCase() + this.getType().substring(1);
    }

}
