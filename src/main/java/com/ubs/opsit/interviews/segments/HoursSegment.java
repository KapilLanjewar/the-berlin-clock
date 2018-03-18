package com.ubs.opsit.interviews.segments;

import com.ubs.opsit.interviews.lamps.HoursLamp;
import com.ubs.opsit.interviews.rows.HoursBottomRow;
import com.ubs.opsit.interviews.rows.HoursTopRow;
import com.ubs.opsit.interviews.rows.Row;

public class HoursSegment implements Segment {
	
	private StringBuilder builder = new StringBuilder();

	@Override
	public String getSegmentDisplay(String input)
	{
		int inputNum = Integer.parseInt(input);
		
		int top = inputNum/5;
		int bottom = inputNum%5;
		
		builder.append(evaluateTopRow(top));
		builder.append("\r\n");
		builder.append(evaluateBottomRow(bottom));
	
		return builder.toString();
	}
	
	private String evaluateTopRow(int top)
	{
		Row<HoursLamp> row = new HoursTopRow();
		
		for(int i=0; i<top; i++)
		{
			HoursLamp lamp = row.getRowLamps().get(i);
			lamp.setyDisplayColor("R");
		}
		
		return row.getRowDisplay();
	}

	private String evaluateBottomRow(int bottom)
	{
		Row<HoursLamp> row = new HoursBottomRow();
		
		for(int i=0; i<bottom; i++)
		{
			HoursLamp lamp = row.getRowLamps().get(i);
			lamp.setyDisplayColor("R");
		}
		
		return row.getRowDisplay();
	}
}
