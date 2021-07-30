package com.ssafy.happyhouse.model.dto;

public class MarketInfo {
	/**거래 정보를 식별할 번호*/
	private int    no;
	/**법정 동명 */
	private String dong;
	/**아파트 이름 */
	private String marketName;
	//지점
	private String marketsubName;
	/**법정 동코드 */
	private int code;
	//주소
	private String adress;
	/**층*/
	private int floor;
	/**지번*/
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getDong() {
		return dong;
	}
	public void setDong(String dong) {
		this.dong = dong;
	}
	public String getMarketName() {
		return marketName;
	}
	public void setMarketName(String marketName) {
		this.marketName = marketName;
	}
	public String getMarketsubName() {
		return marketsubName;
	}
	public void setMarketsubName(String marketsubName) {
		this.marketsubName = marketsubName;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	@Override
	public String toString() {
		return "MarketInfo [no=" + no + ", dong=" + dong + ", marketName=" + marketName + ", marketsubName="
				+ marketsubName + ", code=" + code + ", adress=" + adress + ", floor=" + floor + "]";
	}
	
}
