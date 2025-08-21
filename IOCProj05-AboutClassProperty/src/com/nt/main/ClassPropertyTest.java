package com.nt.main;

import java.time.LocalDate;
import java.util.Arrays;

import com.nt.comp.Demo;

public class ClassPropertyTest {

	public static void main(String[] args) {
		Class<Demo> c1=Demo.class;
		System.out.println("c1 obj maintained class name::"+c1.getName());
		System.out.println("c1 obj class super class ::"+c1.getSuperclass());
		System.out.println("c1 obj class Fields ::"+Arrays.toString(c1.getDeclaredFields()));
		System.out.println("c1 obj  class constructors ::"+Arrays.toString(c1.getDeclaredConstructors()));
		System.out.println("c1 obj  class  methods ::"+Arrays.toString(c1.getDeclaredMethods()));
		System.out.println("c1 obj interfaces list::"+Arrays.toString(c1.getInterfaces()));
		System.out.println("----------------------------");
		Class<LocalDate> c2=LocalDate.class;
		System.out.println("c2 obj maintained class name::"+c2.getName());
		System.out.println("c2 obj class super class ::"+c2.getSuperclass());
		System.out.println("c2 obj class Fields ::"+Arrays.toString(c2.getDeclaredFields()));
		System.out.println("c2 obj  class constructors ::"+Arrays.toString(c2.getDeclaredConstructors()));
		System.out.println("c2 obj  class  methods ::"+Arrays.toString(c2.getDeclaredMethods()));
		System.out.println("c2 obj interfaces list::"+Arrays.toString(c2.getInterfaces()));
			
		
	}

}
