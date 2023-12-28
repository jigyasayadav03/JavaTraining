package com.microservice.userservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.microservice.userservice.payload.ApiResponse;

@RestControllerAdvice
public class GlobalResourceHandler {
	//if in full project if this exception occurs then this exception gets generated at that time
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse>handlerResourceNotFoundException(ResourceNotFoundException ex)
	{
		String message =ex.getMessage();
	ApiResponse response=	ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
		return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
		
	}

}
