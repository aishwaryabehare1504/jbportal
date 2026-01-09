package com.jobportal.jb.service;

import com.jobportal.jb.model.Job;
import com.jobportal.jb.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public Job saveJob(Job job) {
        return jobRepository.save(job);
    }

    // 🔹 GET all jobs
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }
    // 🔹 Update job by ID
    public Job updateJob(Integer id, Job updatedJob) {
        return jobRepository.findById(id).map(job -> {
            job.setTitle(updatedJob.getTitle());
            job.setDescription(updatedJob.getDescription());
            job.setLocation(updatedJob.getLocation());
            job.setSalary(updatedJob.getSalary());
            return jobRepository.save(job);
        }).orElseThrow(() -> new RuntimeException("Job not found with id " + id));
    }
    public void deleteJob(Integer id) {
        jobRepository.deleteById(id);
    }


}


