package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-api")
public class CustomerOperationsController {
	
	@PostMapping("/register")
	public  ResponseEntity<String>   registerCustomer(){
		System.out.println("CustomerOperationsController.registerCustomer()");
		return new ResponseEntity<String>("For  Insertion Operation",HttpStatus.OK);
	}
	
	@GetMapping("/report")
	public  ResponseEntity<String>   showReport(){
		System.out.println("CustomerOperationsController.showReport()");
		return new ResponseEntity<String>("Report Generation Operation",HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public  ResponseEntity<String>   updateCustomer(){
		System.out.println("CustomerOperationsController.updateCustomer()");
		return new ResponseEntity<String>("Customer updateOperation",HttpStatus.OK);
	}
	
	@PatchMapping("/updateEmail")
	public  ResponseEntity<String>   updateCustomerEmail(){
		System.out.println("CustomerOperationsController.updateCustomerEmail()");
		return new ResponseEntity<String>("Customer Email updateOperation",HttpStatus.OK);
	}
	
	@DeleteMapping("/remove")
	public  ResponseEntity<String>   deleteCustomer(){
		System.out.println("CustomerOperationsController.deleteCustomer()");
		return new ResponseEntity<String>("Customer Delete Operation",HttpStatus.OK);
	}
	
	

	
}
