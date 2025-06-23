//VotingElgibilityCheck
package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("vec")
public class VotingEligibilityCheck {
	@Value("${per.id}")
	private   Integer id;
	@Value("${per.name}")
	private  String  name;
	@Value("${per.age}")
	private  Integer age;
	
	private  LocalDateTime dov;
	
	static {
		System.out.println("VotingEligibilityCheck:: static block ");
	}
	
	public VotingEligibilityCheck() {
		System.out.println("VotingEligibilityCheck:: 0-param constructor");
		
	}
	
	
	@PostConstruct
	public   void myInit() {
		System.out.println("VotingEligibilityCheck.myInit()");
		//initialize  left over properties
		 dov=LocalDateTime.now();
		 // check wheather age in injected  with valid value or not
		 if(age<=0   || age>=120)
			 throw new IllegalArgumentException("Invalid  age");
	}

	//b.method
	public String   verifyVotingElgiblity() {
		System.out.println("VotingEligibilityCheck.verifyVotingElgiblity() (B.method)");
		if(age>=18)
			return  "Mr/Miss/Mrs."+name +"  u  r elgible for Voting--> verified On::"+dov;
		else 
			return  "Mr/Miss/Mrs."+name +"  u  r not elgible for Voting--> Verified On::"+dov;
	}
	
	@PreDestroy
	public void myDestroy() {
		System.out.println("VotingEligibilityCheck.myDestroy()");
		//nullify  the bean properties
		age=null;
		name=null;
		id=null;
		dov=null;
	}

}
