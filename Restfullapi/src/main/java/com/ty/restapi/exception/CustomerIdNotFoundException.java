package com.ty.restapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CustomerIdNotFoundException extends RuntimeException {
	
 public CustomerIdNotFoundException(String message) {
	 super(message);
 }
}
