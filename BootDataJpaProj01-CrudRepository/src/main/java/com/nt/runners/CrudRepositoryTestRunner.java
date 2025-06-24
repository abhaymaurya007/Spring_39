package com.nt.runners;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.nt.BootDataJpaProj1CrudRepositoryApp;
import com.nt.entity.Actor;
import com.nt.repository.IActorRepository;
import com.nt.service.ActorMgmtServiceImpl;
import com.nt.service.IActorMgmtService;

@Component
public class CrudRepositoryTestRunner implements CommandLineRunner {

    
    	@Autowired
	private  IActorMgmtService  actorService;


    
    
	@Override
	public void run(String... args) throws Exception {
		/*
		 * try { //prepare Entity object Actor actor=new Actor();
		 * actor.setAname("rajesh"); actor.setCategory("villian");
		 * actor.setContactNo(9819999L); actor.setAddrs("vizag");
		 * actor.setFee(14145777.0);
		 * 
		 * //invoke the service method String msg=actorService.registerActor(actor);
		 * System.out.println(msg); }//try catch(Exception e) { e.printStackTrace(); }
		 */
		/*try {
			long count=actorService.showActorsCount();
			System.out.println("Actors  count::"+count);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		/*try {
		  String msg=actorService.checkActorAvailability(111);
		  System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		/*
			try {
				Actor  actor1=new  Actor("rajesh1", "hyd", "HERO", 999999888L, 90000.0);
				Actor  actor2=new  Actor("karan1", "delhi", "Villian", 193999888L, 40000.0);
				Actor  actor3=new  Actor("suresh1", "mumbai", "Hero", 191991888L, 60000.0);
				List<Actor>  list=List.of(actor1, actor2, actor3);
				String msg=actorService.registerActors(list);
				System.out.println(msg);
			}//try
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		/*		try {
					
					 Iterable<Actor>  list=actorService.showAllActors();
					 list.forEach(actor->{
						 System.out.println(actor);
					 });
					 System.out.println("--------------------------");
					 list.forEach(System.out::println);
					 System.out.println("------------------------");
					 StreamSupport.stream(list.spliterator(), false).forEach(System.out::println);
					 System.out.println("------------------------");
					 for(Actor actor:list) {
						 System.out.println(actor);
					 }
					  
				}
				catch(Exception e) {
					e.printStackTrace();
				}
		*/		
		
		/*	try {
				//Iterable<Actor>  list=actorService.showActorsByIds(List.of(152,153,181,null));
				//Iterable<Actor>  list=actorService.showActorsByIds(Arrays.asList(152,153,191,null));
				List<Integer> ids=new ArrayList(); ids.add(152); ids.add(153); ids.add(156); ids.add(null);
				Iterable<Actor>  list=actorService.showActorsByIds(ids);
				list.forEach(System.out::println);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		/*try {
			String msg=actorService.showActorById(1537);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		/*	try {
				Actor  actor=actorService.fetchActorById(153);
				System.out.println("Actor Details are ::"+actor);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		/*	try {
				Actor actor=actorService.getActorById(153);
				System.out.println(actor);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		/*	try {
			 String msg=actorService.updateActorFeeById(153, 10.0f);
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		/*	try {
				Actor actor=new Actor(1611,"naresh","mumbai","super star",899999901L,54545.0);
				String  msg=actorService.updateActor(actor);
				System.out.println(msg);
			}
			catch(Exception  e) {
				e.printStackTrace();
			}
			*/
		
		/*try {
			String msg=actorService.deleteActorById(153);
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*	try {
				Actor actor=new Actor();
				actor.setAid(152);
				String msg=actorService.deleteActor(actor);
				System.out.println(msg);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		*/
		
		/*	try {
				String msg=actorService.deleteActorsById(List.of(152,154,100,101));
				System.out.println(msg);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		try {
			String msg=actorService.deleteAllActors();
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}//run(-)

}//class
