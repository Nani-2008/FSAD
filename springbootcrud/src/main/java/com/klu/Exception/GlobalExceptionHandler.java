package com.klu.Exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import com.klu.ErrorResponse;



@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ProductDuplicateException.class)
    public ResponseEntity<ErrorResponse> duplicateProductExceptionHandler(
            ProductDuplicateException dpex, WebRequest webRequest) {

        ErrorResponse errorResponse = new ErrorResponse(
                dpex.getMessage(),
                webRequest.getDescription(false),
                "Duplicate Product Found"
        );

        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }


    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ErrorResponse> productNotFoundExceptionHandler(
            ProductNotFoundException pnfe, WebRequest webRequest) {

        ErrorResponse errorResponse = new ErrorResponse(
                pnfe.getMessage(),
                webRequest.getDescription(false),
                "Product Not Found"
        );

        return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
    }
}