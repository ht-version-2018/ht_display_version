package com.ht.model;

public class File {

	private int fileId;
	private String fileName;
	private String fileUploadTime;
	private int downloadNumber;
	private int fileTag;
	private String filePath;
	private int fileStatus;
	public int getFileId() {
		return fileId;
	}
	public void setFileId(int fileId) {
		this.fileId = fileId;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileUploadTime() {
		return fileUploadTime;
	}
	public void setFileUploadTime(String fileUploadTime) {
		this.fileUploadTime = fileUploadTime;
	}
	public int getDownloadNumber() {
		return downloadNumber;
	}
	public void setDownloadNumber(int downloadNumber) {
		this.downloadNumber = downloadNumber;
	}
	public int getFileTag() {
		return fileTag;
	}
	public void setFileTag(int fileTag) {
		this.fileTag = fileTag;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public int getFileStatus() {
		return fileStatus;
	}
	public void setFileStatus(int fileStatus) {
		this.fileStatus = fileStatus;
	}
	@Override
	public String toString() {
		return "File [fileId=" + fileId + ", fileName=" + fileName + ", fileUploadTime=" + fileUploadTime
				+ ", downloadNumber=" + downloadNumber + ", fileTag=" + fileTag + ", filePath=" + filePath
				+ ", fileStatus=" + fileStatus + "]";
	}
	
}
