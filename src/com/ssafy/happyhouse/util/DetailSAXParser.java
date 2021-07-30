package com.ssafy.happyhouse.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.ssafy.happyhouse.model.dto.AirInfo;
import com.ssafy.happyhouse.model.dto.MarketInfo;

public class DetailSAXParser {
	private static List<MarketInfo> market = new ArrayList<MarketInfo>();
	private static List<AirInfo> air = new ArrayList<AirInfo>();
	
	private static void loadData() {
		MarketHandler mhandler = new MarketHandler();
		market = mhandler.getMarket();
		
		System.out.println();
		
		AirHandler ahandler = new AirHandler();
		air = ahandler.getAirInfo();
	}
	
	public DetailSAXParser() {
		loadData();
	}

	public List<MarketInfo> getMarket() {
		return market;
	}

	public List<AirInfo> getAir() {
		return air;
	}

	public void setMarket(List<MarketInfo> market) {
		this.market = market;
	}

	public void setAir(List<AirInfo> air) {
		this.air = air;
	}
	
	public static void main(String[] args) {
		loadData();
	}
}
