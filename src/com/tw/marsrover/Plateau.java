package com.tw.marsrover;

public class Plateau {
	
	private int upperRightX;
	private int upperRightY;
	
	
	public Plateau(int upperRightX, int upperRightY) {
		this.upperRightX = upperRightX;
		this.upperRightY = upperRightY;
	}
	
	public Location getUpperRightCoordinates() {
		Location upperRightCoordinates = new Location(upperRightX, upperRightY);
		return upperRightCoordinates;
	}

}
