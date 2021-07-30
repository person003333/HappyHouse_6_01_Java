package com.ssafy.happyhouse.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Label;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.xml.soap.Detail;

import com.ssafy.happyhouse.model.dto.AirInfo;
import com.ssafy.happyhouse.model.dto.HouseDeal;
import com.ssafy.happyhouse.model.dto.MarketInfo;
import com.ssafy.happyhouse.model.service.DetailService;
import com.ssafy.happyhouse.model.service.DetailServiceImpl;

public class DetailView {
	
	private DetailService 		service;
	
	/** 정보 화면 */
	private JFrame infoFrame;
	
	/**환경정보 표시할 table*/
	private JTable			  	envTable;
	private JScrollPane		  	envPan;
	private String[]		  	envTitle = {"이산화질소", "오존", "일산화탄소", "아황산가스", "미세먼지", "초미세먼지", "통합대기환경지수 등급"};
	
	/**상권정보 표시할 table*/
	private JTable			  	infoTable;
	private JScrollPane		  	infoPan;
	private String[]		  	infoTitle = { "이름", "지점명", "동", "주소"};
	
	public void showInfoView(String dong, String gu) {
		infoFrame = new JFrame("추가 정보");
		
		// view 구성 
		JPanel panel = new JPanel(new BorderLayout());
		
		// 환경 정보 
		AirInfo air = service.search(gu);
		
		String[][] envContents = {
				{Double.toString(air.getNO2()), Double.toString(air.getO3()), Double.toString(air.getCO()), 
					Double.toString(air.getSOx()), Double.toString(air.getPM2()), Double.toString(air.getPM10()),
					air.getState()}
		};
		
		JPanel envirPanel = new JPanel(new BorderLayout());
		envirPanel.add(new JLabel("주변 환경 정보", JLabel.CENTER),"North");
		envTable = new JTable(envContents, envTitle);
		envPan = new JScrollPane(envTable);
		envPan.setPreferredSize(new Dimension(800,100));
		envirPanel.add(envPan);
		envirPanel.add(new Label(""),"South");
		
		// 상권 정보 
		List<MarketInfo> marketList = service.searchMarket(dong);
		
		String[][] storeContents = new String[marketList.size()][4];
		for(int i=0;i<marketList.size();i++) {
			MarketInfo info = marketList.get(i);
			
			storeContents[i][0] = info.getMarketName();
			storeContents[i][1] = info.getMarketsubName();
			storeContents[i][2] = info.getDong();
			storeContents[i][3] = info.getAdress();
		}
		
		JPanel storePanel = new JPanel(new BorderLayout());
		infoTable = new JTable(storeContents,infoTitle);
		infoPan = new JScrollPane(infoTable);
		storePanel.add(new JLabel("주변 편의점 상권 정보", JLabel.CENTER),"North");
		storePanel.add(infoPan,"Center");
		
		panel.add(envirPanel,"North");
		panel.add(storePanel,"Center");
		
		panel.setBorder(BorderFactory.createEmptyBorder(20 , 10 , 10 , 10));
		infoFrame.add(panel,"Center");
		
		
		infoFrame.setSize(800, 500);
		infoFrame.setResizable(true);
		infoFrame.setVisible(true);
	}
	
	public DetailView() {
		service = new DetailServiceImpl();
		showInfoView("사직동","종로구");
	}
	public DetailView(String dong, String gu) {
		service = new DetailServiceImpl();
		showInfoView(dong, gu);
	}
	
}
