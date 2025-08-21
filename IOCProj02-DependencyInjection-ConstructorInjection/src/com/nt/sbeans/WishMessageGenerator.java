//WishMEssageGenerator.java (target spring bean)
package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

public class WishMessageGenerator {
	//HAS-A property (Composition)
	private  LocalTime time;
	//HAS-A property
	private   LocalDate  date;
	private   int  age;

	 //parameterized constructor for constructor Injection
	public WishMessageGenerator(LocalTime time, LocalDate date,int age) {
		this.time=time;
		this.date=date;
		this.age=age;
		System.out.println("WishMessageGenerator:: 3-arg constructor");
	}
	
	public void setAge(int age) {
		System.out.println("WishMessageGenerator.setAge()");
		this.age=age;
	}
	
/*	//setter  method  for setter Injection (alt+shift+s,r)
	public void setTime(LocalTime time) {
		System.out.println("WishMessageGenerator.setTime()");
		this.time = time;
	}*/
	
	/*public void setDate(LocalDate date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}*/

	
	//b.method
	public  String showWishMessage(String user) {
		System.out.println("WishMessageGenerator.showWishMessage()::"+time+"...."+date+"...."+age);
		//get  current  hour of the day
		 int hour=time.getHour();
		 //generate the wish message
		 if(hour<12)
			 return  "Good Monrning:"+user;
		 else if(hour<16)
			 return "Good Afternoon:"+user;
		 else if(hour<18)
			 return "Good Evening:"+user;
		 else 
			 return "Good Night:"+user;
	}
	

}
