package com.tropoGo.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ControllerAdvice
public class GlobalExceptionHandler  {
	
	@ExceptionHandler(DataIntegrityViolationException.class)
	  public  ResponseEntity<ErrorResponse> processConstraintError(DataIntegrityViolationException ex) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrorCode("400");
		errorResponse.setErrorMessage("User Id Entered in Job does not exist");
		return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.BAD_REQUEST);
	  
	  }
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponse> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrorCode("400");
		errorResponse.setErrorMessage("Methods Argument not valid, Bad Request");
		return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler({Exception.class})
	protected ResponseEntity<ErrorResponse> handleAllOtherExceptions() {
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setErrorCode("500");
		errorResponse.setErrorMessage("Something bad happened, please contact techs!");
		return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	

}
