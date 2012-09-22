
// Version: 0.6 - Wed May 16 00:23:25 BRT 2012
package leta.core.sample.generated;

import org.junit.Test;
import static org.junit.Assert.*;

public abstract class CartaoInvalidoTest {

    // Gera todas as classes que correspondem aos termos
    class Cartao {
        
        Cartao() {
        }
        

        // boolean instance;
        private boolean naoEValido = true;
        
        // boolean isInstance() { return instance; }
        boolean isNaoEValido() {
            return this.naoEValido; 
        }
        
        // void setInstance(boolean instance) { this.instance = instance; }
        void setNaoEValido(boolean naoEValido) {
            this.naoEValido = naoEValido;
        }
        // Class methodClass;
        private Nome temNome;
        
        // Class getMethodClass() { return instance; }
        Nome getTemNome() {
            return this.temNome; 
        }
        
        // void setMethodClass(Class instance) { this.instance = instance; }
        void setTemNome(Nome temNome) {
            this.temNome = temNome;
        }
        
        // Class methodClassClass(String value) { this.instance = new Class(value); }
        Nome temNome(String value) {
            return this.temNome = new Nome(value);
        }
        // Class methodClass;
        private Numero temNumero;
        
        // Class getMethodClass() { return instance; }
        Numero getTemNumero() {
            return this.temNumero; 
        }
        
        // void setMethodClass(Class instance) { this.instance = instance; }
        void setTemNumero(Numero temNumero) {
            this.temNumero = temNumero;
        }
        
        // Class methodClassClass(String value) { this.instance = new Class(value); }
        Numero temNumero(Integer value) {
            return this.temNumero = new Numero(value);
        }
        // Class methodClass;
        private Vencimento temVencimento;
        
        // Class getMethodClass() { return instance; }
        Vencimento getTemVencimento() {
            return this.temVencimento; 
        }
        
        // void setMethodClass(Class instance) { this.instance = instance; }
        void setTemVencimento(Vencimento temVencimento) {
            this.temVencimento = temVencimento;
        }
        
        // Class methodClassClass(String value) { this.instance = new Class(value); }
        Vencimento temVencimento(String value) {
            return this.temVencimento = new Vencimento(value);
        }


    }
    class Nome {
        
        Nome() {
        }
        
        private String sValue;

        Nome(String value) { this.sValue = value; }
        String stringValue() { return this.sValue; }


    }
    class Numero {
        
        Numero() {
        }
        
        private Integer iValue;

        Numero(Integer value) { this.iValue = value; }
        Integer intValue() { return this.iValue; }


    }
    class Vencimento {
        
        Vencimento() {
        }
        
        private String sValue;

        Vencimento(String value) { this.sValue = value; }
        String stringValue() { return this.sValue; }


    }

    
    
    // Gera as combinações de fatos para o TCOutput
    class VerifyCartaoNaoEValido {

        private Cartao cartao = new Cartao();
        Cartao getCartao() { return this.cartao; }

        VerifyCartaoNaoEValido(boolean value) {
            this.cartao.setNaoEValido(value);
        }
    }
    
    class TCOutput {
        // Gera os métodos com as combinações definidas anteriormente
        private VerifyCartaoNaoEValido verifyCartaoNaoEValido;

        VerifyCartaoNaoEValido verifyCartaoNaoEValido(boolean value) {
            return this.verifyCartaoNaoEValido = new
                VerifyCartaoNaoEValido(value);
        }
        VerifyCartaoNaoEValido verifyCartaoNaoEValido() {
            return this.verifyCartaoNaoEValido;
        }

    }

    // Gera as combinações de fatos para o TCInput
    class WhenCartaoTemNome {

        private Cartao cartao = new Cartao();
        Cartao getCartao() { return this.cartao; }
        private Nome nome = new Nome();
        Nome getNome() { return this.nome; }

        WhenCartaoTemNome(Nome nome) {
            this.nome = nome;

            this.cartao.setTemNome(this.nome);

        }
    }

    class AndCartaoTemNumero {

        private Cartao cartao = new Cartao();
        Cartao getCartao() { return this.cartao; }
        private Numero numero = new Numero();
        Numero getNumero() { return this.numero; }

        AndCartaoTemNumero(Numero numero) {
            this.numero = numero;

            this.cartao.setTemNumero(this.numero);

        }
    }

    class AndCartaoTemVencimento {

        private Cartao cartao = new Cartao();
        Cartao getCartao() { return this.cartao; }
        private Vencimento vencimento = new Vencimento();
        Vencimento getVencimento() { return this.vencimento; }

        AndCartaoTemVencimento(Vencimento vencimento) {
            this.vencimento = vencimento;

            this.cartao.setTemVencimento(this.vencimento);

        }
    }
    
    class TCInput {
        // Gera os métodos com as combinações definidas anteriormente
        private WhenCartaoTemNome whenCartaoTemNome;

        WhenCartaoTemNome whenCartaoTemNome(Nome nome) {
            return this.whenCartaoTemNome = new
                WhenCartaoTemNome(nome);
        }
        WhenCartaoTemNome whenCartaoTemNome() {
            return this.whenCartaoTemNome;
        }

        private AndCartaoTemNumero andCartaoTemNumero;

        AndCartaoTemNumero andCartaoTemNumero(Numero numero) {
            return this.andCartaoTemNumero = new
                AndCartaoTemNumero(numero);
        }
        AndCartaoTemNumero andCartaoTemNumero() {
            return this.andCartaoTemNumero;
        }

        private AndCartaoTemVencimento andCartaoTemVencimento;

        AndCartaoTemVencimento andCartaoTemVencimento(Vencimento vencimento) {
            return this.andCartaoTemVencimento = new
                AndCartaoTemVencimento(vencimento);
        }
        AndCartaoTemVencimento andCartaoTemVencimento() {
            return this.andCartaoTemVencimento;
        }

    }


    // Método que será implementado e enviará os dados ao SUT
    abstract TCOutput sendToSut(TCInput input);
    
    // No Matrix
    @Test
    public void cartaoInvalidoTest() {

        // Verify
        TCOutput expected = new TCOutput();
        expected.verifyCartaoNaoEValido(
            true
        );        
        // When
        TCInput input = new TCInput();
        input.whenCartaoTemNome(
            new Nome("João")
        );
        input.andCartaoTemNumero(
            new Numero(123)
        );

        input.andCartaoTemVencimento(
            new Vencimento("03/2015")
        );

        // Executa o método sendToSut
        TCOutput result = sendToSut(input);

        // Compara os resultados com os valores esperados
        assertTrue("Valor esperado [ " 
            + expected.verifyCartaoNaoEValido().getCartao().isNaoEValido() + "] - "
            + "Valor obtido ["
            + result.verifyCartaoNaoEValido().getCartao().isNaoEValido() + "]",
            OperatorEqual.compare(
                expected.verifyCartaoNaoEValido().getCartao().isNaoEValido(), 
                result.verifyCartaoNaoEValido().getCartao().isNaoEValido()
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
        static boolean compare(Integer obj1, Integer obj2) {
            if (verify(obj1, obj2))
                return ((Integer) obj1).compareTo((Integer) obj2) > 0;

            return false;
        }
        
        static boolean compare(Double obj1, Double obj2) {
            if (verify(obj1, obj2))
                return ((Double) obj1).compareTo((Double) obj2) > 0;

            return false;
        }
    }

    static class OperatorLessOrEqualThan extends OperatorNumber {
        static boolean compare(Integer obj1, Integer obj2) {
            if (verify(obj1, obj2))
                return ((Integer) obj1).compareTo((Integer) obj2) >= 0;

            return false;
        }
        
        static boolean compare(Double obj1, Double obj2) {
            if (verify(obj1, obj2))
                return ((Double) obj1).compareTo((Double) obj2) >= 0;

            return false;
        }
    }

    static class OperatorMoreThan extends OperatorNumber {
        static boolean compare(Integer obj1, Integer obj2) {
            if (verify(obj1, obj2))
                return ((Integer) obj1).compareTo((Integer) obj2) < 0;
            
            return false;
        }
        
        static boolean compare(Double obj1, Double obj2) {
            if (verify(obj1, obj2))
                return ((Double) obj1).compareTo((Double) obj2) < 0;
            
            return false;
        }
    }

    static class OperatorMoreOrEqualThan extends OperatorNumber {
        static boolean compare(Integer obj1, Integer obj2) {
            if (verify(obj1, obj2))
                return ((Integer) obj1).compareTo((Integer) obj2) <= 0;
           
           return false;
        }
        
        static boolean compare(Double obj1, Double obj2) {
            if (verify(obj1, obj2))
                return ((Double) obj1).compareTo((Double) obj2) <= 0;
           
           return false;
        }
    }
}

