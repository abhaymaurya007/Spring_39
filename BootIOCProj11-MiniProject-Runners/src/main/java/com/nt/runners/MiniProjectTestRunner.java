package com.nt.runners;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.controller.PayrollOperationsController;
import com.nt.model.Employee;

@Component
public class MiniProjectTestRunner implements CommandLineRunner {
	@Autowired
	private PayrollOperationsController controller;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("MiniProjectTestRunner.run()");
		Scanner  sc=null; 
		try {
		  System.out. println("======================= Registering the Employee ===================" ); 
		   sc=new Scanner(System.in);
		  System.out.println("Enter  emp name ::"); String name=sc.next();
		  System.out.println("Enter  emp desg ::"); String desg=sc.next();
		  System.out.println("Enter  emp salary ::"); double salary=sc.nextDouble();
		  System.out.println("Enter  emp deptno (10,20,30,40) ::");
		  int	  deptno=sc.nextInt(); //create Employee class obj having data 
		   Employee emp1=new Employee();
		  emp1=new Employee(); emp1.setEname(name); emp1.setDesg(desg);
		  emp1.setSalary(salary); emp1.setDeptno(deptno);
		  
		  //invoke the b.method try { 
		  String msg=controller.processEmployeeForRegistration(emp1); 
		  System.out.println(msg);
		  } catch(Exception e) {
		  System.out.println("Internal problem --- Try again::"+e.getMessage());
		  //e.printStackTrace(); 
		  }
		  
		  System.out. println("================ Getting Employee Details By Desgs=================="); // read inputs from enduser
		  
		  System.out.println("Enter Desg1::"); 
		  String desg1=sc.next();
		  
		  System.out.println("Enter Desg2::");
		  String desg2=sc.next();
		  
		  System.out.println("Enter Desg3::"); 
		  String desg3=sc.next();
		  
		  
		  
		  //invoke the b.methods 
		  try {
		   List<Employee>  list=controller.processEmployeesByDesgs(desg1, desg2, desg3);
		  System.out.println("Employees Details  for the given Desgs ::");
		  if(list.size()!=0) {
			  list.forEach(emp->{ System.out.println(emp); }); 
			  } else{
		  		   System.out.println("No Records found"); 
		  		   }
		  }//try
		  catch(Exception e) {
		  System.out.println("Internal problem ...try again ::"+e.getMessage());
		  }


	}

}
