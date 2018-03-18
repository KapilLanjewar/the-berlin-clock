package com.ubs.opsit.interviews.segments;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinutesSegmentTest {

	private String segmentInput;
	private MinutesSegment segment;
	
	private String expectedResult;
	
	@Before
	public void setup()
	{
		segmentInput = "59";
		segment = new MinutesSegment();
		
		StringBuilder builder = new StringBuilder();
		builder.append("YYRYYRYYRYY");
		builder.append("\r\n");
		builder.append("YYYY");
		
		expectedResult = builder.toString();
	}
	
	@Test
	public void testSegmentDisplay()
	{
		String actualResult = segment.getSegmentDisplay(segmentInput);
		Assert.assertEquals(expectedResult, actualResult);
	}
	
	@After
	public void tearDown()
	{
		segmentInput = null;
		segment = null;
		expectedResult = null;
	}
	
}
