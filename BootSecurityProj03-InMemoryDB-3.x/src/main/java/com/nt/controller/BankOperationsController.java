package com.nt.controller;

import java.util.Map;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BankOperationsController {

	
	@GetMapping("/welcome")
	public  ResponseEntity<String>  showHome() {
		return new ResponseEntity<String>("welcome home ::",HttpStatus.OK);
	}
	
	
	@GetMapping("/offers")
	public  ResponseEntity<String>  showOffers() {
		return new ResponseEntity<String>("offer page ",HttpStatus.OK);
	}
	
	@GetMapping("/loan_approve")
	 @PreAuthorize("hasAuthority('MANAGER')") 
	public   ResponseEntity<String> approveLoanPage() {
		int  amount=new Random().nextInt(1200000);
		return new ResponseEntity<String>("Loan Approve Page amount::"+amount,HttpStatus.OK);
	
		
	}
	
	@GetMapping("/balance")
	@PreAuthorize("hasAnyAuthority('MANAGER','CUSTOMER')") 
	public    ResponseEntity<String>    showBalancePage(Map<String,Object> map) {
		int  amount=new Random().nextInt(200000);
		return  new ResponseEntity<String>("Balance is ::"+amount,HttpStatus.OK);
	}
	
	
}
