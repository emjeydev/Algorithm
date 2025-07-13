package Exceptions;

public class PayException extends RuntimeException {
    public PayException() {
        System.out.println("Paying amount is not correct");
    }
}
