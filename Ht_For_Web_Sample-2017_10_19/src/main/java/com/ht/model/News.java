package com.ht.model;

public class News {
	private Integer newId;
	private String newTitle;
	private String createTime;
	private String author;
	private String newContent;
	private Integer newStatus;
	
	/*
	 * 无参数构造方法
	 */
	public News(){}
	
	/*
	 * 有参数构造方法
	 */
	public News(Integer newId,String newTitle,String createTime,
			String author,String newContent,Integer newStatus){
		super();
		this.newId=newId;
		this.newTitle=newTitle;
		this.createTime=createTime;
		this.author=author;
		this.newContent=newContent;
		this.newStatus=newStatus;
	}
	
	/*
	 * get和set方法
	 */
	public Integer getNewId() {
		return newId;
	}
	public void setNewId(Integer newId) {
		this.newId = newId;
	}
	public String getNewTitle() {
		return newTitle;
	}
	public void setNewTitle(String newTitle) {
		this.newTitle = newTitle;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getNewContent() {
		return newContent;
	}
	public void setNewContent(String newContent) {
		this.newContent = newContent;
	}
	public Integer getNewStatus() {
		return newStatus;
	}
	public void setNewStatus(Integer newStatus) {
		this.newStatus = newStatus;
	}
	
	@Override
	public String toString(){
		return "News[newId="+ newId +",newTitle="+ newTitle +",createTime="+ createTime +",author="
				+ author +",newContent="+ newContent +",newStatus="+ newStatus +"]";
	}
}
