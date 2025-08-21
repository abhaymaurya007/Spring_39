//StandardCar.java
package com.nt.comps;

public class StandardCar implements ICar {
	
	public StandardCar() {
		System.out.println("StandardCar:: 0-param constructor");
	}

	@Override
	public String drive(String user) {
		return user+"  is driving   MS- Swift  Car  (Standard Car)";
	}

}
