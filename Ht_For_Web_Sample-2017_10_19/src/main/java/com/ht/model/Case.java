package com.ht.model;

public class Case {

	private int caseId;
	private String caseName;
	private String mainPic;
	private int caseStatus;  //0��ʾɾ����1��ʾ����
	
	public int getCaseId() {
		return caseId;
	}
	public void setCaseId(int caseId) {
		this.caseId = caseId;
	}
	public String getCaseName() {
		return caseName;
	}
	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}
	public String getMainPic() {
		return mainPic;
	}
	public void setMainPic(String mainPic) {
		this.mainPic = mainPic;
	}
	public int getCaseStatus() {
		return caseStatus;
	}
	public void setCaseStatus(int caseStatus) {
		this.caseStatus = caseStatus;
	}
	@Override
	public String toString() {
		return "Case [caseId=" + caseId + ", caseName=" + caseName + ", mainPic=" + mainPic + ", caseStatus="
				+ caseStatus + "]";
	}
	
}
