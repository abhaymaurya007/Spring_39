package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.nt.ston.Printer;

@Configuration
@ComponentScan(basePackages = "com.nt")
public class AppConfig {
	
	@Bean(name="prn")
	@Scope("prototype")
	public  Printer  createPrinter() {
		//static  factory method based spring bean instantiation
		return  Printer.getInstance();
	}

}
