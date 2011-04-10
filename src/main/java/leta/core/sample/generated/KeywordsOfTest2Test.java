
package leta.core.sample.generated;

import org.junit.Test;
import static org.junit.Assert.*;

public abstract class KeywordsOfTest2Test {

    // Gera todas as classes que correspondem aos termos
    class Result {
        // Existem inumeros casos que necessitam de um Operator, com excecao de quando nao houver valores
        Operator operator = new OperatorEqual();
        
        Result() {
        }
        

    	// Class methodClass;
    	Statement hasStatement;
    	
    	// Class getMethodClass() { return instance; }
    	Statement getHasStatement() {
    	    return this.hasStatement; 
    	}
    	
    	// void setMethodClass(Class instance) { this.instance = instance; }
    	void setHasStatement(Statement hasStatement) {
    	    this.hasStatement = hasStatement;
    	}
    	
    	// Class methodClassClass(String value) { this.instance = new Class(value); }
    	Statement hasStatement(String value) {
            return this.hasStatement = new Statement(value);
    	}

        public boolean equals(Object obj) {
            if (obj instanceof Result) {
                Result o = (Result) obj;
                boolean validValue = true;
                boolean valid = true;

                
                if (this.hasStatement != null &&
                    o.hasStatement != null)
                    valid = valid & this.hasStatement.equals(o.hasStatement);
                
                return validValue && valid;
            }
            
            return false;
        }

    }
    class Statement {
        // Existem inumeros casos que necessitam de um Operator, com excecao de quando nao houver valores
        Operator operator = new OperatorEqual();
        
        Statement() {
        }
        
        String sValue;

        Statement(String value) { this.sValue = value; }
        String getStringValue() { return this.sValue; }


        public boolean equals(Object obj) {
            if (obj instanceof Statement) {
                return true;
            }
            
            return false;
        }

    }
    class Search {
        // Existem inumeros casos que necessitam de um Operator, com excecao de quando nao houver valores
        Operator operator = new OperatorEqual();
        
        Search() {
        }
        

    	// Class methodClass;
    	Keyword containsKeyword;
    	
    	// Class getMethodClass() { return instance; }
    	Keyword getContainsKeyword() {
    	    return this.containsKeyword; 
    	}
    	
    	// void setMethodClass(Class instance) { this.instance = instance; }
    	void setContainsKeyword(Keyword containsKeyword) {
    	    this.containsKeyword = containsKeyword;
    	}
    	
    	// Class methodClassClass(String value) { this.instance = new Class(value); }
        Keyword containsKeyword(OperatorNumber operator, Integer value) {
            return this.containsKeyword = new Keyword(operator, value);
        }
        public boolean equals(Object obj) {
            if (obj instanceof Search) {
                Search o = (Search) obj;
                boolean validValue = true;
                boolean valid = true;

                
                if (this.containsKeyword != null &&
                    o.containsKeyword != null)
                    valid = valid & this.containsKeyword.equals(o.containsKeyword);
                
                return validValue && valid;
            }
            
            return false;
        }

    }
    class Keyword {
        // Existem inumeros casos que necessitam de um Operator, com excecao de quando nao houver valores
        Operator operator = new OperatorEqual();
        
        Keyword() {
        }
        
        String sValue;

        Keyword(String value) { this.sValue = value; }
        Keyword(OperatorString operator, String value) { this.operator = operator; this.sValue = value; }
        String getStringValue() { return this.sValue; }
        Double dValue;

        Keyword(OperatorNumber operator, Double value) { this.operator = operator; this.dValue = value; }
        Double getDoubleValue() { return this.dValue; }
        Integer iValue;

        Keyword(OperatorNumber operator, Integer value) { this.operator = operator; this.iValue = value; }
        Integer getIntegerValue() { return this.iValue; }

    	// Class methodClass;
    	Attribute withAttribute;
    	
    	// Class getMethodClass() { return instance; }
    	Attribute getWithAttribute() {
    	    return this.withAttribute; 
    	}
    	
    	// void setMethodClass(Class instance) { this.instance = instance; }
    	void setWithAttribute(Attribute withAttribute) {
    	    this.withAttribute = withAttribute;
    	}
    	
    	// Class methodClassClass(String value) { this.instance = new Class(value); }
        Attribute withAttribute() {
            return this.withAttribute = new Attribute();
        }
        public boolean equals(Object obj) {
            if (obj instanceof Keyword) {
                Keyword o = (Keyword) obj;
                boolean validValue = true;
                boolean valid = true;

                if (this.sValue != null && o.sValue != null && !operator.compare(this.sValue, o.sValue))
                    validValue = false;
                if (this.dValue != null && o.dValue != null && !operator.compare(this.dValue, o.dValue))
                    validValue = false;
                if (this.iValue != null && o.iValue != null && !operator.compare(this.iValue, o.iValue))
                    validValue = false;
                
                if (this.withAttribute != null &&
                    o.withAttribute != null)
                    valid = valid & this.withAttribute.equals(o.withAttribute);
                
                return validValue && valid;
            }
            
            return false;
        }

    }
    class Attribute {
        // Existem inumeros casos que necessitam de um Operator, com excecao de quando nao houver valores
        Operator operator = new OperatorEqual();
        
        Attribute() {
        }
        


        public boolean equals(Object obj) {
            if (obj instanceof Attribute) {
                return true;
            }
            
            return false;
        }

    }


    // Método que será implementado e enviará os dados ao SUT
    abstract Result sendToSut(Search search1);
    
    // No Matrix
    @Test
    public void test() {

        // Gera as instáncias da cláusula Verify
        Result result1 = new Result();
        Statement statement = new Statement("Test One Verify User is Authenticated When User has Login 'user', Password 'pass'");


         
        result1.setHasStatement(statement);

        
        // Gera as instáncias da cláusula When
        Search search1 = new Search();
        Keyword keyword = new Keyword(new OperatorLessThan(), 100);
        Attribute attribute = new Attribute();
        Keyword keyword1 = new Keyword(new OperatorNotEqual(), "Verify");
        Keyword keyword2 = new Keyword(new OperatorMoreThan(), 10.5);


         
        search1.setContainsKeyword(keyword);

         
        keyword.setWithAttribute(attribute);

         
        search1.setContainsKeyword(keyword1);

         
        keyword1.setWithAttribute(attribute);

         
        search1.setContainsKeyword(keyword2);

         
        keyword2.setWithAttribute(attribute);

        
        // Executa o método sendToSut
        Result result1Result = sendToSut(search1);
	
        // Compara os resultados com os valores esperados
        assertEquals(result1, result1Result);

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

