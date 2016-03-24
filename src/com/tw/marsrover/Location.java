package com.tw.marsrover;

public class Location {
	private int x;
	private int y;
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public int getX() {	
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getY() {	
		return y;
	}
	
	public Location potentialNextLocation(Direction dir) {
		int x = this.x;
		int y = this.y;
		switch(dir) {
		case NORTH: y = (y +1);
		break;
		case EAST: x = (x +1);
		break;
		case SOUTH: y = (y -1);
		break;
		case WEST: x = (x -1);
		break;
		}
		Location pLoc = new Location(x, y);
		return pLoc;
		
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Location)) {
			return false;
		} else {
			Location l = (Location) o;
			return (this.x == l.x && this.y == l.x);
		}
	}
	
	@Override
	public int hashCode() {
		int hash = 1;
		hash = hash * 31 + x;
		hash = hash * 31 + y;
		return hash;
	}
}
