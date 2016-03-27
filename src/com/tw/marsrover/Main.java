package com.tw.marsrover;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a path:");
		String path = sc.nextLine();
		ReadInput ri = new ReadInput(path);
		List<String> roverData = ri.openFile();
		RoverDataParser rdp = new RoverDataParser(roverData);
		Plateau p = rdp.generatePlateau();
		List<MarsRover> rovers = rdp.generateRoverList(p);
		for (MarsRover mr : rovers) {
			mr.executeMotions();
		}
		for (MarsRover mr : rovers) {
			System.out.println(mr.toString());
		}
		
	}
}
