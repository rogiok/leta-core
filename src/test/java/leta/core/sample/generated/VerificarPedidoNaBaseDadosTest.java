
package leta.core.sample.generated;

import org.junit.Test;
import static org.junit.Assert.*;

public abstract class VerificarPedidoNaBaseDadosTest {

    // Gera todas as classes que correspondem aos termos
    class Pedido {
        
        Pedido() {
        }
        
        // boolean instance;
        private boolean estaNaBaseDados = true;
        
        // boolean isInstance() { return instance; }
        boolean isEstaNaBaseDados() {
            return this.estaNaBaseDados; 
        }
        
        // void setInstance(boolean instance) { this.instance = instance; }
        void setEstaNaBaseDados(boolean estaNaBaseDados) {
            this.estaNaBaseDados = estaNaBaseDados;
        }
        // boolean instance;
        private boolean eRealizadaPeloSite = true;
        
        // boolean isInstance() { return instance; }
        boolean isERealizadaPeloSite() {
            return this.eRealizadaPeloSite; 
        }
        
        // void setInstance(boolean instance) { this.instance = instance; }
        void setERealizadaPeloSite(boolean eRealizadaPeloSite) {
            this.eRealizadaPeloSite = eRealizadaPeloSite;
        }
        // Class methodClass;
        private Numero comNumero;
        
        // Class getMethodClass() { return instance; }
        Numero getComNumero() {
            return this.comNumero; 
        }
        
        // void setMethodClass(Class instance) { this.instance = instance; }
        void setComNumero(Numero comNumero) {
            this.comNumero = comNumero;
        }
        
        // Class methodClassClass(String value) { this.instance = new Class(value); }
        Numero comNumero(Integer value) {
            return this.comNumero = new Numero(value);
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
    class Numero {
        
        Numero() {
        }
        
        private Integer iValue;

        Numero(Integer value) { this.iValue = value; }
        Integer getIntegerValue() { return this.iValue; }

    }
    class Livro {
        
        Livro() {
        }
        
        private String sValue;

        Livro(String value) { this.sValue = value; }
        String getStringValue() { return this.sValue; }

        // Class methodClass;
        private Codigo temCodigo;
        
        // Class getMethodClass() { return instance; }
        Codigo getTemCodigo() {
            return this.temCodigo; 
        }
        
        // void setMethodClass(Class instance) { this.instance = instance; }
        void setTemCodigo(Codigo temCodigo) {
            this.temCodigo = temCodigo;
        }
        
        // Class methodClassClass(String value) { this.instance = new Class(value); }
        Codigo temCodigo(Integer value) {
            return this.temCodigo = new Codigo(value);
        }

    }
    class Codigo {
        
        Codigo() {
        }
        
        private Integer iValue;

        Codigo(Integer value) { this.iValue = value; }
        Integer getIntegerValue() { return this.iValue; }

    }

    
    
    // TCOutput
    class VerifyPedidoEstaNaBaseDados {

        private Pedido pedido = new Pedido();
        Pedido getPedido() { return this.pedido; }

        VerifyPedidoEstaNaBaseDados(
            boolean value

            ) {
            this.pedido.setEstaNaBaseDados(value);
        }
    }
    
    class TCOutput {
        private VerifyPedidoEstaNaBaseDados verifyPedidoEstaNaBaseDados;

        VerifyPedidoEstaNaBaseDados verifyPedidoEstaNaBaseDados(
                boolean value

                ) {
            return this.verifyPedidoEstaNaBaseDados = new
                VerifyPedidoEstaNaBaseDados(
                    value

                    );
        }
        VerifyPedidoEstaNaBaseDados verifyPedidoEstaNaBaseDados() {
            return this.verifyPedidoEstaNaBaseDados;
        }

    }

    // TCInput
    class WhenPedidoERealizadaPeloSite {

        private Pedido pedido = new Pedido();
        Pedido getPedido() { return this.pedido; }

        WhenPedidoERealizadaPeloSite(
            boolean value

            ) {
            this.pedido.setERealizadaPeloSite(value);
        }
    }

    class AndPedidoComNumero {

        private Pedido pedido = new Pedido();
        Pedido getPedido() { return this.pedido; }
        private Numero numero = new Numero();
        Numero getNumero() { return this.numero; }

        AndPedidoComNumero(
            Numero numero

            ) {
            this.numero = numero;

            this.pedido.setComNumero(this.numero);

        }
    }

    class AndPedidoTemLivro {

        private Pedido pedido = new Pedido();
        Pedido getPedido() { return this.pedido; }
        private Livro livro = new Livro();
        Livro getLivro() { return this.livro; }

        AndPedidoTemLivro(
            Livro livro

            ) {
            this.livro = livro;

            this.pedido.setTemLivro(this.livro);

        }
    }

    class AndLivroTemCodigo {

        private Livro livro = new Livro();
        Livro getLivro() { return this.livro; }
        private Codigo codigo = new Codigo();
        Codigo getCodigo() { return this.codigo; }

        AndLivroTemCodigo(
            Codigo codigo

            ) {
            this.codigo = codigo;

            this.livro.setTemCodigo(this.codigo);

        }
    }
    
    class TCInput {
        private WhenPedidoERealizadaPeloSite whenPedidoERealizadaPeloSite;

        WhenPedidoERealizadaPeloSite whenPedidoERealizadaPeloSite(
                boolean value

                ) {
            return this.whenPedidoERealizadaPeloSite = new
                WhenPedidoERealizadaPeloSite(
                    value

                    );
        }
        WhenPedidoERealizadaPeloSite whenPedidoERealizadaPeloSite() {
            return this.whenPedidoERealizadaPeloSite;
        }

        private AndPedidoComNumero andPedidoComNumero;

        AndPedidoComNumero andPedidoComNumero(
                Numero numero

                ) {
            return this.andPedidoComNumero = new
                AndPedidoComNumero(
                    numero

                    );
        }
        AndPedidoComNumero andPedidoComNumero() {
            return this.andPedidoComNumero;
        }

        private AndPedidoTemLivro andPedidoTemLivro;

        AndPedidoTemLivro andPedidoTemLivro(
                Livro livro

                ) {
            return this.andPedidoTemLivro = new
                AndPedidoTemLivro(
                    livro

                    );
        }
        AndPedidoTemLivro andPedidoTemLivro() {
            return this.andPedidoTemLivro;
        }

        private AndLivroTemCodigo andLivroTemCodigo;

        AndLivroTemCodigo andLivroTemCodigo(
                Codigo codigo

                ) {
            return this.andLivroTemCodigo = new
                AndLivroTemCodigo(
                    codigo

                    );
        }
        AndLivroTemCodigo andLivroTemCodigo() {
            return this.andLivroTemCodigo;
        }

    }


    // Método que será implementado e enviará os dados ao SUT
    abstract TCOutput sendToSut(TCInput input);
    
    // No Matrix
    @Test
    public void test() {

        // Verify
        TCOutput expected = new TCOutput();
        expected.verifyPedidoEstaNaBaseDados(
            true
        );

        
        // When
        TCInput input = new TCInput();
        input.whenPedidoERealizadaPeloSite(
            true
        );
        input.andPedidoComNumero(
            new Numero(1000)
        );
        input.andPedidoTemLivro(
            new Livro("Livro A")
        );
        input.andLivroTemCodigo(
            new Codigo(10)
        );



        // Executa o método sendToSut
        TCOutput result = sendToSut(input);

        // Compara os resultados com os valores esperados
        assertTrue(
            OperatorEqual.compare(
                expected.verifyPedidoEstaNaBaseDados().getPedido().isEstaNaBaseDados(), 
                result.verifyPedidoEstaNaBaseDados().getPedido().isEstaNaBaseDados()
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

