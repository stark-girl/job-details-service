package com.tropoGo.exception;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.source.InvalidConfigurationPropertyValueException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.server.MethodNotAllowedException;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ControllerAdvice
public class GlobalExceptionHandler  {
	
	ErrorResponse errorResponse = new ErrorResponse();
	
	@ExceptionHandler(DataIntegrityViolationException.class)
	  public  ResponseEntity<ErrorResponse> processConstraintError(DataIntegrityViolationException ex) {
		errorResponse.setErrorCode("400");
		errorResponse.setErrorMessage("User Id Entered in Job does not exist");
		return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.BAD_REQUEST);
	  
	  }
	
	@ExceptionHandler(MethodNotAllowedException.class)
	public ResponseEntity<ErrorResponse> handleMethodNotAllowedException(MethodNotAllowedException e) {
		errorResponse.setErrorCode("405");
		errorResponse.setErrorMessage("Methods not allowed");
		return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.METHOD_NOT_ALLOWED);
	}
	
	@ExceptionHandler(InvalidConfigurationPropertyValueException.class)
	public ResponseEntity<ErrorResponse> handleResourceNotFoundException(InvalidConfigurationPropertyValueException e) {
		errorResponse.setErrorCode("404");
		errorResponse.setErrorMessage("Resource Not found");
		return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorResponse> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
		errorResponse.setErrorCode("400");
		errorResponse.setErrorMessage("Methods Argument not valid, Bad Request");
		return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler({Exception.class})
	protected ResponseEntity<ErrorResponse> handleAllOtherExceptions(Exception ex) {
		errorResponse.setErrorCode("500");
		errorResponse.setErrorMessage("Something bad happened, please contact techs!");
		return new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.INTERNAL_SERVER_ERROR);
	}
	

}
