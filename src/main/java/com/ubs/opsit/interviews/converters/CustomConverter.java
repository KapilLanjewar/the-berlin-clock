package com.ubs.opsit.interviews.converters;

import com.ubs.opsit.interviews.TimeConverter;
import com.ubs.opsit.interviews.segments.HoursSegment;
import com.ubs.opsit.interviews.segments.MinutesSegment;
import com.ubs.opsit.interviews.segments.SecondsSegment;
import com.ubs.opsit.interviews.segments.Segment;

public class CustomConverter implements TimeConverter {

	public String convertTime(String aTime)
	{
		String[] tokens = aTime.split(":");
		String hoursToken = tokens[0];
		String minutsToken = tokens[1];
		String secondsToken = tokens[2];
		
		Segment hoursSegment = new HoursSegment();
		Segment minutesSegment = new MinutesSegment();
		Segment secondsSegment = new SecondsSegment();
		
		StringBuilder builder = new StringBuilder();
		builder.append(secondsSegment.getSegmentDisplay(secondsToken));
		builder.append("\r\n");
		builder.append(hoursSegment.getSegmentDisplay(hoursToken));
		builder.append("\r\n");
		builder.append(minutesSegment.getSegmentDisplay(minutsToken));
		
		return builder.toString();
	}
	
}
