//WeekDayFinder.java (target spring bean class)
package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component("wdf")
@Component
public class WeekDayFinder { 
	@Autowired  // Feild Injection
	private LocalDate date;  //HAS-A property
	
	public WeekDayFinder() {
		System.out.println("WeekDayFinder:: 0-param constructor");
	}
	
	//b.method
	public   String    showMessageOnDayOfTheWeek(String user) {
		System.out.println("WeekDayFinder.showMessageOnDayOfTheWeek()");
		//get  current week day number
		int wno=date.getDayOfWeek().getValue();  //gives   1(monday) to 7(sunday)  number
		if(wno>=1 && wno<=5)
			return "Work Hard::  "+user;
		else
			return  "Relax  ::"+user;
	}
	

}
