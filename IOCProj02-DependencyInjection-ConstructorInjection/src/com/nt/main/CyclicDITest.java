//CyclicDITest.java
package com.nt.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nt.sbeans.A;
import com.nt.sbeans.B;

public class CyclicDITest {

	public static void main(String[] args) {
		//create IOC container
		FileSystemXmlApplicationContext  ctx=
				  new FileSystemXmlApplicationContext("src/com/nt/cfgs/applicationContext.xml");
		//get spring bean class obj ref
		A  a1=ctx.getBean("a1",A.class);
		System.out.println(a1);
		//get spring bean class obj ref
		
		B  b1=ctx.getBean("b1",B.class);
		System.out.println(b1);
		
		
		//close the IOC container
		 ctx.close();

	}

}
