package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.service.IAuthMgmtService;

@Component
public class PL_SQLProcedureTestRunner implements CommandLineRunner {
	@Autowired
	private  IAuthMgmtService  authService;

	@Override
	public void run(String... args) throws Exception {
		try {
		System.out.println("result::"+authService.login("raja1", "hyd1"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
