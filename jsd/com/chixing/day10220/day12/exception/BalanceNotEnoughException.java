package chixing.day10220.day12.exception;

public class BalanceNotEnoughException extends Exception {
    public BalanceNotEnoughException() {
    }

    public BalanceNotEnoughException(Throwable cause) {
        super(cause);
    }

    public BalanceNotEnoughException(String message) {
        super(message);
    }
}
