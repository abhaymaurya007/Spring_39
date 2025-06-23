package com.nt;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.nt.controller.PayrollOperationsController;

@SpringBootApplication(exclude = JdbcTemplateAutoConfiguration.class)
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootIocProj04DIMiniProjectApp {
	@Autowired
	private  Environment  env;
	
	@Bean
	public   ComboPooledDataSource  createC3P0Ds()throws Exception {
		  ComboPooledDataSource  ds=new ComboPooledDataSource();
		  ds.setDriverClass(env.getProperty("spring.datasource.driver-class-name"));
		  ds.setJdbcUrl(env.getProperty("spring.datasource.url"));
		  ds.setUser(env.getProperty("spring.datasource.username"));
		  ds.setPassword(env.getProperty("spring.datasource.password"));
		  return ds;
	}

   
	public static void main(String[] args) {
		System.out.println("BootIocProj03DIMiniProjectApp.main() (start)");
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(BootIocProj04DIMiniProjectApp.class, args);
		// get  Controller class obj ref
       PayrollOperationsController  controller=ctx.getBean("payroll",PayrollOperationsController.class);
		
		/*
		 * System.out.
		 * println("======================= Registering the Employee ==================="
		 * ); Scanner sc=new Scanner(System.in);
		 * System.out.println("Enter  emp name ::"); String name=sc.next();
		 * System.out.println("Enter  emp desg ::"); String desg=sc.next();
		 * System.out.println("Enter  emp salary ::"); double salary=sc.nextDouble();
		 * System.out.println("Enter  emp deptno (10,20,30,40) ::"); int
		 * deptno=sc.nextInt(); //create Employee class obj having data Employee
		 * emp1=new Employee(); emp1.setEname(name); emp1.setDesg(desg);
		 * emp1.setSalary(salary); emp1.setDeptno(deptno);
		 * 
		 * //invoke the b.method try { String
		 * msg=controller.processEmployeeForRegistration(emp1); System.out.println(msg);
		 * } catch(Exception e) {
		 * System.out.println("Internal problem --- Try again::"+e.getMessage());
		 * //e.printStackTrace(); }
		 * 
		 * System.out.
		 * println("================ Getting Employee Details By Desgs=================="
		 * ); // read inputs from enduser
		 * 
		 * System.out.println("Enter Desg1::"); String desg1=sc.next();
		 * 
		 * System.out.println("Enter Desg2::"); String desg2=sc.next();
		 * 
		 * System.out.println("Enter Desg3::"); String desg3=sc.next();
		 * 
		 * 
		 * 
		 * //invoke the b.methods try { List<Employee>
		 * list=controller.processEmployeesByDesgs(desg1, desg2, desg3);
		 * System.out.println("Employees Details  for the given Desgs ::");
		 * if(list.size()!=0) { list.forEach(emp->{ System.out.println(emp); }); } else
		 * { System.out.println("No Records found"); }
		 * 
		 * } catch(Exception e) {
		 * System.out.println("Internal problem ...try again ::"+e.getMessage()); }
		 */
       
       System.out.println("All spring bean ids are ::"+Arrays.toString(ctx.getBeanDefinitionNames()));
       System.out.println("Spring Beans count ::"+ctx.getBeanDefinitionCount());
       
       System.out.println("BootIocProj03DIMiniProjectApp.main() (end)");
	}//main

}//class
