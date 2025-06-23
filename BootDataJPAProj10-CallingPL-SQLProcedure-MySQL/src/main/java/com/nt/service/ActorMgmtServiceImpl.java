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
	
	
	/*CREATE DEFINER=`root`@`localhost` PROCEDURE `p_getActorsByFeeRange`(in startFee float, in endFee float)
			BEGIN
			   select *  from jpa_actor_info  where fee>=startFee and fee<=endFee;
			END
	*/
	
		@Override
	public List<Actor> showActorsByFeeRange(double start, double end) {
		//create StroredProcedureQuery object  representing PL/SQL procedure
		StoredProcedureQuery  query=manager.createStoredProcedureQuery("p_getActorsByFeeRange",Actor.class);
		//register parameters
		query.registerStoredProcedureParameter(1, Double.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Double.class, ParameterMode.IN);
		//set values to the IN  params
	    query.setParameter(1, start);
	    query.setParameter(2, end);
	      // call  PL/SQL procedure
	    List<Actor>  list=query.getResultList();
	    //return the result
	    return list;
	}

}
