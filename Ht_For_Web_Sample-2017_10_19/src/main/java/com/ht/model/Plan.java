package com.ht.model;

public class Plan {

	private int planId;
	private String planName;
	private int planFloor;
	private int planMinArea;
	private int planMaxArea;
	private String planPicPath;
	private int planStatus;
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public int getPlanFloor() {
		return planFloor;
	}
	public void setPlanFloor(int planFloor) {
		this.planFloor = planFloor;
	}
	public int getPlanMinArea() {
		return planMinArea;
	}
	public void setPlanMinArea(int planMinArea) {
		this.planMinArea = planMinArea;
	}
	public int getPlanMaxArea() {
		return planMaxArea;
	}
	public void setPlanMaxArea(int planMaxArea) {
		this.planMaxArea = planMaxArea;
	}
	public String getPlanPicPath() {
		return planPicPath;
	}
	public void setPlanPicPath(String planPicPath) {
		this.planPicPath = planPicPath;
	}
	public int getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(int planStatus) {
		this.planStatus = planStatus;
	}
	@Override
	public String toString() {
		return "Plan [planId=" + planId + ",planName=" + planName + ", planFloor=" + planFloor + ", planMinArea=" + planMinArea + ", planMaxArea="
				+ planMaxArea + ", planPicPath=" + planPicPath + ", planStatus=" + planStatus + "]";
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	
}
