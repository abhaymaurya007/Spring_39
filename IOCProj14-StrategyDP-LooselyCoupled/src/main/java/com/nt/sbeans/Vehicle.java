package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {

	//@Autowired
	//@Qualifier(@Value("${engine.id}")) //Error-  @Value  can  not be placed inside the another annotation
	//@Qualifier("@Value('${engine.id}')")  //Error-  @Value  annotation is not recognized here
	/*@Value("${engine.id}")
	private  String id; */
	//@Qualifier("${engine.id}")  // Error --  we can  not use place holder with out using 
	//@Qualifier(id)  //Error -  variable can be passed in  @Qualifier(-) annotation
	
	@Autowired
	@Qualifier("motor")
	private IEngine  engine;

	
	//b.method
	public  void  journey(String startPlace, String  endPlace) {
		engine.startEngine();
		System.out.println("Jounery started on the Vehicle  from "+startPlace);
		
		
		System.out.println("Jounery is going on from "+startPlace+" to "+endPlace);
		
		
		engine.endEngine();
		System.out.println("Jounery ended at "+endPlace);
		
	}//method

}//class
