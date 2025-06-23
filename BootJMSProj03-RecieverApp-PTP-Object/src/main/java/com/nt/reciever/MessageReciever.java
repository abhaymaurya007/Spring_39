package com.nt.reciever;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.nt.model.Actor;

@Component
public class MessageReciever {
	
	@JmsListener(destination = "testmq1")
	public   void  readMessage(Actor  actor) {
		System.out.println("message ::"+actor);
	}

}
