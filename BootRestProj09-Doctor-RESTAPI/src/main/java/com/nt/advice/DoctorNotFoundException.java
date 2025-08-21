package com.nt.advice;

public class DoctorNotFoundException extends RuntimeException {
	
	public DoctorNotFoundException() {
		super();
	}
	
	public DoctorNotFoundException(String msg) {
		super(msg);
	}
		

}
