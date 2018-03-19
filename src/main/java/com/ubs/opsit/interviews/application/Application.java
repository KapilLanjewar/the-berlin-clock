package com.ubs.opsit.interviews.application;

import com.ubs.opsit.interviews.TimeConverter;
import com.ubs.opsit.interviews.clock.Clock;
import com.ubs.opsit.interviews.clock.utils.DisplayManager;
import com.ubs.opsit.interviews.converters.CustomConverter;

public class Application {

	public static void main(String[] args) {
		
		System.out.println(1);
		
		TimeConverter converter = new CustomConverter();
		DisplayManager displayManager = new DisplayManager(converter);
		Clock berlinClock = new Clock(displayManager);
		
		berlinClock.runClock(70);
		
		System.out.println(2);
		
	}
	
}
