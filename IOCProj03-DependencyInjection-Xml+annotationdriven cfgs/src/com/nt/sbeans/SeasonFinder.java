//SeasonFinder.java (user-defined java class as spring bean)
package com.nt.sbeans;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	private  LocalDate   date;  //HAS- A priperty Composition
	
	public SeasonFinder() {
		System.out.println("SeasonFinder:: 0-arg constructor");
	}
	
	//setter method for setter injection
	@Autowired
	public  void  setDate(LocalDate  date) {
		System.out.println("SeasonFinder.setDate()");
		this.date=date;
	}
	
	//b.method
	public  String     showSeasonName() {
		System.out.println("SeasonFinder.showSeasonName()");
		//get  current month of the year
		int month=date.getMonthValue();
		if(month>=3 && month<=6)
			return "Summer Season";
		else if(month>=7 && month<=10)
			return  "Rainy Season";
		else
			return "Winter Season";
	}

}
