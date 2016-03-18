package com.tw.marsrover;

import static org.junit.Assert.*;

import org.junit.Test;

import com.tw.marsrover.MarsRover.Direction;

public class TestMarsRover {
	
	@Test
	public void testSetRoverAttributes() {
		MarsRover mr = new MarsRover();
		Location l = new Location(5, 5);
		mr.setLocation(l);
		mr.setDirection(Direction.NORTH);
		assertEquals(l, mr.getLocation());
		assertEquals(Direction.NORTH, mr.getDirection());
		
	}
}
