package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import lombok.extern.slf4j.Slf4j;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableEurekaServer 
@Slf4j 
public class BootMsProj08EurekaServerApp {

	public static void main(String[] args) {
		log.debug("start of main(-) method (Eureka server)");
		SpringApplication.run(BootMsProj08EurekaServerApp.class, args);
		log.debug("end of main(-) method (Eureka server)");
		
	}

}
