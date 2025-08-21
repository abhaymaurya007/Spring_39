//DoctorMgmtServiceImpl.java
package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.advice.DoctorNotFoundException;
import com.nt.entity.DoctorEntity;
import com.nt.repository.IDoctorRepository;
import com.nt.vo.DoctorVO;

@Service
public class DoctorMgmtServiceImpl implements IDoctorMgmtService {
	@Autowired
	private IDoctorRepository  doctorRepo;

	@Override
	public String registerDoctor(DoctorVO vo) {
		//convert  VO  class obj  to Entity object
		DoctorEntity  entity=new DoctorEntity();
		BeanUtils.copyProperties(vo, entity);
		entity.setCreateBy(System.getProperty("user.name"));
		//save the object
		int idVal=doctorRepo.save(entity).getDid();
		return "Doctor is saved with id value::"+idVal;
	}
	
	@Override
	public List<DoctorVO> showAllDoctors() {
		//use repo
		List<DoctorEntity>  listEntities=doctorRepo.findAll();
		// convert listEntities object to listVO object
		List<DoctorVO>  listVO=new ArrayList();
		listEntities.forEach(entity->{
			DoctorVO  vo=new DoctorVO();
			BeanUtils.copyProperties(entity, vo);
			listVO.add(vo);
		});
		return listVO;
	}
	
	@Override
	public List<DoctorVO> fetchDoctorsByFeeRange(double start, double end) {
		//use repo
		List<DoctorEntity>  listEntities=doctorRepo.showDoctorsByFeeRange(start, end);
		// convert listEntities object to listVO object
		List<DoctorVO>  listVO=new ArrayList();
		listEntities.forEach(entity->{
			DoctorVO  vo=new DoctorVO();
			BeanUtils.copyProperties(entity, vo);
			listVO.add(vo);
		});
		return listVO;
	}
	
	@Override
	public DoctorVO fetchDoctorById(int id) {
		//use repo
		DoctorEntity entity=doctorRepo.findById(id).orElseThrow(()->new DoctorNotFoundException("Invalid id"));
		//convert  entity object to vo object
	   DoctorVO vo=new DoctorVO();
		BeanUtils.copyProperties(entity, vo);
		return vo;
	}
	
	
	@Override
	public String updateDoctorFeeById(int id, double percent) {
		//use repo
		DoctorEntity entity=doctorRepo.findById(id).orElseThrow(()->new DoctorNotFoundException("Invalid id"));
		//modify  the fee
		entity.setFee(entity.getFee()+entity.getFee()*(percent/100.0));
		//update the object
		doctorRepo.save(entity);
		return id+" doctor fee is  updated :: "+entity.getFee();
	}
	
	@Override
	public String updateDoctor(DoctorVO vo) {
		//use repo
		DoctorEntity entity=doctorRepo.findById(vo.getDid()).orElseThrow(()->new DoctorNotFoundException("Invalid id"));
	    //update the entity object
		BeanUtils.copyProperties(vo, entity);
		doctorRepo.save(entity);
		return "Doctor obj is updated";
	}
	
	@Override
	public String removeDoctorsByFeeRange(double start, double end) {
		//use  repo
		int count= doctorRepo.deleteDoctorsByFeeRange(start, end);
		return count==0?"Doctors not found for Deletion":"Doctors found and Deleted";
	}

}
