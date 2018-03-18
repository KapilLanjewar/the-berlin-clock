package com.ubs.opsit.interviews.rows;

import java.util.Arrays;
import java.util.List;

import com.ubs.opsit.interviews.lamps.MinutesLamp;

public class MinutesTopRow implements Row<MinutesLamp> {
	
	private List<MinutesLamp> lamps = Arrays.asList(
			new MinutesLamp("O"),
			new MinutesLamp("O"),
			new MinutesLamp("O"),
			new MinutesLamp("O"),
			new MinutesLamp("O"),
			new MinutesLamp("O"),
			new MinutesLamp("O"),
			new MinutesLamp("O"),
			new MinutesLamp("O"),
			new MinutesLamp("O"),
			new MinutesLamp("O")
			);
	
	public List<MinutesLamp> getRowLamps()
	{
		return lamps;
	}

	@Override
	public String getRowDisplay()
	{
		StringBuilder builder = new StringBuilder();
		
		for(MinutesLamp lamp: lamps)
		{
			builder.append(lamp.getDisplayColor());
		}
		
		return builder.toString();
	}
	
}
