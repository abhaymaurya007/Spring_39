package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("cc")
@Data
public class CourseCatalog {
	@Value("${cc.cjava.fee}")
	private   Double   cjavaPrice;
	@Value("${cc.ajava.fee}")
	private  Double    ajavaPrice;
	@Value("${cc.oracle.fee}")
	private  Double    oraclePrice;
	@Value("${cc.spbms.fee}")
	private  Double    spbmsPrice;
	@Value("${cc.aws.fee}")
	private  Double    awsPrice;
	@Value("${cc.devops.fee}")
	private  Double   devopsPrice;
	@Value("${cc.angular.fee}")
	private  Double   angularPrice;
	@Value("${cc.testing.fee}")
	private  Double   testingPrice;
	
	
	
	
	
	

}
