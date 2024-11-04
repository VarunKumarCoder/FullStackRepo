package com.cdc.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("Eengine")
@Lazy
public final class Eengine implements IEngine {
	public Eengine() {
		System.out.println("Eengine::0-Param Constructor");
	}

	@Override
	public void start() {
		System.out.println("Eengine::Electric Engine Start");

	}

	@Override
	public void stop() {
		System.out.println("Eengine:: Electric Engine Stopped");
	}

}
