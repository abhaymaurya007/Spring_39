package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootJmsProj01SenderAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootJmsProj01SenderAppApplication.class, args);
	}

}
