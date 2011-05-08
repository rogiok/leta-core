
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
        private Tipo temTipo;
        
        // Class getMethodClass() { return instance; }
        Tipo getTemTipo() {
            return this.temTipo; 
        }
        
        // void setMethodClass(Class instance) { this.instance = instance; }
        void setTemTipo(Tipo temTipo) {
            this.temTipo = temTipo;
        }
        
        // Class methodClassClass(String value) { this.instance = new Class(value); }
        Tipo temTipo(String value) {
            return this.temTipo = new Tipo(value);
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
        Numero temNumero(String value) {
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
        String getStringValue() { return this.sValue; }


    }
    class Tipo {
        
        Tipo() {
        }
        
        private String sValue;

        Tipo(String value) { this.sValue = value; }
        String getStringValue() { return this.sValue; }


    }
    class Numero {
        
        Numero() {
        }
        
        private String sValue;

        Numero(String value) { this.sValue = value; }
        String getStringValue() { return this.sValue; }


    }
    class Vencimento {
        
        Vencimento() {
        }
        
        private String dtValue;
        
        Vencimento(String value) { this.dtValue = value; }
        String getDateValue() { return this.dtValue; }
    }

    
    
    // TCOutput
    class VerifyCartaoNaoEValido {

        private Cartao cartao = new Cartao();
        Cartao getCartao() { return this.cartao; }

        VerifyCartaoNaoEValido(
            boolean value

            ) {
            this.cartao.setNaoEValido(value);
        }
    }
    
    class TCOutput {
        private VerifyCartaoNaoEValido verifyCartaoNaoEValido;

        VerifyCartaoNaoEValido verifyCartaoNaoEValido(
                boolean value

                ) {
            return this.verifyCartaoNaoEValido = new
                VerifyCartaoNaoEValido(
                    value

                    );
        }
        VerifyCartaoNaoEValido verifyCartaoNaoEValido() {
            return this.verifyCartaoNaoEValido;
        }

    }

    // TCInput
    class WhenCartaoTemNome {

        private Cartao cartao = new Cartao();
        Cartao getCartao() { return this.cartao; }
        private Nome nome = new Nome();
        Nome getNome() { return this.nome; }

        WhenCartaoTemNome(
            Nome nome

            ) {
            this.nome = nome;

            this.cartao.setTemNome(this.nome);

        }
    }

    class AndCartaoTemTipo {

        private Cartao cartao = new Cartao();
        Cartao getCartao() { return this.cartao; }
        private Tipo tipo = new Tipo();
        Tipo getTipo() { return this.tipo; }

        AndCartaoTemTipo(
            Tipo tipo

            ) {
            this.tipo = tipo;

            this.cartao.setTemTipo(this.tipo);

        }
    }

    class AndCartaoTemNumero {

        private Cartao cartao = new Cartao();
        Cartao getCartao() { return this.cartao; }
        private Numero numero = new Numero();
        Numero getNumero() { return this.numero; }

        AndCartaoTemNumero(
            Numero numero

            ) {
            this.numero = numero;

            this.cartao.setTemNumero(this.numero);

        }
    }

    class AndCartaoTemVencimento {

        private Cartao cartao = new Cartao();
        Cartao getCartao() { return this.cartao; }
        private Vencimento vencimento = new Vencimento();
        Vencimento getVencimento() { return this.vencimento; }

        AndCartaoTemVencimento(
            Vencimento vencimento

            ) {
            this.vencimento = vencimento;

            this.cartao.setTemVencimento(this.vencimento);

        }
    }
    
    class TCInput {
        private WhenCartaoTemNome whenCartaoTemNome;

        WhenCartaoTemNome whenCartaoTemNome(
                Nome nome

                ) {
            return this.whenCartaoTemNome = new
                WhenCartaoTemNome(
                    nome

                    );
        }
        WhenCartaoTemNome whenCartaoTemNome() {
            return this.whenCartaoTemNome;
        }

        private AndCartaoTemTipo andCartaoTemTipo;

        AndCartaoTemTipo andCartaoTemTipo(
                Tipo tipo

                ) {
            return this.andCartaoTemTipo = new
                AndCartaoTemTipo(
                    tipo

                    );
        }
        AndCartaoTemTipo andCartaoTemTipo() {
            return this.andCartaoTemTipo;
        }

        private AndCartaoTemNumero andCartaoTemNumero;

        AndCartaoTemNumero andCartaoTemNumero(
                Numero numero

                ) {
            return this.andCartaoTemNumero = new
                AndCartaoTemNumero(
                    numero

                    );
        }
        AndCartaoTemNumero andCartaoTemNumero() {
            return this.andCartaoTemNumero;
        }

        private AndCartaoTemVencimento andCartaoTemVencimento;

        AndCartaoTemVencimento andCartaoTemVencimento(
                Vencimento vencimento

                ) {
            return this.andCartaoTemVencimento = new
                AndCartaoTemVencimento(
                    vencimento

                    );
        }
        AndCartaoTemVencimento andCartaoTemVencimento() {
            return this.andCartaoTemVencimento;
        }

    }


    // Método que será implementado e enviará os dados ao SUT
    abstract TCOutput sendToSut(TCInput input);
    
    // No Matrix
    @Test
    public void test() {

        // Verify
        TCOutput expected = new TCOutput();
        expected.verifyCartaoNaoEValido(
            true
        );

        
        // When
        TCInput input = new TCInput();
        input.whenCartaoTemNome(
            new Nome("João Silva")
        );
        input.andCartaoTemTipo(
            new Tipo("American Express")
        );
        input.andCartaoTemNumero(
            new Numero("344168608834057")
        );
        input.andCartaoTemVencimento(
            new Vencimento("[2015-03]")
        );



        // Executa o método sendToSut
        TCOutput result = sendToSut(input);

        // Compara os resultados com os valores esperados
        assertTrue(
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
        static boolean compare(Object obj1, Object obj2) {
            if (verify(obj1, obj2))
                return ((Double) obj1).compareTo((Double) obj2) > 0;

            return false;
        }
    }

    static class OperatorLessOrEqualThan extends OperatorNumber {
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

    static class OperatorMoreOrEqualThan extends OperatorNumber {
        static boolean compare(Object obj1, Object obj2) {
            if (verify(obj1, obj2))
                return ((Double) obj1).compareTo((Double) obj2) <= 0;
           
           return false;
        }
    }
}

