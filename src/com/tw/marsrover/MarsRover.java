package com.tw.marsrover;

public class MarsRover {
	
	public enum Direction {
		NORTH, SOUTH, EAST, WEST
	}
	
	private Location location;
	
	private Direction direction;
	
	public void setLocation(Location l) {
		this.location = l;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setDirection(Direction d) {
		this.direction = d;
	}
	
	public Direction getDirection() {
		return direction;
	}
	
	public void turnRight() {
		switch(direction) {
		case NORTH: setDirection(Direction.EAST);
		case EAST: setDirection(Direction.SOUTH);
		case SOUTH: setDirection(Direction.WEST);
		case WEST: setDirection(Direction.NORTH);
		}
	}
	
	public void turnLeft() {
		switch(direction) {
		case NORTH: setDirection(Direction.WEST);
		case EAST: setDirection(Direction.NORTH);
		case SOUTH: setDirection(Direction.EAST);
		case WEST: setDirection(Direction.SOUTH);
		}
	}
	
	public void move() {
		
		switch(direction) {
		case NORTH: // y+1
		case EAST: //x+1
		case SOUTH: //y-1
		case WEST: // x-1
		}

	}

}
