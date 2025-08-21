package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
public class BootMsProj08BillingMsProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootMsProj08BillingMsProviderApplication.class, args);
	}

}
