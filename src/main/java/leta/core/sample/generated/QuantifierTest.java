
package leta.core.sample.generated;

import org.junit.Test;
import static org.junit.Assert.*;

public abstract class QuantifierTest {

    // Gera todas as classes que correspondem aos termos
    class Result {
        // Existem inumeros casos que necessitam de um Operator, com excecao de quando nao houver valores
        Operator operator = new OperatorEqual();
        
        Result() {
        }
        

        // List<Class> instance = new ArrayList<Class>();
        java.util.List<Item> containsItem = new java.util.ArrayList<Item>();
        
        // List<Class> getInstanceQuantifierValueClass() { return instance; }
        java.util.List<Item> getContainsAtLeast10Item() {
            return this.containsItem; 
        }
        
        // void setInstanceQuantifierValueClass(List<Class> instance) { this.instance = instance; }
        void setContainsAtLeast10Item(java.util.List<Item> containsItem) {
            this.containsItem = containsItem;
        }
        
        // void addInstanceClass(Class instance) { this.instance.add(instance); }
        void addContainsItem(Item containsItem) {
            this.containsItem.add(containsItem);
        }


        public boolean equals(Object obj) {
            if (obj instanceof Result) {
                Result o = (Result) obj;
                boolean validValue = true;
                boolean valid = true;

                
                if (this.containsItem != null &&
                    o.containsItem != null)
                    valid = valid & (o.containsItem.size() >= 10);

                
                return validValue && valid;
            }
            
            return false;
        }

    }
    class Item {
        // Existem inumeros casos que necessitam de um Operator, com excecao de quando nao houver valores
        Operator operator = new OperatorEqual();
        
        Item() {
        }
        
        Integer iValue;

        Item(OperatorNumber operator, Integer value) { this.operator = operator; this.iValue = value; }
        Integer getIntegerValue() { return this.iValue; }


        public boolean equals(Object obj) {
            if (obj instanceof Item) {
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
    	Keyword hasKeyword;
    	
    	// Class getMethodClass() { return instance; }
    	Keyword getHasKeyword() {
    	    return this.hasKeyword; 
    	}
    	
    	// void setMethodClass(Class instance) { this.instance = instance; }
    	void setHasKeyword(Keyword hasKeyword) {
    	    this.hasKeyword = hasKeyword;
    	}
    	
    	// Class methodClassClass(String value) { this.instance = new Class(value); }
    	Keyword hasKeyword(String value) {
            return this.hasKeyword = new Keyword(value);
    	}

        public boolean equals(Object obj) {
            if (obj instanceof Search) {
                Search o = (Search) obj;
                boolean validValue = true;
                boolean valid = true;

                
                if (this.hasKeyword != null &&
                    o.hasKeyword != null)
                    valid = valid & this.hasKeyword.equals(o.hasKeyword);
                
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
        String getStringValue() { return this.sValue; }


        public boolean equals(Object obj) {
            if (obj instanceof Keyword) {
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
        Item item = new Item(new OperatorMoreThan(), 20);


        result1.addContainsItem(item);

        
        // Gera as instáncias da cláusula When
        Search search1 = new Search();
        Keyword keyword = new Keyword("test");


         
        search1.setHasKeyword(keyword);

        
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

