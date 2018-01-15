package com.ht.model;

public class CasePic {

	private int picId;
	private int caseId;
	private String picPath;
	private String picName;
	private int picStatus;
	public int getPicId() {
		return picId;
	}
	public void setPicId(int picId) {
		this.picId = picId;
	}
	public int getCaseId() {
		return caseId;
	}
	public void setCaseId(int caseId) {
		this.caseId = caseId;
	}
	public String getPicPath() {
		return picPath;
	}
	public void setPicPath(String picPath) {
		this.picPath = picPath;
	}
	public String getPicName() {
		return picName;
	}
	public void setPicName(String picName) {
		this.picName = picName;
	}
	public int getPicStatus() {
		return picStatus;
	}
	public void setPicStatus(int picStatus) {
		this.picStatus = picStatus;
	}
	@Override
	public String toString() {
		return "CasePic [picId=" + picId + ", caseId=" + caseId + ", picPath=" + picPath + ", picName=" + picName
				+ ", picStatus=" + picStatus + "]";
	}
	
}
