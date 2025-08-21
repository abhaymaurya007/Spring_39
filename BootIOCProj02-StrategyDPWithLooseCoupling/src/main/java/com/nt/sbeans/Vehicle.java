package com.nt.sbeans;

import com.nt.BootIocProj02StrategyDpApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {

	@Autowired
	@Qualifier("motor")
	private   IEngine engine;


	
	
	public void journey(String startPlace,String  destPlace) {
		engine.startEngine();
		System.out.println("Jounery started at::"+startPlace);
		System.out.println("Jounery is going on .............");
		
		engine.stopEngine();
		System.out.println("Journey Endeded at ::"+destPlace);
	}

}
