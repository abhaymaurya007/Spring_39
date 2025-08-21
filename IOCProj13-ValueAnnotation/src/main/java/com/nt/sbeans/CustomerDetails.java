//CustomerDetails.java
package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("cust")
public class CustomerDetails {
	  //Direct value injection
	@Value("1001")
	private  int cno;
	 //  injecting the values  from properties file
	@Value("${cust.name}")
	private  String cname;
	@Value("${cust.addrs}")
	private  String  addrs;
	@Value("${cust.billamt}")
	private  String  billamt;
	
	//injecting the system property values
	@Value("${os.name}")
	private String  os;
	@Value("${os.version}")
	private  String  osVer;
	
	
	//injecting   env variable values
	@Value("${Path}")
	private String  pathData;


	
	//toString()   (alt+shift+s,s)
	@Override
	public String toString() {
		return "CustomerDetails [cno=" + cno + ", cname=" + cname + ", addrs=" + addrs + ", billamt=" + billamt
				+ ", os=" + os + ", osVer=" + osVer + ", pathData=" + pathData + "]";
	}
	
	
}
