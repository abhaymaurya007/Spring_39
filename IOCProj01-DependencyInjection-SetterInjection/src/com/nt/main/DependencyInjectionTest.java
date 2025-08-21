//DependencyInjectionTest.java (main class)
package com.nt.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;
import com.nt.ston.Printer;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		  //create  IOC container 
		  ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
			/*
			 * //get Spring Bean class obj ref WishMessageGenerator
			 * wmg1=ctx.getBean("wmg",WishMessageGenerator.class); WishMessageGenerator
			 * wmg2=ctx.getBean("wmg",WishMessageGenerator.class); WishMessageGenerator
			 * wmg3=ctx.getBean("wmg",WishMessageGenerator.class);
			 * System.out.println(wmg1.hashCode()+"   "+wmg2.hashCode()+"  "+wmg3.hashCode()
			 * ); System.out.println("wmg1==wmg2?"+(wmg1==wmg2));
			 * System.out.println("wmg2==wmg3?"+(wmg2==wmg3));
			 * System.out.println("wmg1==wmg3?"+(wmg1==wmg3));
			 * 
			 * System.out.println("====================="); Printer
			 * prn1=ctx.getBean("prn",Printer.class); Printer
			 * prn2=ctx.getBean("prn",Printer.class);
			 * System.out.println(prn1.hashCode()+"  "+prn2.hashCode());
			 * 
			 * Printer prn11=ctx.getBean("prn1",Printer.class); Printer
			 * prn22=ctx.getBean("prn1",Printer.class);
			 * System.out.println(prn11.hashCode()+"  "+prn22.hashCode());
			 */
		  
		  
		  
		
		 	}

}
