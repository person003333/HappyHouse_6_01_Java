package com.ssafy.happyhouse.model.service;

import java.util.List;

import com.ssafy.happyhouse.model.dto.AirInfo;
import com.ssafy.happyhouse.model.dto.MarketInfo;

public interface DetailService {
	
	public List<MarketInfo> searchMarket(String dong);
	
	public AirInfo search(String gu);
}
