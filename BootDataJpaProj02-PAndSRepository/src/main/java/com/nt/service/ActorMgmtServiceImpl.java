package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepository;

@Service
public class ActorMgmtServiceImpl implements IActorMgmtService {
	@Autowired
	private  IActorRepository actorRepo;

	@Override
	public Iterable<Actor> showActorsSorted(boolean ascOrder, String... props) {
		//Create Sort object
		Sort sort=Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC, props);
		//use repo
		Iterable<Actor>  list=actorRepo.findAll(sort);
		return list;
	}

	@Override
	public Page<Actor> showActorsByPageNo(int pageNo, int pageSize) {
		//create  Pageable object
		Pageable pageable=PageRequest.of(pageNo, pageSize);
		//use  repo
		Page<Actor>  page=actorRepo.findAll(pageable);
		return page;
	}

	@Override
	public Page<Actor> showActorsDataByPageNoAsSorted(int pageNo, int pageSize, boolean ascOrder, String... props) {
		//create Sort object
		Sort  sort=Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC,props);
		// create Pageable Object
		Pageable pageable=PageRequest.of(pageNo, pageSize,sort);
		//use  Repo
		return  actorRepo.findAll(pageable);
	}
	
	@Override
	public void showActorsDataByPagination(int pageSize) {
		 //get the pages Count
		long count=actorRepo.count();
		long  pagesCount=count/pageSize;
		if(count%pageSize!=0)
			 pagesCount++;
			
		//display all the page by page
		for(int i=0;i<pagesCount;++i) {
			Pageable pageable=PageRequest.of(i, pageSize);
			Page<Actor> page=actorRepo.findAll(pageable);
			System.out.println("==Records of  "+(page.getNumber()+1)+"/"+page.getTotalPages()+"===========");
			page.forEach(System.out::println);
		}//for
		
		
	}//method

}//class
