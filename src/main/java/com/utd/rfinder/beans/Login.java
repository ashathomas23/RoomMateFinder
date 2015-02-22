package com.utd.rfinder.beans;

public class Login {

	private String mUsername;
	private String mPassword;
	private int mRole;
	
	public String getUsername() {
		return mUsername;
	}
	public void setUsername(String aUsername) {
		mUsername = aUsername;
	}
	public String getPassword() {
		return mPassword;
	}
	public void setPassword(String aPassword) {
		mPassword = aPassword;
	}
	public int getRole() {
		return mRole;
	}
	public void setRole(int aRole) {
		mRole = aRole;
	}
}
