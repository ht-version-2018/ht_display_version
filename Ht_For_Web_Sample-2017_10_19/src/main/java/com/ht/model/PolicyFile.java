package com.ht.model;

public class PolicyFile {
	private Integer fileId;
	private String fileTitle;
	private String createTime;
	private Integer downloadNumber;
	private String filePath;
	private Integer fileStatus;
	
	/*
	 * 无参数构造方法
	 */
	public PolicyFile(){}
	
	/*
	 * 有参数构造方法
	 */
	public PolicyFile(Integer fileId,String fileTitle,String createTime,
			Integer downloadNumber,String filePath,Integer fileStatus){
		super();
		this.fileId=fileId;
		this.fileTitle=fileTitle;
		this.createTime=createTime;
		this.downloadNumber=downloadNumber;
		this.filePath=filePath;
		this.fileStatus=fileStatus;
	}
	
	/*
	 * get和set方法
	 */
	public Integer getFileId() {
		return fileId;
	}
	public void setFileId(Integer fileId) {
		this.fileId = fileId;
	}
	public String getFileTitle() {
		return fileTitle;
	}
	public void setFileTitle(String fileTitle) {
		this.fileTitle = fileTitle;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public Integer getDownloadNumber() {
		return downloadNumber;
	}
	public void setDownloadNumber(Integer downloadNumber) {
		this.downloadNumber = downloadNumber;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public Integer getFileStatus() {
		return fileStatus;
	}
	public void setFileStatus(Integer fileStatus) {
		this.fileStatus = fileStatus;
	}
	
	@Override
	public String toString(){
		return "PolicyFile[fileId="+ fileId +",fileTitle="+ fileTitle +",createTime="+ createTime +",downloadNumber="
				+ downloadNumber +",filePath="+ filePath +",fileStatus="+ fileStatus +"]";
		
	}
}
