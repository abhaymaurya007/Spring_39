//A.java
package com.nt.sbeans;

public class A {
	private  B b;
	
	public A(B b) {
		this.b=b;
		System.out.println("A:: 1-param constructor");
	}
	
	/*public void  setB(B b) {
		this.b=b;
	}*/
	
	public String  toString() {
		return  "from  A";
	}

}
