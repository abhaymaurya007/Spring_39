package com.nt.main;

import java.lang.reflect.Constructor;

import com.nt.ston.Printer;

public class ReflectionAPITest {
	public static void main(String[] args) throws Exception{
		  Class c1=Printer.class;
		  //get  all constructors of the class
		  Constructor  cons[]=c1.getDeclaredConstructors();
		  //give access to private  constructor
		  cons[0].setAccessible(true);
		  // create object by using accessed constructor
		  Object obj=cons[0].newInstance();
		  Printer p=(Printer) obj;
		  System.out.println("p obj class name::"+p.getClass());
	}

}
