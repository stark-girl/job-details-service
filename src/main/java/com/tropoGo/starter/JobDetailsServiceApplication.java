package com.tropoGo.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(scanBasePackages = { "com.tropoGo.controller", "com.tropoGo.service","com.tropoGo.exception" })
@EntityScan(basePackages = { "com.tropoGo.entity" })
@EnableJpaRepositories(basePackages = "com.tropoGo.repository")
@EnableAutoConfiguration
public class JobDetailsServiceApplication {

	public static void main(String[] args) {
		 	SpringApplication.run(JobDetailsServiceApplication.class, args);
	}
}
