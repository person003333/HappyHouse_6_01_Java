package com.ssafy.happyhouse.model.dao;

import java.util.List;

import com.ssafy.happyhouse.model.dto.AirInfo;
import com.ssafy.happyhouse.model.dto.MarketInfo;

public interface DetailDao {
	public void loadData();
	
	public List<MarketInfo> searchMarket(String dong);
	
	public AirInfo searchAir(String gu);
}
