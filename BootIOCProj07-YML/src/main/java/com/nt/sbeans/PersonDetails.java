package com.nt.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component("pDetails")
@ConfigurationProperties(prefix= "per.info")
@Setter
@ToString
public class PersonDetails {
	private Integer id;
	private  String  name;
	private  String addrs;
	private   String email;
	private   Long  mobileNo;
	
	private  String[]  favColors;
	private  List<String> friends;
	private  Set<Long>  phoneNumbers;
	private   Map<String,Object> idDetails;
	private  Company  company;
	
	

}
