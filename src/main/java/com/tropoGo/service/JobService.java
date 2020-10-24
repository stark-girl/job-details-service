package com.tropoGo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tropoGo.entity.Job;
import com.tropoGo.repository.JobRepository;

@Service
public class JobService {

	@Autowired
	JobRepository jobRepository;

	public List<Job> getAllJob() {
		List<Job> jobs = new ArrayList<Job>();
		jobRepository.findAll().forEach(job -> jobs.add(job));
		return jobs;
	}

	public void saveOrUpdate(Job job) {
		System.out.println("MOB"+job.toString());
		jobRepository.save(job);
	}

}
