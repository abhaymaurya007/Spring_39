package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public final class PetrolEngine implements IEngine {
	
	public PetrolEngine() {
		System.out.println("PetrolEngine:: 0-param constructor");
	}

	@Override
	public void startEngine() {
		System.out.println("PetrolEngine.startEngine() :: Petrol Engine started");
	}

	@Override
	public void endEngine() {
		System.out.println("PetrolEngine.endEngine() :: Petrol Engine ended");
	}

}
