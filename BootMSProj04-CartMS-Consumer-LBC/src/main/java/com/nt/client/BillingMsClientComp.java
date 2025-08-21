//BillingMsClientComp.java
package com.nt.client;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Component
public class BillingMsClientComp {
	@Autowired
	private  LoadBalancerClient  client;

	public   String  invokeDoBilling() {
		System.out.println("Load Balanced client obj class name ::"+client.getClass());
		// get  target MS instance (Less Load Factor) from  Eureka server
		ServiceInstance instance=client.choose("BillingMs");
		//pick certain  instance manually  to get the endpoint details
		URI baseurl=instance.getUri();
		//complete the endpoint url
		String  endpointUrl=baseurl+"/BillingMs/billing-api/bill";
		//use   RestTemplate to invoke the services of Provider MS
		RestTemplate  template=new RestTemplate();
		ResponseEntity<String>  resp=template.exchange(endpointUrl, HttpMethod.GET, null, String.class);
		//send the respose body as the return value
		return resp.getBody();
	}
}
