package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

//@Component("vehicle")
@Service("vehicle")
@Scope("singleton")
public class Vehicle {
	
	public Vehicle() {
		System.out.println("Vehicle:: 0-param constructor");
	}

   @Autowired
	@Qualifier("dEngine")
	private IEngine  engine;

	
	//b.method
	public  void  journey(String startPlace, String  endPlace) {
		engine.startEngine();
		System.out.println("Jounery started on the Vehicle  from "+startPlace);
		
/*		try {
			Thread.sleep(40000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		System.out.println("Jounery is going on from "+startPlace+" to "+endPlace);
		
	/*	try {
			Thread.sleep(40000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		engine.endEngine();
		System.out.println("Jounery ended at "+endPlace);
		
	}//method

}//class
