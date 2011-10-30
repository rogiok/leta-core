package leta.core.sample.generated;

import org.junit.Test;
import static org.junit.Assert.*;

public abstract class Exemplo1Test {

    // Gera todas as classes que correspondem aos termos
    class Cartao {
        
        Cartao() {
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
        }    // boolean instance;
        private boolean ok = true;
        
        // boolean isInstance() { return instance; }
        boolean isOk() {
            return this.ok; 
        }
        
        // void setInstance(boolean instance) { this.instance = instance; }
        void setOk(boolean ok) {
            this.ok = ok;
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


    }
    class Nome {
        
        Nome() {
        }
        
        private String sValue;

        Nome(String value) { this.sValue = value; }
        String getStringValue() { return this.sValue; }

        // Class methodClass;
        private Sobrenome possuiSobrenome;
        
        // Class getMethodClass() { return instance; }
        Sobrenome getPossuiSobrenome() {
            return this.possuiSobrenome; 
        }
        
        // void setMethodClass(Class instance) { this.instance = instance; }
        void setPossuiSobrenome(Sobrenome possuiSobrenome) {
            this.possuiSobrenome = possuiSobrenome;
        }
        
        // Class methodClassClass(String value) { this.instance = new Class(value); }
        Sobrenome possuiSobrenome(String value) {
            return this.possuiSobrenome = new Sobrenome(value);
        }

    }
    class Sobrenome {
        
        Sobrenome() {
        }
        
        private String sValue;

        Sobrenome(String value) { this.sValue = value; }
        String getStringValue() { return this.sValue; }

        // boolean instance;
        private boolean abc = true;
        
        // boolean isInstance() { return instance; }
        boolean isAbc() {
            return this.abc; 
        }
        
        // void setInstance(boolean instance) { this.instance = instance; }
        void setAbc(boolean abc) {
            this.abc = abc;
        }


    }
    class Numero {
        
        Numero() {
        }
        
        private Integer iValue;

        Numero(Integer value) { this.iValue = value; }
        Integer getIntegerValue() { return this.iValue; }

    }
    class Vencimento {
        
        Vencimento() {
        }
        
        private String dtValue;
        
        Vencimento(String value) { this.dtValue = value; }
        String getDateValue() { return this.dtValue; }
    }

    
    
    // TCOutput
    class VerifyCartaoTemNomePossuiSobrenomeAbc {

        private Cartao cartao = new Cartao();
        Cartao getCartao() { return this.cartao; }
        private Nome nome = new Nome();
        Nome getNome() { return this.nome; }
        private Sobrenome sobrenome = new Sobrenome();
        Sobrenome getSobrenome() { return this.sobrenome; }

        VerifyCartaoTemNomePossuiSobrenomeAbc(
            Nome nome, 
            Sobrenome sobrenome
            , boolean value

            ) {
            this.nome = nome;
            this.sobrenome = sobrenome;

            this.cartao.setTemNome(this.nome);
            this.nome.setPossuiSobrenome(this.sobrenome);
            this.sobrenome.setAbc(value);
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

    class AndCartaoOk {

        private Cartao cartao = new Cartao();
        Cartao getCartao() { return this.cartao; }

        AndCartaoOk(
            boolean value

            ) {
            this.cartao.setOk(value);
        }
    }
    
    class TCOutput {
        private VerifyCartaoTemNomePossuiSobrenomeAbc verifyCartaoTemNomePossuiSobrenomeAbc;

        VerifyCartaoTemNomePossuiSobrenomeAbc verifyCartaoTemNomePossuiSobrenomeAbc(
                Nome nome, 
                Sobrenome sobrenome
                , boolean value

                ) {
            return this.verifyCartaoTemNomePossuiSobrenomeAbc = new
                VerifyCartaoTemNomePossuiSobrenomeAbc(
                    nome, 
                    sobrenome
                    , value

                    );
        }
        VerifyCartaoTemNomePossuiSobrenomeAbc verifyCartaoTemNomePossuiSobrenomeAbc() {
            return this.verifyCartaoTemNomePossuiSobrenomeAbc;
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

        private AndCartaoOk andCartaoOk;

        AndCartaoOk andCartaoOk(
                boolean value

                ) {
            return this.andCartaoOk = new
                AndCartaoOk(
                    value

                    );
        }
        AndCartaoOk andCartaoOk() {
            return this.andCartaoOk;
        }

    }

    // TCInput
    class WhenCartaoNaoEValido {

        private Cartao cartao = new Cartao();
        Cartao getCartao() { return this.cartao; }

        WhenCartaoNaoEValido(
            boolean value

            ) {
            this.cartao.setNaoEValido(value);
        }
    }
    
    class TCInput {
        private WhenCartaoNaoEValido whenCartaoNaoEValido;

        WhenCartaoNaoEValido whenCartaoNaoEValido(
                boolean value

                ) {
            return this.whenCartaoNaoEValido = new
                WhenCartaoNaoEValido(
                    value

                    );
        }
        WhenCartaoNaoEValido whenCartaoNaoEValido() {
            return this.whenCartaoNaoEValido;
        }

    }


    // Método que será implementado e enviará os dados ao SUT
    abstract TCOutput sendToSut(TCInput input);
    
    // No Matrix
    @Test
    public void test() {

        // Verify
        TCOutput expected = new TCOutput();
        expected.verifyCartaoTemNomePossuiSobrenomeAbc(
            new Nome("João"), 
            new Sobrenome("Silva")
            , true
        );
        expected.andCartaoTemNumero(
            new Numero(123)
        );
        expected.andCartaoTemVencimento(
            new Vencimento("[2015-03]")
        );
        expected.andCartaoOk(
            true
        );



        
        // When
        TCInput input = new TCInput();
        input.whenCartaoNaoEValido(
            true
        );
        // Executa o método sendToSut
        TCOutput result = sendToSut(input);

        // Compara os resultados com os valores esperados
        assertTrue(
            OperatorEqual.compare(
                expected.verifyCartaoTemNomePossuiSobrenomeAbc().getNome().getStringValue(), 
                result.verifyCartaoTemNomePossuiSobrenomeAbc().getNome().getStringValue()
            )
        );
        assertTrue(
            OperatorEqual.compare(
                expected.verifyCartaoTemNomePossuiSobrenomeAbc().getSobrenome().getStringValue(), 
                result.verifyCartaoTemNomePossuiSobrenomeAbc().getSobrenome().getStringValue()
            )
        );
        assertTrue(
            OperatorEqual.compare(
                expected.andCartaoTemNumero().getNumero().getIntegerValue(), 
                result.andCartaoTemNumero().getNumero().getIntegerValue()
            )
        );
        assertTrue(
            OperatorMoreThan.compare(
                expected.andCartaoTemVencimento().getVencimento().getDateValue(), 
                result.andCartaoTemVencimento().getVencimento().getDateValue()
            )
        );
        assertTrue(
            OperatorEqual.compare(
                expected.andCartaoOk().getCartao().isOk(), 
                result.andCartaoOk().getCartao().isOk()
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
