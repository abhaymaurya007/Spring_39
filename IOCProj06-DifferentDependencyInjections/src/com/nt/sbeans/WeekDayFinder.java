//WeekDayFinder.java (target spring bean class)
package com.nt.sbeans;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDayFinder { 
	@Autowired  // Feild Injection
	@Qualifier("ldate4")
	private LocalDate date;  //HAS-A property
	@Autowired
	private  LocalTime  time;
	
	/*@Autowired
	public WeekDayFinder(LocalDate  date, LocalTime time) {
		System.out.println("WeekDayFinder:: 2-param constructor");
		this.date=date;
		this.time=time;
	}*/
	
/*	@Autowired  //constructor injection
	public WeekDayFinder(@Qualifier("ldate2") LocalDate  date) {
		System.out.println("WeekDayFinder:: 1-param constructor");
		this.date=date;
		
	}

	
	//setter methods for setter Injection (alt+shift+s,r)
	@Autowired
	@Qualifier("ldate1")
	public void setDate(LocalDate date) {
		System.out.println("WeekDayFinder.setDate() (setter method)");
		this.date = date;
	}
	
	@Autowired
	@Qualifier("ldate3")
	public  void  assignData(LocalDate date) {
		System.out.println("WeekDayFinder.assignData()(arbitrary method)");
		this.date=date;
	} */

/*@Autowired
	public void setTime(LocalTime time) {
		System.out.println("WeekDayFinder.setTime()");
		this.time = time;
	}*/

	
	
	/*@Autowired
	public void  putData(LocalTime  time) {
		System.out.println("WeekDayFinder.putData()");
		this.time=time;
	}*/
	
	
	
	//b.method
	public   String    showMessageOnDayOfTheWeek(String user) {
		System.out.println("WeekDayFinder.showMessageOnDayOfTheWeek()"+"... date::"+date+"....time::"+time);
		//get  current week day number
		int wno=date.getDayOfWeek().getValue();  //gives   1(monday) to 7(sunday)  number
		if(wno>=1 && wno<=5)
			return "Work Hard::  "+user;
		else
			return  "Relax  ::"+user;
	}

	
	

}
