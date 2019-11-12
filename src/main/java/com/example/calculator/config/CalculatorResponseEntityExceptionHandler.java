package com.example.calculator.config;

import org.springframework.beans.TypeMismatchException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.calculator.model.ResultBuilder;


@ControllerAdvice
public class CalculatorResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

   @Override
   protected ResponseEntity<Object> handleTypeMismatch( TypeMismatchException ex, HttpHeaders headers, HttpStatus status, WebRequest request ) {
      String errorMessage = "The parameters need to be numeric";
      return handleExceptionInternal(ex, ResultBuilder.getResultFromError(errorMessage), headers, status, request);
   }

   @Override
   protected ResponseEntity<Object> handleMissingServletRequestParameter( MissingServletRequestParameterException ex, HttpHeaders headers, HttpStatus status,
         WebRequest request ) {
      return handleExceptionInternal(ex, ResultBuilder.getResultFromError(ex.getMessage()), headers, status, request);
   }
}
