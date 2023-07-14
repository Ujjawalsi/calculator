package com.calculator;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class IllegalExceptionHandler {

    @ExceptionHandler(IllegalAccessException.class)
    public ResponseEntity<?> handleIllegalAccessException(IllegalAccessException exception){
        Map<String , String> result = new HashMap<>();
        String message = exception.getMessage();
        Throwable cause = exception.getCause();
        result.put("Message : " , message);

        return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
    }

}
