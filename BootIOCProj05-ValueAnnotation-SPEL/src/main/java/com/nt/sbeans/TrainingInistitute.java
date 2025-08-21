package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component("inst")
//@Data
@ToString
public class TrainingInistitute {
	 //Injecting   random  value
	@Value("#{T(java.lang.Math).round(T(java.lang.Math).random() * 99)}")  //generates random number
	private  Integer id;
	// Injecting the values collected from the properties fil
	@Value("${inst.name}")
	private  String  name;
	@Value("${inst.addrs}")
	private   String  addrs;
	@Value("${inst.phone}")
	private  Long contact;
	@Value("${inst.email}")
	private   String email;
	@Value("${inst.category}")
	private   String  category;
	// Injecting the hard coded value
	@Value("500032")
	private   String pinCode;
	
	// Injecting  the system property values
	@Value("${os.name}")
	private String  osName;
	@Value("${os.version}")
	private  String  osVersion;
	//Injecting the values collected from the  Env variables
	@Value("${Path}")
	private  String  pathData;
	
	//Injecting the values  through SPEL
	@Value("#{cc.cjavaPrice + cc.ajavaPrice + cc.spbmsPrice +cc.oraclePrice + cc.awsPrice+ cc.devopsPrice + cc.angularPrice +cc.testingPrice}")
	private  Double  fsJavaPrice;  
	@Value("#{cc.spbmsPrice >10000 }")
	private  boolean  isSpbmsFeeCostly;

}
