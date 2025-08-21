package com.nt.runners;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.nt.BootDataJpaProj07WorkingWithDateTimeValuesApp;
import com.nt.entity.Politician;
import com.nt.service.IPoliticianMgmtService;

@Component
public class DateAndTimeTestRunner implements CommandLineRunner {
	@Autowired
	private  IPoliticianMgmtService  politicianService;

    
	@Override
	public void run(String... args) throws Exception {
		/*try {
			Politician  polician=new Politician();
			polician.setPname("amit"); polician.setPaddrs("delhi");
			polician.setDob(LocalDate.of(1970, 10, 21));
			polician.setTob(LocalTime.of(11,10,24));
			polician.setDoj(LocalDateTime.of(1990, 10,20,11,12,14));
			//use service
			String msg=politicianService.regsiterPolitician(polician);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		*/
		
		/*	try {
				  politicianService.showAllPoliticianDetails().forEach(System.out::println);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		try {
			System.out.println(" politician age ::"+politicianService.calculatePoliticianAge(101));
		}
		catch(Exception  e) {
			e.printStackTrace();
		}

		
	}

}
