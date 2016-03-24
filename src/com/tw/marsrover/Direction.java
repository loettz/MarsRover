package com.tw.marsrover;


public enum Direction {
	
	
	
	NORTH {
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
		
	}, EAST {
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
		
	}, SOUTH {
		@Override
		public int possibleMoves(Location l, Plateau p) {
			
			return l.getY();
		}
		
		@Override
		public void move(MarsRover mr) {
			Location currentLocation = mr.getLocation();
			Location newLocation = new Location (currentLocation.getX(), currentLocation.getY() + 1);
			mr.setLocation(newLocation);
		}
		
	}, WEST {
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

		
	private static Direction[] vals = values();

	public Direction next() {
    	return vals[(this.ordinal() +1)  % vals.length];
    }  

	public Direction previous() {
    	return vals[(this.ordinal()-1 + vals.length) % vals.length];
    }
    
    public int possibleMoves(Location l, Plateau p) {
		return 0;

	}
	public void move(MarsRover mr) {
		
	}
}

