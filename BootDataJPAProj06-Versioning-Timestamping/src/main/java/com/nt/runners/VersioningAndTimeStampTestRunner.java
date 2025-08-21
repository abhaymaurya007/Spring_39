package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.BankAccount;
import com.nt.service.IBankMgmtService;

@Component
public class VersioningAndTimeStampTestRunner implements CommandLineRunner {
	@Autowired
	private  IBankMgmtService  bankService;

	@Override
	public void run(String... args) throws Exception {
		/*	try {
			  BankAccount   account=new BankAccount();
			  account.setBalance(10332.0); account.setType("savings");
			  account.setHolderName("suresh");
			  String msg=bankService.openBankAccount(account);
			  System.out.println(msg);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		*/	
		
		/*	try {
				String msg=bankService.withdraw(100000000L, 2000.0);
				System.out.println(msg);
				BankAccount account=bankService.showAccountDetailsByAccno(100000000L);
				System.out.println("account is modified for"+account.getUpdateCount()+" times ");
				System.out.println("account is opened on ::"+account.getOpenedOn());
				System.out.println("account is last operated on ::"+account.getLastOperatedOn());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		*/
		
	try {
		String msg=bankService.deposite(100000001L, 5000.0);
		System.out.println(msg);
		BankAccount account=bankService.showAccountDetailsByAccno(100000001L);
		System.out.println("account is modified for"+account.getUpdateCount()+" times ");
		System.out.println("account is opened on ::"+account.getOpenedOn());
		System.out.println("account is last operated on ::"+account.getLastOperatedOn());
	}
	catch(Exception e) {
		e.printStackTrace();
	}


		
	}

}
