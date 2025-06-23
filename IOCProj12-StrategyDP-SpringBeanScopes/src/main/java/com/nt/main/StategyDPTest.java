package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Vehicle;
import com.nt.ston.Printer;

public class StategyDPTest {

	public static void main(String[] args) {
		//create  IOC container
		AnnotationConfigApplicationContext  ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get Target  Spring bean class obj ref
		Vehicle  vehicle=ctx.getBean("vehicle",Vehicle.class);
		//invike the b.method
		vehicle.journey("hyd", "Goa"); 
		
		/*System.out.println("==========================");
		Printer prn1=ctx.getBean("prn",Printer.class);
		Printer prn2=ctx.getBean("prn",Printer.class);
		System.out.println(prn1.hashCode()+"   "+prn2.hashCode());*/
		
	/*	Vehicle  vehicle1=ctx.getBean("vehicle",Vehicle.class);
		Vehicle  vehicle2=ctx.getBean("vehicle",Vehicle.class);
		Vehicle  vehicle3=ctx.getBean("vehicle",Vehicle.class);
		System.out.println(vehicle1.hashCode()+"  "+vehicle2.hashCode()+"   "+vehicle3.hashCode());*/
		
	/*	Printer  prn1=ctx.getBean("prn",Printer.class);
		Printer  prn2=ctx.getBean("prn",Printer.class);
		Printer  prn3=ctx.getBean("prn",Printer.class);
		System.out.println(prn1.hashCode()+"  "+prn2.hashCode()+"  "+prn3.hashCode()); */
		
		
		
		
		
		
		
		//close the IOC container 
		ctx.close();
	}

}
