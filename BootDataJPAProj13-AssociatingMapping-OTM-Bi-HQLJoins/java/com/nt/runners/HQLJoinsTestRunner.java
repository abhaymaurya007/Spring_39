package com.nt.runners;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.nt.BootDataJpaProj13AssociatingMappingOtmBiApp;
import com.nt.entity.Customer;
import com.nt.entity.PhoneNumber;
import com.nt.service.ICustomerMgmtService;

@Component
public class HQLJoinsTestRunner implements CommandLineRunner {

    
	@Autowired
	private ICustomerMgmtService custService;

    
	@Override
	public void run(String... args) throws Exception {
		/*try {
		      List<Object[]>  list=custService.showCustomersAndPhoneNumbersUsingJoins();
		       list.forEach(row->{
		      	 System.out.println(Arrays.toString(row));
		       });
		}
		catch(Exception e) {
		  e.printStackTrace();
		}*/
		try {
			List<Object[]>  list=custService.showPhoneNumbersAndTheirCustomersDataUisngJoins();
			list.forEach(row->{
				System.out.println(Arrays.toString(row));
			});
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
	}// main

}// class
