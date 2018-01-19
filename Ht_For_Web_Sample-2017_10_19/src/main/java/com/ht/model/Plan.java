package com.ht.model;

public class Plan {
	private Integer planId;
	private String author;
	private Double area;
	private Double areaLength;
	private Double areaWidth;
	private Integer floor;
	private Integer roofStyle;
	private Integer planStyle;
	private Integer elevaStyle;
	private String planPic;
	private Integer planState;
	private String planName;
	private Integer download;
	private String planPath;
	private Integer auditState;
	private String createTime;
	/*
	 * �޲������캯��
	 * 
	 */
	public Plan(){}
	
	/*
	 * �в������캯��
	 */
	
	public Plan(String author,Double area, Double areaLength, Double areaWidth,Integer floor, Integer roofStyle,
			Integer planStyle,Integer elevaStyle,String planPic,
			Integer planState,String planName,Integer download, Integer auditState,String createTime){
		super();
		this.author=author;
		this.area=area;
		this.areaLength = areaLength;
		this.areaWidth = areaWidth;
		this.floor=floor;
		this.roofStyle=roofStyle;
		this.planStyle=planStyle;
		this.elevaStyle=elevaStyle;
		this.planPic=planPic;
		this.planState=planState;
		this.planName=planName;
		this.download=download;
		this.auditState = auditState;
		this.createTime = createTime;
	}

	
	/*
	 * get��set����
	 */
	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}

	public Double getAreaLength() {
		return areaLength;
	}

	public void setAreaLength(Double areaLength) {
		this.areaLength = areaLength;
	}

	public Double getAreaWidth() {
		return areaWidth;
	}

	public void setAreaWidth(Double areaWidth) {
		this.areaWidth = areaWidth;
	}

	public Integer getFloor() {
		return floor;
	}

	public void setFloor(Integer floor) {
		this.floor = floor;
	}

	public Integer getRoofStyle() {
		return roofStyle;
	}

	public void setRoofStyle(Integer roofStyle) {
		this.roofStyle = roofStyle;
	}

	public Integer getPlanStyle() {
		return planStyle;
	}

	public void setPlanStyle(Integer planStyle) {
		this.planStyle = planStyle;
	}

	public Integer getElevaStyle() {
		return elevaStyle;
	}

	public void setElevaStyle(Integer elevaStyle) {
		this.elevaStyle = elevaStyle;
	}

	public String getPlanPic() {
		return planPic;
	}

	public void setPlanPic(String planPic) {
		this.planPic = planPic;
	}

	public Integer getPlanState() {
		return planState;
	}

	public void setPlanState(Integer planState) {
		this.planState = planState;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public Integer getDownload() {
		return download;
	}

	public void setDownload(Integer download) {
		this.download = download;
	}

	public String getPlanPath() {
		return planPath;
	}

	public void setPlanPath(String planPath) {
		this.planPath = planPath;
	}

	public Integer getAuditState() {
		return auditState;
	}

	public void setAuditState(Integer auditState) {
		this.auditState = auditState;
	}

	
	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Plan [planId=" + planId + ", author=" + author + ", area=" + area + ", areaLength=" + areaLength
				+ ", areaWidth=" + areaWidth + ", floor=" + floor + ", roofStyle=" + roofStyle + ", planStyle="
				+ planStyle + ", elevaStyle=" + elevaStyle + ", planPic=" + planPic + ", planState=" + planState
				+ ", planName=" + planName + ", download=" + download + ", planPath=" + planPath + ", auditState="
				+ auditState + ", createTime=" + createTime + "]";
	}

}
