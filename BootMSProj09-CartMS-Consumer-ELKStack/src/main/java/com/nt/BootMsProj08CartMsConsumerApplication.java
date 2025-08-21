package com.nt;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableDiscoveryClient
@Slf4j
public class BootMsProj08CartMsConsumerApplication {

	public static void main(String[] args) {
		log.debug("start of  main(-) CartMS");
		SpringApplication.run(BootMsProj08CartMsConsumerApplication.class, args);
	     log.debug("end of main(-)  CartMs");
	}

}
