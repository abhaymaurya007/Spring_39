package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("company")
//@ConfigurationProperties(prefix="comp.info")
public class Company {
	private  Integer cid;
	private  String  cname;
	private  String location;
	private   Long pinCode;

}
