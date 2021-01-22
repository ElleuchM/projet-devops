package tn.iit.storemanagement.web.rest.errors;

public class MethodArgumentNotValidException extends RuntimeException {
    public MethodArgumentNotValidException(String message) {
        super (message);
    }

    public MethodArgumentNotValidException(String message, Throwable cause) {
        super (message, cause);
    }

    public MethodArgumentNotValidException(Throwable cause) {
        super (cause);
    }

}
