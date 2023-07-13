package com.onlineshopping.dto;

public class UserLoginRequest {
	
	private String Id;
	private String password;
	private String role;
	
	public String getEmailId() {
		return Id;
	}
	public void setEmailId(String emailId) {
		this.Id = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "UserLoginRequest [emailId=" + Id + ", password=" + password + "]";
	}
	
}
