package pl.com.sda.rafal.zientara.javalon.calculator;

public class TooMuchException extends RuntimeException {

    public TooMuchException() {
    }

    public TooMuchException(String message) {
        super(message);
    }
}
