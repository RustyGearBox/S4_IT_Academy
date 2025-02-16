package cat.itacademy.s04.t02.n02.s04t02n02.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import cat.itacademy.s04.t02.n02.s04t02n02.exception.custom.FruitAlreadyExistException;
import cat.itacademy.s04.t02.n02.s04t02n02.exception.custom.FruitNotFoundException;


public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(FruitAlreadyExistException.class)
    public ResponseEntity<String> handleResourceNotFoundException(FruitAlreadyExistException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(FruitNotFoundException.class)
    public ResponseEntity<String> handleResourceNotFoundException(FruitNotFoundException ex) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

}