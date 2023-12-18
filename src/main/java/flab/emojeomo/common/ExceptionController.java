package flab.emojeomo.common;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseDto illegalExceptionHandler(IllegalArgumentException e) {
        return new ResponseDto.Builder(HttpStatus.BAD_REQUEST, e.getMessage()).build();
    }

}
