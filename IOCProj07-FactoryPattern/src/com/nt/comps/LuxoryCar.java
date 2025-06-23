//StandardCar.java
package com.nt.comps;

public class LuxoryCar implements ICar {
	
	public LuxoryCar() {
		System.out.println("LuroxyCar:: 0-param constructor");
	}

	@Override
	public String drive(String user) {
		return user+"  is driving   Rolls-Royace  Car  (Luxroy Car)";
	}

}
