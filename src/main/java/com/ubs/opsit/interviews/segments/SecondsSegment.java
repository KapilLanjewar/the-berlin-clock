package com.ubs.opsit.interviews.segments;

import com.ubs.opsit.interviews.lamps.SecondsLamp;

public class SecondsSegment implements Segment {

	@Override
	public String getSegmentDisplay(String input)
	{
		SecondsLamp lamp = new SecondsLamp(Integer.parseInt(input));
		return lamp.getDisplayColor();
	}

}
