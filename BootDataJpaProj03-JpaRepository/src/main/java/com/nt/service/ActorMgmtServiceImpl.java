package com.nt.service;

import java.util.List;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepository;

@Service
public class ActorMgmtServiceImpl implements IActorMgmtService {
	@Autowired
	private  IActorRepository actorRepo;

	@Override
	public String removeActorsByIds(Iterable<Integer> ids) {
		//use repo
		List<Actor> list=actorRepo.findAllById(ids);
		long count=list.size();
		if(count!=0) {
			//delete the records by Ids in Batch
			actorRepo.deleteAllByIdInBatch(ids);
			return count+" no.of records  are found and deleted";
		}
		return  "no records are found for deletion";
	}
	
	@Override
	public String removeAllActorsInBatch() {
		long count=actorRepo.count();
		actorRepo.deleteAllInBatch();
		return count+" no.of records are deleted in batch processing";
	}
	
	@Override
	public List<Actor> showActorsByData(Actor actor, boolean ascOrder, String... props) {
		//prepare Sort object
		Sort sort=Sort.by(ascOrder?Sort.Direction.ASC:Sort.Direction.DESC, props);
		//Example object
		Example<Actor> example=Example.of(actor);
		//use  Repo
		return actorRepo.findAll(example,sort);
	}
	
	@Override
	public Actor showActorById(int id) {
		return  actorRepo.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid Id"));
	}
	
	@Override
	public Actor fetchActorById(int id) {
		Actor actor=actorRepo.getReferenceById(id);
		return actor;
	}


}//class
