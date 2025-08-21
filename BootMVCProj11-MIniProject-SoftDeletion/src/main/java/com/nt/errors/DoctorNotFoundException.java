//DoctorNotFoundException.java
package com.nt.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_GATEWAY)
public class DoctorNotFoundException extends RuntimeException{
    public  DoctorNotFoundException(String msg) {
    	super(msg);
    }
    public  DoctorNotFoundException() {
    	super();
    }
}
