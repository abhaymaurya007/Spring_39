//ReportTestRunner1.java
package com.nt.runners;

import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(-100)
public class ReportTestRunner2 implements ApplicationRunner,Ordered {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("ReportTestRunner2.run() (AR)");
		System.out.println("Non Option Args are ::"+args.getNonOptionArgs());
		System.out.println("Option args are ::");
		Set<String>  namesSet=args.getOptionNames();
		namesSet.forEach(name->{
			System.out.println(name+"....."+args.getOptionValues(name));
		});
		System.out.println("===============================");
	}

	@Override
	public int getOrder() {
		return -5;
	}

}
