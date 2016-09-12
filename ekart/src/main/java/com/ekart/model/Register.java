package com.ekart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class Register {
	@Id@GeneratedValue
	private int UserID;
	private String Username;
	private String Password;
	private String EmailId;
	public int getUserID() {
		return UserID;
	}
	public String getUsername() {
		return Username;
	}
	public String getPassword() {
		return Password;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setUserID(int userID) {
		UserID = userID;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	
}

