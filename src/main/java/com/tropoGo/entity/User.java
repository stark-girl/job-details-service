package com.tropoGo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
	
	@Id  
	@GeneratedValue( strategy= GenerationType.AUTO )
	@Column
	private int id;
	
	@Column
	private String userId;
	
	@Column
	private String username;

	public User() {
		super();
	}

	public User(int id, String userId, String username) {
		super();
		this.id = id;
		this.userId = userId;
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", username=" + username + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
