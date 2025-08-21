package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nt.entity.Actor;
import com.nt.service.IActorMgmtService;

@Component
public class PagingAndSortingRepoTestRunner implements CommandLineRunner {
	@Autowired
	private  IActorMgmtService  actorService;

	@Override
	public void run(String... args) throws Exception {
	   //use the service
		/*	try {
				Iterable<Actor>  list=actorService.showActorsSorted(false, "fee","category");
				list.forEach(System.out::println);
			}
			catch(Exception e) {
				e.printStackTrace();
			}*/
		
		/*		try {
					Page<Actor>  page=actorService.showActorsByPageNo(1, 6);
					System.out.println((page.getNumber()+1)+"/"+page.getTotalPages()+" records are" );
					Iterable<Actor>  list=page.getContent();
					list.forEach(System.out::println);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
		*/
		
		/*try {
			Page<Actor>  page=actorService.showActorsDataByPageNoAsSorted(10, 4, true, "category","fee");
			System.out.println((page.getNumber()+1)+"/"+page.getTotalPages()+"  records");
			page.forEach(System.out::println);
			System.out.println("==========More info  current page =====");
			System.out.println("is this page first Page ::"+page.isFirst());
			System.out.println("is this page last Page ::"+page.isLast());
			System.out.println("records count in the current Page ::"+page.getNumberOfElements());
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		
		try {
			actorService.showActorsDataByPagination(4);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
