package com.ubs.opsit.interviews.clock.utils;

import com.ubs.opsit.interviews.TimeConverter;

public class DisplayManager {

	private TimeConverter converter;
	
	public DisplayManager(TimeConverter converter)
	{
		this.converter = converter;
	}
	
	public void display(String instant)
	{
		System.out.println("\n=====================================================");
		System.out.println("For time instant " + instant + ", the Berlin Clock time is - ");
		System.out.println("\n" + converter.convertTime(instant));
	}
	
}
