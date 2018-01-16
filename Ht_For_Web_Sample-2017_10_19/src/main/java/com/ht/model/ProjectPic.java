package com.ht.model;

public class ProjectPic {
	private Integer projectId;
	private String picName;
	private String picPath;
	private Integer picStatus;
	
	/*
	 * �޲����Ĺ��췽��
	 */
	public ProjectPic(){}
	
	/*
	 * �в����Ĺ��췽��
	 */
	
	public ProjectPic(Integer projectId,String picName,String picPath,Integer picStatus){
		super();
		this.projectId=projectId;
		this.picName=picName;
		this.picPath=picPath;
		this.picStatus=picStatus;
	}
	
	/*
	 * get��set����
	 */
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
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
	public Integer getPicStatus() {
		return picStatus;
	}
	public void setPicStatus(Integer picStatus) {
		this.picStatus = picStatus;
	}
	
	@Override
	public String toString(){
		return "ProjectPic[projectId="+ projectId +",picName="+ picName +",picPath="+ picPath +",picStatus="+ picStatus + "]";
	}

}
