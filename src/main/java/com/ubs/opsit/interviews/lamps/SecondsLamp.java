package com.ubs.opsit.interviews.lamps;

public class SecondsLamp {
	
	private int input = 0;

	public SecondsLamp(int input)
	{
		this.input = input;
	}

	public String getDisplayColor()
	{
		StringBuilder builder = new StringBuilder();
		
		if(input%2==0)
		{
			builder.append("Y");
		}
		else
		{
			builder.append("O");
		}
		
		return builder.toString();
	}
}
