package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class HomeOperationsController {
	
	@RequestMapping("/")
	public  String  showHome() {
		return "redirect:doctor/home";
	}

}
