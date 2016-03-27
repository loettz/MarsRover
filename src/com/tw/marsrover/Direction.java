package com.tw.marsrover;


public enum Direction {
	
	
	
	NORTH("N") {
		@Override
		public int possibleMoves(Location l, Plateau p) {
			return p.getUpperRightY() - l.getY();
			
		} 
		
		@Override
		public void move(MarsRover mr) {
			Location currentLocation = mr.getLocation();
			Location newLocation = new Location (currentLocation.getX(), currentLocation.getY() + 1);
			mr.setLocation(newLocation);
		}
		
	}, EAST("E") {
		@Override
		public int possibleMoves(Location l, Plateau p) {
			return p.getUpperRightX() - l.getX();
		}
		@Override
		public void move(MarsRover mr) {
			Location currentLocation = mr.getLocation();
			Location newLocation = new Location (currentLocation.getX() + 1, currentLocation.getY());
			mr.setLocation(newLocation);
		}
		
	}, SOUTH("S") {
		@Override
		public int possibleMoves(Location l, Plateau p) {
			return l.getY();
		}
		
		@Override
		public void move(MarsRover mr) {
			Location currentLocation = mr.getLocation();
			Location newLocation = new Location (currentLocation.getX(), currentLocation.getY() - 1);
			mr.setLocation(newLocation);
		}
		
	}, WEST("W") {
		@Override
		public int possibleMoves(Location l, Plateau p) {
			return l.getX();
		}
		
		@Override
		public void move(MarsRover mr) {
			Location currentLocation = mr.getLocation();
			Location newLocation = new Location (currentLocation.getX() -1, currentLocation.getY());
			mr.setLocation(newLocation);
		}
		
	};
	
	private String s;

	private Direction(String s) {
		this.s = s;
	}
		
	private static Direction[] vals = values();
	
	public static Direction getByString(String dirString) {
		for (Direction d : vals) {
			if (dirString.equals(d.s)) {
				return d;
			}
		}
		return null;
	}

	public Direction next() {
    	return vals[(this.ordinal() +1)  % vals.length];
    }  

	public Direction previous() {
    	return vals[(this.ordinal()-1 + vals.length) % vals.length];
    }
    
    public abstract int possibleMoves(Location l, Plateau p);

	public abstract void move(MarsRover mr);

	@Override
	public String toString() {
		return s;
	}
}

