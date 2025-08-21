package com.nt.rest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.ActorDetails;
import com.nt.model.Address;

@RestController
@RequestMapping("/actor-api")
public class ActorOperationsRestController {
	
	@GetMapping("/addrs")
	public  ResponseEntity<Address>  showAddressDetails(){
		System.out.println("ActorOperationsRestController.showAddressDetails()");
		Address addrs=new  Address("1-2-3", "RK Street", "kukatpally", 500014L);
		return  new ResponseEntity<Address>(addrs,HttpStatus.OK);
	}
	
		@GetMapping("/actor")
		public   ResponseEntity<ActorDetails>  showActorDetails(){
			Address addrs=new  Address("1-2-3", "RK Street", "kukatpally", 500014L);
			ActorDetails  details=new ActorDetails();
			
			details.setAid(1010);  details.setAname("SRK");  details.setDob(LocalDate.of(1980, 10, 20));
			details.setTob(LocalTime.of(10, 20,40));  details.setLaunchDateTime(LocalDateTime.of(2000, 11, 30, 10, 50));
			details.setFavColors(new String[] {"red","green","yellow"}); details.setPhones(Set.of(9999999L,56556656L));
			details.setSingle(false); details.setAddrs(addrs);   details.setIdDetails(Map.of("aadhar",545455L,"voterid",545454L,"pasport",6565656L));
			details.setFriends(List.of("salman","amir","sharukh"));
			
			HttpHeaders  headers=new HttpHeaders();
			headers.add("location","hyd");
			
			return new ResponseEntity<ActorDetails>(details,headers,HttpStatus.CREATED);
			}
	
	
	/*@GetMapping("/actor")
	public   ActorDetails  showActorDetails(){
		Address addrs=new  Address("1-2-3", "RK Street", "kukatpally", 500014L);
		ActorDetails  details=new ActorDetails();
		details.setAid(1010);  details.setAname("SRK");  details.setDob(LocalDate.of(1980, 10, 20));
		details.setTob(LocalTime.of(10, 20,40));  details.setLaunchDateTime(LocalDateTime.of(2000, 11, 30, 10, 50));
		details.setFavColors(new String[] {"red","green","yellow"}); details.setPhones(Set.of(9999999L,56556656L));
		details.setSingle(false); details.setAddrs(addrs);   details.setIdDetails(Map.of("aadhar",545455L,"voterid",545454L,"pasport",6565656L));
		details.setFriends(List.of("salman","amir","sharukh"));
		
		return details;
		
		}
	*/
		@GetMapping("/addrsList")
		public  ResponseEntity<List<Address>>  showAllActorDetails(){
			Address addrs1=new  Address("1-2-3", "RK Street", "kukatpally", 500014L);
			Address addrs2=new  Address("1-2-5", "BK Street", "kukatpally", 500015L);
			Address addrs3=new  Address("1-1-5", "LK Street", "kukatpally", 500018L);
			
			return  new ResponseEntity<List<Address>>(List.of(addrs1, addrs2, addrs3),HttpStatus.OK);
			
			
		}
}
