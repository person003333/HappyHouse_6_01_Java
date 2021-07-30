package com.ssafy.happyhouse.model.dao;

import java.util.List;

import com.ssafy.happyhouse.model.dto.AirInfo;
import com.ssafy.happyhouse.model.dto.MarketInfo;

public interface DetailDao {
	public void loadData();
	
	public List<MarketInfo> searchMarket();
	
	public AirInfo searchAir(String gu);
}
