
package leta.core.sample.generated;

import org.junit.Test;
import static org.junit.Assert.*;

public abstract class AdicionarLivroTest {

    // Gera todas as classes que correspondem aos termos
    class Cesta {
        
        Cesta() {
        }
        
        // Class methodClass;
        private Livro possuiLivro;
        
        // Class getMethodClass() { return instance; }
        Livro getPossuiLivro() {
            return this.possuiLivro; 
        }
        
        // void setMethodClass(Class instance) { this.instance = instance; }
        void setPossuiLivro(Livro possuiLivro) {
            this.possuiLivro = possuiLivro;
        }
        
        // Class methodClassClass(String value) { this.instance = new Class(value); }
        Livro possuiLivro(String value) {
            return this.possuiLivro = new Livro(value);
        }
        // Class methodClass;
        private Total temTotal;
        
        // Class getMethodClass() { return instance; }
        Total getTemTotal() {
            return this.temTotal; 
        }
        
        // void setMethodClass(Class instance) { this.instance = instance; }
        void setTemTotal(Total temTotal) {
            this.temTotal = temTotal;
        }
        
        // Class methodClassClass(String value) { this.instance = new Class(value); }
        Total temTotal(Integer value) {
            return this.temTotal = new Total(value);
        }

    }
    class Livro {
        
        Livro() {
        }
        
        private String sValue;

        Livro(String value) { this.sValue = value; }
        String getStringValue() { return this.sValue; }

        // Class methodClass;
        private Cesta eAdicinadoNaCesta;
        
        // Class getMethodClass() { return instance; }
        Cesta getEAdicinadoNaCesta() {
            return this.eAdicinadoNaCesta; 
        }
        
        // void setMethodClass(Class instance) { this.instance = instance; }
        void setEAdicinadoNaCesta(Cesta eAdicinadoNaCesta) {
            this.eAdicinadoNaCesta = eAdicinadoNaCesta;
        }
        
        // Class methodClassClass(String value) { this.instance = new Class(value); }
        Cesta eAdicinadoNaCesta() {
            return this.eAdicinadoNaCesta = new Cesta();
        }
    }
    class Total {
        
        Total() {
        }
        
        private Integer iValue;

        Total(Integer value) { this.iValue = value; }
        Integer getIntegerValue() { return this.iValue; }

    }

    
    
    // TCOutput
    class VerifyCestaPossuiLivro {

        private Cesta cesta = new Cesta();
        Cesta getCesta() { return this.cesta; }
        private Livro livro = new Livro();
        Livro getLivro() { return this.livro; }

        VerifyCestaPossuiLivro(
            Livro livro

            ) {
            this.livro = livro;

            this.cesta.setPossuiLivro(this.livro);

        }
    }

    class AndCestaTemTotal {

        private Cesta cesta = new Cesta();
        Cesta getCesta() { return this.cesta; }
        private Total total = new Total();
        Total getTotal() { return this.total; }

        AndCestaTemTotal(
            Total total

            ) {
            this.total = total;

            this.cesta.setTemTotal(this.total);

        }
    }
    
    class TCOutput {
        private VerifyCestaPossuiLivro verifyCestaPossuiLivro;

        VerifyCestaPossuiLivro verifyCestaPossuiLivro(
                Livro livro

                ) {
            return this.verifyCestaPossuiLivro = new
                VerifyCestaPossuiLivro(
                    livro

                    );
        }
        VerifyCestaPossuiLivro verifyCestaPossuiLivro() {
            return this.verifyCestaPossuiLivro;
        }

        private AndCestaTemTotal andCestaTemTotal;

        AndCestaTemTotal andCestaTemTotal(
                Total total

                ) {
            return this.andCestaTemTotal = new
                AndCestaTemTotal(
                    total

                    );
        }
        AndCestaTemTotal andCestaTemTotal() {
            return this.andCestaTemTotal;
        }

    }

    // TCInput
    class WhenLivroEAdicinadoNaCesta {

        private Livro livro = new Livro();
        Livro getLivro() { return this.livro; }
        private Cesta cesta = new Cesta();
        Cesta getCesta() { return this.cesta; }

        WhenLivroEAdicinadoNaCesta(
            Livro livro

            ) {
            this.livro = livro;

            this.livro.setEAdicinadoNaCesta(this.cesta);

        }
    }
    
    class TCInput {
        private WhenLivroEAdicinadoNaCesta whenLivroEAdicinadoNaCesta;

        WhenLivroEAdicinadoNaCesta whenLivroEAdicinadoNaCesta(
                Livro livro

                ) {
            return this.whenLivroEAdicinadoNaCesta = new
                WhenLivroEAdicinadoNaCesta(
                    livro

                    );
        }
        WhenLivroEAdicinadoNaCesta whenLivroEAdicinadoNaCesta() {
            return this.whenLivroEAdicinadoNaCesta;
        }

    }


    // Método que será implementado e enviará os dados ao SUT
    abstract TCOutput sendToSut(TCInput input);
    
    // No Matrix
    @Test
    public void test() {

        // Verify
        TCOutput expected = new TCOutput();
        expected.verifyCestaPossuiLivro(
            new Livro("Livro A")
        );
        expected.andCestaTemTotal(
            new Total(1)
        );

        
        // When
        TCInput input = new TCInput();
        input.whenLivroEAdicinadoNaCesta(
            new Livro("Livro A")
        );
        // Executa o método sendToSut
        TCOutput result = sendToSut(input);

        // Compara os resultados com os valores esperados
        assertTrue(
            OperatorEqual.compare(
                expected.verifyCestaPossuiLivro().getLivro().getStringValue(), 
                result.verifyCestaPossuiLivro().getLivro().getStringValue()
            )
        );
        assertTrue(
            OperatorEqual.compare(
                expected.andCestaTemTotal().getTotal().getIntegerValue(), 
                result.andCestaTemTotal().getTotal().getIntegerValue()
            )
        );

    }
    
    
    static abstract class Operator {
    }

    static abstract class OperatorString extends Operator {
    }

    static abstract class OperatorNumber extends Operator {
        static boolean verify(Object obj1, Object obj2) {
            return ((obj1 instanceof Integer || obj1 instanceof Double)
                && (obj2 instanceof Integer || obj2 instanceof Double));
        }
    }

    static class OperatorEqual extends OperatorString {
        static boolean compare(Object obj1, Object obj2) {
            return obj1.equals(obj2);
        }
    }

    static class OperatorNotEqual extends Operator {
        static boolean compare(Object obj1, Object obj2) {
            return !obj1.equals(obj2);
        }
    }

    static class OperatorLessThan extends OperatorNumber {
        static boolean compare(Object obj1, Object obj2) {
            if (verify(obj1, obj2))
                return ((Double) obj1).compareTo((Double) obj2) > 0;

            return false;
        }
    }

    static class OperatorEqualOrLessThan extends OperatorNumber {
        static boolean compare(Object obj1, Object obj2) {
            if (verify(obj1, obj2))
                return ((Double) obj1).compareTo((Double) obj2) >= 0;

            return false;
        }
    }

    static class OperatorMoreThan extends OperatorNumber {
        static boolean compare(Object obj1, Object obj2) {
            if (verify(obj1, obj2))
                return ((Double) obj1).compareTo((Double) obj2) < 0;
            
            return false;
        }
    }

    static class OperatorEqualOrMoreThan extends OperatorNumber {
        static boolean compare(Object obj1, Object obj2) {
            if (verify(obj1, obj2))
                return ((Double) obj1).compareTo((Double) obj2) <= 0;
           
           return false;
        }
    }
}

