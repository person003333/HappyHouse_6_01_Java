package com.ssafy.happyhouse.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.xml.sax.helpers.DefaultHandler;

import com.ssafy.happyhouse.model.dto.AirInfo;


public class AirHandler extends DefaultHandler{
	private List<AirInfo> airInfo = new ArrayList<AirInfo>();
	
	
	public AirHandler() {
		this.reader();
	}
	
	public AirInfo search(String gu) {
		AirInfo air = new AirInfo();
		for (AirInfo ai : airInfo) {
			if(ai.getName().equals(gu)) {
				air = ai;
				break;
			}
		}
		return air;
	}

	private List<AirInfo> reader() {
		String line = null;
		File location = new File("res/air.csv");
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(location));
			while((line = in.readLine())!=null) {
				String[] arr= line.split(",");
				AirInfo m = new AirInfo();
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

	public List<AirInfo> getAirInfo() {
		return airInfo;
	}
	
//	public static void main(String[] args) {
//		AirHandler m = new AirHandler();
//		for(AirInfo mi : m.reader()) {
//			System.out.println(mi);
//		}
//		System.out.println();
//		System.out.println(m.search("종로구"));
//	}
	
	
}
