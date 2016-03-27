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
		mr.setDirection(Direction.SOUTH);
		mr.move();
		Location newLoc = new Location(0, 0);
		assertEquals(newLoc, mr.getLocation());
		mr.setDirection(Direction.WEST);
		mr.move();
		assertEquals(newLoc, mr.getLocation());
		assertEquals(newLoc.getY(),mr.getLocation().getY());
		mr.setDirection(Direction.NORTH);
		assertEquals(5, mr.getDirection().possibleMoves(newLoc, p));
	}
	
	@Test 
	public void testSetPlateau() {
		Plateau p = new Plateau(5, 5);
		Location l = new Location(5, 5);
		assertEquals(l, p.getUpperRightCoordinates());
		assertEquals(5, p.getUpperRightX());
		assertEquals(5, p.getUpperRightY());
		
	}
	
	@Test
	public void testParseInput() {
		ReadInput ri = new ReadInput(TestMarsRover.class.getResource("Test_Input.txt").toString().substring(5));
		RoverDataParser rdp = new RoverDataParser(ri.openFile());
		Plateau expectedP = new Plateau(5, 5);
		assertEquals(expectedP.getUpperRightCoordinates(), rdp.generatePlateau().getUpperRightCoordinates());
		assertEquals(2, rdp.generateRoverList(expectedP).size());
		
	}
	

}
