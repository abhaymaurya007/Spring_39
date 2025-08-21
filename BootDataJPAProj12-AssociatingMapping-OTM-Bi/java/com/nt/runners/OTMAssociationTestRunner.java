package com.nt.runners;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.nt.BootDataJpaProj12AssociatingMappingOtmBiApp;
import com.nt.entity.Customer;
import com.nt.entity.PhoneNumber;
import com.nt.service.ICustomerMgmtService;

@Component
public class OTMAssociationTestRunner implements CommandLineRunner {

    
	@Autowired
	private ICustomerMgmtService custService;

    
	@Override
	public void run(String... args) throws Exception {

		/*		try {
					//parent object
					Customer cust=new Customer("raja1","hyd1");
					//child objs
					PhoneNumber  ph1=new PhoneNumber(888888881L,"airtel","personal");
					PhoneNumber  ph2=new PhoneNumber(999999991L,"vi","office");
					//add parent to childs
					ph1.setCust(cust); ph2.setCust(cust);
					//add childs to parent
					cust.setPhones(Set.of(ph1,ph2));
					//save objs
					String msg=custService.registerCustomerWithPhoneNumbers(cust);
					System.out.println(msg);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
		*/

		/*try {
		    //child objs
			PhoneNumber ph1=new PhoneNumber(77777777L, "airtel","office");
		    PhoneNumber ph2=new PhoneNumber(88888888L, "jio","personal");
		    //parent object
		    Customer cust=new Customer("rajesh", "hyd");
		    //map parent with childs
		    ph1.setCust(cust); ph2.setCust(cust);
		    // map  childs with parent
		    Set<PhoneNumber>  childsSet=new HashSet<PhoneNumber>();
		    childsSet.add(ph1); childsSet.add(ph2);
		    cust.setPhones(childsSet);
		    // prepare  list of childs
		    List<PhoneNumber>  list=Arrays.asList(ph1,ph2);
		    
		   String msg=custService.registerPhoneNumbersWithCustomer(list);	
		   System.out.println(msg);
		}//try
		catch(Exception e) {
			e.printStackTrace();
		}*/

		/*try {
			List<Customer>  list=custService.showCustomerAndHisPhoneNumbers();
			list.forEach(cust->{
				System.out.println("Parent ::"+cust);
					Set<PhoneNumber>  childs=cust.getPhones();
					childs.forEach(ph->{
						System.out.println("Child::"+ph);
					});
				
				System.out.println("--------------------");
			});
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/

		/*	try {
				List<PhoneNumber> list=custService.showPhoneNumbersAndTheirCustomers();
					list.forEach(ph->{
						System.out.println("child ::"+ph);
						Customer  cust=ph.getCust();
						System.out.println("Parent ::"+cust);
					});
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		/*	try {
				String msg=custService.removeCustomerAndHisPhoneNumbers(4);
				System.out.println(msg);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		*/
		
		/*try {
			String msg=custService.removePhoneNumbersAndTheirCustomer(List.of(1000,1001));
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*try {
			String msg=custService.removeAllPhoneNumbersOfACustomer(2);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*	try {
				String  msg=custService.removeOnePhoneNumberOfACustomer(1001);
				System.out.println(msg);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		/*try {
			PhoneNumber ph=new PhoneNumber();
			ph.setMobileno(99999941L);ph.setProvider("airtel"); ph.setType("personal");
			String msg=custService.addNewPhoneNumberToACustomer(2, ph);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		try {
			String  msg=custService.removePhoneNumbersAndTheirCustomer(2);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}// main

}// class
