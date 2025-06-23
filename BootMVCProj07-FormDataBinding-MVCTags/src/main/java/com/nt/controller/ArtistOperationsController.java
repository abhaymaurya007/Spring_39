package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Artist;

@Controller
public class ArtistOperationsController {
	
	@GetMapping("/")
	public  String   showHomePage() {
		//return LVN
		return "welcome";
	}
	
	@GetMapping("/register")   // For form launching
	public  String  showArtirstRegistrationPage(@ModelAttribute("artst") Artist artist) {
		System.out.println("Model class object data(For Form launching) ::"+artist );
		//return LVN (form page)
		return  "register_artist_form";
	}
	
	@PostMapping("/register")  //for  form submission
	public  String  registerArtirst(Map<String,Object> map, @ModelAttribute Artist artist) {
		System.out.println("Model class obj data (form data submission)"+artist);
		//write b.logic
		if(artist.getFee()>200000.0)
			map.put("msg", "expensive Actor");
		else
			map.put("msg", "Affordable Actor");
		//return LVN (result)
		return  "result";
	}
	

}
