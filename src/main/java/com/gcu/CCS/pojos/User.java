package com.gcu.CCS.pojos;

public class User {
	private int id;
	private String username;
	private String password;
	private String tel;
	
	public User() {//空构造方法必须有，否则sevice实现时会报错
		super();
	}
	public User(int id, String username, String password, String tel) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.tel = tel;
	}
	public int getNum() {
		return id;
	}
	public void setNum(int id) {
		this.id = id;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", tel=" + tel + "]";
	}
	
}
