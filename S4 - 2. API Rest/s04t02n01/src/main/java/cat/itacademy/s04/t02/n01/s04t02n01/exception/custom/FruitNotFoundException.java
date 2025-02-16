package cat.itacademy.s04.t02.n01.s04t02n01.exception.custom;

public class FruitNotFoundException extends RuntimeException {
    
    public FruitNotFoundException(String message) {
        super(message);
    }
    
}
