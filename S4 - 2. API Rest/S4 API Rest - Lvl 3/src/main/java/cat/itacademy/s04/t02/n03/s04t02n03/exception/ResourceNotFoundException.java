package cat.itacademy.s04.t02.n03.s04t02n03.exception;

public class ResourceNotFoundException extends RuntimeException{
    public ResourceNotFoundException(String message) {
        super(message);
    }
}