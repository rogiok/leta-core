
package leta.core.sample.generated;

import org.junit.Test;
import static org.junit.Assert.*;

public abstract class DescontoCompraTest {

    // Gera todas as classes que correspondem aos termos
    class Pedido {
        
        Pedido() {
        }
        
        // Class methodClass;
        private Desconto temDesconto;
        
        // Class getMethodClass() { return instance; }
        Desconto getTemDesconto() {
            return this.temDesconto; 
        }
        
        // void setMethodClass(Class instance) { this.instance = instance; }
        void setTemDesconto(Desconto temDesconto) {
            this.temDesconto = temDesconto;
        }
        
        // Class methodClassClass(String value) { this.instance = new Class(value); }
        Desconto temDesconto(Integer value) {
            return this.temDesconto = new Desconto(value);
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
    class Desconto {
        
        Desconto() {
        }
        
        private Integer iValue;

        Desconto(Integer value) { this.iValue = value; }
        Integer getIntegerValue() { return this.iValue; }

    }
    class Total {
        
        Total() {
        }
        
        private Integer iValue;

        Total(Integer value) { this.iValue = value; }
        Integer getIntegerValue() { return this.iValue; }

    }

    
    
    // TCOutput
    class VerifyPedidoTemDesconto {

        private Pedido pedido = new Pedido();
        Pedido getPedido() { return this.pedido; }
        private Desconto desconto = new Desconto();
        Desconto getDesconto() { return this.desconto; }

        VerifyPedidoTemDesconto(
            Desconto desconto

            ) {
            this.desconto = desconto;

            this.pedido.setTemDesconto(this.desconto);

        }
    }
    
    class TCOutput {
        private VerifyPedidoTemDesconto verifyPedidoTemDesconto;

        VerifyPedidoTemDesconto verifyPedidoTemDesconto(
                Desconto desconto

                ) {
            return this.verifyPedidoTemDesconto = new
                VerifyPedidoTemDesconto(
                    desconto

                    );
        }
        VerifyPedidoTemDesconto verifyPedidoTemDesconto() {
            return this.verifyPedidoTemDesconto;
        }

    }

    // TCInput
    class WhenPedidoTemTotal {

        private Pedido pedido = new Pedido();
        Pedido getPedido() { return this.pedido; }
        private Total total = new Total();
        Total getTotal() { return this.total; }

        WhenPedidoTemTotal(
            Total total

            ) {
            this.total = total;

            this.pedido.setTemTotal(this.total);

        }
    }
    
    class TCInput {
        private WhenPedidoTemTotal whenPedidoTemTotal;

        WhenPedidoTemTotal whenPedidoTemTotal(
                Total total

                ) {
            return this.whenPedidoTemTotal = new
                WhenPedidoTemTotal(
                    total

                    );
        }
        WhenPedidoTemTotal whenPedidoTemTotal() {
            return this.whenPedidoTemTotal;
        }

    }


    // Método que será implementado e enviará os dados ao SUT
    abstract TCOutput sendToSut(TCInput input);
    
    // Matrix
    @Test
    public void test1() {

        // Verify
        TCOutput expected = new TCOutput();
        expected.verifyPedidoTemDesconto(
            new Desconto(10)
        );

        // When
        TCInput input = new TCInput();
        input.whenPedidoTemTotal(
            new Total(100)
        );
        // Executa o método sendToSut
        TCOutput result = sendToSut(input);

        // Compara os resultados com os valores esperados
        assertTrue("Valor esperado [MoreOrEqualThan " 
            + expected.verifyPedidoTemDesconto().getDesconto().getIntegerValue() + "] - "
            + "Valor obtido ["
            + result.verifyPedidoTemDesconto().getDesconto().getIntegerValue() + "]",
            OperatorMoreOrEqualThan.compare(
                expected.verifyPedidoTemDesconto().getDesconto().getIntegerValue(), 
                result.verifyPedidoTemDesconto().getDesconto().getIntegerValue()
            )
        );

    }
        
    @Test
    public void test2() {

        // Verify
        TCOutput expected = new TCOutput();
        expected.verifyPedidoTemDesconto(
            new Desconto(11)
        );

            
        // When
        TCInput input = new TCInput();
        input.whenPedidoTemTotal(
            new Total(100)
        );
        // Executa o método sendToSut
        TCOutput result = sendToSut(input);

        // Compara os resultados com os valores esperados
        assertTrue("Valor esperado [MoreOrEqualThan " 
            + expected.verifyPedidoTemDesconto().getDesconto().getIntegerValue() + "] - "
            + "Valor obtido ["
            + result.verifyPedidoTemDesconto().getDesconto().getIntegerValue() + "]",
            OperatorMoreOrEqualThan.compare(
                expected.verifyPedidoTemDesconto().getDesconto().getIntegerValue(), 
                result.verifyPedidoTemDesconto().getDesconto().getIntegerValue()
            )
        );

    }
        
    @Test
    public void test3() {

        // Verify
        TCOutput expected = new TCOutput();
        expected.verifyPedidoTemDesconto(
            new Desconto(10)
        );

            
        // When
        TCInput input = new TCInput();
        input.whenPedidoTemTotal(
            new Total(101)
        );
        // Executa o método sendToSut
        TCOutput result = sendToSut(input);

        // Compara os resultados com os valores esperados
        assertTrue("Valor esperado [MoreOrEqualThan " 
            + expected.verifyPedidoTemDesconto().getDesconto().getIntegerValue() + "] - "
            + "Valor obtido ["
            + result.verifyPedidoTemDesconto().getDesconto().getIntegerValue() + "]",
            OperatorMoreOrEqualThan.compare(
                expected.verifyPedidoTemDesconto().getDesconto().getIntegerValue(), 
                result.verifyPedidoTemDesconto().getDesconto().getIntegerValue()
            )
        );

    }
        
    @Test
    public void test4() {

        // Verify
        TCOutput expected = new TCOutput();
        expected.verifyPedidoTemDesconto(
            new Desconto(11)
        );

            
        // When
        TCInput input = new TCInput();
        input.whenPedidoTemTotal(
            new Total(101)
        );
        // Executa o método sendToSut
        TCOutput result = sendToSut(input);

        // Compara os resultados com os valores esperados
        assertTrue("Valor esperado [MoreOrEqualThan " 
            + expected.verifyPedidoTemDesconto().getDesconto().getIntegerValue() + "] - "
            + "Valor obtido ["
            + result.verifyPedidoTemDesconto().getDesconto().getIntegerValue() + "]",
            OperatorMoreOrEqualThan.compare(
                expected.verifyPedidoTemDesconto().getDesconto().getIntegerValue(), 
                result.verifyPedidoTemDesconto().getDesconto().getIntegerValue()
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

