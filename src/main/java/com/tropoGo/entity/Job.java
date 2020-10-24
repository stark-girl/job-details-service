package com.tropoGo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

@Entity
@Table
public class Job {
	
	@Id  
	@GeneratedValue( strategy= GenerationType.AUTO )
	@Column
	private int id;
	
	@NotNull
    @Size(max = 250, min =1)
	@Column
	private String jobName;
	
	@NotNull
    @Size(max = 250, min =1)
	@Column  
	private String jobDescription; 
	
	@NotNull
    @Size(max = 250, min =1)
	@Column  
	private String userId;
	
	public Job() {
		
	}
	
	public Job(int id, String jobName, String jobDescription, String userId) {
		super();
		this.id = id;
		this.jobName = jobName;
		this.jobDescription = jobDescription;
		this.userId = userId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Job [id=" + id + ", jobName=" + jobName + ", jobDescription=" + jobDescription + ", userId=" + userId
				+ "]";
	}
	
}
