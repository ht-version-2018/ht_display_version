package com.ht.model;

public class StaticWeb {

	private int recordId;
	private String staticWebTitle;
	private int staticWebTag;
	private String staticWebContent;
	private int staticWebStatus;
	public int getRecordId() {
		return recordId;
	}
	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}
	public String getStaticWebTitle() {
		return staticWebTitle;
	}
	public void setStaticWebTitle(String staticWebTitle) {
		this.staticWebTitle = staticWebTitle;
	}
	public int getStaticWebTag() {
		return staticWebTag;
	}
	public void setStaticWebTag(int staticWebTag) {
		this.staticWebTag = staticWebTag;
	}
	public String getStaticWebContent() {
		return staticWebContent;
	}
	public void setStaticWebContent(String staticWebContent) {
		this.staticWebContent = staticWebContent;
	}
	public int getStaticWebStatus() {
		return staticWebStatus;
	}
	public void setStaticWebStatus(int staticWebStatus) {
		this.staticWebStatus = staticWebStatus;
	}
	@Override
	public String toString() {
		return "StaticWeb [recordId=" + recordId + ", staticWebTitle=" + staticWebTitle + ", staticWebTag="
				+ staticWebTag + ", staticWebContent=" + staticWebContent + ", staticWebStatus=" + staticWebStatus
				+ "]";
	}
	
}
