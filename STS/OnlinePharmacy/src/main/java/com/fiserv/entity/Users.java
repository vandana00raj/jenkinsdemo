package com.fiserv.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_TABLE")
public class Users implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="USERNAME")
	private String username;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="SECURITY_QUESTION")
	private String securityQuestion;
	
	@Column(name="SECURITY_ANSWER")
	private String securityAnswer;
		
	@Column(name="MOBILE_NUMBER")
	private long Phonenumber;
	
	@Column(name="EMAIL_ID")
	private String emailid;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAnswer() {
		return securityAnswer;
	}

	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}

	public long getPhonenumber() {
		return Phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		Phonenumber = phonenumber;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
