package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.vo.DoctorVO;

//@Component
public class FindAllTestRunner2 implements CommandLineRunner {
	@Autowired
	private  RestTemplate  template;

	@Override
	public void run(String... args) throws Exception {
		//base url
		String  url="http://localhost:7799/BootRestProj09-Doctor-RESTAPI/doctor-api/all";
		//invoke the method
		ResponseEntity<String> resp=template.exchange(url, HttpMethod.GET, null, String.class);
		System.out.println("response content ::"+resp.getBody());
		System.out.println("response status code ::"+resp.getStatusCode());
		//convert  json String content to  java class object
		ObjectMapper  mapper=new ObjectMapper();
		List<DoctorVO>  list=mapper.readValue(resp.getBody(), new TypeReference<List<DoctorVO>>() {	});
		System.out.println("List  content  is ::"+list);
			System.exit(0);

	}

}
