package MyException;

public class Myexception2 extends Exception{
    public Myexception2() {
    }

    public Myexception2(String message) {
        super(message);
    }

    public Myexception2(String message, Throwable cause) {
        super(message, cause);
    }

    public Myexception2(Throwable cause) {
        super(cause);
    }

    public Myexception2(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
