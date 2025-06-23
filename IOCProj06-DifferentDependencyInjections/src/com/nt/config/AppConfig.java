//AppConfig.java (Configuration class)
package com.nt.config;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.nt.sbeans")
public class AppConfig {

    
	@Bean(name="ldate4")
	public  LocalDate  createLDate4() {
		System.out.println("AppConfig.createLDate4()");
		return   LocalDate.now();
	}
	
	@Bean(name="date")
	public  LocalDate  createLDate1() {
		System.out.println("AppConfig.createLDate1()");
		return   LocalDate.of(2002, 10, 20);
	}
	
	@Bean(name="ldate2")
	@Primary
	public  LocalDate  createLDate2() {
		System.out.println("AppConfig.createLDate2()");
		return   LocalDate.of(2000, 10, 20);
	}
	
	@Bean(name="ldate3")
	//@Primary
	public  LocalDate  createLDate3() {
		System.out.println("AppConfig.createLDate3()");
		return   LocalDate.of(2001, 10, 20);
	}



	
	@Bean(name="time")
	public  LocalTime  createTime() {
		System.out.println("AppConfig.createTime()");
		return LocalTime.now();
	}
	
	

}
