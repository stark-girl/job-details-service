package com.tropoGo.controller;

import java.util.List;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tropoGo.entity.Job;
import com.tropoGo.service.JobService;

@RestController

public class JobDetailsController {

	@Autowired
	JobService jobService;

	@GetMapping("/*")
	public String healthCheck() {
		return "health Ok";
	}

	@GetMapping("/jobs")
	private List<Job> getJob() {
		return jobService.getAllJob();
	}

	@PostMapping("/job")
	private int saveStudent(@RequestBody Job job) {
		System.out.println(job.toString());
		jobService.saveOrUpdate(job);
		//return ResponseEntity.ok("User is valid");
		return job.getId();
	}
}
