//DoctorMgmtServiceImpl.java
package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.DoctorEntity;
import com.nt.errors.DoctorNotFoundException;
import com.nt.repository.IDoctorRepository;
import com.nt.vo.DoctorVO;

@Service
public class DoctorMgmtServiceImpl implements IDoctorMgmtService {
	@Autowired
	private  IDoctorRepository  doctorRepo;

	@Override
	public List<DoctorVO> findAllDoctors() {
		//use repo
		List<DoctorEntity>  listEntities=doctorRepo.findAll();  
		//covert List of Entities to List of VO objects
		List<DoctorVO>  listVO=new  ArrayList<DoctorVO>();
		listEntities.forEach(entity->{
			DoctorVO vo=new DoctorVO();
			BeanUtils.copyProperties(entity, vo);
			listVO.add(vo);
		});
		return listVO;
	}
	
	@Override
	public String registerDoctor(DoctorVO vo) {
		//convert VO class obj to  Entity class obj
		DoctorEntity  entity=new DoctorEntity();
		BeanUtils.copyProperties(vo, entity);
		entity.setCreateBy(System.getProperty("user.name"));
		//use  repo
		int idVal=doctorRepo.save(entity).getDid();
		return "Doctor is  added     with id value::"+idVal;
	}
	
	@Override
	public DoctorVO showDoctorById(int id) {
		//use repo
		DoctorEntity entity=doctorRepo.findById(id).orElseThrow(()->new DoctorNotFoundException("Invalid Id"));
		//convert  entity obj to vo object
		DoctorVO  vo=new DoctorVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}
	
	@Override
	public String editDoctor(DoctorVO vo) {
		//convert VO  obj to  Entity object
		DoctorEntity entity=doctorRepo.findById(vo.getDid()).orElseThrow(()->new IllegalArgumentException("invalid id"));
		BeanUtils.copyProperties(vo, entity);
		entity.setUpdatedBy(System.getProperty("user.name"));
		//update the object
		 doctorRepo.save(entity);
		return  vo.getDid()+" Doctor Details are updated";
	}

	@Override
	public String removeDoctor(int did) throws Exception{
		DoctorEntity  entity=doctorRepo.findById(did).orElseThrow(()-> new DoctorNotFoundException("Invalid Doctor Id"));
	     doctorRepo.deleteById(did);
	     return  did+" id   Dotor is Deleted";
	}
	

}
