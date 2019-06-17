package pl.com.sda.rafal.zientara.javalon.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    @Test
    public void sumTwoNumbers() {
        // given
        Calculator calculator = new Calculator();
        int a = 2;
        int b = 3;

        // when
        int output = calculator.sum(a, b);

        // then
        assertEquals(5, output);
    }

    @Test
    public void sumBigTwoNumbersShouldThrows() {
        // given
        final Calculator calculator = new Calculator();
        final int a = 2000000000;
        final int b = 2000000000;

        // when, then
        assertThrows(TooMuchException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                calculator.sum(a, b);
            }
        });
    }

    @Test
    public void subtractionTwoNumbers() {
        // given
        Calculator calculator = new Calculator();
        int a = 2;
        int b = 3;

        // when
        int output = calculator.subtraction(a, b);

        // then
        assertEquals(-1, output);
    }

    @Test
    public void divideTwoNumbers() {
        // given
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 2;

        // when
        int output = calculator.divide(a, b);

        // then
        assertEquals(2, output);
    }

    @Test
    public void multipleTwoNumbers() {
        // given
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 2;

        // when
        int output = calculator.multiple(a, b);

        // then
        assertEquals(10, output);
    }

    @Test
    public void moduloTwoNumbers() {
        // given
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 2;

        // when
        int output = calculator.modulo(a, b);

        // then
        assertEquals(1, output);
    }

    //todo %


}