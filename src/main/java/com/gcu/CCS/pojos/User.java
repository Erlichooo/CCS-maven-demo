package com.gcu.CCS.pojos;

public class User {
	private int num;
	private String username;
	private String password;
	
	public User() {//空构造方法必须有，否则sevice实现时会报错
		super();
	}
	public User(int num, String username, String password) {
		super();
		this.num = num;
		this.username = username;
		this.password = password;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [num=" + num + ", username=" + username + ", password=" + password + "]";
	}
	
}
