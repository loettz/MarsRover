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

}
