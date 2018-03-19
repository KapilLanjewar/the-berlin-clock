package com.ubs.opsit.interviews.clock;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.ubs.opsit.interviews.clock.utils.DisplayManager;

@RunWith(MockitoJUnitRunner.class)
public class ClockTest {

	@Mock
	DisplayManager displayManager;
	
	@InjectMocks
	Clock clock = new Clock(displayManager);
	
	@Test
	public void testRunClock()
	{
		clock.runClock(1);
		displayManager.display(Mockito.anyString());
		verify(displayManager, times(2)).display(Mockito.anyString());
	}
	
}
