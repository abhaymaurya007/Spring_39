package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeeker;
import com.nt.repository.IJobSeekerRepository;

@Service
public class JobSeekerMgmtServiceImpl implements IJobSeekerMgmtService {
	@Autowired
  private  IJobSeekerRepository  jsRepo;
	
	@Override
	public String registerJobSeeker(JobSeeker seeker) {
		 int idVal=jsRepo.save(seeker).getJsid();
		return "JobSeeker is saved with the id value:"+idVal;
	}

	@Override
	public JobSeeker showJobSeekerById(int id) {
		return jsRepo.findById(id).orElseThrow(()->  new IllegalArgumentException("Invalid id"));
		
	}

}
