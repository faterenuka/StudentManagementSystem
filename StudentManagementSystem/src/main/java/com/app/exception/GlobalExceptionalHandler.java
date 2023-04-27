package com.app.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionalHandler {

	@ExceptionHandler(StudentException.class) 
	public ResponseEntity<MyErrorDetails> exceptionHandler(StudentException se,WebRequest req) {
		
		MyErrorDetails err = new MyErrorDetails();
		err.setDetails(req.getDescription(false));
		err.setHttpStatus(HttpStatus.BAD_REQUEST);
		err.setTimeStamp(LocalDateTime.now());
		err.setMessage(se.getMessage()) ;
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST) ;
	}
	
	@ExceptionHandler(AddressException.class) 
	public ResponseEntity<MyErrorDetails> exceptionHandler(AddressException ae,WebRequest req) {
		
		MyErrorDetails err = new MyErrorDetails();
		err.setDetails(req.getDescription(false));
		err.setHttpStatus(HttpStatus.BAD_REQUEST);
		err.setTimeStamp(LocalDateTime.now());
		err.setMessage(ae.getMessage()) ;
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST) ;
	}
	
	@ExceptionHandler(CourseException.class) 
	public ResponseEntity<MyErrorDetails> exceptionHandler(CourseException ce,WebRequest req) {
		
		MyErrorDetails err = new MyErrorDetails();
		err.setDetails(req.getDescription(false));
		err.setHttpStatus(HttpStatus.BAD_REQUEST);
		err.setTimeStamp(LocalDateTime.now());
		err.setMessage(ce.getMessage()) ;
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST) ;
	}
	
	@ExceptionHandler(Exception.class) 
	public ResponseEntity<MyErrorDetails> exceptionHandler(Exception e,WebRequest req) {
		
		MyErrorDetails err = new MyErrorDetails();
		err.setDetails(req.getDescription(false));
		err.setHttpStatus(HttpStatus.BAD_REQUEST);
		err.setTimeStamp(LocalDateTime.now());
		err.setMessage(e.getMessage()) ;
		
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST) ;
	}
}
