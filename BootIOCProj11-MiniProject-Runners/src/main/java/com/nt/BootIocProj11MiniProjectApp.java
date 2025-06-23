package com.nt;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

import com.nt.controller.PayrollOperationsController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootIocProj11MiniProjectApp {

	public static void main(String[] args) {
		System.out.println("BootIocProj03DIMiniProjectApp.main() (start)");
		// get IOC container
		SpringApplication.run(BootIocProj11MiniProjectApp.class, args);
			  
			System.out.println("BootIocProj03DIMiniProjectApp.main() (end)");
	}// main

}// class
