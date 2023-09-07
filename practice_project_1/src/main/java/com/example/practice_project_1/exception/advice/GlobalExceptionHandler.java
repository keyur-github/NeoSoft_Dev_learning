package com.example.practice_project_1.exception.advice;

import com.example.practice_project_1.exception.ResourceNotFoundException;
import com.example.practice_project_1.model.ApiResponseBean;
import com.example.practice_project_1.model.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> resourceNotFound(ResourceNotFoundException exception){
        ApiResponseBean responseBean = new ApiResponseBean();
        responseBean.setMessage(exception.getMessage());
        responseBean.setStatus(Boolean.FALSE);
        return ResponseEntity.ok(responseBean);
    }
}
