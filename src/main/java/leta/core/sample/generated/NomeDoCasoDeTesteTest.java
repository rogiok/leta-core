
package leta.core.sample.generated;

import org.junit.Test;
import static org.junit.Assert.*;

public abstract class NomeDoCasoDeTesteTest {

    // Gera todas as classes que correspondem aos termos
    class Usuario {
        // Existem inumeros casos que necessitam de um Operator, com excecao de quando nao houver valores
        Operator operator = new OperatorEqual();
        
        Usuario() {
        }
        

        // boolean instance;
        boolean eValido = true;
        
        // boolean isInstance() { return instance; }
        boolean isEValido() {
            return this.eValido; 
        }
        
        // void setInstance(boolean instance) { this.instance = instance; }
        void setEValido(boolean eValido) {
            this.eValido = eValido;
        }	// Class methodClass;
    	Email temEmail;
    	
    	// Class getMethodClass() { return instance; }
    	Email getTemEmail() {
    	    return this.temEmail; 
    	}
    	
    	// void setMethodClass(Class instance) { this.instance = instance; }
    	void setTemEmail(Email temEmail) {
    	    this.temEmail = temEmail;
    	}
    	
    	// Class methodClassClass(String value) { this.instance = new Class(value); }
    	Email temEmail(String value) {
            return this.temEmail = new Email(value);
    	}
    	// Class methodClass;
    	Senha temSenha;
    	
    	// Class getMethodClass() { return instance; }
    	Senha getTemSenha() {
    	    return this.temSenha; 
    	}
    	
    	// void setMethodClass(Class instance) { this.instance = instance; }
    	void setTemSenha(Senha temSenha) {
    	    this.temSenha = temSenha;
    	}
    	
    	// Class methodClassClass(String value) { this.instance = new Class(value); }
    	Senha temSenha(String value) {
            return this.temSenha = new Senha(value);
    	}


        public boolean equals(Object obj) {
            if (obj instanceof Usuario) {
                Usuario o = (Usuario) obj;
                boolean validValue = true;
                boolean valid = true;

                
                valid = valid & (this.isEValido() == o.isEValido());
                if (this.temEmail != null &&
                    o.temEmail != null)
                    valid = valid & this.temEmail.equals(o.temEmail);
                if (this.temSenha != null &&
                    o.temSenha != null)
                    valid = valid & this.temSenha.equals(o.temSenha);

                
                return validValue && valid;
            }
            
            return false;
        }

    }
    class And {
        And() {
        }

        Usuario usuario2;
        Usuario usuario4;

        And(Usuario usuario2, Usuario usuario4) {
            this.usuario2 = usuario2;
            this.usuario4 = usuario4;
        }

        Usuario getUsuario2() {
            return usuario2;
        }

        void setUsuario2(Usuario usuario2) {
            this.usuario2 = usuario2;
        }

        Usuario getUsuario4() {
            return usuario4;
        }

        void setUsuario4(Usuario usuario4) {
            this.usuario4 = usuario4;
        }


        public boolean equals(Object obj) {
            if (obj instanceof And) {
                And o = (And) obj;
                boolean valid = true;
                
                if (this.usuario2 != null &&
                    o.usuario2 != null)
                    valid = valid & this.usuario2.equals(o.usuario2);
                if (this.usuario4 != null &&
                    o.usuario4 != null)
                    valid = valid & this.usuario4.equals(o.usuario4);

                return valid;
            }
            
            return false;
        }

    }
    class Email {
        // Existem inumeros casos que necessitam de um Operator, com excecao de quando nao houver valores
        Operator operator = new OperatorEqual();
        
        Email() {
        }
        
        String sValue;

        Email(String value) { this.sValue = value; }
        String getStringValue() { return this.sValue; }


        public boolean equals(Object obj) {
            if (obj instanceof Email) {
                return true;
            }
            
            return false;
        }

    }
    class Senha {
        // Existem inumeros casos que necessitam de um Operator, com excecao de quando nao houver valores
        Operator operator = new OperatorEqual();
        
        Senha() {
        }
        
        String sValue;

        Senha(String value) { this.sValue = value; }
        String getStringValue() { return this.sValue; }


        public boolean equals(Object obj) {
            if (obj instanceof Senha) {
                return true;
            }
            
            return false;
        }

    }


    // Método que será implementado e enviará os dados ao SUT
    abstract Usuario sendToSut(And and);
    
    // No Matrix
    @Test
    public void test() {

        // Gera as instáncias da cláusula Verify
        Usuario usuario1 = new Usuario();


        
        // Gera as instáncias da cláusula When
        And and = new And();
        Usuario usuario2 = new Usuario();
        Email email = new Email("usuario@dominio.com.br");

        Usuario usuario4 = new Usuario();
        Senha senha = new Senha("usuario123");

        and.setUsuario2(usuario2);
        and.setUsuario4(usuario4);

         
        usuario2.setTemEmail(email);


         
        usuario4.setTemSenha(senha);

        
        // Executa o método sendToSut
        Usuario usuario1Result = sendToSut(and);
	
        // Compara os resultados com os valores esperados
        assertEquals(usuario1, usuario1Result);

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

