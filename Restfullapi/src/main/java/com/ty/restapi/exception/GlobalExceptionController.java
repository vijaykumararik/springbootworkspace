package com.ty.restapi.exception;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionController {

	@ExceptionHandler(CustomerIdNotFoundException.class)
	public ResponseEntity<?> handleCustomerIdNotFoundException(CustomerIdNotFoundException exception,HttpServletRequest request){
		
		CustomerIdNotFoundException customerIdNotFoundException=new CustomerIdNotFoundException("not found");
		
		ApiError apiError=new ApiError();
		apiError.setMessage(exception.getMessage());
		
		apiError.setLocalDateTime(LocalDateTime.now());//curenrt date and time
		apiError.setEndpoint(request.getRequestURI());//end point uri name where exception was generated
		apiError.setHttpStatus(HttpStatus.NOT_FOUND);
		return new ResponseEntity<>(apiError,apiError.getHttpStatus());
	}
}
