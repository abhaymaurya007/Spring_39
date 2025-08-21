//BillingOperationsMSController.java
package com.nt.ms;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/billing-api")
@ConfigurationProperties(prefix = "org.nit")
@Slf4j
public class BillingOperationsMSController {
	@Value("${spring.application.instance-id}")
	private  String instanceid;
	@Value("${server.port}")
	private   String port;
	
	private  String name;
	private  String addrs;
	private  Long pincode;

	@GetMapping("/bill")
	public  ResponseEntity<String>   doBilling(){
		log.debug("doBilling() method (start) ");
		double billamt=0;
		//generate bill amount
		 billamt=new Random().nextDouble(1000000.0);
		 log.info("Bill amount is generated");
		//return  the  output
		 log.debug("result is generated");
		return new ResponseEntity<String>("BillAmount is ::"+billamt+"---"+instanceid+"...."+port,HttpStatus.OK);
	}
}
