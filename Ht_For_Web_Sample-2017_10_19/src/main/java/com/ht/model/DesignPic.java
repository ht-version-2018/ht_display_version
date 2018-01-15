package com.ht.model;

public class DesignPic {
	
	private int designPicId;
	private String designPicPath;
	private int planId;
	private int designPicTag;
	private int designPicDirect;
	private int designPicStatus;
	public int getDesignPicId() {
		return designPicId;
	}
	public void setDesignPicId(int designPicId) {
		this.designPicId = designPicId;
	}
	public String getDesignPicPath() {
		return designPicPath;
	}
	public void setDesignPicPath(String designPicPath) {
		this.designPicPath = designPicPath;
	}
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public int getDesignPicTag() {
		return designPicTag;
	}
	public void setDesignPicTag(int designPicTag) {
		this.designPicTag = designPicTag;
	}
	public int getDesignPicDirect() {
		return designPicDirect;
	}
	public void setDesignPicDirect(int designPicDirect) {
		this.designPicDirect = designPicDirect;
	}
	public int getDesignPicStatus() {
		return designPicStatus;
	}
	public void setDesignPicStatus(int designPicStatus) {
		this.designPicStatus = designPicStatus;
	}
	@Override
	public String toString() {
		return "DesignPic [designPicId=" + designPicId + ", designPicPath=" + designPicPath + ", planId=" + planId
				+ ", designPicTag=" + designPicTag + ", designPicDirect=" + designPicDirect + ", designPicStatus="
				+ designPicStatus + "]";
	}
	
}
