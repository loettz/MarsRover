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
		if (direction == Direction.NORTH) {
			setDirection(Direction.EAST);
		} else if (direction == Direction.EAST) {
			setDirection(Direction.SOUTH);
		} else if (direction == Direction.SOUTH) {
			setDirection(Direction.WEST);
		} else if (direction == Direction.WEST) {
			setDirection(Direction.NORTH);
		}
	}
	
	public void turnLeft() {
		if (direction == Direction.NORTH) {
			setDirection(Direction.WEST);
		} else if (direction == Direction.EAST) {
			setDirection(Direction.NORTH);
		} else if (direction == Direction.SOUTH) {
			setDirection(Direction.EAST);
		} else if (direction == Direction.WEST) {
			setDirection(Direction.SOUTH);
		}
	}
	
	public void move() {
		if (direction == Direction.NORTH) {
			// y+1
		} else if (direction == Direction.EAST) {
			// x+1
		} else if (direction == Direction.SOUTH) {
			// y-1
		} else if (direction == Direction.WEST) {
			// x-1
		}
	}

}
