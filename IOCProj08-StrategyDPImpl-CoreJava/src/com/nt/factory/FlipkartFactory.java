//Factory Pattern
package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.DHL;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;
import com.nt.comps.ICourier;

public class FlipkartFactory {
	
	//static factory method  having  logic to create and
	//return  target class obj having one of its dependent class obj
	public   static   Flipkart  getInstance(String  courierType) {
		System.out.println("FlipkartFactory.getInstance()");
		//  create  One of  the Dependent class object
		   ICourier  courier=null;
		   if(courierType.equalsIgnoreCase("dtdc"))
			   courier=new DTDC();
		   else if(courierType.equalsIgnoreCase("bDart"))
			     courier=new BlueDart();
		   else if(courierType.equalsIgnoreCase("dhl"))
			     courier=new DHL();
		   else
			    throw  new IllegalArgumentException("Invalid Courier name ");
		   //create target class obj
		   Flipkart fpkt=new Flipkart();
		   //assign  dependent class obj(Courier) to Target class obj
		   fpkt.setCourier(courier);
		   return fpkt;
		   
	}

}
