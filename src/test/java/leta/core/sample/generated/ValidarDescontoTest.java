
// Version: 0.6 - Wed May 16 00:23:25 BRT 2012
package leta.core.sample.generated;

import org.junit.Test;
import static org.junit.Assert.*;

public abstract class ValidarDescontoTest {

    // Gera todas as classes que correspondem aos termos
    class NotaFiscal {
        
        NotaFiscal() {
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
        private ValorTotal temValorTotal;
        
        // Class getMethodClass() { return instance; }
        ValorTotal getTemValorTotal() {
            return this.temValorTotal; 
        }
        
        // void setMethodClass(Class instance) { this.instance = instance; }
        void setTemValorTotal(ValorTotal temValorTotal) {
            this.temValorTotal = temValorTotal;
        }
        
        // Class methodClassClass(String value) { this.instance = new Class(value); }
        ValorTotal temValorTotal(Integer value) {
            return this.temValorTotal = new ValorTotal(value);
        }

    }
    class Desconto {
        
        Desconto() {
        }
        
        private Integer iValue;

        Desconto(Integer value) { this.iValue = value; }
        Integer intValue() { return this.iValue; }


    }
    class ValorTotal {
        
        ValorTotal() {
        }
        
        private Integer iValue;

        ValorTotal(Integer value) { this.iValue = value; }
        Integer intValue() { return this.iValue; }


    }
    class TTTest {
        
        TTTest() {
        }
        

        // boolean instance;
        private boolean isReady = true;
        
        // boolean isInstance() { return instance; }
        boolean isIsReady() {
            return this.isReady; 
        }
        
        // void setInstance(boolean instance) { this.instance = instance; }
        void setIsReady(boolean isReady) {
            this.isReady = isReady;
        }


    }

    
    
    // Gera as combinações de fatos para o TCOutput
    class VerifyNotaFiscalTemDesconto {

        private NotaFiscal notaFiscal = new NotaFiscal();
        NotaFiscal getNotaFiscal() { return this.notaFiscal; }
        private Desconto desconto = new Desconto();
        Desconto getDesconto() { return this.desconto; }

        VerifyNotaFiscalTemDesconto(Desconto desconto) {
            this.desconto = desconto;

            this.notaFiscal.setTemDesconto(this.desconto);

        }
    }

    class OrNotaFiscalTemDesconto {

        private NotaFiscal notaFiscal = new NotaFiscal();
        NotaFiscal getNotaFiscal() { return this.notaFiscal; }
        private Desconto desconto = new Desconto();
        Desconto getDesconto() { return this.desconto; }

        OrNotaFiscalTemDesconto(Desconto desconto) {
            this.desconto = desconto;

            this.notaFiscal.setTemDesconto(this.desconto);

        }
    }
    
    class TCOutput {
        // Gera os métodos com as combinações definidas anteriormente
        private VerifyNotaFiscalTemDesconto verifyNotaFiscalTemDesconto;

        VerifyNotaFiscalTemDesconto verifyNotaFiscalTemDesconto(Desconto desconto) {
            return this.verifyNotaFiscalTemDesconto = new
                VerifyNotaFiscalTemDesconto(desconto);
        }
        VerifyNotaFiscalTemDesconto verifyNotaFiscalTemDesconto() {
            return this.verifyNotaFiscalTemDesconto;
        }

        private OrNotaFiscalTemDesconto orNotaFiscalTemDesconto;

        OrNotaFiscalTemDesconto orNotaFiscalTemDesconto(Desconto desconto) {
            return this.orNotaFiscalTemDesconto = new
                OrNotaFiscalTemDesconto(desconto);
        }
        OrNotaFiscalTemDesconto orNotaFiscalTemDesconto() {
            return this.orNotaFiscalTemDesconto;
        }

    }

    // Gera as combinações de fatos para o TCInput
    class WhenNotaFiscalTemValorTotal {

        private NotaFiscal notaFiscal = new NotaFiscal();
        NotaFiscal getNotaFiscal() { return this.notaFiscal; }
        private ValorTotal valorTotal = new ValorTotal();
        ValorTotal getValorTotal() { return this.valorTotal; }

        WhenNotaFiscalTemValorTotal(ValorTotal valorTotal) {
            this.valorTotal = valorTotal;

            this.notaFiscal.setTemValorTotal(this.valorTotal);

        }
    }

    class AndTTTestIsReady {

        private TTTest tTTest = new TTTest();
        TTTest getTTTest() { return this.tTTest; }

        AndTTTestIsReady(boolean value) {
            this.tTTest.setIsReady(value);
        }
    }
    
    class TCInput {
        // Gera os métodos com as combinações definidas anteriormente
        private WhenNotaFiscalTemValorTotal whenNotaFiscalTemValorTotal;

        WhenNotaFiscalTemValorTotal whenNotaFiscalTemValorTotal(ValorTotal valorTotal) {
            return this.whenNotaFiscalTemValorTotal = new
                WhenNotaFiscalTemValorTotal(valorTotal);
        }
        WhenNotaFiscalTemValorTotal whenNotaFiscalTemValorTotal() {
            return this.whenNotaFiscalTemValorTotal;
        }

        private AndTTTestIsReady andTTTestIsReady;

        AndTTTestIsReady andTTTestIsReady(boolean value) {
            return this.andTTTestIsReady = new
                AndTTTestIsReady(value);
        }
        AndTTTestIsReady andTTTestIsReady() {
            return this.andTTTestIsReady;
        }

    }


    // Método que será implementado e enviará os dados ao SUT
    abstract TCOutput sendToSut(TCInput input);
    
    // Matrix
    @Test
    public void validarDescontoTest1() {

        // Verify
        TCOutput expected = new TCOutput();
        expected.verifyNotaFiscalTemDesconto(
            new Desconto(10)
        );
        expected.orNotaFiscalTemDesconto(
            new Desconto(10)
        );
            
        // When
        TCInput input = new TCInput();
        input.whenNotaFiscalTemValorTotal(
            new ValorTotal(200)
        );
        input.andTTTestIsReady(
            true
        );

        // Executa o método sendToSut
        TCOutput result = sendToSut(input);

        // Compara os resultados com os valores esperados
        assertTrue("Valor esperado [<= " 
            + expected.verifyNotaFiscalTemDesconto().getDesconto().intValue() + "] - "
            + "Valor obtido ["
            + result.verifyNotaFiscalTemDesconto().getDesconto().intValue() + "]",
            OperatorLessOrEqualThan.compare(
                expected.verifyNotaFiscalTemDesconto().getDesconto().intValue(), 
                result.verifyNotaFiscalTemDesconto().getDesconto().intValue()
            )
        );
        assertTrue("Valor esperado [> " 
            + expected.orNotaFiscalTemDesconto().getDesconto().intValue() + "] - "
            + "Valor obtido ["
            + result.orNotaFiscalTemDesconto().getDesconto().intValue() + "]",
            OperatorMoreThan.compare(
                expected.orNotaFiscalTemDesconto().getDesconto().intValue(), 
                result.orNotaFiscalTemDesconto().getDesconto().intValue()
            )
        );

    }
        
    @Test
    public void validarDescontoTest2() {

        // Verify
        TCOutput expected = new TCOutput();
        expected.verifyNotaFiscalTemDesconto(
            new Desconto(10)
        );
        expected.orNotaFiscalTemDesconto(
            new Desconto(10)
        );
            
        // When
        TCInput input = new TCInput();
        input.whenNotaFiscalTemValorTotal(
            new ValorTotal(163)
        );
        input.andTTTestIsReady(
            true
        );

        // Executa o método sendToSut
        TCOutput result = sendToSut(input);

        // Compara os resultados com os valores esperados
        assertTrue("Valor esperado [<= " 
            + expected.verifyNotaFiscalTemDesconto().getDesconto().intValue() + "] - "
            + "Valor obtido ["
            + result.verifyNotaFiscalTemDesconto().getDesconto().intValue() + "]",
            OperatorLessOrEqualThan.compare(
                expected.verifyNotaFiscalTemDesconto().getDesconto().intValue(), 
                result.verifyNotaFiscalTemDesconto().getDesconto().intValue()
            )
        );
        assertTrue("Valor esperado [> " 
            + expected.orNotaFiscalTemDesconto().getDesconto().intValue() + "] - "
            + "Valor obtido ["
            + result.orNotaFiscalTemDesconto().getDesconto().intValue() + "]",
            OperatorMoreThan.compare(
                expected.orNotaFiscalTemDesconto().getDesconto().intValue(), 
                result.orNotaFiscalTemDesconto().getDesconto().intValue()
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

