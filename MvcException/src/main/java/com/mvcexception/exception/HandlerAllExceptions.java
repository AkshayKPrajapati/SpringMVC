package com.mvcexception.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class HandlerAllExceptions {
	
	@ExceptionHandler(value=Exception.class)
	public String HandlerAllException(){
		return "arithmetric";
	}
}
