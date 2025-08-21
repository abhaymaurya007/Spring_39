//BillingOperationsMSController.java
package com.nt.ms;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing-api")
public class BillingOperationsMSController {
	@Value("${spring.application.instance-id}")
	private  String instanceid;
	@Value("${server.port}")
	private   String port;

	@GetMapping("/bill")
	public  ResponseEntity<String>   doBilling(){
		double billamt=0;
		try {
		//generate bill amount
		 billamt=new Random().nextDouble(1000000.0);
		Thread.sleep(30000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//return  the  output
		return new ResponseEntity<String>("BillAmount is ::"+billamt+"---"+instanceid+"...."+port,HttpStatus.OK);
	}
}
