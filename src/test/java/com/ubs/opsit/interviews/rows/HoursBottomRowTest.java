package com.ubs.opsit.interviews.rows;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HoursBottomRowTest {

	private HoursBottomRow row;
	
	@Before
	public void setup()
	{
		row = new HoursBottomRow();
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
