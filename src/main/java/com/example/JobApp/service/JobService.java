package com.example.JobApp.service;

import com.example.JobApp.model.JobPost;
import com.example.JobApp.repo.JobRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class JobService {

    @Autowired
    private JobRep repo;

    public void addJob(JobPost jobPost) {
        repo.save(jobPost);

    }

    public List<JobPost> getAllJob() {
        return repo.findAll();

    }


}

