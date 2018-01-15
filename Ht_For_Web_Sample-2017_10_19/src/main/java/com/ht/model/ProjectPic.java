package com.ht.model;

public class ProjectPic {
	
	private int projectPicId;
	private int projectId;
	private String picName;
	private int picStatus;
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getPicName() {
		return picName;
	}
	public void setPicName(String picName) {
		this.picName = picName;
	}
	
	public int getProjectPicId() {
		return projectPicId;
	}
	public void setProjectPicId(int projectPicId) {
		this.projectPicId = projectPicId;
	}
	public int getPicStatus() {
		return picStatus;
	}
	public void setPicStatus(int picStatus) {
		this.picStatus = picStatus;
	}
	@Override
	public String toString() {
		return "ProjectPic [projectPicId=" + projectPicId + ", projectId=" + projectId + ", picName=" + picName
				+ ", picStatus=" + picStatus + "]";
	}
	
}
