package com.gcu.CCS.pojos;

public class BookInfo {
	private int id;
	private String user_name;
	private String user_tel;
	private String address;
	private int travel_info_id;
	private int user_id;
	public BookInfo() {
		super();
	}
	public BookInfo(int id, String user_name, String user_tel, String address, int travel_info_id, int user_id) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.user_tel = user_tel;
		this.address = address;
		this.travel_info_id = travel_info_id;
		this.user_id = user_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_tel() {
		return user_tel;
	}
	public void setUser_tel(String user_tel) {
		this.user_tel = user_tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getTravel_info_id() {
		return travel_info_id;
	}
	public void setTravel_info_id(int travel_info_id) {
		this.travel_info_id = travel_info_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "bookInfo [id=" + id + ", user_name=" + user_name + ", user_tel=" + user_tel + ", address=" + address
				+ ", travel_info_id=" + travel_info_id + ", user_id=" + user_id + "]";
	}
}
