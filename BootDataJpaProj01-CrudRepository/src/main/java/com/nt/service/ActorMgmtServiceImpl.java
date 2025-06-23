package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepository;

@Service("actoService")
public class ActorMgmtServiceImpl implements IActorMgmtService {
	@Autowired
	private  IActorRepository  actorRepo;

	@Override
	public String registerActor(Actor actor) {
		/*	System.out.println("proxy obj class name::"+actorRepo.getClass());
			System.out.println("proxy class implemented list of interfaces::"+Arrays.toString(actorRepo.getClass().getInterfaces()));
		 System.out.println("List of implemented methods ::"+Arrays.toString(actorRepo.getClass().getDeclaredMethods()));
		*/
		
		// save the object(record insertion)
		   System.out.println("Entity object data before saving the object::"+actor);
		 Actor savedActor=actorRepo.save(actor);
		 System.out.println("Entity Object  data after saving the object::"+savedActor);
		
		return savedActor.getAid()+"  is saved  with  the id value";
				
	}
	
	@Override
	public long showActorsCount() {
		return  actorRepo.count();
	}
	
	@Override
	public String checkActorAvailability(int id) {
		boolean flag=actorRepo.existsById(id);
		return  flag?"Actor  avaiable": "Actor is not avaible";
	}
	
	/*@Override
	public String registerActors(Iterable<Actor> entities) {
		//use  repo
		Iterable<Actor> savedEntities=actorRepo.saveAll(entities);
		// get  ids of the saved Entities
		int count=0;
		List<Integer> ids=new ArrayList();
		for(Actor entity:savedEntities) {
			count++;
			ids.add(entity.getAid());
		}
		return  count+" no.of entities are saved with  id values ::"+ids;
	}*/
	
	
	@Override
	public String registerActors(Iterable<Actor> entities) {
		//use  repo
				Iterable<Actor> savedEntities=actorRepo.saveAll(entities);
				// get  ids of the saved Entities
	List<Integer> ids=StreamSupport.stream(savedEntities.spliterator(), false).map(Actor::getAid).collect(Collectors.toList());
			return  ids.size()+" no.of  objects are saved having id values ::"+ids;	
	}
	
	@Override
	public Iterable<Actor> showAllActors() {
		return actorRepo.findAll();
	}
	
	public   Iterable<Actor>  showActorsByIds(Iterable<Integer> ids){
		return  actorRepo.findAllById(ids);
	}

	@Override
	public String showActorById(int id) {
		Optional<Actor> opt=actorRepo.findById(id);
		if(opt.isPresent()) {
			Actor  actor=opt.get();
			return  id+"   Actor details ::"+actor;
		}
		else
			return  id+" Actor not found";
	}
	
	/*@Override
	public Actor fetchActorById(int id) {
		Optional<Actor>  opt=actorRepo.findById(id);
		if(opt.isEmpty())
			throw new IllegalArgumentException("Invalid id ");
		else
			return  opt.get();
		
	}*/
	
	@Override
	public Actor fetchActorById(int id) {
		Actor actor=actorRepo.findById(id).orElseThrow(()->new IllegalArgumentException("Invalid Id"));
		return actor;
	}
	
	
	@Override
	public Actor getActorById(int id) {
		Actor  actor=actorRepo.findById(id).orElse(new Actor("Duplicate Actor","hyd","stunt master",999999L,5666.0));
		return actor;
	}
	
	@Override
	public String updateActorFeeById(int id, float hikePercentage) {
		 Optional<Actor>  opt=actorRepo.findById(id);
		 if(opt.isEmpty())
			 return  id+"  id  Actor is not found";
		 else {
			 //get  Entity object for  Optional API
			 Actor  actor=opt.get();
			 // hike the  fee
			 actor.setFee(actor.getFee()+ (actor.getFee()* hikePercentage/100.0));
			 actorRepo.save(actor);
			 return  id +" id  actor  is updated with new fee ";
		 }
	}
	@Override
	public String updateActor(Actor actor) {
		  actorRepo.save(actor);
		return  "Actor  object is saved/updated";
	}
	
	@Override
	public String deleteActorById(int id) {
		//Load the object
		Optional<Actor>  opt=actorRepo.findById(id);
		if(opt.isEmpty()) {
			return   id+"  id  actor is not found for deletion";
		}
		else {
			//delete the object
			actorRepo.deleteById(id);
			return id +" id  actor is found and deleted";
		}
	}
	
	@Override
	public String deleteActor(Actor actor) {
		//Load the object
		Optional<Actor>  opt=actorRepo.findById(actor.getAid());
		if(opt.isEmpty()) {
			return   actor.getAid()+"  id  actor is not found for deletion";
		}
		else {
			//delete the obj
			actorRepo.delete(actor);
			return   actor.getAid()+"  id  actor is  found and deleted";
					
		}
	}
	
	@Override
	public String deleteActorsById(Iterable<Integer> ids) {
		 //load the objects
		  Iterable<Actor>  list=actorRepo.findAllById(ids);
		  long count=StreamSupport.stream(list.spliterator(), true).count();
		  // delete  the objs
		  actorRepo.deleteAllById(ids);
		return  count+"  of objs are deleted";
	}
	
	@Override
	public String deleteAllActors() {
		 //get  the records count
		long count=actorRepo.count();
		//delete the objs
		actorRepo.deleteAll();
		return count+"  no.of records are deleted";
	}
	

}
