package pl.com.sda.rafal.zientara.javalon.calculator;

public class Calculator {

    public int sum(int value1, int value2) {
        long output = (long) value1 + value2;
        if (output > Integer.MAX_VALUE) {
            throw new TooMuchException(value1 + " + " + value2 + " = :(");
        }
        return (int) output;
    }

    public int subtraction(int a, int b) {
        return a - b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
