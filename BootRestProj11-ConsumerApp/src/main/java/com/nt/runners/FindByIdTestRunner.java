package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.vo.DoctorVO;

//@Component
public class FindByIdTestRunner implements CommandLineRunner {
	@Autowired
	private  RestTemplate  template;

	@Override
	public void run(String... args) throws Exception {
		//base url
		String  url="http://localhost:7799/BootRestProj09-Doctor-RESTAPI/doctor-api/find/{id}";
		//invoke the method
		/*ResponseEntity<String> response=template.getForEntity(url, String.class,1);
		System.out.println("respose content::"+response.getBody());
		System.out.println("response status code::"+response.getStatusCode());
		*/	
		  String    body=template.getForObject(url, String.class, 1);
		  System.out.println(" response content ::"+body);
		  //convert String json  content to java class object
		  ObjectMapper  mapper=new ObjectMapper();
		  DoctorVO  vo=mapper.readValue(body, DoctorVO.class);
		  System.out.println("java object data::"+vo);
		  
		  
		System.exit(0);

	}

}
