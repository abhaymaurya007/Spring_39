package com.nt.main;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		//get  Target class obj ref  from Factory Pattern
		Flipkart fpkt=FlipkartFactory.getInstance("dhl");
		//invoke the b.method
		String msg=fpkt.shopping(new String[] {"dhoti-kurtha","sweets" ,"shadruch chatni" }, 
				                                          new double[] {3000.45,1000.01,300.17});
		System.out.println(msg);
		System.out.println("=================");
		
		Flipkart fpkt1=FlipkartFactory.getInstance("dhl");
		System.out.println(fpkt.hashCode()+"   "+fpkt1.hashCode());
		
		

	}

}
