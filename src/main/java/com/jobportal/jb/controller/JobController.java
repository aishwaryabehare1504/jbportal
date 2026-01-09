package com.jobportal.jb.controller;

import com.jobportal.jb.model.Job;
import com.jobportal.jb.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobs")
public class JobController {

    @Autowired
    private JobService jobService;

    // POST (already working)
    @PostMapping
    public Job createJob(@RequestBody Job job) {
        return jobService.saveJob(job);
    }

    // 🔹 GET all jobs
    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }
    // 🔹 PUT → update job
    @PutMapping("/{id}")
    public Job updateJob(@PathVariable Integer id, @RequestBody Job job) {
        return jobService.updateJob(id, job);
    }
    @DeleteMapping("/{id}")
    public String deleteJob(@PathVariable Integer id) {
        jobService.deleteJob(id);
        return "Job deleted successfully";
    }


}


