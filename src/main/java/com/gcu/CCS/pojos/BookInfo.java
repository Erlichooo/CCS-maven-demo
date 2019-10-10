package com.gcu.CCS.pojos;

public class BookInfo {
	private Integer id;
	private String name;
	private String tel;
	private Integer travelInfoId;
	private Integer userId;
	public BookInfo() {
		super();
	}
	public BookInfo(Integer id, String name, String tel, Integer travelInfoId, Integer userId) {
		super();
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.travelInfoId = travelInfoId;
		this.userId = userId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Integer getTravelInfoId() {
		return travelInfoId;
	}
	public void setTravelInfoId(Integer travelInfoId) {
		this.travelInfoId = travelInfoId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "BookInfo [id=" + id + ", name=" + name + ", tel=" + tel + ", travelInfoId=" + travelInfoId + ", userId="
				+ userId + "]";
	}
}
