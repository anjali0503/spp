package com.mindgate.main.domain;

import java.util.Objects;

public class LoginDetails {

	private int  loginId;
	private String password;
	private String userId;
	private String designation;
	
	public LoginDetails() {
		// TODO Auto-generated constructor stub
	}

	public LoginDetails(int loginId, String password, String userId, String designation) {
		super();
		this.loginId = loginId;
		this.password = password;
		this.userId = userId;
		this.designation = designation;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "LoginDetails [loginId=" + loginId + ", password=" + password + ", userId=" + userId + ", designation="
				+ designation + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(designation, loginId, password, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoginDetails other = (LoginDetails) obj;
		return Objects.equals(designation, other.designation) && Objects.equals(loginId, other.loginId)
				&& Objects.equals(password, other.password) && Objects.equals(userId, other.userId);
	}
	
	
	
}
