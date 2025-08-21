package com.nt.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentOperationsController {
	
	/*@GetMapping("/report")
	public String   processData(@RequestParam("sno") int no,
			                                            @RequestParam(value="sname",required=false) String name) {
		System.out.println(no+"......"+name);
		
		//return LVN
		return "display";
	}
	*/
	
	/*	@GetMapping("/report")
		public String   processData(@RequestParam("sno") int no,
				                                            @RequestParam(value="sname",defaultValue = "mahesh") String name) {
			System.out.println(no+"......"+name);
			
			//return LVN
			return "display";
		}*/
	
	/*	@GetMapping("/report")
		public String   processData(@RequestParam(defaultValue = "455") int sno,
				                                            @RequestParam String sname) {
			System.out.println(sno+"......"+sname);
			
			//return LVN
			return "display";
		}
	*/	
	
	/*@GetMapping("/report")
	public String   processData(@RequestParam(required = false) Integer sno,
			                                            @RequestParam String sname) {
		System.out.println(sno+"......"+sname);
		
		//return LVN
		return "display";
	}*/
	
	/*	@GetMapping("/report")
		public  String  processData(@RequestParam(name="sadd") String[] addrs,
				                                           @RequestParam(name="sadd") List<String> addrsList,
				                                           @RequestParam(name="sadd") Set<String> addrsSet) {
			System.out.println(Arrays.toString(addrs)+"....."+addrsList+"......"+addrsSet);
			
			//return  LVN
			return "display";
		}*/
	
	@GetMapping("/report")
	public  String  processData(@RequestParam(name="sadd") String addrs) {
		System.out.println(addrs);
		//return LVN
		return "display";
	}
			                                         
	
	
	
	
}
