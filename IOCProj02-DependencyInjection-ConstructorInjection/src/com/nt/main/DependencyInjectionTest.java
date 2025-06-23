//DependencyInjectionTest.java (main class)
package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		  // create  IOC container
		FileSystemXmlApplicationContext  ctx=
				new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get  target  Spring bean class obj ref
		Object obj=ctx.getBean("wmg");
		//Type casting
		WishMessageGenerator  generator=(WishMessageGenerator)obj;
		// invoke the b.methods
		String msg=generator.showWishMessage("raja");
		System.out.println("result:"+msg);
		//close the IOC container
		ctx.close();
	}

}
