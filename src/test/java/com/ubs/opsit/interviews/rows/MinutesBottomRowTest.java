package com.ubs.opsit.interviews.rows;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinutesBottomRowTest {

	private MinutesBottomRow row;

	@Before
	public void setup()
	{
		row = new MinutesBottomRow();
	}
	
	@Test
	public void testHoursBottomRowStructure()
	{
		Assert.assertEquals(4, row.getRowLamps().size());
	}
	
	@After()
	public void tearDown()
	{
		row = null;
	}
	
}
