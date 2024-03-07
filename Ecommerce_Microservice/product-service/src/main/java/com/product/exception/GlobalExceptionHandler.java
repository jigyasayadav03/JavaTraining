package com.product.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.product.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ApiResponse> setProductNotFoundException(ProductNotFoundException e) {
		ApiResponse apiResponse = ApiResponse.builder().message(e.getMessage()).isValid(false)
				.httpStatus(HttpStatus.NOT_FOUND).build();
		return new ResponseEntity<ApiResponse>(apiResponse, HttpStatus.NOT_FOUND);
	}
}
