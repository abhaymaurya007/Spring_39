//Flipkart.java(target class)
package com.nt.comps;

import java.util.Arrays;
import java.util.Random;
   
public final class Flipkart {
	 //HAS-A  property (Composition)
	private  ICourier  courier;
	
	public Flipkart() {
		System.out.println("Flipkart:: 0-param constructor");
	}
	
	//setter method for setter Injection
	public  void setCourier(ICourier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier=courier;
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
