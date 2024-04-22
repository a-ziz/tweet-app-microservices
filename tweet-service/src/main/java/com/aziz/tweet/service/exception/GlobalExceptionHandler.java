package com.aziz.tweet.service.exception;

import com.aziz.tweet.service.response.ErrorResponse;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(CustomException.class)
  public ResponseEntity<ErrorResponse> handleCustomException(CustomException exception){
    ErrorResponse errorResponse = ErrorResponse.builder()
            .errorMessage(exception.getMessage())
            .errorCode(exception.errorCode)
            .build();

    return new ResponseEntity<>(errorResponse, HttpStatusCode.valueOf(exception.getStatus()));
  }
}
