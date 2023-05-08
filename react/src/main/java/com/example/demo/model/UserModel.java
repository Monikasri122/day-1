package com.example.demo.model;

import jakarta.persistence.Entity;

@Entity
public class UserModel {
	@jakarta.persistence.Id
	private int Id;
	private String Emai;
	private String Password;
	private String Username;
	private String MobileNumber;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getEmai() {
		return Emai;
	}
	public void setEmai(String emai) {
		Emai = emai;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getMobileNumber() {
		return MobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}


}
