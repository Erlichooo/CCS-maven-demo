package com.gcu.CCS.pojos;

import java.util.Date;

public class TravelInfo {
	private Integer id;
	private String ownerName;//来自owners表，通过ownerId匹配
	private String ownerTel;//来自owners表，通过ownerId匹配
	private Date date;
	private String start;
	private String end;
	private String startProvince;
	private String endProvince;
	private double price;
	private Integer ownerId;
	public TravelInfo() {
		super();
	}
	public TravelInfo(Integer id, String ownerName, String ownerTel, Date date, String start, String end,
			String startProvince, String endProvince, double price, Integer ownerId) {
		super();
		this.id = id;
		this.ownerName = ownerName;
		this.ownerTel = ownerTel;
		this.date = date;
		this.start = start;
		this.end = end;
		this.startProvince = startProvince;
		this.endProvince = endProvince;
		this.price = price;
		this.ownerId = ownerId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerTel() {
		return ownerTel;
	}
	public void setOwnerTel(String ownerTel) {
		this.ownerTel = ownerTel;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(Integer ownerId) {
		this.ownerId = ownerId;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getStartProvince() {
		return startProvince;
	}
	public void setStartProvince(String startProvince) {
		this.startProvince = startProvince;
	}
	public String getEndProvince() {
		return endProvince;
	}
	public void setEndProvince(String endProvince) {
		this.endProvince = endProvince;
	}
	@Override
	public String toString() {
		return "TravelInfo [id=" + id + ", ownerName=" + ownerName + ", ownerTel=" + ownerTel + ", date=" + date
				+ ", start=" + start + ", end=" + end + ", startProvince=" + startProvince + ", endProvince="
				+ endProvince + ", price=" + price + ", ownerId=" + ownerId + "]";
	}
}
