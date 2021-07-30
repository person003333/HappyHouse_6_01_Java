package com.ssafy.happyhouse.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.ssafy.happyhouse.model.dto.MarketInfo;
import com.ssafy.happyhouse.view.HouseInfoView;

public class MarketHandler {
	
	private List<MarketInfo> market = new ArrayList<MarketInfo>();
	
	
	public MarketHandler() {
		this.reader();
	}
	public List<MarketInfo> search(String dong){
		List<MarketInfo> search = new ArrayList<MarketInfo>();
		for (MarketInfo marketInfo : market) {
			if(marketInfo.getDong().equals(dong)) {
				search.add(marketInfo);
			}
		}
		return search;
	}
	private List<MarketInfo> reader() {
		String line = null;
		File location = new File("res/종로구_편의점.csv");
		
		try {
			BufferedReader in = new BufferedReader(new FileReader(location));
			while((line = in.readLine())!=null) {
				String[] arr= line.split(",");
				MarketInfo m = new MarketInfo();
				m.setNo(Integer.parseInt(arr[0]));
				m.setMarketName(arr[1]);
				m.setMarketsubName(arr[2]);
				m.setCode(Integer.parseInt(arr[3])/100);
				m.setDong(arr[4]);
				m.setAdress(arr[5]);
				market.add(m);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return market;
		 
	}
	
	public static void main(String[] args) {
		MarketHandler m = new MarketHandler();
		for(MarketInfo mi : m.reader()) {
			System.out.println(mi);
		}
		System.out.println();
		List<MarketInfo> m2 = m.search("안국동");
		
		for (MarketInfo mi : m2) {
			System.out.println(mi);
		}
		
	}
	
}
