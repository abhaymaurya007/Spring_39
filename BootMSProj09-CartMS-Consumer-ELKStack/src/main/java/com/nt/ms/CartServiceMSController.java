//CartServiceMSController.java
package com.nt.ms;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.BillingMsClientComp;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/cart-api")
@Slf4j
public class CartServiceMSController {
	@Autowired
	private  BillingMsClientComp  comp;
	
	@GetMapping("/cart")
	public ResponseEntity<String>  cartOperations(){
		log.debug("CartServiceMSController.cartOperations()");
		//generate order oid
		int oid=new Random().nextInt(100000);
		log.debug("order id is generated");
		// assume some items added to the cart
		String items[]=new String[]{"shirt","trouser"};
		String cartMsg=Arrays.toString(items)+" are added to the cart having order id"+oid;
		//use  client comp  to invoke target ms
		String  billingMsg=comp.invokeDoBilling();
		log.debug("Destination  MS is invoked");
		//return the final output
		return  new ResponseEntity<String>(cartMsg+"...."+billingMsg,HttpStatus.OK);
	}

}
