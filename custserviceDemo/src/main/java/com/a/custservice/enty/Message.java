package com.a.custservice.enty;

import java.io.Serializable;

/**
 * 消息
 * @author Asion
 *
 */
public class Message implements Serializable{
	private static final long serialVersionUID = -6451812593150428369L;
	
	private String msgId;
	private String sendId;
	private String receiveId;
	private String content;
	private String time;
	private String type; // 1，用户发送的，2，用户接收的
	private String satus;//状态 0 未读，1已读
	public String getMsgId() {
		return msgId;
	}
	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}
	public String getSendId() {
		return sendId;
	}
	public void setSendId(String sendId) {
		this.sendId = sendId;
	}
	public String getReceiveId() {
		return receiveId;
	}
	public void setReceiveId(String receiveId) {
		this.receiveId = receiveId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSatus() {
		return satus;
	}
	public void setSatus(String satus) {
		this.satus = satus;
	}
	
}
