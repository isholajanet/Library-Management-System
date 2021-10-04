package exceptions;

public class BookAlreadyExistException extends Exception {
    public BookAlreadyExistException() {
        super();
    }

    public BookAlreadyExistException(String message) {
        super(message);
    }

    public BookAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public BookAlreadyExistException(Throwable cause) {
        super(cause);
    }
}
