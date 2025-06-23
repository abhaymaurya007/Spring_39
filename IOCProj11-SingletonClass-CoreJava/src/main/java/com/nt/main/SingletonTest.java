package com.nt.main;

import java.awt.print.PrinterAbortException;

import com.nt.ston.Printer;

public class SingletonTest {

	public static void main(String[] args) {
		  // get access to singleton class obj ref
		 Printer  prn1=Printer.getInstance();
		 Printer  prn2=Printer.getInstance();
		 Printer  prn3=Printer.getInstance();
		 System.out.println(prn1.hashCode()+"  "+prn2.hashCode()+"  "+prn3.hashCode());
		 System.out.println("prn1==prn2?"+(prn1==prn2));
		 System.out.println("prn2==prn3?"+(prn2==prn3));
		 System.out.println("prn1==prn3?"+(prn1==prn3));
		 
		 //call b.method
		 prn1.printData("hello");
		 prn1.printData("hai");
		 
		 
		 
	}

}
