package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.Flipkart;

public class StrategyDPTest {

	public static void main(String[] args) {
		//create IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get  Access to  target Spring bean class obj ref
		Flipkart  fpkt=ctx.getBean("fpkt",Flipkart.class);
		//invoke the b.method
		String msg=fpkt.shopping(new String[] {"pathani","kheer","namaz topi"}, new double[] {1500.0,300.0,100.0});
		System.out.println(msg);
		
		Flipkart  fpkt1=ctx.getBean("fpkt",Flipkart.class);
		System.out.println(fpkt.hashCode()+"   "+fpkt1.hashCode());
		  
		
		
		
		//close the IOC container
		ctx.close();
		

	}

}
