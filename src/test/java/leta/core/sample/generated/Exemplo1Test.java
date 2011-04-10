
package leta.core.sample.generated;

import org.junit.Test;
import static org.junit.Assert.*;

public abstract class Exemplo1Test {

    // Gera todas as classes que correspondem aos termos
    class Desenho {
        // Existem inumeros casos que necessitam de um Operator, com excecao de quando nao houver valores
        Operator operator = new OperatorEqual();
        
        Desenho() {
        }
        

        // boolean instance;
        boolean estaCorreto = true;
        
        // boolean isInstance() { return instance; }
        boolean isEstaCorreto() {
            return this.estaCorreto; 
        }
        
        // void setInstance(boolean instance) { this.instance = instance; }
        void setEstaCorreto(boolean estaCorreto) {
            this.estaCorreto = estaCorreto;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Desenho) {
                Desenho o = (Desenho) obj;
                boolean validValue = true;
                boolean valid = true;

                
                valid = valid & (this.isEstaCorreto() == o.isEstaCorreto());

                
                return validValue && valid;
            }
            
            return false;
        }

    }
    class And {
        And() {
        }

        Figura figura;
        And and;
        Poligono poligono1;
        Linha linha2;

        And(Figura figura, And and) {
            this.figura = figura;
            this.and = and;
        }And(Poligono poligono1, Linha linha2) {
            this.poligono1 = poligono1;
            this.linha2 = linha2;
        }

        Figura getFigura() {
            return figura;
        }

        void setFigura(Figura figura) {
            this.figura = figura;
        }

        And getAnd() {
            return and;
        }

        void setAnd(And and) {
            this.and = and;
        }

        Poligono getPoligono1() {
            return poligono1;
        }

        void setPoligono1(Poligono poligono1) {
            this.poligono1 = poligono1;
        }

        Linha getLinha2() {
            return linha2;
        }

        void setLinha2(Linha linha2) {
            this.linha2 = linha2;
        }


        public boolean equals(Object obj) {
            if (obj instanceof And) {
                And o = (And) obj;
                boolean valid = true;
                
                if (this.figura != null &&
                    o.figura != null)
                    valid = valid & this.figura.equals(o.figura);
                if (this.and != null &&
                    o.and != null)
                    valid = valid & this.and.equals(o.and);
                if (this.poligono1 != null &&
                    o.poligono1 != null)
                    valid = valid & this.poligono1.equals(o.poligono1);
                if (this.linha2 != null &&
                    o.linha2 != null)
                    valid = valid & this.linha2.equals(o.linha2);

                return valid;
            }
            
            return false;
        }

    }
    class Figura {
        // Existem inumeros casos que necessitam de um Operator, com excecao de quando nao houver valores
        Operator operator = new OperatorEqual();
        
        Figura() {
        }
        

    	// Class methodClass;
    	Poligono formadaPorPoligono;
    	
    	// Class getMethodClass() { return instance; }
    	Poligono getFormadaPorPoligono() {
    	    return this.formadaPorPoligono; 
    	}
    	
    	// void setMethodClass(Class instance) { this.instance = instance; }
    	void setFormadaPorPoligono(Poligono formadaPorPoligono) {
    	    this.formadaPorPoligono = formadaPorPoligono;
    	}
    	
    	// Class methodClassClass(String value) { this.instance = new Class(value); }
        Poligono formadaPorPoligono() {
            return this.formadaPorPoligono = new Poligono();
        }
        public boolean equals(Object obj) {
            if (obj instanceof Figura) {
                Figura o = (Figura) obj;
                boolean validValue = true;
                boolean valid = true;

                
                if (this.formadaPorPoligono != null &&
                    o.formadaPorPoligono != null)
                    valid = valid & this.formadaPorPoligono.equals(o.formadaPorPoligono);
                
                return validValue && valid;
            }
            
            return false;
        }

    }
    class Poligono {
        // Existem inumeros casos que necessitam de um Operator, com excecao de quando nao houver valores
        Operator operator = new OperatorEqual();
        
        Poligono() {
        }
        

    	// Class methodClass;
    	Linha consisteDeLinha;
    	
    	// Class getMethodClass() { return instance; }
    	Linha getConsisteDeLinha() {
    	    return this.consisteDeLinha; 
    	}
    	
    	// void setMethodClass(Class instance) { this.instance = instance; }
    	void setConsisteDeLinha(Linha consisteDeLinha) {
    	    this.consisteDeLinha = consisteDeLinha;
    	}
    	
    	// Class methodClassClass(String value) { this.instance = new Class(value); }
        Linha consisteDeLinha() {
            return this.consisteDeLinha = new Linha();
        }
        public boolean equals(Object obj) {
            if (obj instanceof Poligono) {
                Poligono o = (Poligono) obj;
                boolean validValue = true;
                boolean valid = true;

                
                if (this.consisteDeLinha != null &&
                    o.consisteDeLinha != null)
                    valid = valid & this.consisteDeLinha.equals(o.consisteDeLinha);
                
                return validValue && valid;
            }
            
            return false;
        }

    }
    class Linha {
        // Existem inumeros casos que necessitam de um Operator, com excecao de quando nao houver valores
        Operator operator = new OperatorEqual();
        
        Linha() {
        }
        

    	// Class methodClass;
    	Ponto possuiPonto;
    	
    	// Class getMethodClass() { return instance; }
    	Ponto getPossuiPonto() {
    	    return this.possuiPonto; 
    	}
    	
    	// void setMethodClass(Class instance) { this.instance = instance; }
    	void setPossuiPonto(Ponto possuiPonto) {
    	    this.possuiPonto = possuiPonto;
    	}
    	
    	// Class methodClassClass(String value) { this.instance = new Class(value); }
        Ponto possuiPonto() {
            return this.possuiPonto = new Ponto();
        }
        public boolean equals(Object obj) {
            if (obj instanceof Linha) {
                Linha o = (Linha) obj;
                boolean validValue = true;
                boolean valid = true;

                
                if (this.possuiPonto != null &&
                    o.possuiPonto != null)
                    valid = valid & this.possuiPonto.equals(o.possuiPonto);
                
                return validValue && valid;
            }
            
            return false;
        }

    }
    class Ponto {
        // Existem inumeros casos que necessitam de um Operator, com excecao de quando nao houver valores
        Operator operator = new OperatorEqual();
        
        Ponto() {
        }
        


        public boolean equals(Object obj) {
            if (obj instanceof Ponto) {
                return true;
            }
            
            return false;
        }

    }


    // Método que será implementado e enviará os dados ao SUT
    abstract Desenho sendToSut(And and1);
    
    // No Matrix
    @Test
    public void test() {

        // Gera as instáncias da cláusula Verify
        Desenho desenho1 = new Desenho();


        
        // Gera as instáncias da cláusula When
        And and1 = new And();
        Figura figura = new Figura();
        Poligono poligono = new Poligono();

        And and = new And();
        Poligono poligono1 = new Poligono();
        Linha linha = new Linha();

        Linha linha2 = new Linha();
        Ponto ponto = new Ponto();

        and1.setFigura(figura);
        and1.setAnd(and);

         
        figura.setFormadaPorPoligono(poligono);

        and.setPoligono1(poligono1);
        and.setLinha2(linha2);

         
        poligono1.setConsisteDeLinha(linha);


         
        linha2.setPossuiPonto(ponto);

        
        // Executa o método sendToSut
        Desenho desenho1Result = sendToSut(and1);
	
        // Compara os resultados com os valores esperados
        assertEquals(desenho1, desenho1Result);

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

