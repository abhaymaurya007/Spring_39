package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.service.IActorMgmtService;

@Component
public class JPARepositoryTestRunner implements CommandLineRunner {
	@Autowired
	private  IActorMgmtService  actorService;

	@Override
	public void run(String... args) throws Exception {
	  
		/*	try {
				String msg=actorService.removeActorsByIds(List.of(101,102,111,110,201,355));
				System.out.println(msg);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		/*	try {
				String msg=actorService.removeAllActorsInBatch();
				System.out.println(msg);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		*/	
		/*try {
			 Actor actor=new Actor();
			 actor.setCategory("hero");actor.setAddrs("hyd");
			 //use service
			 List<Actor>  list=actorService.showActorsByData(actor, true, "contactNo","fee");
			 list.forEach(System.out::println);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
			try {
				Actor  actor=actorService.showActorById(100);
				System.out.println("class name ::"+actor.getClass()+"...."+actor.getClass().getSuperclass());
				System.out.println(actor.getAname());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
		System.out.println("===========================");
		try {
			Actor actor=actorService.fetchActorById(100);
			/*System.out.println("class name::"+actor.getClass()+"...."+actor.getClass().getSuperclass());
			System.out.println(actor.getAname());
			System.out.println(actor.getCategory());
			*/
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
