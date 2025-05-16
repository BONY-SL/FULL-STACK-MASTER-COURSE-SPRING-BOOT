package com.example.demo.exception;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<Map<String,Object>> handleResourceNotFound(ResourceNotFoundException resourceNotFoundException, HttpServletRequest httpServletRequest){

        Map<String,Object> errorResponse = new HashMap<>();

        errorResponse.put("timestamp", LocalDateTime.now());
        errorResponse.put("code", HttpStatus.NOT_FOUND.value());
        errorResponse.put("status",HttpStatus.NOT_FOUND);
        errorResponse.put("message",resourceNotFoundException.getMessage());
        errorResponse.put("path",httpServletRequest.getRequestURI());

        return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
    }
}
