package com.ht.model;

public class Floor {

	private int floorId;
	private int planId;
	private int floorTag;
	private int bedroom;
	private int kitchen;
	private int bathroom;
	private int livingroom;
	private int floorStatus;
	private int canting;
	public int getFloorId() {
		return floorId;
	}
	public void setFloorId(int floorId) {
		this.floorId = floorId;
	}
	public int getPlanId() {
		return planId;
	}
	public void setPlanId(int planId) {
		this.planId = planId;
	}
	public int getFloorTag() {
		return floorTag;
	}
	public void setFloorTag(int floorTag) {
		this.floorTag = floorTag;
	}
	public int getBedroom() {
		return bedroom;
	}
	public void setBedroom(int bedroom) {
		this.bedroom = bedroom;
	}
	public int getKitchen() {
		return kitchen;
	}
	public void setKitchen(int kitchen) {
		this.kitchen = kitchen;
	}
	public int getBathroom() {
		return bathroom;
	}
	public void setBathroom(int bathroom) {
		this.bathroom = bathroom;
	}
	public int getLivingroom() {
		return livingroom;
	}
	public void setLivingroom(int livingroom) {
		this.livingroom = livingroom;
	}
	public int getFloorStatus() {
		return floorStatus;
	}
	public void setFloorStatus(int floorStatus) {
		this.floorStatus = floorStatus;
	}
	public int getCanting() {
		return canting;
	}
	public void setCanting(int cantingl) {
		this.canting = cantingl;
	}
	@Override
	public String toString() {
		return "Floor [floorId=" + floorId + ", planId=" + planId + ", floorTag=" + floorTag + ", bedroom=" + bedroom
				+ ", kitchen=" + kitchen + ", bathroom=" + bathroom + ", livingroom=" + livingroom + ", floorStatus="
				+ floorStatus + ", canting=" + canting + "]";
	}
	
}
