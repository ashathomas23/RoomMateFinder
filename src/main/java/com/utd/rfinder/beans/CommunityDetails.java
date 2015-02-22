package com.utd.rfinder.beans;

public class CommunityDetails {
	private int mCommunityId;
	private String mCommunityName;
	private String mCommunityAddress;
	private String mCity;
	private String mState;
	private int mZipCode;
	public int getCommunityId() {
		return mCommunityId;
	}
	public void setCommunityId(int aCommunityId) {
		mCommunityId = aCommunityId;
	}
	public String getCommunityName() {
		return mCommunityName;
	}
	public void setCommunityName(String aCommunityName) {
		mCommunityName = aCommunityName;
	}
	public String getCommunityAddress() {
		return mCommunityAddress;
	}
	public void setCommunityAddress(String aCommunityAddress) {
		mCommunityAddress = aCommunityAddress;
	}
	public String getCity() {
		return mCity;
	}
	public void setCity(String aCity) {
		mCity = aCity;
	}
	public String getState() {
		return mState;
	}
	public void setState(String aState) {
		mState = aState;
	}
	public int getZipCode() {
		return mZipCode;
	}
	public void setZipCode(int aZipCode) {
		mZipCode = aZipCode;
	}
	
}
