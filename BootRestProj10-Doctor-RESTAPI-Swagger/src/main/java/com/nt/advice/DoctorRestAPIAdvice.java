package com.nt.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class DoctorRestAPIAdvice {

	@ExceptionHandler(exception = Exception.class)
	 public  ResponseEntity<String> handleAllExceptions(Exception e){
		 return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	 }
	
	@ExceptionHandler(exception = DoctorNotFoundException.class)
	 public  ResponseEntity<String> handleDNFE(DoctorNotFoundException dne){
		 return new ResponseEntity<String>(dne.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	 }

	
}
