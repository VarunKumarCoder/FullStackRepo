package com.cdc.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("Cengine")
@Lazy
public final class CNGEngine implements IEngine {
	public CNGEngine() {
		System.out.println("CNGEngine::0-Param Constructor");
	}

	@Override
	public void start() {
		System.out.println("CNGEngine::CNG Engine Started");

	}

	@Override
	public void stop() {
		System.out.println("CNGEngine::CNG Engine Stopped");

	}

}
