package com.ssafy.happyhouse.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.happyhouse.model.dto.Airinfo;


public class AirHandler {
	private List<Airinfo> airInfo = new ArrayList<Airinfo>();
	
	
	public AirHandler() {
		this.reader();
	}
	
	public Airinfo search(String gu) {
		Airinfo air = new Airinfo();
		for (Airinfo ai : airInfo) {
			if(ai.getName().equals(gu)) {
				air = ai;
				break;
			}
		}
		return air;
	}

	private List<Airinfo> reader() {
		String line = null;
		File location = new File("res/air.csv");
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(location));
			while((line = in.readLine())!=null) {
				String[] arr= line.split(",");
				Airinfo m = new Airinfo();
				m.setName(arr[2]);
				m.setNO2(Double.parseDouble(arr[3]));
				m.setO3(Double.parseDouble(arr[4]));
				m.setCO(Double.parseDouble(arr[5]));
				m.setSOx(Double.parseDouble(arr[6]));
				m.setPM2(Double.parseDouble(arr[7]));
				m.setPM10(Double.parseDouble(arr[8]));
				
				m.setState(arr[9]);
				
				airInfo.add(m);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return airInfo;
		 
	}
	
	public static void main(String[] args) {
		AirHandler m = new AirHandler();
		for(Airinfo mi : m.reader()) {
			System.out.println(mi);
		}
		System.out.println();
		System.out.println(m.search("종로구"));
	}
	
	
}
