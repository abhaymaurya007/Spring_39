package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.InjectionPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Politician;
import com.nt.repository.IPoliticianRepository;

@Service
public class PoliticianMgmtServiceImpl implements IPoliticianMgmtService {
	@Autowired
	private IPoliticianRepository  politicianRepo;

	@Override
	public String regsiterPolitician(Politician politician) {
		int idVal=politicianRepo.save(politician).getPid();
		return  "Politician is saved with the id value ::"+idVal;
	}
	
	@Override
	public List<Politician> showAllPoliticianDetails() {
		return politicianRepo.findAll();
	}
	
	@Override
	public double calculatePoliticianAge(int pid) {
		//use repo
		return politicianRepo.getPoliticianAgeById( pid);
	}

}
