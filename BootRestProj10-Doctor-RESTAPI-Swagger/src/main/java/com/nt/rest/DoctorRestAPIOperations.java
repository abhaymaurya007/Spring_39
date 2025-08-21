//DoctorRestAPIOperations.java
package com.nt.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.service.IDoctorMgmtService;
import com.nt.vo.DoctorVO;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/doctor-api")
@Tag(name="doctor",description = "Doctor Rest API")
public class DoctorRestAPIOperations {
	@Autowired
	private  IDoctorMgmtService docService;
	
	/*@PostMapping("/register")
	public  ResponseEntity<String>  registerDoctor(@RequestBody  DoctorVO vo){
		try {
		//use service
		 String msg=docService.registerDoctor(vo);
		 return new ResponseEntity<String>(msg,HttpStatus.CREATED);
		}
		catch(Exception e) {
			 return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}*/
	
	@PostMapping("/register")
	public  ResponseEntity<String>  registerDoctor(@RequestBody  DoctorVO vo){
		//use service
		 String msg=docService.registerDoctor(vo);
		 return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public    ResponseEntity<List<DoctorVO>>   showAllDoctors(){
		//use  service
		List<DoctorVO>  listVO=docService.showAllDoctors();
		return  new ResponseEntity<List<DoctorVO>>(listVO,HttpStatus.OK);
	}
	
	@GetMapping("/find/{start}/{end}")
	public    ResponseEntity<List<DoctorVO>>   showDoctorsByFeeRange(@PathVariable double start,@PathVariable double end){
	   //use service
		List<DoctorVO> listVO=docService.fetchDoctorsByFeeRange(start, end);
		//return listVO
		return new ResponseEntity<List<DoctorVO>>(listVO,HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public    ResponseEntity<DoctorVO>   showDoctorById(@PathVariable Integer id){
		//use service
		DoctorVO vo=docService.fetchDoctorById(id);
		return new ResponseEntity<DoctorVO>(vo,HttpStatus.OK);
	}
	
	
	@PatchMapping("/update/{id}/{percent}")
	public    ResponseEntity<String>   updateDoctorFeeById(@PathVariable Integer id,
			                                                                                                   @PathVariable double percent){
		
		//use service
		String msg=docService.updateDoctorFeeById(id, percent);
		return  new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	
	@PutMapping("/update")
	public   ResponseEntity<String>   modifyDoctor(@RequestBody DoctorVO doctor){
		//use  Service
		String msg=docService.updateDoctor(doctor);
		return  new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@DeleteMapping("/remove/{start}/{end}")
	public    ResponseEntity<String>   removeDoctorByFeeRange(@PathVariable double start,
			                                                                                                                 @PathVariable double end){
		//use  service
		String msg=docService.removeDoctorsByFeeRange(start, end);
		return  new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	
	
	
	
	
	

}
