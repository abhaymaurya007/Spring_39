package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public final class DieselEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("DieselEngine.startEngine() :: Diesel Engine started");
	}

	@Override
	public void endEngine() {
		System.out.println("DieselEngine.endEngine() :: Diesel Engine ended");
	}

}
