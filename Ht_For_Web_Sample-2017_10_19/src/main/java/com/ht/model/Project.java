package com.ht.model;

public class Project {

	private int projectId;
	private String projectName;
	private String projectPlace;
	private String projectIntro;
	private String mainPic;
	private int projectStatus;
	
	public int getProjectId() {
		return projectId;
	}
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
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
	public String getMainPic() {
		return mainPic;
	}
	public void setMainPic(String mainPic) {
		this.mainPic = mainPic;
	}
	public int getProjectStatus() {
		return projectStatus;
	}
	public void setProjectStatus(int projectStatus) {
		this.projectStatus = projectStatus;
	}
	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + ", projectPlace=" + projectPlace
				+ ", projectIntro=" + projectIntro + ", mainPic=" + mainPic + ", projectStatus=" + projectStatus + "]";
	}
	
}
