package com.dillimate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "message")
public class Message {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "msg_id")
	private Long msgId;
	
	@Column(name = "name")
	@NotBlank(message = "Name should not be blank")
	private String name;
	
	@Column(name = "email")
	@NotBlank(message = "Email should not be blank")
	private String email;
	
	@Column(name = "phone_no")
	@NotBlank(message = "Phone number should not be blank")
	private String phoneNo;
	
	@Column(name = "msg")
	@NotBlank(message = "Message should not be blank")
	private String msg;
	
	public Message() {
		
	}
	
	public Long getMsgId() {
		return msgId;
	}
	public void setMsgId(Long msgId) {
		this.msgId = msgId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

}
