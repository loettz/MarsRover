package com.tw.marsrover;


public enum Direction {
	
	NORTH(1), EAST(2), SOUTH(3), WEST(4);
	
	private int number;
	
	
	private Direction(int num) {
		num = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public static Direction getNext(Direction dir) {
		int i = ((dir.getNumber() +1) % Direction.values().length);
		dir = Direction.values()[i];
		return dir;
	}
	public static Direction getPrevious(Direction dir) {
		int i = ((dir.getNumber()-1) % Direction.values().length);
		dir = Direction.values()[i];
		return dir;
	}

}
