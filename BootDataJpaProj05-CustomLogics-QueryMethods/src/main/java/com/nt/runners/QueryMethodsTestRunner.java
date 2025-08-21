package com.nt.runners;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.IActorRepository;

@Component
public class QueryMethodsTestRunner implements CommandLineRunner {
	@Autowired
	private  IActorRepository  actorRepo;
	

	@Override
	public void run(String... args) throws Exception {
		
		/*try {
		actorRepo.showActorsByFeeRange(1200000.0, 2400000000.0).forEach(System.out::println);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		/*	try {
				actorRepo.showActorNamesByFeeRange(1200000.0, 20000000.0).forEach(System.out::println);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("=============");
			try {
				actorRepo.showActorsDataByAddrs("hyd").forEach(row-> System.out.println(Arrays.toString(row)));
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
			System.out.println("=============");
		*/	/*try {
			actorRepo.showActorsByCategories("hero","villian","comedian").forEach( System.out::println);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		/*		try {
					Optional<Actor>  opt=actorRepo.showActorByMobileNo(98199991L);
					if(opt.isEmpty())
						System.out.println("Actor not found");
					else
						System.out.println("Actor details are ::"+opt.get());
				}
				catch(Exception e) {
					e.printStackTrace();
				}*/
		
		
		/*	try {
				Object obj=actorRepo.showActorDataByMobileNo(9819999L);
				Object row[]=(Object[])obj;
				System.out.println(" Actor Number::"+row[0]);
				System.out.println("Actor name ::"+row[1]);
				System.out.println("Actor  mobile no::"+row[2]);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		/*	try {
				String name=actorRepo.showActorNameByMobileNo(9819999L);
				System.out.println("Actor name::"+name);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		*/
		
		/*try {
		  long count=actorRepo.countUniqueActors();
		  System.out.println("unique actors count::"+count);
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		/*	try {
				Object  row[]=(Object[])actorRepo.showActorsAggregateData();
				System.out.println(" actor count ::"+row[0]);
				System.out.println(" actors max fee ::"+row[1]);
				System.out.println(" actors min fee ::"+row[2]);
				System.out.println(" actors avg fee ::"+row[3]);
				System.out.println(" actors sum of fees ::"+row[4]);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		/*	try {
				int count=actorRepo.hikeActorFeeByCategory("hero", 5.0);
				System.out.println("no.of Actors that are updated::"+count);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		/*	try {
				int count=actorRepo.removeActorsByAddrs("hyd");
				System.out.println("no.of actors are removed::"+count);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		try {
			LocalDateTime  ldt=actorRepo.showSystemDateTime();
			System.out.println("System date and time ::"+ldt);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}//main

}//class
