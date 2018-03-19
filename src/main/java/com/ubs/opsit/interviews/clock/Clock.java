package com.ubs.opsit.interviews.clock;

import java.util.Calendar;
import java.util.Date;

import com.ubs.opsit.interviews.clock.utils.DisplayManager;

public class Clock {
	
	private DisplayManager displayManager;
	
	public Clock(DisplayManager displayManager)
	{
		this.displayManager = displayManager;
	}

	public void runClock(int interval)
	{
		long instant = System.currentTimeMillis() + (interval*1000);
		
		while(instant>System.currentTimeMillis())
		{
			displayManager.display(getTimeInstant());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Unexpected thread interruption...");
				e.printStackTrace();
			}
		}
	}
	
	private String getTimeInstant()
	{
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		int hours = calendar.get(Calendar.HOUR_OF_DAY);
		int minutes = calendar.get(Calendar.MINUTE);
		int seconds = calendar.get(Calendar.SECOND);
		
		String timeInstant = hours + ":" + minutes + ":" + seconds;
		return timeInstant;
	}
	
}
