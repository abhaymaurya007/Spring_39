//DoctorNotFoundException.java
package com.nt.errors;

public class DoctorNotFoundException extends Exception{
    public  DoctorNotFoundException(String msg) {
    	super(msg);
    }
    public  DoctorNotFoundException() {
    	super();
    }
}
