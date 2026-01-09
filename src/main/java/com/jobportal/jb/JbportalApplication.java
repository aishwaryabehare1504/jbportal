package com.jobportal.jb;

import com.jobportal.jb.model.Job;
import com.jobportal.jb.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class JbportalApplication implements CommandLineRunner {

	@Autowired
	private JobService jobService;

	public static void main(String[] args) {
		SpringApplication.run(JbportalApplication.class, args);
	}

	@Override
	public void run(String... args) {

		Job job = new Job(
				"Java Developer",
				"Spring Boot Backend Role",
				"Bangalore",
				new BigDecimal("60000")
		);

//		jobService.saveJob(job);
		System.out.println("Spring Boot is running on port 8083...");
		System.out.println("Job saved successfully!");
	}
}


