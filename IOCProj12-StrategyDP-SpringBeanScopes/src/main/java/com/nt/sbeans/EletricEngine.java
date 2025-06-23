package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("eEngine")
@Lazy(true)
public final class EletricEngine implements IEngine {
	
	public EletricEngine() {
		System.out.println("EletricEngine:: 0-param constructor");
	}

	@Override
	public void startEngine() {
		System.out.println("EletricEngine.startEngine() :: Eletric Engine started");
	}

	@Override
	public void endEngine() {
		System.out.println("EletricEngine.endEngine() :: Eletric Engine ended");
	}

}
