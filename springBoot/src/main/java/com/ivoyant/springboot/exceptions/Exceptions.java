package com.ivoyant.springboot.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.util.HashMap;

@RestControllerAdvice
public class Exceptions {

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<?> handle405() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("Message", "405 error, Method not supported");
        return new ResponseEntity<>(map, HttpStatus.METHOD_NOT_ALLOWED);
    }

    @ExceptionHandler(NoResourceFoundException.class)
    public ResponseEntity<?> handle404() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("Message", "404 - page not found");
        return new ResponseEntity<>(map, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<?> handle400() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("Message", "400 - Method args are miss-matched");
        return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
    }

}
