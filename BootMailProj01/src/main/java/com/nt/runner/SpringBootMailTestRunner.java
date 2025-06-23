package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IPurchaseMgmtService;

@Component
public class SpringBootMailTestRunner implements  CommandLineRunner{
	@Autowired
	private  IPurchaseMgmtService  purchaseService;

	@Override
	public void run(String... args) throws Exception {
			try {
				String resultMsg=purchaseService.shopping(new String[] {"shirt","trouser","hat"},
						                                                                            new Double[] {4000.0,5000.0,3000.0}, 
						                                   new String[] {"aadil1508shaikh@gmail.com","143chikki143@gmail.com",
						                                		                     "t.sravanthi2010@gmail.com","dineshgs011@gmail.com","pk31915@gmail.com",
						                                		                      "natarazjavaarena@gmail.com","khondeomkar2@gmail.com"});
				System.out.println(resultMsg);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}//method
}//class
