
package leta.core.sample.generated;

import org.junit.Test;
import static org.junit.Assert.*;

public abstract class TestCase02Test {

    // Gera todas as classes que correspondem aos termos
    class Calculator {
        // Existem inumeros casos que necessitam de um Operator, com excecao de quando nao houver valores
        Operator operator = new OperatorEqual();
        
        Calculator() {
        }
        

    	// Class methodClass;
    	Result hasResult;
    	
    	// Class getMethodClass() { return instance; }
    	Result getHasResult() {
    	    return this.hasResult; 
    	}
    	
    	// void setMethodClass(Class instance) { this.instance = instance; }
    	void setHasResult(Result hasResult) {
    	    this.hasResult = hasResult;
    	}
    	
    	// Class methodClassClass(String value) { this.instance = new Class(value); }
    	Result hasResult(String value) {
            return this.hasResult = new Result(value);
    	}
        Result hasResult(Integer value) {
            return this.hasResult = new Result(value);
        }
        public boolean equals(Object obj) {
            if (obj instanceof Calculator) {
                Calculator o = (Calculator) obj;
                boolean validValue = true;
                boolean valid = true;

                
                if (this.hasResult != null &&
                    o.hasResult != null)
                    valid = valid & this.hasResult.equals(o.hasResult);
                
                return validValue && valid;
            }
            
            return false;
        }

    }
    class Result {
        // Existem inumeros casos que necessitam de um Operator, com excecao de quando nao houver valores
        Operator operator = new OperatorEqual();
        
        Result() {
        }
        
        String sValue;

        Result(String value) { this.sValue = value; }
        String getStringValue() { return this.sValue; }
        Integer iValue;

        Result(Integer value) { this.iValue = value; }
        Integer getIntegerValue() { return this.iValue; }


        public boolean equals(Object obj) {
            if (obj instanceof Result) {
                return true;
            }
            
            return false;
        }

    }
    class Equals {
        Equals() {
        }

        Result result1;
        Sum sum;

        Equals(Result result1, Sum sum) {
            this.result1 = result1;
            this.sum = sum;
        }

        Result getResult1() {
            return result1;
        }

        void setResult1(Result result1) {
            this.result1 = result1;
        }

        Sum getSum() {
            return sum;
        }

        void setSum(Sum sum) {
            this.sum = sum;
        }


        public boolean equals(Object obj) {
            if (obj instanceof Equals) {
                Equals o = (Equals) obj;
                boolean valid = true;
                
                if (this.result1 != null &&
                    o.result1 != null)
                    valid = valid & this.result1.equals(o.result1);
                if (this.sum != null &&
                    o.sum != null)
                    valid = valid & this.sum.equals(o.sum);

                return valid;
            }
            
            return false;
        }

    }
    class Sum {
        Sum() {
        }

        Value value;
        Minus minus;

        Sum(Value value, Minus minus) {
            this.value = value;
            this.minus = minus;
        }

        Value getValue() {
            return value;
        }

        void setValue(Value value) {
            this.value = value;
        }

        Minus getMinus() {
            return minus;
        }

        void setMinus(Minus minus) {
            this.minus = minus;
        }


        public boolean equals(Object obj) {
            if (obj instanceof Sum) {
                Sum o = (Sum) obj;
                boolean valid = true;
                
                if (this.value != null &&
                    o.value != null)
                    valid = valid & this.value.equals(o.value);
                if (this.minus != null &&
                    o.minus != null)
                    valid = valid & this.minus.equals(o.minus);

                return valid;
            }
            
            return false;
        }

    }
    class Value {
        // Existem inumeros casos que necessitam de um Operator, com excecao de quando nao houver valores
        Operator operator = new OperatorEqual();
        
        Value() {
        }
        
        Integer iValue;

        Value(Integer value) { this.iValue = value; }
        Integer getIntegerValue() { return this.iValue; }


        public boolean equals(Object obj) {
            if (obj instanceof Value) {
                return true;
            }
            
            return false;
        }

    }
    class Minus {
        Minus() {
        }

        Value value1;
        Value value2;

        Minus(Value value1, Value value2) {
            this.value1 = value1;
            this.value2 = value2;
        }

        Value getValue1() {
            return value1;
        }

        void setValue1(Value value1) {
            this.value1 = value1;
        }

        Value getValue2() {
            return value2;
        }

        void setValue2(Value value2) {
            this.value2 = value2;
        }


        public boolean equals(Object obj) {
            if (obj instanceof Minus) {
                Minus o = (Minus) obj;
                boolean valid = true;
                
                if (this.value1 != null &&
                    o.value1 != null)
                    valid = valid & this.value1.equals(o.value1);
                if (this.value2 != null &&
                    o.value2 != null)
                    valid = valid & this.value2.equals(o.value2);

                return valid;
            }
            
            return false;
        }

    }


    // Método que será implementado e enviará os dados ao SUT
    abstract Calculator sendToSut(Equals equals);
    
    // Matrix
    @Test
    void test1() {

        // Verify
        Calculator calculator1 = new Calculator();
        Result result = new Result();


         
        calculator1.setHasResult(result);


        // When
        Equals equals = new Equals();
        Result result1 = new Result(10);

        Sum sum = new Sum();
        Value value = new Value(50);

        Minus minus = new Minus();
        Value value1 = new Value(4);

        Value value2 = new Value(0);

        equals.setResult1(result1);
        equals.setSum(sum);
        sum.setValue(value);
        sum.setMinus(minus);
        minus.setValue1(value1);
        minus.setValue2(value2);

            

        Calculator calculator1Result = sendToSut(equals);

        assertEquals(calculator1, calculator1Result);

    }
        
    @Test
    void test2() {

        // Verify
        Calculator calculator1 = new Calculator();
        Result result = new Result();


         
        calculator1.setHasResult(result);


        // When
        Equals equals = new Equals();
        Result result1 = new Result(2);

        Sum sum = new Sum();
        Value value = new Value(18);

        Minus minus = new Minus();
        Value value1 = new Value(1);

        Value value2 = new Value(0);

        equals.setResult1(result1);
        equals.setSum(sum);
        sum.setValue(value);
        sum.setMinus(minus);
        minus.setValue1(value1);
        minus.setValue2(value2);

            

        Calculator calculator1Result = sendToSut(equals);

        assertEquals(calculator1, calculator1Result);

    }
        

    
    abstract class Operator {
        abstract boolean compare(Object obj1, Object obj2);
    }
    
    abstract class OperatorString extends Operator {
    }

    abstract class OperatorNumber extends Operator {
        boolean verify(Object obj1, Object obj2) {
            return ((obj1 instanceof Integer || obj1 instanceof Double)
                && (obj2 instanceof Integer || obj2 instanceof Double));
        }
    }
    
    class OperatorEqual extends OperatorString {
        boolean compare(Object obj1, Object obj2) {
            return obj1.equals(obj2);
        }
    }

    class OperatorNotEqual extends OperatorString {
        boolean compare(Object obj1, Object obj2) {
            return !obj1.equals(obj2);
        }
    }

    class OperatorLessThan extends OperatorNumber {
        boolean compare(Object obj1, Object obj2) {
            if (verify(obj1, obj2))
                return ((Double) obj1).compareTo((Double) obj2) < 0;

            return false;
        }
    }

    class OperatorEqualOrLessThan extends OperatorNumber {
        boolean compare(Object obj1, Object obj2) {
            if (verify(obj1, obj2))
                return ((Double) obj1).compareTo((Double) obj2) <= 0;

            return false;
        }
    }

    class OperatorMoreThan extends OperatorNumber {
        boolean compare(Object obj1, Object obj2) {
            if (verify(obj1, obj2))
                return ((Double) obj1).compareTo((Double) obj2) > 0;
            
            return false;
        }
    }

    class OperatorEqualOrMoreThan extends OperatorNumber {
        boolean compare(Object obj1, Object obj2) {
            if (verify(obj1, obj2))
                return ((Double) obj1).compareTo((Double) obj2) >= 0;
            
            return false;
        }
    }
    
	class Ab extends org.hamcrest.BaseMatcher<Object> {
	private Object obj;
	    
	public Ab(Object obj) {
	super();
	this.obj = obj;
	}
	
	@Override
	public boolean matches(Object arg0) {
	return false;
	}
	
	@Override
	public void describeTo(org.hamcrest.Description arg0) {
	arg0.appendText("Not OK");
	}
	}
    
}

