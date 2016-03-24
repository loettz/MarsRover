package com.tw.marsrover;

public class MarsRover {
	
	
	private Location location;
	
	private Direction direction;
	
	private Plateau plateau;
	
	
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
	
	public void turnRight() {
		setDirection(direction.next());
	}
	
	public void turnLeft() {
		setDirection(direction.previous());
	}
	
	public boolean isMoveable(Plateau p) {
		Location l = location.potentialNextLocation(direction);
		return p.inBounds(l);
	}
	
	public void move() {
		if (!(possibleMoves() <= 0) ){

			direction.move(this);
			
		}

	}

}
