package com.ht.model;

public class NewPic {

	private int newPicId;
	private int newId;
	private String picName;
	private String picPath;
	private int picStatus;
	public int getNewPicId() {
		return newPicId;
	}
	public void setNewPicId(int newPicId) {
		this.newPicId = newPicId;
	}
	public int getNewId() {
		return newId;
	}
	public void setNewId(int newId) {
		this.newId = newId;
	}
	public String getPicName() {
		return picName;
	}
	public void setPicName(String picName) {
		this.picName = picName;
	}
	public String getPicPath() {
		return picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	public int getPicStatus() {
		return picStatus;
	}
	public void setPicStatus(int picStatus) {
		this.picStatus = picStatus;
	}
	@Override
	public String toString() {
		return "NewPic [newPicId=" + newPicId + ", newId=" + newId + ", picName=" + picName + ", picPath=" + picPath
				+ ", picStatus=" + picStatus + "]";
	}
	
}
