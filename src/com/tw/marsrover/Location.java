package com.tw.marsrover;

public class Location {
	int x;
	int y;
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
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
