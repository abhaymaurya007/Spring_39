//BillingOperationsMSController.java
package com.nt.ms;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/billing-api")
@RefreshScope
public class BillingOperationsMSController {
	@Value("${spring.application.instance-id}")
	private  String instanceid;
	@Value("${server.port}")
	private   String port;
	
	@Value("${db.user}")
	private  String  dbuser;
	@Value("${db.pwd}")
	private  String  dbpwd;
	

	@GetMapping("/bill")
	public  ResponseEntity<String>   doBilling(){
		double billamt=0;
		//generate bill amount
		 billamt=new Random().nextDouble(1000000.0);
		//return  the  output
		return new ResponseEntity<String>("BillAmount is ::"+billamt+"---"+instanceid+"...."+port+"..."+dbuser+"..."+dbpwd,HttpStatus.OK);
	}
}
