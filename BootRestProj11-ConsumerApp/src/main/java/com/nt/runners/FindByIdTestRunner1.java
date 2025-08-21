package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.vo.DoctorVO;

//@Component
public class FindByIdTestRunner1 implements CommandLineRunner {
	@Autowired
	private  RestTemplate  template;

	@Override
	public void run(String... args) throws Exception {
		//base url
		String  url="http://localhost:7799/BootRestProj09-Doctor-RESTAPI/doctor-api/find/{id}";
		//invoke the method
		ResponseEntity<String> resp=template.exchange(url, HttpMethod.GET, null, String.class,1);
		System.out.println("response content ::"+resp.getBody());
		System.out.println("response status code ::"+resp.getStatusCode());
		//convert  json String content to  java class object
		ObjectMapper mapper=new ObjectMapper();
		DoctorVO doctor=mapper.readValue(resp.getBody(), DoctorVO.class);
		  System.out.println("Doctor class obj::"+doctor);
		  
		System.exit(0);

	}

}
