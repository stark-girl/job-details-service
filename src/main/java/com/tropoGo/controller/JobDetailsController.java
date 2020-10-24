package com.tropoGo.controller;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tropoGo.entity.Job;
import com.tropoGo.service.JobService;
import com.tropoGo.service.UserService;

@RestController
public class JobDetailsController {

	@Autowired
	JobService jobService;
	
	@Autowired
	UserService userService;

	@GetMapping("/*")
	public String healthCheck() {
		return "health Ok";
	}

	@GetMapping("/jobs")
	private List<Job> getJob() {
		return jobService.getAllJob();
	}

	@PostMapping("/job")
	private ResponseEntity<String> saveJob(@Validated @RequestBody Job job) {
		jobService.saveOrUpdate(job);
		return new ResponseEntity<>(String.valueOf(job.getId()), HttpStatus.CREATED);
	}
;
	
}
