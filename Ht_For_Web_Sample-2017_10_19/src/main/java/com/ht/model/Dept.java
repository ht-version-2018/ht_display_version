package com.ht.model;

public class Dept {
	
	private int deptId;
	private int compId;
	private String deptName;
	private String deptTel;
	private String deptContact;
	private String deptEmail;
	private int deptStatus;
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public int getCompId() {
		return compId;
	}
	public void setCompId(int compId) {
		this.compId = compId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptTel() {
		return deptTel;
	}
	public void setDeptTel(String deptTel) {
		this.deptTel = deptTel;
	}
	public String getDeptContact() {
		return deptContact;
	}
	public void setDeptContact(String deptContact) {
		this.deptContact = deptContact;
	}
	public String getDeptEmail() {
		return deptEmail;
	}
	public void setDeptEmail(String deptEmail) {
		this.deptEmail = deptEmail;
	}
	public int getDeptStatus() {
		return deptStatus;
	}
	public void setDeptStatus(int deptStatus) {
		this.deptStatus = deptStatus;
	}
	@Override
	public String toString() {
		return "Dept [deptId=" + deptId + ", compId=" + compId + ", deptName=" + deptName + ", deptTel=" + deptTel
				+ ", deptContact=" + deptContact + ", deptEmail=" + deptEmail + ", deptStatus=" + deptStatus + "]";
	}
	
}
