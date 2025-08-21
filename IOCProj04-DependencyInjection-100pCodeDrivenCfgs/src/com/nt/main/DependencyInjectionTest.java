//DependencyInjectionTest.java (main class)
package com.nt.main;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WeekDayFinder;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main() (start)");
		//create  IOC container
		 AnnotationConfigApplicationContext  ctx=
				    new AnnotationConfigApplicationContext(AppConfig.class);
		 //get target spring bean class obj ref
		 //WeekDayFinder  finder=ctx.getBean("wdf",WeekDayFinder.class);
		    Class<WeekDayFinder> c1=  WeekDayFinder.class;
		    WeekDayFinder finder=ctx.getBean("weekDayFinder",c1);
		 
		    
		 //invoke the b.method
		 String msg=finder.showMessageOnDayOfTheWeek("raja");
		 System.out.println(msg);
		 
		 LocalDate  date=ctx.getBean("createLDate",LocalDate.class);
		 System.out.println("data::"+date);
		 
		 System.out.println("====================");
		 System.out.println("the Defauilt Bean ids ::"+Arrays.toString(ctx.getBeanDefinitionNames()));

		System.out.println("DependencyInjectionTest.main() (end)"); 
	}

}
