package com.ht.model;

public class Project {
	private Integer projectId;
	private String projectName;
	private String projectBegin;
	private String projectEnd;
	private String projectPlace;
	private String projectIntro;
	private String projectPic;
	private Integer projectStatus;
	
	/*
	 * 无参数构造函数
	 */
	
	public Project(){}
	
	/*
	 * 有参数构造函数
	 */
	
	public Project(Integer projectId,String projectName,String projectBegin,String projectEnd
			,String projectPlace,String projectIntro,String projectPic,Integer projectStatus){
		super();
		this.projectId=projectId;
		this.projectName=projectName;
		this.projectBegin=projectBegin;
		this.projectEnd=projectEnd;
		this.projectPlace=projectPlace;
		this.projectIntro=projectIntro;
		this.projectPic=projectPic;
		this.projectStatus=projectStatus;
	}
	
	/*
	 * get和set方法
	 */
	public Integer getProjectId() {
		return projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectBegin() {
		return projectBegin;
	}
	public void setProjectBegin(String projectBegin) {
		this.projectBegin = projectBegin;
	}
	public String getProjectEnd() {
		return projectEnd;
	}
	public void setProjectEnd(String projectEnd) {
		this.projectEnd = projectEnd;
	}
	public String getProjectPlace() {
		return projectPlace;
	}
	public void setProjectPlace(String projectPlace) {
		this.projectPlace = projectPlace;
	}
	public String getProjectIntro() {
		return projectIntro;
	}
	public void setProjectIntro(String projectIntro) {
		this.projectIntro = projectIntro;
	}
	public String getProjectPic() {
		return projectPic;
	}
	public void setProjectPic(String projectPic) {
		this.projectPic = projectPic;
	}
	public Integer getProjectStatus() {
		return projectStatus;
	}
	public void setProjectStatus(Integer projectStatus) {
		this.projectStatus = projectStatus;
	}
	
	@Override
	public String toString(){
		return "Project[projectId=" + projectId +",projectName=" + projectName +",projectBegin=" + projectBegin +",projectEnd="
				+ projectEnd +",projectPlace=" + projectPlace +",projectIntro=" + projectIntro +",projectPic=" + projectPic +",projectStatus="
				+ projectStatus +"]";
	}
}
