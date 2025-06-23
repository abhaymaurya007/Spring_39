package com.nt;

import com.nt.sbeans.PersonDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootIocProj06BulkInjectionApplication {

    
	public static void main(String[] args) {
		 //get Access to IOC container 
		ApplicationContext ctx=SpringApplication.run(BootIocProj06BulkInjectionApplication.class, args);
		//get  Spring  Bean class obj ref
		PersonDetails  details=ctx.getBean("pDetails",PersonDetails.class);
		System.out.println(details);
		//close  container
		((ConfigurableApplicationContext) ctx).close();
	}

}
