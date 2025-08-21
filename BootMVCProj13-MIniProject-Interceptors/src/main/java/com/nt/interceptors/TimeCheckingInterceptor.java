//TimeCheckingInterceptor.java
package com.nt.interceptors;

import java.time.LocalTime;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class TimeCheckingInterceptor  implements HandlerInterceptor {
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler)	throws Exception {
	  System.out.println("TimeCheckingInterceptor.preHandle()");
	  if(!req.getServletPath().equalsIgnoreCase("/")) {
		  // get sysstem time
		  LocalTime  time=LocalTime.now();
		 //get current hour of the day
		  int hour=time.getHour();
		  if(hour<9  || hour>15) {
			  RequestDispatcher  rd=req.getRequestDispatcher("/timeout.jsp");
			  rd.forward(req, res);
			  return false;
		  }//if
	  }//if
	return true;
	}//method

}
