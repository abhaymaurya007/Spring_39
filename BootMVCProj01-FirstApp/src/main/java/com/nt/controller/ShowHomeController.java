package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShowHomeController {
	
	/*	@RequestMapping("/home")
		public  String  showHome() {
			System.out.println("ShowHomeController.showHome()");
			//return LVN
			return  "welcome";
		}
	*/
	
	@RequestMapping("/")
	public  String  showHome() {
		//return LVN
		return  "welcome";
	}
	
}
