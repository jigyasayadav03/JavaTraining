package com.order.exeception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.order.payload.ErrorMessageDTO;

@RestControllerAdvice
public class GlobalCustomeException {

	@ExceptionHandler(OrderNotFoundException.class)
	public ResponseEntity<ErrorMessageDTO> setCutomErrorMessage(OrderNotFoundException e) {
		ErrorMessageDTO errorMessageDTO = ErrorMessageDTO.builder().isSuccess(false).message(e.getMessage())
				.status(HttpStatus.NOT_FOUND).build();
		return new ResponseEntity<ErrorMessageDTO>(errorMessageDTO, HttpStatus.NOT_FOUND);
	}
}
