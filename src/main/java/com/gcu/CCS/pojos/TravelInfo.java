package com.gcu.CCS.pojos;

import java.util.Date;

public class TravelInfo {
	private int id;
	private String ownerName;
	private String ownerTel;
	private Date date;
	private String start;
	private String end;
	private String startProvince;
	private String endProvince;
	private double price;
	private int ownerId;
	public TravelInfo() {
		super();
	}
	public TravelInfo(int id, String ownerName, String ownerTel, Date date, String start, String end,
			String startProvince, String endProvince, double price, int ownerId) {
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public int getOwnerId() {
		return ownerId;
	}
	public void setOwnerId(int ownerId) {
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
