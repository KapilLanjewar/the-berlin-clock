package com.ubs.opsit.interviews.converters;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class WhenGivenTimeIs_23_59_59 {

	private StringBuilder builder;
	private String timeToken;
	private CustomConverter converter;

	@Before
	public void setup()
	{
		builder = new StringBuilder();
		builder.append("O");
		builder.append("\r\n");
		builder.append("RRRR");
		builder.append("\r\n");
		builder.append("RRRO");
		builder.append("\r\n");
		builder.append("YYRYYRYYRYY");
		builder.append("\r\n");
		builder.append("YYYY");
		
		timeToken = "23:59:59";
		converter = new CustomConverter();
	}
	
	@Test
	public void shouldConvertTime()
	{
		String actualResult = converter.convertTime(timeToken);
		Assert.assertEquals(builder.toString(), actualResult);
	}
	
	@After
	public void tearDown()
	{
		builder = null;
		timeToken = null;
		converter = null;
	}
	
}
