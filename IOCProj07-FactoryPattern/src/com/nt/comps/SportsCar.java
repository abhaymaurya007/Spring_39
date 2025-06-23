//SportsCar.java
package com.nt.comps;

public class SportsCar implements ICar {
	
	public SportsCar() {
		System.out.println("SportsCar:: 0-param constructor");
	}

	@Override
	public String drive(String user) {
		return user+"  is driving   McLaren  Car  (Sports Car)";
	}

}
