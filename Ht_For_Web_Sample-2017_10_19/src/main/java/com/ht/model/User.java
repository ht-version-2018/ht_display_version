package com.ht.model;

public class User {
	private Integer userId;
	private Integer userRole;
	private String userAccout;
	private String userPwd;
	private String userEmail;
	private Integer userAge;
	private String userTitle;
	private Integer userSex;
	private String userUnit;
	private String userPhone;
	private String userIdCard;
	private String userPic;
	private Integer userStatus;
	private String userInfo;
	
	/*
	 * 无参数构造函数
	 */
	
	public User(){}
	/*
	 * 有参数构造函数
	 */
	public User(Integer userId,Integer userRole,String userAccout,String userPwd,
			String userEmail,Integer userAge,String userTitle,Integer userSex,String userUnit,
			String userPhone,String userIdCard,String userPic,Integer userStatus,String userInfo){
		super();
		this.userId=userId;
		this.userRole=userRole;
		this.userAccout=userAccout;
		this.userPwd=userPwd;
		this.userEmail=userEmail;
		this.userAge=userAge;
		this.userTitle=userTitle;
		this.userSex=userSex;
		this.userUnit=userUnit;
		this.userPhone=userPhone;
		this.userIdCard=userIdCard;
		this.userPic=userPic;
		this.userStatus=userStatus;
		this.userInfo=userInfo;
	}
	
	/*
	 * get和set方法
	 */
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getUserRole() {
		return userRole;
	}
	public void setUserRole(Integer userRole) {
		this.userRole = userRole;
	}
	public String getUserAccout() {
		return userAccout;
	}
	public void setUserAccout(String userAccout) {
		this.userAccout = userAccout;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public String getUserTitle() {
		return userTitle;
	}
	public void setUserTitle(String userTitle) {
		this.userTitle = userTitle;
	}
	public Integer getUserSex() {
		return userSex;
	}
	public void setUserSex(Integer userSex) {
		this.userSex = userSex;
	}
	public String getUserUnit() {
		return userUnit;
	}
	public void setUserUnit(String userUnit) {
		this.userUnit = userUnit;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserIdCard() {
		return userIdCard;
	}
	public void setUserIdCard(String userIdCard) {
		this.userIdCard = userIdCard;
	}
	public String getUserPic() {
		return userPic;
	}
	public void setUserPic(String userPic) {
		this.userPic = userPic;
	}
	public Integer getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(Integer userStatus) {
		this.userStatus = userStatus;
	}
	public String getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(String userInfo) {
		this.userInfo = userInfo;
	}
	
	@Override
	public String toString(){
		return "User[userId="+ userId +",userRole="+ userRole +",userAccout="+ userAccout +",userPwd="
				+ userPwd +",userEmail="+ userEmail +",userAge="+ userAge +",userTitle="+ userTitle +",userSex="
				+ userSex +",userUnit="+ userUnit +",userPhone="+ userPhone +",userIdCard="
				+ userIdCard +",userPic="+ userPic +",userStatus="+ userStatus +",userInfo="+ userInfo +"]";
	}

}
