package com.jobportal.jb.repository;

import com.jobportal.jb.model.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Integer> {
}

