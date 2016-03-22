package com.tw.marsrover;

public class MarsRover {
	
	
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
		setDirection(direction.next());
	}
	
	public void turnLeft() {
		setDirection(direction.previous());
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
