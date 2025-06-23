package com.nt.runners;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.repository.IActorRepository;

@Component
public class FinderMethodsTestRunner implements CommandLineRunner {
	@Autowired
	private  IActorRepository  actorRepo;
	

	@Override
	public void run(String... args) throws Exception {
		
		/*try {
			Iterable<Actor>  list=actorRepo.findByCategoryEquals("hero");
			list.forEach(actor->{
				System.out.println(actor);
			});
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("======================");
		try {
			Iterable<Actor>  list=actorRepo.readByCategoryIs("villian");
			list.forEach(actor->{
				System.out.println(actor);
			});
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		*/
		
		/*try {
			List<Actor>  list=actorRepo.getByCategory("hero");
			list.forEach(System.out::println);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		/*	try {
				List<Actor> list=actorRepo.findByFeeBetween(11000000.0, 50000000.0);
				list.forEach(System.out::println);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		*/
		/*	try {
				actorRepo.findByAnameStartingWith("r").forEach(System.out::println);
				System.out.println("-------------------------------");
				actorRepo.findByAnameEndingWith("h").forEach(System.out::println);
				System.out.println("-------------------------------");
				actorRepo.findByAnameContaining("r").forEach(System.out::println);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		*/	
		
		/*	try {
			   actorRepo.findByCategoryInOrderByCategoryAsc(List.of("hero","villian","comedian")).forEach(System.out::println);
			}
			catch(Exception  e) {
				e.printStackTrace();
			}*/
		/*	
			try {
				actorRepo.findByFeeBetweenAndAddrsEquals(1200000.0, 163000000.0,"hyd").forEach(System.out::println);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		/*	try {
				actorRepo.findByAnameLikeOrFeeLessThanEqual("r%", 200000000.0).forEach(System.out::println);
			}
			catch(Exception e) {
			  e.printStackTrace();	
			}
		*/
		
		try {
		 Optional<Actor>	 opt=actorRepo.findByContactNoEquals(35566561L);
		 if(opt.isEmpty())
			 System.out.println("Actor not found");
		 else
			 System.out.println("Actor details ::"+opt.get());
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
