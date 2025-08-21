package com.nt.reciever;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageReciever {
	
	@JmsListener(destination = "tpc1")
	public   void  readMessage(String text) {
		System.out.println("message ::"+text);
	}

}
