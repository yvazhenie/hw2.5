package WrongLoginException;

public class WrongPasswordException extends RuntimeException{
    public WrongPasswordException(String errorException) {
        super (errorException);

    }
}
