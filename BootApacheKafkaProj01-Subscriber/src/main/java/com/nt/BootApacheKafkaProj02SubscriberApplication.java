package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class BootApacheKafkaProj02SubscriberApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootApacheKafkaProj02SubscriberApplication.class, args);
	}

}
