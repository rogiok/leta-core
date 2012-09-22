
// Version: 0.6 - Wed May 16 00:23:25 BRT 2012
package leta.core.sample.generated;

import org.junit.Test;
import static org.junit.Assert.*;

public abstract class TestCase02Test {

    // Gera todas as classes que correspondem aos termos
    class Calculator {
        
        Calculator() {
        }
        

        // Class methodClass;
        private Result hasResult;
        
        // Class getMethodClass() { return instance; }
        Result getHasResult() {
            return this.hasResult; 
        }
        
        // void setMethodClass(Class instance) { this.instance = instance; }
        void setHasResult(Result hasResult) {
            this.hasResult = hasResult;
        }
        
        // Class methodClassClass(String value) { this.instance = new Class(value); }
        Result hasResult(String value) {
            return this.hasResult = new Result(value);
        }

    }
    class Result {
        
        Result() {
        }
        
        private String sValue;

        Result(String value) { this.sValue = value; }
        String stringValue() { return this.sValue; }
        private Integer iValue;

        Result(Integer value) { this.iValue = value; }
        Integer intValue() { return this.iValue; }

        // Class methodClass;
        private ValueA equalsValueA;
        
        // Class getMethodClass() { return instance; }
        ValueA getEqualsValueA() {
            return this.equalsValueA; 
        }
        
        // void setMethodClass(Class instance) { this.instance = instance; }
        void setEqualsValueA(ValueA equalsValueA) {
            this.equalsValueA = equalsValueA;
        }
        
        // Class methodClassClass(String value) { this.instance = new Class(value); }
        ValueA equalsValueA(Integer value) {
            return this.equalsValueA = new ValueA(value);
        }

    }
    class ValueA {
        
        ValueA() {
        }
        
        private Integer iValue;

        ValueA(Integer value) { this.iValue = value; }
        Integer intValue() { return this.iValue; }

        // Class methodClass;
        private ValueB sumValueB;
        
        // Class getMethodClass() { return instance; }
        ValueB getSumValueB() {
            return this.sumValueB; 
        }
        
        // void setMethodClass(Class instance) { this.instance = instance; }
        void setSumValueB(ValueB sumValueB) {
            this.sumValueB = sumValueB;
        }
        
        // Class methodClassClass(String value) { this.instance = new Class(value); }
        ValueB sumValueB(Integer value) {
            return this.sumValueB = new ValueB(value);
        }

    }
    class ValueB {
        
        ValueB() {
        }
        
        private Integer iValue;

        ValueB(Integer value) { this.iValue = value; }
        Integer intValue() { return this.iValue; }

        // Class methodClass;
        private ValueC multiplyValueC;
        
        // Class getMethodClass() { return instance; }
        ValueC getMultiplyValueC() {
            return this.multiplyValueC; 
        }
        
        // void setMethodClass(Class instance) { this.instance = instance; }
        void setMultiplyValueC(ValueC multiplyValueC) {
            this.multiplyValueC = multiplyValueC;
        }
        
        // Class methodClassClass(String value) { this.instance = new Class(value); }
        ValueC multiplyValueC(Integer value) {
            return this.multiplyValueC = new ValueC(value);
        }

    }
    class ValueC {
        
        ValueC() {
        }
        
        private Integer iValue;

        ValueC(Integer value) { this.iValue = value; }
        Integer intValue() { return this.iValue; }


    }

    
    
    // Gera as combinações de fatos para o TCOutput
    class VerifyCalculatorHasResult {

        private Calculator calculator = new Calculator();
        Calculator getCalculator() { return this.calculator; }
        private Result result = new Result();
        Result getResult() { return this.result; }

        VerifyCalculatorHasResult(Result result) {
            this.result = result;

            this.calculator.setHasResult(this.result);

        }
    }
    
    class TCOutput {
        // Gera os métodos com as combinações definidas anteriormente
        private VerifyCalculatorHasResult verifyCalculatorHasResult;

        VerifyCalculatorHasResult verifyCalculatorHasResult(Result result) {
            return this.verifyCalculatorHasResult = new
                VerifyCalculatorHasResult(result);
        }
        VerifyCalculatorHasResult verifyCalculatorHasResult() {
            return this.verifyCalculatorHasResult;
        }

    }

    // Gera as combinações de fatos para o TCInput
    class WhenResultEqualsValueASumValueBMultiplyValueC {

        private Result result = new Result();
        Result getResult() { return this.result; }
        private ValueA valueA = new ValueA();
        ValueA getValueA() { return this.valueA; }
        private ValueB valueB = new ValueB();
        ValueB getValueB() { return this.valueB; }
        private ValueC valueC = new ValueC();
        ValueC getValueC() { return this.valueC; }

        WhenResultEqualsValueASumValueBMultiplyValueC(Result result, ValueA valueA, ValueB valueB, ValueC valueC) {
            this.result = result;
            this.valueA = valueA;
            this.valueB = valueB;
            this.valueC = valueC;

            this.result.setEqualsValueA(this.valueA);
            this.valueA.setSumValueB(this.valueB);
            this.valueB.setMultiplyValueC(this.valueC);

        }
    }
    
    class TCInput {
        // Gera os métodos com as combinações definidas anteriormente
        private WhenResultEqualsValueASumValueBMultiplyValueC whenResultEqualsValueASumValueBMultiplyValueC;

        WhenResultEqualsValueASumValueBMultiplyValueC whenResultEqualsValueASumValueBMultiplyValueC(Result result, ValueA valueA, ValueB valueB, ValueC valueC) {
            return this.whenResultEqualsValueASumValueBMultiplyValueC = new
                WhenResultEqualsValueASumValueBMultiplyValueC(result, valueA, valueB, valueC);
        }
        WhenResultEqualsValueASumValueBMultiplyValueC whenResultEqualsValueASumValueBMultiplyValueC() {
            return this.whenResultEqualsValueASumValueBMultiplyValueC;
        }

    }


    // Método que será implementado e enviará os dados ao SUT
    abstract TCOutput sendToSut(TCInput input);
    
    // Matrix
    @Test
    public void testCase02Test1() {

        // Verify
        TCOutput expected = new TCOutput();
        expected.verifyCalculatorHasResult(
            new Result()
        );        
        // When
        TCInput input = new TCInput();
        input.whenResultEqualsValueASumValueBMultiplyValueC(
            new Result(30), 
            new ValueA(10), 
            new ValueB(50), 
            new ValueC(4)
        );
        // Executa o método sendToSut
        TCOutput result = sendToSut(input);

        // Compara os resultados com os valores esperados
        assertTrue("Valor esperado [ " 
            + expected.verifyCalculatorHasResult().getResult().stringValue() + "] - "
            + "Valor obtido ["
            + result.verifyCalculatorHasResult().getResult().stringValue() + "]",
            OperatorEqual.compare(
                expected.verifyCalculatorHasResult().getResult().stringValue(), 
                result.verifyCalculatorHasResult().getResult().stringValue()
            )
        );

    }
        
    @Test
    public void testCase02Test2() {

        // Verify
        TCOutput expected = new TCOutput();
        expected.verifyCalculatorHasResult(
            new Result("20")
        );        
        // When
        TCInput input = new TCInput();
        input.whenResultEqualsValueASumValueBMultiplyValueC(
            new Result(4), 
            new ValueA(2), 
            new ValueB(18), 
            new ValueC(1)
        );
        // Executa o método sendToSut
        TCOutput result = sendToSut(input);

        // Compara os resultados com os valores esperados
        assertTrue("Valor esperado [ " 
            + expected.verifyCalculatorHasResult().getResult().stringValue() + "] - "
            + "Valor obtido ["
            + result.verifyCalculatorHasResult().getResult().stringValue() + "]",
            OperatorEqual.compare(
                expected.verifyCalculatorHasResult().getResult().stringValue(), 
                result.verifyCalculatorHasResult().getResult().stringValue()
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

