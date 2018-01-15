package com.ht.model;

public class Comp {
	
	private int compId;
	private String compName;
	private String compAddress;
	private String compIntro;
	private String compContact;
	private String compTel;
	private String compLink;
	private String compTag;
	private int compStatus;
	
	public int getCompId() {
		return compId;
	}
	public void setCompId(int compId) {
		this.compId = compId;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public String getCompAddress() {
		return compAddress;
	}
	public void setCompAddress(String compAddress) {
		this.compAddress = compAddress;
	}
	public String getCompIntro() {
		return compIntro;
	}
	public void setCompIntro(String compIntro) {
		this.compIntro = compIntro;
	}
	public String getCompContact() {
		return compContact;
	}
	public void setCompContact(String compContact) {
		this.compContact = compContact;
	}
	public String getCompTel() {
		return compTel;
	}
	public void setCompTel(String compTel) {
		this.compTel = compTel;
	}
	public String getCompLink() {
		return compLink;
	}
	public void setCompLink(String compLink) {
		this.compLink = compLink;
	}
	public String getCompTag() {
		return compTag;
	}
	public void setCompTag(String compTag) {
		this.compTag = compTag;
	}
	public int getCompStatus() {
		return compStatus;
	}
	public void setCompStatus(int compStatus) {
		this.compStatus = compStatus;
	}
	@Override
	public String toString() {
		return "Comp [compId=" + compId + ", compName=" + compName + ", compAddress=" + compAddress + ", compIntro="
				+ compIntro + ", compContact=" + compContact + ", compTel=" + compTel + ", compLink=" + compLink
				+ ", compTag=" + compTag + ", compStatus=" + compStatus + "]";
	}
	
}
