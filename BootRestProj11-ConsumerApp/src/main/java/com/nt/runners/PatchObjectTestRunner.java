package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nt.vo.DoctorVO;

@Component
public class PatchObjectTestRunner implements CommandLineRunner {
	@Autowired
	private  RestTemplate  template;

	@Override
	public void run(String... args) throws Exception {
		//  set  factory on RestTemplate class object
		template.setRequestFactory(new HttpComponentsClientHttpRequestFactory());
		//base url
		String  url="http://localhost:7799/BootRestProj09-Doctor-RESTAPI/doctor-api/update/{id}/{percent}";
		//invoke the method
		ResponseEntity<String> resp=template.exchange(url,HttpMethod.PATCH, null, String.class,36,20.0);
		System.out.println("response content ::"+resp.getBody());
		System.out.println("response status code ::"+resp.getStatusCode());
	
		System.exit(0);

	}

}
