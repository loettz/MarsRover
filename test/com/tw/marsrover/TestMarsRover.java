package com.tw.marsrover;

import static org.junit.Assert.*;


import org.junit.Test;



public class TestMarsRover {
	
	@Test
	public void testSetRoverAttributes() {
		Location l = new Location(0, 0);
		Plateau p = new Plateau(5, 5);
		MarsRover mr = new MarsRover(l, Direction.NORTH, p);
		assertEquals(l, mr.getLocation());
		assertEquals(Direction.NORTH, mr.getDirection());
		Location loc = new Location(3, 3);
		mr.setLocation(loc);
		assertEquals(loc.getX(), mr.getLocation().getX());
		mr.setDirection(Direction.WEST);
		assertEquals(Direction.WEST, mr.getDirection());
		
	}
	@Test
	public void testSetLocation() {
		Location loc = new Location(10, 10);
		assertEquals(10, loc.getX());
		assertEquals(10, loc.getY());
		loc.setX(3);
		assertEquals(3, loc.getX());
		loc.setY(7);
		assertEquals(7, loc.getY());
	}
	
	@Test
	public void testNextAndPreviousDirection() {
		assertEquals(Direction.EAST, Direction.NORTH.next());
		assertEquals(Direction.SOUTH, Direction.WEST.previous());
	}
	
	@Test
	public void testRoverMovements() {
		Location l = new Location(0, 0);
		Plateau p = new Plateau(5, 5);
		MarsRover mr = new MarsRover(l, Direction.EAST, p);
		mr.turnLeft();
		mr.turnLeft();
		mr.turnLeft();
		assertEquals(Direction.SOUTH, mr.getDirection());
		mr.turnRight();
		mr.turnRight();
		assertEquals(Direction.NORTH, mr.getDirection());
		mr.move();
		Location newLoc = new Location(0, 1);
		assertEquals(newLoc.getY(),mr.getLocation().getY());
	}
	
	@Test 
	public void testSetPlateau() {
		Plateau p = new Plateau(5, 5);
		Location l = new Location(5, 5);
		assertEquals(l, p.getUpperRightCoordinates());
		
	}
	
	@Test
	public void testIsRoverMoveable() {
		Location loc = new Location(0,0);
		Plateau p = new Plateau(5, 5);
		MarsRover mr = new MarsRover(loc, Direction.EAST, p);
		Location l = mr.getLocation();
		Location newl = l.potentialNextLocation(mr.getDirection());
		assertEquals(p.inBounds(newl), mr.isMoveable(p));
		
	}

}
