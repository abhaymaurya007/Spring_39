package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;

@Service
public class ActorMgmtServiceImpl implements IActorMgmtService {
	@Autowired
	private   EntityManager  manager;
	
	
	/*	CREATE OR REPLACE PROCEDURE P_GET_ACTORS_BY_FEERANGE 
		(
		  STARTFEE IN NUMBER 
		, ENDFEE IN NUMBER 
		, DETAILS OUT SYS_REFCURSOR 
		) AS 
		BEGIN
		  OPEN DETAILS FOR
		    SELECT * FROM JPA_ACTORS_INFO WHERE FEE>=STARTFEE AND FEE<=ENDFEE;
		    
		  
		  
		END P_GET_ACTORS_BY_FEERANGE;
	*/
	@Override
	public List<Actor> showActorsByFeeRange(double start, double end) {
		//create StroredProcedureQuery object  representing PL/SQL procedure
		StoredProcedureQuery  query=manager.createStoredProcedureQuery("P_GET_ACTORS_BY_FEERANGE",Actor.class);
		//register parameters
		query.registerStoredProcedureParameter(1, Double.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Double.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(3, Object.class, ParameterMode.REF_CURSOR);
		//set values to the IN  params
	    query.setParameter(1, start);
	    query.setParameter(2, end);
	      // call  PL/SQL procedure
	    List<Actor>  list=query.getResultList();
	    //return the result
	    return list;
	}

}
