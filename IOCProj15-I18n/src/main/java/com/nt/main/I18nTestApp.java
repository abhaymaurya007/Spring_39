package com.nt.main;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;

public class I18nTestApp {
	
	public static void main(String[] args) {
		 //read Locale information from the  enduser
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter  language code ::");
		  String lang=sc.next();
		  System.out.println("eneter country code::");
		  String  country=sc.next();
		
		  //create Locale object having language code and country code
		  Locale locale=new Locale(lang,country);
		  
		 
		  
		//create  IOC container
				AnnotationConfigApplicationContext  ctx=
						                  new AnnotationConfigApplicationContext(AppConfig.class);
	    //get  messages from Locale specific  properties file
				String msg1=ctx.getMessage("welcome.msg", new String[] {"raja"},"msg1", locale);
				String msg2=ctx.getMessage("goodbye.msg", new Object[] { },"msg2", locale);
				String msg3=ctx.getMessage("wishing.msg", new Object[] { },"msg3", locale);
				
		System.out.println(msg1+"......"+msg2+"......."+msg3);
				
		//close the container
		ctx.close();
				
	}

}
