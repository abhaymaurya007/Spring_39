package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {

    private final EletricEngine eEngine;

    private final PetrolEngine pEngine;

    private final DieselEngine dEngine;
	@Autowired
	@Qualifier("eEngine")
	private IEngine  engine;

    Vehicle(DieselEngine dEngine, PetrolEngine pEngine, EletricEngine eEngine) {
        this.dEngine = dEngine;
        this.pEngine = pEngine;
        this.eEngine = eEngine;
    }
	
	//b.method
	public  void  journey(String startPlace, String  endPlace) {
		engine.startEngine();
		System.out.println("Jounery started on the Vehicle  from "+startPlace);
		
		try {
			Thread.sleep(40000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Jounery is going on from "+startPlace+" to "+endPlace);
		
		try {
			Thread.sleep(40000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		engine.endEngine();
		System.out.println("Jounery ended at "+endPlace);
		
	}//method

}//class
