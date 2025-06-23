package com.nt.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class SeasonFinderServiceImpl  implements ISeasonFinderService {

	@Override
	public String findSeason() {
		//get System date and time
		LocalDateTime ldt=LocalDateTime.now();
		//get current month 
		int month=ldt.getMonthValue();
		if(month>=3 && month<=6)
			  return  "Summer Season";
		else if(month>=7 && month<=9)
			return "Rainy Season";
		else
			return "Winter Season";
	}

}
