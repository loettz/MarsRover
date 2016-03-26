package com.tw.marsrover;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadInput {
private String path;
	
	public ReadInput(String file_path) {
		path = file_path;
	}
		
	public ArrayList<String> openFile() {
		FileReader fr;
		try {
			fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			ArrayList<String> textData = new ArrayList<String>();
			String aLine;
			while ((aLine = br.readLine()) != null) {
				textData.add(aLine);
			}
		br.close(); 
		return textData;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
