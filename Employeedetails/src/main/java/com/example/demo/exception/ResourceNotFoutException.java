package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoutException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
 private String resourceName;
 private String feildName;
 private Object feildValue;
public ResourceNotFoutException(String resourceName, String feildName, Object feildValue) {
	super(resourceName+":Not Found for "+feildName+":"+feildValue);
	this.resourceName = resourceName;
	this.feildName = feildName;
	this.feildValue = feildValue;
}
 
 
}
