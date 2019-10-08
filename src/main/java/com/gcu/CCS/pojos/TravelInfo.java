package com.gcu.CCS.pojos;

import java.security.Timestamp;

public class TravelInfo {
	private int id;
	private String ownerName;
	private String ownerTel;
	private Timestamp date;
	private String address;
	private double price;
	private int owner_id;
	public TravelInfo() {
		super();
	}
	public TravelInfo(int id, String ownerName, String ownerTel, Timestamp date, String address, double price, int owner_id) {
		super();
		this.id = id;
		this.ownerName = ownerName;
		this.ownerTel = ownerTel;
		this.date = date;
		this.address = address;
		this.price = price;
		this.owner_id = owner_id;
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
	public Timestamp getDate() {
		return date;
	}
	public void setDate(Timestamp date) {
		this.date = date;
	}
	public String getAdress() {
		return address;
	}
	public void setAdress(String address) {
		this.address = address;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getOwner_id() {
		return owner_id;
	}
	public void setOwner_id(int owner_id) {
		this.owner_id = owner_id;
	}
	@Override
	public String toString() {
		return "travelInfo [id=" + id + ", ownerName=" + ownerName + ", ownerTel=" + ownerTel + ", date=" + date
				+ ", address=" + address + ", price=" + price + ", owner_id=" + owner_id + "]";
	}
}
