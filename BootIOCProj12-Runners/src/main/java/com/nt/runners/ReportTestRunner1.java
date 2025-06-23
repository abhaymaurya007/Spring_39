//ReportTestRunner1.java
package com.nt.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
//@Order(-1)
public class ReportTestRunner1 implements CommandLineRunner,Ordered{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("ReportTestRunner1.run() (CR)");
		System.out.println("The Command line args are ::"+Arrays.toString(args));
		
		System.out.println("================================");

	}

	@Override
	public int getOrder() {
		return -10;
	}

}
