package com.tw.marsrover;


public enum Direction {
	
	NORTH, EAST, SOUTH, WEST;
	
	private static Direction[] vals = values();
    public Direction next(){
    	return vals[(this.ordinal()+1) % vals.length];
    }
    
    public Direction previous() {
    	return vals[(this.ordinal()-1 + vals.length) % vals.length];
    }
    
}
