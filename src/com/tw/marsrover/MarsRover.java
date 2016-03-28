package com.tw.marsrover;

import java.util.List;

public class MarsRover {
	
	
	private Location location;
	
	private Direction direction;
	
	private Plateau plateau;
	
	private List<RoverMotion> roverMotions;
	

	public MarsRover(Location location, Direction direction, Plateau plateau) {
		this.location = location;
		this.direction = direction;
		this.plateau = plateau;
		
	}
	
	public int possibleMoves() {
		return direction.possibleMoves(location, plateau);
	}
	
	
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
	
	public List<RoverMotion> getRoverMotions() {
		return roverMotions;
	}

	public void setRoverMotions(List<RoverMotion> roverMotions) {
		this.roverMotions = roverMotions;
	}
	
	public void turnRight() {
		setDirection(direction.next());
	}
	
	public void turnLeft() {
		setDirection(direction.previous());
	}
	
	
	public void move() {
		if (!(possibleMoves() <= 0) ){
			direction.move(this);
		}
	}
	
	public void executeMotions() {
		for (RoverMotion r : roverMotions) {
			if (r == RoverMotion.LEFT) {
				turnLeft();
			} else if (r == RoverMotion.RIGHT) {
				turnRight();
			} else if (r == RoverMotion.MOVE) {
				move();
			}
		}
	}
	
	@Override
	public String toString() {
		return location.getX() + " " + location.getY() + " " + direction;
	}

}
