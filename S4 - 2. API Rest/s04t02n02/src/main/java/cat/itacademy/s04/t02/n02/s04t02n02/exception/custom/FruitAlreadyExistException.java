package cat.itacademy.s04.t02.n02.s04t02n02.exception.custom;

public class FruitAlreadyExistException extends RuntimeException {
    
    public FruitAlreadyExistException(String message) {
        super(message);
    }
    
}
