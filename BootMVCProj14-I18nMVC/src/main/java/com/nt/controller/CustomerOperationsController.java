package com.nt.controller;
import java.util.Date;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.nt.model.Customer;

@Controller
public class CustomerOperationsController {
	
	@GetMapping("/")
	public   String showHomePage() {
		//return  LVN
		return "welcome";
	}
	
	@GetMapping("/register")
	public  String  regsiterCustomer(@ModelAttribute("cust") Customer cust,
			                                                      Map<String,Object>  map) {
		//add model attributes  to the shared memory
		map.put("sysDate", new Date());
		map.put("distance",new Random().nextInt(10000000));
		map.put("price",new Random().nextFloat(20000.0f));
		map.put("avg",0.63);
		
		//return LVN
		return "customer_register";
	}

}
