package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.vo.DoctorVO;

//@Component
public class SaveObjectTestRunner implements CommandLineRunner {
	@Autowired
	private  RestTemplate  template;

	@Override
	public void run(String... args) throws Exception {
		//base url
		String  url="http://localhost:7799/BootRestProj09-Doctor-RESTAPI/doctor-api/register";
		//  convert  oobject data into   json content
		 DoctorVO vo=new  DoctorVO("rajesh","MD",550.0);
		 ObjectMapper mapper=new ObjectMapper();
		 String json_content=mapper.writeValueAsString(vo);
		 //prepare  headers
		 HttpHeaders headers=new HttpHeaders();
		 headers.setContentType(MediaType.APPLICATION_JSON);
		 //create HttpEntity Object having json body and headers
		 HttpEntity<String> entity=new HttpEntity<String>(json_content, headers);
		 
		//invoke the method
		ResponseEntity<String> resp=template.exchange(url, HttpMethod.POST, entity, String.class);
		System.out.println("response content ::"+resp.getBody());
		System.out.println("response status code ::"+resp.getStatusCode());
	
		System.exit(0);

	}

}
