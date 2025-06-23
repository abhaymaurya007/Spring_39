package com.nt;

import java.io.PrintStream;
import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.SeasonFinder;

@SpringBootApplication
public class BootIocProj01SeasonFinderAppApplication {
	
	
	//  make  the dependent pre-defined java class as spring bean
	@Bean(name="date")
	public   LocalDate   createLDate() {
		System.out.println("BootIocProj01SeasonFinderAppApplication.createLDate()");
		 return  LocalDate.now();
	}

	public static void main(String[] args) {
		System.out.println("BootIocProj01SeasonFinderAppApplication.main() (start)");
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(BootIocProj01SeasonFinderAppApplication.class, args);
		System.out.println("ctx obj class name::"+ctx.getClass());
		// get Access to target Spring bean class obj ref
		SeasonFinder  finder=ctx.getBean("sf",SeasonFinder.class);
		//invoke the b.method
		String msg=finder.showSeason();
		System.out.println("Season name::"+msg);
		
		// close  the  IOC container
		((ConfigurableApplicationContext) ctx).close();
		
		System.out.println("BootIocProj01SeasonFinderAppApplication.main() (end)");
	}

}
