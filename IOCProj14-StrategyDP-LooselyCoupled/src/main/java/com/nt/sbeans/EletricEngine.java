package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngine")
public final class EletricEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("EletricEngine.startEngine() :: Eletric Engine started");
	}

	@Override
	public void endEngine() {
		System.out.println("EletricEngine.endEngine() :: Eletric Engine ended");
	}

}
