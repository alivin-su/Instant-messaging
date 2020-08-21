package com.a.custservice.enty;

import java.io.Serializable;

/**
 *  用户
 * @author Asion
 *
 */
public class User {

	private String userId; 
	private String userName; 
	private String pwd;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	} 
	
}
