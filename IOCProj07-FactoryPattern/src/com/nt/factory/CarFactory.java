//CarFactory.java
package com.nt.factory;

import com.nt.comps.ICar;
import com.nt.comps.LuxoryCar;
import com.nt.comps.SportsCar;
import com.nt.comps.StandardCar;

//Factory pattern class
public class CarFactory {
	
	//static   factory method
	public static  ICar  getInstance(String type) {
		   ICar  car=null;
	   // factory pattern logic .. creating and returning one of the several related classes obj based on the data that is passed
		  if(type.equalsIgnoreCase("luxory"))
			    car=new LuxoryCar();
		  else if(type.equalsIgnoreCase("standard"))
			   car=new  StandardCar();
		  else if(type.equalsIgnoreCase("sports"))
			  car=new SportsCar();
		  else
			  throw  new IllegalArgumentException("Invalid Car Type");
			  
		return car;
	}

}
