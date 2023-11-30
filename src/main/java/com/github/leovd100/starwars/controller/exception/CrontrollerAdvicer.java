package com.github.leovd100.starwars.controller.exception;

import com.github.leovd100.starwars.exceptions.DataBaseException;
import com.github.leovd100.starwars.exceptions.ResourceNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.Instant;

@ControllerAdvice
public class CrontrollerAdvicer {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> entityNotFound(ResourceNotFoundException e, HttpServletRequest request) {
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError error = new StandardError();
        error.setTimestamp(Instant.now());
        error.setStatus(status.value());
        error.setError("Resource not found");
        error.setMessage(e.getMessage());
        error.setPath(request.getRequestURI());
        return ResponseEntity.status(status).body(error);
    }

    @ExceptionHandler(DataBaseException.class)
    public ResponseEntity<StandardError> database(DataBaseException entity, HttpServletRequest request){
        StandardError standard = new StandardError();
        HttpStatus status = HttpStatus.BAD_REQUEST;
        standard.setTimestamp(Instant.now());
        standard.setStatus(status.value());
        standard.setError("Database exception");
        standard.setMessage(entity.getMessage());
        standard.setPath(request.getRequestURI());
        return ResponseEntity.status(status).body(standard);
    }

}
