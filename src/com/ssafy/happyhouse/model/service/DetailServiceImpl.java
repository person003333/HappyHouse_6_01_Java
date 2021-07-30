package com.ssafy.happyhouse.model.service;

import java.util.List;

import com.ssafy.happyhouse.model.dao.DetailDao;
import com.ssafy.happyhouse.model.dao.DetailDaoImpl;
import com.ssafy.happyhouse.model.dto.AirInfo;
import com.ssafy.happyhouse.model.dto.MarketInfo;

public class DetailServiceImpl implements DetailService{

	private DetailDao dao;
	
	public DetailServiceImpl() {
		dao = new DetailDaoImpl();
	}

	@Override
	public List<MarketInfo> searchMarket(String dong) {
		return dao.searchMarket(dong);
	}

	@Override
	public AirInfo search(String gu) {
		return dao.searchAir(gu);
	}
	
//	public static void main(String[] args) {
//		DetailService s = new DetailServiceImpl();
//		System.out.println(s.search("종로구").toString());
//	}

}
