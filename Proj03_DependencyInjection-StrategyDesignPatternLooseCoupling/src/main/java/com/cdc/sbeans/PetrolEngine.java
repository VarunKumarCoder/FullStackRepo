package com.cdc.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("Pengg")
@Lazy
public final class PetrolEngine implements IEngine {
	
	public PetrolEngine() {
		System.out.println("PetrolEngine::0-Param constructor");
	}
	@Override
	public void start() {
		System.out.println("PetrolEngine:: Petrol Engine Started");

	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine:: Petrol Engine Stopped");
	}

}
