
package leta.core.sample.generated;

import org.junit.Test;
import static org.junit.Assert.*;

public abstract class MudarQuantidadeDeUmLivroTest {

    // Gera todas as classes que correspondem aos termos
    class Cesta {
        
        Cesta() {
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
        // Class methodClass;
        private Livro temLivro;
        
        // Class getMethodClass() { return instance; }
        Livro getTemLivro() {
            return this.temLivro; 
        }
        
        // void setMethodClass(Class instance) { this.instance = instance; }
        void setTemLivro(Livro temLivro) {
            this.temLivro = temLivro;
        }
        
        // Class methodClassClass(String value) { this.instance = new Class(value); }
        Livro temLivro(String value) {
            return this.temLivro = new Livro(value);
        }

    }
    class Total {
        
        Total() {
        }
        
        private Integer iValue;

        Total(Integer value) { this.iValue = value; }
        Integer getIntegerValue() { return this.iValue; }

    }
    class Livro {
        
        Livro() {
        }
        
        private String sValue;

        Livro(String value) { this.sValue = value; }
        String getStringValue() { return this.sValue; }

        // Class methodClass;
        private Quantidade possuiQuantidade;
        
        // Class getMethodClass() { return instance; }
        Quantidade getPossuiQuantidade() {
            return this.possuiQuantidade; 
        }
        
        // void setMethodClass(Class instance) { this.instance = instance; }
        void setPossuiQuantidade(Quantidade possuiQuantidade) {
            this.possuiQuantidade = possuiQuantidade;
        }
        
        // Class methodClassClass(String value) { this.instance = new Class(value); }
        Quantidade possuiQuantidade(Integer value) {
            return this.possuiQuantidade = new Quantidade(value);
        }

    }
    class Quantidade {
        
        Quantidade() {
        }
        
        private Integer iValue;

        Quantidade(Integer value) { this.iValue = value; }
        Integer getIntegerValue() { return this.iValue; }

    }

    
    
    // TCOutput
    class VerifyCestaTemTotal {

        private Cesta cesta = new Cesta();
        Cesta getCesta() { return this.cesta; }
        private Total total = new Total();
        Total getTotal() { return this.total; }

        VerifyCestaTemTotal(
            Total total

            ) {
            this.total = total;

            this.cesta.setTemTotal(this.total);

        }
    }

    class AndCestaTemLivro {

        private Cesta cesta = new Cesta();
        Cesta getCesta() { return this.cesta; }
        private Livro livro = new Livro();
        Livro getLivro() { return this.livro; }

        AndCestaTemLivro(
            Livro livro

            ) {
            this.livro = livro;

            this.cesta.setTemLivro(this.livro);

        }
    }
    
    class TCOutput {
        private VerifyCestaTemTotal verifyCestaTemTotal;

        VerifyCestaTemTotal verifyCestaTemTotal(
                Total total

                ) {
            return this.verifyCestaTemTotal = new
                VerifyCestaTemTotal(
                    total

                    );
        }
        VerifyCestaTemTotal verifyCestaTemTotal() {
            return this.verifyCestaTemTotal;
        }

        private AndCestaTemLivro andCestaTemLivro;

        AndCestaTemLivro andCestaTemLivro(
                Livro livro

                ) {
            return this.andCestaTemLivro = new
                AndCestaTemLivro(
                    livro

                    );
        }
        AndCestaTemLivro andCestaTemLivro() {
            return this.andCestaTemLivro;
        }

    }

    // TCInput
    class WhenLivroPossuiQuantidade {

        private Livro livro = new Livro();
        Livro getLivro() { return this.livro; }
        private Quantidade quantidade = new Quantidade();
        Quantidade getQuantidade() { return this.quantidade; }

        WhenLivroPossuiQuantidade(
            Livro livro, 
            Quantidade quantidade

            ) {
            this.livro = livro;
            this.quantidade = quantidade;

            this.livro.setPossuiQuantidade(this.quantidade);

        }
    }
    
    class TCInput {
        private WhenLivroPossuiQuantidade whenLivroPossuiQuantidade;

        WhenLivroPossuiQuantidade whenLivroPossuiQuantidade(
                Livro livro, 
                Quantidade quantidade

                ) {
            return this.whenLivroPossuiQuantidade = new
                WhenLivroPossuiQuantidade(
                    livro, 
                    quantidade

                    );
        }
        WhenLivroPossuiQuantidade whenLivroPossuiQuantidade() {
            return this.whenLivroPossuiQuantidade;
        }

    }


    // Método que será implementado e enviará os dados ao SUT
    abstract TCOutput sendToSut(TCInput input);
    
    // Matrix
    @Test
    void test1() {

        // Verify
        TCOutput expected = new TCOutput();
        expected.verifyCestaTemTotal(
            new Total(10)
        );
        expected.andCestaTemLivro(
            new Livro("Livro A")
        );

            
        // When
        TCInput input = new TCInput();
        input.whenLivroPossuiQuantidade(
            new Livro("Livro A"), 
            new Quantidade(10)
        );
        // Executa o método sendToSut
        TCOutput result = sendToSut(input);

        // Compara os resultados com os valores esperados
        assertTrue(
            OperatorEqual.compare(
                expected.verifyCestaTemTotal().getTotal().getIntegerValue(), 
                result.verifyCestaTemTotal().getTotal().getIntegerValue()
            )
        );
        assertTrue(
            OperatorEqual.compare(
                expected.andCestaTemLivro().getLivro().getStringValue(), 
                result.andCestaTemLivro().getLivro().getStringValue()
            )
        );

    }
        
    @Test
    void test2() {

        // Verify
        TCOutput expected = new TCOutput();
        expected.verifyCestaTemTotal(
            new Total(20)
        );
        expected.andCestaTemLivro(
            new Livro("Livro A")
        );

            
        // When
        TCInput input = new TCInput();
        input.whenLivroPossuiQuantidade(
            new Livro("Livro A"), 
            new Quantidade(20)
        );
        // Executa o método sendToSut
        TCOutput result = sendToSut(input);

        // Compara os resultados com os valores esperados
        assertTrue(
            OperatorEqual.compare(
                expected.verifyCestaTemTotal().getTotal().getIntegerValue(), 
                result.verifyCestaTemTotal().getTotal().getIntegerValue()
            )
        );
        assertTrue(
            OperatorEqual.compare(
                expected.andCestaTemLivro().getLivro().getStringValue(), 
                result.andCestaTemLivro().getLivro().getStringValue()
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

