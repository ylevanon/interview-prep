package com.interviewprep.shipping;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler(ShipmentNotFoundException.class)
    public ResponseEntity<ApiError> handleNotFound(ShipmentNotFoundException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new ApiError(exception.getMessage()));
    }

    @ExceptionHandler(ShipmentAccessDeniedException.class)
    public ResponseEntity<ApiError> handleAccessDenied(ShipmentAccessDeniedException exception) {
        return ResponseEntity.status(HttpStatus.FORBIDDEN)
                .body(new ApiError(exception.getMessage()));
    }

    public record ApiError(String message) {
    }
}
