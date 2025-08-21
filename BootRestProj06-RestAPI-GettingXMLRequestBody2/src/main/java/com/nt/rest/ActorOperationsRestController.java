package com.nt.rest;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.ActorDetails;
import com.nt.model.Address;

@RestController
@RequestMapping("/actor-api")
public class ActorOperationsRestController {
	
	@PostMapping("/register")
	public   ResponseEntity<String>  registerAddress(@RequestBody Address addrs){
		System.out.println("Address is ::"+addrs);
		return  new ResponseEntity<String>("model class obj data:"+addrs.toString(),HttpStatus.OK);
	}
	
	@PostMapping("/register-actor")
	public   ResponseEntity<String>  registerActor(@RequestBody ActorDetails actor){
		System.out.println("Actor object data ::"+actor);
		return new  ResponseEntity<String>("Actor obj data::"+actor.toString(),HttpStatus.OK);
	}
	
	@PostMapping("/register-addrsList")
	public   ResponseEntity<String>  registerActorsList(@RequestBody List<Address>  list){
		System.out.println("ActorDetails object data ::"+list);
		return new  ResponseEntity<String>("Actor obj data::"+list.toString(),HttpStatus.OK);
	}

	

}
