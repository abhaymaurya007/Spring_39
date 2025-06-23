package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.CustomerDetails;

public class ValueAnnotationTest {

	public static void main(String[] args) {
		// create IOC container
		AnnotationConfigApplicationContext  ctx=
				      new AnnotationConfigApplicationContext(AppConfig.class);
		//get Target spring bean class obj ref
		CustomerDetails details=ctx.getBean("cust",CustomerDetails.class);
		System.out.println(details);

		//close the IOC container
		 ctx.close();
	}

}
