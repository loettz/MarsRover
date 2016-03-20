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
	
	@Test
	public void testRoverMovements() {
		MarsRover mr = new MarsRover();
		Location l = new Location(0, 0);
		mr.setLocation(l);
		mr.setDirection(Direction.NORTH);
		mr.turnLeft();
		assertEquals(Direction.WEST, mr.getDirection());
		mr.turnRight();
		assertEquals(Direction.NORTH, mr.getDirection());
	}
	
	@Test 
	public void testSetPlateau() {
		Plateau p = new Plateau(5, 5);
		Location l = new Location(5, 5);
		assertEquals(l, p.getUpperRightCoordinates());
		
	}
}
