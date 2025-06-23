package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Service
public class AuthMgmtServiceImpl implements IAuthMgmtService {
	@Autowired
	private   EntityManager  manager;
	
	
	/*CREATE DEFINER=`root`@`localhost` PROCEDURE `p_authentication`(in uname varchar(45),in pwd varchar(45),out result varchar(45))
			BEGIN
			  declare   cnt int(1) default 0;
			  
			  select  count(*) into cnt  from  users_info where username=uname and  password=pwd;
			   if(cnt <>0) then
			       set result="Valid Credentials";
			    else 
			       set result="InValid Credentials";
			    end if;
	
			END
	*/	
	
	
	@Override
	public String login(String user, String pwd) {
          //create StoredProcedureQuery  Object
		  StoredProcedureQuery  query=manager.createStoredProcedureQuery("p_authentication");
		  //register query params
		  query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		  query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		  query.registerStoredProcedureParameter(3, String.class, ParameterMode.OUT);
		  
		  //set values to query params
		  query.setParameter(1, user);
		  query.setParameter(2, pwd);
		  //execute the Query
		  String result=(String) query.getOutputParameterValue(3);
		  return result;
	}

}
