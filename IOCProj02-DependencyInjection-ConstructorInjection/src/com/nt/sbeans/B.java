//B.java
package com.nt.sbeans;

public class B{
	private  A a;
	
	public B(A  a) {
		System.out.println("B:: 1-param constructor");
		this.a=a;
		
	}
	
	/*public void  setA(A a) {
		this.a=a;
	}*/
	
	public String  toString() {
		return  "from  B";
	}

}
