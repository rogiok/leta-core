
package leta.core.sample.generated;

import org.junit.Test;
import static org.junit.Assert.*;

public abstract class ValidacaoUsuarioTest {

    // Gera todas as classes que correspondem aos termos
    class Usuario {
        
        Usuario() {
        }
        
        // boolean instance;
        private boolean eValido = true;
        
        // boolean isInstance() { return instance; }
        boolean isEValido() {
            return this.eValido; 
        }
        
        // void setInstance(boolean instance) { this.instance = instance; }
        void setEValido(boolean eValido) {
            this.eValido = eValido;
        }
        // Class methodClass;
        private Apelido temApelido;
        
        // Class getMethodClass() { return instance; }
        Apelido getTemApelido() {
            return this.temApelido; 
        }
        
        // void setMethodClass(Class instance) { this.instance = instance; }
        void setTemApelido(Apelido temApelido) {
            this.temApelido = temApelido;
        }
        
        // Class methodClassClass(String value) { this.instance = new Class(value); }
        Apelido temApelido(String value) {
            return this.temApelido = new Apelido(value);
        }
        // Class methodClass;
        private Senha temSenha;
        
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


    }
    class Apelido {
        
        Apelido() {
        }
        
        private String sValue;

        Apelido(String value) { this.sValue = value; }
        String getStringValue() { return this.sValue; }


    }
    class Senha {
        
        Senha() {
        }
        
        private String sValue;

        Senha(String value) { this.sValue = value; }
        String getStringValue() { return this.sValue; }


    }

    
    
    // TCOutput
    class VerifyUsuarioEValido {

        private Usuario usuario = new Usuario();
        Usuario getUsuario() { return this.usuario; }

        VerifyUsuarioEValido(
            boolean value

            ) {
            this.usuario.setEValido(value);
        }
    }
    
    class TCOutput {
        private VerifyUsuarioEValido verifyUsuarioEValido;

        VerifyUsuarioEValido verifyUsuarioEValido(
                boolean value

                ) {
            return this.verifyUsuarioEValido = new
                VerifyUsuarioEValido(
                    value

                    );
        }
        VerifyUsuarioEValido verifyUsuarioEValido() {
            return this.verifyUsuarioEValido;
        }

    }

    // TCInput
    class WhenUsuarioTemApelido {

        private Usuario usuario = new Usuario();
        Usuario getUsuario() { return this.usuario; }
        private Apelido apelido = new Apelido();
        Apelido getApelido() { return this.apelido; }

        WhenUsuarioTemApelido(
            Apelido apelido

            ) {
            this.apelido = apelido;

            this.usuario.setTemApelido(this.apelido);

        }
    }

    class AndUsuarioTemSenha {

        private Usuario usuario = new Usuario();
        Usuario getUsuario() { return this.usuario; }
        private Senha senha = new Senha();
        Senha getSenha() { return this.senha; }

        AndUsuarioTemSenha(
            Senha senha

            ) {
            this.senha = senha;

            this.usuario.setTemSenha(this.senha);

        }
    }
    
    class TCInput {
        private WhenUsuarioTemApelido whenUsuarioTemApelido;

        WhenUsuarioTemApelido whenUsuarioTemApelido(
                Apelido apelido

                ) {
            return this.whenUsuarioTemApelido = new
                WhenUsuarioTemApelido(
                    apelido

                    );
        }
        WhenUsuarioTemApelido whenUsuarioTemApelido() {
            return this.whenUsuarioTemApelido;
        }

        private AndUsuarioTemSenha andUsuarioTemSenha;

        AndUsuarioTemSenha andUsuarioTemSenha(
                Senha senha

                ) {
            return this.andUsuarioTemSenha = new
                AndUsuarioTemSenha(
                    senha

                    );
        }
        AndUsuarioTemSenha andUsuarioTemSenha() {
            return this.andUsuarioTemSenha;
        }

    }


    // Método que será implementado e enviará os dados ao SUT
    abstract TCOutput sendToSut(TCInput input);
    
    // Matrix
    @Test
    public void test1() {

        // Verify
        TCOutput expected = new TCOutput();
        expected.verifyUsuarioEValido(
            true
        );

            
        // When
        TCInput input = new TCInput();
        input.whenUsuarioTemApelido(
            new Apelido("usuario1")
        );
        input.andUsuarioTemSenha(
            new Senha("senhaA")
        );

        // Executa o método sendToSut
        TCOutput result = sendToSut(input);

        // Compara os resultados com os valores esperados
        assertTrue("Valor esperado [" 
            + expected.verifyUsuarioEValido().getUsuario().isEValido() + "] - "
            + "Valor obtido ["
            + result.verifyUsuarioEValido().getUsuario().isEValido() + "]",
            OperatorEqual.compare(
                expected.verifyUsuarioEValido().getUsuario().isEValido(), 
                result.verifyUsuarioEValido().getUsuario().isEValido()
            )
        );

    }
        
    @Test
    public void test2() {

        // Verify
        TCOutput expected = new TCOutput();
        expected.verifyUsuarioEValido(
            true
        );

            
        // When
        TCInput input = new TCInput();
        input.whenUsuarioTemApelido(
            new Apelido("usuario1")
        );
        input.andUsuarioTemSenha(
            new Senha("senhaB")
        );

        // Executa o método sendToSut
        TCOutput result = sendToSut(input);

        // Compara os resultados com os valores esperados
        assertTrue("Valor esperado [" 
            + expected.verifyUsuarioEValido().getUsuario().isEValido() + "] - "
            + "Valor obtido ["
            + result.verifyUsuarioEValido().getUsuario().isEValido() + "]",
            OperatorEqual.compare(
                expected.verifyUsuarioEValido().getUsuario().isEValido(), 
                result.verifyUsuarioEValido().getUsuario().isEValido()
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

