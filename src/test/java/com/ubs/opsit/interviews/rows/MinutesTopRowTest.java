package com.ubs.opsit.interviews.rows;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MinutesTopRowTest {

	private MinutesTopRow row;

	@Before
	public void setup()
	{
		row = new MinutesTopRow();
	}
	
	@Test
	public void testHoursBottomRowStructure()
	{
		Assert.assertEquals(11, row.getRowLamps().size());
	}
	
	@After()
	public void tearDown()
	{
		row = null;
	}
	
}
