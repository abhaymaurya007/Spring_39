//DependencyInjectionTest.java(main class)
package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.SeasonFinder;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		//create IOC container   
		FileSystemXmlApplicationContext  ctx=
				              new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get  Target Spring bean class obj ref
		Object obj=ctx.getBean("sf");
		SeasonFinder  sf=(SeasonFinder)obj;
		//invoke the b.method
		try {
			String msg=sf.showSeasonName();
			System.out.println("Season name::"+msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
				
		//close  the IOC container
		 ctx.close();
		

	}

}
