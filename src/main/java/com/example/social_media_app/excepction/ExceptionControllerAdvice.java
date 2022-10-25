package com.example.social_media_app.excepction;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public class ExceptionControllerAdvice {

    @ExceptionHandler(value = CustomException.class)
    public final ResponseEntity<String> handlerCustomExcepction(CustomException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = AuthenticationFailException.class)
    public final ResponseEntity<String> handlerAuthenctionfailExecption(AuthenticationFailException exception){
        return  new ResponseEntity<>(exception.getMessage(),HttpStatus.BAD_REQUEST);
    }
}
