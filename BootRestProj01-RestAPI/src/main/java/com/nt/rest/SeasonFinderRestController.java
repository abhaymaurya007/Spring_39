package com.nt.rest;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/season-api")
public class SeasonFinderRestController {
	
	@GetMapping("/display")  
	public  ResponseEntity<String>  showSeasonName(){  //endpoint
		//write b.logic
		LocalDate date=LocalDate.now();
		int month=date.getMonthValue();
		String season=null;
		if(month>=3 && month<=6)
			season="Summer";
		else if(month>=7 && month<=10)
			season="Rainy";
		else
			season="Winter";
		//return ResponseEntity object
		return new ResponseEntity<String>("Season name:"+season,HttpStatus.OK);
	}

}
