package com.tw.marsrover;

import java.util.ArrayList;
import java.util.List;

public class RoverDataParser {
	
	private static final int PLATEAU_INDEX = 0;
	private List<String> data;
	
	public RoverDataParser(List<String> data) {
		this.data = data;
	}
	
	public Plateau generatePlateau() {
		
		String[] parts = data.get(PLATEAU_INDEX).split(" ");
		Plateau p = new Plateau(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
		return p;
		
	} 
	
	public List<MarsRover> generateRoverList(Plateau p) {
		
		List<MarsRover> rovers = new ArrayList<MarsRover>();
		int roverIndex = 1;
		while (roverIndex < data.size()) {
			String[] parts = data.get(roverIndex++).split(" ");
			Location l = new Location(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
			Direction d = Direction.getByString(parts[2]);
			MarsRover mr = new MarsRover(l, d, p);
			mr.setRoverMotions(RoverMotion.generateMotionListByString(data.get(roverIndex++)));
			rovers.add(mr);
		}
		return rovers;
	}

}
