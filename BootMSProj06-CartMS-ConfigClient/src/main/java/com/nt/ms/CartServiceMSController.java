//CartServiceMSController.java
package com.nt.ms;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.client.BillingMsClientComp;

@RestController
@RequestMapping("/cart-api")
public class CartServiceMSController {
	@Autowired
	private  BillingMsClientComp  comp;
	@Value("${db.user}")
	private  String  dbuser;
	@Value("${db.pwd}")
	private  String  dbpwd;
	
	
	@GetMapping("/cart")
	public ResponseEntity<String>  cartOperations(){
		//generate order oid
		int oid=new Random().nextInt(100000);
		// assume some items added to the cart
		String items[]=new String[]{"shirt","trouser"};
		String cartMsg=Arrays.toString(items)+" are added to the cart having order id"+oid;
		//use  client comp  to invoke target ms
		String  billingMsg=comp.invokeDoBilling();
		//return the final output
		return  new ResponseEntity<String>(cartMsg+"...."+billingMsg+"...."+dbuser+"..."+dbpwd,HttpStatus.OK);
	}

}
