package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.VotingEligibilityCheck;

public class SpringBeanLifeCycleTest {

	public static void main(String[] args) {
		// create  IOC Container
		AnnotationConfigApplicationContext  ctx=
				 new AnnotationConfigApplicationContext(AppConfig.class);
		//get Spring Bean class obj  ref
		 VotingEligibilityCheck  vec=ctx.getBean("vec",VotingEligibilityCheck.class);
		 //invoke the b.method
		 try {
			 String msg=vec.verifyVotingElgiblity();
			 System.out.println(msg);
		 }
		 catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		 //close the IOC container
		 ctx.close();

	}

}
