package com.nt;

import com.nt.sbeans.Company;
import com.nt.sbeans.PersonDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootIocProj07YmlApplication {

    private final Company company;

    BootIocProj07YmlApplication(Company company) {
        this.company = company;
    }

	public static void main(String[] args) {
		//get Access to  IOC container
		ApplicationContext ctx=SpringApplication.run(BootIocProj07YmlApplication.class, args);
		//get Spring bean class obj ref
		PersonDetails  details=ctx.getBean("pDetails",PersonDetails.class);
		System.out.println(details);
		//close the IOC container
		((ConfigurableApplicationContext) ctx).close();
	}//main

}//class
