package com.nt.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.service.ISeasonFinderService;

@Controller
@RequestMapping("/season")  //Global path
public class SeasonFinderOperationsController {
	@Autowired
	private ISeasonFinderService  service;
	
	//@RequestMapping("/") //for home page
	@RequestMapping
	public  String   showHome() {
		//return LVN
		return "welcome";
	}
	
	@RequestMapping("/season")
	public   String    showSeason(Map<String,Object> map) {
		//use service
		String msg=service.findSeason();
		//keep the results in model attribute
		map.put("resultMsg", msg);
		//return LVN
		return  "display";
	}
	
	/*@RequestMapping("/report")
	public  String  showReport1() {
		System.out.println("SeasonFinderOperationsController.showReport1()");
		return "report1";
	}
	
	@RequestMapping("/REPORT")
	public  String  showReport2() {
		System.out.println("SeasonFinderOperationsController.showReport2()");
		return "report2";
	}
	*/
	
	/*@RequestMapping({"/report1","/report2","/report3"})
	public  String  showReport1() {
		System.out.println("SeasonFinderOperationsController.showReport1()");
		return "report1";
	}*/
	
	
	/*//@RequestMapping(value="/report",method=RequestMethod.GET)
	@GetMapping("/report")
	public  String  showReport1() {
		System.out.println("SeasonFinderOperationsController.showReport1()");
		return "report1";
	}
	
	//@RequestMapping(value="/report",method = RequestMethod.POST)
	@PostMapping("/report")
	public  String  showReport2() {
		System.out.println("SeasonFinderOperationsController.showReport2()");
		return "report2";
	}*/
	
	/*@GetMapping("/report")
		@PostMapping("/report")
		public  String  showReport2() {
			System.out.println("SeasonFinderOperationsController.showReport2()");
			return "report2";
		}
	*/
	
	@GetMapping("/report")
	public  String  showReport1() {
		System.out.println("SeasonFinderOperationsController.showReport1()");
		return "redirect:/test/report";
	}
	
	
	
	

}
