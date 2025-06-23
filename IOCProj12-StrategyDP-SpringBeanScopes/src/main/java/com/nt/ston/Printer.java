//Printer.java 
package com.nt.ston;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("prototype")
//@Component("prn")
public class Printer {
	 //private static  ref variable to  hold single object
	private  static   Printer  INSTANCE;

	
	//private  constructor
	private   Printer() {
		System.out.println("Printer:: 0-param constructor");
	}
	
	//static factory  method  having  signleton logic
	public   static   Printer   getInstance() {
		System.out.println("Printer.getInstance()  (static factory method)");
		if(INSTANCE==null)
			INSTANCE=new Printer();
		
		return INSTANCE;
	}
	
	//b.method
	public   void  printData(String message) {
		System.out.println("Printer.printData()");
		System.out.println(message);
	}
}
