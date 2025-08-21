//DTDC.java (Dependent class1)
package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements ICourier{
	
	public DTDC() {
		System.out.println("DTDC:: 0-param  constructor");
	}

	@Override
	public String deliver(int oid) {
		System.out.println("DTDC.deliver()");
		return oid+" order id   items will be delivered using  DTDC Courier Service";
	}

}
