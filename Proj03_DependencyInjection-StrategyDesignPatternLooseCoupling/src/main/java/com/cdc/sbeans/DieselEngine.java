package com.cdc.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("Dengine")
@Lazy
public final class DieselEngine implements IEngine {

	public DieselEngine() {
		System.out.println("DieselEngine::0 param constructor");
	}
	@Override
	public void start() {
		System.out.println("DieselEngine:: Diesel Engine Started");

	}

	@Override
	public void stop() {
		System.out.println("DieselEngine::Diesel Engine Stopped");

	}

}
