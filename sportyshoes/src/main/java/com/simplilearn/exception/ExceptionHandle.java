package com.simplilearn.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandle {
	@ExceptionHandler(value=Exception.class)
	public String handleAnyException()

	{
		return "error";
	}
}
