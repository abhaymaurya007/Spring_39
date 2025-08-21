//Flipkart.java(target class)
package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
   
@Component("fpkt")
public final class Flipkart {
	 //HAS-A  property (Composition)
	@Autowired   //Field Injection
	@Qualifier("dtdc")
	private  ICourier  courier;
	
	public Flipkart() {
		System.out.println("Flipkart:: 0-param constructor");
	}
	
	//b.method
	public  String   shopping(String items[], double prices[]) {
		System.out.println("Flipkart.shopping()");
	    double  billAmt=0;
	    for(double p:prices)
	    	billAmt=billAmt+p;
	    //generate psuedo random number  order id
	    int oid=new Random().nextInt(200000);
	    //use  courier service for delivery
	    String msg=courier.deliver(oid);
	    //prepare  final message for customer 
	    String finalMsg=Arrays.toString(items)+"  are purchased having prices"+Arrays.toString(prices)+"  , Bill Amount is::"+billAmt+"....."+msg;
	     //return  the messsage
	     return  finalMsg;
	}

}
