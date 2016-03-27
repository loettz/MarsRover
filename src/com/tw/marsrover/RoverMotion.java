package com.tw.marsrover;

import java.util.ArrayList;
import java.util.List;

public enum RoverMotion {

	LEFT("L"), RIGHT("R"), MOVE("M");
	
	String s;
	
	private RoverMotion(String s) {
		this.s = s;
	}
	
	public static List<RoverMotion> generateMotionListByString(String in) {
		List<RoverMotion> rm = new ArrayList<RoverMotion>();
		for (int i = 0; i< in.length(); i++) {
			for (RoverMotion r : values()) {
				if (r.s.equals(in.substring(i, i + 1))) {
					rm.add(r);
					break;
				}
			}
		}
		return rm;
	}
}
