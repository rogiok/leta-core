
package leta.core.sample.generated;

import org.junit.Test;
import static org.junit.Assert.*;

public abstract class KeywordsOfTestTest {

    // Gera todas as classes que correspondem aos termos
    class And {
        And() {
        }

        TestCase testCase;
        Or or;

        And(TestCase testCase, Or or) {
            this.testCase = testCase;
            this.or = or;
        }

        TestCase getTestCase() {
            return testCase;
        }

        void setTestCase(TestCase testCase) {
            this.testCase = testCase;
        }

        Or getOr() {
            return or;
        }

        void setOr(Or or) {
            this.or = or;
        }


        public boolean equals(Object obj) {
            if (obj instanceof And) {
                And o = (And) obj;
                boolean valid = true;
                
                if (this.testCase != null &&
                    o.testCase != null)
                    valid = valid & this.testCase.equals(o.testCase);
                if (this.or != null &&
                    o.or != null)
                    valid = valid & this.or.equals(o.or);

                return valid;
            }
            
            return false;
        }

    }
    class TestCase {
        // Existem inumeros casos que necessitam de um Operator, com excecao de quando nao houver valores
        Operator operator = new OperatorEqual();
        
        TestCase() {
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
    	Keyword containsKeyword(String value) {
            return this.containsKeyword = new Keyword(value);
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
            if (obj instanceof TestCase) {
                TestCase o = (TestCase) obj;
                boolean validValue = true;
                boolean valid = true;

                
                if (this.containsKeyword != null &&
                    o.containsKeyword != null)
                    valid = valid & this.containsKeyword.equals(o.containsKeyword);
                if (this.hasStatement != null &&
                    o.hasStatement != null)
                    valid = valid & this.hasStatement.equals(o.hasStatement);
                
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
    	// Class methodClass;
    	Keyword isKeyword;
    	
    	// Class getMethodClass() { return instance; }
    	Keyword getIsKeyword() {
    	    return this.isKeyword; 
    	}
    	
    	// void setMethodClass(Class instance) { this.instance = instance; }
    	void setIsKeyword(Keyword isKeyword) {
    	    this.isKeyword = isKeyword;
    	}
    	
    	// Class methodClassClass(String value) { this.instance = new Class(value); }
    	Keyword isKeyword(String value) {
            return this.isKeyword = new Keyword(value);
    	}

        public boolean equals(Object obj) {
            if (obj instanceof Keyword) {
                Keyword o = (Keyword) obj;
                boolean validValue = true;
                boolean valid = true;

                if (this.sValue != null && o.sValue != null && !operator.compare(this.sValue, o.sValue))
                    validValue = false;
                
                if (this.hasKeyword != null &&
                    o.hasKeyword != null)
                    valid = valid & this.hasKeyword.equals(o.hasKeyword);
                if (this.isKeyword != null &&
                    o.isKeyword != null)
                    valid = valid & this.isKeyword.equals(o.isKeyword);
                
                return validValue && valid;
            }
            
            return false;
        }

    }
    class Or {
        Or() {
        }

        User user;
        UserOne userOne1;

        Or(User user, UserOne userOne1) {
            this.user = user;
            this.userOne1 = userOne1;
        }

        User getUser() {
            return user;
        }

        void setUser(User user) {
            this.user = user;
        }

        UserOne getUserOne1() {
            return userOne1;
        }

        void setUserOne1(UserOne userOne1) {
            this.userOne1 = userOne1;
        }


        public boolean equals(Object obj) {
            if (obj instanceof Or) {
                Or o = (Or) obj;
                boolean valid = true;
                
                if (this.user != null &&
                    o.user != null)
                    valid = valid & this.user.equals(o.user);
                if (this.userOne1 != null &&
                    o.userOne1 != null)
                    valid = valid & this.userOne1.equals(o.userOne1);

                return valid;
            }
            
            return false;
        }

    }
    class User {
        // Existem inumeros casos que necessitam de um Operator, com excecao de quando nao houver valores
        Operator operator = new OperatorEqual();
        
        User() {
        }
        

        // List<Class> instance = new ArrayList<Class>();
        java.util.List<Name> hasName = new java.util.ArrayList<Name>();
        
        // List<Class> getInstanceQuantifierValueClass() { return instance; }
        java.util.List<Name> getHasAtLeast2Name() {
            return this.hasName; 
        }
        
        // void setInstanceQuantifierValueClass(List<Class> instance) { this.instance = instance; }
        void setHasAtLeast2Name(java.util.List<Name> hasName) {
            this.hasName = hasName;
        }
        
        // void addInstanceClass(Class instance) { this.instance.add(instance); }
        void addHasName(Name hasName) {
            this.hasName.add(hasName);
        }


        public boolean equals(Object obj) {
            if (obj instanceof User) {
                User o = (User) obj;
                boolean validValue = true;
                boolean valid = true;

                
                if (this.hasName != null &&
                    o.hasName != null)
                    valid = valid & (o.hasName.size() >= 2);

                
                return validValue && valid;
            }
            
            return false;
        }

    }
    class Name {
        // Existem inumeros casos que necessitam de um Operator, com excecao de quando nao houver valores
        Operator operator = new OperatorEqual();
        
        Name() {
        }
        


        public boolean equals(Object obj) {
            if (obj instanceof Name) {
                return true;
            }
            
            return false;
        }

    }
    class UserOne {
        // Existem inumeros casos que necessitam de um Operator, com excecao de quando nao houver valores
        Operator operator = new OperatorEqual();
        
        UserOne() {
        }
        

        // List<Class> instance = new ArrayList<Class>();
        java.util.List<Address> hasAddress = new java.util.ArrayList<Address>();
        
        // List<Class> getInstanceQuantifierValueClass() { return instance; }
        java.util.List<Address> getHasAtLeast1Address() {
            return this.hasAddress; 
        }
        
        // void setInstanceQuantifierValueClass(List<Class> instance) { this.instance = instance; }
        void setHasAtLeast1Address(java.util.List<Address> hasAddress) {
            this.hasAddress = hasAddress;
        }
        
        // void addInstanceClass(Class instance) { this.instance.add(instance); }
        void addHasAddress(Address hasAddress) {
            this.hasAddress.add(hasAddress);
        }


        public boolean equals(Object obj) {
            if (obj instanceof UserOne) {
                UserOne o = (UserOne) obj;
                boolean validValue = true;
                boolean valid = true;

                
                if (this.hasAddress != null &&
                    o.hasAddress != null)
                    valid = valid & (o.hasAddress.size() >= 1);

                
                return validValue && valid;
            }
            
            return false;
        }

    }
    class Address {
        // Existem inumeros casos que necessitam de um Operator, com excecao de quando nao houver valores
        Operator operator = new OperatorEqual();
        
        Address() {
        }
        


        public boolean equals(Object obj) {
            if (obj instanceof Address) {
                return true;
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


    // Método que será implementado e enviará os dados ao SUT
    abstract And sendToSut(TestCase testCase2);
    
    // No Matrix
    @Test
    public void test() {

        // Gera as instáncias da cláusula Verify
        And and = new And();
        TestCase testCase = new TestCase();
        Keyword keyword = new Keyword("Test");
        Keyword keyword1 = new Keyword("Verify");
        Keyword keyword2 = new Keyword("When");

        Or or = new Or();
        User user = new User();
        Name name = new Name();

        UserOne userOne1 = new UserOne();
        Address address = new Address();

        and.setTestCase(testCase);
        and.setOr(or);

         
        testCase.setContainsKeyword(keyword);

         
        keyword.setHasKeyword(keyword1);

         
        keyword1.setIsKeyword(keyword2);

        or.setUser(user);
        or.setUserOne1(userOne1);

        user.addHasName(name);


        userOne1.addHasAddress(address);

        
        // Gera as instáncias da cláusula When
        TestCase testCase2 = new TestCase();
        Statement statement = new Statement("Test One Verify User is Authenticated When User has Login 'user', Password 'pass'");


         
        testCase2.setHasStatement(statement);

        
        // Executa o método sendToSut
        And andResult = sendToSut(testCase2);
	
        // Compara os resultados com os valores esperados
        assertEquals(and, andResult);

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

