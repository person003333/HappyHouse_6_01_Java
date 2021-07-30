package com.ssafy.happyhouse.model.dto;

public class Airinfo {

	//구 이름
	private String Name;
	//이산화질소 농도(단위:ppm)
	private double NO2;
	//오존 농도(단위:ppm)
	private double O3;
	//일산화탄소 농도(단위:ppm)
	private double CO;
	//아황산가스 농도(단위:ppm)
	private double SOx;
	//미세먼지 농도(단위:㎍/㎥)
	private double PM2;
	//	초미세먼지 농도(단위:㎍/㎥)
	private double PM10;
	//상태
	private String state;
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getNO2() {
		return NO2;
	}

	public void setNO2(double nO2) {
		NO2 = nO2;
	}

	public double getO3() {
		return O3;
	}

	public void setO3(double o3) {
		O3 = o3;
	}

	public double getCO() {
		return CO;
	}

	public void setCO(double cO) {
		CO = cO;
	}

	public double getSOx() {
		return SOx;
	}

	public void setSOx(double sOx) {
		SOx = sOx;
	}

	public double getPM2() {
		return PM2;
	}

	public void setPM2(double pM2) {
		PM2 = pM2;
	}

	public double getPM10() {
		return PM10;
	}

	public void setPM10(double pM10) {
		PM10 = pM10;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Airinfo [Name=" + Name + ", NO2=" + NO2 + ", O3=" + O3 + ", CO=" + CO + ", SOx=" + SOx + ", PM2=" + PM2
				+ ", PM10=" + PM10 + ", state=" + state + "]";
	}
	
	
}
