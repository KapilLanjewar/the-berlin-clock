package com.ubs.opsit.interviews.lamps;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class SecondsLampTest {
	
	private SecondsLamp lamp;
	
	@Test
	public void testForYellowDisplay()
	{
		lamp = new SecondsLamp(0);
		Assert.assertEquals(lamp.getDisplayColor(), "Y");
	}
	
	@Test
	public void testForOffDisplay()
	{
		lamp = new SecondsLamp(1);
		Assert.assertEquals(lamp.getDisplayColor(), "O");
	}
	
	@After
	public void tearDown()
	{
		lamp = null;
	}

}
