package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-api")
public class CustomerOperationsController {

	
	/*@GetMapping("/report/{no}/{name}")
	public  ResponseEntity<String>  showReport(@PathVariable("no") int cno,
			                                                                                    @PathVariable("name") String cname){
		System.out.println("CustomerOperationsController.showReport()::"+cno+"...."+cname);
		return  new ResponseEntity<String>(cno+"..."+cname, HttpStatus.OK);
	}*/
	
	//@GetMapping({"/report/{no}/{name}","/report","/report/{no}"})
	@GetMapping("/report/{no}/{name}")
	public  ResponseEntity<String>  showReport(@PathVariable(required = false) Integer no,
			                                                                                    @PathVariable(required = false) String name,
			                                                                                    @RequestParam  String addrs){
		System.out.println("CustomerOperationsController.showReport()::"+no+"...."+name+"...."+addrs);
		return  new ResponseEntity<String>(no+"..."+name+"...."+addrs, HttpStatus.OK);
	}
	
	@DeleteMapping("/remove/{no}/{name}")
	public  ResponseEntity<String>  deleteCustomer(@PathVariable(required = false) Integer no,
			                                                                                    @PathVariable(required = false) String name,
			                                                                                    @RequestParam  String addrs){
		System.out.println("CustomerOperationsController.deleteCustomer::"+no+"...."+name+"...."+addrs);
		return  new ResponseEntity<String>(no+"..."+name+"...."+addrs, HttpStatus.OK);
	}

	
	}
