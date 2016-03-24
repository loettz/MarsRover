package com.tw.marsrover;

public class Plateau {
	
	private int upperRightX;
	private int upperRightY;
	
	
	public Plateau(int upperRightX, int upperRightY) {
		this.upperRightX = upperRightX;
		this.upperRightY = upperRightY;
	}
	
	public int getUpperRightX() {
		return upperRightX;
	}
	
	public int getUpperRightY() {
		return upperRightY;
	}
	
	public Location getUpperRightCoordinates() {
		Location upperRightCoordinates = new Location(upperRightX, upperRightY);
		return upperRightCoordinates;
	}
	
	public boolean inBounds(Location l) {
		if (l.getX() < 0 || l.getX() > this.upperRightX) return false;
		if (l.getY() < 0 || l.getY() > this.upperRightY) return false;
		return true;
		
	}

}
