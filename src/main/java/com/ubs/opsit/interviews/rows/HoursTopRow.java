package com.ubs.opsit.interviews.rows;

import java.util.Arrays;
import java.util.List;

import com.ubs.opsit.interviews.lamps.HoursLamp;

public class HoursTopRow implements Row<HoursLamp> {

	private List<HoursLamp> lamps = Arrays.asList(
			new HoursLamp("O"),
			new HoursLamp("O"),
			new HoursLamp("O"),
			new HoursLamp("O")
			);
	
	@Override
	public List<HoursLamp> getRowLamps()
	{
		return lamps;
	}

	@Override
	public String getRowDisplay()
	{
		StringBuilder builder = new StringBuilder();
		
		for(HoursLamp lamp: lamps)
		{
			builder.append(lamp.getDisplayColor());
		}
		
		return builder.toString();
	}
	
}