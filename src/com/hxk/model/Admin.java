package com.hxk.model;

import java.util.Arrays;

public class Admin {

	public Admin() {
		// TODO Auto-generated constructor stub
	}
	private int id;
	private String name;
	private String gllc;
	private String age;
	private String birth;
	private String phone;
	private String admnumber;
	private byte[] avatar;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public byte[] getAvatar() {
		return avatar;
	}
	public void setAvatar(byte[] avatar) {
		this.avatar = avatar;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGllc() {
		return gllc;
	}
	public void setGllc(String gllc) {
		this.gllc = gllc;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdmnumber() {
		return admnumber;
	}
	public void setAdmnumber(String admnumber) {
		this.admnumber = admnumber;
	}
	@Override
	public String toString() {
		return "Admin [name=" + name + ", gllc=" + gllc + ", age=" + age + ", birth=" + birth + ", phone=" + phone
				+ ", admnumber=" + admnumber + ", avatar=" + Arrays.toString(avatar) + "]";
	}
	

}
