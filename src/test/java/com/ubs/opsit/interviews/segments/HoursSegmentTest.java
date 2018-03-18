package com.ubs.opsit.interviews.segments;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HoursSegmentTest {

	private String segmentInput;
	private HoursSegment segment;
	
	private String expectedResult;
	
	@Before
	public void setup()
	{
		segmentInput = "23";
		segment = new HoursSegment();
		
		StringBuilder builder = new StringBuilder();
		builder.append("RRRR");
		builder.append("\r\n");
		builder.append("RRRO");
		
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
