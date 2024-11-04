package com.cdc.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Vehicle")
public final class Vehicle {
	@Qualifier("engg")
	@Autowired
	private IEngine engine;
	@Autowired
	private LocalDateTime dateTime;
	
	public Vehicle() {
		System.out.println("Vehicle::)-Param constructor");
	}
	
	public void move(String startPlace, String StopPlace) {
		engine.start();
		System.out.println("Vehicle Started from "+startPlace);
		System.out.println("Vehicle On the way to "+StopPlace);
		engine.stop();
		System.out.println("Vehicle Reached to "+StopPlace);
	}
	
	public String wishMessage(String user) {
		System.out.println("Wish Message Method Started");
		int hour=dateTime.getHour();
		if (hour<12)
			return "Good Morning "+user;
		else if (hour<16)
			return "Good Afternoon "+user;
		else if (hour<20)
			return "Good Night "+user;
		else 
			return "Good Night "+user;	
	}
}
