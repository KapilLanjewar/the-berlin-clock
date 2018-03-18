package com.ubs.opsit.interviews.segments;

import com.ubs.opsit.interviews.lamps.MinutesLamp;
import com.ubs.opsit.interviews.rows.MinutesBottomRow;
import com.ubs.opsit.interviews.rows.MinutesTopRow;
import com.ubs.opsit.interviews.rows.Row;

public class MinutesSegment implements Segment {

	private StringBuilder builder = new StringBuilder();
	
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
		Row<MinutesLamp> row = new MinutesTopRow();
		
		for(int i=0; i<top; i++)
		{
			MinutesLamp lamp = row.getRowLamps().get(i);

			if((i+1)%3 == 0)
			{
				lamp.setDisplayColor("R");
			}
			else
			{
				lamp.setDisplayColor("Y");
			}
		}
		
		return row.getRowDisplay();
	}
	
	private String evaluateBottomRow(int bottom)
	{
		Row<MinutesLamp> row = new MinutesBottomRow();
		
		for(int i=0; i<bottom; i++)
		{
			MinutesLamp lamp = row.getRowLamps().get(i);
			lamp.setDisplayColor("Y");
		}
		
		return row.getRowDisplay();
	}
	
}
