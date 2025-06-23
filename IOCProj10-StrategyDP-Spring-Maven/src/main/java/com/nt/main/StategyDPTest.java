package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Vehicle;

public class StategyDPTest {

	public static void main(String[] args) {
		//create  IOC container
		AnnotationConfigApplicationContext  ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get Target  Spring bean class obj ref
		Vehicle  vehicle=ctx.getBean("vehicle",Vehicle.class);
		//invike the b.method
		vehicle.journey("hyd", "Goa");
		//close the IOC container 
		ctx.close();
	}

}
