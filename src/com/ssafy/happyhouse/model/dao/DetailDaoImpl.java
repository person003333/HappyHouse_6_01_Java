package com.ssafy.happyhouse.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.ssafy.happyhouse.model.dto.AirInfo;
import com.ssafy.happyhouse.model.dto.MarketInfo;
import com.ssafy.happyhouse.util.DetailSAXParser;

public class DetailDaoImpl implements DetailDao{
	
	private List<MarketInfo> markList;
	private List<AirInfo> airList;

	public DetailDaoImpl() {
		loadData();
	}
	
	@Override
	public void loadData() {
		DetailSAXParser parser = new DetailSAXParser();
		markList = parser.getMarket();
		airList = parser.getAir();
	}

	@Override
	public List<MarketInfo> searchMarket(String dong) {
		List<MarketInfo> markList2 = new ArrayList<MarketInfo>();
		for (MarketInfo mark : markList) {
			if(mark.getDong().equals(dong)) {
				markList2.add(mark);
			}
		}
		return markList2;
	}

	@Override
	public AirInfo searchAir(String gu) {
		for(AirInfo air : airList) {
			if(air.getName().equals(gu)) {
				return air;
			}
		}
		return null;
	}
//
//	public static void main(String[] arg) {
//		DetailDao dao = new DetailDaoImpl();
//		System.out.println(dao.searchAir("종로구"));
//	}
}
