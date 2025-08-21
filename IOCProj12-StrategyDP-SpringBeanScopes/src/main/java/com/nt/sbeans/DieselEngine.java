package com.nt.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("dEngine")
@Scope("prototype")
public final class DieselEngine implements IEngine {

	public DieselEngine() {
		System.out.println("DieselEngine:: 0-param constructor");
	}
	
	@Override
	public void startEngine() {
		System.out.println("DieselEngine.startEngine() :: Diesel Engine started");
	}

	@Override
	public void endEngine() {
		System.out.println("DieselEngine.endEngine() :: Diesel Engine ended");
	}

}
